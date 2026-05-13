package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class sn3 {
    public static sn3 a(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new ip(cls.getSimpleName()) : new c63(cls.getSimpleName());
    }

    public abstract void b(String str);
}
