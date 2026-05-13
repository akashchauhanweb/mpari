package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lu3 extends eu3 {
    public static final lu3 c = new lu3();

    public lu3() {
        super(4, 5);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db.r("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
