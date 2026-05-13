package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.zepto.gx3;
import com.zepto.rp;
import com.zepto.wb0;
import com.zepto.xy4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {
    public static final int j = xy4.B;
    public static final int k = xy4.E;
    public static final int l = xy4.L;
    public final LinkedHashSet a;
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f;
    public int g;
    public int h;
    public ViewPropertyAnimator i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
        this.h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void J(View view, int i, long j2, TimeInterpolator timeInterpolator) {
        this.i = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    public boolean K() {
        return this.g == 1;
    }

    public boolean L() {
        return this.g == 2;
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z) {
        if (K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Q(view, 1);
        int i = this.f + this.h;
        if (z) {
            J(view, i, this.c, this.e);
        } else {
            view.setTranslationY(i);
        }
    }

    public void O(View view) {
        P(view, true);
    }

    public void P(View view, boolean z) {
        if (L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Q(view, 2);
        if (z) {
            J(view, 0, this.b, this.d);
        } else {
            view.setTranslationY(0);
        }
    }

    public final void Q(View view, int i) {
        this.g = i;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            wb0.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = gx3.f(view.getContext(), j, 225);
        this.c = gx3.f(view.getContext(), k, 175);
        Context context = view.getContext();
        int i2 = l;
        this.d = gx3.g(context, i2, rp.d);
        this.e = gx3.g(view.getContext(), i2, rp.c);
        return super.p(coordinatorLayout, view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            M(view);
        } else if (i2 < 0) {
            O(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
        this.h = 0;
    }
}
