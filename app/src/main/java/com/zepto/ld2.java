package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ld2 extends com.google.android.material.floatingactionbutton.a {
    public StateListAnimator O;

    public static class a extends wq3 {
        public a(e06 e06Var) {
            super(e06Var);
        }

        @Override // com.zepto.wq3, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public ld2(FloatingActionButton floatingActionButton, c06 c06Var) {
        super(floatingActionButton, c06Var);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void B(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void C(float f, float f2, float f3) {
        if (this.w.getStateListAnimator() == this.O) {
            StateListAnimator stateListAnimatorG0 = g0(f, f2, f3);
            this.O = stateListAnimatorG0;
            this.w.setStateListAnimator(stateListAnimatorG0);
        }
        if (W()) {
            c0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean H() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ge5.a(colorStateList));
        } else {
            super.S(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean W() {
        return this.x.c() || !Y();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void a0() {
    }

    public g70 f0(int i, ColorStateList colorStateList) {
        Context context = this.w.getContext();
        g70 g70Var = new g70((e06) lu4.g(this.a));
        g70Var.e(yy0.c(context, dz4.e), yy0.c(context, dz4.d), yy0.c(context, dz4.b), yy0.c(context, dz4.c));
        g70Var.d(i);
        g70Var.c(colorStateList);
        return g70Var;
    }

    public final StateListAnimator g0(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.I, h0(f, f3));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.J, h0(f, f2));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.K, h0(f, f2));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.L, h0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.w, "elevation", f).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.D);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.M, animatorSet);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.N, h0(0.0f, 0.0f));
        return stateListAnimator;
    }

    public final Animator h0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.w, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.D);
        return animatorSet;
    }

    public wq3 i0() {
        return new a((e06) lu4.g(this.a));
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float j() {
        return this.w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void o(Rect rect) {
        if (this.x.c()) {
            super.o(rect);
        } else if (Y()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.k - this.w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        wq3 wq3VarI0 = i0();
        this.b = wq3VarI0;
        wq3VarI0.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.M(this.w.getContext());
        if (i > 0) {
            this.d = f0(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) lu4.g(this.d), (Drawable) lu4.g(this.b)});
        } else {
            this.d = null;
            layerDrawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ge5.a(colorStateList2), layerDrawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void x() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void z() {
        c0();
    }
}
