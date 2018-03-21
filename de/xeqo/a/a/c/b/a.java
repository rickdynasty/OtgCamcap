package de.xeqo.a.a.c.b;

import de.xeqo.a.a.c.r;
import de.xeqo.a.a.c.x;
import de.xeqo.a.a.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public final class a extends x implements r {
    private static final List a;
    private final List b = new ArrayList();
    private final int c;

    static {
        List arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(new a(new c(1, 2, 2), g.k));
        a.add(new a(new c(1, 2, 3), g.l));
        a.add(new a(new c(1, 1, 2), g.d));
        a.add(new a(new c(1, 1, 3), g.e));
        a.add(new a(new c(1, 0, 2), g.a));
        a.add(new a(new c(1, 0, 3), g.b));
        a.add(new a(new c(6, 0, 4), new c(1, 0, 3), g.c));
        a.add(new a(new c(6, 0, 4), g.f));
        a.add(new a(new c(1, 14, 3), g.h));
        a.add(new a(new c(1, 14, 2), g.g));
        a.add(new a(new c(1, 15, 3), g.i));
        a.add(new a(new c(1, 16, 3), g.j));
    }

    private a(List list) {
        super(a((c[]) list.toArray(new c[0])));
        if (list != null) {
            this.b.addAll(list);
        }
        this.c = g.A;
    }

    private a(c cVar, int i) {
        super(a(cVar));
        if (cVar != null) {
            this.b.add(cVar);
        }
        this.c = i;
    }

    private a(c cVar, c cVar2, int i) {
        super(a(cVar, cVar2));
        if (cVar != null) {
            this.b.add(cVar);
        }
        if (cVar2 != null) {
            this.b.add(cVar2);
        }
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    private static String a(c... cVarArr) {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("CompressionSetting (");
        stringBuilder.append(cVarArr.length);
        stringBuilder.append("): ");
        for (c cVar : cVarArr) {
            stringBuilder.append("{");
            stringBuilder.append(cVar.toString());
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate((this.b.size() * 16) + 4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(this.b.size());
        for (c cVar : this.b) {
            allocate.putInt(16);
            allocate.putInt(cVar.a());
            allocate.putInt(cVar.b());
            allocate.putInt(cVar.c());
        }
        allocate.rewind();
        return allocate;
    }

    public static a a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() < 4) {
            return null;
        }
        List arrayList = new ArrayList();
        int i = byteBuffer.getInt();
        for (int i2 = 0; i2 < i; i2++) {
            Object obj;
            if (byteBuffer == null || byteBuffer.remaining() < 16 || byteBuffer.getInt() != 16) {
                obj = null;
            } else {
                obj = new c(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        a aVar = new a(arrayList);
        if (!a.contains(aVar)) {
            return aVar;
        }
        return (a) a.get(a.indexOf(aVar));
    }

    public final int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b == null) {
            if (aVar.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(aVar.b)) {
            return true;
        } else {
            return false;
        }
    }
}
