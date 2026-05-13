package com.zepto;

import com.zepto.hl2;
import com.zepto.la3;
import com.zepto.pe4;
import java.io.Serializable;
import java.util.Stack;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class z20 implements Serializable, Cloneable {
    public n08 c;
    public final int e;
    public int f;
    public int g;
    public boolean h = false;
    public boolean i = false;

    public z20(int i) {
        this.e = i;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z20 clone() {
        z20 z20Var = new z20(this.e);
        z20Var.c = this.c;
        z20Var.f = this.f;
        z20Var.g = this.g;
        z20Var.h = this.h;
        z20Var.i = this.i;
        return z20Var;
    }

    public int b() {
        return (!this.h || this.i) ? IntCompanionObject.MAX_VALUE : this.f;
    }

    public int c() {
        return this.g;
    }

    public n08 d() {
        return this.c;
    }

    public void e(int i) {
        this.c = null;
        this.f = this.e;
        this.g = i;
        this.h = true;
        this.i = false;
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return this.h;
    }

    public void h(n08 n08Var) {
        this.c = n08Var;
        int iA = n08Var.a();
        this.f = iA;
        if (iA == this.e) {
            this.i = true;
        }
    }

    public void i(Stack stack, fu7 fu7Var, byte[] bArr, byte[] bArr2, pe4 pe4Var) {
        if (pe4Var == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.i || !this.h) {
            throw new IllegalStateException("finished or not initialized");
        }
        pe4 pe4Var2 = (pe4) ((pe4.b) ((pe4.b) ((pe4.b) new pe4.b().g(pe4Var.b())).h(pe4Var.c())).p(this.g).n(pe4Var.e()).o(pe4Var.f()).f(pe4Var.a())).l();
        la3 la3Var = (la3) ((la3.b) ((la3.b) new la3.b().g(pe4Var2.b())).h(pe4Var2.c())).n(this.g).l();
        hl2 hl2Var = (hl2) ((hl2.b) ((hl2.b) new hl2.b().g(pe4Var2.b())).h(pe4Var2.c())).n(this.g).k();
        fu7Var.h(fu7Var.g(bArr2, pe4Var2), bArr);
        n08 n08VarA = o08.a(fu7Var, fu7Var.e(pe4Var2), la3Var);
        while (!stack.isEmpty() && ((n08) stack.peek()).a() == n08VarA.a() && ((n08) stack.peek()).a() != this.e) {
            hl2 hl2Var2 = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var.b())).h(hl2Var.c())).m(hl2Var.e()).n((hl2Var.f() - 1) / 2).f(hl2Var.a())).k();
            n08 n08VarB = o08.b(fu7Var, (n08) stack.pop(), n08VarA, hl2Var2);
            n08 n08Var = new n08(n08VarB.a() + 1, n08VarB.b());
            hl2Var = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var2.b())).h(hl2Var2.c())).m(hl2Var2.e() + 1).n(hl2Var2.f()).f(hl2Var2.a())).k();
            n08VarA = n08Var;
        }
        n08 n08Var2 = this.c;
        if (n08Var2 == null) {
            this.c = n08VarA;
        } else if (n08Var2.a() == n08VarA.a()) {
            hl2 hl2Var3 = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var.b())).h(hl2Var.c())).m(hl2Var.e()).n((hl2Var.f() - 1) / 2).f(hl2Var.a())).k();
            n08VarA = new n08(this.c.a() + 1, o08.b(fu7Var, this.c, n08VarA, hl2Var3).b());
            this.c = n08VarA;
        } else {
            stack.push(n08VarA);
        }
        if (this.c.a() == this.e) {
            this.i = true;
        } else {
            this.f = n08VarA.a();
            this.g++;
        }
    }
}
