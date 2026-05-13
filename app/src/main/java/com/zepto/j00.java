package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j00 implements h00 {
    @Override // com.zepto.h00
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
