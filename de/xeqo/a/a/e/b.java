package de.xeqo.a.a.e;

public enum b {
    None,
    Range,
    Enumeration;

    public static b a(byte b) {
        if (b == (byte) 1) {
            return Range;
        }
        if (b == (byte) 2) {
            return Enumeration;
        }
        return None;
    }
}
