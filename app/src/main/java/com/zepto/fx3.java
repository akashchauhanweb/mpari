package com.zepto;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class fx3 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public fx3(long j, long j2) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
    }

    public static fx3 b(ValueAnimator valueAnimator) {
        fx3 fx3Var = new fx3(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        fx3Var.d = valueAnimator.getRepeatCount();
        fx3Var.e = valueAnimator.getRepeatMode();
        return fx3Var;
    }

    public static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? rp.b : interpolator instanceof AccelerateInterpolator ? rp.c : interpolator instanceof DecelerateInterpolator ? rp.d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : rp.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx3)) {
            return false;
        }
        fx3 fx3Var = (fx3) obj;
        if (c() == fx3Var.c() && d() == fx3Var.d() && g() == fx3Var.g() && h() == fx3Var.h()) {
            return e().getClass().equals(fx3Var.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public fx3(long j, long j2, TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
