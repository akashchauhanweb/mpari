package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oi1 implements ii1 {
    public xu7 d;
    public int f;
    public int g;
    public ii1 a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public bk1 i = null;
    public boolean j = false;
    public List k = new ArrayList();
    public List l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public oi1(xu7 xu7Var) {
        this.d = xu7Var;
    }

    @Override // com.zepto.ii1
    public void a(ii1 ii1Var) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            if (!((oi1) it.next()).j) {
                return;
            }
        }
        this.c = true;
        ii1 ii1Var2 = this.a;
        if (ii1Var2 != null) {
            ii1Var2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        oi1 oi1Var = null;
        int i = 0;
        for (oi1 oi1Var2 : this.l) {
            if (!(oi1Var2 instanceof bk1)) {
                i++;
                oi1Var = oi1Var2;
            }
        }
        if (oi1Var != null && i == 1 && oi1Var.j) {
            bk1 bk1Var = this.i;
            if (bk1Var != null) {
                if (!bk1Var.j) {
                    return;
                } else {
                    this.f = this.h * bk1Var.g;
                }
            }
            d(oi1Var.g + this.f);
        }
        ii1 ii1Var3 = this.a;
        if (ii1Var3 != null) {
            ii1Var3.a(this);
        }
    }

    public void b(ii1 ii1Var) {
        this.k.add(ii1Var);
        if (this.j) {
            ii1Var.a(ii1Var);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (ii1 ii1Var : this.k) {
            ii1Var.a(ii1Var);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.t());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
