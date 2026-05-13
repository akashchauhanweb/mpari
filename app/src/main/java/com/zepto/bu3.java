package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class bu3 extends dr0 implements au3 {
    public Class n;

    public bu3(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i, str, cls, clsArr, strArr, clsArr2);
        this.n = cls2;
    }

    @Override // com.zepto.u26
    public String a(a86 a86Var) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a86Var.e(i()));
        if (a86Var.b) {
            stringBuffer.append(a86Var.g(n()));
        }
        if (a86Var.b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(a86Var.f(f(), g()));
        stringBuffer.append(".");
        stringBuffer.append(j());
        a86Var.a(stringBuffer, m());
        a86Var.b(stringBuffer, l());
        return stringBuffer.toString();
    }

    public Class n() {
        if (this.n == null) {
            this.n = d(6);
        }
        return this.n;
    }
}
