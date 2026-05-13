package com.zepto;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class i40 {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
