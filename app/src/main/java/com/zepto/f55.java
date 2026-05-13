package com.zepto;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class f55 implements v66, od2 {
    public final e43 a;
    public final /* synthetic */ v66 b;

    public f55(v66 v66Var, e43 e43Var) {
        this.a = e43Var;
        this.b = v66Var;
    }

    @Override // com.zepto.n06, com.zepto.od2
    public Object a(pd2 pd2Var, Continuation continuation) {
        return this.b.a(pd2Var, continuation);
    }

    @Override // com.zepto.v66
    public Object getValue() {
        return this.b.getValue();
    }
}
