package com.zepto;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class p52 extends RuntimeException {
    public Exception c;
    public String e;

    public p52(Exception exc) {
        super(exc);
        this.c = exc;
        this.e = exc instanceof RuntimeException ? "" : "ExceptionConverter: ";
    }

    public static final RuntimeException a(Exception exc) {
        return exc instanceof RuntimeException ? (RuntimeException) exc : new p52(exc);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.c.getLocalizedMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.c.getMessage();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.e + this.c;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        synchronized (printStream) {
            printStream.print(this.e);
            this.c.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        synchronized (printWriter) {
            printWriter.print(this.e);
            this.c.printStackTrace(printWriter);
        }
    }
}
