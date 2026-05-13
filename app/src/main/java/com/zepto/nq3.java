package com.zepto;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public class nq3 {
    public static final boolean u = true;
    public static final boolean v = false;
    public final MaterialButton a;
    public e06 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean q;
    public LayerDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public nq3(MaterialButton materialButton, e06 e06Var) {
        this.a = materialButton;
        this.b = e06Var;
    }

    public void A(boolean z) {
        this.n = z;
        J();
    }

    public void B(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            J();
        }
    }

    public void C(int i) {
        if (this.h != i) {
            this.h = i;
            J();
        }
    }

    public void D(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (f() != null) {
                tw1.o(f(), this.j);
            }
        }
    }

    public void E(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (f() == null || this.i == null) {
                return;
            }
            tw1.p(f(), this.i);
        }
    }

    public void F(boolean z) {
        this.r = z;
    }

    public final void G(int i, int i2) {
        int iG = dq7.G(this.a);
        int paddingTop = this.a.getPaddingTop();
        int iF = dq7.F(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            H();
        }
        dq7.F0(this.a, iG, (paddingTop + i) - i3, iF, (paddingBottom + i2) - i4);
    }

    public final void H() {
        this.a.setInternalBackground(a());
        wq3 wq3VarF = f();
        if (wq3VarF != null) {
            wq3VarF.V(this.t);
            wq3VarF.setState(this.a.getDrawableState());
        }
    }

    public final void I(e06 e06Var) {
        if (v && !this.o) {
            int iG = dq7.G(this.a);
            int paddingTop = this.a.getPaddingTop();
            int iF = dq7.F(this.a);
            int paddingBottom = this.a.getPaddingBottom();
            H();
            dq7.F0(this.a, iG, paddingTop, iF, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(e06Var);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(e06Var);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(e06Var);
        }
    }

    public final void J() {
        wq3 wq3VarF = f();
        wq3 wq3VarN = n();
        if (wq3VarF != null) {
            wq3VarF.d0(this.h, this.k);
            if (wq3VarN != null) {
                wq3VarN.c0(this.h, this.n ? sq3.d(this.a, xy4.m) : 0);
            }
        }
    }

    public final InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final Drawable a() {
        wq3 wq3Var = new wq3(this.b);
        wq3Var.M(this.a.getContext());
        tw1.o(wq3Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            tw1.p(wq3Var, mode);
        }
        wq3Var.d0(this.h, this.k);
        wq3 wq3Var2 = new wq3(this.b);
        wq3Var2.setTint(0);
        wq3Var2.c0(this.h, this.n ? sq3.d(this.a, xy4.m) : 0);
        if (u) {
            wq3 wq3Var3 = new wq3(this.b);
            this.m = wq3Var3;
            tw1.n(wq3Var3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(ge5.a(this.l), K(new LayerDrawable(new Drawable[]{wq3Var2, wq3Var})), this.m);
            this.s = rippleDrawable;
            return rippleDrawable;
        }
        fe5 fe5Var = new fe5(this.b);
        this.m = fe5Var;
        tw1.o(fe5Var, ge5.a(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{wq3Var2, wq3Var, this.m});
        this.s = layerDrawable;
        return K(layerDrawable);
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public h06 e() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (h06) this.s.getDrawable(2) : (h06) this.s.getDrawable(1);
    }

    public wq3 f() {
        return g(false);
    }

    public final wq3 g(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return u ? (wq3) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (wq3) this.s.getDrawable(!z ? 1 : 0);
    }

    public ColorStateList h() {
        return this.l;
    }

    public e06 i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.k;
    }

    public int k() {
        return this.h;
    }

    public ColorStateList l() {
        return this.j;
    }

    public PorterDuff.Mode m() {
        return this.i;
    }

    public final wq3 n() {
        return g(true);
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.q;
    }

    public boolean q() {
        return this.r;
    }

    public void r(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(m15.E2, 0);
        this.d = typedArray.getDimensionPixelOffset(m15.F2, 0);
        this.e = typedArray.getDimensionPixelOffset(m15.G2, 0);
        this.f = typedArray.getDimensionPixelOffset(m15.H2, 0);
        int i = m15.L2;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.g = dimensionPixelSize;
            z(this.b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(m15.V2, 0);
        this.i = zr7.i(typedArray.getInt(m15.K2, -1), PorterDuff.Mode.SRC_IN);
        this.j = vq3.a(this.a.getContext(), typedArray, m15.J2);
        this.k = vq3.a(this.a.getContext(), typedArray, m15.U2);
        this.l = vq3.a(this.a.getContext(), typedArray, m15.T2);
        this.q = typedArray.getBoolean(m15.I2, false);
        this.t = typedArray.getDimensionPixelSize(m15.M2, 0);
        this.r = typedArray.getBoolean(m15.W2, true);
        int iG = dq7.G(this.a);
        int paddingTop = this.a.getPaddingTop();
        int iF = dq7.F(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(m15.D2)) {
            t();
        } else {
            H();
        }
        dq7.F0(this.a, iG + this.c, paddingTop + this.e, iF + this.d, paddingBottom + this.f);
    }

    public void s(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    public void t() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public void u(boolean z) {
        this.q = z;
    }

    public void v(int i) {
        if (this.p && this.g == i) {
            return;
        }
        this.g = i;
        this.p = true;
        z(this.b.w(i));
    }

    public void w(int i) {
        G(this.e, i);
    }

    public void x(int i) {
        G(i, this.f);
    }

    public void y(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = u;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(ge5.a(colorStateList));
            } else {
                if (z || !(this.a.getBackground() instanceof fe5)) {
                    return;
                }
                ((fe5) this.a.getBackground()).setTintList(ge5.a(colorStateList));
            }
        }
    }

    public void z(e06 e06Var) {
        this.b = e06Var;
        I(e06Var);
    }
}
