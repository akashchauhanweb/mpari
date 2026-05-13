package com.zepto;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ly7 extends eu3 {
    public final Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly7(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.c = context;
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.r("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        pu4.c(this.c, db);
        cx2.c(this.c, db);
    }
}
