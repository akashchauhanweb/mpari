package com.zepto;

import com.zepto.c10;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class kn3 {

    public static abstract class a {
        public abstract kn3 a();

        public abstract a b(rq0 rq0Var);

        public abstract a c(List list);

        public abstract a d(Integer num);

        public abstract a e(String str);

        public abstract a f(jy4 jy4Var);

        public abstract a g(long j);

        public abstract a h(long j);

        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new c10.b();
    }

    public abstract rq0 b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract jy4 f();

    public abstract long g();

    public abstract long h();
}
