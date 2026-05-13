package com.zepto;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class j60 {
    public final d a;
    public final BiometricManager b;
    public final ec2 c;

    public static class a {
        public static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        public static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        public static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    public static class b {
        public static int a(BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    public static class c implements d {
        public final Context a;

        public c(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // com.zepto.j60.d
        public boolean a() {
            return zk4.b(this.a);
        }

        @Override // com.zepto.j60.d
        public BiometricManager b() {
            return a.b(this.a);
        }

        @Override // com.zepto.j60.d
        public boolean c() {
            return z63.b(this.a);
        }

        @Override // com.zepto.j60.d
        public boolean d() {
            return jj1.a(this.a, Build.MODEL);
        }

        @Override // com.zepto.j60.d
        public boolean e() {
            return z63.a(this.a) != null;
        }

        @Override // com.zepto.j60.d
        public ec2 f() {
            return ec2.b(this.a);
        }
    }

    public interface d {
        boolean a();

        BiometricManager b();

        boolean c();

        boolean d();

        boolean e();

        ec2 f();
    }

    public j60(d dVar) {
        this.a = dVar;
        int i = Build.VERSION.SDK_INT;
        this.b = i >= 29 ? dVar.b() : null;
        this.c = i <= 29 ? dVar.f() : null;
    }

    public static j60 g(Context context) {
        return new j60(new c(context));
    }

    public int a(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i);
        }
        BiometricManager biometricManager = this.b;
        if (biometricManager != null) {
            return b.a(biometricManager, i);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public final int b(int i) {
        if (!yz.f(i)) {
            return -2;
        }
        if (i == 0 || !this.a.e()) {
            return 12;
        }
        if (yz.d(i)) {
            return this.a.c() ? 0 : 11;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            return yz.g(i) ? f() : e();
        }
        if (i2 != 28) {
            return c();
        }
        if (this.a.a()) {
            return d();
        }
        return 12;
    }

    public final int c() {
        ec2 ec2Var = this.c;
        if (ec2Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (ec2Var.e()) {
            return !this.c.d() ? 11 : 0;
        }
        return 12;
    }

    public final int d() {
        return !this.a.c() ? c() : c() == 0 ? 0 : -1;
    }

    public final int e() {
        BiometricPrompt.CryptoObject cryptoObjectD;
        Method methodC = a.c();
        if (methodC != null && (cryptoObjectD = s31.d(s31.a())) != null) {
            try {
                Object objInvoke = Build.VERSION.SDK_INT == 29 ? methodC.invoke(this.b, cryptoObjectD) : null;
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e) {
                e = e;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (IllegalArgumentException e2) {
                e = e2;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (InvocationTargetException e3) {
                e = e3;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int iF = f();
        return (this.a.d() || iF != 0) ? iF : d();
    }

    public final int f() {
        BiometricManager biometricManager = this.b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
