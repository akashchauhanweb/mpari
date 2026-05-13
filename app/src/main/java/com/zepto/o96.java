package com.zepto;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public interface o96 extends Closeable {

    public static abstract class a {
        public static final C0107a b = new C0107a(null);
        public final int a;

        /* JADX INFO: renamed from: com.zepto.o96$a$a, reason: collision with other inner class name */
        public static final class C0107a {
            public C0107a() {
            }

            public /* synthetic */ C0107a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(int i) {
            this.a = i;
        }

        public final void a(String str) {
            if (StringsKt__StringsJVMKt.equals(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                i96.a(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public void b(n96 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void c(n96 db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String strB = db.b();
                if (strB != null) {
                    a(strB);
                    return;
                }
                return;
            }
            List listL = null;
            try {
                try {
                    listL = db.l();
                } finally {
                    if (listL != null) {
                        Iterator it = listL.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String strB2 = db.b();
                        if (strB2 != null) {
                            a(strB2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db.close();
            } catch (IOException unused2) {
            }
            if (listL != null) {
                return;
            }
        }

        public abstract void d(n96 n96Var);

        public abstract void e(n96 n96Var, int i, int i2);

        public void f(n96 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void g(n96 n96Var, int i, int i2);
    }

    public static final class b {
        public static final C0108b f = new C0108b(null);
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;
        public final boolean e;

        public static class a {
            public final Context a;
            public String b;
            public a c;
            public boolean d;
            public boolean e;

            public a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.a = context;
            }

            public a a(boolean z) {
                this.e = z;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.d && ((str = this.b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new b(this.a, this.b, aVar, this.d, this.e);
            }

            public a c(a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.c = callback;
                return this;
            }

            public a d(String str) {
                this.b = str;
                return this;
            }

            public a e(boolean z) {
                this.d = z;
                return this;
            }
        }

        /* JADX INFO: renamed from: com.zepto.o96$b$b, reason: collision with other inner class name */
        public static final class C0108b {
            public C0108b() {
            }

            public /* synthetic */ C0108b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }
        }

        public b(Context context, String str, a callback, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.a = context;
            this.b = str;
            this.c = callback;
            this.d = z;
            this.e = z2;
        }

        public static final a a(Context context) {
            return f.a(context);
        }
    }

    public interface c {
        o96 a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    n96 o0();

    void setWriteAheadLoggingEnabled(boolean z);
}
