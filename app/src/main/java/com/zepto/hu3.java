package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hu3 extends eu3 {
    public static final hu3 c = new hu3();

    public hu3() {
        super(15, 16);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        db.r("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        db.r("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        db.r("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        db.r("DROP TABLE `SystemIdInfo`");
        db.r("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
