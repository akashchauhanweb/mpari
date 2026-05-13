package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qz7 extends qs7 {
    public final sf2 e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz7(sf2 fragment, sf2 expectedParentFragment, int i) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i + " without using parent's childFragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        this.e = expectedParentFragment;
        this.f = i;
    }
}
