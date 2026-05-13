package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wg2 extends qs7 {
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(sf2 fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        this.e = previousFragmentId;
    }
}
