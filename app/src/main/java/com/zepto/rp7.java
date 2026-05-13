package com.zepto;

import com.zepto.jx0;
import com.zepto.oi1;
import com.zepto.xu7;
import com.zepto.yw0;

/* JADX INFO: loaded from: classes.dex */
public class rp7 extends xu7 {
    public oi1 k;
    public bk1 l;

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

    public rp7(jx0 jx0Var) {
        super(jx0Var);
        oi1 oi1Var = new oi1(this);
        this.k = oi1Var;
        this.l = null;
        this.h.e = oi1.a.TOP;
        this.i.e = oi1.a.BOTTOM;
        oi1Var.e = oi1.a.BASELINE;
        this.f = 1;
    }

    @Override // com.zepto.xu7, com.zepto.ii1
    public void a(ii1 ii1Var) {
        float f;
        float fV;
        float fV2;
        int i;
        int i2 = a.a[this.j.ordinal()];
        if (i2 == 1) {
            p(ii1Var);
        } else if (i2 == 2) {
            o(ii1Var);
        } else if (i2 == 3) {
            jx0 jx0Var = this.b;
            n(ii1Var, jx0Var.P, jx0Var.R, 1);
            return;
        }
        bk1 bk1Var = this.e;
        if (bk1Var.c && !bk1Var.j && this.d == jx0.b.MATCH_CONSTRAINT) {
            jx0 jx0Var2 = this.b;
            int i3 = jx0Var2.x;
            if (i3 == 2) {
                jx0 jx0VarK = jx0Var2.K();
                if (jx0VarK != null) {
                    if (jx0VarK.f.e.j) {
                        this.e.d((int) ((r7.g * this.b.E) + 0.5f));
                    }
                }
            } else if (i3 == 3 && jx0Var2.e.e.j) {
                int iW = jx0Var2.w();
                if (iW == -1) {
                    jx0 jx0Var3 = this.b;
                    f = jx0Var3.e.e.g;
                    fV = jx0Var3.v();
                } else if (iW == 0) {
                    fV2 = r7.e.e.g * this.b.v();
                    i = (int) (fV2 + 0.5f);
                    this.e.d(i);
                } else if (iW != 1) {
                    i = 0;
                    this.e.d(i);
                } else {
                    jx0 jx0Var4 = this.b;
                    f = jx0Var4.e.e.g;
                    fV = jx0Var4.v();
                }
                fV2 = f / fV;
                i = (int) (fV2 + 0.5f);
                this.e.d(i);
            }
        }
        oi1 oi1Var = this.h;
        if (oi1Var.c) {
            oi1 oi1Var2 = this.i;
            if (oi1Var2.c) {
                if (oi1Var.j && oi1Var2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == jx0.b.MATCH_CONSTRAINT) {
                    jx0 jx0Var5 = this.b;
                    if (jx0Var5.w == 0 && !jx0Var5.k0()) {
                        oi1 oi1Var3 = (oi1) this.h.l.get(0);
                        oi1 oi1Var4 = (oi1) this.i.l.get(0);
                        int i4 = oi1Var3.g;
                        oi1 oi1Var5 = this.h;
                        int i5 = i4 + oi1Var5.f;
                        int i6 = oi1Var4.g + this.i.f;
                        oi1Var5.d(i5);
                        this.i.d(i6);
                        this.e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == jx0.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    oi1 oi1Var6 = (oi1) this.h.l.get(0);
                    int i7 = (((oi1) this.i.l.get(0)).g + this.i.f) - (oi1Var6.g + this.h.f);
                    bk1 bk1Var2 = this.e;
                    int i8 = bk1Var2.m;
                    if (i7 < i8) {
                        bk1Var2.d(i7);
                    } else {
                        bk1Var2.d(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    oi1 oi1Var7 = (oi1) this.h.l.get(0);
                    oi1 oi1Var8 = (oi1) this.i.l.get(0);
                    int i9 = oi1Var7.g + this.h.f;
                    int i10 = oi1Var8.g + this.i.f;
                    float fR = this.b.R();
                    if (oi1Var7 == oi1Var8) {
                        i9 = oi1Var7.g;
                        i10 = oi1Var8.g;
                        fR = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * fR)));
                    this.i.d(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // com.zepto.xu7
    public void d() {
        jx0 jx0VarK;
        jx0 jx0VarK2;
        jx0 jx0Var = this.b;
        if (jx0Var.a) {
            this.e.d(jx0Var.x());
        }
        if (!this.e.j) {
            this.d = this.b.T();
            if (this.b.Z()) {
                this.l = new a50(this);
            }
            jx0.b bVar = this.d;
            if (bVar != jx0.b.MATCH_CONSTRAINT) {
                if (bVar == jx0.b.MATCH_PARENT && (jx0VarK2 = this.b.K()) != null && jx0VarK2.T() == jx0.b.FIXED) {
                    int iX = (jx0VarK2.x() - this.b.P.f()) - this.b.R.f();
                    b(this.h, jx0VarK2.f.h, this.b.P.f());
                    b(this.i, jx0VarK2.f.i, -this.b.R.f());
                    this.e.d(iX);
                    return;
                }
                if (this.d == jx0.b.FIXED) {
                    this.e.d(this.b.x());
                }
            }
        } else if (this.d == jx0.b.MATCH_PARENT && (jx0VarK = this.b.K()) != null && jx0VarK.T() == jx0.b.FIXED) {
            b(this.h, jx0VarK.f.h, this.b.P.f());
            b(this.i, jx0VarK.f.i, -this.b.R.f());
            return;
        }
        bk1 bk1Var = this.e;
        boolean z = bk1Var.j;
        if (z) {
            jx0 jx0Var2 = this.b;
            if (jx0Var2.a) {
                yw0[] yw0VarArr = jx0Var2.W;
                yw0 yw0Var = yw0VarArr[2];
                yw0 yw0Var2 = yw0Var.f;
                if (yw0Var2 != null && yw0VarArr[3].f != null) {
                    if (jx0Var2.k0()) {
                        this.h.f = this.b.W[2].f();
                        this.i.f = -this.b.W[3].f();
                    } else {
                        oi1 oi1VarH = h(this.b.W[2]);
                        if (oi1VarH != null) {
                            b(this.h, oi1VarH, this.b.W[2].f());
                        }
                        oi1 oi1VarH2 = h(this.b.W[3]);
                        if (oi1VarH2 != null) {
                            b(this.i, oi1VarH2, -this.b.W[3].f());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.Z()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                }
                if (yw0Var2 != null) {
                    oi1 oi1VarH3 = h(yw0Var);
                    if (oi1VarH3 != null) {
                        b(this.h, oi1VarH3, this.b.W[2].f());
                        b(this.i, this.h, this.e.g);
                        if (this.b.Z()) {
                            b(this.k, this.h, this.b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                yw0 yw0Var3 = yw0VarArr[3];
                if (yw0Var3.f != null) {
                    oi1 oi1VarH4 = h(yw0Var3);
                    if (oi1VarH4 != null) {
                        b(this.i, oi1VarH4, -this.b.W[3].f());
                        b(this.h, this.i, -this.e.g);
                    }
                    if (this.b.Z()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                }
                yw0 yw0Var4 = yw0VarArr[4];
                if (yw0Var4.f != null) {
                    oi1 oi1VarH5 = h(yw0Var4);
                    if (oi1VarH5 != null) {
                        b(this.k, oi1VarH5, 0);
                        b(this.h, this.k, -this.b.p());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                if ((jx0Var2 instanceof xl2) || jx0Var2.K() == null || this.b.o(yw0.b.CENTER).f != null) {
                    return;
                }
                b(this.h, this.b.K().f.h, this.b.Y());
                b(this.i, this.h, this.e.g);
                if (this.b.Z()) {
                    b(this.k, this.h, this.b.p());
                    return;
                }
                return;
            }
        }
        if (z || this.d != jx0.b.MATCH_CONSTRAINT) {
            bk1Var.b(this);
        } else {
            jx0 jx0Var3 = this.b;
            int i = jx0Var3.x;
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
            } else if (i == 3 && !jx0Var3.k0()) {
                jx0 jx0Var4 = this.b;
                if (jx0Var4.w != 3) {
                    bk1 bk1Var4 = jx0Var4.e.e;
                    this.e.l.add(bk1Var4);
                    bk1Var4.k.add(this.e);
                    bk1 bk1Var5 = this.e;
                    bk1Var5.b = true;
                    bk1Var5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        jx0 jx0Var5 = this.b;
        yw0[] yw0VarArr2 = jx0Var5.W;
        yw0 yw0Var5 = yw0VarArr2[2];
        yw0 yw0Var6 = yw0Var5.f;
        if (yw0Var6 != null && yw0VarArr2[3].f != null) {
            if (jx0Var5.k0()) {
                this.h.f = this.b.W[2].f();
                this.i.f = -this.b.W[3].f();
            } else {
                oi1 oi1VarH6 = h(this.b.W[2]);
                oi1 oi1VarH7 = h(this.b.W[3]);
                if (oi1VarH6 != null) {
                    oi1VarH6.b(this);
                }
                if (oi1VarH7 != null) {
                    oi1VarH7.b(this);
                }
                this.j = xu7.b.CENTER;
            }
            if (this.b.Z()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (yw0Var6 != null) {
            oi1 oi1VarH8 = h(yw0Var5);
            if (oi1VarH8 != null) {
                b(this.h, oi1VarH8, this.b.W[2].f());
                c(this.i, this.h, 1, this.e);
                if (this.b.Z()) {
                    c(this.k, this.h, 1, this.l);
                }
                jx0.b bVar2 = this.d;
                jx0.b bVar3 = jx0.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.v() > 0.0f) {
                    gr2 gr2Var = this.b.e;
                    if (gr2Var.d == bVar3) {
                        gr2Var.e.k.add(this.e);
                        this.e.l.add(this.b.e.e);
                        this.e.a = this;
                    }
                }
            }
        } else {
            yw0 yw0Var7 = yw0VarArr2[3];
            if (yw0Var7.f != null) {
                oi1 oi1VarH9 = h(yw0Var7);
                if (oi1VarH9 != null) {
                    b(this.i, oi1VarH9, -this.b.W[3].f());
                    c(this.h, this.i, -1, this.e);
                    if (this.b.Z()) {
                        c(this.k, this.h, 1, this.l);
                    }
                }
            } else {
                yw0 yw0Var8 = yw0VarArr2[4];
                if (yw0Var8.f != null) {
                    oi1 oi1VarH10 = h(yw0Var8);
                    if (oi1VarH10 != null) {
                        b(this.k, oi1VarH10, 0);
                        c(this.h, this.k, -1, this.l);
                        c(this.i, this.h, 1, this.e);
                    }
                } else if (!(jx0Var5 instanceof xl2) && jx0Var5.K() != null) {
                    b(this.h, this.b.K().f.h, this.b.Y());
                    c(this.i, this.h, 1, this.e);
                    if (this.b.Z()) {
                        c(this.k, this.h, 1, this.l);
                    }
                    jx0.b bVar4 = this.d;
                    jx0.b bVar5 = jx0.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.v() > 0.0f) {
                        gr2 gr2Var2 = this.b.e;
                        if (gr2Var2.d == bVar5) {
                            gr2Var2.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // com.zepto.xu7
    public void e() {
        oi1 oi1Var = this.h;
        if (oi1Var.j) {
            this.b.n1(oi1Var.g);
        }
    }

    @Override // com.zepto.xu7
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.zepto.xu7
    public boolean m() {
        return this.d != jx0.b.MATCH_CONSTRAINT || this.b.x == 0;
    }

    public void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.t();
    }
}
