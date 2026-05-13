package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nu3 extends eu3 {
    public static final nu3 c = new nu3();

    public nu3() {
        super(7, 8);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
