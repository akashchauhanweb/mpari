package com.zepto;

import com.zepto.b10;

/* JADX INFO: loaded from: classes.dex */
public abstract class in3 {

    public static abstract class a {
        public abstract in3 a();

        public abstract a b(Integer num);

        public abstract a c(long j);

        public abstract a d(long j);

        public abstract a e(f44 f44Var);

        public abstract a f(byte[] bArr);

        public abstract a g(String str);

        public abstract a h(long j);
    }

    public static a a() {
        return new b10.b();
    }

    public static a i(String str) {
        return a().g(str);
    }

    public static a j(byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract f44 e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
