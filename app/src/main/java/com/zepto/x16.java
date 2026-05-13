package com.zepto;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.zepto.t40;
import com.zepto.zj2;

/* JADX INFO: loaded from: classes.dex */
public class x16 extends sj2 implements r38 {
    public static final /* synthetic */ int M = 0;
    public final boolean I;
    public final tq0 J;
    public final Bundle K;
    public final Integer L;

    public x16(Context context, Looper looper, boolean z, tq0 tq0Var, Bundle bundle, zj2.a aVar, zj2.b bVar) {
        super(context, looper, 44, tq0Var, aVar, bVar);
        this.I = true;
        this.J = tq0Var;
        this.K = bundle;
        this.L = tq0Var.g();
    }

    public static Bundle h0(tq0 tq0Var) {
        tq0Var.f();
        Integer numG = tq0Var.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", tq0Var.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.zepto.t40
    public final String B() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.zepto.t40
    public final String C() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.zepto.t40, com.zepto.yp.f
    public final int f() {
        return 12451000;
    }

    @Override // com.zepto.t40, com.zepto.yp.f
    public final boolean k() {
        return this.I;
    }

    @Override // com.zepto.r38
    public final void l() {
        n(new t40.d());
    }

    @Override // com.zepto.r38
    public final void m(s38 s38Var) {
        iu4.j(s38Var, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.J.b();
            ((x38) A()).p0(new i48(1, new a58(accountB, ((Integer) iu4.i(this.L)).intValue(), "<<default account>>".equals(accountB.name) ? m76.a(v()).b() : null)), s38Var);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                s38Var.W(new l48(1, new lw0(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.zepto.t40
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof x38 ? (x38) iInterfaceQueryLocalInterface : new x38(iBinder);
    }

    @Override // com.zepto.t40
    public final Bundle x() {
        if (!v().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }
}
