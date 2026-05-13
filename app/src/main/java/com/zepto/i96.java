package com.zepto;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i96 {
    public static final i96 a = new i96();

    public static final boolean a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static final boolean b(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final Cursor c(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public static final void d(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
        Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
    }
}
