package com.zepto;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class wi0 {
    public static final void a(t55 t55Var, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = q52.a("Channel was consumed, consumer had failed", th);
            }
        }
        t55Var.d(cancellationExceptionA);
    }
}
