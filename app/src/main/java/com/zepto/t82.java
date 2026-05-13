package com.zepto;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class t82 {
    public static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new m14(str));
    }

    public static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    public static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new m14("Firebase-Messaging-Init"));
    }

    public static ExecutorService d() {
        return us4.a().a(new m14("Firebase-Messaging-Intent-Handle"), of6.HIGH_SPEED);
    }

    public static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new m14("Firebase-Messaging-Network-Io"));
    }

    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new m14("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new m14("Firebase-Messaging-Topics-Io"));
    }
}
