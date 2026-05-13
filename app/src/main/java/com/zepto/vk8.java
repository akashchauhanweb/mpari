package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class vk8 {
    public static final z68 e = new z68("AppUpdateService");
    public static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public d88 a;
    public final String b;
    public final Context c;
    public final ll8 d;

    public vk8(Context context, ll8 ll8Var) {
        this.b = context.getPackageName();
        this.c = context;
        this.d = ll8Var;
        if (ub8.b(context)) {
            this.a = new d88(pb8.a(context), e, "AppUpdateService", f, new s78() { // from class: com.zepto.oi8
                @Override // com.zepto.s78
                public final Object a(IBinder iBinder) {
                    return dk8.d(iBinder);
                }
            }, null);
        }
    }

    public static /* bridge */ /* synthetic */ Bundle b(vk8 vk8Var, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(vk8Var.c.getPackageManager().getPackageInfo(vk8Var.c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            e.b("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    public static Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putAll(ms4.a("app_update"));
        bundle.putInt("playcore.version.code", 11003);
        return bundle;
    }

    public static pc6 j() {
        e.b("onError(%d)", -9);
        return fd6.b(new xz2(-9));
    }

    public final pc6 f(String str) {
        if (this.a == null) {
            return j();
        }
        e.d("completeUpdate(%s)", str);
        rh8 rh8Var = new rh8();
        this.a.q(new hj8(this, rh8Var, rh8Var, str), rh8Var);
        return rh8Var.a();
    }

    public final pc6 g(String str) {
        if (this.a == null) {
            return j();
        }
        e.d("requestUpdateInfo(%s)", str);
        rh8 rh8Var = new rh8();
        this.a.q(new xi8(this, rh8Var, str, rh8Var), rh8Var);
        return rh8Var.a();
    }
}
