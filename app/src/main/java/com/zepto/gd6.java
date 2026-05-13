package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gd6 {
    public static Object a(Task task) throws InterruptedException {
        iu4.g();
        iu4.j(task, "Task must not be null");
        if (task.n()) {
            return f(task);
        }
        r68 r68Var = new r68(null);
        g(task, r68Var);
        r68Var.d();
        return f(task);
    }

    public static Object b(Task task, long j, TimeUnit timeUnit) throws TimeoutException {
        iu4.g();
        iu4.j(task, "Task must not be null");
        iu4.j(timeUnit, "TimeUnit must not be null");
        if (task.n()) {
            return f(task);
        }
        r68 r68Var = new r68(null);
        g(task, r68Var);
        if (r68Var.e(j, timeUnit)) {
            return f(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task c(Executor executor, Callable callable) {
        iu4.j(executor, "Executor must not be null");
        iu4.j(callable, "Callback must not be null");
        mm8 mm8Var = new mm8();
        executor.execute(new en8(mm8Var, callable));
        return mm8Var;
    }

    public static Task d(Exception exc) {
        mm8 mm8Var = new mm8();
        mm8Var.q(exc);
        return mm8Var;
    }

    public static Task e(Object obj) {
        mm8 mm8Var = new mm8();
        mm8Var.r(obj);
        return mm8Var;
    }

    public static Object f(Task task) throws ExecutionException {
        if (task.o()) {
            return task.k();
        }
        if (task.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.j());
    }

    public static void g(Task task, u68 u68Var) {
        Executor executor = xc6.b;
        task.g(executor, u68Var);
        task.e(executor, u68Var);
        task.a(executor, u68Var);
    }
}
