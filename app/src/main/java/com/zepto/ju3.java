package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ju3 extends eu3 {
    public static final ju3 c = new ju3();

    public ju3() {
        super(1, 2);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        db.r("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        db.r("DROP TABLE IF EXISTS alarmInfo");
        db.r("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
