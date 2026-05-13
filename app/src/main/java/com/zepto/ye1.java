package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import android.app.Activity;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ye1 {
    public static final ye1 a = new ye1();

    public static final void c() {
        Activity activityR = jt.c.r();
        Toast.makeText(activityR == null ? null : activityR.getApplicationContext(), "Unable to load feature/temp file", 0).show();
    }

    public final byte[] b(byte[] bArr) {
        Activity activityR;
        try {
            String strE = e();
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = strE.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            String strD = d();
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes2 = strD.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bytes2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, gCMParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            nn3.a.b("DecryptGcmEncFile", e.toString(), e);
            if (!StringsKt__StringsKt.contains((CharSequence) e.toString(), (CharSequence) "mac check in GCM failed", true) || (activityR = jt.c.r()) == null) {
                return null;
            }
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.xe1
                @Override // java.lang.Runnable
                public final void run() {
                    ye1.c();
                }
            });
            return null;
        }
    }

    public final String d() {
        return NativeInteractor.a.z();
    }

    public final String e() {
        return NativeInteractor.a.A();
    }

    public final byte[] f(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
