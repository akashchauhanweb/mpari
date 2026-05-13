package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class m94 extends RuntimeException {
    public Throwable c;

    public m94(String str, Throwable th) {
        if (th != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Exception while initializing ");
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(th);
            str = stringBuffer.toString();
        }
        super(str);
        this.c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.c;
    }
}
