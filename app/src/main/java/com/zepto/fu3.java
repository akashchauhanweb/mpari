package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fu3 extends eu3 {
    public static final fu3 c = new fu3();

    public fu3() {
        super(11, 12);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
