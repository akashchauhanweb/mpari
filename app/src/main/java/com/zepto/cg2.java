package com.zepto;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class cg2 {
    public final eg2 a;

    public cg2(eg2 eg2Var) {
        this.a = eg2Var;
    }

    public static cg2 b(eg2 eg2Var) {
        return new cg2((eg2) lu4.h(eg2Var, "callbacks == null"));
    }

    public void a(sf2 sf2Var) {
        eg2 eg2Var = this.a;
        eg2Var.e.l(eg2Var, eg2Var, sf2Var);
    }

    public void c() {
        this.a.e.w();
    }

    public boolean d(MenuItem menuItem) {
        return this.a.e.z(menuItem);
    }

    public void e() {
        this.a.e.A();
    }

    public void f() {
        this.a.e.C();
    }

    public void g() {
        this.a.e.L();
    }

    public void h() {
        this.a.e.P();
    }

    public void i() {
        this.a.e.Q();
    }

    public void j() {
        this.a.e.S();
    }

    public boolean k() {
        return this.a.e.Z(true);
    }

    public mg2 l() {
        return this.a.e;
    }

    public void m() {
        this.a.e.Y0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.e.x0().onCreateView(view, str, context, attributeSet);
    }
}
