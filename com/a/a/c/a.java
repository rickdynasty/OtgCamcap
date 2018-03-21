package com.a.a.c;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class a implements Closeable {
    private final Writer a;
    private final List b = new ArrayList();
    private String c;
    private String d;
    private boolean e;
    private boolean f;
    private String g;
    private boolean h;

    public a(Writer writer) {
        this.b.add(c.EMPTY_DOCUMENT);
        this.d = ":";
        this.h = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.a = writer;
    }

    public final void a(String str) {
        if (str.length() == 0) {
            this.c = null;
            this.d = ":";
            return;
        }
        this.c = str;
        this.d = ": ";
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final boolean a() {
        return this.e;
    }

    public final void b(boolean z) {
        this.f = z;
    }

    public final boolean b() {
        return this.f;
    }

    public final void c(boolean z) {
        this.h = z;
    }

    public final boolean c() {
        return this.h;
    }

    public a d() {
        j();
        return a(c.EMPTY_ARRAY, "[");
    }

    public a e() {
        return a(c.EMPTY_ARRAY, c.NONEMPTY_ARRAY, "]");
    }

    public a f() {
        j();
        return a(c.EMPTY_OBJECT, "{");
    }

    public a g() {
        return a(c.EMPTY_OBJECT, c.NONEMPTY_OBJECT, "}");
    }

    private a a(c cVar, String str) {
        e(true);
        this.b.add(cVar);
        this.a.write(str);
        return this;
    }

    private a a(c cVar, c cVar2, String str) {
        c i = i();
        if (i != cVar2 && i != cVar) {
            throw new IllegalStateException("Nesting problem: " + this.b);
        } else if (this.g != null) {
            throw new IllegalStateException("Dangling name: " + this.g);
        } else {
            this.b.remove(this.b.size() - 1);
            if (i == cVar2) {
                k();
            }
            this.a.write(str);
            return this;
        }
    }

    private c i() {
        return (c) this.b.get(this.b.size() - 1);
    }

    private void a(c cVar) {
        this.b.set(this.b.size() - 1, cVar);
    }

    public a b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.g != null) {
            throw new IllegalStateException();
        } else {
            this.g = str;
            return this;
        }
    }

    private void j() {
        if (this.g != null) {
            c i = i();
            if (i == c.NONEMPTY_OBJECT) {
                this.a.write(44);
            } else if (i != c.EMPTY_OBJECT) {
                throw new IllegalStateException("Nesting problem: " + this.b);
            }
            k();
            a(c.DANGLING_NAME);
            d(this.g);
            this.g = null;
        }
    }

    public a c(String str) {
        if (str == null) {
            return h();
        }
        j();
        e(false);
        d(str);
        return this;
    }

    public a h() {
        if (this.g != null) {
            if (this.h) {
                j();
            } else {
                this.g = null;
                return this;
            }
        }
        e(false);
        this.a.write("null");
        return this;
    }

    public a d(boolean z) {
        j();
        e(false);
        this.a.write(z ? "true" : "false");
        return this;
    }

    public a a(long j) {
        j();
        e(false);
        this.a.write(Long.toString(j));
        return this;
    }

    public a a(Number number) {
        if (number == null) {
            return h();
        }
        j();
        CharSequence obj = number.toString();
        if (this.e || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            e(false);
            this.a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public void close() {
        this.a.close();
        if (i() != c.NONEMPTY_DOCUMENT) {
            throw new IOException("Incomplete document");
        }
    }

    private void d(String str) {
        this.a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\b':
                    this.a.write("\\b");
                    continue;
                case '\t':
                    this.a.write("\\t");
                    continue;
                case '\n':
                    this.a.write("\\n");
                    continue;
                case '\f':
                    this.a.write("\\f");
                    continue;
                case '\r':
                    this.a.write("\\r");
                    continue;
                case '\"':
                case '\\':
                    this.a.write(92);
                    break;
                case '&':
                case '\'':
                case '<':
                case '=':
                case '>':
                    if (!this.f) {
                        this.a.write(charAt);
                        break;
                    }
                    this.a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    continue;
                case ' ':
                case ' ':
                    this.a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    continue;
                default:
                    if (charAt <= '\u001f') {
                        this.a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                        continue;
                    }
                    break;
            }
            this.a.write(charAt);
        }
        this.a.write("\"");
    }

    private void k() {
        if (this.c != null) {
            this.a.write("\n");
            for (int i = 1; i < this.b.size(); i++) {
                this.a.write(this.c);
            }
        }
    }

    private void e(boolean z) {
        switch (b.a[i().ordinal()]) {
            case 1:
                if (this.e || z) {
                    a(c.NONEMPTY_DOCUMENT);
                    return;
                }
                throw new IllegalStateException("JSON must start with an array or an object.");
            case 2:
                a(c.NONEMPTY_ARRAY);
                k();
                return;
            case 3:
                this.a.append(',');
                k();
                return;
            case 4:
                this.a.append(this.d);
                a(c.NONEMPTY_OBJECT);
                return;
            case 5:
                throw new IllegalStateException("JSON must have only one top-level value.");
            default:
                throw new IllegalStateException("Nesting problem: " + this.b);
        }
    }
}
