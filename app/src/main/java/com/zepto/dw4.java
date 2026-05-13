package com.zepto;

import com.zepto.my5;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class dw4 extends mi0 implements ew4 {
    public dw4(CoroutineContext coroutineContext, li0 li0Var) {
        super(coroutineContext, li0Var, true, true);
    }

    @Override // com.zepto.e2
    public void D0(Throwable th, boolean z) {
        if (H0().b(th) || z) {
            return;
        }
        wz0.a(getContext(), th);
    }

    @Override // com.zepto.e2
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public void E0(Unit unit) {
        my5.a.a(H0(), null, 1, null);
    }

    @Override // com.zepto.e2, com.zepto.p43, com.zepto.e43
    public boolean isActive() {
        return super.isActive();
    }

    @Override // com.zepto.ew4
    public /* bridge */ /* synthetic */ my5 m() {
        return G0();
    }
}
