package com.zepto;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.zepto.nh2;
import com.zepto.o96;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class nh2 implements o96 {
    public static final a k = new a(null);
    public final Context c;
    public final String e;
    public final o96.a f;
    public final boolean g;
    public final boolean h;
    public final Lazy i;
    public boolean j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b {
        public mh2 a;

        public b(mh2 mh2Var) {
            this.a = mh2Var;
        }

        public final mh2 a() {
            return this.a;
        }

        public final void b(mh2 mh2Var) {
            this.a = mh2Var;
        }
    }

    public static final class c extends SQLiteOpenHelper {
        public static final C0105c k = new C0105c(null);
        public final Context c;
        public final b e;
        public final o96.a f;
        public final boolean g;
        public boolean h;
        public final vv4 i;
        public boolean j;

        public static final class a extends RuntimeException {
            public final b c;
            public final Throwable e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.c = callbackName;
                this.e = cause;
            }

            public final b a() {
                return this.c;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.e;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: com.zepto.nh2$c$c, reason: collision with other inner class name */
        public static final class C0105c {
            public C0105c() {
            }

            public /* synthetic */ C0105c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final mh2 a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                mh2 mh2VarA = refHolder.a();
                if (mh2VarA != null && mh2VarA.j(sqLiteDatabase)) {
                    return mh2VarA;
                }
                mh2 mh2Var = new mh2(sqLiteDatabase);
                refHolder.b(mh2Var);
                return mh2Var;
            }
        }

        public /* synthetic */ class d {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final o96.a callback, boolean z) {
            super(context, str, null, callback.a, new DatabaseErrorHandler() { // from class: com.zepto.oh2
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    nh2.c.e(callback, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.c = context;
            this.e = dbRef;
            this.f = callback;
            this.g = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
            this.i = new vv4(str, cacheDir, false);
        }

        public static final void e(o96.a callback, b dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C0105c c0105c = k;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.c(c0105c.a(dbRef, dbObj));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                vv4.c(this.i, false, 1, null);
                super.close();
                this.e.b(null);
                this.j = false;
            } finally {
                this.i.d();
            }
        }

        public final n96 j(boolean z) {
            try {
                this.i.b((this.j || getDatabaseName() == null) ? false : true);
                this.h = false;
                SQLiteDatabase sQLiteDatabaseW = w(z);
                if (!this.h) {
                    mh2 mh2VarM = m(sQLiteDatabaseW);
                    this.i.d();
                    return mh2VarM;
                }
                close();
                n96 n96VarJ = j(z);
                this.i.d();
                return n96VarJ;
            } catch (Throwable th) {
                this.i.d();
                throw th;
            }
        }

        public final mh2 m(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return k.a(this.e, sqLiteDatabase);
        }

        public final SQLiteDatabase n(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                this.f.b(m(db));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f.d(m(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i, int i2) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.h = true;
            try {
                this.f.e(m(db), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.h) {
                try {
                    this.f.f(m(db));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.j = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.h = true;
            try {
                this.f.g(m(sqLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }

        public final SQLiteDatabase w(boolean z) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.c.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return n(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return n(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i = d.a[aVar.a().ordinal()];
                        if (i == 1 || i == 2 || i == 3 || i == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.g) {
                        throw th;
                    }
                    this.c.deleteDatabase(databaseName);
                    try {
                        return n(z);
                    } catch (a e) {
                        throw e.getCause();
                    }
                }
            }
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (nh2.this.e == null || !nh2.this.g) {
                cVar = new c(nh2.this.c, nh2.this.e, new b(null), nh2.this.f, nh2.this.h);
            } else {
                cVar = new c(nh2.this.c, new File(k96.a(nh2.this.c), nh2.this.e).getAbsolutePath(), new b(null), nh2.this.f, nh2.this.h);
            }
            i96.d(cVar, nh2.this.j);
            return cVar;
        }
    }

    public nh2(Context context, String str, o96.a callback, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.c = context;
        this.e = str;
        this.f = callback;
        this.g = z;
        this.h = z2;
        this.i = LazyKt__LazyJVMKt.lazy(new d());
    }

    public final c B() {
        return (c) this.i.getValue();
    }

    @Override // com.zepto.o96, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.i.isInitialized()) {
            B().close();
        }
    }

    @Override // com.zepto.o96
    public String getDatabaseName() {
        return this.e;
    }

    @Override // com.zepto.o96
    public n96 o0() {
        return B().j(true);
    }

    @Override // com.zepto.o96
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.i.isInitialized()) {
            i96.d(B(), z);
        }
        this.j = z;
    }
}
