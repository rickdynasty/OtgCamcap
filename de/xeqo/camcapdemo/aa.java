package de.xeqo.camcapdemo;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;

final class aa {
    aa() {
    }

    static boolean a(Activity activity) {
        int i;
        PackageInfo c = c(activity);
        if (c != null) {
            i = c.versionCode;
        } else {
            i = 1;
        }
        SharedPreferences sharedPreferences = activity.getSharedPreferences("eula_" + i, 0);
        if (sharedPreferences.getBoolean("eula.accepted", false)) {
            return true;
        }
        Builder builder = new Builder(activity);
        builder.setTitle(R.string.eula_title);
        builder.setCancelable(true);
        builder.setPositiveButton(R.string.eula_accept, new w(sharedPreferences, activity));
        builder.setNegativeButton(R.string.eula_refuse, new x(activity));
        builder.setOnCancelListener(new y(activity));
        builder.setMessage(b(activity));
        builder.create().show();
        return false;
    }

    private static CharSequence b(Activity activity) {
        Throwable th;
        Closeable closeable = null;
        Closeable bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(activity.getAssets().open("EULA")));
            try {
                CharSequence stringBuilder = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        a(bufferedReader);
                        return stringBuilder;
                    }
                    stringBuilder.append(readLine).append('\n');
                }
            } catch (IOException e) {
                closeable = bufferedReader;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            a(closeable);
            return "";
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedReader = null;
            th = th4;
            a(bufferedReader);
            throw th;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    private static PackageInfo c(Activity activity) {
        PackageInfo packageInfo = null;
        try {
            packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 1);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return packageInfo;
    }
}
