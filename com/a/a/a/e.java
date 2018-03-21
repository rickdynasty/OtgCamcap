package com.a.a.a;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class e implements Serializable, WildcardType {
    private final Type a;
    private final Type b;

    public e(Type[] typeArr, Type[] typeArr2) {
        boolean z;
        boolean z2 = true;
        i.a(typeArr2.length <= 1);
        if (typeArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (typeArr2.length == 1) {
            i.a(typeArr2[0]);
            b.e(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                z2 = false;
            }
            i.a(z2);
            this.b = b.a(typeArr2[0]);
            this.a = Object.class;
            return;
        }
        i.a(typeArr[0]);
        b.e(typeArr[0]);
        this.b = null;
        this.a = b.a(typeArr[0]);
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final Type[] getLowerBounds() {
        if (this.b == null) {
            return b.a;
        }
        return new Type[]{this.b};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && b.a((Type) this, (WildcardType) obj);
    }

    public final int hashCode() {
        return (this.b != null ? this.b.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        if (this.b != null) {
            return "? super " + b.c(this.b);
        }
        if (this.a == Object.class) {
            return "?";
        }
        return "? extends " + b.c(this.a);
    }
}
