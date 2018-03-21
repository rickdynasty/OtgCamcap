package de.xeqo.a.a.c;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class l extends k {
    private ByteBuffer a;

    public final boolean a() {
        return h() && this.a != null;
    }

    public final ByteBuffer b() {
        return this.a;
    }

    public final boolean c() {
        return false;
    }

    protected final boolean a(int i) {
        if (i <= 0) {
            return false;
        }
        this.a = ByteBuffer.allocate(i - 12);
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        return true;
    }

    protected final void a(byte[] bArr, int i, int i2) {
        if (this.a != null && bArr != null) {
            this.a.remaining();
            try {
                this.a.put(bArr, i, i2);
            } catch (BufferOverflowException e) {
            }
        }
    }

    protected final void i() {
        if (this.a != null) {
            this.a.rewind();
        }
    }
}
