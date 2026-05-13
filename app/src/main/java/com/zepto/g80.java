package com.zepto;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g80 {
    public static final g80 a = new g80();

    @JvmStatic
    public static final void a(Bundle bundle, String key, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
