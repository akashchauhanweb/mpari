package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;

/* JADX INFO: loaded from: classes.dex */
public final class t88 extends ta8 {
    public t88(Context context) {
        super(new z68("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // com.zepto.ta8
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState installStateF = InstallState.f(intent, this.a);
        this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", installStateF);
        f(installStateF);
    }
}
