package de.xeqo.camcapdemo;

import java.io.File;
import java.util.Comparator;

final class au implements Comparator {
    private /* synthetic */ CameraActivity a;

    au(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
    }
}
