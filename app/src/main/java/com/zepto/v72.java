package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class v72 extends xt7 {

    public class a extends gn6 {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            as7.g(this.a, 1.0f);
            as7.a(this.a);
            fn6Var.V(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            as7.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (dq7.Q(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public v72(int i) {
        q0(i);
    }

    public static float s0(mn6 mn6Var, float f) {
        Float f2;
        return (mn6Var == null || (f2 = (Float) mn6Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // com.zepto.xt7, com.zepto.fn6
    public void i(mn6 mn6Var) {
        super.i(mn6Var);
        mn6Var.a.put("android:fade:transitionAlpha", Float.valueOf(as7.c(mn6Var.b)));
    }

    @Override // com.zepto.xt7
    public Animator m0(ViewGroup viewGroup, View view, mn6 mn6Var, mn6 mn6Var2) {
        float fS0 = s0(mn6Var, 0.0f);
        return r0(view, fS0 != 1.0f ? fS0 : 0.0f, 1.0f);
    }

    @Override // com.zepto.xt7
    public Animator o0(ViewGroup viewGroup, View view, mn6 mn6Var, mn6 mn6Var2) {
        as7.e(view);
        return r0(view, s0(mn6Var, 1.0f), 0.0f);
    }

    public final Animator r0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        as7.g(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) as7.b, f2);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }

    public v72() {
    }
}
