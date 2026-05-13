package com.zepto;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pz7 extends qs7 {
    public final ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz7(sf2 fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        this.e = container;
    }
}
