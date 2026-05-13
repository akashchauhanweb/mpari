package com.zepto;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import com.zepto.o96;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class je5 {
    public static final c o = new c(null);
    public volatile n96 a;
    public Executor b;
    public Executor c;
    public o96 d;
    public boolean f;
    public boolean g;
    public List h;
    public e00 k;
    public final Map m;
    public final Map n;
    public final f13 e = g();
    public Map i = new LinkedHashMap();
    public final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    public final ThreadLocal l = new ThreadLocal();

    public static class a {
        public final Context a;
        public final Class b;
        public final String c;
        public final List d;
        public final List e;
        public List f;
        public Executor g;
        public Executor h;
        public o96.c i;
        public boolean j;
        public d k;
        public Intent l;
        public boolean m;
        public boolean n;
        public long o;
        public TimeUnit p;
        public final e q;
        public Set r;
        public Set s;
        public String t;
        public File u;
        public Callable v;

        public a(Context context, Class klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.a = context;
            this.b = klass;
            this.c = str;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.k = d.AUTOMATIC;
            this.m = true;
            this.o = -1L;
            this.q = new e();
            this.r = new LinkedHashSet();
        }

        public a a(b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.d.add(callback);
            return this;
        }

        public a b(eu3... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.s == null) {
                this.s = new HashSet();
            }
            for (eu3 eu3Var : migrations) {
                Set set = this.s;
                Intrinsics.checkNotNull(set);
                set.add(Integer.valueOf(eu3Var.a));
                Set set2 = this.s;
                Intrinsics.checkNotNull(set2);
                set2.add(Integer.valueOf(eu3Var.b));
            }
            this.q.b((eu3[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a c() {
            this.j = true;
            return this;
        }

        public je5 d() {
            Executor executor = this.g;
            if (executor == null && this.h == null) {
                Executor executorF = jx.f();
                this.h = executorF;
                this.g = executorF;
            } else if (executor != null && this.h == null) {
                this.h = executor;
            } else if (executor == null) {
                this.g = this.h;
            }
            Set set = this.s;
            if (set != null) {
                Intrinsics.checkNotNull(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!(!this.r.contains(Integer.valueOf(iIntValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            o96.c dh5Var = this.i;
            if (dh5Var == null) {
                dh5Var = new ph2();
            }
            if (dh5Var != null) {
                if (this.o > 0) {
                    if (this.c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                    long j = this.o;
                    TimeUnit timeUnit = this.p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    Executor executor2 = this.g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    dh5Var = new g00(dh5Var, new e00(j, timeUnit, executor2));
                }
                String str = this.t;
                if (str != null || this.u != null || this.v != null) {
                    if (this.c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                    int i = str == null ? 0 : 1;
                    File file = this.u;
                    int i2 = file == null ? 0 : 1;
                    Callable callable = this.v;
                    if (i + i2 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                    }
                    dh5Var = new dh5(str, file, callable, dh5Var);
                }
            } else {
                dh5Var = null;
            }
            o96.c cVar = dh5Var;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Context context = this.a;
            String str2 = this.c;
            e eVar = this.q;
            List list = this.d;
            boolean z = this.j;
            d dVarC = this.k.c(context);
            Executor executor3 = this.g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor4 = this.h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ud1 ud1Var = new ud1(context, str2, cVar, eVar, list, z, dVarC, executor3, executor4, this.l, this.m, this.n, this.r, this.t, this.u, this.v, null, this.e, this.f);
            je5 je5Var = (je5) ie5.b(this.b, "_Impl");
            je5Var.r(ud1Var);
            return je5Var;
        }

        public a e() {
            this.m = false;
            this.n = true;
            return this;
        }

        public a f(o96.c cVar) {
            this.i = cVar;
            return this;
        }

        public a g(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(n96 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void b(n96 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void c(n96 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final boolean b(ActivityManager activityManager) {
            return j96.b(activityManager);
        }

        public final d c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !b((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    public static class e {
        public final Map a = new LinkedHashMap();

        public final void a(eu3 eu3Var) {
            int i = eu3Var.a;
            int i2 = eu3Var.b;
            Map map = this.a;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + eu3Var);
            }
            treeMap2.put(Integer.valueOf(i2), eu3Var);
        }

        public void b(eu3... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (eu3 eu3Var : migrations) {
                a(eu3Var);
            }
        }

        public final boolean c(int i, int i2) {
            Map mapF = f();
            if (!mapF.containsKey(Integer.valueOf(i))) {
                return false;
            }
            Map mapEmptyMap = (Map) mapF.get(Integer.valueOf(i));
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt__MapsKt.emptyMap();
            }
            return mapEmptyMap.containsKey(Integer.valueOf(i2));
        }

        public List d(int i, int i2) {
            if (i == i2) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            return e(new ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List e(java.util.List r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map r0 = r6.a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = "targetVersion"
                if (r8 == 0) goto L44
                int r5 = r9 + 1
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                int r4 = r3.intValue()
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.je5.e.e(java.util.List, boolean, int, int):java.util.List");
        }

        public Map f() {
            return this.a;
        }
    }

    public static abstract class f {
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n96 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            je5.this.s();
            return null;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n96 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            je5.this.t();
            return null;
        }
    }

    public je5() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.m = mapSynchronizedMap;
        this.n = new LinkedHashMap();
    }

    public static /* synthetic */ Cursor y(je5 je5Var, q96 q96Var, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return je5Var.x(q96Var, cancellationSignal);
    }

    public void A() {
        m().o0().Y();
    }

    public final Object B(Class cls, o96 o96Var) {
        if (cls.isInstance(o96Var)) {
            return o96Var;
        }
        if (o96Var instanceof fh1) {
            return B(cls, ((fh1) o96Var).getDelegate());
        }
        return null;
    }

    public void c() {
        if (!this.f && !(!v())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void d() {
        if (!q() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public void e() {
        c();
        e00 e00Var = this.k;
        if (e00Var == null) {
            s();
        } else {
            e00Var.g(new g());
        }
    }

    public r96 f(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        c();
        d();
        return m().o0().z(sql);
    }

    public abstract f13 g();

    public abstract o96 h(ud1 ud1Var);

    public void i() {
        e00 e00Var = this.k;
        if (e00Var == null) {
            t();
        } else {
            e00Var.g(new h());
        }
    }

    public List j(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock lock = this.j.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    public f13 l() {
        return this.e;
    }

    public o96 m() {
        o96 o96Var = this.d;
        if (o96Var != null) {
            return o96Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.b;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return SetsKt__SetsKt.emptySet();
    }

    public Map p() {
        return MapsKt__MapsKt.emptyMap();
    }

    public boolean q() {
        return m().o0().L();
    }

    public void r(ud1 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.d = h(configuration);
        Set setO = o();
        BitSet bitSet = new BitSet();
        Iterator it = setO.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (cls.isAssignableFrom(configuration.r.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.i.put(cls, configuration.r.get(i));
            } else {
                int size2 = configuration.r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                Iterator it2 = j(this.i).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    eu3 eu3Var = (eu3) it2.next();
                    if (!configuration.d.c(eu3Var.a, eu3Var.b)) {
                        configuration.d.b(eu3Var);
                    }
                }
                ch5 ch5Var = (ch5) B(ch5.class, m());
                if (ch5Var != null) {
                    ch5Var.j(configuration);
                }
                f00 f00Var = (f00) B(f00.class, m());
                if (f00Var != null) {
                    this.k = f00Var.e;
                    l().o(f00Var.e);
                }
                boolean z = configuration.g == d.WRITE_AHEAD_LOGGING;
                m().setWriteAheadLoggingEnabled(z);
                this.h = configuration.e;
                this.b = configuration.h;
                this.c = new sl6(configuration.i);
                this.f = configuration.f;
                this.g = z;
                if (configuration.j != null) {
                    if (configuration.b == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    l().p(configuration.a, configuration.b, configuration.j);
                }
                Map mapP = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapP.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                if (cls3.isAssignableFrom(configuration.q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.n.put(cls3, configuration.q.get(size3));
                    }
                }
                int size4 = configuration.q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i5 < 0) {
                        return;
                    } else {
                        size4 = i5;
                    }
                }
            }
        }
    }

    public final void s() {
        c();
        n96 n96VarO0 = m().o0();
        l().t(n96VarO0);
        if (n96VarO0.V()) {
            n96VarO0.b0();
        } else {
            n96VarO0.g();
        }
    }

    public final void t() {
        m().o0().f();
        if (q()) {
            return;
        }
        l().l();
    }

    public void u(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        l().i(db);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean w() {
        Boolean boolValueOf;
        boolean zIsOpen;
        e00 e00Var = this.k;
        if (e00Var != null) {
            zIsOpen = e00Var.l();
        } else {
            n96 n96Var = this.a;
            if (n96Var == null) {
                boolValueOf = null;
                return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
            }
            zIsOpen = n96Var.isOpen();
        }
        boolValueOf = Boolean.valueOf(zIsOpen);
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public Cursor x(q96 query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        c();
        d();
        return cancellationSignal != null ? m().o0().o(query, cancellationSignal) : m().o0().y(query);
    }

    public Object z(Callable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        e();
        try {
            Object objCall = body.call();
            A();
            return objCall;
        } finally {
            i();
        }
    }
}
