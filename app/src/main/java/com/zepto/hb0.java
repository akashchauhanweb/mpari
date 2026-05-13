package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class hb0 implements jb0 {
    @Override // com.zepto.jb0
    public void a(ib0 ib0Var, float f) {
        p(ib0Var).g(f, ib0Var.e(), ib0Var.d());
        n(ib0Var);
    }

    @Override // com.zepto.jb0
    public ColorStateList b(ib0 ib0Var) {
        return p(ib0Var).b();
    }

    @Override // com.zepto.jb0
    public void c(ib0 ib0Var, ColorStateList colorStateList) {
        p(ib0Var).f(colorStateList);
    }

    @Override // com.zepto.jb0
    public void d(ib0 ib0Var) {
        a(ib0Var, g(ib0Var));
    }

    @Override // com.zepto.jb0
    public void e(ib0 ib0Var, float f) {
        p(ib0Var).h(f);
    }

    @Override // com.zepto.jb0
    public void f() {
    }

    @Override // com.zepto.jb0
    public float g(ib0 ib0Var) {
        return p(ib0Var).c();
    }

    @Override // com.zepto.jb0
    public float h(ib0 ib0Var) {
        return p(ib0Var).d();
    }

    @Override // com.zepto.jb0
    public void i(ib0 ib0Var, float f) {
        ib0Var.b().setElevation(f);
    }

    @Override // com.zepto.jb0
    public void j(ib0 ib0Var) {
        a(ib0Var, g(ib0Var));
    }

    @Override // com.zepto.jb0
    public float k(ib0 ib0Var) {
        return h(ib0Var) * 2.0f;
    }

    @Override // com.zepto.jb0
    public float l(ib0 ib0Var) {
        return h(ib0Var) * 2.0f;
    }

    @Override // com.zepto.jb0
    public float m(ib0 ib0Var) {
        return ib0Var.b().getElevation();
    }

    @Override // com.zepto.jb0
    public void n(ib0 ib0Var) {
        if (!ib0Var.e()) {
            ib0Var.a(0, 0, 0, 0);
            return;
        }
        float fG = g(ib0Var);
        float fH = h(ib0Var);
        int iCeil = (int) Math.ceil(xe5.a(fG, fH, ib0Var.d()));
        int iCeil2 = (int) Math.ceil(xe5.b(fG, fH, ib0Var.d()));
        ib0Var.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // com.zepto.jb0
    public void o(ib0 ib0Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        ib0Var.c(new we5(colorStateList, f));
        View viewB = ib0Var.b();
        viewB.setClipToOutline(true);
        viewB.setElevation(f2);
        a(ib0Var, f3);
    }

    public final we5 p(ib0 ib0Var) {
        return (we5) ib0Var.f();
    }
}
