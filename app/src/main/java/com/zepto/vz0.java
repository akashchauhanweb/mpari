package com.zepto;

import java.util.Iterator;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vz0 {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Iterator it = uz0.a().iterator();
        while (it.hasNext()) {
            try {
                ((tz0) it.next()).k0(coroutineContext, th);
            } catch (Throwable th2) {
                uz0.b(wz0.b(th, th2));
            }
        }
        try {
            ExceptionsKt__ExceptionsKt.addSuppressed(th, new qj1(coroutineContext));
        } catch (Throwable unused) {
        }
        uz0.b(th);
    }
}
