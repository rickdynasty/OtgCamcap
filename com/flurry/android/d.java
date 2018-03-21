package com.flurry.android;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;

final class d {
    private String a;
    private Map b;
    private long c;
    private long d;

    public final byte[] a() {
        byte[] toByteArray;
        Closeable closeable;
        Throwable th;
        Closeable dataOutputStream;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeUTF(this.a);
                if (this.b == null) {
                    dataOutputStream.writeShort(0);
                } else {
                    dataOutputStream.writeShort(this.b.size());
                    for (Entry entry : this.b.entrySet()) {
                        dataOutputStream.writeUTF(m.a((String) entry.getKey(), 255));
                        dataOutputStream.writeUTF(m.a((String) entry.getValue(), 255));
                    }
                }
                dataOutputStream.writeLong(this.c);
                dataOutputStream.writeLong(this.d);
                dataOutputStream.flush();
                toByteArray = byteArrayOutputStream.toByteArray();
                m.a(dataOutputStream);
            } catch (IOException e) {
                closeable = dataOutputStream;
                try {
                    toByteArray = new byte[0];
                    m.a(closeable);
                    return toByteArray;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = closeable;
                    m.a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                m.a(dataOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            closeable = null;
            toByteArray = new byte[0];
            m.a(closeable);
            return toByteArray;
        } catch (Throwable th4) {
            dataOutputStream = null;
            th = th4;
            m.a(dataOutputStream);
            throw th;
        }
        return toByteArray;
    }
}
