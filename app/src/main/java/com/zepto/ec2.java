package com.zepto;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class ec2 {
    public final Context a;

    public class a extends FingerprintManager.AuthenticationCallback {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.a.a(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.a.c(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.a.d(new d(ec2.f(b.b(authenticationResult))));
        }
    }

    public static class b {
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    public static abstract class c {
        public abstract void a(int i, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    public static final class d {
        public final e a;

        public d(e eVar) {
            this.a = eVar;
        }

        public e a() {
            return this.a;
        }
    }

    public static class e {
        public final Signature a;
        public final Cipher b;
        public final Mac c;

        public e(Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
        }

        public Cipher a() {
            return this.b;
        }

        public Mac b() {
            return this.c;
        }

        public Signature c() {
            return this.a;
        }

        public e(Cipher cipher) {
            this.b = cipher;
            this.a = null;
            this.c = null;
        }

        public e(Mac mac) {
            this.c = mac;
            this.b = null;
            this.a = null;
        }
    }

    public ec2(Context context) {
        this.a = context;
    }

    public static ec2 b(Context context) {
        return new ec2(context);
    }

    public static FingerprintManager c(Context context) {
        return b.c(context);
    }

    public static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    public static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new a(cVar);
    }

    public static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i, db0 db0Var, c cVar, Handler handler) {
        FingerprintManager fingerprintManagerC = c(this.a);
        if (fingerprintManagerC != null) {
            b.a(fingerprintManagerC, h(eVar), db0Var != null ? (CancellationSignal) db0Var.b() : null, i, g(cVar), handler);
        }
    }

    public boolean d() {
        FingerprintManager fingerprintManagerC = c(this.a);
        return fingerprintManagerC != null && b.d(fingerprintManagerC);
    }

    public boolean e() {
        FingerprintManager fingerprintManagerC = c(this.a);
        return fingerprintManagerC != null && b.e(fingerprintManagerC);
    }
}
