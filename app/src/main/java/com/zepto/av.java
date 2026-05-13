package com.zepto;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public class av {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final PendingIntent k;
    public final PendingIntent l;
    public final PendingIntent m;
    public final PendingIntent n;
    public boolean o = false;

    public av(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = num;
        this.f = i4;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.k = pendingIntent;
        this.l = pendingIntent2;
        this.m = pendingIntent3;
        this.n = pendingIntent4;
    }

    public static av h(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new av(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    public int a() {
        return this.b;
    }

    public Integer b() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public boolean d(int i) {
        return g(dv.c(i)) != null;
    }

    public boolean e(dv dvVar) {
        return g(dvVar) != null;
    }

    public int f() {
        return this.c;
    }

    public final PendingIntent g(dv dvVar) {
        if (dvVar.b() == 0) {
            PendingIntent pendingIntent = this.l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (k(dvVar)) {
                return this.n;
            }
            return null;
        }
        if (dvVar.b() == 1) {
            PendingIntent pendingIntent2 = this.k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (k(dvVar)) {
                return this.m;
            }
        }
        return null;
    }

    public final void i() {
        this.o = true;
    }

    public final boolean j() {
        return this.o;
    }

    public final boolean k(dv dvVar) {
        return dvVar.a() && this.i <= this.j;
    }
}
