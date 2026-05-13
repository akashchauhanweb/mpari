package com.zepto;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class mh2 implements n96 {
    public static final a f = new a(null);
    public static final String[] g = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] h = new String[0];
    public final SQLiteDatabase c;
    public final List e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function4 {
        public final /* synthetic */ q96 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q96 q96Var) {
            super(4);
            this.c = q96Var;
        }

        @Override // kotlin.jvm.functions.Function4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            q96 q96Var = this.c;
            Intrinsics.checkNotNull(sQLiteQuery);
            q96Var.e(new qh2(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public mh2(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.c = delegate;
        this.e = delegate.getAttachedDbs();
    }

    public static final Cursor m(Function4 tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor n(q96 query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        query.e(new qh2(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // com.zepto.n96
    public boolean L() {
        return this.c.inTransaction();
    }

    @Override // com.zepto.n96
    public boolean V() {
        return i96.b(this.c);
    }

    @Override // com.zepto.n96
    public void Y() {
        this.c.setTransactionSuccessful();
    }

    @Override // com.zepto.n96
    public void a0(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.c.execSQL(sql, bindArgs);
    }

    @Override // com.zepto.n96
    public String b() {
        return this.c.getPath();
    }

    @Override // com.zepto.n96
    public void b0() {
        this.c.beginTransactionNonExclusive();
    }

    @Override // com.zepto.n96
    public int c0(String table, int i, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(g[i]);
        sb.append(table);
        sb.append(" SET ");
        int i2 = 0;
        for (String str2 : values.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str2);
            objArr2[i2] = values.get(str2);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        r96 r96VarZ = z(string);
        y26.f.b(r96VarZ, objArr2);
        return r96VarZ.x();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    @Override // com.zepto.n96
    public void f() {
        this.c.endTransaction();
    }

    @Override // com.zepto.n96
    public void g() {
        this.c.beginTransaction();
    }

    @Override // com.zepto.n96
    public boolean isOpen() {
        return this.c.isOpen();
    }

    public final boolean j(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.c, sqLiteDatabase);
    }

    @Override // com.zepto.n96
    public List l() {
        return this.e;
    }

    @Override // com.zepto.n96
    public Cursor o(final q96 query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.c;
        String strD = query.d();
        String[] strArr = h;
        Intrinsics.checkNotNull(cancellationSignal);
        return i96.c(sQLiteDatabase, strD, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: com.zepto.kh2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return mh2.n(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // com.zepto.n96
    public void r(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.c.execSQL(sql);
    }

    @Override // com.zepto.n96
    public Cursor r0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return y(new y26(query));
    }

    @Override // com.zepto.n96
    public Cursor y(q96 query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.zepto.lh2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return mh2.m(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.d(), h, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // com.zepto.n96
    public r96 z(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.c.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new rh2(sQLiteStatementCompileStatement);
    }
}
