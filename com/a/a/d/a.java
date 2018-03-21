package com.a.a.d;

import com.a.a.a.b;
import com.a.a.a.i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class a {
    private Class a;
    private Type b;
    private int c;

    protected a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        this.b = b.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.a = b.b(this.b);
        this.c = this.b.hashCode();
    }

    private a(Type type) {
        this.b = b.a((Type) i.a((Object) type));
        this.a = b.b(this.b);
        this.c = this.b.hashCode();
    }

    public final Class a() {
        return this.a;
    }

    public final Type b() {
        return this.b;
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.a(this.b, ((a) obj).b);
    }

    public final String toString() {
        return b.c(this.b);
    }

    public static a a(Type type) {
        return new a(type);
    }

    public static a a(Class cls) {
        return new a(cls);
    }
}
