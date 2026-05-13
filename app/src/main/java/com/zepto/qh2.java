package com.zepto;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class qh2 implements p96 {
    public final SQLiteProgram c;

    public qh2(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.c = delegate;
    }

    @Override // com.zepto.p96
    public void C(int i) {
        this.c.bindNull(i);
    }

    @Override // com.zepto.p96
    public void F(int i, double d) {
        this.c.bindDouble(i, d);
    }

    @Override // com.zepto.p96
    public void X(int i, long j) {
        this.c.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    @Override // com.zepto.p96
    public void f0(int i, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.c.bindBlob(i, value);
    }

    @Override // com.zepto.p96
    public void s(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.c.bindString(i, value);
    }
}
