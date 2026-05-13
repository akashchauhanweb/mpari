package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class dx1 {
    public static final int a = Color.alpha(-1728053248);

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ DrawerLayout a;
        public final /* synthetic */ View b;

        public a(DrawerLayout drawerLayout, View view) {
            this.a = drawerLayout;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.h(this.b, false);
            this.a.setScrimColor(-1728053248);
        }
    }

    public static Animator.AnimatorListener b(DrawerLayout drawerLayout, View view) {
        return new a(drawerLayout, view);
    }

    public static ValueAnimator.AnimatorUpdateListener c(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.cx1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dx1.d(drawerLayout, valueAnimator);
            }
        };
    }

    public static /* synthetic */ void d(DrawerLayout drawerLayout, ValueAnimator valueAnimator) {
        drawerLayout.setScrimColor(sr0.k(-1728053248, rp.c(a, 0, valueAnimator.getAnimatedFraction())));
    }
}
