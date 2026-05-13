package com.zepto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public abstract class t12 {
    public static String a = "EncUtil";

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Integer.valueOf(b & UByte.MAX_VALUE)));
        }
        return sb.toString();
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            return a(messageDigest.digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            nn3.a.b(a, "Exception  :: " + e.getMessage(), e);
            return null;
        }
    }
}
