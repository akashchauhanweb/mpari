package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public class h40 extends c40 {
    public h40(String str) {
        super(str);
    }

    public static h40 c(String str) {
        return d(str.getBytes(m66.a));
    }

    public static h40 d(byte[] bArr) {
        return new h40(f40.g(bArr, true));
    }

    public boolean equals(Object obj) {
        return (obj instanceof h40) && toString().equals(obj.toString());
    }
}
