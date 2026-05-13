package com.zepto;

import com.zepto.oi1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class yl2 extends xu7 {
    public yl2(jx0 jx0Var) {
        super(jx0Var);
    }

    private void q(oi1 oi1Var) {
        this.h.k.add(oi1Var);
        oi1Var.l.add(this.h);
    }

    @Override // com.zepto.xu7, com.zepto.ii1
    public void a(ii1 ii1Var) {
        a40 a40Var = (a40) this.b;
        int iV1 = a40Var.v1();
        Iterator it = this.h.l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = ((oi1) it.next()).g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iV1 == 0 || iV1 == 2) {
            this.h.d(i2 + a40Var.w1());
        } else {
            this.h.d(i + a40Var.w1());
        }
    }

    @Override // com.zepto.xu7
    public void d() {
        jx0 jx0Var = this.b;
        if (jx0Var instanceof a40) {
            this.h.b = true;
            a40 a40Var = (a40) jx0Var;
            int iV1 = a40Var.v1();
            boolean zU1 = a40Var.u1();
            int i = 0;
            if (iV1 == 0) {
                this.h.e = oi1.a.LEFT;
                while (i < a40Var.M0) {
                    jx0 jx0Var2 = a40Var.L0[i];
                    if (zU1 || jx0Var2.V() != 8) {
                        oi1 oi1Var = jx0Var2.e.h;
                        oi1Var.k.add(this.h);
                        this.h.l.add(oi1Var);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (iV1 == 1) {
                this.h.e = oi1.a.RIGHT;
                while (i < a40Var.M0) {
                    jx0 jx0Var3 = a40Var.L0[i];
                    if (zU1 || jx0Var3.V() != 8) {
                        oi1 oi1Var2 = jx0Var3.e.i;
                        oi1Var2.k.add(this.h);
                        this.h.l.add(oi1Var2);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (iV1 == 2) {
                this.h.e = oi1.a.TOP;
                while (i < a40Var.M0) {
                    jx0 jx0Var4 = a40Var.L0[i];
                    if (zU1 || jx0Var4.V() != 8) {
                        oi1 oi1Var3 = jx0Var4.f.h;
                        oi1Var3.k.add(this.h);
                        this.h.l.add(oi1Var3);
                    }
                    i++;
                }
                q(this.b.f.h);
                q(this.b.f.i);
                return;
            }
            if (iV1 != 3) {
                return;
            }
            this.h.e = oi1.a.BOTTOM;
            while (i < a40Var.M0) {
                jx0 jx0Var5 = a40Var.L0[i];
                if (zU1 || jx0Var5.V() != 8) {
                    oi1 oi1Var4 = jx0Var5.f.i;
                    oi1Var4.k.add(this.h);
                    this.h.l.add(oi1Var4);
                }
                i++;
            }
            q(this.b.f.h);
            q(this.b.f.i);
        }
    }

    @Override // com.zepto.xu7
    public void e() {
        jx0 jx0Var = this.b;
        if (jx0Var instanceof a40) {
            int iV1 = ((a40) jx0Var).v1();
            if (iV1 == 0 || iV1 == 1) {
                this.b.m1(this.h.g);
            } else {
                this.b.n1(this.h.g);
            }
        }
    }

    @Override // com.zepto.xu7
    public void f() {
        this.c = null;
        this.h.c();
    }

    @Override // com.zepto.xu7
    public boolean m() {
        return false;
    }
}
