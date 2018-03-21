package de.xeqo.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;

public final class BitmapUtils {
    public static Bitmap decodeByFile(File file, int i) {
        int i2 = 1;
        Bitmap bitmap = null;
        if (file != null && file.exists()) {
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new FileInputStream(file), null, options);
                int i3 = options.outWidth;
                int i4 = options.outHeight;
                while (i3 / 2 >= i && i4 / 2 >= i) {
                    i3 /= 2;
                    i4 /= 2;
                    i2 *= 2;
                }
                Options options2 = new Options();
                options2.inSampleSize = i2;
                options2.inTempStorage = new byte[65536];
                options2.inPurgeable = true;
                bitmap = BitmapFactory.decodeStream(new FileInputStream(file), null, options2);
            } catch (Throwable th) {
                Log.e("CamCap_Lib", "decode bitmap error", th);
                System.gc();
            }
        }
        return bitmap;
    }
}
