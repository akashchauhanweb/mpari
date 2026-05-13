package com.zepto;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class pe3 extends i16 {
    public final SideSheetBehavior a;

    public pe3(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // com.zepto.i16
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.zepto.i16
    public float b(int i) {
        float fE = e();
        return (i - fE) / (d() - fE);
    }

    @Override // com.zepto.i16
    public int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.zepto.i16
    public int d() {
        return Math.max(0, this.a.m0() + this.a.k0());
    }

    @Override // com.zepto.i16
    public int e() {
        return (-this.a.d0()) - this.a.k0();
    }

    @Override // com.zepto.i16
    public int f() {
        return this.a.k0();
    }

    @Override // com.zepto.i16
    public int g() {
        return -this.a.d0();
    }

    @Override // com.zepto.i16
    public int h(View view) {
        return view.getRight() + this.a.k0();
    }

    @Override // com.zepto.i16
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.zepto.i16
    public int j() {
        return 1;
    }

    @Override // com.zepto.i16
    public boolean k(float f) {
        return f > 0.0f;
    }

    @Override // com.zepto.i16
    public boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.zepto.i16
    public boolean m(float f, float f2) {
        return j16.a(f, f2) && Math.abs(f) > ((float) this.a.o0());
    }

    @Override // com.zepto.i16
    public boolean n(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.a.i0())) > this.a.j0();
    }

    @Override // com.zepto.i16
    public void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // com.zepto.i16
    public void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.n0()) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
