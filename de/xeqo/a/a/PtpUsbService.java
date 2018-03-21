package de.xeqo.a.a;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.util.Log;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import de.xeqo.ptp.PtpConstants;
import de.xeqo.util.BufferToStringUtils;
import de.xeqo.util.ByteUtils;

/**
 * Created by Administrator on 2018/3/21.
 */

public class PtpUsbService {
    private UsbManager mUsbManager;
    private UsbDevice mUsbDevice;
    private UsbInterface intf;
    private UsbEndpoint bulkIn;
    private UsbEndpoint bulkOut;
    private UsbEndpoint f;
    private UsbDeviceConnection connection;
    private int h = 0;
    private int i = -1;
    private ByteBuffer mByteBuffer;
    private int mBufferLen = 0;

    //当一个线程进入wait之后，就必须等其他线程notify/notifyall,使用notifyall,可以唤醒
    //所有处于wait状态的线程，使其重新进入锁的争夺队列中，而notify只能唤醒一个
    private Object co = new Object();

    public PtpUsbService(UsbManager usbManager) {
        mUsbManager = usbManager;
    }

    public final boolean connect(UsbDevice usbDevice) {
        if (mUsbManager == null || usbDevice == null) {
            return false;
        }

        if (null != usbDevice) {
            mUsbDevice = usbDevice;
        }

        //获取设备的vendorId productId
        int vendorId = mUsbDevice.getVendorId();
        int productId = mUsbDevice.getProductId();
        if (vendorId != PtpConstants.NikonVendorId && productId == 1064) {
            return false;
        }

        intf = mUsbDevice.getInterface(0);
        if (intf == null) {
            return false;
        }
        bulkIn = intf.getEndpoint(0);
        bulkOut = intf.getEndpoint(1);
        this.f = intf.getEndpoint(2);
        if (bulkIn == null || bulkOut == null || this.f == null) {
            return false;
        }
        Log.d("CamCap_Lib", "IN POrt: " + bulkIn);
        connection = mUsbManager.openDevice(mUsbDevice);
        //claimInterface func is:the interface to claim
        if (connection == null || !connection.claimInterface(intf, true)) {
            Log.d("CamCap_Lib", "NOT Connected");
            return false;
        }
        Log.d("CamCap_Lib", "Connected");
        new Thread(new PtpUsbConnection(this)).start();
        return true;
    }

    public final int a() {
        synchronized (co) {
            byte[] a = ByteUtils.createByteArray('ဂ', 0, 1);
            this.h = 1;
            getContent(a);
            try {
                co.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return mBufferLen;
    }

    public final CameraPhotoBuffer a(char c, byte[] bArr, int... iArr) {
        synchronized (this) {
            mBufferLen = -1;
            mByteBuffer = null;
            this.i = -1;
        }

        synchronized (co) {
            int i;
            if (this.h == -2) {
                i = 1;
            } else {
                i = this.h;
                this.h = i + 1;
            }
            getContent(ByteUtils.createByteArray(c, i, iArr));
            if (bArr != null) {
                int length = bArr.length + 12;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putInt(length);
                allocate.putShort((short) 2);
                allocate.putChar(c);
                allocate.putInt(i);
                allocate.put(bArr);
                getContent(allocate.array());
            }

            try {
                co.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        CameraPhotoBuffer abVar = new CameraPhotoBuffer();
        abVar.setBufferLen(mBufferLen);
        abVar.setByteBuffer(mByteBuffer);
        return abVar;
    }

    private void getContent(byte[] bArr) {
        if (connection != null && bulkOut != null && bulkIn != null) {
            String str = "CamCap_Lib";
            final int count = connection.bulkTransfer(bulkOut, bArr, bArr.length, 0);
            Log.d(str, "Send count: " + count);
            Log.d("CamCap_Lib", BufferToStringUtils.a(bArr));
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        int i = byteBuffer.getInt();
        char c = byteBuffer.getChar();
        char c2 = byteBuffer.getChar();
        byteBuffer.getInt();
        i -= 12;
        if (c == '\u0003') {    //十六进制 003
            mBufferLen = c2;
            synchronized (co) {
                co.notifyAll();
            }
        } else if (c == '\u0002' && i > 0) {
            ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
            ByteBuffer wrap = ByteBuffer.wrap(byteBuffer.array(), 12, i);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            mByteBuffer = wrap;
        }
    }

    public final UsbDevice b() {
        return mUsbDevice;
    }

    public final void c() {
        Log.d("CamCap_Lib", "Close device");
        if (!(intf == null || connection == null)) {
            boolean releaseInterface = connection.releaseInterface(intf);
            connection.close();
            Log.d("CamCap_Lib", "release interface: " + releaseInterface);
        }
        intf = null;
        connection = null;
        bulkIn = null;
        bulkOut = null;
        this.f = null;
    }
}
