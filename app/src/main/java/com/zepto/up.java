package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class up {
    public static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public static void b(Animator animator) {
        animator.pause();
    }

    public static void c(Animator animator) {
        animator.resume();
    }
}
