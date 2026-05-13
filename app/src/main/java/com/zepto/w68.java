package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class w68 {
    public static int a(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        iu4.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
        return i;
    }

    public static String b(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
