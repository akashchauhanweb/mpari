package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class lr7 {
    public final WeakReference a;
    public Runnable b = null;
    public Runnable c = null;
    public int d = -1;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ nr7 a;
        public final /* synthetic */ View b;

        public a(nr7 nr7Var, View view) {
            this.a = nr7Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public lr7(View view) {
        this.a = new WeakReference(view);
    }

    public lr7 b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public lr7 f(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public lr7 g(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public lr7 h(nr7 nr7Var) {
        View view = (View) this.a.get();
        if (view != null) {
            i(view, nr7Var);
        }
        return this;
    }

    public final void i(View view, nr7 nr7Var) {
        if (nr7Var != null) {
            view.animate().setListener(new a(nr7Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public lr7 j(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public lr7 k(final pr7 pr7Var) {
        final View view = (View) this.a.get();
        if (view != null) {
            b.a(view.animate(), pr7Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.kr7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    pr7Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public lr7 m(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
