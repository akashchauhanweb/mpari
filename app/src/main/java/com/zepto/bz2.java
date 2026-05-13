package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class bz2 {
    public static final String a;

    static {
        String strI = rn3.i("InputMerger");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"InputMerger\")");
        a = strI;
    }

    public static final zy2 a(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (zy2) objNewInstance;
        } catch (Exception e) {
            rn3.e().d(a, "Trouble instantiating " + className, e);
            return null;
        }
    }
}
