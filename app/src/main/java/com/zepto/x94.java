package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class x94 {
    public final c52 b;
    public final StringBuilder a = new StringBuilder();
    public final fz2 c = new fz2();

    public x94(c52 c52Var) {
        this.b = c52Var;
    }

    public final void a(cz2 cz2Var) {
        b52 b52VarPeek = this.b.peek();
        if (b52VarPeek.g()) {
            this.a.append(b52VarPeek.getValue());
        }
    }

    public final String b(cz2 cz2Var) {
        if (this.a.length() <= 0) {
            return null;
        }
        String string = this.a.toString();
        this.a.setLength(0);
        return string;
    }

    public cz2 c(cz2 cz2Var) {
        if (!this.c.z(cz2Var)) {
            return null;
        }
        b52 next = this.b.next();
        while (next != null) {
            if (next.W()) {
                if (this.c.pop() == cz2Var) {
                    return null;
                }
            } else if (next.p()) {
                return e(cz2Var, next);
            }
            next = this.b.next();
        }
        return null;
    }

    public cz2 d() throws t94 {
        if (!this.c.isEmpty()) {
            return null;
        }
        cz2 cz2VarC = c(null);
        if (cz2VarC != null) {
            return cz2VarC;
        }
        throw new t94("Document has no root element");
    }

    public final cz2 e(cz2 cz2Var, b52 b52Var) {
        yy2 yy2Var = new yy2(cz2Var, this, b52Var);
        if (this.a.length() > 0) {
            this.a.setLength(0);
        }
        return b52Var.p() ? (cz2) this.c.r(yy2Var) : yy2Var;
    }

    public final String f(cz2 cz2Var) {
        b52 b52VarPeek = this.b.peek();
        while (this.c.u() == cz2Var && b52VarPeek.g()) {
            a(cz2Var);
            this.b.next();
            b52VarPeek = this.b.peek();
        }
        return b(cz2Var);
    }

    public String g(cz2 cz2Var) {
        if (!this.c.z(cz2Var)) {
            return null;
        }
        if (this.a.length() <= 0 && this.b.peek().W()) {
            if (this.c.u() == cz2Var) {
                return null;
            }
            this.c.pop();
            this.b.next();
        }
        return f(cz2Var);
    }

    public void h(cz2 cz2Var) {
        while (c(cz2Var) != null) {
        }
    }
}
