package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oc6 {
    public bd6 a;
    public long b;
    public final String c;
    public final boolean d;

    public oc6(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.c = name;
        this.d = z;
        this.b = -1L;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final bd6 d() {
        return this.a;
    }

    public final void e(bd6 queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        bd6 bd6Var = this.a;
        if (bd6Var == queue) {
            return;
        }
        if (!(bd6Var == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.a = queue;
    }

    public abstract long f();

    public final void g(long j) {
        this.b = j;
    }

    public String toString() {
        return this.c;
    }

    public /* synthetic */ oc6(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
