package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class w86 {
    public static int a() {
        Integer numA = ft6.a();
        if (numA != null) {
            return numA.intValue();
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
