package com.zepto;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class jy implements xm6 {
    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AtomicInteger b(String str) {
        return new AtomicInteger(Integer.valueOf(str).intValue());
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(AtomicInteger atomicInteger) {
        return atomicInteger.toString();
    }
}
