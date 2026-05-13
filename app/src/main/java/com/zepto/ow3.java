package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ow3 {
    public final z62 a;
    public final hf2 b;
    public final si1 c;

    public ow3(z62 z62Var, si1 si1Var, c96 c96Var) {
        this.b = c96Var.f();
        this.a = z62Var;
        this.c = si1Var;
    }

    public void a(nw3 nw3Var, uh4 uh4Var) throws bm4 {
        c(nw3Var, uh4Var);
        b(nw3Var, uh4Var);
    }

    public final void b(nw3 nw3Var, uh4 uh4Var) throws bm4 {
        for (String str : uh4Var.attributes()) {
            y62 y62VarA = this.a.a(str);
            if (!y62VarA.f() && y62VarA.x()) {
                throw new bm4("Ordered attribute '%s' references an element in %s", y62VarA, this.c);
            }
            if (y62VarA.x()) {
                e(nw3Var, y62VarA);
            } else {
                nw3Var.s(this.b.c().a(str));
            }
        }
    }

    public final void c(nw3 nw3Var, uh4 uh4Var) throws bm4 {
        for (String str : uh4Var.elements()) {
            y62 y62VarA = this.a.a(str);
            if (y62VarA.f()) {
                throw new bm4("Ordered element '%s' references an attribute in %s", y62VarA, this.c);
            }
            g(nw3Var, y62VarA);
        }
    }

    public final void d(nw3 nw3Var, y62 y62Var) {
        String first = y62Var.getFirst();
        if (first != null) {
            nw3Var.s(first);
        }
    }

    public final void e(nw3 nw3Var, y62 y62Var) throws bm4 {
        String prefix = y62Var.getPrefix();
        String first = y62Var.getFirst();
        int index = y62Var.getIndex();
        if (!y62Var.x()) {
            d(nw3Var, y62Var);
            return;
        }
        nw3 nw3VarI = nw3Var.i(first, prefix, index);
        y62 y62VarM = y62Var.M(1);
        if (nw3VarI == null) {
            throw new bm4("Element '%s' does not exist in %s", first, this.c);
        }
        e(nw3VarI, y62VarM);
    }

    public final void f(nw3 nw3Var, y62 y62Var) throws bm4 {
        String prefix = y62Var.getPrefix();
        String first = y62Var.getFirst();
        int index = y62Var.getIndex();
        if (index > 1 && nw3Var.y(first, index - 1) == null) {
            throw new bm4("Ordered element '%s' in path '%s' is out of sequence for %s", first, y62Var, this.c);
        }
        nw3Var.i(first, prefix, index);
    }

    public final void g(nw3 nw3Var, y62 y62Var) throws bm4 {
        String prefix = y62Var.getPrefix();
        String first = y62Var.getFirst();
        int index = y62Var.getIndex();
        if (first != null) {
            nw3 nw3VarI = nw3Var.i(first, prefix, index);
            y62 y62VarM = y62Var.M(1);
            if (y62Var.x()) {
                g(nw3VarI, y62VarM);
            }
        }
        f(nw3Var, y62Var);
    }
}
