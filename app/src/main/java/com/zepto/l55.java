package com.zepto;

import com.zepto.i55;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l55 {
    public static final a f = new a(null);
    public final long a;
    public final bd6 b;
    public final b c;
    public final ConcurrentLinkedQueue d;
    public final int e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends oc6 {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // com.zepto.oc6
        public long f() {
            return l55.this.b(System.nanoTime());
        }
    }

    public l55(cd6 taskRunner, int i, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.e = i;
        this.a = timeUnit.toNanos(j);
        this.b = taskRunner.i();
        this.c = new b(et6.i + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:8:0x0024, B:15:0x0033, B:13:0x002d, B:18:0x0037), top: B:26:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.zepto.wj r4, com.zepto.i55 r5, java.util.List r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.d
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            com.zepto.j55 r1 = (com.zepto.j55) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.w()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L2d
            goto L33
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.u(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L37
        L33:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L37:
            r5.c(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.l55.a(com.zepto.wj, com.zepto.i55, java.util.List, boolean):boolean");
    }

    public final long b(long j) {
        int i = 0;
        long j2 = Long.MIN_VALUE;
        j55 j55Var = null;
        int i2 = 0;
        for (j55 connection : this.d) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                try {
                    if (d(connection, j) > 0) {
                        i2++;
                    } else {
                        i++;
                        long jP = j - connection.p();
                        if (jP > j2) {
                            Unit unit = Unit.INSTANCE;
                            j55Var = connection;
                            j2 = jP;
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        long j3 = this.a;
        if (j2 < j3 && i <= this.e) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(j55Var);
        synchronized (j55Var) {
            if (!j55Var.o().isEmpty()) {
                return 0L;
            }
            if (j55Var.p() + j2 != j) {
                return 0L;
            }
            j55Var.D(true);
            this.d.remove(j55Var);
            et6.k(j55Var.E());
            if (this.d.isEmpty()) {
                this.b.a();
            }
            return 0L;
        }
    }

    public final boolean c(j55 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (et6.h && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(connection);
            throw new AssertionError(sb.toString());
        }
        if (!connection.q() && this.e != 0) {
            bd6.j(this.b, this.c, 0L, 2, null);
            return false;
        }
        connection.D(true);
        this.d.remove(connection);
        if (this.d.isEmpty()) {
            this.b.a();
        }
        return true;
    }

    public final int d(j55 j55Var, long j) {
        if (et6.h && !Thread.holdsLock(j55Var)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(j55Var);
            throw new AssertionError(sb.toString());
        }
        List listO = j55Var.o();
        int i = 0;
        while (i < listO.size()) {
            Reference reference = (Reference) listO.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                is4.c.g().m("A connection to " + j55Var.A().a().l() + " was leaked. Did you forget to close a response body?", ((i55.b) reference).a());
                listO.remove(i);
                j55Var.D(true);
                if (listO.isEmpty()) {
                    j55Var.C(j - this.a);
                    return 0;
                }
            }
        }
        return listO.size();
    }

    public final void e(j55 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!et6.h || Thread.holdsLock(connection)) {
            this.d.add(connection);
            bd6.j(this.b, this.c, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }
}
