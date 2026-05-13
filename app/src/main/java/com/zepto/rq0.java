package com.zepto;

import com.zepto.s00;

/* JADX INFO: loaded from: classes.dex */
public abstract class rq0 {

    public static abstract class a {
        public abstract rq0 a();

        public abstract a b(zo zoVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        public final int c;

        b(int i) {
            this.c = i;
        }
    }

    public static a a() {
        return new s00.b();
    }

    public abstract zo b();

    public abstract b c();
}
