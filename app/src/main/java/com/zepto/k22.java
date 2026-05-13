package com.zepto;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k22 {
    public static final Charset a = StandardCharsets.UTF_8;

    public static String a(String str, String str2) {
        try {
            Base64.Decoder decoder = Base64.getDecoder();
            Charset charset = a;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(decoder.decode(str.getBytes(charset)));
            byte[] bArr = new byte[12];
            byteBufferWrap.get(bArr);
            byte[] bArr2 = new byte[16];
            byteBufferWrap.get(bArr2);
            byte[] bArr3 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr3);
            SecretKey secretKeyA = t31.a(str2.toCharArray(), bArr2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeyA, new GCMParameterSpec(128, bArr));
            byte[] bArrDoFinal = cipher.doFinal(bArr3);
            Log.e("plainText", new String(bArrDoFinal, charset));
            return new String(bArrDoFinal, charset);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            return "";
        }
    }
}
