package com.zepto;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.zepto.k60;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class i60 extends sf2 {
    public l60 d0;
    public Handler e0 = new Handler(Looper.getMainLooper());

    public static class a {
        public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    public static class b {
        public static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class c {
        public static void a(BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        public static void b(BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    public static class d {
        public static void a(BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    public static class e implements Executor {
        public final Handler c = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.c.post(runnable);
        }
    }

    public static class f implements Runnable {
        public final WeakReference c;

        public f(i60 i60Var) {
            this.c = new WeakReference(i60Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.get() != null) {
                ((i60) this.c.get()).c3();
            }
        }
    }

    public static class g implements Runnable {
        public final WeakReference c;

        public g(l60 l60Var) {
            this.c = new WeakReference(l60Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.get() != null) {
                ((l60) this.c.get()).V(false);
            }
        }
    }

    public static class h implements Runnable {
        public final WeakReference c;

        public h(l60 l60Var) {
            this.c = new WeakReference(l60Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.get() != null) {
                ((l60) this.c.get()).b0(false);
            }
        }
    }

    public static i60 N2(boolean z) {
        i60 i60Var = new i60();
        Bundle bundle = new Bundle();
        bundle.putBoolean("host_activity", z);
        i60Var.L1(bundle);
        return i60Var;
    }

    public static int k2(ec2 ec2Var) {
        if (ec2Var.e()) {
            return !ec2Var.d() ? 11 : 0;
        }
        return 12;
    }

    private boolean t2() {
        yf2 yf2VarN = n();
        return yf2VarN != null && yf2VarN.isChangingConfigurations();
    }

    public final boolean A2() {
        return Build.VERSION.SDK_INT < 28 || u2() || v2();
    }

    public final /* synthetic */ void B2(k60.b bVar) {
        if (bVar != null) {
            R2(bVar);
            this.d0.N(null);
        }
    }

    @Override // com.zepto.sf2
    public void C0(Bundle bundle) {
        super.C0(bundle);
        if (this.d0 == null) {
            this.d0 = k60.e(this, w2());
        }
        l2();
    }

    public final /* synthetic */ void C2(w50 w50Var) {
        if (w50Var != null) {
            O2(w50Var.b(), w50Var.c());
            this.d0.K(null);
        }
    }

    public final /* synthetic */ void D2(CharSequence charSequence) {
        if (charSequence != null) {
            Q2(charSequence);
            this.d0.K(null);
        }
    }

    public final /* synthetic */ void E2(Boolean bool) {
        if (bool.booleanValue()) {
            P2();
            this.d0.L(false);
        }
    }

    public final /* synthetic */ void F2(Boolean bool) {
        if (bool.booleanValue()) {
            if (z2()) {
                T2();
            } else {
                S2();
            }
            this.d0.c0(false);
        }
    }

    public final /* synthetic */ void G2(Boolean bool) {
        if (bool.booleanValue()) {
            j2(1);
            m2();
            this.d0.W(false);
        }
    }

    public final /* synthetic */ void I2(int i, CharSequence charSequence) {
        this.d0.n().a(i, charSequence);
    }

    public final /* synthetic */ void J2() {
        this.d0.n().b();
    }

    public final /* synthetic */ void K2(k60.b bVar) {
        this.d0.n().c(bVar);
    }

    public final /* synthetic */ void L2() {
        this.d0.X(false);
    }

    public final void M2() {
        Context contextV = v();
        KeyguardManager keyguardManagerA = contextV != null ? z63.a(contextV) : null;
        if (keyguardManagerA == null) {
            H2(12, c0(v05.k));
            return;
        }
        CharSequence charSequenceY = this.d0.y();
        CharSequence charSequenceX = this.d0.x();
        CharSequence charSequenceQ = this.d0.q();
        if (charSequenceX == null) {
            charSequenceX = charSequenceQ;
        }
        Intent intentA = a.a(keyguardManagerA, charSequenceY, charSequenceX);
        if (intentA == null) {
            H2(14, c0(v05.j));
            return;
        }
        this.d0.T(true);
        if (A2()) {
            n2();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    public void O2(final int i, final CharSequence charSequence) {
        if (!b32.b(i)) {
            i = 8;
        }
        Context contextV = v();
        if (Build.VERSION.SDK_INT < 29 && b32.c(i) && contextV != null && z63.b(contextV) && yz.d(this.d0.g())) {
            M2();
            return;
        }
        if (!A2()) {
            if (charSequence == null) {
                charSequence = c0(v05.b) + " " + i;
            }
            H2(i, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = b32.a(v(), i);
        }
        if (i == 5) {
            int iL = this.d0.l();
            if (iL == 0 || iL == 3) {
                V2(i, charSequence);
            }
            m2();
            return;
        }
        if (this.d0.F()) {
            H2(i, charSequence);
        } else {
            b3(charSequence);
            this.e0.postDelayed(new Runnable() { // from class: com.zepto.h60
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.H2(i, charSequence);
                }
            }, o2());
        }
        this.d0.X(true);
    }

    public void P2() {
        if (A2()) {
            b3(c0(v05.i));
        }
        W2();
    }

    public void Q2(CharSequence charSequence) {
        if (A2()) {
            b3(charSequence);
        }
    }

    public void R2(k60.b bVar) {
        X2(bVar);
    }

    public void S2() {
        CharSequence charSequenceW = this.d0.w();
        if (charSequenceW == null) {
            charSequenceW = c0(v05.b);
        }
        H2(13, charSequenceW);
        j2(2);
    }

    public void T2() {
        M2();
    }

    /* JADX INFO: renamed from: U2, reason: merged with bridge method [inline-methods] */
    public void H2(int i, CharSequence charSequence) {
        V2(i, charSequence);
        m2();
    }

    public final void V2(final int i, final CharSequence charSequence) {
        if (this.d0.C()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.d0.A()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.d0.O(false);
            this.d0.o().execute(new Runnable() { // from class: com.zepto.z50
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.I2(i, charSequence);
                }
            });
        }
    }

    public final void W2() {
        if (this.d0.A()) {
            this.d0.o().execute(new Runnable() { // from class: com.zepto.y50
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.J2();
                }
            });
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    public final void X2(k60.b bVar) {
        Y2(bVar);
        m2();
    }

    public final void Y2(final k60.b bVar) {
        if (!this.d0.A()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.d0.O(false);
            this.d0.o().execute(new Runnable() { // from class: com.zepto.a60
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.K2(bVar);
                }
            });
        }
    }

    @Override // com.zepto.sf2
    public void Z0() {
        super.Z0();
        if (Build.VERSION.SDK_INT == 29 && yz.d(this.d0.g())) {
            this.d0.b0(true);
            this.e0.postDelayed(new h(this.d0), 250L);
        }
    }

    public final void Z2() {
        BiometricPrompt.Builder builderD = b.d(F1().getApplicationContext());
        CharSequence charSequenceY = this.d0.y();
        CharSequence charSequenceX = this.d0.x();
        CharSequence charSequenceQ = this.d0.q();
        if (charSequenceY != null) {
            b.h(builderD, charSequenceY);
        }
        if (charSequenceX != null) {
            b.g(builderD, charSequenceX);
        }
        if (charSequenceQ != null) {
            b.e(builderD, charSequenceQ);
        }
        CharSequence charSequenceW = this.d0.w();
        if (!TextUtils.isEmpty(charSequenceW)) {
            b.f(builderD, charSequenceW, this.d0.o(), this.d0.v());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c.a(builderD, this.d0.B());
        }
        int iG = this.d0.g();
        if (i >= 30) {
            d.a(builderD, iG);
        } else if (i >= 29) {
            c.b(builderD, yz.d(iG));
        }
        h2(b.c(builderD), v());
    }

    @Override // com.zepto.sf2
    public void a1() {
        super.a1();
        if (Build.VERSION.SDK_INT >= 29 || this.d0.C() || t2()) {
            return;
        }
        j2(0);
    }

    public final void a3() {
        Context applicationContext = F1().getApplicationContext();
        ec2 ec2VarB = ec2.b(applicationContext);
        int iK2 = k2(ec2VarB);
        if (iK2 != 0) {
            H2(iK2, b32.a(applicationContext, iK2));
            return;
        }
        if (n0()) {
            this.d0.X(true);
            if (!jj1.f(applicationContext, Build.MODEL)) {
                this.e0.postDelayed(new Runnable() { // from class: com.zepto.x50
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.c.L2();
                    }
                }, 500L);
                dc2.p2(w2()).k2(N(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.d0.P(0);
            i2(ec2VarB, applicationContext);
        }
    }

    public final void b3(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = c0(v05.b);
        }
        this.d0.a0(2);
        this.d0.Y(charSequence);
    }

    public void c3() {
        if (this.d0.I()) {
            return;
        }
        if (v() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.d0.f0(true);
        this.d0.O(true);
        if (x2()) {
            M2();
        } else if (A2()) {
            a3();
        } else {
            Z2();
        }
    }

    public void g2(k60.d dVar, k60.c cVar) {
        this.d0.e0(dVar);
        int iC = yz.c(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && iC == 15 && cVar == null) {
            this.d0.U(s31.a());
        } else {
            this.d0.U(cVar);
        }
        if (z2()) {
            this.d0.d0(c0(v05.a));
        } else {
            this.d0.d0(null);
        }
        if (y2()) {
            this.d0.O(true);
            M2();
        } else if (this.d0.D()) {
            this.e0.postDelayed(new f(this), 600L);
        } else {
            c3();
        }
    }

    public void h2(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectD = s31.d(this.d0.p());
        CancellationSignal cancellationSignalB = this.d0.m().b();
        e eVar = new e();
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackA = this.d0.h().a();
        try {
            if (cryptoObjectD == null) {
                b.b(biometricPrompt, cancellationSignalB, eVar, biometricPrompt$AuthenticationCallbackA);
            } else {
                b.a(biometricPrompt, cryptoObjectD, cancellationSignalB, eVar, biometricPrompt$AuthenticationCallbackA);
            }
        } catch (NullPointerException e2) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
            H2(1, context != null ? context.getString(v05.b) : "");
        }
    }

    public void i2(ec2 ec2Var, Context context) {
        try {
            ec2Var.a(s31.e(this.d0.p()), 0, this.d0.m().c(), this.d0.h().b(), null);
        } catch (NullPointerException e2) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
            H2(1, b32.a(context, 1));
        }
    }

    public void j2(int i) {
        if (i == 3 || !this.d0.G()) {
            if (A2()) {
                this.d0.P(i);
                if (i == 1) {
                    V2(10, b32.a(v(), 10));
                }
            }
            this.d0.m().a();
        }
    }

    public final void l2() {
        this.d0.Q(n());
        this.d0.k().g(this, new mf4() { // from class: com.zepto.b60
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                this.a.B2((k60.b) obj);
            }
        });
        this.d0.i().g(this, new mf4() { // from class: com.zepto.c60
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                this.a.C2((w50) obj);
            }
        });
        this.d0.j().g(this, new mf4() { // from class: com.zepto.d60
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                this.a.D2((CharSequence) obj);
            }
        });
        this.d0.z().g(this, new mf4() { // from class: com.zepto.e60
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                this.a.E2((Boolean) obj);
            }
        });
        this.d0.H().g(this, new mf4() { // from class: com.zepto.f60
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                this.a.F2((Boolean) obj);
            }
        });
        this.d0.E().g(this, new mf4() { // from class: com.zepto.g60
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                this.a.G2((Boolean) obj);
            }
        });
    }

    public void m2() {
        n2();
        this.d0.f0(false);
        if (!this.d0.C() && n0()) {
            N().n().n(this).i();
        }
        Context contextV = v();
        if (contextV == null || !jj1.e(contextV, Build.MODEL)) {
            return;
        }
        this.d0.V(true);
        this.e0.postDelayed(new g(this.d0), 600L);
    }

    public final void n2() {
        this.d0.f0(false);
        if (n0()) {
            mg2 mg2VarN = N();
            dc2 dc2Var = (dc2) mg2VarN.h0("androidx.biometric.FingerprintDialogFragment");
            if (dc2Var != null) {
                if (dc2Var.n0()) {
                    dc2Var.Z1();
                } else {
                    mg2VarN.n().n(dc2Var).i();
                }
            }
        }
    }

    public final int o2() {
        Context contextV = v();
        return (contextV == null || !jj1.f(contextV, Build.MODEL)) ? 2000 : 0;
    }

    public final void p2(int i) {
        int i2 = -1;
        if (i != -1) {
            H2(10, c0(v05.l));
            return;
        }
        if (this.d0.J()) {
            this.d0.g0(false);
        } else {
            i2 = 1;
        }
        X2(new k60.b(null, i2));
    }

    public final boolean q2() {
        return t().getBoolean("has_face", zk4.a(v()));
    }

    public final boolean r2() {
        return t().getBoolean("has_fingerprint", zk4.b(v()));
    }

    public final boolean s2() {
        return t().getBoolean("has_iris", zk4.c(v()));
    }

    public final boolean u2() {
        Context contextV = v();
        return (contextV == null || this.d0.p() == null || !jj1.g(contextV, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    public final boolean v2() {
        return Build.VERSION.SDK_INT == 28 && !r2();
    }

    public final boolean w2() {
        return t().getBoolean("host_activity", true);
    }

    @Override // com.zepto.sf2
    public void x0(int i, int i2, Intent intent) {
        super.x0(i, i2, intent);
        if (i == 1) {
            this.d0.T(false);
            p2(i2);
        }
    }

    public final boolean x2() {
        Context contextV = v();
        if (contextV == null || !jj1.h(contextV, Build.MANUFACTURER)) {
            return false;
        }
        int iG = this.d0.g();
        if (!yz.g(iG) || !yz.d(iG)) {
            return false;
        }
        this.d0.g0(true);
        return true;
    }

    public final boolean y2() {
        Context contextV = v();
        if (Build.VERSION.SDK_INT != 29 || r2() || q2() || s2()) {
            return z2() && j60.g(contextV).a(KotlinVersion.MAX_COMPONENT_VALUE) != 0;
        }
        return true;
    }

    public boolean z2() {
        return Build.VERSION.SDK_INT <= 28 && yz.d(this.d0.g());
    }
}
