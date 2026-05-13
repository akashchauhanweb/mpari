package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class ux7 extends eu3 {
    public ux7() {
        super(17, 18);
    }

    @Override // com.zepto.eu3
    public void a(n96 n96Var) {
        n96Var.r("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        n96Var.r("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
