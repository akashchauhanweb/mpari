package com.zepto;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class vg1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final mc5 a;
    public final WeakReference b;
    public ha0 c;

    public vg1(mc5 mc5Var, ImageView imageView, ha0 ha0Var) {
        this.a = mc5Var;
        this.b = new WeakReference(imageView);
        this.c = ha0Var;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    public void a() {
        this.a.c();
        this.c = null;
        ImageView imageView = (ImageView) this.b.get();
        if (imageView == null) {
            return;
        }
        this.b.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.b.clear();
            this.a.m().k(width, height).i(imageView, this.c);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
