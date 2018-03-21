package com.a.a.a;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class d implements Serializable, ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;

    public d(Type type, Type type2, Type... typeArr) {
        boolean z = true;
        int i = 0;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z2 = type != null || cls.getEnclosingClass() == null;
            i.a(z2);
            if (type != null && cls.getEnclosingClass() == null) {
                z = false;
            }
            i.a(z);
        }
        this.a = type == null ? null : b.a(type);
        this.b = b.a(type2);
        this.c = (Type[]) typeArr.clone();
        while (i < this.c.length) {
            i.a(this.c[i]);
            b.e(this.c[i]);
            this.c[i] = b.a(this.c[i]);
            i++;
        }
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    public final Type getRawType() {
        return this.b;
    }

    public final Type getOwnerType() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && b.a((Type) this, (ParameterizedType) obj);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ b.a(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder((this.c.length + 1) * 30);
        stringBuilder.append(b.c(this.b));
        if (this.c.length == 0) {
            return stringBuilder.toString();
        }
        stringBuilder.append("<").append(b.c(this.c[0]));
        for (int i = 1; i < this.c.length; i++) {
            stringBuilder.append(", ").append(b.c(this.c[i]));
        }
        return stringBuilder.append(">").toString();
    }
}
