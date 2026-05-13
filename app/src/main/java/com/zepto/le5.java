package com.zepto;

import android.database.Cursor;
import com.zepto.o96;
import java.util.Iterator;
import java.util.List;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class le5 extends o96.a {
    public static final a g = new a(null);
    public ud1 c;
    public final b d;
    public final String e;
    public final String f;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(n96 db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorR0 = db.r0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (cursorR0.moveToFirst()) {
                    if (cursorR0.getInt(0) == 0) {
                        z = true;
                    }
                }
                CloseableKt.closeFinally(cursorR0, null);
                return z;
            } finally {
            }
        }

        public final boolean b(n96 db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorR0 = db.r0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = false;
                if (cursorR0.moveToFirst()) {
                    if (cursorR0.getInt(0) != 0) {
                        z = true;
                    }
                }
                CloseableKt.closeFinally(cursorR0, null);
                return z;
            } finally {
            }
        }
    }

    public static abstract class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public abstract void a(n96 n96Var);

        public abstract void b(n96 n96Var);

        public abstract void c(n96 n96Var);

        public abstract void d(n96 n96Var);

        public abstract void e(n96 n96Var);

        public abstract void f(n96 n96Var);

        public abstract c g(n96 n96Var);
    }

    public static class c {
        public final boolean a;
        public final String b;

        public c(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le5(ud1 configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.a);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.c = configuration;
        this.d = delegate;
        this.e = identityHash;
        this.f = legacyHash;
    }

    @Override // com.zepto.o96.a
    public void b(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.b(db);
    }

    @Override // com.zepto.o96.a
    public void d(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        boolean zA = g.a(db);
        this.d.a(db);
        if (!zA) {
            c cVarG = this.d.g(db);
            if (!cVarG.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.b);
            }
        }
        j(db);
        this.d.c(db);
    }

    @Override // com.zepto.o96.a
    public void e(n96 db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        g(db, i, i2);
    }

    @Override // com.zepto.o96.a
    public void f(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.f(db);
        h(db);
        this.d.d(db);
        this.c = null;
    }

    @Override // com.zepto.o96.a
    public void g(n96 db, int i, int i2) {
        List listD;
        Intrinsics.checkNotNullParameter(db, "db");
        ud1 ud1Var = this.c;
        if (ud1Var == null || (listD = ud1Var.d.d(i, i2)) == null) {
            ud1 ud1Var2 = this.c;
            if (ud1Var2 != null && !ud1Var2.a(i, i2)) {
                this.d.b(db);
                this.d.a(db);
                return;
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.d.f(db);
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            ((eu3) it.next()).a(db);
        }
        c cVarG = this.d.g(db);
        if (cVarG.a) {
            this.d.e(db);
            j(db);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarG.b);
        }
    }

    public final void h(n96 n96Var) {
        if (!g.b(n96Var)) {
            c cVarG = this.d.g(n96Var);
            if (cVarG.a) {
                this.d.e(n96Var);
                j(n96Var);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.b);
            }
        }
        Cursor cursorY = n96Var.y(new y26("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorY.moveToFirst() ? cursorY.getString(0) : null;
            CloseableKt.closeFinally(cursorY, null);
            if (Intrinsics.areEqual(this.e, string) || Intrinsics.areEqual(this.f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursorY, th);
                throw th2;
            }
        }
    }

    public final void i(n96 n96Var) {
        n96Var.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void j(n96 n96Var) {
        i(n96Var);
        n96Var.r(ke5.a(this.e));
    }
}
