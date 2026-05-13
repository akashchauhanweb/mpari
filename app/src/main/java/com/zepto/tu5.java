package com.zepto;

import com.nic.mparivahan.APIController;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tu5 {
    public static final a a = new a(null);
    public static String b = APIController.a().getAuth();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.String r12, java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.tu5.a.a(java.lang.String, java.lang.String):java.lang.String");
        }

        public final String b(String strToEncrypt, String stock) {
            String str;
            Intrinsics.checkNotNullParameter(strToEncrypt, "strToEncrypt");
            Intrinsics.checkNotNullParameter(stock, "stock");
            Security.addProvider(new m70());
            try {
                String strValueOf = String.valueOf(new cf4(stock).a().get(APIController.a().getConst()));
                Charset charsetForName = Charset.forName("UTF8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = strValueOf.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                Charset charsetForName2 = Charset.forName("UTF8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                byte[] bytes2 = strToEncrypt.getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                synchronized (Cipher.class) {
                    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
                    cipher.init(1, secretKeySpec);
                    byte[] bArr = new byte[cipher.getOutputSize(bytes2.length)];
                    cipher.doFinal(bArr, cipher.update(bytes2, 0, bytes2.length, bArr, 0));
                    byte[] bArrB = e40.b(bArr);
                    Intrinsics.checkNotNullExpressionValue(bArrB, "encode(...)");
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes3 = new String(bArrB, charset).getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bArrB2 = e40.b(bytes3);
                    Intrinsics.checkNotNullExpressionValue(bArrB2, "encode(...)");
                    str = new String(bArrB2, charset);
                }
                return str;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "Error";
            } catch (InvalidKeyException e2) {
                e2.printStackTrace();
                return "Error";
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
                return "Error";
            } catch (BadPaddingException e4) {
                e4.printStackTrace();
                return "Error";
            } catch (IllegalBlockSizeException e5) {
                e5.printStackTrace();
                return "Error";
            } catch (NoSuchPaddingException e6) {
                e6.printStackTrace();
                return "Error";
            } catch (ShortBufferException e7) {
                e7.printStackTrace();
                return "Error";
            } catch (Exception e8) {
                e8.printStackTrace();
                return "Error";
            }
        }
    }
}
