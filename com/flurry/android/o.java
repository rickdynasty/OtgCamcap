package com.flurry.android;

import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Map.Entry;

final class o implements Runnable {
    private /* synthetic */ Map a;
    private /* synthetic */ InstallReceiver b;

    o(InstallReceiver installReceiver, Map map) {
        this.b = installReceiver;
        this.a = map;
    }

    public final void run() {
        Throwable th;
        Closeable closeable = null;
        try {
            File parentFile = this.b.b.getParentFile();
            if (parentFile.mkdirs() || parentFile.exists()) {
                Closeable dataOutputStream = new DataOutputStream(new FileOutputStream(this.b.b));
                try {
                    Object obj = 1;
                    for (Entry entry : this.a.entrySet()) {
                        Object obj2;
                        if (obj == 1) {
                            obj2 = null;
                        } else {
                            dataOutputStream.writeUTF("&");
                            obj2 = obj;
                        }
                        dataOutputStream.writeUTF((String) entry.getKey());
                        dataOutputStream.writeUTF("=");
                        dataOutputStream.writeUTF((String) entry.getValue());
                        obj = obj2;
                    }
                    dataOutputStream.writeShort(0);
                    m.a(dataOutputStream);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = dataOutputStream;
                    m.a(closeable);
                    throw th;
                }
            }
            am.b("InstallReceiver", "Unable to create persistent dir: " + parentFile);
            m.a(null);
        } catch (Throwable th3) {
            th = th3;
            am.b("InstallReceiver", "", th);
            m.a(closeable);
        }
    }
}
