package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gu3 extends eu3 {
    public static final gu3 c = new gu3();

    public gu3() {
        super(12, 13);
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db.r("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
