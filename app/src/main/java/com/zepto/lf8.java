package com.zepto;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class lf8 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ t40 b;

    public lf8(t40 t40Var, int i) {
        this.b = t40Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t40 t40Var = this.b;
        if (iBinder == null) {
            t40.Z(t40Var, 16);
            return;
        }
        synchronized (t40Var.n) {
            try {
                t40 t40Var2 = this.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                t40Var2.o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ow2)) ? new j68(iBinder) : (ow2) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.a0(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.n) {
            this.b.o = null;
        }
        Handler handler = this.b.l;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
