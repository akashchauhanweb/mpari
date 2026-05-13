package com.zepto;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class os7 {
    public static final int[] a = {R.attr.stateListAnimator};

    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(View view, float f) {
        int integer = view.getResources().getInteger(l05.a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, xy4.a0, -xy4.b0}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray typedArrayI = if6.i(context, attributeSet, a, i, i2, new int[0]);
        try {
            if (typedArrayI.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayI.getResourceId(0, 0)));
            }
        } finally {
            typedArrayI.recycle();
        }
    }
}
