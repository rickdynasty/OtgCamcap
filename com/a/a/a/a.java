package com.a.a.a;

import com.a.a.am;
import com.a.a.b.c;
import com.a.a.b.d;
import com.a.a.l;
import com.a.a.r;
import com.a.a.v;
import com.a.a.y;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class a implements l, Cloneable {
    public static final a a = new a();
    private double b = -1.0d;
    private int c = 136;
    private boolean d = true;
    private boolean e;
    private List f = Collections.emptyList();
    private List g = Collections.emptyList();

    protected final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    private a a() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public final am a(r rVar, com.a.a.d.a aVar) {
        Class a = aVar.a();
        boolean a2 = a(a, true);
        boolean a3 = a(a, false);
        if (a2 || a3) {
            return new g(this, a3, a2, rVar, aVar);
        }
        return null;
    }

    public final boolean a(Field field, boolean z) {
        if ((this.c & field.getModifiers()) != 0) {
            return true;
        }
        if (this.b != -1.0d && !a((c) field.getAnnotation(c.class), (d) field.getAnnotation(d.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (this.e) {
            com.a.a.b.a aVar = (com.a.a.b.a) field.getAnnotation(com.a.a.b.a.class);
            if (aVar == null || (z ? !aVar.a() : !aVar.b())) {
                return true;
            }
        }
        if (!this.d && b(field.getType())) {
            return true;
        }
        if (a(field.getType())) {
            return true;
        }
        List<v> list = z ? this.f : this.g;
        if (!list.isEmpty()) {
            y yVar = new y(field);
            for (v a : list) {
                if (a.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(Class cls, boolean z) {
        if (this.b != -1.0d && !a((c) cls.getAnnotation(c.class), (d) cls.getAnnotation(d.class))) {
            return true;
        }
        if (!this.d && b(cls)) {
            return true;
        }
        if (a(cls)) {
            return true;
        }
        for (v b : z ? this.f : this.g) {
            if (b.b()) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private static boolean b(Class cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(c cVar, d dVar) {
        boolean z = cVar == null || cVar.a() <= this.b;
        if (z) {
            z = dVar == null || dVar.a() > this.b;
            if (z) {
                return true;
            }
        }
        return false;
    }
}
