package com.flurry.android;

import java.io.DataInput;

final class x extends af {
    String a;
    byte b;
    byte c;
    u d;

    x() {
    }

    x(DataInput dataInput) {
        this.a = dataInput.readUTF();
        this.b = dataInput.readByte();
        this.c = dataInput.readByte();
    }

    public final String toString() {
        return "{name: " + this.a + ", blockId: " + this.b + ", themeId: " + this.c;
    }
}
