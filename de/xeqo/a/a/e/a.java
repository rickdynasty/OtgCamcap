package de.xeqo.a.a.e;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class a {
    private char a;
    private char b;
    private boolean c;
    private Object d;
    private Object e;
    private b f;
    private List g;

    public final a a(c cVar) {
        a aVar = new a();
        aVar.e = cVar.a(this.e);
        aVar.b = this.b;
        aVar.a = this.a;
        aVar.d = cVar.a(this.d);
        aVar.f = this.f;
        aVar.c = this.c;
        if (this.g != null) {
            aVar.g = new ArrayList();
            for (Object a : this.g) {
                aVar.g.add(cVar.a(a));
            }
        }
        return aVar;
    }

    public final boolean a() {
        return this.c;
    }

    public final Object b() {
        return this.e;
    }

    public final List c() {
        return this.g;
    }

    public static a a(ByteBuffer byteBuffer) {
        boolean z = true;
        char c = '\u0000';
        a aVar = new a();
        aVar.a = byteBuffer.getChar();
        aVar.b = byteBuffer.getChar();
        if (byteBuffer.get() != (byte) 1) {
            z = false;
        }
        aVar.c = z;
        aVar.d = Integer.valueOf(byteBuffer.getInt());
        aVar.e = Integer.valueOf(byteBuffer.getInt());
        b a = b.a(byteBuffer.get());
        aVar.f = a;
        if (a == b.Enumeration) {
            char c2 = byteBuffer.getChar();
            aVar.g = new ArrayList();
            while (c < c2) {
                aVar.g.add(Integer.valueOf(byteBuffer.getInt()));
                c++;
            }
        }
        return aVar;
    }

    public static a b(ByteBuffer byteBuffer) {
        boolean z = true;
        char c = '\u0000';
        a aVar = new a();
        aVar.a = byteBuffer.getChar();
        aVar.b = byteBuffer.getChar();
        if (byteBuffer.get() != (byte) 1) {
            z = false;
        }
        aVar.c = z;
        aVar.d = Character.valueOf(byteBuffer.getChar());
        aVar.e = Character.valueOf(byteBuffer.getChar());
        b a = b.a(byteBuffer.get());
        aVar.f = a;
        char c2;
        if (a == b.Enumeration) {
            c2 = byteBuffer.getChar();
            aVar.g = new ArrayList();
            while (c < c2) {
                aVar.g.add(Character.valueOf(byteBuffer.getChar()));
                c++;
            }
        } else if (a == b.Range) {
            c2 = byteBuffer.getChar();
            char c3 = byteBuffer.getChar();
            char c4 = byteBuffer.getChar();
            aVar.g = new ArrayList();
            while (c <= c3) {
                aVar.g.add(Character.valueOf((char) ((c * c4) + c2)));
                c++;
            }
        }
        return aVar;
    }

    public static a c(ByteBuffer byteBuffer) {
        boolean z = true;
        char c = '\u0000';
        a aVar = new a();
        aVar.a = byteBuffer.getChar();
        aVar.b = byteBuffer.getChar();
        if (byteBuffer.get() != (byte) 1) {
            z = false;
        }
        aVar.c = z;
        aVar.d = Byte.valueOf(byteBuffer.get());
        aVar.e = Byte.valueOf(byteBuffer.get());
        b a = b.a(byteBuffer.get());
        aVar.f = a;
        char c2;
        if (a == b.Enumeration) {
            c2 = byteBuffer.getChar();
            aVar.g = new ArrayList();
            while (c < c2) {
                aVar.g.add(Byte.valueOf(byteBuffer.get()));
                c++;
            }
        } else if (a == b.Range) {
            c2 = byteBuffer.getChar();
            char c3 = byteBuffer.getChar();
            char c4 = byteBuffer.getChar();
            aVar.g = new ArrayList();
            while (c <= c3) {
                aVar.g.add(Byte.valueOf((byte) ((c * c4) + c2)));
                c++;
            }
        }
        return aVar;
    }

    public static a d(ByteBuffer byteBuffer) {
        boolean z = true;
        char c = '\u0000';
        a aVar = new a();
        aVar.a = byteBuffer.getChar();
        aVar.b = byteBuffer.getChar();
        if (byteBuffer.get() != (byte) 1) {
            z = false;
        }
        aVar.c = z;
        aVar.d = Short.valueOf(byteBuffer.getShort());
        aVar.e = Short.valueOf(byteBuffer.getShort());
        b a = b.a(byteBuffer.get());
        aVar.f = a;
        if (a == b.Enumeration) {
            char c2 = byteBuffer.getChar();
            aVar.g = new ArrayList();
            while (c < c2) {
                aVar.g.add(Short.valueOf(byteBuffer.getShort()));
                c++;
            }
        }
        return aVar;
    }
}
