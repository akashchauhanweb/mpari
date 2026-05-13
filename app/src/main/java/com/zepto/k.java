package com.zepto;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final byte[] a = b();

    public static String a(String str, String str2) {
        byte[] bArrDoFinal;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            bArrDoFinal = cipher.doFinal(str.getBytes());
        } catch (Exception e) {
            System.out.println(e.toString());
            bArrDoFinal = null;
        }
        return new String(Base64.encodeToString(bArrDoFinal, 0));
    }

    public static byte[] b() {
        byte[] bArr = new byte[128];
        for (int i = 0; i < 128; i++) {
            bArr[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            bArr[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            bArr[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            bArr[i4] = (byte) (i4 + 4);
        }
        bArr[43] = 62;
        bArr[47] = 63;
        bArr[61] = ByteCompanionObject.MAX_VALUE;
        return bArr;
    }
}
