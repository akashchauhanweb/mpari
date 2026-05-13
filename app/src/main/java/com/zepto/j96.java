package com.zepto;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j96 {
    public static final j96 a = new j96();

    public static final Uri a(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
