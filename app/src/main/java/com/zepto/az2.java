package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class az2 {
    public abstract zy2 a(String str);

    public final zy2 b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        zy2 zy2VarA = a(className);
        return zy2VarA == null ? bz2.a(className) : zy2VarA;
    }
}
