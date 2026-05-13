package com.zepto;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class xa8 {
    public Object a;
    public boolean b = false;
    public final /* synthetic */ t40 c;

    public xa8(t40 t40Var, Object obj) {
        this.c = t40Var;
        this.a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.a;
                if (this.b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.c.r) {
            this.c.r.remove(this);
        }
    }
}
