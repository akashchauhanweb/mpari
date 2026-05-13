package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public class a70 {
    public String a;

    public String a() {
        return this.a;
    }

    public void b(String str) {
        this.a = str.trim().replace("\\s", "");
    }

    public String toString() {
        return this.a.trim().replace("\\s", "").toString();
    }
}
