package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class rq {
    public final View a;
    public jg6 d;
    public jg6 e;
    public jg6 f;
    public int c = -1;
    public final ir b = ir.b();

    public rq(View view) {
        this.a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new jg6();
        }
        jg6 jg6Var = this.f;
        jg6Var.a();
        ColorStateList colorStateListS = dq7.s(this.a);
        if (colorStateListS != null) {
            jg6Var.d = true;
            jg6Var.a = colorStateListS;
        }
        PorterDuff.Mode modeT = dq7.t(this.a);
        if (modeT != null) {
            jg6Var.c = true;
            jg6Var.b = modeT;
        }
        if (!jg6Var.d && !jg6Var.c) {
            return false;
        }
        ir.i(drawable, jg6Var, this.a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            jg6 jg6Var = this.e;
            if (jg6Var != null) {
                ir.i(background, jg6Var, this.a.getDrawableState());
                return;
            }
            jg6 jg6Var2 = this.d;
            if (jg6Var2 != null) {
                ir.i(background, jg6Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        jg6 jg6Var = this.e;
        if (jg6Var != null) {
            return jg6Var.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        jg6 jg6Var = this.e;
        if (jg6Var != null) {
            return jg6Var.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = c25.D3;
        lg6 lg6VarV = lg6.v(context, attributeSet, iArr, i, 0);
        View view = this.a;
        dq7.o0(view, view.getContext(), iArr, attributeSet, lg6VarV.r(), i, 0);
        try {
            int i2 = c25.E3;
            if (lg6VarV.s(i2)) {
                this.c = lg6VarV.n(i2, -1);
                ColorStateList colorStateListF = this.b.f(this.a.getContext(), this.c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i3 = c25.F3;
            if (lg6VarV.s(i3)) {
                dq7.v0(this.a, lg6VarV.c(i3));
            }
            int i4 = c25.G3;
            if (lg6VarV.s(i4)) {
                dq7.w0(this.a, zw1.d(lg6VarV.k(i4, -1), null));
            }
            lg6VarV.w();
        } catch (Throwable th) {
            lg6VarV.w();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        this.c = i;
        ir irVar = this.b;
        h(irVar != null ? irVar.f(this.a.getContext(), i) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new jg6();
            }
            jg6 jg6Var = this.d;
            jg6Var.a = colorStateList;
            jg6Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new jg6();
        }
        jg6 jg6Var = this.e;
        jg6Var.a = colorStateList;
        jg6Var.d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new jg6();
        }
        jg6 jg6Var = this.e;
        jg6Var.b = mode;
        jg6Var.c = true;
        b();
    }

    public final boolean k() {
        return this.d != null;
    }
}
