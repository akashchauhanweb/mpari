package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class sq3 {
    public static int a(int i, int i2) {
        return sr0.k(i, (Color.alpha(i) * i2) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int b(Context context, int i, int i2) {
        Integer numF = f(context, i);
        return numF != null ? numF.intValue() : i2;
    }

    public static int c(Context context, int i, String str) {
        return l(context, fq3.e(context, i, str));
    }

    public static int d(View view, int i) {
        return l(view.getContext(), fq3.f(view, i));
    }

    public static int e(View view, int i, int i2) {
        return b(view.getContext(), i, i2);
    }

    public static Integer f(Context context, int i) {
        TypedValue typedValueA = fq3.a(context, i);
        if (typedValueA != null) {
            return Integer.valueOf(l(context, typedValueA));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i) {
        TypedValue typedValueA = fq3.a(context, i);
        if (typedValueA == null) {
            return null;
        }
        int i2 = typedValueA.resourceId;
        if (i2 != 0) {
            return yy0.d(context, i2);
        }
        int i3 = typedValueA.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static boolean h(int i) {
        return i != 0 && sr0.d(i) > 0.5d;
    }

    public static int i(int i, int i2) {
        return sr0.g(i2, i);
    }

    public static int j(int i, int i2, float f) {
        return i(i, sr0.k(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int k(View view, int i, int i2, float f) {
        return j(d(view, i), d(view, i2), f);
    }

    public static int l(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? yy0.c(context, i) : typedValue.data;
    }
}
