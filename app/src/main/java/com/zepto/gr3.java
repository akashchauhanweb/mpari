package com.zepto;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class gr3 {
    public static final gr3 j = new gr3(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final gr3 k = new gr3(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final gr3 l = new gr3(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final gr3 m = new gr3(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public double a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;

    public gr3(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d5;
        this.b = d6;
        this.c = d7;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d8;
        this.i = d9;
    }

    public static gr3 a(ByteBuffer byteBuffer) {
        return b(m13.d(byteBuffer), m13.d(byteBuffer), m13.c(byteBuffer), m13.d(byteBuffer), m13.d(byteBuffer), m13.c(byteBuffer), m13.d(byteBuffer), m13.d(byteBuffer), m13.c(byteBuffer));
    }

    public static gr3 b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return new gr3(d, d2, d4, d5, d3, d6, d9, d7, d8);
    }

    public void c(ByteBuffer byteBuffer) {
        n13.b(byteBuffer, this.d);
        n13.b(byteBuffer, this.e);
        n13.a(byteBuffer, this.a);
        n13.b(byteBuffer, this.f);
        n13.b(byteBuffer, this.g);
        n13.a(byteBuffer, this.b);
        n13.b(byteBuffer, this.h);
        n13.b(byteBuffer, this.i);
        n13.a(byteBuffer, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gr3 gr3Var = (gr3) obj;
        return Double.compare(gr3Var.d, this.d) == 0 && Double.compare(gr3Var.e, this.e) == 0 && Double.compare(gr3Var.f, this.f) == 0 && Double.compare(gr3Var.g, this.g) == 0 && Double.compare(gr3Var.h, this.h) == 0 && Double.compare(gr3Var.i, this.i) == 0 && Double.compare(gr3Var.a, this.a) == 0 && Double.compare(gr3Var.b, this.b) == 0 && Double.compare(gr3Var.c, this.c) == 0;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.e);
        int i4 = (i3 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f);
        int i5 = (i4 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.g);
        int i6 = (i5 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.h);
        int i7 = (i6 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (i7 * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.a + ", v=" + this.b + ", w=" + this.c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f + ", d=" + this.g + ", tx=" + this.h + ", ty=" + this.i + '}';
    }
}
