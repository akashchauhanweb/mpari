package com.zepto;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public abstract class sb8 {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
