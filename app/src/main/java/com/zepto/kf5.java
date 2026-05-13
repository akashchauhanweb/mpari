package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class kf5 {
    public static int h;
    public xu7 c;
    public xu7 d;
    public int f;
    public int g;
    public int a = 0;
    public boolean b = false;
    public ArrayList e = new ArrayList();

    public kf5(xu7 xu7Var, int i) {
        this.c = null;
        this.d = null;
        int i2 = h;
        this.f = i2;
        h = i2 + 1;
        this.c = xu7Var;
        this.d = xu7Var;
        this.g = i;
    }

    public void a(xu7 xu7Var) {
        this.e.add(xu7Var);
        this.d = xu7Var;
    }

    public long b(kx0 kx0Var, int i) {
        long j;
        int i2;
        xu7 xu7Var = this.c;
        if (xu7Var instanceof jc0) {
            if (((jc0) xu7Var).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(xu7Var instanceof gr2)) {
                return 0L;
            }
        } else if (!(xu7Var instanceof rp7)) {
            return 0L;
        }
        oi1 oi1Var = (i == 0 ? kx0Var.e : kx0Var.f).h;
        oi1 oi1Var2 = (i == 0 ? kx0Var.e : kx0Var.f).i;
        boolean zContains = xu7Var.h.l.contains(oi1Var);
        boolean zContains2 = this.c.i.l.contains(oi1Var2);
        long j2 = this.c.j();
        if (zContains && zContains2) {
            long jD = d(this.c.h, 0L);
            long jC = c(this.c.i, 0L);
            long j3 = jD - j2;
            xu7 xu7Var2 = this.c;
            int i3 = xu7Var2.i.f;
            if (j3 >= (-i3)) {
                j3 += (long) i3;
            }
            int i4 = xu7Var2.h.f;
            long j4 = ((-jC) - j2) - ((long) i4);
            if (j4 >= i4) {
                j4 -= (long) i4;
            }
            float fQ = xu7Var2.b.q(i);
            float f = fQ > 0.0f ? (long) ((j4 / fQ) + (j3 / (1.0f - fQ))) : 0L;
            long j5 = ((long) ((f * fQ) + 0.5f)) + j2 + ((long) ((f * (1.0f - fQ)) + 0.5f));
            xu7 xu7Var3 = this.c;
            j = ((long) xu7Var3.h.f) + j5;
            i2 = xu7Var3.i.f;
        } else {
            if (zContains) {
                return Math.max(d(this.c.h, r12.f), ((long) this.c.h.f) + j2);
            }
            if (zContains2) {
                return Math.max(-c(this.c.i, r12.f), ((long) (-this.c.i.f)) + j2);
            }
            xu7 xu7Var4 = this.c;
            j = ((long) xu7Var4.h.f) + xu7Var4.j();
            i2 = this.c.i.f;
        }
        return j - ((long) i2);
    }

    public final long c(oi1 oi1Var, long j) {
        xu7 xu7Var = oi1Var.d;
        if (xu7Var instanceof yl2) {
            return j;
        }
        int size = oi1Var.k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            ii1 ii1Var = (ii1) oi1Var.k.get(i);
            if (ii1Var instanceof oi1) {
                oi1 oi1Var2 = (oi1) ii1Var;
                if (oi1Var2.d != xu7Var) {
                    jMin = Math.min(jMin, c(oi1Var2, ((long) oi1Var2.f) + j));
                }
            }
        }
        if (oi1Var != xu7Var.i) {
            return jMin;
        }
        long j2 = j - xu7Var.j();
        return Math.min(Math.min(jMin, c(xu7Var.h, j2)), j2 - ((long) xu7Var.h.f));
    }

    public final long d(oi1 oi1Var, long j) {
        xu7 xu7Var = oi1Var.d;
        if (xu7Var instanceof yl2) {
            return j;
        }
        int size = oi1Var.k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            ii1 ii1Var = (ii1) oi1Var.k.get(i);
            if (ii1Var instanceof oi1) {
                oi1 oi1Var2 = (oi1) ii1Var;
                if (oi1Var2.d != xu7Var) {
                    jMax = Math.max(jMax, d(oi1Var2, ((long) oi1Var2.f) + j));
                }
            }
        }
        if (oi1Var != xu7Var.h) {
            return jMax;
        }
        long j2 = j + xu7Var.j();
        return Math.max(Math.max(jMax, d(xu7Var.i, j2)), j2 - ((long) xu7Var.i.f));
    }
}
