package de.xeqo.a.a.d.a;

import android.util.Log;
import de.xeqo.a.a.d.c;
import de.xeqo.util.StringUtils;

import java.nio.ByteBuffer;

public abstract class a extends de.xeqo.a.a.d.a {
    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 4) {
            return null;
        }
        int i = byteBuffer.getInt();
        Log.d("CamCap_Lib", "AvailListChangedEvent: " + StringUtils.getDesByChar((char) i));
        switch (i) {
            case 53505:
                return v.a(byteBuffer);
            case 53506:
                return x.a(byteBuffer);
            case 53507:
                return s.a(byteBuffer);
            case 53508:
                return e.a(byteBuffer);
            case 53511:
                return u.a(byteBuffer);
            case 53513:
                return c.a(byteBuffer);
            case 53514:
                return b.a(byteBuffer);
            case 53520:
                return y.a(byteBuffer);
            case 53536:
                return r.a(byteBuffer);
            default:
                int remaining = byteBuffer.remaining() / 4;
                Object obj = "(";
                for (int i2 = 0; i2 < remaining; i2++) {
                    obj = new StringBuilder(String.valueOf(obj)).append(Integer.toHexString(byteBuffer.getInt())).append(", ").toString();
                }
                String stringBuilder = new StringBuilder(String.valueOf(obj)).append(")").toString();
                Log.d("CamCap_Lib", "    " + StringUtils.getDesByChar((char) i) + " Not Handled! Params" + stringBuilder);
                return null;
        }
    }
}
