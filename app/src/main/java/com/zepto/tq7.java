package com.zepto;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class tq7 {

    public static class a {
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        public static void c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
