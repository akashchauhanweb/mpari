package com.zepto;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rf6 {
    public final CoroutineContext a;
    public final Object[] b;
    public final kf6[] c;
    public int d;

    public rf6(CoroutineContext coroutineContext, int i) {
        this.a = coroutineContext;
        this.b = new Object[i];
        this.c = new kf6[i];
    }

    public final void a(kf6 kf6Var, Object obj) {
        Object[] objArr = this.b;
        int i = this.d;
        objArr[i] = obj;
        kf6[] kf6VarArr = this.c;
        this.d = i + 1;
        Intrinsics.checkNotNull(kf6Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        kf6VarArr[i] = kf6Var;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            kf6 kf6Var = this.c[length];
            Intrinsics.checkNotNull(kf6Var);
            kf6Var.n(coroutineContext, this.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
