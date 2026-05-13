package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class lo4 extends rp4 {
    public static final lo4 g = new lo4(true);
    public static final lo4 h = new lo4(false);
    public boolean f;

    public lo4(boolean z) {
        super(1);
        if (z) {
            j("true");
        } else {
            j("false");
        }
        this.f = z;
    }

    @Override // com.zepto.rp4
    public String toString() {
        return this.f ? "true" : "false";
    }
}
