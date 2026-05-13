package com.zepto;

import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class z94 {
    public final rj4 a;
    public final kf2 b;
    public final Set c;
    public final boolean d;

    public z94(Writer writer, hf2 hf2Var) {
        this(writer, hf2Var, false);
    }

    public void a(oj4 oj4Var) {
        if (this.a.contains(oj4Var)) {
            oj4 oj4VarT = this.a.T();
            if (!b(oj4VarT)) {
                k(oj4VarT);
            }
            while (this.a.T() != oj4Var) {
                f(this.a.u());
            }
            f(oj4Var);
            this.a.u();
        }
    }

    public boolean b(oj4 oj4Var) {
        return !this.c.contains(oj4Var);
    }

    public final void c(oj4 oj4Var) throws t94, IOException {
        w94<String> w94VarC = oj4Var.c();
        for (String str : w94VarC) {
            oj4 oj4Var2 = (oj4) w94VarC.get(str);
            this.b.n(str, oj4Var2.getValue(), oj4Var2.h(this.d));
        }
        this.c.remove(oj4Var);
    }

    public final void d(oj4 oj4Var) {
        String strF = oj4Var.f();
        if (strF != null) {
            this.b.o(strF);
        }
    }

    public oj4 e(oj4 oj4Var, String str) throws t94, IOException {
        if (this.a.isEmpty()) {
            return j(oj4Var, str);
        }
        if (!this.a.contains(oj4Var)) {
            return null;
        }
        oj4 oj4VarT = this.a.T();
        if (!b(oj4VarT)) {
            k(oj4VarT);
        }
        while (this.a.T() != oj4Var) {
            f(this.a.u());
        }
        if (!this.a.isEmpty()) {
            l(oj4Var);
        }
        return j(oj4Var, str);
    }

    public final void f(oj4 oj4Var) throws IOException {
        String name = oj4Var.getName();
        String strH = oj4Var.h(this.d);
        if (oj4Var.getValue() != null) {
            l(oj4Var);
        }
        if (name != null) {
            this.b.p(name, strH);
            this.b.g();
        }
    }

    public final void g(oj4 oj4Var) throws IOException {
        String strH = oj4Var.h(this.d);
        String name = oj4Var.getName();
        if (name != null) {
            this.b.s(name, strH);
        }
    }

    public final void h(oj4 oj4Var) throws t94, IOException {
        q14<String> q14VarE = oj4Var.e();
        for (String str : q14VarE) {
            this.b.q(str, q14VarE.U(str));
        }
    }

    public oj4 i() throws IOException {
        lj4 lj4Var = new lj4(this, this.a);
        if (this.a.isEmpty()) {
            this.b.r();
        }
        return lj4Var;
    }

    public final oj4 j(oj4 oj4Var, String str) throws t94 {
        mj4 mj4Var = new mj4(oj4Var, this, str);
        if (str != null) {
            return this.a.O(mj4Var);
        }
        throw new t94("Can not have a null name");
    }

    public final void k(oj4 oj4Var) throws t94, IOException {
        d(oj4Var);
        g(oj4Var);
        c(oj4Var);
        h(oj4Var);
    }

    public final void l(oj4 oj4Var) throws IOException {
        lw3 lw3VarM = oj4Var.m();
        String value = oj4Var.getValue();
        if (value != null) {
            for (oj4 oj4Var2 : this.a) {
                if (lw3VarM != lw3.INHERIT) {
                    break;
                } else {
                    lw3VarM = oj4Var2.m();
                }
            }
            this.b.t(value, lw3VarM);
        }
        oj4Var.i(null);
    }

    public z94(Writer writer, hf2 hf2Var, boolean z) {
        this.b = new kf2(writer, hf2Var);
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.a = new rj4(hashSet);
        this.d = z;
    }
}
