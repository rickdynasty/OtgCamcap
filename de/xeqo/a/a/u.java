package de.xeqo.a.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class u {
    private char a;
    private char b;
    private int c;
    private ByteBuffer d;

    public u(char c, int i) {
        this('\u0001', c, i, null);
    }

    public u(char c, char c2, int i, ByteBuffer byteBuffer) {
        this.a = '\u0000';
        this.b = '\u0000';
        this.c = 0;
        this.a = c;
        this.b = c2;
        this.c = i;
        if (byteBuffer != null && byteBuffer.limit() > 0) {
            this.d = byteBuffer;
        }
    }

    public u(char c, int i, int i2) {
        this.a = '\u0000';
        this.b = '\u0000';
        this.c = 0;
        this.a = '\u0001';
        this.b = c;
        this.c = i;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i2);
        this.d = allocate;
    }

    public u(char c, int i, int i2, int i3) {
        this.a = '\u0000';
        this.b = '\u0000';
        this.c = 0;
        this.a = '\u0001';
        this.b = c;
        this.c = i;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i2);
        allocate.putInt(i3);
        this.d = allocate;
    }

    public u(char c, int i, int i2, int i3, int i4) {
        this.a = '\u0000';
        this.b = '\u0000';
        this.c = 0;
        this.a = '\u0001';
        this.b = c;
        this.c = i;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i2);
        allocate.putInt(i3);
        allocate.putInt(i4);
        this.d = allocate;
    }

    public final char a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final ByteBuffer c() {
        int i = 12;
        if (this.d != null) {
            i = this.d.capacity() + 12;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i);
        allocate.putChar(this.a);
        allocate.putChar(this.b);
        allocate.putInt(this.c);
        if (this.d != null) {
            this.d.rewind();
            allocate.put(this.d);
        }
        return allocate;
    }
}
