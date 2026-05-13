package com.zepto;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q52 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
