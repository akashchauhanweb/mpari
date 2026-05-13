package com.zepto;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class q06 extends t2 {
    public long a = -1;
    public Continuation b;

    @Override // com.zepto.t2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(o06 o06Var) {
        if (this.a >= 0) {
            return false;
        }
        this.a = o06Var.U();
        return true;
    }

    @Override // com.zepto.t2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Continuation[] b(o06 o06Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return o06Var.T(j);
    }
}
