package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ou3 extends eu3 {
    public static final ou3 c = new ou3();

    public ou3() {
        super(8, 9);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
