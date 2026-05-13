package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class z30 {
    public static final z30 b = new z30("QR_CODE");
    public static final z30 c = new z30("DATAMATRIX");
    public static final z30 d = new z30("UPC_E");
    public static final z30 e = new z30("UPC_A");
    public static final z30 f = new z30("EAN_8");
    public static final z30 g = new z30("EAN_13");
    public static final z30 h = new z30("CODE_128");
    public static final z30 i = new z30("CODE_39");
    public static final z30 j = new z30("ITF");
    public final String a;

    public z30(String str) {
        this.a = str;
    }

    public String toString() {
        return this.a;
    }
}
