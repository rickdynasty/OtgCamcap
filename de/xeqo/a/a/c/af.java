package de.xeqo.a.a.c;

import java.nio.ByteBuffer;

import de.xeqo.util.BufferToStringUtils;

public final class af {
    private int a;
    private char b;
    private char c;
    private int d;
    private char e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private char m;
    private int n;
    private int o;
    private String p;
    private String q;
    private String r;
    private byte s;

    public final char a() {
        return this.b;
    }

    public final String b() {
        return this.p;
    }

    public static af a(ByteBuffer byteBuffer) {
        af afVar = new af();
        afVar.a = byteBuffer.getInt();
        afVar.b = byteBuffer.getChar();
        afVar.c = byteBuffer.getChar();
        afVar.d = byteBuffer.getInt();
        afVar.e = byteBuffer.getChar();
        afVar.f = byteBuffer.getInt();
        afVar.g = byteBuffer.getInt();
        afVar.h = byteBuffer.getInt();
        afVar.i = byteBuffer.getInt();
        afVar.j = byteBuffer.getInt();
        afVar.k = byteBuffer.getInt();
        afVar.l = byteBuffer.getInt();
        afVar.m = byteBuffer.getChar();
        afVar.n = byteBuffer.getInt();
        afVar.o = byteBuffer.getInt();
        afVar.p = BufferToStringUtils.a(byteBuffer, byteBuffer.get() * 2);
        afVar.q = BufferToStringUtils.a(byteBuffer, byteBuffer.get() * 2);
        afVar.r = BufferToStringUtils.a(byteBuffer, byteBuffer.get() * 2);
        afVar.s = byteBuffer.get();
        return afVar;
    }
}
