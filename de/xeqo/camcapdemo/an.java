package de.xeqo.camcapdemo;

import de.xeqo.a.a.c;
import de.xeqo.a.a.m;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class an implements Runnable {
    private /* synthetic */ CameraActivity a;

    an(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final void run() {
        CameraActivity cameraActivity = this.a;
        List<File> arrayList = new ArrayList();
        FilenameFilter avVar = new JpgFilter(cameraActivity);
        File file = new File("/sdcard/CamCap/");
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(avVar);
            Arrays.sort(listFiles, new au(cameraActivity));
            int i = 0;
            for (Object obj : listFiles) {
                if (i >= 5) {
                    break;
                }
                arrayList.add(0, obj);
                i++;
            }
        }
        for (File mVar : arrayList) {
            c mVar2 = new m(mVar);
            CameraActivity.a(this.a, mVar2);
            mVar2.a();
        }
        if (arrayList.size() > 0) {
            this.a.a((File) arrayList.get(arrayList.size() - 1));
        }
    }
}
