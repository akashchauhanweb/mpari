package com.zepto;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class hh4 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public hh4(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static hh4 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        hh4 hh4Var = new hh4(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(hh4Var);
        view.addOnAttachStateChangeListener(hh4Var);
        return hh4Var;
    }

    public void b() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
