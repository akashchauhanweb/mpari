package com.zepto;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class qk8 implements Handler.Callback {
    public final /* synthetic */ zk8 a;

    public /* synthetic */ qk8(zk8 zk8Var, gk8 gk8Var) {
        this.a = zk8Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.f) {
                try {
                    nj8 nj8Var = (nj8) message.obj;
                    xj8 xj8Var = (xj8) this.a.f.get(nj8Var);
                    if (xj8Var != null && xj8Var.i()) {
                        if (xj8Var.j()) {
                            xj8Var.g("GmsClientSupervisor");
                        }
                        this.a.f.remove(nj8Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.a.f) {
            try {
                nj8 nj8Var2 = (nj8) message.obj;
                xj8 xj8Var2 = (xj8) this.a.f.get(nj8Var2);
                if (xj8Var2 != null && xj8Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(nj8Var2), new Exception());
                    ComponentName componentNameB = xj8Var2.b();
                    if (componentNameB == null) {
                        componentNameB = nj8Var2.b();
                    }
                    if (componentNameB == null) {
                        String strD = nj8Var2.d();
                        iu4.i(strD);
                        componentNameB = new ComponentName(strD, "unknown");
                    }
                    xj8Var2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
