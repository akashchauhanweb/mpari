package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dr0 extends ns3 {
    public Class[] k;
    public String[] l;
    public Class[] m;

    public dr0(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i, str, cls);
        this.k = clsArr;
        this.l = strArr;
        this.m = clsArr2;
    }

    public Class[] l() {
        if (this.m == null) {
            this.m = e(5);
        }
        return this.m;
    }

    public Class[] m() {
        if (this.k == null) {
            this.k = e(3);
        }
        return this.k;
    }
}
