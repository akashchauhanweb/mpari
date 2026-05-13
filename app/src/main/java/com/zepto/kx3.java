package com.zepto;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class kx3 extends ob0 {
    public static final int[] b = {1};
    public static final int[] c = {1, 0};
    public int a = 0;

    @Override // com.zepto.ob0
    public com.google.android.material.carousel.b c(kb0 kb0Var, View view) {
        float fC = kb0Var.c();
        if (kb0Var.f()) {
            fC = kb0Var.a();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (kb0Var.f()) {
            f = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f2 = f;
        float fH = com.google.android.material.carousel.a.h(view.getContext()) + f2;
        float fG = com.google.android.material.carousel.a.g(view.getContext()) + f2;
        float fMin = Math.min(measuredHeight + f2, fC);
        float fA = er3.a((measuredHeight / 3.0f) + f2, com.google.android.material.carousel.a.h(view.getContext()) + f2, com.google.android.material.carousel.a.g(view.getContext()) + f2);
        float f3 = (fMin + fA) / 2.0f;
        int[] iArrA = b;
        if (fC < 2.0f * fH) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = c;
        if (kb0Var.b() == 1) {
            iArrA = ob0.a(iArrA);
            iArrA2 = ob0.a(iArrA2);
        }
        int[] iArr = iArrA;
        int[] iArr2 = iArrA2;
        int iMax = (int) Math.max(1.0d, Math.floor(((fC - (com.google.android.material.carousel.a.i(iArr2) * f3)) - (com.google.android.material.carousel.a.i(iArr) * fG)) / fMin));
        int iCeil = (int) Math.ceil(fC / fMin);
        int i = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iCeil - i2;
        }
        kx kxVarC = kx.c(fC, fA, fH, fG, iArr, f3, iArr2, fMin, iArr3);
        this.a = kxVarC.e();
        if (e(kxVarC, kb0Var.e())) {
            kxVarC = kx.c(fC, fA, fH, fG, new int[]{kxVarC.c}, f3, new int[]{kxVarC.d}, fMin, new int[]{kxVarC.g});
        }
        return com.google.android.material.carousel.a.d(view.getContext(), f2, fC, kxVarC, kb0Var.b());
    }

    @Override // com.zepto.ob0
    public boolean d(kb0 kb0Var, int i) {
        return (i < this.a && kb0Var.e() >= this.a) || (i >= this.a && kb0Var.e() < this.a);
    }

    public boolean e(kx kxVar, int i) {
        int iE = kxVar.e() - i;
        boolean z = iE > 0 && (kxVar.c > 0 || kxVar.d > 1);
        while (iE > 0) {
            int i2 = kxVar.c;
            if (i2 > 0) {
                kxVar.c = i2 - 1;
            } else {
                int i3 = kxVar.d;
                if (i3 > 1) {
                    kxVar.d = i3 - 1;
                }
            }
            iE--;
        }
        return z;
    }
}
