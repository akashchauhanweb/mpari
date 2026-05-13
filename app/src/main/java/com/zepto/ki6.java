package com.zepto;

import com.zepto.m10;

/* JADX INFO: loaded from: classes.dex */
public abstract class ki6 {

    public static abstract class a {
        public abstract ki6 a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new m10.b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
