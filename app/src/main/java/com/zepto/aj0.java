package com.zepto;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class aj0 {
    public static final aj0 a = new aj0();

    public final boolean a(Context context) {
        Intrinsics.checkNotNull(context);
        return yy0.a(context, "android.permission.CAMERA") == 0;
    }

    public final boolean b(Context context) {
        Intrinsics.checkNotNull(context);
        return yy0.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && yy0.a(context, "android.permission.CAMERA") == 0;
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(Context context) {
        Intrinsics.checkNotNull(context);
        return yy0.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final void e(Activity activity, int i) {
        Intrinsics.checkNotNull(activity);
        if (l8.u(activity, "android.permission.WRITE_EXTERNAL_STORAGE") || l8.u(activity, "android.permission.CAMERA")) {
            l8.s(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, i);
        } else {
            l8.s(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, i);
        }
    }

    public final void f(Activity activity, int i) {
        Intrinsics.checkNotNull(activity);
        if (l8.u(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            l8.s(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
        } else {
            l8.s(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
        }
    }
}
