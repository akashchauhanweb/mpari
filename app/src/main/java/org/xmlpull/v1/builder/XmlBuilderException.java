package org.xmlpull.v1.builder;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class XmlBuilderException extends RuntimeException {
    protected Throwable detail;

    public XmlBuilderException(String str) {
        super(str);
    }

    public Throwable getDetail() {
        return this.detail;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.detail == null) {
            return super.getMessage();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.getMessage());
        stringBuffer.append("; nested exception is: \n\t");
        stringBuffer.append(this.detail.getMessage());
        return stringBuffer.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        if (this.detail == null) {
            super.printStackTrace(printStream);
            return;
        }
        synchronized (printStream) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(super.getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            this.detail.printStackTrace(printStream);
        }
    }

    public XmlBuilderException(String str, Throwable th) {
        super(str);
        this.detail = th;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        if (this.detail == null) {
            super.printStackTrace(printWriter);
            return;
        }
        synchronized (printWriter) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(super.getMessage());
            stringBuffer.append("; nested exception is:");
            printWriter.println(stringBuffer.toString());
            this.detail.printStackTrace(printWriter);
        }
    }
}
