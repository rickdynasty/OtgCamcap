package com.flurry.android;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

final class k {
    final String a;
    q b;
    long c;
    List d;
    private byte e;

    k(k kVar, long j) {
        this(kVar.a, kVar.e, j);
        this.b = kVar.b;
        this.c = kVar.c;
    }

    k(String str, byte b, long j) {
        this.d = new ArrayList();
        this.a = str;
        this.e = b;
        this.d.add(new w((byte) 1, j));
    }

    final void a(w wVar) {
        this.d.add(wVar);
    }

    final long a() {
        return ((w) this.d.get(0)).b;
    }

    final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.a);
        dataOutput.writeByte(this.e);
        if (this.b == null) {
            dataOutput.writeLong(0);
            dataOutput.writeLong(0);
            dataOutput.writeByte(0);
        } else {
            dataOutput.writeLong(this.b.a);
            dataOutput.writeLong(this.b.e);
            byte[] bArr = this.b.g;
            dataOutput.writeByte(bArr.length);
            dataOutput.write(bArr);
        }
        dataOutput.writeShort(this.d.size());
        for (w wVar : this.d) {
            dataOutput.writeByte(wVar.a);
            dataOutput.writeLong(wVar.b);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{hook: " + this.a + ", ad: " + this.b.d + ", transitions: [");
        for (w append : this.d) {
            stringBuilder.append(append);
            stringBuilder.append(",");
        }
        stringBuilder.append("]}");
        return stringBuilder.toString();
    }
}
