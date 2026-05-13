package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public class wq {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public wq(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable drawableA = zu0.a(this.a);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = tw1.r(drawableA).mutate();
                if (this.d) {
                    tw1.o(drawableMutate, this.b);
                }
                if (this.e) {
                    tw1.p(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public int b(int i) {
        return i;
    }

    public ColorStateList c() {
        return this.b;
    }

    public PorterDuff.Mode d() {
        return this.c;
    }

    public void e(AttributeSet attributeSet, int i) {
        int i2;
        int iN;
        int iN2;
        Context context = this.a.getContext();
        int[] iArr = c25.U0;
        lg6 lg6VarV = lg6.v(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.a;
        dq7.o0(compoundButton, compoundButton.getContext(), iArr, attributeSet, lg6VarV.r(), i, 0);
        try {
            int i3 = c25.W0;
            if (!lg6VarV.s(i3) || (iN2 = lg6VarV.n(i3, 0)) == 0) {
                i2 = c25.V0;
                if (lg6VarV.s(i2) && (iN = lg6VarV.n(i2, 0)) != 0) {
                    CompoundButton compoundButton2 = this.a;
                    compoundButton2.setButtonDrawable(tr.b(compoundButton2.getContext(), iN));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.a;
                    compoundButton3.setButtonDrawable(tr.b(compoundButton3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i2 = c25.V0;
                    if (lg6VarV.s(i2)) {
                        CompoundButton compoundButton22 = this.a;
                        compoundButton22.setButtonDrawable(tr.b(compoundButton22.getContext(), iN));
                    }
                }
            }
            int i4 = c25.X0;
            if (lg6VarV.s(i4)) {
                zu0.d(this.a, lg6VarV.c(i4));
            }
            int i5 = c25.Y0;
            if (lg6VarV.s(i5)) {
                zu0.e(this.a, zw1.d(lg6VarV.k(i5, -1), null));
            }
        } finally {
            lg6VarV.w();
        }
    }

    public void f() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    public void g(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
