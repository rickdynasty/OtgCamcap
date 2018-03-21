package com.a.a;

import com.a.a.a.f;
import com.a.a.c.a;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class al {
    public final ak g() {
        if (this instanceof ak) {
            return (ak) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    public boolean c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            Writer stringWriter = new StringWriter();
            a aVar = new a(stringWriter);
            aVar.a(true);
            f.a(this, aVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
