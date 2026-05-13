package com.zepto;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class em8 {
    public static em8 e;
    public final Context a;
    public final ScheduledExecutorService b;
    public vj8 c = new vj8(this, null);
    public int d = 1;

    public em8(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized em8 b(Context context) {
        try {
            if (e == null) {
                mf8.a();
                e = new em8(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new m14("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public final Task c(int i, Bundle bundle) {
        return g(new yk8(f(), i, bundle));
    }

    public final Task d(int i, Bundle bundle) {
        return g(new xl8(f(), 1, bundle));
    }

    public final synchronized int f() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    public final synchronized Task g(hl8 hl8Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(hl8Var.toString()));
            }
            if (!this.c.g(hl8Var)) {
                vj8 vj8Var = new vj8(this, null);
                this.c = vj8Var;
                vj8Var.g(hl8Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hl8Var.b.a();
    }
}
