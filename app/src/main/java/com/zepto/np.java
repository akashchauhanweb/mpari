package com.zepto;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class np extends zq7 {
    public final Application d;

    public np(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.d = application;
    }
}
