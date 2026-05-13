package com.zepto;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zp {
    public static final zp a = new zp();

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
