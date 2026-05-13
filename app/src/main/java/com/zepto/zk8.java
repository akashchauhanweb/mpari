package com.zepto;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zk8 extends tj2 {
    public final HashMap f = new HashMap();
    public final Context g;
    public volatile Handler h;
    public final qk8 i;
    public final rw0 j;
    public final long k;
    public final long l;

    public zk8(Context context, Looper looper) {
        qk8 qk8Var = new qk8(this, null);
        this.i = qk8Var;
        this.g = context.getApplicationContext();
        this.h = new th8(looper, qk8Var);
        this.j = rw0.b();
        this.k = 5000L;
        this.l = 300000L;
    }

    @Override // com.zepto.tj2
    public final void d(nj8 nj8Var, ServiceConnection serviceConnection, String str) {
        iu4.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                xj8 xj8Var = (xj8) this.f.get(nj8Var);
                if (xj8Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + nj8Var.toString());
                }
                if (!xj8Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + nj8Var.toString());
                }
                xj8Var.f(serviceConnection, str);
                if (xj8Var.i()) {
                    this.h.sendMessageDelayed(this.h.obtainMessage(0, nj8Var), this.k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.tj2
    public final boolean f(nj8 nj8Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        iu4.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                xj8 xj8Var = (xj8) this.f.get(nj8Var);
                if (xj8Var == null) {
                    xj8Var = new xj8(this, nj8Var);
                    xj8Var.d(serviceConnection, serviceConnection, str);
                    xj8Var.e(str, executor);
                    this.f.put(nj8Var, xj8Var);
                } else {
                    this.h.removeMessages(0, nj8Var);
                    if (xj8Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + nj8Var.toString());
                    }
                    xj8Var.d(serviceConnection, serviceConnection, str);
                    int iA = xj8Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(xj8Var.b(), xj8Var.c());
                    } else if (iA == 2) {
                        xj8Var.e(str, executor);
                    }
                }
                zJ = xj8Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
