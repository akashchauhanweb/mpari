package com.zepto;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wc5 extends eu3 {
    public final Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc5(Context mContext, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.c = mContext;
    }

    @Override // com.zepto.eu3
    public void a(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (this.b >= 10) {
            db.a0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
