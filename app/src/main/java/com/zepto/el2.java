package com.zepto;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class el2 {
    public static final dl2 a;
    private static volatile Choreographer choreographer;

    static {
        Object objM6constructorimpl;
        byte b = 0;
        byte b2 = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM6constructorimpl = Result.m6constructorimpl(new cl2(a(Looper.getMainLooper(), true), b2 == true ? 1 : 0, 2, b == true ? 1 : 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM6constructorimpl = Result.m6constructorimpl(ResultKt.createFailure(th));
        }
        a = (dl2) (Result.m12isFailureimpl(objM6constructorimpl) ? null : objM6constructorimpl);
    }

    public static final Handler a(Looper looper, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
