package com.zepto;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class kd1 {
    public static id1 a = new DataBinderMapperImpl();

    public static lq7 a(jd1 jd1Var, View view, int i) {
        return a.b(jd1Var, view, i);
    }

    public static lq7 b(jd1 jd1Var, View[] viewArr, int i) {
        return a.c(jd1Var, viewArr, i);
    }

    public static lq7 c(jd1 jd1Var, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return a(jd1Var, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return b(jd1Var, viewArr, i2);
    }

    public static jd1 d() {
        return null;
    }

    public static lq7 e(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, jd1 jd1Var) {
        boolean z2 = viewGroup != null && z;
        return z2 ? c(jd1Var, viewGroup, z2 ? viewGroup.getChildCount() : 0, i) : a(jd1Var, layoutInflater.inflate(i, viewGroup, z), i);
    }

    public static lq7 f(Activity activity, int i) {
        return g(activity, i, null);
    }

    public static lq7 g(Activity activity, int i, jd1 jd1Var) {
        activity.setContentView(i);
        return c(jd1Var, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i);
    }
}
