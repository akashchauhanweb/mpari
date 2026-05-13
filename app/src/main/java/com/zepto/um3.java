package com.zepto;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class um3 {
    public static final um3 a = new um3();
    public static final String[] b = {"android.permission.ACCESS_FINE_LOCATION"};

    public final boolean a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return yy0.a(activity, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public final void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivity(intent);
    }
}
