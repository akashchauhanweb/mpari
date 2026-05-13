package com.zepto;

import android.content.Context;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wq4 {
    public static final wq4 a = new wq4();

    public final boolean a(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return yy0.a(context, permission) == 0;
    }

    public final boolean b(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), ConstantsKt.DEFAULT_BLOCK_SIZE).requestedPermissions;
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                if (Intrinsics.areEqual(str, permission)) {
                    return true;
                }
            }
        }
        return false;
    }
}
