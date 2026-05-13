package com.zepto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u31 {
    public static final a a = new a(null);
    public static final String b = "ZECSirpdrJ6BT5xgGHtLXEq+RN7YSh/V0DSnzbkCrnA=";
    public static final String c = "ssshhhhhhhhhhh!!!!";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            Intrinsics.checkNotNullParameter(str, "str");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            String unused = u31.b;
            String strEncodeToString = Base64.getEncoder().encodeToString(b(bytes, Base64.getDecoder().decode(u31.b)));
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }

        public final byte[] b(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            byte[] bArr3 = new byte[12];
            new SecureRandom().nextBytes(bArr3);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr3));
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] bArr4 = new byte[bArrDoFinal.length + 12];
            System.arraycopy(bArr3, 0, bArr4, 0, 12);
            System.arraycopy(bArrDoFinal, 0, bArr4, 12, bArrDoFinal.length);
            return bArr4;
        }
    }
}
