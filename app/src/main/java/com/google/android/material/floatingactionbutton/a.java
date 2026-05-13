package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.zepto.c06;
import com.zepto.dq7;
import com.zepto.e06;
import com.zepto.ex3;
import com.zepto.g70;
import com.zepto.ge5;
import com.zepto.gx3;
import com.zepto.h06;
import com.zepto.hr3;
import com.zepto.l05;
import com.zepto.lu4;
import com.zepto.nx2;
import com.zepto.rp;
import com.zepto.tp;
import com.zepto.tw1;
import com.zepto.wq3;
import com.zepto.xq3;
import com.zepto.xy4;
import com.zepto.z66;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final TimeInterpolator D = rp.c;
    public static final int E = xy4.B;
    public static final int F = xy4.L;
    public static final int G = xy4.C;
    public static final int H = xy4.J;
    public static final int[] I = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] L = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] M = {R.attr.state_enabled};
    public static final int[] N = new int[0];
    public ViewTreeObserver.OnPreDrawListener C;
    public e06 a;
    public wq3 b;
    public Drawable c;
    public g70 d;
    public Drawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public final z66 l;
    public Animator m;
    public ex3 n;
    public ex3 o;
    public float p;
    public int r;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;
    public final FloatingActionButton w;
    public final c06 x;
    public boolean g = true;
    public float q = 1.0f;
    public int s = 0;
    public final Rect y = new Rect();
    public final RectF z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    public class C0039a extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ j c;

        public C0039a(boolean z, j jVar) {
            this.b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.s = 0;
            a.this.m = null;
            if (this.a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.w;
            boolean z = this.b;
            floatingActionButton.b(z ? 8 : 4, z);
            j jVar = this.c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.w.b(0, this.b);
            a.this.s = 1;
            a.this.m = animator;
            this.a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ j b;

        public b(boolean z, j jVar) {
            this.a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.s = 0;
            a.this.m = null;
            j jVar = this.b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.w.b(0, this.a);
            a.this.s = 2;
            a.this.m = animator;
        }
    }

    public class c extends hr3 {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            a.this.q = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ Matrix h;

        public d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.g = f7;
            this.h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.w.setAlpha(rp.b(this.a, this.b, 0.0f, 0.2f, fFloatValue));
            a.this.w.setScaleX(rp.a(this.c, this.d, fFloatValue));
            a.this.w.setScaleY(rp.a(this.e, this.d, fFloatValue));
            a.this.q = rp.a(this.f, this.g, fFloatValue);
            a.this.e(rp.a(this.f, this.g, fFloatValue), this.h);
            a.this.w.setImageMatrix(this.h);
        }
    }

    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.E();
            return true;
        }
    }

    public class f extends l {
        public f() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            return 0.0f;
        }
    }

    public class g extends l {
        public g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            a aVar = a.this;
            return aVar.h + aVar.i;
        }
    }

    public class h extends l {
        public h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            a aVar = a.this;
            return aVar.h + aVar.j;
        }
    }

    public interface i {
        void a();

        void b();
    }

    public interface j {
        void a();

        void b();
    }

    public class k extends l {
        public k() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            return a.this.h;
        }
    }

    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;
        public float c;

        public l() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.d0((int) this.c);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                wq3 wq3Var = a.this.b;
                this.b = wq3Var == null ? 0.0f : wq3Var.w();
                this.c = a();
                this.a = true;
            }
            a aVar = a.this;
            float f = this.b;
            aVar.d0((int) (f + ((this.c - f) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ l(a aVar, C0039a c0039a) {
            this();
        }
    }

    public a(FloatingActionButton floatingActionButton, c06 c06Var) {
        this.w = floatingActionButton;
        this.x = c06Var;
        z66 z66Var = new z66();
        this.l = z66Var;
        z66Var.a(I, h(new h()));
        z66Var.a(J, h(new g()));
        z66Var.a(K, h(new g()));
        z66Var.a(L, h(new g()));
        z66Var.a(M, h(new k()));
        z66Var.a(N, h(new f()));
        this.p = floatingActionButton.getRotation();
    }

    public void A() {
        ViewTreeObserver viewTreeObserver = this.w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    public abstract void B(int[] iArr);

    public abstract void C(float f2, float f3, float f4);

    public void D(Rect rect) {
        lu4.h(this.e, "Didn't initialize content background");
        if (!W()) {
            this.x.b(this.e);
        } else {
            this.x.b(new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void E() {
        float rotation = this.w.getRotation();
        if (this.p != rotation) {
            this.p = rotation;
            a0();
        }
    }

    public void F() {
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).b();
            }
        }
    }

    public void G() {
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a();
            }
        }
    }

    public abstract boolean H();

    public void I(ColorStateList colorStateList) {
        wq3 wq3Var = this.b;
        if (wq3Var != null) {
            wq3Var.setTintList(colorStateList);
        }
        g70 g70Var = this.d;
        if (g70Var != null) {
            g70Var.c(colorStateList);
        }
    }

    public void J(PorterDuff.Mode mode) {
        wq3 wq3Var = this.b;
        if (wq3Var != null) {
            wq3Var.setTintMode(mode);
        }
    }

    public final void K(float f2) {
        if (this.h != f2) {
            this.h = f2;
            C(f2, this.i, this.j);
        }
    }

    public void L(boolean z) {
        this.f = z;
    }

    public final void M(ex3 ex3Var) {
        this.o = ex3Var;
    }

    public final void N(float f2) {
        if (this.i != f2) {
            this.i = f2;
            C(this.h, f2, this.j);
        }
    }

    public final void O(float f2) {
        this.q = f2;
        Matrix matrix = this.B;
        e(f2, matrix);
        this.w.setImageMatrix(matrix);
    }

    public final void P(int i2) {
        if (this.r != i2) {
            this.r = i2;
            b0();
        }
    }

    public void Q(int i2) {
        this.k = i2;
    }

    public final void R(float f2) {
        if (this.j != f2) {
            this.j = f2;
            C(this.h, this.i, f2);
        }
    }

    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            tw1.o(drawable, ge5.a(colorStateList));
        }
    }

    public void T(boolean z) {
        this.g = z;
        c0();
    }

    public final void U(e06 e06Var) {
        this.a = e06Var;
        wq3 wq3Var = this.b;
        if (wq3Var != null) {
            wq3Var.setShapeAppearanceModel(e06Var);
        }
        Object obj = this.c;
        if (obj instanceof h06) {
            ((h06) obj).setShapeAppearanceModel(e06Var);
        }
        g70 g70Var = this.d;
        if (g70Var != null) {
            g70Var.f(e06Var);
        }
    }

    public final void V(ex3 ex3Var) {
        this.n = ex3Var;
    }

    public abstract boolean W();

    public final boolean X() {
        return dq7.U(this.w) && !this.w.isInEditMode();
    }

    public final boolean Y() {
        return !this.f || this.w.getSizeDimension() >= this.k;
    }

    public void Z(j jVar, boolean z) {
        if (w()) {
            return;
        }
        Animator animator = this.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.n == null;
        if (!X()) {
            this.w.b(0, z);
            this.w.setAlpha(1.0f);
            this.w.setScaleY(1.0f);
            this.w.setScaleX(1.0f);
            O(1.0f);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        if (this.w.getVisibility() != 0) {
            this.w.setAlpha(0.0f);
            this.w.setScaleY(z2 ? 0.4f : 0.0f);
            this.w.setScaleX(z2 ? 0.4f : 0.0f);
            O(z2 ? 0.4f : 0.0f);
        }
        ex3 ex3Var = this.n;
        AnimatorSet animatorSetF = ex3Var != null ? f(ex3Var, 1.0f, 1.0f, 1.0f) : g(1.0f, 1.0f, 1.0f, E, F);
        animatorSetF.addListener(new b(z, jVar));
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetF.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetF.start();
    }

    public abstract void a0();

    public final void b0() {
        O(this.q);
    }

    public final void c0() {
        Rect rect = this.y;
        o(rect);
        D(rect);
        this.x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f2) {
        wq3 wq3Var = this.b;
        if (wq3Var != null) {
            wq3Var.V(f2);
        }
    }

    public final void e(float f2, Matrix matrix) {
        matrix.reset();
        if (this.w.getDrawable() == null || this.r == 0) {
            return;
        }
        RectF rectF = this.z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.r;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.r;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    public final void e0(ObjectAnimator objectAnimator) {
    }

    public final AnimatorSet f(ex3 ex3Var, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        ex3Var.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        ex3Var.e("scale").a(objectAnimatorOfFloat2);
        e0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        ex3Var.e("scale").a(objectAnimatorOfFloat3);
        e0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        e(f4, this.B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.w, new nx2(), new c(), new Matrix(this.B));
        ex3Var.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        tp.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet g(float f2, float f3, float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.w.getAlpha(), f2, this.w.getScaleX(), f3, this.w.getScaleY(), this.q, f4, new Matrix(this.B)));
        arrayList.add(valueAnimatorOfFloat);
        tp.a(animatorSet, arrayList);
        animatorSet.setDuration(gx3.f(this.w.getContext(), i2, this.w.getContext().getResources().getInteger(l05.b)));
        animatorSet.setInterpolator(gx3.g(this.w.getContext(), i3, rp.b));
        return animatorSet;
    }

    public final ValueAnimator h(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final Drawable i() {
        return this.e;
    }

    public abstract float j();

    public boolean k() {
        return this.f;
    }

    public final ex3 l() {
        return this.o;
    }

    public float m() {
        return this.i;
    }

    public final ViewTreeObserver.OnPreDrawListener n() {
        if (this.C == null) {
            this.C = new e();
        }
        return this.C;
    }

    public void o(Rect rect) {
        int iS = s();
        int iMax = Math.max(iS, (int) Math.ceil(this.g ? j() + this.j : 0.0f));
        int iMax2 = Math.max(iS, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float p() {
        return this.j;
    }

    public final e06 q() {
        return this.a;
    }

    public final ex3 r() {
        return this.n;
    }

    public int s() {
        if (this.f) {
            return Math.max((this.k - this.w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public void t(j jVar, boolean z) {
        if (v()) {
            return;
        }
        Animator animator = this.m;
        if (animator != null) {
            animator.cancel();
        }
        if (!X()) {
            this.w.b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        ex3 ex3Var = this.o;
        AnimatorSet animatorSetF = ex3Var != null ? f(ex3Var, 0.0f, 0.0f, 0.0f) : g(0.0f, 0.4f, 0.4f, G, H);
        animatorSetF.addListener(new C0039a(z, jVar));
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetF.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetF.start();
    }

    public abstract void u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2);

    public boolean v() {
        return this.w.getVisibility() == 0 ? this.s == 1 : this.s != 2;
    }

    public boolean w() {
        return this.w.getVisibility() != 0 ? this.s == 2 : this.s != 1;
    }

    public abstract void x();

    public void y() {
        wq3 wq3Var = this.b;
        if (wq3Var != null) {
            xq3.f(this.w, wq3Var);
        }
        if (H()) {
            this.w.getViewTreeObserver().addOnPreDrawListener(n());
        }
    }

    public abstract void z();
}
