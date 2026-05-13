package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class vx7 extends eu3 {
    public vx7() {
        super(18, 19);
    }

    @Override // com.zepto.eu3
    public void a(n96 n96Var) {
        n96Var.r("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
