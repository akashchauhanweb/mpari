package com.zepto;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class vz2 {
    public static final vz2 e = new vz2(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public vz2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static vz2 a(vz2 vz2Var, vz2 vz2Var2) {
        return b(Math.max(vz2Var.a, vz2Var2.a), Math.max(vz2Var.b, vz2Var2.b), Math.max(vz2Var.c, vz2Var2.c), Math.max(vz2Var.d, vz2Var2.d));
    }

    public static vz2 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new vz2(i, i2, i3, i4);
    }

    public static vz2 c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static vz2 d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vz2.class != obj.getClass()) {
            return false;
        }
        vz2 vz2Var = (vz2) obj;
        return this.d == vz2Var.d && this.a == vz2Var.a && this.c == vz2Var.c && this.b == vz2Var.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
