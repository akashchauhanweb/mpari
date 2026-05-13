package com.zepto;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u03 {
    public static final u03 a = new u03();

    public static final Intent b(Context context, File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", FileProvider.f(context, context.getPackageName() + context.getString(y05.h), file));
        return intent;
    }

    public static final Intent d(Context context, String[] mimeTypes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mimeTypes, "mimeTypes");
        u03 u03Var = a;
        Intent intentC = u03Var.c(mimeTypes);
        return intentC.resolveActivity(context.getPackageManager()) != null ? intentC : u03Var.e(mimeTypes);
    }

    public static final boolean f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(context.getPackageManager()) != null;
    }

    public final Intent a(Intent intent, String[] strArr) {
        intent.setType("image/*");
        if (!(strArr.length == 0)) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        return intent;
    }

    public final Intent c(String[] strArr) {
        Intent intentA = a(new Intent("android.intent.action.OPEN_DOCUMENT"), strArr);
        intentA.addCategory("android.intent.category.OPENABLE");
        intentA.addFlags(64);
        intentA.addFlags(1);
        intentA.addFlags(2);
        return intentA;
    }

    public final Intent e(String[] strArr) {
        return a(new Intent("android.intent.action.PICK"), strArr);
    }
}
