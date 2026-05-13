package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class a56 implements z46 {
    public Class a;
    public String b;
    public int c;

    public a56(Class cls, String str, int i) {
        this.a = cls;
        this.b = str;
        this.c = i;
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a());
        stringBuffer.append(":");
        stringBuffer.append(b());
        return stringBuffer.toString();
    }
}
