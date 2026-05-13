package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ku3 extends eu3 {
    public static final ku3 c = new ku3();

    public ku3() {
        super(3, 4);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
