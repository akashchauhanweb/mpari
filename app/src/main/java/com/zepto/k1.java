package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1 {
    public static String a(int i, int i2) {
        StringBuilder sb;
        String str;
        if (i == 64) {
            sb = new StringBuilder();
            str = "[APPLICATION ";
        } else if (i == 128) {
            sb = new StringBuilder();
            str = "[CONTEXT ";
        } else if (i != 192) {
            sb = new StringBuilder();
            str = "[UNIVERSAL ";
        } else {
            sb = new StringBuilder();
            str = "[PRIVATE ";
        }
        sb.append(str);
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }
}
