package de.xeqo.a.a;

import android.hardware.usb.UsbConstants;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.util.Log;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Vector;

import de.xeqo.a.a.c.o;

public class UsbService {
    private static /* synthetic */ boolean i = (!UsbService.class.desiredAssertionStatus());
    private final Object a = new Object();
    private int b = 1;
    private UsbDevice mUsbDevice;
    private UsbInterface intf;
    private UsbEndpoint bulkIn;
    private UsbEndpoint bulkOut;
    private UsbDeviceConnection connection;
    private final Vector h = new Vector();

    public static UsbService getUsbServiceInstance(UsbDevice usbDevice) {
        if (usbDevice != null) {
            return new UsbService(usbDevice);
        }
        return null;
    }

    private UsbService(UsbDevice usbDevice) {
        if (i || usbDevice != null) {
            mUsbDevice = usbDevice;
            return;
        }
        throw new AssertionError();
    }

    public final CameraIdStruc a() {
        return new CameraIdStruc(mUsbDevice.getVendorId(), mUsbDevice.getProductId());
    }

    public final UsbDevice b() {
        return mUsbDevice;
    }

    public final boolean initCommunication() {
        UsbManager b = q.b();
        if (i || b != null) {
            Log.d("CamCap_Lib", "connect: " + mUsbDevice);
            if (mUsbDevice.getInterfaceCount() != 1) {
                Log.e("CamCap_Lib", "could not find interface");
                return false;
            }
            intf = mUsbDevice.getInterface(0);
            if (intf.getEndpointCount() < 2) {
                Log.e("CamCap_Lib", "could not find endpoint");
                return false;
            }
            for (int i = 0; i < intf.getEndpointCount(); i++) {
                UsbEndpoint endpoint = intf.getEndpoint(i);
                if (endpoint.getType() == 2) {
                    if (endpoint.getDirection() == UsbConstants.USB_DIR_IN) {
                        bulkIn = endpoint;
                    } else if (endpoint.getDirection() == UsbConstants.USB_DIR_OUT) {
                        bulkOut = endpoint;
                    }
                }
            }
            if (bulkIn == null) {
                Log.e("CamCap_Lib", "No Input point");
                return false;
            } else if (bulkOut == null) {
                Log.e("CamCap_Lib", "No Iutput point");
                return false;
            } else {
                Log.d("CamCap_Lib", "IN Port: " + bulkIn);
                Log.d("CamCap_Lib", "OUT Port: " + bulkOut);
                connection = b.openDevice(mUsbDevice);
                if (connection == null || !connection.claimInterface(intf, true)) {
                    Log.d("CamCap_Lib", "NOT Connected");
                    return false;
                }
                Log.d("CamCap_Lib", "Connected");
                do {
                } while (connection.bulkTransfer(bulkIn, new byte[1024], 1024, 100) > 0);
                return true;
            }
        }

        throw new AssertionError();
    }

    public final boolean d() {
        return (connection == null || bulkIn == null || bulkOut == null) ? false : true;
    }

    public final boolean a(u uVar, Iterable iterable, o oVar, int i) {
        if (!i && uVar == null) {
            throw new AssertionError();
        } else if (i || oVar != null) {
            if (!(uVar == null || oVar == null)) {
                synchronized (this.a) {
                    if (i || uVar.a() == '\u0001') {
                        boolean z = uVar.a() == '\u0001';
                        if (z) {
                            z = a(uVar);
                        }
                        if (iterable != null) {
                            u uVar2;
                            Iterator it = iterable.iterator();
                            boolean z2 = z;
                            while (z2 && it.hasNext()) {
                                uVar2 = (u) it.next();
                                if (i || (uVar2 != null && uVar2.a() == '\u0002')) {
                                    int i2 = (uVar2 == null || uVar2.a() != '\u0002') ? 0 : 1;
                                    z2 &= i2;
                                } else {
                                    throw new AssertionError();
                                }
                            }
                            if (z2) {
                                it = iterable.iterator();
                                int a;
                                while (a != 0 && it.hasNext()) {
                                    uVar2 = (u) it.next();
                                    if (a == true) {
                                        a = a(uVar2);
                                    }
                                }
                            }
                            z = z2;
                        }
                        if (z && a(oVar, i)) {
                            a(oVar, i);
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            }
            if (oVar == null || !oVar.f()) {
                return false;
            }
            return true;
        } else {
            throw new AssertionError();
        }
    }

    private boolean a(u uVar) {
        if (connection == null || bulkOut == null || uVar == null) {
            return false;
        }
        boolean z;
        byte[] array = uVar.c().array();
        int bulkTransfer = connection.bulkTransfer(bulkOut, array, array.length, 0);
        if (bulkTransfer > 0) {
            z = true;
        } else {
            z = false;
        }
        t.a(z, "mUsbConnection.bulkTransfer(Out) failed!");
        if (bulkTransfer > 0) {
            return true;
        }
        return false;
    }

    private boolean a(o oVar, int i) {
        boolean z = false;
        try {
            bulkIn.getMaxPacketSize();
            byte[] bArr = new byte[8192];
            int bulkTransfer = connection.bulkTransfer(bulkIn, bArr, 8192, i);
            t.a(bulkTransfer >= 12, "mUsbConnection.bulkTransfer(In) failed!");
            if (bulkTransfer >= 12) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, bulkTransfer);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = wrap.getInt();
                char c = wrap.getChar();
                char c2 = wrap.getChar();
                wrap.getInt();
                z = oVar.a(i2, c, c2);
                if (wrap.remaining() > 0) {
                    oVar.b(bArr, 12, wrap.remaining());
                }
                while (bulkTransfer < i2) {
                    int bulkTransfer2 = connection.bulkTransfer(bulkIn, bArr, 8192, i);
                    if (bulkTransfer2 > 0) {
                        bulkTransfer += bulkTransfer2;
                        oVar.b(bArr, 0, bulkTransfer2);
                    }
                }
            }
            if (z) {
                oVar.e();
            }
            return z;
        } catch (Throwable th) {
            if (z) {
                oVar.e();
            }
        }

        return z;
    }

    public final int e() {
        if (this.b == -2) {
            this.b = 1;
            return this.b;
        }
        int i = this.b;
        this.b = i + 1;
        return i;
    }

    public final boolean a(p pVar) {
        if (pVar == null || this.h.contains(pVar)) {
            return false;
        }
        this.h.add(pVar);
        return true;
    }
}
