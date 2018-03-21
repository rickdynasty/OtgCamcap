package de.xeqo.a.a;

import de.xeqo.a.a.c.ah;
import de.xeqo.a.a.c.l;
import de.xeqo.a.a.c.o;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicReference;

public abstract class x {
    private static /* synthetic */ boolean b = (!x.class.desiredAssertionStatus());
    private boolean a = false;

    protected abstract void a(int i, AtomicReference atomicReference, List list);

    public final boolean f() {
        return this.a;
    }

    protected o a_() {
        return new l();
    }

    public boolean a(UsbService wVar) {
        boolean z = true;
        this.a = false;
        if (wVar != null && wVar.d()) {
            int e = wVar.e();
            AtomicReference atomicReference = new AtomicReference();
            List vector = new Vector();
            a(e, atomicReference, vector);
            u uVar = (u) atomicReference.get();
            if (!b && uVar == null) {
                throw new AssertionError();
            } else if (uVar != null) {
                if (!b && uVar.a() != '\u0001') {
                    throw new AssertionError();
                } else if (b || uVar.b() == e) {
                    int i = (uVar.a() == '\u0001' ? 1 : 0) & 1;
                    Iterable<u> unmodifiableList = Collections.unmodifiableList(vector);
                    int i2 = i;
                    for (u uVar2 : unmodifiableList) {
                        if (b || (uVar2 != null && uVar2.b() == e && uVar2.a() == '\u0002')) {
                            i = (uVar2 != null && uVar2.b() == e && uVar2.a() == '\u0002') ? 1 : 0;
                            i2 = i & i2;
                        } else {
                            throw new AssertionError();
                        }
                    }
                    if (i2 != 0) {
                        i = e();
                        if (i < 0) {
                            i = 0;
                        }
                        ah a_ = a_();
                        if (a_ == null) {
                            z = false;
                        }
                        t.a(z, "Es wurde kein Handler erzeugt!");
                        if (wVar.a(uVar, unmodifiableList, a_, i)) {
                            if (!b && !a_.f()) {
                                throw new AssertionError();
                            } else if (a_.f()) {
                                this.a = a(a_);
                            }
                        }
                    }
                } else {
                    throw new AssertionError();
                }
            }
        }
        return this.a;
    }

    protected int e() {
        return 2500;
    }

    protected boolean a(ah ahVar) {
        return ahVar.g() == h.a;
    }
}
