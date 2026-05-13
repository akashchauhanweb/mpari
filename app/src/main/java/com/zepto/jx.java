package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class jx extends vc6 {
    public static volatile jx c;
    public static final Executor d = new Executor() { // from class: com.zepto.hx
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            jx.h(runnable);
        }
    };
    public static final Executor e = new Executor() { // from class: com.zepto.ix
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            jx.i(runnable);
        }
    };
    public vc6 a;
    public final vc6 b;

    public jx() {
        lg1 lg1Var = new lg1();
        this.b = lg1Var;
        this.a = lg1Var;
    }

    public static Executor f() {
        return e;
    }

    public static jx g() {
        if (c != null) {
            return c;
        }
        synchronized (jx.class) {
            try {
                if (c == null) {
                    c = new jx();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static /* synthetic */ void h(Runnable runnable) {
        g().c(runnable);
    }

    public static /* synthetic */ void i(Runnable runnable) {
        g().a(runnable);
    }

    @Override // com.zepto.vc6
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // com.zepto.vc6
    public boolean b() {
        return this.a.b();
    }

    @Override // com.zepto.vc6
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}
