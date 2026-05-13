package com.zepto;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class f00 implements o96, fh1 {
    public final o96 c;
    public final e00 e;
    public final a f;

    public static final class a implements n96 {
        public final e00 c;

        /* JADX INFO: renamed from: com.zepto.f00$a$a, reason: collision with other inner class name */
        public static final class C0080a extends Lambda implements Function1 {
            public static final C0080a c = new C0080a();

            public C0080a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(n96 obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.l();
            }
        }

        public static final class b extends Lambda implements Function1 {
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.c = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(n96 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.r(this.c);
                return null;
            }
        }

        public static final class c extends Lambda implements Function1 {
            public final /* synthetic */ String c;
            public final /* synthetic */ Object[] e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, Object[] objArr) {
                super(1);
                this.c = str;
                this.e = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(n96 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.a0(this.c, this.e);
                return null;
            }
        }

        public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
            public static final d c = new d();

            public d() {
                super(1, n96.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(n96 p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(p0.L());
            }
        }

        public static final class e extends Lambda implements Function1 {
            public static final e c = new e();

            public e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(n96 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                return Boolean.valueOf(db.V());
            }
        }

        public static final class f extends Lambda implements Function1 {
            public static final f c = new f();

            public f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(n96 obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.b();
            }
        }

        public static final class g extends Lambda implements Function1 {
            public static final g c = new g();

            public g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(n96 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        public static final class h extends Lambda implements Function1 {
            public final /* synthetic */ String c;
            public final /* synthetic */ int e;
            public final /* synthetic */ ContentValues f;
            public final /* synthetic */ String g;
            public final /* synthetic */ Object[] h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.c = str;
                this.e = i;
                this.f = contentValues;
                this.g = str2;
                this.h = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(n96 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                return Integer.valueOf(db.c0(this.c, this.e, this.f, this.g, this.h));
            }
        }

        public a(e00 autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.c = autoCloser;
        }

        @Override // com.zepto.n96
        public boolean L() {
            if (this.c.h() == null) {
                return false;
            }
            return ((Boolean) this.c.g(d.c)).booleanValue();
        }

        @Override // com.zepto.n96
        public boolean V() {
            return ((Boolean) this.c.g(e.c)).booleanValue();
        }

        @Override // com.zepto.n96
        public void Y() {
            Unit unit;
            n96 n96VarH = this.c.h();
            if (n96VarH != null) {
                n96VarH.Y();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // com.zepto.n96
        public void a0(String sql, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.c.g(new c(sql, bindArgs));
        }

        @Override // com.zepto.n96
        public String b() {
            return (String) this.c.g(f.c);
        }

        @Override // com.zepto.n96
        public void b0() {
            try {
                this.c.j().b0();
            } catch (Throwable th) {
                this.c.e();
                throw th;
            }
        }

        @Override // com.zepto.n96
        public int c0(String table, int i, ContentValues values, String str, Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.c.g(new h(table, i, values, str, objArr))).intValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c.d();
        }

        public final void d() {
            this.c.g(g.c);
        }

        @Override // com.zepto.n96
        public void f() {
            if (this.c.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                n96 n96VarH = this.c.h();
                Intrinsics.checkNotNull(n96VarH);
                n96VarH.f();
            } finally {
                this.c.e();
            }
        }

        @Override // com.zepto.n96
        public void g() {
            try {
                this.c.j().g();
            } catch (Throwable th) {
                this.c.e();
                throw th;
            }
        }

        @Override // com.zepto.n96
        public boolean isOpen() {
            n96 n96VarH = this.c.h();
            if (n96VarH == null) {
                return false;
            }
            return n96VarH.isOpen();
        }

        @Override // com.zepto.n96
        public List l() {
            return (List) this.c.g(C0080a.c);
        }

        @Override // com.zepto.n96
        public Cursor o(q96 query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.c.j().o(query, cancellationSignal), this.c);
            } catch (Throwable th) {
                this.c.e();
                throw th;
            }
        }

        @Override // com.zepto.n96
        public void r(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.c.g(new b(sql));
        }

        @Override // com.zepto.n96
        public Cursor r0(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.c.j().r0(query), this.c);
            } catch (Throwable th) {
                this.c.e();
                throw th;
            }
        }

        @Override // com.zepto.n96
        public Cursor y(q96 query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.c.j().y(query), this.c);
            } catch (Throwable th) {
                this.c.e();
                throw th;
            }
        }

        @Override // com.zepto.n96
        public r96 z(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.c);
        }
    }

    public static final class b implements r96 {
        public final String c;
        public final e00 e;
        public final ArrayList f;

        public static final class a extends Lambda implements Function1 {
            public static final a c = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(r96 obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.q0());
            }
        }

        /* JADX INFO: renamed from: com.zepto.f00$b$b, reason: collision with other inner class name */
        public static final class C0081b extends Lambda implements Function1 {
            public final /* synthetic */ Function1 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0081b(Function1 function1) {
                super(1);
                this.e = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(n96 db) {
                Intrinsics.checkNotNullParameter(db, "db");
                r96 r96VarZ = db.z(b.this.c);
                b.this.j(r96VarZ);
                return this.e.invoke(r96VarZ);
            }
        }

        public static final class c extends Lambda implements Function1 {
            public static final c c = new c();

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(r96 obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.x());
            }
        }

        public b(String sql, e00 autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.c = sql;
            this.e = autoCloser;
            this.f = new ArrayList();
        }

        @Override // com.zepto.p96
        public void C(int i) {
            n(i, null);
        }

        @Override // com.zepto.p96
        public void F(int i, double d) {
            n(i, Double.valueOf(d));
        }

        @Override // com.zepto.p96
        public void X(int i, long j) {
            n(i, Long.valueOf(j));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.zepto.p96
        public void f0(int i, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            n(i, value);
        }

        public final void j(r96 r96Var) {
            Iterator it = this.f.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.f.get(i);
                if (obj == null) {
                    r96Var.C(i2);
                } else if (obj instanceof Long) {
                    r96Var.X(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    r96Var.F(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    r96Var.s(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    r96Var.f0(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        public final Object m(Function1 function1) {
            return this.e.g(new C0081b(function1));
        }

        public final void n(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.f.size() && (size = this.f.size()) <= i2) {
                while (true) {
                    this.f.add(null);
                    if (size == i2) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f.set(i2, obj);
        }

        @Override // com.zepto.r96
        public long q0() {
            return ((Number) m(a.c)).longValue();
        }

        @Override // com.zepto.p96
        public void s(int i, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            n(i, value);
        }

        @Override // com.zepto.r96
        public int x() {
            return ((Number) m(c.c)).intValue();
        }
    }

    public static final class c implements Cursor {
        public final Cursor c;
        public final e00 e;

        public c(Cursor delegate, e00 autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.c = delegate;
            this.e = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c.close();
            this.e.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.c.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.c.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.c.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.c.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.c.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.c.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.c.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.c.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.c.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.c.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.c.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.c.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.c.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.c.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return j96.a(this.c);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return m96.a(this.c);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.c.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.c.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.c.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.c.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.c.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.c.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.c.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.c.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.c.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.c.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.c.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.c.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.c.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.c.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.c.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.c.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.c.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.c.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.c.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.c.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.c.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            l96.a(this.c, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.c.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            m96.b(this.c, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.c.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.c.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public f00(o96 delegate, e00 autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.c = delegate;
        this.e = autoCloser;
        autoCloser.k(getDelegate());
        this.f = new a(autoCloser);
    }

    @Override // com.zepto.o96, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f.close();
    }

    @Override // com.zepto.o96
    public String getDatabaseName() {
        return this.c.getDatabaseName();
    }

    @Override // com.zepto.fh1
    public o96 getDelegate() {
        return this.c;
    }

    @Override // com.zepto.o96
    public n96 o0() {
        this.f.d();
        return this.f;
    }

    @Override // com.zepto.o96
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.c.setWriteAheadLoggingEnabled(z);
    }
}
