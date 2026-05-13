package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z66 {
    public final ArrayList a = new ArrayList();
    public b b = null;
    public ValueAnimator c = null;
    public final Animator.AnimatorListener d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z66 z66Var = z66.this;
            if (z66Var.c == animator) {
                z66Var.c = null;
            }
        }
    }

    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }
}
