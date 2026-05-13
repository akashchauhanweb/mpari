package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iy4 {
    public static String a(int i) {
        if (i == 5) {
            return "qTESLA-p-I";
        }
        if (i == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException("unknown security category: " + i);
    }

    public static int b(int i) {
        if (i == 5) {
            return 5224;
        }
        if (i == 6) {
            return 12392;
        }
        throw new IllegalArgumentException("unknown security category: " + i);
    }

    public static int c(int i) {
        if (i == 5) {
            return 14880;
        }
        if (i == 6) {
            return 38432;
        }
        throw new IllegalArgumentException("unknown security category: " + i);
    }
}
