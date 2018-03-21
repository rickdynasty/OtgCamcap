package de.xeqo.a.a.c;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import de.xeqo.util.BufferToStringUtils;

public final class e {
    private char a;
    private int b;
    private char c;
    private String d;
    private char e;
    private List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private String k;
    private String l;
    private String m;
    private String n;

    public final String a() {
        return this.k;
    }

    public final String b() {
        return this.l;
    }

    public static e a(ByteBuffer byteBuffer) {
        int i;
        int i2 = 0;
        e eVar = new e();
        eVar.a = byteBuffer.getChar();
        eVar.b = byteBuffer.getInt();
        eVar.c = byteBuffer.getChar();
        eVar.d = BufferToStringUtils.a(byteBuffer, byteBuffer.get() * 2);
        eVar.e = byteBuffer.getChar();
        int i3 = byteBuffer.getInt();
        List arrayList = new ArrayList();
        for (i = 0; i < i3; i++) {
            arrayList.add(Character.valueOf(byteBuffer.getChar()));
        }
        eVar.f = arrayList;
        i3 = byteBuffer.getInt();
        arrayList = new ArrayList();
        for (i = 0; i < i3; i++) {
            arrayList.add(Character.valueOf(byteBuffer.getChar()));
        }
        eVar.g = arrayList;
        i3 = byteBuffer.getInt();
        arrayList = new ArrayList();
        for (i = 0; i < i3; i++) {
            arrayList.add(Character.valueOf(byteBuffer.getChar()));
        }
        eVar.h = arrayList;
        i3 = byteBuffer.getInt();
        arrayList = new ArrayList();
        for (i = 0; i < i3; i++) {
            arrayList.add(Character.valueOf(byteBuffer.getChar()));
        }
        eVar.i = arrayList;
        i = byteBuffer.getInt();
        List arrayList2 = new ArrayList();
        while (i2 < i) {
            arrayList2.add(Character.valueOf(byteBuffer.getChar()));
            i2++;
        }
        eVar.j = arrayList2;
        eVar.k = BufferToStringUtils.a(byteBuffer, byteBuffer.get() * 2);
        eVar.l = BufferToStringUtils.a(byteBuffer, byteBuffer.get() * 2);
        eVar.m = BufferToStringUtils.a(byteBuffer, byteBuffer.get() * 2);
        eVar.n = BufferToStringUtils.a(byteBuffer, byteBuffer.get() * 2);
        return eVar;
    }
}
