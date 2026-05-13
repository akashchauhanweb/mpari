package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa6 {
    public static final ca6 a(ay7 generationalId, int i) {
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        return new ca6(generationalId.b(), generationalId.a(), i);
    }
}
