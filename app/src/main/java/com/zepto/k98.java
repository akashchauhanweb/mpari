package com.zepto;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k98 extends ta8 {
    public final be8 g;
    public final cc8 h;
    public final lc8 i;
    public final la8 j;
    public final mc8 k;
    public final lc8 l;
    public final lc8 m;
    public final vf8 n;
    public final Handler o;

    public k98(Context context, be8 be8Var, cc8 cc8Var, lc8 lc8Var, mc8 mc8Var, la8 la8Var, lc8 lc8Var2, lc8 lc8Var3, vf8 vf8Var) {
        super(new z68("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.o = new Handler(Looper.getMainLooper());
        this.g = be8Var;
        this.h = cc8Var;
        this.i = lc8Var;
        this.k = mc8Var;
        this.j = la8Var;
        this.l = lc8Var2;
        this.m = lc8Var3;
        this.n = vf8Var;
    }

    @Override // com.zepto.ta8
    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.a.b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState assetPackStateI = AssetPackState.i(bundleExtra, stringArrayList.get(0), this.k, this.n, new o98() { // from class: com.zepto.n98
            @Override // com.zepto.o98
            public final int a(int i, String str) {
                return i;
            }
        });
        this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateI);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.j.a(pendingIntent);
        }
        ((Executor) this.m.a()).execute(new Runnable() { // from class: com.zepto.n88
            @Override // java.lang.Runnable
            public final void run() {
                this.c.i(bundleExtra, assetPackStateI);
            }
        });
        ((Executor) this.l.a()).execute(new Runnable() { // from class: com.zepto.l88
            @Override // java.lang.Runnable
            public final void run() {
                this.c.h(bundleExtra);
            }
        });
    }

    public final /* synthetic */ void h(Bundle bundle) {
        if (this.g.n(bundle)) {
            this.h.a();
        }
    }

    public final /* synthetic */ void i(Bundle bundle, AssetPackState assetPackState) {
        if (this.g.m(bundle)) {
            j(assetPackState);
            ((zm8) this.i.a()).g();
        }
    }

    public final void j(final AssetPackState assetPackState) {
        this.o.post(new Runnable() { // from class: com.zepto.j98
            @Override // java.lang.Runnable
            public final void run() {
                this.c.f(assetPackState);
            }
        });
    }
}
