package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class lq0 extends l22 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final View.OnClickListener j;
    public final View.OnFocusChangeListener k;
    public AnimatorSet l;
    public ValueAnimator m;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            lq0.this.b.a0(true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            lq0.this.b.a0(false);
        }
    }

    public lq0(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.j = new View.OnClickListener() { // from class: com.zepto.jq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.G(view);
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: com.zepto.kq0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.a.H(view, z);
            }
        };
        Context context = aVar.getContext();
        int i = xy4.H;
        this.e = gx3.f(context, i, 100);
        this.f = gx3.f(aVar.getContext(), i, 150);
        this.g = gx3.g(aVar.getContext(), xy4.M, rp.a);
        this.h = gx3.g(aVar.getContext(), xy4.L, rp.d);
    }

    public final void A(boolean z) {
        boolean z2 = this.b.F() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.g);
        valueAnimatorOfFloat.setDuration(this.e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.iq0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.E(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.hq0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.F(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public final /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final /* synthetic */ void F(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.d.setScaleX(fFloatValue);
        this.d.setScaleY(fFloatValue);
    }

    public final /* synthetic */ void G(View view) {
        EditText editText = this.i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    public final /* synthetic */ void H(View view, boolean z) {
        A(J());
    }

    public final /* synthetic */ void I() {
        A(true);
    }

    public final boolean J() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }

    @Override // com.zepto.l22
    public void a(Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        A(J());
    }

    @Override // com.zepto.l22
    public int c() {
        return b15.e;
    }

    @Override // com.zepto.l22
    public int d() {
        return qz4.i;
    }

    @Override // com.zepto.l22
    public View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // com.zepto.l22
    public View.OnClickListener f() {
        return this.j;
    }

    @Override // com.zepto.l22
    public View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // com.zepto.l22
    public void n(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(J());
    }

    @Override // com.zepto.l22
    public void q(boolean z) {
        if (this.b.w() == null) {
            return;
        }
        A(z);
    }

    @Override // com.zepto.l22
    public void s() {
        D();
    }

    @Override // com.zepto.l22
    public void u() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.zepto.gq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.I();
                }
            });
        }
    }
}
