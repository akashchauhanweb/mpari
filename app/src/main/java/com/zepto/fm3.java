package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class fm3 {
    public static ClassLoader a() {
        return fm3.class.getClassLoader();
    }

    public static ClassLoader b() {
        return Thread.currentThread().getContextClassLoader();
    }

    public Class c(String str) {
        ClassLoader classLoaderB = b();
        if (classLoaderB == null) {
            classLoaderB = a();
        }
        return classLoaderB.loadClass(str);
    }
}
