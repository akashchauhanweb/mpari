package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ta8 {
    public final z68 a;
    public final IntentFilter b;
    public final Context c;
    public final Set d = new HashSet();
    public x88 e = null;
    public volatile boolean f = false;

    public ta8(z68 z68Var, IntentFilter intentFilter, Context context) {
        this.a = z68Var;
        this.b = intentFilter;
        this.c = pb8.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        x88 x88Var;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            x88 x88Var2 = new x88(this, null);
            this.e = x88Var2;
            this.c.registerReceiver(x88Var2, this.b);
        }
        if (this.f || !this.d.isEmpty() || (x88Var = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(x88Var);
        this.e = null;
    }

    public final synchronized void c(b76 b76Var) {
        this.a.d("registerListener", new Object[0]);
        wb8.a(b76Var, "Registered Play Core listener should not be null.");
        this.d.add(b76Var);
        b();
    }

    public final synchronized void d(boolean z) {
        this.f = z;
        b();
    }

    public final synchronized void e(b76 b76Var) {
        this.a.d("unregisterListener", new Object[0]);
        wb8.a(b76Var, "Unregistered Play Core listener should not be null.");
        this.d.remove(b76Var);
        b();
    }

    public final synchronized void f(Object obj) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((b76) it.next()).a(obj);
        }
    }

    public final synchronized boolean g() {
        return this.e != null;
    }
}
