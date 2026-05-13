package com.zepto;

import android.content.Context;
import android.util.Log;
import com.zepto.u33;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class qi5 {
    public static RSAPublicKey b;
    public static final a a = new a(null);
    public static final String c = "720";
    public static final String d = "sarEtrans25Ms";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str, HashMap map, String str2) throws Throwable {
            d(str);
            Date date = new Date();
            Date date2 = new Date(date.getTime() + (Long.parseLong(qi5.c) * ((long) 1000)));
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            map.putAll(new u33.b().d(qi5.d).g(str2).b(date2).f(date).c(date).e(string).a().f());
            r33 r33Var = new r33(new o33(l33.k, j22.o), new xm4(map));
            try {
                r33Var.c(new w35(qi5.b));
                String strH = r33Var.h();
                Intrinsics.checkNotNullExpressionValue(strH, "serialize(...)");
                return strH;
            } catch (f33 e) {
                throw new RuntimeException("Encryption failed", e);
            }
        }

        public final String b(String aadhaarNumber) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            Intrinsics.checkNotNullParameter(aadhaarNumber, "aadhaarNumber");
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.getDecoder().decode("mUI66/XQZ0KfpKwbfh3/LYcFTM1nnHl8kV0+PkD40fw="), "AES");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr));
            byte[] bytes = aadhaarNumber.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            byte[] bArr2 = new byte[bArrDoFinal.length + 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArrDoFinal, 0, bArr2, 16, bArrDoFinal.length);
            String strEncodeToString = Base64.getEncoder().encodeToString(bArr2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }

        public final String c(Context context) {
            FileOutputStream fileOutputStream;
            byte[] bArr;
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                File file = new File(context.getFilesDir(), "public.key");
                if (!file.exists()) {
                    InputStream inputStreamOpen = context.getAssets().open("keys/mparivahan/public.key");
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            bArr = new byte[1024];
                        } finally {
                        }
                    } finally {
                    }
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(inputStreamOpen, null);
                }
                HashMap map = new HashMap();
                map.put("USER", "mParivahan");
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                return a(absolutePath, map, null);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.io.ObjectInputStream] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        public final void d(String str) throws Throwable {
            StringBuilder sb;
            ObjectInputStream objectInputStream;
            String str2;
            ?? r3 = 0;
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    Log.d("readKeyFromFile", str);
                    objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(str)));
                    try {
                        Object object = objectInputStream.readObject();
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.math.BigInteger");
                        Object object2 = objectInputStream.readObject();
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.math.BigInteger");
                        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec((BigInteger) object, (BigInteger) object2));
                        str2 = "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey";
                        Intrinsics.checkNotNull(publicKeyGeneratePublic, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
                        qi5.b = (RSAPublicKey) publicKeyGeneratePublic;
                    } catch (Exception e) {
                        e = e;
                        objectInputStream2 = objectInputStream;
                        Log.e("readKeyFromFile", "Error: " + e.getMessage(), e);
                        r3 = objectInputStream2;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                                r3 = objectInputStream2;
                            } catch (Exception e2) {
                                e = e2;
                                sb = new StringBuilder();
                                sb.append("Stream close error: ");
                                sb.append(e.getMessage());
                                Log.e("readKeyFromFile", sb.toString());
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r3 = objectInputStream;
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (Exception e3) {
                                Log.e("readKeyFromFile", "Stream close error: " + e3.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    objectInputStream.close();
                    r3 = str2;
                } catch (Exception e5) {
                    e = e5;
                    sb = new StringBuilder();
                    sb.append("Stream close error: ");
                    sb.append(e.getMessage());
                    Log.e("readKeyFromFile", sb.toString());
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
