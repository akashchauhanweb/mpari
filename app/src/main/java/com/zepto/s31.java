package com.zepto;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.zepto.ec2;
import com.zepto.k60;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public abstract class s31 {

    public static class a {
        public static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        public static KeyGenParameterSpec.Builder b(String str, int i) {
            return new KeyGenParameterSpec.Builder(str, i);
        }

        public static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        public static void d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        public static void e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    public static class b {
        public static BiometricPrompt.CryptoObject a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        public static BiometricPrompt.CryptoObject b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        public static BiometricPrompt.CryptoObject c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        public static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        public static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        public static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    public static class c {
        public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    public static class d {
        public static BiometricPrompt.CryptoObject a(PresentationSession presentationSession) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }

        public static PresentationSession b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    public static k60.c a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = a.b("androidxBiometric", 3);
            a.d(builderB);
            a.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(keyGenerator, a.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new k60.c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static k60.c b(BiometricPrompt.CryptoObject cryptoObject) {
        PresentationSession presentationSessionB;
        IdentityCredential identityCredentialB;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipherD = b.d(cryptoObject);
        if (cipherD != null) {
            return new k60.c(cipherD);
        }
        Signature signatureF = b.f(cryptoObject);
        if (signatureF != null) {
            return new k60.c(signatureF);
        }
        Mac macE = b.e(cryptoObject);
        if (macE != null) {
            return new k60.c(macE);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (identityCredentialB = c.b(cryptoObject)) != null) {
            return new k60.c(identityCredentialB);
        }
        if (i < 33 || (presentationSessionB = d.b(cryptoObject)) == null) {
            return null;
        }
        return new k60.c(presentationSessionB);
    }

    public static k60.c c(ec2.e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher cipherA = eVar.a();
        if (cipherA != null) {
            return new k60.c(cipherA);
        }
        Signature signatureC = eVar.c();
        if (signatureC != null) {
            return new k60.c(signatureC);
        }
        Mac macB = eVar.b();
        if (macB != null) {
            return new k60.c(macB);
        }
        return null;
    }

    public static BiometricPrompt.CryptoObject d(k60.c cVar) {
        PresentationSession presentationSessionD;
        IdentityCredential identityCredentialB;
        if (cVar == null) {
            return null;
        }
        Cipher cipherA = cVar.a();
        if (cipherA != null) {
            return b.b(cipherA);
        }
        Signature signatureE = cVar.e();
        if (signatureE != null) {
            return b.a(signatureE);
        }
        Mac macC = cVar.c();
        if (macC != null) {
            return b.c(macC);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (identityCredentialB = cVar.b()) != null) {
            return c.a(identityCredentialB);
        }
        if (i < 33 || (presentationSessionD = cVar.d()) == null) {
            return null;
        }
        return d.a(presentationSessionD);
    }

    public static ec2.e e(k60.c cVar) {
        if (cVar == null) {
            return null;
        }
        Cipher cipherA = cVar.a();
        if (cipherA != null) {
            return new ec2.e(cipherA);
        }
        Signature signatureE = cVar.e();
        if (signatureE != null) {
            return new ec2.e(signatureE);
        }
        Mac macC = cVar.c();
        if (macC != null) {
            return new ec2.e(macC);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && cVar.b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
            return null;
        }
        if (i >= 33 && cVar.d() != null) {
            Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
        }
        return null;
    }
}
