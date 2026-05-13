package com.zepto;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class ep implements j73 {
    public static final Object c = new Object();
    public static final String d = "ep";
    public final String a;
    public KeyStore b;

    public static final class a {
        public String a = null;
        public KeyStore b;

        public a() {
            this.b = null;
            if (!ep.g()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public ep() {
        this(new a());
    }

    public static boolean d(String str) {
        ep epVar = new ep();
        synchronized (c) {
            try {
                if (epVar.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = hm7.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public static boolean g() {
        return true;
    }

    public static void h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    public static rl i(rl rlVar) throws KeyStoreException {
        byte[] bArrC = h45.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrC, rlVar.b(rlVar.a(bArrC, bArr), bArr))) {
            return rlVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // com.zepto.j73
    public synchronized rl a(String str) {
        try {
            String str2 = this.a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.a, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(new dp(hm7.b("android-keystore://", str), this.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    @Override // com.zepto.j73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.a     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            monitor-exit(r2)
            return r1
        Le:
            r3 = move-exception
            goto L26
        L10:
            java.lang.String r0 = r2.a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L23
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ep.b(java.lang.String):boolean");
    }

    public synchronized boolean f(String str) {
        String strB;
        strB = hm7.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.b = keyStore;
                keyStore.load(null);
                return this.b.containsAlias(strB);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.b.containsAlias(strB);
    }

    public ep(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
    }
}
