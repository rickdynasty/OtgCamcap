package com.flurry.android;

import java.io.DataInput;

public final class a extends af {
    long a;
    int b;
    int c;
    String d;
    byte[] e;

    a() {
    }

    a(DataInput dataInput) {
        a(dataInput);
    }

    final void a(DataInput dataInput) {
        this.a = dataInput.readLong();
        this.b = dataInput.readInt();
        this.c = dataInput.readInt();
        this.d = dataInput.readUTF();
        this.e = new byte[dataInput.readInt()];
        dataInput.readFully(this.e);
    }
}
