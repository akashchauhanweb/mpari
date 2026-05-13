package com.zepto;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class hl8 {
    public final int a;
    public final rc6 b = new rc6();
    public final int c;
    public final Bundle d;

    public hl8(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(pl8 pl8Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + pl8Var.toString());
        }
        this.b.b(pl8Var);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + b() + "}";
    }
}
