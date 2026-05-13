package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public class r72 extends Error {
    public Exception c;

    public r72(String str, Exception exc) {
        super(str);
        this.c = exc;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.c) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.c.getClass().toString() : message2;
    }
}
