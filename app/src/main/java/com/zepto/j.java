package com.zepto;

import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static final j a = new j();

    public final String a(String input, String key) {
        byte[] bArrDoFinal;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Charset charset = Charsets.UTF_8;
            byte[] bytes = key.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            byte[] bytes2 = input.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            bArrDoFinal = cipher.doFinal(d40.q(bytes2));
        } catch (Exception e) {
            System.out.println((Object) e.toString());
            bArrDoFinal = null;
        }
        Intrinsics.checkNotNull(bArrDoFinal);
        return new String(bArrDoFinal, Charsets.UTF_8);
    }

    public final String b(String input, String key) {
        byte[] bArrDoFinal;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Charset charset = Charsets.UTF_8;
            byte[] bytes = key.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            byte[] bytes2 = input.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            bArrDoFinal = cipher.doFinal(bytes2);
        } catch (Exception e) {
            System.out.println((Object) e.toString());
            bArrDoFinal = null;
        }
        byte[] bArrR = d40.r(bArrDoFinal);
        Intrinsics.checkNotNullExpressionValue(bArrR, "encodeBase64(...)");
        return new String(bArrR, Charsets.UTF_8);
    }
}
