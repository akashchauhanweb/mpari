package com.zepto;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y66 extends t2 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(y66.class, Object.class, "_state");

    @Volatile
    private volatile Object _state;

    @Override // com.zepto.t2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(w66 w66Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, x66.a);
        return true;
    }

    public final Object e(Continuation continuation) {
        za0 za0Var = new za0(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        za0Var.z();
        if (!o2.a(a, this, x66.a, za0Var)) {
            Result.Companion companion = Result.INSTANCE;
            za0Var.resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
        }
        Object objW = za0Var.w();
        if (objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : Unit.INSTANCE;
    }

    @Override // com.zepto.t2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation[] b(w66 w66Var) {
        a.set(this, null);
        return s2.a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == x66.b) {
                return;
            }
            if (obj == x66.a) {
                if (o2.a(a, this, obj, x66.b)) {
                    return;
                }
            } else if (o2.a(a, this, obj, x66.a)) {
                Result.Companion companion = Result.INSTANCE;
                ((za0) obj).resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = a.getAndSet(this, x66.a);
        Intrinsics.checkNotNull(andSet);
        return andSet == x66.b;
    }
}
