package com.zepto;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r2 {
    public t2[] a;
    public int b;
    public int c;

    public final t2 f() {
        t2 t2VarG;
        synchronized (this) {
            try {
                t2[] t2VarArrH = this.a;
                if (t2VarArrH == null) {
                    t2VarArrH = h(2);
                    this.a = t2VarArrH;
                } else if (this.b >= t2VarArrH.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(t2VarArrH, t2VarArrH.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                    this.a = (t2[]) objArrCopyOf;
                    t2VarArrH = (t2[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    t2VarG = t2VarArrH[i];
                    if (t2VarG == null) {
                        t2VarG = g();
                        t2VarArrH[i] = t2VarG;
                    }
                    i++;
                    if (i >= t2VarArrH.length) {
                        i = 0;
                    }
                    Intrinsics.checkNotNull(t2VarG, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!t2VarG.a(this));
                this.c = i;
                this.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t2VarG;
    }

    public abstract t2 g();

    public abstract t2[] h(int i);

    public final void i(t2 t2Var) {
        int i;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                if (i2 == 0) {
                    this.c = 0;
                }
                Intrinsics.checkNotNull(t2Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrB = t2Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
            }
        }
    }

    public final int j() {
        return this.b;
    }

    public final t2[] k() {
        return this.a;
    }
}
