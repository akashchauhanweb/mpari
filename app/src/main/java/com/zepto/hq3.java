package com.zepto;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class hq3 {
    public final TimeInterpolator a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public n30 f;

    public hq3(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = gx3.g(context, xy4.N, cm4.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = gx3.f(context, xy4.D, 300);
        this.d = gx3.f(context, xy4.H, 150);
        this.e = gx3.f(context, xy4.G, 100);
    }

    public float a(float f) {
        return this.a.getInterpolation(f);
    }

    public n30 b() {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        n30 n30Var = this.f;
        this.f = null;
        return n30Var;
    }

    public n30 c() {
        n30 n30Var = this.f;
        this.f = null;
        return n30Var;
    }

    public void d(n30 n30Var) {
        this.f = n30Var;
    }

    public n30 e(n30 n30Var) {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        n30 n30Var2 = this.f;
        this.f = n30Var;
        return n30Var2;
    }
}
