package de.xeqo.camcapdemo;

import java.io.File;
import java.io.FilenameFilter;

final class JpgFilter implements FilenameFilter {
    private /* synthetic */ CameraActivity a;

    JpgFilter(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final boolean accept(File file, String str) {
        return str.toLowerCase().endsWith(".jpg");
    }
}
