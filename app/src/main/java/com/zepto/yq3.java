package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class yq3 extends hq3 {
    public final float g;
    public final float h;
    public final float i;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;

        public a(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            yq3.this.b.setTranslationX(0.0f);
            yq3.this.k(0.0f, this.a, this.b);
        }
    }

    public yq3(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(jz4.m);
        this.h = resources.getDimension(jz4.l);
        this.i = resources.getDimension(jz4.n);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.e);
        animatorSet.start();
    }

    public final boolean g(int i, int i2) {
        return (jk2.b(i, dq7.B(this.b)) & i2) == i2;
    }

    public void h(n30 n30Var, int i, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z = n30Var.b() == 0;
        boolean zG = g(i, 3);
        float width = (this.b.getWidth() * this.b.getScaleX()) + i(zG);
        View view = this.b;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (zG) {
            width = -width;
        }
        fArr[0] = width;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new j82());
        objectAnimatorOfFloat.setDuration(rp.c(this.c, this.d, n30Var.a()));
        objectAnimatorOfFloat.addListener(new a(z, i));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public final int i(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void j(n30 n30Var) {
        super.d(n30Var);
    }

    public void k(float f, boolean z, int i) {
        float fA = a(f);
        boolean zG = g(i, 3);
        boolean z2 = z == zG;
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.h / f2;
            float f6 = this.i / f3;
            View view = this.b;
            if (zG) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z2) {
                f5 = -f4;
            }
            float fA2 = rp.a(0.0f, f5, fA);
            float f7 = fA2 + 1.0f;
            this.b.setScaleX(f7);
            float fA3 = 1.0f - rp.a(0.0f, f6, fA);
            this.b.setScaleY(fA3);
            View view2 = this.b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(zG ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z2 ? 1.0f - fA2 : 1.0f;
                    float f9 = fA3 != 0.0f ? (f7 / fA3) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }

    public void l(n30 n30Var, int i) {
        if (super.e(n30Var) == null) {
            return;
        }
        k(n30Var.a(), n30Var.b() == 0, i);
    }
}
