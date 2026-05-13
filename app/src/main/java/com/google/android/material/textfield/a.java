package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.zepto.am4;
import com.zepto.b15;
import com.zepto.dq7;
import com.zepto.ef6;
import com.zepto.f41;
import com.zepto.gf6;
import com.zepto.jz4;
import com.zepto.l22;
import com.zepto.lg6;
import com.zepto.lq0;
import com.zepto.m15;
import com.zepto.nx1;
import com.zepto.o94;
import com.zepto.p05;
import com.zepto.tr;
import com.zepto.tw1;
import com.zepto.vq3;
import com.zepto.wb0;
import com.zepto.wp3;
import com.zepto.yw2;
import com.zepto.z2;
import com.zepto.zr7;
import com.zepto.zz4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final d h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final TextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public z2.b u;
    public final TextWatcher v;
    public final TextInputLayout.f w;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0041a extends gf6 {
        public C0041a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // com.zepto.gf6, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.m().b(charSequence, i, i2, i3);
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (a.this.s == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.s != null) {
                a.this.s.removeTextChangedListener(a.this.v);
                if (a.this.s.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.s.setOnFocusChangeListener(null);
                }
            }
            a.this.s = textInputLayout.getEditText();
            if (a.this.s != null) {
                a.this.s.addTextChangedListener(a.this.v);
            }
            a.this.m().n(a.this.s);
            a aVar = a.this;
            aVar.h0(aVar.m());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.M();
        }
    }

    public static class d {
        public final SparseArray a = new SparseArray();
        public final a b;
        public final int c;
        public final int d;

        public d(a aVar, lg6 lg6Var) {
            this.b = aVar;
            this.c = lg6Var.n(m15.j7, 0);
            this.d = lg6Var.n(m15.H7, 0);
        }

        public final l22 b(int i) {
            if (i == -1) {
                return new f41(this.b);
            }
            if (i == 0) {
                return new o94(this.b);
            }
            if (i == 1) {
                return new am4(this.b, this.d);
            }
            if (i == 2) {
                return new lq0(this.b);
            }
            if (i == 3) {
                return new nx1(this.b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }

        public l22 c(int i) {
            l22 l22Var = (l22) this.a.get(i);
            if (l22Var != null) {
                return l22Var;
            }
            l22 l22VarB = b(i);
            this.a.append(i, l22VarB);
            return l22VarB;
        }
    }

    public a(TextInputLayout textInputLayout, lg6 lg6Var) {
        super(textInputLayout.getContext());
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new C0041a();
        b bVar = new b();
        this.w = bVar;
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, zz4.N);
        this.c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, zz4.M);
        this.g = checkableImageButtonI2;
        this.h = new d(this, lg6Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.q = appCompatTextView;
        C(lg6Var);
        B(lg6Var);
        D(lg6Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public boolean A() {
        return this.i != 0;
    }

    public final void B(lg6 lg6Var) {
        int i = m15.I7;
        if (!lg6Var.s(i)) {
            int i2 = m15.n7;
            if (lg6Var.s(i2)) {
                this.k = vq3.b(getContext(), lg6Var, i2);
            }
            int i3 = m15.o7;
            if (lg6Var.s(i3)) {
                this.l = zr7.i(lg6Var.k(i3, -1), null);
            }
        }
        int i4 = m15.l7;
        if (lg6Var.s(i4)) {
            U(lg6Var.k(i4, 0));
            int i5 = m15.i7;
            if (lg6Var.s(i5)) {
                Q(lg6Var.p(i5));
            }
            O(lg6Var.a(m15.h7, true));
        } else if (lg6Var.s(i)) {
            int i6 = m15.J7;
            if (lg6Var.s(i6)) {
                this.k = vq3.b(getContext(), lg6Var, i6);
            }
            int i7 = m15.K7;
            if (lg6Var.s(i7)) {
                this.l = zr7.i(lg6Var.k(i7, -1), null);
            }
            U(lg6Var.a(i, false) ? 1 : 0);
            Q(lg6Var.p(m15.G7));
        }
        T(lg6Var.f(m15.k7, getResources().getDimensionPixelSize(jz4.X)));
        int i8 = m15.m7;
        if (lg6Var.s(i8)) {
            X(yw2.b(lg6Var.k(i8, -1)));
        }
    }

    public final void C(lg6 lg6Var) {
        int i = m15.t7;
        if (lg6Var.s(i)) {
            this.d = vq3.b(getContext(), lg6Var, i);
        }
        int i2 = m15.u7;
        if (lg6Var.s(i2)) {
            this.e = zr7.i(lg6Var.k(i2, -1), null);
        }
        int i3 = m15.s7;
        if (lg6Var.s(i3)) {
            c0(lg6Var.g(i3));
        }
        this.c.setContentDescription(getResources().getText(b15.f));
        dq7.B0(this.c, 2);
        this.c.setClickable(false);
        this.c.setPressable(false);
        this.c.setFocusable(false);
    }

    public final void D(lg6 lg6Var) {
        this.q.setVisibility(8);
        this.q.setId(zz4.T);
        this.q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        dq7.s0(this.q, 1);
        q0(lg6Var.n(m15.Z7, 0));
        int i = m15.a8;
        if (lg6Var.s(i)) {
            r0(lg6Var.c(i));
        }
        p0(lg6Var.p(m15.Y7));
    }

    public boolean E() {
        return A() && this.g.isChecked();
    }

    public boolean F() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public boolean G() {
        return this.c.getVisibility() == 0;
    }

    public void H(boolean z) {
        this.r = z;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.a.d0());
        }
    }

    public void J() {
        yw2.d(this.a, this.g, this.k);
    }

    public void K() {
        yw2.d(this.a, this.c, this.d);
    }

    public void L(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        l22 l22VarM = m();
        boolean z3 = true;
        if (!l22VarM.l() || (zIsChecked = this.g.isChecked()) == l22VarM.m()) {
            z2 = false;
        } else {
            this.g.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!l22VarM.j() || (zIsActivated = this.g.isActivated()) == l22VarM.k()) {
            z3 = z2;
        } else {
            N(!zIsActivated);
        }
        if (z || z3) {
            J();
        }
    }

    public final void M() {
        AccessibilityManager accessibilityManager;
        z2.b bVar = this.u;
        if (bVar == null || (accessibilityManager = this.t) == null) {
            return;
        }
        z2.b(accessibilityManager, bVar);
    }

    public void N(boolean z) {
        this.g.setActivated(z);
    }

    public void O(boolean z) {
        this.g.setCheckable(z);
    }

    public void P(int i) {
        Q(i != 0 ? getResources().getText(i) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.g.setContentDescription(charSequence);
        }
    }

    public void R(int i) {
        S(i != 0 ? tr.b(getContext(), i) : null);
    }

    public void S(Drawable drawable) {
        this.g.setImageDrawable(drawable);
        if (drawable != null) {
            yw2.a(this.a, this.g, this.k, this.l);
            J();
        }
    }

    public void T(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.m) {
            this.m = i;
            yw2.g(this.g, i);
            yw2.g(this.c, i);
        }
    }

    public void U(int i) {
        if (this.i == i) {
            return;
        }
        t0(m());
        int i2 = this.i;
        this.i = i;
        j(i2);
        a0(i != 0);
        l22 l22VarM = m();
        R(t(l22VarM));
        P(l22VarM.c());
        O(l22VarM.l());
        if (!l22VarM.i(this.a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        s0(l22VarM);
        V(l22VarM.f());
        EditText editText = this.s;
        if (editText != null) {
            l22VarM.n(editText);
            h0(l22VarM);
        }
        yw2.a(this.a, this.g, this.k, this.l);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        yw2.h(this.g, onClickListener, this.o);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.o = onLongClickListener;
        yw2.i(this.g, onLongClickListener);
    }

    public void X(ImageView.ScaleType scaleType) {
        this.n = scaleType;
        yw2.j(this.g, scaleType);
        yw2.j(this.c, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            yw2.a(this.a, this.g, colorStateList, this.l);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            yw2.a(this.a, this.g, this.k, mode);
        }
    }

    public void a0(boolean z) {
        if (F() != z) {
            this.g.setVisibility(z ? 0 : 8);
            v0();
            x0();
            this.a.o0();
        }
    }

    public void b0(int i) {
        c0(i != 0 ? tr.b(getContext(), i) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.c.setImageDrawable(drawable);
        w0();
        yw2.a(this.a, this.c, this.d, this.e);
    }

    public void d0(View.OnClickListener onClickListener) {
        yw2.h(this.c, onClickListener, this.f);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f = onLongClickListener;
        yw2.i(this.c, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            yw2.a(this.a, this.c, colorStateList, this.e);
        }
    }

    public final void g() {
        if (this.u == null || this.t == null || !dq7.T(this)) {
            return;
        }
        z2.a(this.t, this.u);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            yw2.a(this.a, this.c, this.d, mode);
        }
    }

    public void h() {
        this.g.performClick();
        this.g.jumpDrawablesToCurrentState();
    }

    public final void h0(l22 l22Var) {
        if (this.s == null) {
            return;
        }
        if (l22Var.e() != null) {
            this.s.setOnFocusChangeListener(l22Var.e());
        }
        if (l22Var.g() != null) {
            this.g.setOnFocusChangeListener(l22Var.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(p05.j, viewGroup, false);
        checkableImageButton.setId(i);
        yw2.e(checkableImageButton);
        if (vq3.g(getContext())) {
            wp3.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void i0(int i) {
        j0(i != 0 ? getResources().getText(i) : null);
    }

    public final void j(int i) {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            wb0.a(it.next());
            throw null;
        }
    }

    public void j0(CharSequence charSequence) {
        this.g.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.c;
        }
        if (A() && F()) {
            return this.g;
        }
        return null;
    }

    public void k0(int i) {
        l0(i != 0 ? tr.b(getContext(), i) : null);
    }

    public CharSequence l() {
        return this.g.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.g.setImageDrawable(drawable);
    }

    public l22 m() {
        return this.h.c(this.i);
    }

    public void m0(boolean z) {
        if (z && this.i != 1) {
            U(1);
        } else {
            if (z) {
                return;
            }
            U(0);
        }
    }

    public Drawable n() {
        return this.g.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.k = colorStateList;
        yw2.a(this.a, this.g, colorStateList, this.l);
    }

    public int o() {
        return this.m;
    }

    public void o0(PorterDuff.Mode mode) {
        this.l = mode;
        yw2.a(this.a, this.g, this.k, mode);
    }

    public int p() {
        return this.i;
    }

    public void p0(CharSequence charSequence) {
        this.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.q.setText(charSequence);
        y0();
    }

    public ImageView.ScaleType q() {
        return this.n;
    }

    public void q0(int i) {
        ef6.n(this.q, i);
    }

    public CheckableImageButton r() {
        return this.g;
    }

    public void r0(ColorStateList colorStateList) {
        this.q.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.c.getDrawable();
    }

    public final void s0(l22 l22Var) {
        l22Var.s();
        this.u = l22Var.h();
        g();
    }

    public final int t(l22 l22Var) {
        int i = this.h.c;
        return i == 0 ? l22Var.d() : i;
    }

    public final void t0(l22 l22Var) {
        M();
        this.u = null;
        l22Var.u();
    }

    public CharSequence u() {
        return this.g.getContentDescription();
    }

    public final void u0(boolean z) {
        if (!z || n() == null) {
            yw2.a(this.a, this.g, this.k, this.l);
            return;
        }
        Drawable drawableMutate = tw1.r(n()).mutate();
        tw1.n(drawableMutate, this.a.getErrorCurrentTextColors());
        this.g.setImageDrawable(drawableMutate);
    }

    public Drawable v() {
        return this.g.getDrawable();
    }

    public final void v0() {
        this.b.setVisibility((this.g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.p == null || this.r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public CharSequence w() {
        return this.p;
    }

    public final void w0() {
        this.c.setVisibility(s() != null && this.a.N() && this.a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.a.o0();
    }

    public ColorStateList x() {
        return this.q.getTextColors();
    }

    public void x0() {
        if (this.a.d == null) {
            return;
        }
        dq7.F0(this.q, getContext().getResources().getDimensionPixelSize(jz4.G), this.a.d.getPaddingTop(), (F() || G()) ? 0 : dq7.F(this.a.d), this.a.d.getPaddingBottom());
    }

    public int y() {
        return dq7.F(this) + dq7.F(this.q) + ((F() || G()) ? this.g.getMeasuredWidth() + wp3.b((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()) : 0);
    }

    public final void y0() {
        int visibility = this.q.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            m().q(i == 0);
        }
        v0();
        this.q.setVisibility(i);
        this.a.o0();
    }

    public TextView z() {
        return this.q;
    }
}
