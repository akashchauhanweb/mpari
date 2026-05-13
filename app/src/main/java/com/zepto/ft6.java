package com.zepto;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ft6 {
    public static final Charset a = Charset.forName("UTF-8");

    public static Integer a() {
        if (b()) {
            return d80.a();
        }
        return null;
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & ByteCompanionObject.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        }
        return i;
    }

    public static final byte d(char c) {
        if (c >= '!' && c <= '~') {
            return (byte) c;
        }
        throw new eg6("Not a printable ASCII character: " + c);
    }

    public static final x80 e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = d(str.charAt(i));
        }
        return x80.a(bArr);
    }
}
