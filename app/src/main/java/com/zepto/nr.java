package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class nr {
    public final ImageView a;
    public jg6 b;
    public jg6 c;
    public jg6 d;
    public int e = 0;

    public nr(ImageView imageView) {
        this.a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new jg6();
        }
        jg6 jg6Var = this.d;
        jg6Var.a();
        ColorStateList colorStateListA = xx2.a(this.a);
        if (colorStateListA != null) {
            jg6Var.d = true;
            jg6Var.a = colorStateListA;
        }
        PorterDuff.Mode modeB = xx2.b(this.a);
        if (modeB != null) {
            jg6Var.c = true;
            jg6Var.b = modeB;
        }
        if (!jg6Var.d && !jg6Var.c) {
            return false;
        }
        ir.i(drawable, jg6Var, this.a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    public void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            zw1.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            jg6 jg6Var = this.c;
            if (jg6Var != null) {
                ir.i(drawable, jg6Var, this.a.getDrawableState());
                return;
            }
            jg6 jg6Var2 = this.b;
            if (jg6Var2 != null) {
                ir.i(drawable, jg6Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        jg6 jg6Var = this.c;
        if (jg6Var != null) {
            return jg6Var.a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        jg6 jg6Var = this.c;
        if (jg6Var != null) {
            return jg6Var.b;
        }
        return null;
    }

    public boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i) {
        int iN;
        Context context = this.a.getContext();
        int[] iArr = c25.P;
        lg6 lg6VarV = lg6.v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.a;
        dq7.o0(imageView, imageView.getContext(), iArr, attributeSet, lg6VarV.r(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iN = lg6VarV.n(c25.Q, -1)) != -1 && (drawable = tr.b(this.a.getContext(), iN)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                zw1.b(drawable);
            }
            int i2 = c25.R;
            if (lg6VarV.s(i2)) {
                xx2.c(this.a, lg6VarV.c(i2));
            }
            int i3 = c25.S;
            if (lg6VarV.s(i3)) {
                xx2.d(this.a, zw1.d(lg6VarV.k(i3, -1), null));
            }
            lg6VarV.w();
        } catch (Throwable th) {
            lg6VarV.w();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable drawableB = tr.b(this.a.getContext(), i);
            if (drawableB != null) {
                zw1.b(drawableB);
            }
            this.a.setImageDrawable(drawableB);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new jg6();
        }
        jg6 jg6Var = this.c;
        jg6Var.a = colorStateList;
        jg6Var.d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new jg6();
        }
        jg6 jg6Var = this.c;
        jg6Var.b = mode;
        jg6Var.c = true;
        c();
    }

    public final boolean l() {
        return this.b != null;
    }
}
