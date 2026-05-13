package com.zepto;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class bp extends AbstractCoroutineContextElement implements tz0 {
    private volatile Object _preHandler;

    public bp() {
        super(tz0.b);
        this._preHandler = this;
    }

    @Override // com.zepto.tz0
    public void k0(CoroutineContext coroutineContext, Throwable th) {
        if (Build.VERSION.SDK_INT < 28) {
            Method methodX0 = x0();
            Object objInvoke = methodX0 != null ? methodX0.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    public final Method x0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }
}
