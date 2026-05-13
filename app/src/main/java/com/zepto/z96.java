package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class z96 implements wq0 {
    public static z96 a;

    public static z96 b() {
        if (a == null) {
            a = new z96();
        }
        return a;
    }

    @Override // com.zepto.wq0
    public long a() {
        return System.currentTimeMillis();
    }
}
