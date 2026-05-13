package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.content.pm.Signature;
import com.nic.mparivahan.APIController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class qu {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(byte[] bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            char[] cArr2 = new char[bytes.length * 2];
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                byte b = bytes[i];
                int i2 = i * 2;
                cArr2[i2] = cArr[(b & UByte.MAX_VALUE) >>> 4];
                cArr2[i2 + 1] = cArr[b & 15];
            }
            return new String(cArr2);
        }

        public final String b(byte[] bArr) {
            MessageDigest messageDigest;
            try {
                messageDigest = MessageDigest.getInstance("SHA256");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                messageDigest = null;
            }
            Intrinsics.checkNotNull(messageDigest);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNull(bArrDigest);
            return a(bArrDigest);
        }

        public final boolean c(Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            try {
                new a90(applicationContext);
                Signature[] signatures = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 64).signatures;
                Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                for (Signature signature : signatures) {
                    if (Intrinsics.areEqual(APIController.a().getSigToken(), String.valueOf(b(signature.toByteArray())))) {
                        return true;
                    }
                    ((Activity) applicationContext).finish();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
    }
}
