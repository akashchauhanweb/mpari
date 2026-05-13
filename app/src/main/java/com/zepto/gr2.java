package com.zepto;

import com.zepto.jx0;
import com.zepto.oi1;
import com.zepto.xu7;
import com.zepto.yw0;

/* JADX INFO: loaded from: classes.dex */
public class gr2 extends xu7 {
    public static int[] k = new int[2];

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xu7.b.values().length];
            a = iArr;
            try {
                iArr[xu7.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[xu7.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[xu7.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public gr2(jx0 jx0Var) {
        super(jx0Var);
        this.h.e = oi1.a.LEFT;
        this.i.e = oi1.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    @Override // com.zepto.xu7, com.zepto.ii1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.zepto.ii1 r17) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.gr2.a(com.zepto.ii1):void");
    }

    @Override // com.zepto.xu7
    public void d() {
        jx0 jx0VarK;
        jx0 jx0VarK2;
        jx0 jx0Var = this.b;
        if (jx0Var.a) {
            this.e.d(jx0Var.W());
        }
        if (this.e.j) {
            jx0.b bVar = this.d;
            jx0.b bVar2 = jx0.b.MATCH_PARENT;
            if (bVar == bVar2 && (jx0VarK = this.b.K()) != null && (jx0VarK.A() == jx0.b.FIXED || jx0VarK.A() == bVar2)) {
                b(this.h, jx0VarK.e.h, this.b.O.f());
                b(this.i, jx0VarK.e.i, -this.b.Q.f());
                return;
            }
        } else {
            jx0.b bVarA = this.b.A();
            this.d = bVarA;
            if (bVarA != jx0.b.MATCH_CONSTRAINT) {
                jx0.b bVar3 = jx0.b.MATCH_PARENT;
                if (bVarA == bVar3 && (jx0VarK2 = this.b.K()) != null && (jx0VarK2.A() == jx0.b.FIXED || jx0VarK2.A() == bVar3)) {
                    int iW = (jx0VarK2.W() - this.b.O.f()) - this.b.Q.f();
                    b(this.h, jx0VarK2.e.h, this.b.O.f());
                    b(this.i, jx0VarK2.e.i, -this.b.Q.f());
                    this.e.d(iW);
                    return;
                }
                if (this.d == jx0.b.FIXED) {
                    this.e.d(this.b.W());
                }
            }
        }
        bk1 bk1Var = this.e;
        if (bk1Var.j) {
            jx0 jx0Var2 = this.b;
            if (jx0Var2.a) {
                yw0[] yw0VarArr = jx0Var2.W;
                yw0 yw0Var = yw0VarArr[0];
                yw0 yw0Var2 = yw0Var.f;
                if (yw0Var2 != null && yw0VarArr[1].f != null) {
                    if (jx0Var2.i0()) {
                        this.h.f = this.b.W[0].f();
                        this.i.f = -this.b.W[1].f();
                        return;
                    }
                    oi1 oi1VarH = h(this.b.W[0]);
                    if (oi1VarH != null) {
                        b(this.h, oi1VarH, this.b.W[0].f());
                    }
                    oi1 oi1VarH2 = h(this.b.W[1]);
                    if (oi1VarH2 != null) {
                        b(this.i, oi1VarH2, -this.b.W[1].f());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (yw0Var2 != null) {
                    oi1 oi1VarH3 = h(yw0Var);
                    if (oi1VarH3 != null) {
                        b(this.h, oi1VarH3, this.b.W[0].f());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                yw0 yw0Var3 = yw0VarArr[1];
                if (yw0Var3.f != null) {
                    oi1 oi1VarH4 = h(yw0Var3);
                    if (oi1VarH4 != null) {
                        b(this.i, oi1VarH4, -this.b.W[1].f());
                        b(this.h, this.i, -this.e.g);
                        return;
                    }
                    return;
                }
                if ((jx0Var2 instanceof xl2) || jx0Var2.K() == null || this.b.o(yw0.b.CENTER).f != null) {
                    return;
                }
                b(this.h, this.b.K().e.h, this.b.X());
                b(this.i, this.h, this.e.g);
                return;
            }
        }
        if (this.d == jx0.b.MATCH_CONSTRAINT) {
            jx0 jx0Var3 = this.b;
            int i = jx0Var3.w;
            if (i == 2) {
                jx0 jx0VarK3 = jx0Var3.K();
                if (jx0VarK3 != null) {
                    bk1 bk1Var2 = jx0VarK3.f.e;
                    this.e.l.add(bk1Var2);
                    bk1Var2.k.add(this.e);
                    bk1 bk1Var3 = this.e;
                    bk1Var3.b = true;
                    bk1Var3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3) {
                if (jx0Var3.x == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    rp7 rp7Var = jx0Var3.f;
                    rp7Var.h.a = this;
                    rp7Var.i.a = this;
                    bk1Var.a = this;
                    if (jx0Var3.k0()) {
                        this.e.l.add(this.b.f.e);
                        this.b.f.e.k.add(this.e);
                        rp7 rp7Var2 = this.b.f;
                        rp7Var2.e.a = this;
                        this.e.l.add(rp7Var2.h);
                        this.e.l.add(this.b.f.i);
                        this.b.f.h.k.add(this.e);
                        this.b.f.i.k.add(this.e);
                    } else if (this.b.i0()) {
                        this.b.f.e.l.add(this.e);
                        this.e.k.add(this.b.f.e);
                    } else {
                        this.b.f.e.l.add(this.e);
                    }
                } else {
                    bk1 bk1Var4 = jx0Var3.f.e;
                    bk1Var.l.add(bk1Var4);
                    bk1Var4.k.add(this.e);
                    this.b.f.h.k.add(this.e);
                    this.b.f.i.k.add(this.e);
                    bk1 bk1Var5 = this.e;
                    bk1Var5.b = true;
                    bk1Var5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        jx0 jx0Var4 = this.b;
        yw0[] yw0VarArr2 = jx0Var4.W;
        yw0 yw0Var4 = yw0VarArr2[0];
        yw0 yw0Var5 = yw0Var4.f;
        if (yw0Var5 != null && yw0VarArr2[1].f != null) {
            if (jx0Var4.i0()) {
                this.h.f = this.b.W[0].f();
                this.i.f = -this.b.W[1].f();
                return;
            }
            oi1 oi1VarH5 = h(this.b.W[0]);
            oi1 oi1VarH6 = h(this.b.W[1]);
            if (oi1VarH5 != null) {
                oi1VarH5.b(this);
            }
            if (oi1VarH6 != null) {
                oi1VarH6.b(this);
            }
            this.j = xu7.b.CENTER;
            return;
        }
        if (yw0Var5 != null) {
            oi1 oi1VarH7 = h(yw0Var4);
            if (oi1VarH7 != null) {
                b(this.h, oi1VarH7, this.b.W[0].f());
                c(this.i, this.h, 1, this.e);
                return;
            }
            return;
        }
        yw0 yw0Var6 = yw0VarArr2[1];
        if (yw0Var6.f != null) {
            oi1 oi1VarH8 = h(yw0Var6);
            if (oi1VarH8 != null) {
                b(this.i, oi1VarH8, -this.b.W[1].f());
                c(this.h, this.i, -1, this.e);
                return;
            }
            return;
        }
        if ((jx0Var4 instanceof xl2) || jx0Var4.K() == null) {
            return;
        }
        b(this.h, this.b.K().e.h, this.b.X());
        c(this.i, this.h, 1, this.e);
    }

    @Override // com.zepto.xu7
    public void e() {
        oi1 oi1Var = this.h;
        if (oi1Var.j) {
            this.b.m1(oi1Var.g);
        }
    }

    @Override // com.zepto.xu7
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.zepto.xu7
    public boolean m() {
        return this.d != jx0.b.MATCH_CONSTRAINT || this.b.w == 0;
    }

    public final void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.t();
    }
}
