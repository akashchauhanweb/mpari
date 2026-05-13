package com.zepto;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class oc5 {

    public static class a implements ThreadFactory {
        public String a;
        public int b;

        /* JADX INFO: renamed from: com.zepto.oc5$a$a, reason: collision with other inner class name */
        public static class C0109a extends Thread {
            public final int c;

            public C0109a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.c = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.c);
                super.run();
            }
        }

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0109a(runnable, this.a, this.b);
        }
    }

    public static class b implements Runnable {
        public Callable c;
        public ux0 e;
        public Handler f;

        public class a implements Runnable {
            public final /* synthetic */ ux0 c;
            public final /* synthetic */ Object e;

            public a(ux0 ux0Var, Object obj) {
                this.c = ux0Var;
                this.e = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.c.a(this.e);
            }
        }

        public b(Handler handler, Callable callable, ux0 ux0Var) {
            this.c = callable;
            this.e = ux0Var;
            this.f = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.c.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f.post(new a(this.e, objCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, ux0 ux0Var) {
        executor.execute(new b(la0.a(), callable, ux0Var));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
