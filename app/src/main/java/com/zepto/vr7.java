package com.zepto;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class vr7 {
    public static final void a(View view, gg4 onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(k05.b, onBackPressedDispatcherOwner);
    }
}
