package com.zepto;

import com.zepto.jx0;
import com.zepto.yw0;

/* JADX INFO: loaded from: classes.dex */
public abstract class xu7 implements ii1 {
    public int a;
    public jx0 b;
    public kf5 c;
    public jx0.b d;
    public bk1 e = new bk1(this);
    public int f = 0;
    public boolean g = false;
    public oi1 h = new oi1(this);
    public oi1 i = new oi1(this);
    public b j = b.NONE;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[yw0.b.values().length];
            a = iArr;
            try {
                iArr[yw0.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[yw0.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[yw0.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[yw0.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[yw0.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public xu7(jx0 jx0Var) {
        this.b = jx0Var;
    }

    @Override // com.zepto.ii1
    public abstract void a(ii1 ii1Var);

    public final void b(oi1 oi1Var, oi1 oi1Var2, int i) {
        oi1Var.l.add(oi1Var2);
        oi1Var.f = i;
        oi1Var2.k.add(oi1Var);
    }

    public final void c(oi1 oi1Var, oi1 oi1Var2, int i, bk1 bk1Var) {
        oi1Var.l.add(oi1Var2);
        oi1Var.l.add(this.e);
        oi1Var.h = i;
        oi1Var.i = bk1Var;
        oi1Var2.k.add(oi1Var);
        bk1Var.k.add(oi1Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            jx0 jx0Var = this.b;
            int i3 = jx0Var.A;
            iMax = Math.max(jx0Var.z, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            jx0 jx0Var2 = this.b;
            int i4 = jx0Var2.D;
            iMax = Math.max(jx0Var2.C, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public final oi1 h(yw0 yw0Var) {
        yw0 yw0Var2 = yw0Var.f;
        if (yw0Var2 == null) {
            return null;
        }
        jx0 jx0Var = yw0Var2.d;
        int i = a.a[yw0Var2.e.ordinal()];
        if (i == 1) {
            return jx0Var.e.h;
        }
        if (i == 2) {
            return jx0Var.e.i;
        }
        if (i == 3) {
            return jx0Var.f.h;
        }
        if (i == 4) {
            return jx0Var.f.k;
        }
        if (i != 5) {
            return null;
        }
        return jx0Var.f.i;
    }

    public final oi1 i(yw0 yw0Var, int i) {
        yw0 yw0Var2 = yw0Var.f;
        if (yw0Var2 == null) {
            return null;
        }
        jx0 jx0Var = yw0Var2.d;
        xu7 xu7Var = i == 0 ? jx0Var.e : jx0Var.f;
        int i2 = a.a[yw0Var2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return xu7Var.i;
        }
        return xu7Var.h;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    public final void l(int i, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            this.e.d(g(i2, i));
            return;
        }
        if (i3 == 1) {
            this.e.d(Math.min(g(this.e.m, i), i2));
            return;
        }
        if (i3 == 2) {
            jx0 jx0VarK = this.b.K();
            if (jx0VarK != null) {
                if ((i == 0 ? jx0VarK.e : jx0VarK.f).e.j) {
                    jx0 jx0Var = this.b;
                    this.e.d(g((int) ((r9.g * (i == 0 ? jx0Var.B : jx0Var.E)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        jx0 jx0Var2 = this.b;
        xu7 xu7Var = jx0Var2.e;
        jx0.b bVar = xu7Var.d;
        jx0.b bVar2 = jx0.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && xu7Var.a == 3) {
            rp7 rp7Var = jx0Var2.f;
            if (rp7Var.d == bVar2 && rp7Var.a == 3) {
                return;
            }
        }
        if (i == 0) {
            xu7Var = jx0Var2.f;
        }
        if (xu7Var.e.j) {
            float fV = jx0Var2.v();
            this.e.d(i == 1 ? (int) ((xu7Var.e.g / fV) + 0.5f) : (int) ((fV * xu7Var.e.g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(ii1 ii1Var, yw0 yw0Var, yw0 yw0Var2, int i) {
        oi1 oi1VarH = h(yw0Var);
        oi1 oi1VarH2 = h(yw0Var2);
        if (oi1VarH.j && oi1VarH2.j) {
            int iF = oi1VarH.g + yw0Var.f();
            int iF2 = oi1VarH2.g - yw0Var2.f();
            int i2 = iF2 - iF;
            if (!this.e.j && this.d == jx0.b.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            bk1 bk1Var = this.e;
            if (bk1Var.j) {
                if (bk1Var.g == i2) {
                    this.h.d(iF);
                    this.i.d(iF2);
                    return;
                }
                jx0 jx0Var = this.b;
                float fY = i == 0 ? jx0Var.y() : jx0Var.R();
                if (oi1VarH == oi1VarH2) {
                    iF = oi1VarH.g;
                    iF2 = oi1VarH2.g;
                    fY = 0.5f;
                }
                this.h.d((int) (iF + 0.5f + (((iF2 - iF) - this.e.g) * fY)));
                this.i.d(this.h.g + this.e.g);
            }
        }
    }

    public void o(ii1 ii1Var) {
    }

    public void p(ii1 ii1Var) {
    }
}
