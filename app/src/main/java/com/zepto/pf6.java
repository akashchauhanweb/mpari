package com.zepto;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class pf6 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(pf6.class, "_size");

    @Volatile
    private volatile int _size;
    public qf6[] a;

    public final void a(qf6 qf6Var) {
        qf6Var.d(this);
        qf6[] qf6VarArrF = f();
        int iC = c();
        j(iC + 1);
        qf6VarArrF[iC] = qf6Var;
        qf6Var.a(iC);
        l(iC);
    }

    public final qf6 b() {
        qf6[] qf6VarArr = this.a;
        if (qf6VarArr != null) {
            return qf6VarArr[0];
        }
        return null;
    }

    public final int c() {
        return b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final qf6 e() {
        qf6 qf6VarB;
        synchronized (this) {
            qf6VarB = b();
        }
        return qf6VarB;
    }

    public final qf6[] f() {
        qf6[] qf6VarArr = this.a;
        if (qf6VarArr == null) {
            qf6[] qf6VarArr2 = new qf6[4];
            this.a = qf6VarArr2;
            return qf6VarArr2;
        }
        if (c() < qf6VarArr.length) {
            return qf6VarArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(qf6VarArr, c() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        qf6[] qf6VarArr3 = (qf6[]) objArrCopyOf;
        this.a = qf6VarArr3;
        return qf6VarArr3;
    }

    public final boolean g(qf6 qf6Var) {
        boolean z;
        synchronized (this) {
            if (qf6Var.e() == null) {
                z = false;
            } else {
                h(qf6Var.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.zepto.qf6 h(int r6) {
        /*
            r5 = this;
            com.zepto.qf6[] r0 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.j(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.m(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m(r6, r1)
            r5.l(r1)
            goto L3d
        L3a:
            r5.k(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r1 = 0
            r6.d(r1)
            r6.a(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.pf6.h(int):com.zepto.qf6");
    }

    public final qf6 i() {
        qf6 qf6VarH;
        synchronized (this) {
            qf6VarH = c() > 0 ? h(0) : null;
        }
        return qf6VarH;
    }

    public final void j(int i) {
        b.set(this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            return
        Lb:
            com.zepto.qf6[] r2 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.m(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.pf6.k(int):void");
    }

    public final void l(int i) {
        while (i > 0) {
            qf6[] qf6VarArr = this.a;
            Intrinsics.checkNotNull(qf6VarArr);
            int i2 = (i - 1) / 2;
            qf6 qf6Var = qf6VarArr[i2];
            Intrinsics.checkNotNull(qf6Var);
            qf6 qf6Var2 = qf6VarArr[i];
            Intrinsics.checkNotNull(qf6Var2);
            if (((Comparable) qf6Var).compareTo(qf6Var2) <= 0) {
                return;
            }
            m(i, i2);
            i = i2;
        }
    }

    public final void m(int i, int i2) {
        qf6[] qf6VarArr = this.a;
        Intrinsics.checkNotNull(qf6VarArr);
        qf6 qf6Var = qf6VarArr[i2];
        Intrinsics.checkNotNull(qf6Var);
        qf6 qf6Var2 = qf6VarArr[i];
        Intrinsics.checkNotNull(qf6Var2);
        qf6VarArr[i] = qf6Var;
        qf6VarArr[i2] = qf6Var2;
        qf6Var.a(i);
        qf6Var2.a(i2);
    }
}
