package com.a.a.a;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class x implements Serializable, GenericArrayType {
    private final Type a;

    public x(Type type) {
        this.a = b.a(type);
    }

    public final Type getGenericComponentType() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && b.a((Type) this, (GenericArrayType) obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b.c(this.a) + "[]";
    }
}
