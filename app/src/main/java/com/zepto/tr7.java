package com.zepto;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class tr7 {
    public static final void a(View view, uh2 fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(k05.a, fullyDrawnReporterOwner);
    }
}
