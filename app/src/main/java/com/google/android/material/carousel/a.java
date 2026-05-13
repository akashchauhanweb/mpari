package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.b;
import com.zepto.jz4;
import com.zepto.kx;
import com.zepto.ob0;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static float a(float f, float f2, int i) {
        return f + (Math.max(0, i - 1) * f2);
    }

    public static float b(float f, float f2, int i) {
        return i > 0 ? f + (f2 / 2.0f) : f;
    }

    public static b c(Context context, float f, float f2, kx kxVar) {
        float f3;
        float f4;
        float fMin = Math.min(f(context) + f, kxVar.f);
        float f5 = fMin / 2.0f;
        float f6 = 0.0f - f5;
        float fB = b(0.0f, kxVar.b, kxVar.c);
        float fJ = j(0.0f, a(fB, kxVar.b, (int) Math.floor(kxVar.c / 2.0f)), kxVar.b, kxVar.c);
        float fB2 = b(fJ, kxVar.e, kxVar.d);
        float fJ2 = j(fJ, a(fB2, kxVar.e, (int) Math.floor(kxVar.d / 2.0f)), kxVar.e, kxVar.d);
        float fB3 = b(fJ2, kxVar.f, kxVar.g);
        float fJ3 = j(fJ2, a(fB3, kxVar.f, kxVar.g), kxVar.f, kxVar.g);
        float fB4 = b(fJ3, kxVar.e, kxVar.d);
        float fB5 = b(j(fJ3, a(fB4, kxVar.e, (int) Math.ceil(kxVar.d / 2.0f)), kxVar.e, kxVar.d), kxVar.b, kxVar.c);
        float f7 = f5 + f2;
        float fB6 = ob0.b(fMin, kxVar.f, f);
        float fB7 = ob0.b(kxVar.b, kxVar.f, f);
        float fB8 = ob0.b(kxVar.e, kxVar.f, f);
        b.C0035b c0035bA = new b.C0035b(kxVar.f, f2).a(f6, fB6, fMin);
        if (kxVar.c > 0) {
            f3 = f7;
            c0035bA.f(fB, fB7, kxVar.b, (int) Math.floor(r7 / 2.0f));
        } else {
            f3 = f7;
        }
        if (kxVar.d > 0) {
            c0035bA.f(fB2, fB8, kxVar.e, (int) Math.floor(r4 / 2.0f));
        }
        c0035bA.g(fB3, 0.0f, kxVar.f, kxVar.g, true);
        if (kxVar.d > 0) {
            f4 = 2.0f;
            c0035bA.f(fB4, fB8, kxVar.e, (int) Math.ceil(r4 / 2.0f));
        } else {
            f4 = 2.0f;
        }
        if (kxVar.c > 0) {
            c0035bA.f(fB5, fB7, kxVar.b, (int) Math.ceil(r0 / f4));
        }
        c0035bA.a(f3, fB6, fMin);
        return c0035bA.h();
    }

    public static b d(Context context, float f, float f2, kx kxVar, int i) {
        return i == 1 ? c(context, f, f2, kxVar) : e(context, f, f2, kxVar);
    }

    public static b e(Context context, float f, float f2, kx kxVar) {
        float fMin = Math.min(f(context) + f, kxVar.f);
        float f3 = fMin / 2.0f;
        float f4 = 0.0f - f3;
        float fB = b(0.0f, kxVar.f, kxVar.g);
        float fJ = j(0.0f, a(fB, kxVar.f, kxVar.g), kxVar.f, kxVar.g);
        float fB2 = b(fJ, kxVar.e, kxVar.d);
        float fB3 = b(j(fJ, fB2, kxVar.e, kxVar.d), kxVar.b, kxVar.c);
        float f5 = f3 + f2;
        float fB4 = ob0.b(fMin, kxVar.f, f);
        float fB5 = ob0.b(kxVar.b, kxVar.f, f);
        float fB6 = ob0.b(kxVar.e, kxVar.f, f);
        b.C0035b c0035bG = new b.C0035b(kxVar.f, f2).a(f4, fB4, fMin).g(fB, 0.0f, kxVar.f, kxVar.g, true);
        if (kxVar.d > 0) {
            c0035bG.b(fB2, fB6, kxVar.e);
        }
        int i = kxVar.c;
        if (i > 0) {
            c0035bG.f(fB3, fB5, kxVar.b, i);
        }
        c0035bG.a(f5, fB4, fMin);
        return c0035bG.h();
    }

    public static float f(Context context) {
        return context.getResources().getDimension(jz4.p);
    }

    public static float g(Context context) {
        return context.getResources().getDimension(jz4.q);
    }

    public static float h(Context context) {
        return context.getResources().getDimension(jz4.r);
    }

    public static int i(int[] iArr) {
        int i = IntCompanionObject.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static float j(float f, float f2, float f3, int i) {
        return i > 0 ? f2 + (f3 / 2.0f) : f;
    }
}
