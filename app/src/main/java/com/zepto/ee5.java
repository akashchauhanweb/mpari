package com.zepto;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class ee5 extends i16 {
    public final SideSheetBehavior a;

    public ee5(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // com.zepto.i16
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.zepto.i16
    public float b(int i) {
        float fE = e();
        return (fE - i) / (fE - d());
    }

    @Override // com.zepto.i16
    public int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.zepto.i16
    public int d() {
        return Math.max(0, (e() - this.a.d0()) - this.a.k0());
    }

    @Override // com.zepto.i16
    public int e() {
        return this.a.n0();
    }

    @Override // com.zepto.i16
    public int f() {
        return this.a.n0();
    }

    @Override // com.zepto.i16
    public int g() {
        return d();
    }

    @Override // com.zepto.i16
    public int h(View view) {
        return view.getLeft() - this.a.k0();
    }

    @Override // com.zepto.i16
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.zepto.i16
    public int j() {
        return 0;
    }

    @Override // com.zepto.i16
    public boolean k(float f) {
        return f < 0.0f;
    }

    @Override // com.zepto.i16
    public boolean l(View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // com.zepto.i16
    public boolean m(float f, float f2) {
        return j16.a(f, f2) && Math.abs(f) > ((float) this.a.o0());
    }

    @Override // com.zepto.i16
    public boolean n(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.a.i0())) > this.a.j0();
    }

    @Override // com.zepto.i16
    public void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // com.zepto.i16
    public void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int iN0 = this.a.n0();
        if (i <= iN0) {
            marginLayoutParams.rightMargin = iN0 - i;
        }
    }
}
