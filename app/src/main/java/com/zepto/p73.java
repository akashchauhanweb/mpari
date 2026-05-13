package com.zepto;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class p73 {
    public static String a() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
