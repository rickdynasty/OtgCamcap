package de.xeqo.a.a;

public enum s {
    Camera,
    Tablet,
    CameraAndTablet;

    public final boolean a() {
        return this == Tablet || this == CameraAndTablet;
    }
}
