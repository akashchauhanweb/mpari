package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class mw3 {
    public static final mw3 d = new mw3(new int[]{0, 0, 0}, 0, "TERMINATOR");
    public static final mw3 e = new mw3(new int[]{10, 12, 14}, 1, "NUMERIC");
    public static final mw3 f = new mw3(new int[]{9, 11, 13}, 2, "ALPHANUMERIC");
    public static final mw3 g = new mw3(new int[]{0, 0, 0}, 3, "STRUCTURED_APPEND");
    public static final mw3 h = new mw3(new int[]{8, 16, 16}, 4, "BYTE");
    public static final mw3 i = new mw3(null, 7, "ECI");
    public static final mw3 j = new mw3(new int[]{8, 10, 12}, 8, "KANJI");
    public static final mw3 k = new mw3(null, 5, "FNC1_FIRST_POSITION");
    public static final mw3 l = new mw3(null, 9, "FNC1_SECOND_POSITION");
    public final int[] a;
    public final int b;
    public final String c;

    public mw3(int[] iArr, int i2, String str) {
        this.a = iArr;
        this.b = i2;
        this.c = str;
    }

    public int a() {
        return this.b;
    }

    public int b(hp7 hp7Var) {
        if (this.a == null) {
            throw new IllegalArgumentException("Character count doesn't apply to this mode");
        }
        int iF = hp7Var.f();
        return this.a[iF <= 9 ? (char) 0 : iF <= 26 ? (char) 1 : (char) 2];
    }

    public String toString() {
        return this.c;
    }
}
