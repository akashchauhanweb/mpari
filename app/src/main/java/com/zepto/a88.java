package com.zepto;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class a88 implements ServiceConnection {
    public final /* synthetic */ d88 a;

    public /* synthetic */ a88(d88 d88Var, y78 y78Var) {
        this.a = d88Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        d88 d88Var = this.a;
        d88Var.c().post(new u78(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        d88 d88Var = this.a;
        d88Var.c().post(new w78(this));
    }
}
