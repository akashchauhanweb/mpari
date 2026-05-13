package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.zepto.c70;
import com.zepto.cu0;
import com.zepto.hf3;
import com.zepto.iu0;
import com.zepto.j41;
import com.zepto.kp6;
import com.zepto.ky4;
import com.zepto.lb3;
import com.zepto.lp6;
import com.zepto.nx4;
import com.zepto.sh1;
import com.zepto.ut0;
import com.zepto.v30;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final lb3 a = new lb3(new nx4() { // from class: com.zepto.h62
        @Override // com.zepto.nx4
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });
    public static final lb3 b = new lb3(new nx4() { // from class: com.zepto.i62
        @Override // com.zepto.nx4
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });
    public static final lb3 c = new lb3(new nx4() { // from class: com.zepto.j62
        @Override // com.zepto.nx4
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });
    public static final lb3 d = new lb3(new nx4() { // from class: com.zepto.k62
        @Override // com.zepto.nx4
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i) {
        return new j41(str, i, null);
    }

    public static ThreadFactory k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new j41(str, i, threadPolicy);
    }

    public static /* synthetic */ ScheduledExecutorService l(cu0 cu0Var) {
        return (ScheduledExecutorService) a.get();
    }

    public static /* synthetic */ ScheduledExecutorService m(cu0 cu0Var) {
        return (ScheduledExecutorService) c.get();
    }

    public static /* synthetic */ ScheduledExecutorService n(cu0 cu0Var) {
        return (ScheduledExecutorService) b.get();
    }

    public static /* synthetic */ Executor o(cu0 cu0Var) {
        return kp6.INSTANCE;
    }

    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    public static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new sh1(executorService, (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(ut0.d(ky4.a(v30.class, ScheduledExecutorService.class), ky4.a(v30.class, ExecutorService.class), ky4.a(v30.class, Executor.class)).e(new iu0() { // from class: com.zepto.l62
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return ExecutorsRegistrar.l(cu0Var);
            }
        }).d(), ut0.d(ky4.a(c70.class, ScheduledExecutorService.class), ky4.a(c70.class, ExecutorService.class), ky4.a(c70.class, Executor.class)).e(new iu0() { // from class: com.zepto.m62
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return ExecutorsRegistrar.m(cu0Var);
            }
        }).d(), ut0.d(ky4.a(hf3.class, ScheduledExecutorService.class), ky4.a(hf3.class, ExecutorService.class), ky4.a(hf3.class, Executor.class)).e(new iu0() { // from class: com.zepto.n62
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return ExecutorsRegistrar.n(cu0Var);
            }
        }).d(), ut0.c(ky4.a(lp6.class, Executor.class)).e(new iu0() { // from class: com.zepto.o62
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return ExecutorsRegistrar.o(cu0Var);
            }
        }).d());
    }
}
