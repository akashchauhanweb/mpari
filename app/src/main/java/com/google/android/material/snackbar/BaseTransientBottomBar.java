package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.a;
import com.zepto.br3;
import com.zepto.cg4;
import com.zepto.dq7;
import com.zepto.e06;
import com.zepto.gx3;
import com.zepto.if6;
import com.zepto.jz4;
import com.zepto.m15;
import com.zepto.p05;
import com.zepto.qv7;
import com.zepto.r3;
import com.zepto.rp;
import com.zepto.sq3;
import com.zepto.tw1;
import com.zepto.vq3;
import com.zepto.vy0;
import com.zepto.wb0;
import com.zepto.wq3;
import com.zepto.ww7;
import com.zepto.x2;
import com.zepto.xy4;
import com.zepto.zr7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final r i;
    public final vy0 j;
    public int k;
    public boolean l;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public List v;
    public Behavior w;
    public final AccessibilityManager x;
    public static final TimeInterpolator z = rp.b;
    public static final TimeInterpolator A = rp.a;
    public static final TimeInterpolator B = rp.d;
    public static final boolean D = false;
    public static final int[] E = {xy4.T};
    public static final String F = BaseTransientBottomBar.class.getSimpleName();
    public static final Handler C = new Handler(Looper.getMainLooper(), new h());
    public boolean m = false;
    public final Runnable n = new i();
    public a.b y = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final q l = new q(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.l.a(view);
        }

        public final void U(BaseTransientBottomBar baseTransientBottomBar) {
            this.l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.a);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.i.setScaleY(fFloatValue);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.j.a(BaseTransientBottomBar.this.c - BaseTransientBottomBar.this.a, BaseTransientBottomBar.this.a);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public int a;
        public final /* synthetic */ int b;

        public e(int i) {
            this.b = i;
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.D) {
                dq7.b0(BaseTransientBottomBar.this.i, iIntValue - this.a);
            } else {
                BaseTransientBottomBar.this.i.setTranslationY(iIntValue);
            }
            this.a = iIntValue;
        }
    }

    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        public f(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.j.b(0, BaseTransientBottomBar.this.b);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {
        public int a = 0;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.D) {
                dq7.b0(BaseTransientBottomBar.this.i, iIntValue - this.a);
            } else {
                BaseTransientBottomBar.this.i.setTranslationY(iIntValue);
            }
            this.a = iIntValue;
        }
    }

    public class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).X();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).J(message.arg1);
            return true;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.i == null || baseTransientBottomBar.h == null) {
                return;
            }
            int iHeight = (ww7.a(BaseTransientBottomBar.this.h).height() - BaseTransientBottomBar.this.H()) + ((int) BaseTransientBottomBar.this.i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.t = baseTransientBottomBar2.s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.F, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.t = baseTransientBottomBar3.s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.s - iHeight;
            BaseTransientBottomBar.this.i.requestLayout();
        }
    }

    public class j implements cg4 {
        public j() {
        }

        @Override // com.zepto.cg4
        public qv7 a(View view, qv7 qv7Var) {
            BaseTransientBottomBar.this.o = qv7Var.i();
            BaseTransientBottomBar.this.p = qv7Var.j();
            BaseTransientBottomBar.this.q = qv7Var.k();
            BaseTransientBottomBar.this.d0();
            return qv7Var;
        }
    }

    public class k extends x2 {
        public k() {
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.a(1048576);
            r3Var.Z(true);
        }

        @Override // com.zepto.x2
        public boolean j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.j(view, i, bundle);
            }
            BaseTransientBottomBar.this.x();
            return true;
        }
    }

    public class l implements a.b {
        public l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a() {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void b(int i) {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.P(3);
        }
    }

    public class n implements SwipeDismissBehavior.c {
        public n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.y(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i) {
            if (i == 0) {
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.y);
            } else if (i == 1 || i == 2) {
                com.google.android.material.snackbar.a.c().j(BaseTransientBottomBar.this.y);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar = BaseTransientBottomBar.this.i;
            if (rVar == null) {
                return;
            }
            if (rVar.getParent() != null) {
                BaseTransientBottomBar.this.i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.Z();
            } else {
                BaseTransientBottomBar.this.b0();
            }
        }
    }

    public class p extends AnimatorListenerAdapter {
        public p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }
    }

    public static class q {
        public a.b a;

        public q(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof r;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.c().j(this.a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.c().k(this.a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.a = baseTransientBottomBar.y;
        }
    }

    public static class r extends FrameLayout {
        public static final View.OnTouchListener l = new a();
        public BaseTransientBottomBar a;
        public e06 b;
        public int c;
        public final float d;
        public final float e;
        public final int f;
        public final int g;
        public ColorStateList h;
        public PorterDuff.Mode i;
        public Rect j;
        public boolean k;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public r(Context context, AttributeSet attributeSet) {
            super(br3.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, m15.W5);
            if (typedArrayObtainStyledAttributes.hasValue(m15.d6)) {
                dq7.y0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.c = typedArrayObtainStyledAttributes.getInt(m15.Z5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(m15.f6) || typedArrayObtainStyledAttributes.hasValue(m15.g6)) {
                this.b = e06.e(context2, attributeSet, 0, 0).m();
            }
            this.d = typedArrayObtainStyledAttributes.getFloat(m15.a6, 1.0f);
            setBackgroundTintList(vq3.a(context2, typedArrayObtainStyledAttributes, m15.b6));
            setBackgroundTintMode(zr7.i(typedArrayObtainStyledAttributes.getInt(m15.c6, -1), PorterDuff.Mode.SRC_IN));
            this.e = typedArrayObtainStyledAttributes.getFloat(m15.Y5, 1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(m15.X5, -1);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(m15.e6, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(l);
            setFocusable(true);
            if (getBackground() == null) {
                dq7.u0(this, d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.a = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.k = true;
            viewGroup.addView(this);
            this.k = false;
        }

        public final Drawable d() {
            int iK = sq3.k(this, xy4.m, xy4.j, getBackgroundOverlayColorAlpha());
            e06 e06Var = this.b;
            Drawable drawableW = e06Var != null ? BaseTransientBottomBar.w(iK, e06Var) : BaseTransientBottomBar.v(iK, getResources());
            if (this.h == null) {
                return tw1.r(drawableW);
            }
            Drawable drawableR = tw1.r(drawableW);
            tw1.o(drawableR, this.h);
            return drawableR;
        }

        public final void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.e;
        }

        public int getAnimationMode() {
            return this.c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.d;
        }

        public int getMaxInlineActionWidth() {
            return this.g;
        }

        public int getMaxWidth() {
            return this.f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.M();
            }
            dq7.n0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.N();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.c = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.h != null) {
                drawable = tw1.r(drawable.mutate());
                tw1.o(drawable, this.h);
                tw1.p(drawable, this.i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = tw1.r(getBackground().mutate());
                tw1.o(drawableR, colorStateList);
                tw1.p(drawableR, this.i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.i = mode;
            if (getBackground() != null) {
                Drawable drawableR = tw1.r(getBackground().mutate());
                tw1.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.d0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : l);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, vy0 vy0Var) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (vy0Var == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = vy0Var;
        this.h = context;
        if6.a(context);
        r rVar = (r) LayoutInflater.from(context).inflate(E(), viewGroup, false);
        this.i = rVar;
        rVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(rVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(rVar.getMaxInlineActionWidth());
        }
        rVar.addView(view);
        dq7.s0(rVar, 1);
        dq7.B0(rVar, 1);
        dq7.z0(rVar, true);
        dq7.E0(rVar, new j());
        dq7.q0(rVar, new k());
        this.x = (AccessibilityManager) context.getSystemService("accessibility");
        int i2 = xy4.B;
        this.c = gx3.f(context, i2, 250);
        this.a = gx3.f(context, i2, 150);
        this.b = gx3.f(context, xy4.C, 75);
        int i3 = xy4.L;
        this.d = gx3.g(context, i3, A);
        this.f = gx3.g(context, i3, B);
        this.e = gx3.g(context, i3, z);
    }

    public static GradientDrawable v(int i2, Resources resources) {
        float dimension = resources.getDimension(jz4.Z);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    public static wq3 w(int i2, e06 e06Var) {
        wq3 wq3Var = new wq3(e06Var);
        wq3Var.W(ColorStateList.valueOf(i2));
        return wq3Var;
    }

    public View A() {
        return null;
    }

    public int B() {
        return this.k;
    }

    public SwipeDismissBehavior C() {
        return new Behavior();
    }

    public final ValueAnimator D(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    public int E() {
        return I() ? p05.y : p05.b;
    }

    public final int F() {
        int height = this.i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public View G() {
        return this.i;
    }

    public final int H() {
        int[] iArr = new int[2];
        this.i.getLocationInWindow(iArr);
        return iArr[1] + this.i.getHeight();
    }

    public boolean I() {
        TypedArray typedArrayObtainStyledAttributes = this.h.obtainStyledAttributes(E);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void J(int i2) {
        if (U() && this.i.getVisibility() == 0) {
            t(i2);
        } else {
            P(i2);
        }
    }

    public boolean K() {
        return com.google.android.material.snackbar.a.c().e(this.y);
    }

    public final boolean L() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void M() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        this.s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        d0();
    }

    public void N() {
        if (K()) {
            C.post(new m());
        }
    }

    public void O() {
        if (this.u) {
            Y();
            this.u = false;
        }
    }

    public void P(int i2) {
        int size;
        com.google.android.material.snackbar.a.c().h(this.y);
        if (this.v != null && r2.size() - 1 >= 0) {
            wb0.a(this.v.get(size));
            throw null;
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public void Q() {
        int size;
        com.google.android.material.snackbar.a.c().i(this.y);
        if (this.v == null || r0.size() - 1 < 0) {
            return;
        }
        wb0.a(this.v.get(size));
        throw null;
    }

    public final void R() {
        this.r = u();
        d0();
    }

    public BaseTransientBottomBar S(int i2) {
        this.k = i2;
        return this;
    }

    public final void T(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehaviorC = this.w;
        if (swipeDismissBehaviorC == null) {
            swipeDismissBehaviorC = C();
        }
        if (swipeDismissBehaviorC instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorC).U(this);
        }
        swipeDismissBehaviorC.P(new n());
        fVar.o(swipeDismissBehaviorC);
        if (A() == null) {
            fVar.g = 80;
        }
    }

    public boolean U() {
        AccessibilityManager accessibilityManager = this.x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean V() {
        return this.s > 0 && !this.l && L();
    }

    public void W() {
        com.google.android.material.snackbar.a.c().m(B(), this.y);
    }

    public final void X() {
        if (this.i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                T((CoordinatorLayout.f) layoutParams);
            }
            this.i.c(this.g);
            R();
            this.i.setVisibility(4);
        }
        if (dq7.U(this.i)) {
            Y();
        } else {
            this.u = true;
        }
    }

    public final void Y() {
        if (U()) {
            s();
            return;
        }
        if (this.i.getParent() != null) {
            this.i.setVisibility(0);
        }
        Q();
    }

    public final void Z() {
        ValueAnimator valueAnimatorZ = z(0.0f, 1.0f);
        ValueAnimator valueAnimatorD = D(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorZ, valueAnimatorD);
        animatorSet.setDuration(this.a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    public final void a0(int i2) {
        ValueAnimator valueAnimatorZ = z(1.0f, 0.0f);
        valueAnimatorZ.setDuration(this.b);
        valueAnimatorZ.addListener(new a(i2));
        valueAnimatorZ.start();
    }

    public final void b0() {
        int iF = F();
        if (D) {
            dq7.b0(this.i, iF);
        } else {
            this.i.setTranslationY(iF);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iF, 0);
        valueAnimator.setInterpolator(this.e);
        valueAnimator.setDuration(this.c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(iF));
        valueAnimator.start();
    }

    public final void c0(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, F());
        valueAnimator.setInterpolator(this.e);
        valueAnimator.setDuration(this.c);
        valueAnimator.addListener(new f(i2));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public final void d0() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(F, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.i.j == null) {
            Log.w(F, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = this.i.j.bottom + (A() != null ? this.r : this.o);
        int i3 = this.i.j.left + this.p;
        int i4 = this.i.j.right + this.q;
        int i5 = this.i.j.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            this.i.requestLayout();
        }
        if ((z2 || this.t != this.s) && Build.VERSION.SDK_INT >= 29 && V()) {
            this.i.removeCallbacks(this.n);
            this.i.post(this.n);
        }
    }

    public void s() {
        this.i.post(new o());
    }

    public final void t(int i2) {
        if (this.i.getAnimationMode() == 1) {
            a0(i2);
        } else {
            c0(i2);
        }
    }

    public final int u() {
        if (A() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        A().getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.g.getHeight()) - i2;
    }

    public void x() {
        y(3);
    }

    public void y(int i2) {
        com.google.android.material.snackbar.a.c().b(this.y, i2);
    }

    public final ValueAnimator z(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }
}
