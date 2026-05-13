package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class rz0 {
    public static final String a = "_COROUTINE";

    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
