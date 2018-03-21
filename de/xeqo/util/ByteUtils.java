package de.xeqo.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Created by Administrator on 2018/3/21.
 */

public class ByteUtils {
    public static byte[] createByteArray(char c, int i, int... iArr) {
        int i2 = 12;
        if (iArr != null) {
            i2 = (iArr.length * 4) + 12;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i2);
        allocate.putShort((short) 1);
        allocate.putChar(c);
        allocate.putInt(i);
        if (iArr != null) {
            for (int putInt : iArr) {
                allocate.putInt(putInt);
            }
        }
        return allocate.array();
    }

    public static byte[] createByteArrayByShort(short s) {
        return new byte[]{(byte) (s >>> 8), (byte) s};
    }
}
