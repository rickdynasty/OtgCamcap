package com.flurry.android;

import android.content.Context;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class y {
    private Context a;
    private p b;
    private s c;
    private volatile long d;
    private ak e = new ak();
    private ak f = new ak();
    private Map g = new HashMap();
    private Map h = new HashMap();
    private Map i = new HashMap();
    private Map j = new HashMap();
    private volatile boolean k;

    y() {
    }

    final void a(Context context, p pVar, s sVar) {
        this.a = context;
        this.b = pVar;
        this.c = sVar;
    }

    final synchronized q[] a(String str) {
        q[] qVarArr;
        qVarArr = (q[]) this.g.get(str);
        if (qVarArr == null) {
            qVarArr = (q[]) this.g.get("");
        }
        return qVarArr;
    }

    private synchronized ae b(long j) {
        return (ae) this.f.a(Long.valueOf(j));
    }

    final synchronized Set a() {
        return this.e.c();
    }

    final synchronized a a(long j) {
        return (a) this.e.a(Long.valueOf(j));
    }

    final synchronized a b() {
        Long l;
        l = (Long) this.j.get(Short.valueOf((short) 1));
        return l == null ? null : a(l.longValue());
    }

    final synchronized x b(String str) {
        x xVar;
        xVar = (x) this.h.get(str);
        if (xVar == null) {
            xVar = (x) this.h.get("");
        }
        return xVar;
    }

    final boolean c() {
        return this.k;
    }

    private synchronized u a(byte b) {
        return (u) this.i.get(Byte.valueOf(b));
    }

    final synchronized void a(Map map, Map map2, Map map3, Map map4, Map map5, Map map6) {
        this.d = System.currentTimeMillis();
        for (Entry entry : map4.entrySet()) {
            if (entry.getValue() != null) {
                this.e.a(entry.getKey(), entry.getValue());
            }
        }
        for (Entry entry2 : map5.entrySet()) {
            if (entry2.getValue() != null) {
                this.f.a(entry2.getKey(), entry2.getValue());
            }
        }
        if (!(map2 == null || map2.isEmpty())) {
            this.h = map2;
        }
        if (!(map3 == null || map3.isEmpty())) {
            this.i = map3;
        }
        if (!(map6 == null || map6.isEmpty())) {
            this.j = map6;
        }
        this.g = new HashMap();
        for (Entry entry22 : map2.entrySet()) {
            x xVar = (x) entry22.getValue();
            q[] qVarArr = (q[]) map.get(Byte.valueOf(xVar.b));
            if (qVarArr != null) {
                this.g.put(entry22.getKey(), qVarArr);
            }
            u uVar = (u) map3.get(Byte.valueOf(xVar.c));
            if (uVar != null) {
                xVar.d = uVar;
            }
        }
        g();
        a(202);
    }

    final long d() {
        return this.d;
    }

    final synchronized void e() {
        Closeable dataInputStream;
        Throwable th;
        File fileStreamPath = this.a.getFileStreamPath(h());
        if (fileStreamPath.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                try {
                    if (dataInputStream.readUnsignedShort() == 46587) {
                        a((DataInputStream) dataInputStream);
                        a(201);
                    } else {
                        a(fileStreamPath);
                    }
                    m.a(dataInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        am.a("FlurryAgent", "Discarding cache", th);
                        a(fileStreamPath);
                        m.a(dataInputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        m.a(dataInputStream);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                dataInputStream = null;
                m.a(dataInputStream);
                throw th;
            }
        }
        am.c("FlurryAgent", "cache file does not exist, path=" + fileStreamPath.getAbsolutePath());
    }

    private static void a(File file) {
        if (!file.delete()) {
            am.b("FlurryAgent", "Cannot delete cached ads");
        }
    }

    private void g() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
        for (q[] qVarArr : this.g.values()) {
            if (qVarArr != null) {
                for (q qVar : qVarArr) {
                    qVar.h = a(qVar.f.longValue());
                    if (qVar.h == null) {
                        am.b("FlurryAgent", "Ad " + qVar.d + " has no image");
                    }
                    if (b(qVar.a) == null) {
                        am.b("FlurryAgent", "Ad " + qVar.d + " has no pricing");
                    }
                }
            }
        }
        for (x xVar : this.h.values()) {
            xVar.d = a(xVar.c);
            if (xVar.d == null) {
                am.d("FlurryAgent", "No ad theme found for " + xVar.c);
            }
        }
    }

    final synchronized void f() {
        Throwable th;
        Closeable closeable = null;
        synchronized (this) {
            try {
                File fileStreamPath = this.a.getFileStreamPath(h());
                File parentFile = fileStreamPath.getParentFile();
                if (parentFile.mkdirs() || parentFile.exists()) {
                    Closeable dataOutputStream = new DataOutputStream(new FileOutputStream(fileStreamPath));
                    try {
                        dataOutputStream.writeShort(46587);
                        a((DataOutputStream) dataOutputStream);
                        m.a(dataOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = dataOutputStream;
                        m.a(closeable);
                        throw th;
                    }
                } else {
                    am.b("FlurryAgent", "Unable to create persistent dir: " + parentFile);
                    m.a(null);
                }
            } catch (Throwable th3) {
                th = th3;
                am.b("FlurryAgent", "", th);
                m.a(closeable);
            }
        }
    }

    private void a(DataInputStream dataInputStream) {
        int i = 0;
        am.a("FlurryAgent", "Reading cache");
        if (dataInputStream.readUnsignedShort() == 2) {
            int i2;
            long readLong;
            this.d = dataInputStream.readLong();
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            this.e = new ak();
            for (i2 = 0; i2 < readUnsignedShort; i2++) {
                readLong = dataInputStream.readLong();
                a aVar = new a();
                aVar.a(dataInputStream);
                this.e.a(Long.valueOf(readLong), aVar);
            }
            readUnsignedShort = dataInputStream.readUnsignedShort();
            this.f = new ak();
            for (i2 = 0; i2 < readUnsignedShort; i2++) {
                readLong = dataInputStream.readLong();
                ae aeVar = new ae();
                if (dataInputStream.readBoolean()) {
                    aeVar.a = dataInputStream.readUTF();
                }
                if (dataInputStream.readBoolean()) {
                    aeVar.b = dataInputStream.readUTF();
                }
                aeVar.c = dataInputStream.readInt();
                this.f.a(Long.valueOf(readLong), aeVar);
            }
            readUnsignedShort = dataInputStream.readUnsignedShort();
            this.h = new HashMap(readUnsignedShort);
            for (i2 = 0; i2 < readUnsignedShort; i2++) {
                this.h.put(dataInputStream.readUTF(), new x(dataInputStream));
            }
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            this.g = new HashMap(readUnsignedShort2);
            for (readUnsignedShort = 0; readUnsignedShort < readUnsignedShort2; readUnsignedShort++) {
                String readUTF = dataInputStream.readUTF();
                int readUnsignedShort3 = dataInputStream.readUnsignedShort();
                Object obj = new q[readUnsignedShort3];
                for (i2 = 0; i2 < readUnsignedShort3; i2++) {
                    q qVar = new q();
                    qVar.a((DataInput) dataInputStream);
                    obj[i2] = qVar;
                }
                this.g.put(readUTF, obj);
            }
            readUnsignedShort = dataInputStream.readUnsignedShort();
            this.i = new HashMap();
            for (i2 = 0; i2 < readUnsignedShort; i2++) {
                byte readByte = dataInputStream.readByte();
                u uVar = new u();
                uVar.b(dataInputStream);
                this.i.put(Byte.valueOf(readByte), uVar);
            }
            i2 = dataInputStream.readUnsignedShort();
            this.j = new HashMap(i2);
            while (i < i2) {
                this.j.put(Short.valueOf(dataInputStream.readShort()), Long.valueOf(dataInputStream.readLong()));
                i++;
            }
            g();
            am.a("FlurryAgent", "Cache read, num images: " + this.e.a());
        }
    }

    private void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(2);
        dataOutputStream.writeLong(this.d);
        List<Entry> b = this.e.b();
        dataOutputStream.writeShort(b.size());
        for (Entry entry : b) {
            dataOutputStream.writeLong(((Long) entry.getKey()).longValue());
            a aVar = (a) entry.getValue();
            dataOutputStream.writeLong(aVar.a);
            dataOutputStream.writeInt(aVar.b);
            dataOutputStream.writeInt(aVar.c);
            dataOutputStream.writeUTF(aVar.d);
            dataOutputStream.writeInt(aVar.e.length);
            dataOutputStream.write(aVar.e);
        }
        b = this.f.b();
        dataOutputStream.writeShort(b.size());
        for (Entry entry2 : b) {
            dataOutputStream.writeLong(((Long) entry2.getKey()).longValue());
            ae aeVar = (ae) entry2.getValue();
            boolean z = aeVar.a != null;
            dataOutputStream.writeBoolean(z);
            if (z) {
                dataOutputStream.writeUTF(aeVar.a);
            }
            z = aeVar.b != null;
            dataOutputStream.writeBoolean(z);
            if (z) {
                dataOutputStream.writeUTF(aeVar.b);
            }
            dataOutputStream.writeInt(aeVar.c);
        }
        dataOutputStream.writeShort(this.h.size());
        for (Entry entry22 : this.h.entrySet()) {
            dataOutputStream.writeUTF((String) entry22.getKey());
            x xVar = (x) entry22.getValue();
            dataOutputStream.writeUTF(xVar.a);
            dataOutputStream.writeByte(xVar.b);
            dataOutputStream.writeByte(xVar.c);
        }
        dataOutputStream.writeShort(this.g.size());
        for (Entry entry3 : this.g.entrySet()) {
            dataOutputStream.writeUTF((String) entry3.getKey());
            q[] qVarArr = (q[]) entry3.getValue();
            int length = qVarArr == null ? 0 : qVarArr.length;
            dataOutputStream.writeShort(length);
            for (int i = 0; i < length; i++) {
                q qVar = qVarArr[i];
                dataOutputStream.writeLong(qVar.a);
                dataOutputStream.writeLong(qVar.b);
                dataOutputStream.writeUTF(qVar.d);
                dataOutputStream.writeUTF(qVar.c);
                dataOutputStream.writeLong(qVar.e);
                dataOutputStream.writeLong(qVar.f.longValue());
                dataOutputStream.writeByte(qVar.g.length);
                dataOutputStream.write(qVar.g);
            }
        }
        dataOutputStream.writeShort(this.i.size());
        for (Entry entry32 : this.i.entrySet()) {
            dataOutputStream.writeByte(((Byte) entry32.getKey()).byteValue());
            ((u) entry32.getValue()).a((DataOutput) dataOutputStream);
        }
        dataOutputStream.writeShort(this.j.size());
        for (Entry entry222 : this.j.entrySet()) {
            dataOutputStream.writeShort(((Short) entry222.getKey()).shortValue());
            dataOutputStream.writeLong(((Long) entry222.getValue()).longValue());
        }
    }

    private String h() {
        return ".flurryappcircle." + Integer.toString(this.c.a.hashCode(), 16);
    }

    private void a(int i) {
        this.k = !this.g.isEmpty();
        if (this.k) {
            this.b.a(i);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append("adImages (" + this.e.b().size() + "),\n");
        stringBuilder.append("adBlock (" + this.g.size() + "):").append(",\n");
        for (Entry entry : this.g.entrySet()) {
            stringBuilder.append("\t" + ((String) entry.getKey()) + ": " + Arrays.toString((Object[]) entry.getValue()));
        }
        stringBuilder.append("adHooks (" + this.h.size() + "):" + this.h).append(",\n");
        stringBuilder.append("adThemes (" + this.i.size() + "):" + this.i).append(",\n");
        stringBuilder.append("auxMap (" + this.j.size() + "):" + this.j).append(",\n");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
