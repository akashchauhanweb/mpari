package com.zepto;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i00 implements h00 {
    @Override // com.zepto.h00
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db.c0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
