package com.zepto;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l96 {
    public static final l96 a = new l96();

    public static final void a(Cursor cursor, Bundle extras) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(extras, "extras");
        cursor.setExtras(extras);
    }
}
