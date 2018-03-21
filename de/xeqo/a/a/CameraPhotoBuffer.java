package de.xeqo.a.a;

import java.nio.ByteBuffer;

public final class CameraPhotoBuffer {
    private int bufferLen;
    private ByteBuffer byteBuffer;

    public final int getBufferLen() {
        return this.bufferLen;
    }

    public final void setBufferLen(int bufferLen) {
        this.bufferLen = bufferLen;
    }

    public final ByteBuffer getByteBuffer() {
        return byteBuffer;
    }

    public final void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }
}
