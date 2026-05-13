package com.zepto;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class ae1 implements xm6 {
    public final wd1 a;

    public ae1(Class cls) {
        this.a = new wd1(cls);
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized Date b(String str) {
        return this.a.a(Long.valueOf(be1.a(str).getTime()));
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized String a(Date date) {
        return be1.c(date);
    }
}
