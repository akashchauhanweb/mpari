package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public class f13 {
    public static final a q = new a(null);
    public static final String[] r = {"UPDATE", "DELETE", "INSERT"};
    public final je5 a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final String[] e;
    public e00 f;
    public final AtomicBoolean g;
    public volatile boolean h;
    public volatile r96 i;
    public final b j;
    public final d13 k;
    public final hi5 l;
    public px3 m;
    public final Object n;
    public final Object o;
    public final Runnable p;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(n96 database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.V()) {
                database.b0();
            } else {
                database.g();
            }
        }

        public final String b(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    public static final class b {
        public static final a e = new a(null);
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.d) {
                        return null;
                    }
                    long[] jArr = this.a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.d = false;
                    return (int[]) this.c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : tableIds) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            z = true;
                            this.d = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final boolean c(int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : tableIds) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            z = true;
                            this.d = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.b, false);
                this.d = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static abstract class c {
        public final String[] a;

        public c(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.a = tables;
        }

        public final String[] a() {
            return this.a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {
        public final c a;
        public final int[] b;
        public final String[] c;
        public final Set d;

        public d(c observer, int[] tableIds, String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.a = observer;
            this.b = tableIds;
            this.c = tableNames;
            this.d = (tableNames.length == 0) ^ true ? SetsKt__SetsJVMKt.setOf(tableNames[0]) : SetsKt__SetsKt.emptySet();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final int[] a() {
            return this.b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set setEmptySet;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
                    int[] iArr2 = this.b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i]))) {
                            setCreateSetBuilder.add(this.c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    setEmptySet = SetsKt__SetsJVMKt.build(setCreateSetBuilder);
                } else {
                    setEmptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.d : SetsKt__SetsKt.emptySet();
                }
            } else {
                setEmptySet = SetsKt__SetsKt.emptySet();
            }
            if (!setEmptySet.isEmpty()) {
                this.a.c(setEmptySet);
            }
        }

        public final void c(String[] tables) {
            Set setEmptySet;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.c.length;
            if (length == 0) {
                setEmptySet = SetsKt__SetsKt.emptySet();
            } else if (length == 1) {
                int length2 = tables.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        setEmptySet = SetsKt__SetsKt.emptySet();
                        break;
                    } else {
                        if (StringsKt__StringsJVMKt.equals(tables[i], this.c[0], true)) {
                            setEmptySet = this.d;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
                for (String str : tables) {
                    for (String str2 : this.c) {
                        if (StringsKt__StringsJVMKt.equals(str2, str, true)) {
                            setCreateSetBuilder.add(str2);
                        }
                    }
                }
                setEmptySet = SetsKt__SetsJVMKt.build(setCreateSetBuilder);
            }
            if (!setEmptySet.isEmpty()) {
                this.a.c(setEmptySet);
            }
        }
    }

    public static final class e implements Runnable {
        public e() {
        }

        public final Set a() {
            f13 f13Var = f13.this;
            Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
            Cursor cursorY = je5.y(f13Var.e(), new y26("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorY.moveToNext()) {
                try {
                    setCreateSetBuilder.add(Integer.valueOf(cursorY.getInt(0)));
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursorY, null);
            Set setBuild = SetsKt__SetsJVMKt.build(setCreateSetBuilder);
            if (!setBuild.isEmpty()) {
                if (f13.this.d() == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                r96 r96VarD = f13.this.d();
                if (r96VarD == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                r96VarD.x();
            }
            return setBuild;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setEmptySet;
            e00 e00Var;
            e00 e00Var2;
            Lock lockK = f13.this.e().k();
            lockK.lock();
            try {
                try {
                } catch (SQLiteException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    setEmptySet = SetsKt__SetsKt.emptySet();
                    lockK.unlock();
                    e00Var = f13.this.f;
                    if (e00Var != null) {
                    }
                } catch (IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    setEmptySet = SetsKt__SetsKt.emptySet();
                    lockK.unlock();
                    e00Var = f13.this.f;
                    if (e00Var != null) {
                    }
                }
                if (!f13.this.c()) {
                    if (e00Var2 != null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!f13.this.g().compareAndSet(true, false)) {
                    lockK.unlock();
                    e00 e00Var3 = f13.this.f;
                    if (e00Var3 != null) {
                        e00Var3.e();
                        return;
                    }
                    return;
                }
                if (f13.this.e().q()) {
                    lockK.unlock();
                    e00 e00Var4 = f13.this.f;
                    if (e00Var4 != null) {
                        e00Var4.e();
                        return;
                    }
                    return;
                }
                n96 n96VarO0 = f13.this.e().m().o0();
                n96VarO0.b0();
                try {
                    setEmptySet = a();
                    n96VarO0.Y();
                    lockK.unlock();
                    e00Var = f13.this.f;
                    if (e00Var != null) {
                        e00Var.e();
                    }
                    if (!setEmptySet.isEmpty()) {
                        hi5 hi5VarF = f13.this.f();
                        f13 f13Var = f13.this;
                        synchronized (hi5VarF) {
                            try {
                                Iterator it = f13Var.f().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).b(setEmptySet);
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } finally {
                    n96VarO0.f();
                }
            } finally {
                lockK.unlock();
                e00Var2 = f13.this.f;
                if (e00Var2 != null) {
                    e00Var2.e();
                }
            }
        }
    }

    public f13(je5 database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.a = database;
        this.b = shadowTablesMap;
        this.c = viewTables;
        this.g = new AtomicBoolean(false);
        this.j = new b(tableNames.length);
        this.k = new d13(database);
        this.l = new hi5();
        this.n = new Object();
        this.o = new Object();
        this.d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str = tableNames[i];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(tableNames[i]);
            if (str2 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i] = lowerCase2;
        }
        this.e = strArr;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.d;
                map.put(lowerCase4, MapsKt__MapsKt.getValue(map, lowerCase3));
            }
        }
        this.p = new e();
    }

    public void b(c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrN = n(observer.a());
        ArrayList arrayList = new ArrayList(strArrN.length);
        for (String str : strArrN) {
            Map map = this.d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        d dVar2 = new d(observer, intArray, strArrN);
        synchronized (this.l) {
            dVar = (d) this.l.w(observer, dVar2);
        }
        if (dVar == null && this.j.b(Arrays.copyOf(intArray, intArray.length))) {
            s();
        }
    }

    public final boolean c() {
        if (!this.a.w()) {
            return false;
        }
        if (!this.h) {
            this.a.m().o0();
        }
        if (this.h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final r96 d() {
        return this.i;
    }

    public final je5 e() {
        return this.a;
    }

    public final hi5 f() {
        return this.l;
    }

    public final AtomicBoolean g() {
        return this.g;
    }

    public final Map h() {
        return this.d;
    }

    public final void i(n96 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.o) {
            if (this.h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.r("PRAGMA temp_store = MEMORY;");
            database.r("PRAGMA recursive_triggers='ON';");
            database.r("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            t(database);
            this.i = database.z("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.h = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void j(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.l) {
            try {
                for (Map.Entry entry : this.l) {
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.c(tables);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.o) {
            this.h = false;
            this.j.d();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void l() {
        if (this.g.compareAndSet(false, true)) {
            e00 e00Var = this.f;
            if (e00Var != null) {
                e00Var.j();
            }
            this.a.n().execute(this.p);
        }
    }

    public void m(c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.l) {
            dVar = (d) this.l.z(observer);
        }
        if (dVar != null) {
            b bVar = this.j;
            int[] iArrA = dVar.a();
            if (bVar.c(Arrays.copyOf(iArrA, iArrA.length))) {
                s();
            }
        }
    }

    public final String[] n(String[] strArr) {
        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        for (String str : strArr) {
            Map map = this.c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                Intrinsics.checkNotNull(obj);
                setCreateSetBuilder.addAll((Collection) obj);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        Object[] array = SetsKt__SetsJVMKt.build(setCreateSetBuilder).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final void o(e00 autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f = autoCloser;
        autoCloser.m(new Runnable() { // from class: com.zepto.e13
            @Override // java.lang.Runnable
            public final void run() {
                this.c.k();
            }
        });
    }

    public final void p(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.m = new px3(context, name, serviceIntent, this, this.a.n());
    }

    public final void q(n96 n96Var, int i) {
        n96Var.r("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        for (String str2 : r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            n96Var.r(str3);
        }
    }

    public final void r(n96 n96Var, int i) {
        String str = this.e[i];
        for (String str2 : r) {
            String str3 = "DROP TRIGGER IF EXISTS " + q.b(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            n96Var.r(str3);
        }
    }

    public final void s() {
        if (this.a.w()) {
            t(this.a.m().o0());
        }
    }

    public final void t(n96 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.L()) {
            return;
        }
        try {
            Lock lockK = this.a.k();
            lockK.lock();
            try {
                synchronized (this.n) {
                    int[] iArrA = this.j.a();
                    if (iArrA == null) {
                        return;
                    }
                    q.a(database);
                    try {
                        int length = iArrA.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = iArrA[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                q(database, i2);
                            } else if (i3 == 2) {
                                r(database, i2);
                            }
                            i++;
                            i2 = i4;
                        }
                        database.Y();
                        database.f();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        database.f();
                        throw th;
                    }
                }
            } finally {
                lockK.unlock();
            }
        } catch (SQLiteException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        } catch (IllegalStateException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        }
    }
}
