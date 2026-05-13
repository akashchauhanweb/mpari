package com.zepto;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ch2 extends qs7 {
    public final ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch2(sf2 fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.e = viewGroup;
    }
}
