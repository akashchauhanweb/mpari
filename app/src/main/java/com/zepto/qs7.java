package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class qs7 extends RuntimeException {
    public final sf2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs7(sf2 fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.c = fragment;
    }

    public final sf2 a() {
        return this.c;
    }
}
