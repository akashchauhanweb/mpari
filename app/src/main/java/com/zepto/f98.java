package com.zepto;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class f98 {
    public static volatile ClassLoader a;
    public static volatile Thread b;

    public static synchronized ClassLoader a() {
        try {
            if (a == null) {
                a = b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static synchronized ClassLoader b() {
        ClassLoader contextClassLoader = null;
        if (b == null) {
            b = c();
            if (b == null) {
                return null;
            }
        }
        synchronized (b) {
            try {
                contextClassLoader = b.getContextClassLoader();
            } catch (SecurityException e) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e.getMessage());
            }
        }
        return contextClassLoader;
    }

    public static synchronized Thread c() {
        SecurityException e;
        Thread w58Var;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                try {
                    int iActiveGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= iActiveGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int iActiveCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[iActiveCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= iActiveCount) {
                            thread = null;
                            break;
                        }
                        thread = threadArr[i];
                        if ("GmsDynamite".equals(thread.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    w58Var = null;
                }
                if (thread == null) {
                    try {
                        w58Var = new w58(threadGroup, "GmsDynamite");
                    } catch (SecurityException e3) {
                        e = e3;
                        w58Var = thread;
                    }
                    try {
                        w58Var.setContextClassLoader(null);
                        w58Var.start();
                    } catch (SecurityException e4) {
                        e = e4;
                        Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                    }
                    thread = w58Var;
                }
            } finally {
            }
        }
        return thread;
    }
}
