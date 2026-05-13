package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class vq {
    public final CheckedTextView a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public vq(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = qj0.a(this.a);
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
                this.a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.c;
    }

    public void d(AttributeSet attributeSet, int i) {
        int i2;
        int iN;
        int iN2;
        Context context = this.a.getContext();
        int[] iArr = c25.P0;
        lg6 lg6VarV = lg6.v(context, attributeSet, iArr, i, 0);
        CheckedTextView checkedTextView = this.a;
        dq7.o0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, lg6VarV.r(), i, 0);
        try {
            int i3 = c25.R0;
            if (!lg6VarV.s(i3) || (iN2 = lg6VarV.n(i3, 0)) == 0) {
                i2 = c25.Q0;
                if (lg6VarV.s(i2) && (iN = lg6VarV.n(i2, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.a;
                    checkedTextView2.setCheckMarkDrawable(tr.b(checkedTextView2.getContext(), iN));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.a;
                    checkedTextView3.setCheckMarkDrawable(tr.b(checkedTextView3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i2 = c25.Q0;
                    if (lg6VarV.s(i2)) {
                        CheckedTextView checkedTextView22 = this.a;
                        checkedTextView22.setCheckMarkDrawable(tr.b(checkedTextView22.getContext(), iN));
                    }
                }
            }
            int i4 = c25.S0;
            if (lg6VarV.s(i4)) {
                qj0.b(this.a, lg6VarV.c(i4));
            }
            int i5 = c25.T0;
            if (lg6VarV.s(i5)) {
                qj0.c(this.a, zw1.d(lg6VarV.k(i5, -1), null));
            }
        } finally {
            lg6VarV.w();
        }
    }

    public void e() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
