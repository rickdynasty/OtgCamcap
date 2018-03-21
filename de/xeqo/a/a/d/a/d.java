package de.xeqo.a.a.d.a;

import android.util.Log;
import de.xeqo.a.a.d.a;
import de.xeqo.a.a.d.c;
import de.xeqo.util.StringUtils;

import java.nio.ByteBuffer;

public abstract class d extends a {
    public static c a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 4) {
            return null;
        }
        int i = byteBuffer.getInt();
        Log.d("CamCap_Lib", "PropertyChangeEvent: " + StringUtils.getDesByChar((char) i));
        int i2;
        switch (i) {
            case 53505:
                if (byteBuffer.remaining() == 4) {
                    return new g(byteBuffer.getInt());
                }
                return null;
            case 53506:
                if (byteBuffer.remaining() == 4) {
                    return new i(byteBuffer.getInt());
                }
                return null;
            case 53507:
                if (byteBuffer.remaining() == 4) {
                    return new h(byteBuffer.getInt());
                }
                return null;
            case 53508:
                if (byteBuffer.remaining() == 4) {
                    return new k(byteBuffer.getInt());
                }
                return null;
            case 53509:
                if (byteBuffer.remaining() == 4) {
                    return new j(byteBuffer.getInt());
                }
                return null;
            case 53511:
                if (byteBuffer.remaining() == 4) {
                    return new n(byteBuffer.getInt());
                }
                return null;
            case 53513:
                if (byteBuffer.remaining() == 4) {
                    return new l(byteBuffer.getInt());
                }
                return null;
            case 53514:
                if (byteBuffer.remaining() == 4) {
                    return new o(byteBuffer.getInt());
                }
                return null;
            case 53520:
                if (byteBuffer.remaining() == 4) {
                    return new p(byteBuffer.getInt());
                }
                return null;
            case 53536:
                if (byteBuffer.remaining() >= 4) {
                    return new q(de.xeqo.a.a.c.b.a.a(byteBuffer));
                }
                return null;
            case 53687:
                if (byteBuffer.remaining() != 4) {
                    return null;
                }
                i2 = byteBuffer.getInt();
                if (i2 != 1) {
                    return null;
                }
                Log.d("CamCap_Lib", "ExposureSimModeChanged ---->" + i2);
                return new m();
            default:
                int remaining = byteBuffer.remaining() / 4;
                Object obj = "(";
                for (i2 = 0; i2 < remaining; i2++) {
                    obj = new StringBuilder(String.valueOf(obj)).append(Integer.toHexString(byteBuffer.getInt())).append(", ").toString();
                }
                String stringBuilder = new StringBuilder(String.valueOf(obj)).append(")").toString();
                Log.d("CamCap_Lib", "   " + StringUtils.getDesByChar((char) i) + " Not Handled! Params" + stringBuilder);
                return null;
        }
    }
}
