package com.zepto;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class aq {
    public static final aq a = new aq();

    public final String a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
