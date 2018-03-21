package de.xeqo.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class BufferToStringUtils {
    public static String a(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null || byteBuffer.capacity() < byteBuffer.position() + i) {
            return "";
        }
        String str;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            str = new String(bArr, "UTF-16LE");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str = null;
        }
        if (str == null || str.length() <= 0 || str.charAt(str.length() - 1) != '\u0000') {
            return str;
        }
        return str.substring(0, str.length() - 1);
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            stringBuilder.append("0123456789ABCDEF".charAt((b & 240) >> 4)).append("0123456789ABCDEF".charAt(b & 15));
        }
        return stringBuilder.toString();
    }
}
