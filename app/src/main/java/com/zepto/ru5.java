package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class ru5 {
    public static final a c = new a(null);
    public static String d = "";
    public static boolean e;
    public SecretKeySpec a;
    public Cipher b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String cipherText, PrivateKey privateKey) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            Intrinsics.checkNotNullParameter(cipherText, "cipherText");
            if (cipherText.length() == 0 || privateKey == null) {
                return "";
            }
            OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(2, privateKey, oAEPParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(Base64.decode(cipherText, 0));
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "decrypt.doFinal(decoded)");
            return new String(bArrDoFinal, Charsets.UTF_8);
        }

        public final String b(String plainText, PublicKey publicKey) {
            Intrinsics.checkNotNullParameter(plainText, "plainText");
            return c(plainText, publicKey);
        }

        public final String c(String str, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKey);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            String strC = gm2.c(cipher.doFinal(bytes));
            Intrinsics.checkNotNullExpressionValue(strC, "HextoString(cipherText)");
            return strC;
        }

        public final String d(String plainText, PublicKey publicKey) {
            Intrinsics.checkNotNullParameter(plainText, "plainText");
            if (plainText.length() == 0 || publicKey == null) {
                return "";
            }
            OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKey, oAEPParameterSpec);
            byte[] bytes = plainText.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(encode, Base64.DEFAULT)");
            return strEncodeToString;
        }

        public final String e() throws NoSuchAlgorithmException {
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, secureRandom);
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            nn3 nn3Var = nn3.a;
            nn3Var.f("Generated AES Key:==>", secretKeyGenerateKey.toString());
            nn3Var.f("Generated AES Key:==>", secretKeyGenerateKey.getEncoded().toString());
            String strE = gm2.e(secretKeyGenerateKey.getEncoded());
            Intrinsics.checkNotNullExpressionValue(strE, "asHex(key.encoded)");
            nn3Var.f("Generated HexUtil Key:==>", strE);
            String strE2 = gm2.e(secretKeyGenerateKey.getEncoded());
            Intrinsics.checkNotNullExpressionValue(strE2, "asHex(key.encoded)");
            return strE2;
        }

        public final PrivateKey f(String str) {
            try {
                return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
            } catch (InvalidKeySpecException | Exception unused) {
                return null;
            }
        }

        public final PublicKey g(String str) {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            } catch (InvalidKeySpecException | Exception unused) {
                return null;
            }
        }

        public final String h() {
            if (!ru5.e) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "uuid.toString()");
                ru5.d = StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
                ru5.e = true;
            }
            return ru5.d;
        }
    }

    public final String e(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        try {
            if (str2.length() == 0) {
                return "";
            }
            k(str2);
            Cipher cipher = this.b;
            byte[] bArrDoFinal = cipher == null ? null : cipher.doFinal(gm2.b(str));
            Intrinsics.checkNotNull(bArrDoFinal);
            return new String(bArrDoFinal, Charsets.UTF_8);
        } catch (BadPaddingException | Exception unused) {
            return "";
        }
    }

    public final String f(String message, String str) {
        byte[] bArrDoFinal;
        Intrinsics.checkNotNullParameter(message, "message");
        if (str == null) {
            return "";
        }
        try {
            if (str.length() == 0) {
                return "";
            }
            l(str);
            Cipher cipher = this.b;
            if (cipher == null) {
                bArrDoFinal = null;
            } else {
                byte[] bytes = message.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                bArrDoFinal = cipher.doFinal(bytes);
            }
            String strC = gm2.c(bArrDoFinal);
            Intrinsics.checkNotNullExpressionValue(strC, "{\n            if (encryp…extoString(nse)\n        }");
            return strC;
        } catch (BadPaddingException | Exception unused) {
            return "";
        }
    }

    public final String g() {
        a aVar = c;
        return aVar.a(i(), aVar.f(NativeInteractor.a.T()));
    }

    public final String h() {
        try {
            return f("KEY_UUID", NativeInteractor.a.b1());
        } catch (Exception e2) {
            nn3.a.f("TAG", e2.toString());
            return "";
        }
    }

    public final String i() {
        s06 s06VarA = s06.m.a();
        Intrinsics.checkNotNull(s06VarA);
        return s06VarA.u(new ru5().h());
    }

    public final String j() {
        return i();
    }

    public final void k(String str) throws Exception {
        if (str != null) {
            try {
                if (str.length() == 0) {
                    return;
                }
                this.a = new SecretKeySpec(gm2.b(str), "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                this.b = cipher;
                if (cipher == null) {
                    return;
                }
                cipher.init(2, this.a, new IvParameterSpec(new byte[16]));
            } catch (NoSuchAlgorithmException unused) {
                throw new Exception("Invalid Java Version");
            } catch (NoSuchPaddingException unused2) {
                throw new Exception("Invalid Key");
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public final void l(String str) throws Exception {
        if (str != null) {
            try {
                if (str.length() == 0) {
                    return;
                }
                this.a = new SecretKeySpec(gm2.b(str), "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                this.b = cipher;
                if (cipher == null) {
                    return;
                }
                cipher.init(1, this.a, new IvParameterSpec(new byte[16]));
            } catch (InvalidAlgorithmParameterException unused) {
                Cipher cipher2 = this.b;
                if (cipher2 == null) {
                    return;
                }
                cipher2.init(1, this.a, new IvParameterSpec(new byte[12]));
            } catch (NoSuchPaddingException unused2) {
                throw new NoSuchPaddingException("Invalid Key");
            } catch (Exception e2) {
                throw e2;
            } catch (NoSuchMethodError e3) {
                throw e3;
            } catch (NoSuchAlgorithmException unused3) {
                throw new NoSuchAlgorithmException("Invalid Java Version");
            }
        }
    }
}
