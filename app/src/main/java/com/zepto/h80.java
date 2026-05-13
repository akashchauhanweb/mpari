package com.zepto;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h80 {
    public static final h80 a = new h80();

    @JvmStatic
    public static final void a(Bundle bundle, String key, Size size) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSize(key, size);
    }

    @JvmStatic
    public static final void b(Bundle bundle, String key, SizeF sizeF) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
