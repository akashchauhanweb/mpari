package com.zepto;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public class n66 extends LinearLayout {
    public final TextInputLayout a;
    public final TextView b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public int g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;
    public boolean j;

    public n66(TextInputLayout textInputLayout, lg6 lg6Var) {
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(p05.k, (ViewGroup) this, false);
        this.d = checkableImageButton;
        yw2.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.b = appCompatTextView;
        j(lg6Var);
        i(lg6Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public void A(r3 r3Var) {
        if (this.b.getVisibility() != 0) {
            r3Var.u0(this.d);
        } else {
            r3Var.g0(this.b);
            r3Var.u0(this.b);
        }
    }

    public void B() {
        EditText editText = this.a.d;
        if (editText == null) {
            return;
        }
        dq7.F0(this.b, k() ? 0 : dq7.G(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(jz4.G), editText.getCompoundPaddingBottom());
    }

    public final void C() {
        int i = (this.c == null || this.j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.b.setVisibility(i);
        this.a.o0();
    }

    public CharSequence a() {
        return this.c;
    }

    public ColorStateList b() {
        return this.b.getTextColors();
    }

    public int c() {
        return dq7.G(this) + dq7.G(this.b) + (k() ? this.d.getMeasuredWidth() + wp3.a((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()) : 0);
    }

    public TextView d() {
        return this.b;
    }

    public CharSequence e() {
        return this.d.getContentDescription();
    }

    public Drawable f() {
        return this.d.getDrawable();
    }

    public int g() {
        return this.g;
    }

    public ImageView.ScaleType h() {
        return this.h;
    }

    public final void i(lg6 lg6Var) {
        this.b.setVisibility(8);
        this.b.setId(zz4.S);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dq7.s0(this.b, 1);
        o(lg6Var.n(m15.P7, 0));
        int i = m15.Q7;
        if (lg6Var.s(i)) {
            p(lg6Var.c(i));
        }
        n(lg6Var.p(m15.O7));
    }

    public final void j(lg6 lg6Var) {
        if (vq3.g(getContext())) {
            wp3.c((ViewGroup.MarginLayoutParams) this.d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        int i = m15.W7;
        if (lg6Var.s(i)) {
            this.e = vq3.b(getContext(), lg6Var, i);
        }
        int i2 = m15.X7;
        if (lg6Var.s(i2)) {
            this.f = zr7.i(lg6Var.k(i2, -1), null);
        }
        int i3 = m15.T7;
        if (lg6Var.s(i3)) {
            s(lg6Var.g(i3));
            int i4 = m15.S7;
            if (lg6Var.s(i4)) {
                r(lg6Var.p(i4));
            }
            q(lg6Var.a(m15.R7, true));
        }
        t(lg6Var.f(m15.U7, getResources().getDimensionPixelSize(jz4.X)));
        int i5 = m15.V7;
        if (lg6Var.s(i5)) {
            w(yw2.b(lg6Var.k(i5, -1)));
        }
    }

    public boolean k() {
        return this.d.getVisibility() == 0;
    }

    public void l(boolean z) {
        this.j = z;
        C();
    }

    public void m() {
        yw2.d(this.a, this.d, this.e);
    }

    public void n(CharSequence charSequence) {
        this.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.b.setText(charSequence);
        C();
    }

    public void o(int i) {
        ef6.n(this.b, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        B();
    }

    public void p(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    public void q(boolean z) {
        this.d.setCheckable(z);
    }

    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    public void s(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            yw2.a(this.a, this.d, this.e, this.f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    public void t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.g) {
            this.g = i;
            yw2.g(this.d, i);
        }
    }

    public void u(View.OnClickListener onClickListener) {
        yw2.h(this.d, onClickListener, this.i);
    }

    public void v(View.OnLongClickListener onLongClickListener) {
        this.i = onLongClickListener;
        yw2.i(this.d, onLongClickListener);
    }

    public void w(ImageView.ScaleType scaleType) {
        this.h = scaleType;
        yw2.j(this.d, scaleType);
    }

    public void x(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            yw2.a(this.a, this.d, colorStateList, this.f);
        }
    }

    public void y(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            yw2.a(this.a, this.d, this.e, mode);
        }
    }

    public void z(boolean z) {
        if (k() != z) {
            this.d.setVisibility(z ? 0 : 8);
            B();
            C();
        }
    }
}
