package com.zepto;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rh2 extends qh2 implements r96 {
    public final SQLiteStatement e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh2(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // com.zepto.r96
    public long q0() {
        return this.e.executeInsert();
    }

    @Override // com.zepto.r96
    public int x() {
        return this.e.executeUpdateDelete();
    }
}
