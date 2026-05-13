package com.zepto;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f43 extends CancellationException {
    public final transient e43 c;

    public f43(String str, Throwable th, e43 e43Var) {
        super(str);
        this.c = e43Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f43) {
                f43 f43Var = (f43) obj;
                if (!Intrinsics.areEqual(f43Var.getMessage(), getMessage()) || !Intrinsics.areEqual(f43Var.c, this.c) || !Intrinsics.areEqual(f43Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode = ((message.hashCode() * 31) + this.c.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.c;
    }
}
