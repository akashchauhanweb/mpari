package com.zepto;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class zy0 implements yz0 {
    public final CoroutineContext c;

    public zy0(CoroutineContext coroutineContext) {
        this.c = coroutineContext;
    }

    @Override // com.zepto.yz0
    public CoroutineContext c() {
        return this.c;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + c() + ')';
    }
}
