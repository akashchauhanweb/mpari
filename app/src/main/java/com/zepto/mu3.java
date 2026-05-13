package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mu3 extends eu3 {
    public static final mu3 c = new mu3();

    public mu3() {
        super(6, 7);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
