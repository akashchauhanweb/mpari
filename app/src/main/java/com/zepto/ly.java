package com.zepto;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class ly implements xm6 {
    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AtomicLong b(String str) {
        return new AtomicLong(Long.valueOf(str).longValue());
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(AtomicLong atomicLong) {
        return atomicLong.toString();
    }
}
