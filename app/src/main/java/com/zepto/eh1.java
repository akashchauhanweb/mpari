package com.zepto;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class eh1 {
    public static final String e = rn3.i("DelayedWorkTracker");
    public final ro5 a;
    public final lf5 b;
    public final xq0 c;
    public final Map d = new HashMap();

    public class a implements Runnable {
        public final /* synthetic */ yy7 c;

        public a(yy7 yy7Var) {
            this.c = yy7Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            rn3.e().a(eh1.e, "Scheduling work " + this.c.a);
            eh1.this.a.c(this.c);
        }
    }

    public eh1(ro5 ro5Var, lf5 lf5Var, xq0 xq0Var) {
        this.a = ro5Var;
        this.b = lf5Var;
        this.c = xq0Var;
    }

    public void a(yy7 yy7Var, long j) {
        Runnable runnable = (Runnable) this.d.remove(yy7Var.a);
        if (runnable != null) {
            this.b.b(runnable);
        }
        a aVar = new a(yy7Var);
        this.d.put(yy7Var.a, aVar);
        this.b.a(j - this.c.a(), aVar);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.d.remove(str);
        if (runnable != null) {
            this.b.b(runnable);
        }
    }
}
