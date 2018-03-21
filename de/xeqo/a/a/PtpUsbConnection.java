package de.xeqo.a.a;

import android.hardware.usb.UsbRequest;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import de.xeqo.util.BufferToStringUtils;

final class PtpUsbConnection implements Runnable {
    private /* synthetic */ PtpUsbService a;

    PtpUsbConnection(PtpUsbService adVar) {
        this.a = adVar;
    }

    public final void run() {
        ByteBuffer allocate = ByteBuffer.allocate(4096);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        UsbRequest usbRequest = new UsbRequest();
        usbRequest.initialize(this.a.g, this.a.d);
        Log.d("CamCap_Lib", "intit connect thread");
        ByteBuffer byteBuffer = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            usbRequest.queue(allocate, 4096);
            if (this.a.g.requestWait() != usbRequest) {
                Log.e("CamCap_Lib", "requestWait failed, exiting");
                return;
            } else if (this.a.g != null) {
                Log.d("CamCap_Lib", "got data " + BufferToStringUtils.a(allocate.array()));
                if (i3 == 0) {
                    i = allocate.getInt();
                    Log.d("CamCap_Lib", "size " + i);
                    byteBuffer = ByteBuffer.allocate(i);
                    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    allocate.rewind();
                    i3 = 1;
                }
                int i4 = i - i2;
                if (i4 > 4096) {
                    byteBuffer.put(allocate);
                    i2 += 4096;
                } else {
                    byteBuffer.put(ByteBuffer.wrap(allocate.array(), 0, i4));
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                }
                if (i3 == 0) {
                    this.a.a(byteBuffer);
                }
                allocate.rewind();
            } else {
                return;
            }
        }
    }
}
