package com.zepto;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class fd6 {
    public static Object a(pc6 pc6Var) throws InterruptedException {
        wb8.a(pc6Var, "Task must not be null");
        if (pc6Var.g()) {
            return d(pc6Var);
        }
        ek8 ek8Var = new ek8(null);
        e(pc6Var, ek8Var);
        ek8Var.c();
        return d(pc6Var);
    }

    public static pc6 b(Exception exc) {
        kj8 kj8Var = new kj8();
        kj8Var.i(exc);
        return kj8Var;
    }

    public static pc6 c(Object obj) {
        kj8 kj8Var = new kj8();
        kj8Var.j(obj);
        return kj8Var;
    }

    public static Object d(pc6 pc6Var) throws ExecutionException {
        if (pc6Var.h()) {
            return pc6Var.f();
        }
        throw new ExecutionException(pc6Var.e());
    }

    public static void e(pc6 pc6Var, ok8 ok8Var) {
        Executor executor = wc6.b;
        pc6Var.d(executor, ok8Var);
        pc6Var.b(executor, ok8Var);
    }
}
