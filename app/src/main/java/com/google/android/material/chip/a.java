package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.zepto.ex3;
import com.zepto.gb0;
import com.zepto.ge5;
import com.zepto.if6;
import com.zepto.m15;
import com.zepto.o50;
import com.zepto.pe6;
import com.zepto.sq3;
import com.zepto.sr0;
import com.zepto.tr;
import com.zepto.tw1;
import com.zepto.ue6;
import com.zepto.vq3;
import com.zepto.wq3;
import com.zepto.yw1;
import com.zepto.zr7;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends wq3 implements Drawable.Callback, ue6.b {
    public static final int[] J0 = {R.attr.state_enabled};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public PorterDuff.Mode A0;
    public float B;
    public int[] B0;
    public float C;
    public boolean C0;
    public ColorStateList D;
    public ColorStateList D0;
    public float E;
    public WeakReference E0;
    public ColorStateList F;
    public TextUtils.TruncateAt F0;
    public CharSequence G;
    public boolean G0;
    public boolean H;
    public int H0;
    public Drawable I;
    public boolean I0;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public ex3 W;
    public ex3 X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public final Context g0;
    public final Paint h0;
    public final Paint i0;
    public final Paint.FontMetrics j0;
    public final RectF k0;
    public final PointF l0;
    public final Path m0;
    public final ue6 n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public boolean u0;
    public int v0;
    public int w0;
    public ColorFilter x0;
    public PorterDuffColorFilter y0;
    public ColorStateList z;
    public ColorStateList z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0036a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.C = -1.0f;
        this.h0 = new Paint(1);
        this.j0 = new Paint.FontMetrics();
        this.k0 = new RectF();
        this.l0 = new PointF();
        this.m0 = new Path();
        this.w0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.A0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference(null);
        M(context);
        this.g0 = context;
        ue6 ue6Var = new ue6(this);
        this.n0 = ue6Var;
        this.G = "";
        ue6Var.f().density = context.getResources().getDisplayMetrics().density;
        this.i0 = null;
        int[] iArr = J0;
        setState(iArr);
        k2(iArr);
        this.G0 = true;
        if (ge5.a) {
            K0.setTint(-1);
        }
    }

    public static boolean m1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean r1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean s1(pe6 pe6Var) {
        return (pe6Var == null || pe6Var.i() == null || !pe6Var.i().isStateful()) ? false : true;
    }

    public static a u0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.t1(attributeSet, i, i2);
        return aVar;
    }

    public final void A0(Canvas canvas, Rect rect) {
        if (O2()) {
            n0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.N.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            if (ge5.a) {
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                this.O.draw(canvas);
            } else {
                this.N.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    public void A1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (t0()) {
                tw1.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void A2(ex3 ex3Var) {
        this.W = ex3Var;
    }

    public final void B0(Canvas canvas, Rect rect) {
        this.h0.setColor(this.s0);
        this.h0.setStyle(Paint.Style.FILL);
        this.k0.set(rect);
        if (!this.I0) {
            canvas.drawRoundRect(this.k0, H0(), H0(), this.h0);
        } else {
            h(new RectF(rect), this.m0);
            super.p(canvas, this.h0, this.m0, u());
        }
    }

    public void B1(int i) {
        A1(tr.a(this.g0, i));
    }

    public void B2(int i) {
        A2(ex3.c(this.g0, i));
    }

    public final void C0(Canvas canvas, Rect rect) {
        Paint paint = this.i0;
        if (paint != null) {
            paint.setColor(sr0.k(-16777216, 127));
            canvas.drawRect(rect, this.i0);
            if (N2() || M2()) {
                k0(rect, this.k0);
                canvas.drawRect(this.k0, this.i0);
            }
            if (this.G != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.i0);
            }
            if (O2()) {
                n0(rect, this.k0);
                canvas.drawRect(this.k0, this.i0);
            }
            this.i0.setColor(sr0.k(-65536, 127));
            m0(rect, this.k0);
            canvas.drawRect(this.k0, this.i0);
            this.i0.setColor(sr0.k(-16711936, 127));
            o0(rect, this.k0);
            canvas.drawRect(this.k0, this.i0);
        }
    }

    public void C1(int i) {
        D1(this.g0.getResources().getBoolean(i));
    }

    public void C2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.n0.k(true);
        invalidateSelf();
        u1();
    }

    public final void D0(Canvas canvas, Rect rect) {
        if (this.G != null) {
            Paint.Align alignS0 = s0(rect, this.l0);
            q0(rect, this.k0);
            if (this.n0.e() != null) {
                this.n0.f().drawableState = getState();
                this.n0.l(this.g0);
            }
            this.n0.f().setTextAlign(alignS0);
            int iSave = 0;
            boolean z = Math.round(this.n0.g(g1().toString())) > Math.round(this.k0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.k0);
            }
            CharSequence charSequenceEllipsize = this.G;
            if (z && this.F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.n0.f(), this.k0.width(), this.F0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.l0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.n0.f());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void D1(boolean z) {
        if (this.T != z) {
            boolean zM2 = M2();
            this.T = z;
            boolean zM22 = M2();
            if (zM2 != zM22) {
                if (zM22) {
                    j0(this.U);
                } else {
                    P2(this.U);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public void D2(pe6 pe6Var) {
        this.n0.j(pe6Var, this.g0);
    }

    public Drawable E0() {
        return this.U;
    }

    public void E1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void E2(int i) {
        D2(new pe6(this.g0, i));
    }

    public ColorStateList F0() {
        return this.V;
    }

    public void F1(int i) {
        E1(tr.a(this.g0, i));
    }

    public void F2(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            u1();
        }
    }

    public ColorStateList G0() {
        return this.A;
    }

    public void G1(float f) {
        if (this.C != f) {
            this.C = f;
            setShapeAppearanceModel(D().w(f));
        }
    }

    public void G2(int i) {
        F2(this.g0.getResources().getDimension(i));
    }

    public float H0() {
        return this.I0 ? F() : this.C;
    }

    public void H1(int i) {
        G1(this.g0.getResources().getDimension(i));
    }

    public void H2(float f) {
        pe6 pe6VarH1 = h1();
        if (pe6VarH1 != null) {
            pe6VarH1.l(f);
            this.n0.f().setTextSize(f);
            a();
        }
    }

    public float I0() {
        return this.f0;
    }

    public void I1(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            invalidateSelf();
            u1();
        }
    }

    public void I2(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            u1();
        }
    }

    public Drawable J0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return tw1.q(drawable);
        }
        return null;
    }

    public void J1(int i) {
        I1(this.g0.getResources().getDimension(i));
    }

    public void J2(int i) {
        I2(this.g0.getResources().getDimension(i));
    }

    public float K0() {
        return this.K;
    }

    public void K1(Drawable drawable) {
        Drawable drawableJ0 = J0();
        if (drawableJ0 != drawable) {
            float fL0 = l0();
            this.I = drawable != null ? tw1.r(drawable).mutate() : null;
            float fL02 = l0();
            P2(drawableJ0);
            if (N2()) {
                j0(this.I);
            }
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    public void K2(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            Q2();
            onStateChange(getState());
        }
    }

    public ColorStateList L0() {
        return this.J;
    }

    public void L1(int i) {
        K1(tr.b(this.g0, i));
    }

    public boolean L2() {
        return this.G0;
    }

    public float M0() {
        return this.B;
    }

    public void M1(float f) {
        if (this.K != f) {
            float fL0 = l0();
            this.K = f;
            float fL02 = l0();
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    public final boolean M2() {
        return this.T && this.U != null && this.u0;
    }

    public float N0() {
        return this.Y;
    }

    public void N1(int i) {
        M1(this.g0.getResources().getDimension(i));
    }

    public final boolean N2() {
        return this.H && this.I != null;
    }

    public ColorStateList O0() {
        return this.D;
    }

    public void O1(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (N2()) {
                tw1.o(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean O2() {
        return this.M && this.N != null;
    }

    public float P0() {
        return this.E;
    }

    public void P1(int i) {
        O1(tr.a(this.g0, i));
    }

    public final void P2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public Drawable Q0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return tw1.q(drawable);
        }
        return null;
    }

    public void Q1(int i) {
        R1(this.g0.getResources().getBoolean(i));
    }

    public final void Q2() {
        this.D0 = this.C0 ? ge5.a(this.F) : null;
    }

    public CharSequence R0() {
        return this.R;
    }

    public void R1(boolean z) {
        if (this.H != z) {
            boolean zN2 = N2();
            this.H = z;
            boolean zN22 = N2();
            if (zN2 != zN22) {
                if (zN22) {
                    j0(this.I);
                } else {
                    P2(this.I);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public final void R2() {
        this.O = new RippleDrawable(ge5.a(e1()), this.N, K0);
    }

    public float S0() {
        return this.e0;
    }

    public void S1(float f) {
        if (this.B != f) {
            this.B = f;
            invalidateSelf();
            u1();
        }
    }

    public float T0() {
        return this.Q;
    }

    public void T1(int i) {
        S1(this.g0.getResources().getDimension(i));
    }

    public float U0() {
        return this.d0;
    }

    public void U1(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            u1();
        }
    }

    public int[] V0() {
        return this.B0;
    }

    public void V1(int i) {
        U1(this.g0.getResources().getDimension(i));
    }

    public ColorStateList W0() {
        return this.P;
    }

    public void W1(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.I0) {
                e0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X0(RectF rectF) {
        o0(getBounds(), rectF);
    }

    public void X1(int i) {
        W1(tr.a(this.g0, i));
    }

    public final float Y0() {
        Drawable drawable = this.u0 ? this.U : this.I;
        float fCeil = this.K;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(zr7.c(this.g0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public void Y1(float f) {
        if (this.E != f) {
            this.E = f;
            this.h0.setStrokeWidth(f);
            if (this.I0) {
                super.f0(f);
            }
            invalidateSelf();
        }
    }

    public final float Z0() {
        Drawable drawable = this.u0 ? this.U : this.I;
        float f = this.K;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void Z1(int i) {
        Y1(this.g0.getResources().getDimension(i));
    }

    @Override // com.zepto.ue6.b
    public void a() {
        u1();
        invalidateSelf();
    }

    public TextUtils.TruncateAt a1() {
        return this.F0;
    }

    public final void a2(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            onStateChange(getState());
        }
    }

    public ex3 b1() {
        return this.X;
    }

    public void b2(Drawable drawable) {
        Drawable drawableQ0 = Q0();
        if (drawableQ0 != drawable) {
            float fP0 = p0();
            this.N = drawable != null ? tw1.r(drawable).mutate() : null;
            if (ge5.a) {
                R2();
            }
            float fP02 = p0();
            P2(drawableQ0);
            if (O2()) {
                j0(this.N);
            }
            invalidateSelf();
            if (fP0 != fP02) {
                u1();
            }
        }
    }

    public float c1() {
        return this.a0;
    }

    public void c2(CharSequence charSequence) {
        if (this.R != charSequence) {
            this.R = o50.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float d1() {
        return this.Z;
    }

    public void d2(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.w0;
        int iA = i < 255 ? gb0.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        z0(canvas, bounds);
        w0(canvas, bounds);
        if (this.I0) {
            super.draw(canvas);
        }
        y0(canvas, bounds);
        B0(canvas, bounds);
        x0(canvas, bounds);
        v0(canvas, bounds);
        if (this.G0) {
            D0(canvas, bounds);
        }
        A0(canvas, bounds);
        C0(canvas, bounds);
        if (this.w0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public ColorStateList e1() {
        return this.F;
    }

    public void e2(int i) {
        d2(this.g0.getResources().getDimension(i));
    }

    public ex3 f1() {
        return this.W;
    }

    public void f2(int i) {
        b2(tr.b(this.g0, i));
    }

    public CharSequence g1() {
        return this.G;
    }

    public void g2(float f) {
        if (this.Q != f) {
            this.Q = f;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + l0() + this.b0 + this.n0.g(g1().toString()) + this.c0 + p0() + this.f0), this.H0);
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public pe6 h1() {
        return this.n0.e();
    }

    public void h2(int i) {
        g2(this.g0.getResources().getDimension(i));
    }

    public float i1() {
        return this.c0;
    }

    public void i2(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return q1(this.z) || q1(this.A) || q1(this.D) || (this.C0 && q1(this.D0)) || s1(this.n0.e()) || t0() || r1(this.I) || r1(this.U) || q1(this.z0);
    }

    public final void j0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        tw1.m(drawable, tw1.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(V0());
            }
            tw1.o(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            tw1.o(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float j1() {
        return this.b0;
    }

    public void j2(int i) {
        i2(this.g0.getResources().getDimension(i));
    }

    public final void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2() || M2()) {
            float f = this.Y + this.Z;
            float fZ0 = Z0();
            if (tw1.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fZ0;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fZ0;
            }
            float fY0 = Y0();
            float fExactCenterY = rect.exactCenterY() - (fY0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fY0;
        }
    }

    public final ColorFilter k1() {
        ColorFilter colorFilter = this.x0;
        return colorFilter != null ? colorFilter : this.y0;
    }

    public boolean k2(int[] iArr) {
        if (Arrays.equals(this.B0, iArr)) {
            return false;
        }
        this.B0 = iArr;
        if (O2()) {
            return v1(getState(), iArr);
        }
        return false;
    }

    public float l0() {
        if (N2() || M2()) {
            return this.Z + Z0() + this.a0;
        }
        return 0.0f;
    }

    public boolean l1() {
        return this.C0;
    }

    public void l2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (O2()) {
                tw1.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void m0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (O2()) {
            float f = this.f0 + this.e0 + this.Q + this.d0 + this.c0;
            if (tw1.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public void m2(int i) {
        l2(tr.a(this.g0, i));
    }

    public final void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f = this.f0 + this.e0;
            if (tw1.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.Q;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.Q;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.Q;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean n1() {
        return this.S;
    }

    public void n2(boolean z) {
        if (this.M != z) {
            boolean zO2 = O2();
            this.M = z;
            boolean zO22 = O2();
            if (zO2 != zO22) {
                if (zO22) {
                    j0(this.N);
                } else {
                    P2(this.N);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public final void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f = this.f0 + this.e0 + this.Q + this.d0 + this.c0;
            if (tw1.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean o1() {
        return r1(this.N);
    }

    public void o2(InterfaceC0036a interfaceC0036a) {
        this.E0 = new WeakReference(interfaceC0036a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (N2()) {
            zOnLayoutDirectionChanged |= tw1.m(this.I, i);
        }
        if (M2()) {
            zOnLayoutDirectionChanged |= tw1.m(this.U, i);
        }
        if (O2()) {
            zOnLayoutDirectionChanged |= tw1.m(this.N, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (N2()) {
            zOnLevelChange |= this.I.setLevel(i);
        }
        if (M2()) {
            zOnLevelChange |= this.U.setLevel(i);
        }
        if (O2()) {
            zOnLevelChange |= this.N.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable, com.zepto.ue6.b
    public boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return v1(iArr, V0());
    }

    public float p0() {
        if (O2()) {
            return this.d0 + this.Q + this.e0;
        }
        return 0.0f;
    }

    public boolean p1() {
        return this.M;
    }

    public void p2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    public final void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.G != null) {
            float fL0 = this.Y + l0() + this.b0;
            float fP0 = this.f0 + p0() + this.c0;
            if (tw1.f(this) == 0) {
                rectF.left = rect.left + fL0;
                rectF.right = rect.right - fP0;
            } else {
                rectF.left = rect.left + fP0;
                rectF.right = rect.right - fL0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void q2(ex3 ex3Var) {
        this.X = ex3Var;
    }

    public final float r0() {
        this.n0.f().getFontMetrics(this.j0);
        Paint.FontMetrics fontMetrics = this.j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void r2(int i) {
        q2(ex3.c(this.g0, i));
    }

    public Paint.Align s0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float fL0 = this.Y + l0() + this.b0;
            if (tw1.f(this) == 0) {
                pointF.x = rect.left + fL0;
            } else {
                pointF.x = rect.right - fL0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - r0();
        }
        return align;
    }

    public void s2(float f) {
        if (this.a0 != f) {
            float fL0 = l0();
            this.a0 = f;
            float fL02 = l0();
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            invalidateSelf();
        }
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.x0 != colorFilter) {
            this.x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.zepto.wq3, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.y0 = yw1.j(this, this.z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (N2()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (M2()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (O2()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final boolean t0() {
        return this.T && this.U != null && this.S;
    }

    public final void t1(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayI = if6.i(this.g0, attributeSet, m15.o0, i, i2, new int[0]);
        this.I0 = typedArrayI.hasValue(m15.Z0);
        a2(vq3.a(this.g0, typedArrayI, m15.M0));
        E1(vq3.a(this.g0, typedArrayI, m15.z0));
        S1(typedArrayI.getDimension(m15.H0, 0.0f));
        int i3 = m15.A0;
        if (typedArrayI.hasValue(i3)) {
            G1(typedArrayI.getDimension(i3, 0.0f));
        }
        W1(vq3.a(this.g0, typedArrayI, m15.K0));
        Y1(typedArrayI.getDimension(m15.L0, 0.0f));
        x2(vq3.a(this.g0, typedArrayI, m15.Y0));
        C2(typedArrayI.getText(m15.t0));
        pe6 pe6VarF = vq3.f(this.g0, typedArrayI, m15.p0);
        pe6VarF.l(typedArrayI.getDimension(m15.q0, pe6VarF.j()));
        D2(pe6VarF);
        int i4 = typedArrayI.getInt(m15.r0, 0);
        if (i4 == 1) {
            p2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            p2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            p2(TextUtils.TruncateAt.END);
        }
        R1(typedArrayI.getBoolean(m15.G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            R1(typedArrayI.getBoolean(m15.D0, false));
        }
        K1(vq3.d(this.g0, typedArrayI, m15.C0));
        int i5 = m15.F0;
        if (typedArrayI.hasValue(i5)) {
            O1(vq3.a(this.g0, typedArrayI, i5));
        }
        M1(typedArrayI.getDimension(m15.E0, -1.0f));
        n2(typedArrayI.getBoolean(m15.T0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            n2(typedArrayI.getBoolean(m15.O0, false));
        }
        b2(vq3.d(this.g0, typedArrayI, m15.N0));
        l2(vq3.a(this.g0, typedArrayI, m15.S0));
        g2(typedArrayI.getDimension(m15.Q0, 0.0f));
        w1(typedArrayI.getBoolean(m15.u0, false));
        D1(typedArrayI.getBoolean(m15.y0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            D1(typedArrayI.getBoolean(m15.w0, false));
        }
        y1(vq3.d(this.g0, typedArrayI, m15.v0));
        int i6 = m15.x0;
        if (typedArrayI.hasValue(i6)) {
            A1(vq3.a(this.g0, typedArrayI, i6));
        }
        A2(ex3.b(this.g0, typedArrayI, m15.a1));
        q2(ex3.b(this.g0, typedArrayI, m15.V0));
        U1(typedArrayI.getDimension(m15.J0, 0.0f));
        u2(typedArrayI.getDimension(m15.X0, 0.0f));
        s2(typedArrayI.getDimension(m15.W0, 0.0f));
        I2(typedArrayI.getDimension(m15.c1, 0.0f));
        F2(typedArrayI.getDimension(m15.b1, 0.0f));
        i2(typedArrayI.getDimension(m15.R0, 0.0f));
        d2(typedArrayI.getDimension(m15.P0, 0.0f));
        I1(typedArrayI.getDimension(m15.B0, 0.0f));
        w2(typedArrayI.getDimensionPixelSize(m15.s0, IntCompanionObject.MAX_VALUE));
        typedArrayI.recycle();
    }

    public void t2(int i) {
        s2(this.g0.getResources().getDimension(i));
    }

    public void u1() {
        InterfaceC0036a interfaceC0036a = (InterfaceC0036a) this.E0.get();
        if (interfaceC0036a != null) {
            interfaceC0036a.a();
        }
    }

    public void u2(float f) {
        if (this.Z != f) {
            float fL0 = l0();
            this.Z = f;
            float fL02 = l0();
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Canvas canvas, Rect rect) {
        if (M2()) {
            k0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.U.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            this.U.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public final boolean v1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.z;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.o0) : 0);
        boolean state = true;
        if (this.o0 != iL) {
            this.o0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.A;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.p0) : 0);
        if (this.p0 != iL2) {
            this.p0 = iL2;
            zOnStateChange = true;
        }
        int i = sq3.i(iL, iL2);
        if ((this.q0 != i) | (x() == null)) {
            this.q0 = i;
            W(ColorStateList.valueOf(i));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.r0) : 0;
        if (this.r0 != colorForState) {
            this.r0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.D0 == null || !ge5.b(iArr)) ? 0 : this.D0.getColorForState(iArr, this.s0);
        if (this.s0 != colorForState2) {
            this.s0 = colorForState2;
            if (this.C0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.n0.e() == null || this.n0.e().i() == null) ? 0 : this.n0.e().i().getColorForState(iArr, this.t0);
        if (this.t0 != colorForState3) {
            this.t0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = m1(getState(), R.attr.state_checked) && this.S;
        if (this.u0 == z2 || this.U == null) {
            z = false;
        } else {
            float fL0 = l0();
            this.u0 = z2;
            if (fL0 != l0()) {
                zOnStateChange = true;
                z = true;
            } else {
                z = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.z0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.v0) : 0;
        if (this.v0 != colorForState4) {
            this.v0 = colorForState4;
            this.y0 = yw1.j(this, this.z0, this.A0);
        } else {
            state = zOnStateChange;
        }
        if (r1(this.I)) {
            state |= this.I.setState(iArr);
        }
        if (r1(this.U)) {
            state |= this.U.setState(iArr);
        }
        if (r1(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.N.setState(iArr3);
        }
        if (ge5.a && r1(this.O)) {
            state |= this.O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            u1();
        }
        return state;
    }

    public void v2(int i) {
        u2(this.g0.getResources().getDimension(i));
    }

    public final void w0(Canvas canvas, Rect rect) {
        if (this.I0) {
            return;
        }
        this.h0.setColor(this.p0);
        this.h0.setStyle(Paint.Style.FILL);
        this.h0.setColorFilter(k1());
        this.k0.set(rect);
        canvas.drawRoundRect(this.k0, H0(), H0(), this.h0);
    }

    public void w1(boolean z) {
        if (this.S != z) {
            this.S = z;
            float fL0 = l0();
            if (!z && this.u0) {
                this.u0 = false;
            }
            float fL02 = l0();
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    public void w2(int i) {
        this.H0 = i;
    }

    public final void x0(Canvas canvas, Rect rect) {
        if (N2()) {
            k0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.I.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            this.I.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void x1(int i) {
        w1(this.g0.getResources().getBoolean(i));
    }

    public void x2(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            Q2();
            onStateChange(getState());
        }
    }

    public final void y0(Canvas canvas, Rect rect) {
        if (this.E <= 0.0f || this.I0) {
            return;
        }
        this.h0.setColor(this.r0);
        this.h0.setStyle(Paint.Style.STROKE);
        if (!this.I0) {
            this.h0.setColorFilter(k1());
        }
        RectF rectF = this.k0;
        float f = rect.left;
        float f2 = this.E;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.C - (this.E / 2.0f);
        canvas.drawRoundRect(this.k0, f3, f3, this.h0);
    }

    public void y1(Drawable drawable) {
        if (this.U != drawable) {
            float fL0 = l0();
            this.U = drawable;
            float fL02 = l0();
            P2(this.U);
            j0(this.U);
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    public void y2(int i) {
        x2(tr.a(this.g0, i));
    }

    public final void z0(Canvas canvas, Rect rect) {
        if (this.I0) {
            return;
        }
        this.h0.setColor(this.o0);
        this.h0.setStyle(Paint.Style.FILL);
        this.k0.set(rect);
        canvas.drawRoundRect(this.k0, H0(), H0(), this.h0);
    }

    public void z1(int i) {
        y1(tr.b(this.g0, i));
    }

    public void z2(boolean z) {
        this.G0 = z;
    }
}
