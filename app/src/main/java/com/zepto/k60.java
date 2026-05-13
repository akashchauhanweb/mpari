package com.zepto;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import android.util.Log;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class k60 {
    public mg2 a;
    public boolean b;

    public static abstract class a {
        public void a(int i, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(b bVar) {
        }
    }

    public static class b {
        public final c a;
        public final int b;

        public b(c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        public int a() {
            return this.b;
        }

        public c b() {
            return this.a;
        }
    }

    public static class c {
        public final Signature a;
        public final Cipher b;
        public final Mac c;
        public final IdentityCredential d;
        public final PresentationSession e;

        public c(Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public Cipher a() {
            return this.b;
        }

        public IdentityCredential b() {
            return this.d;
        }

        public Mac c() {
            return this.c;
        }

        public PresentationSession d() {
            return this.e;
        }

        public Signature e() {
            return this.a;
        }

        public c(Cipher cipher) {
            this.a = null;
            this.b = cipher;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public c(Mac mac) {
            this.a = null;
            this.b = null;
            this.c = mac;
            this.d = null;
            this.e = null;
        }

        public c(IdentityCredential identityCredential) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = identityCredential;
            this.e = null;
        }

        public c(PresentationSession presentationSession) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = presentationSession;
        }
    }

    public static class d {
        public final CharSequence a;
        public final CharSequence b;
        public final CharSequence c;
        public final CharSequence d;
        public final boolean e;
        public final boolean f;
        public final int g;

        public static class a {
            public CharSequence a = null;
            public CharSequence b = null;
            public CharSequence c = null;
            public CharSequence d = null;
            public boolean e = true;
            public boolean f = false;
            public int g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!yz.f(this.g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + yz.a(this.g));
                }
                int i = this.g;
                boolean zD = i != 0 ? yz.d(i) : this.f;
                if (TextUtils.isEmpty(this.d) && !zD) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.d) || !zD) {
                    return new d(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(int i) {
                this.g = i;
                return this;
            }

            public a c(CharSequence charSequence) {
                this.c = charSequence;
                return this;
            }

            public a d(CharSequence charSequence) {
                this.a = charSequence;
                return this;
            }
        }

        public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, boolean z2, int i) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = charSequence3;
            this.d = charSequence4;
            this.e = z;
            this.f = z2;
            this.g = i;
        }

        public int a() {
            return this.g;
        }

        public CharSequence b() {
            return this.c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.b;
        }

        public CharSequence e() {
            return this.a;
        }

        public boolean f() {
            return this.e;
        }

        public boolean g() {
            return this.f;
        }
    }

    public k60(yf2 yf2Var, Executor executor, a aVar) {
        if (yf2Var == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        f(true, yf2Var.I0(), (l60) new androidx.lifecycle.z(yf2Var).a(l60.class), executor, aVar);
    }

    public static i60 c(mg2 mg2Var) {
        return (i60) mg2Var.h0("androidx.biometric.BiometricFragment");
    }

    public static l60 e(sf2 sf2Var, boolean z) {
        dr7 dr7VarN = z ? sf2Var.n() : null;
        if (dr7VarN == null) {
            dr7VarN = sf2Var.M();
        }
        if (dr7VarN != null) {
            return (l60) new androidx.lifecycle.z(dr7VarN).a(l60.class);
        }
        throw new IllegalStateException("view model not found");
    }

    public void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        b(dVar, null);
    }

    public final void b(d dVar, c cVar) {
        mg2 mg2Var = this.a;
        if (mg2Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (mg2Var.Q0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            d().g2(dVar, cVar);
        }
    }

    public final i60 d() {
        i60 i60VarC = c(this.a);
        if (i60VarC != null) {
            return i60VarC;
        }
        i60 i60VarN2 = i60.N2(this.b);
        this.a.n().e(i60VarN2, "androidx.biometric.BiometricFragment").i();
        this.a.d0();
        return i60VarN2;
    }

    public final void f(boolean z, mg2 mg2Var, l60 l60Var, Executor executor, a aVar) {
        this.b = z;
        this.a = mg2Var;
        if (executor != null) {
            l60Var.S(executor);
        }
        l60Var.R(aVar);
    }
}
