package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.zepto.z2;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class nx1 extends l22 {
    public static final boolean s = true;
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final View.OnClickListener i;
    public final View.OnFocusChangeListener j;
    public final z2.b k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            nx1.this.r();
            nx1.this.r.start();
        }
    }

    public nx1(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.i = new View.OnClickListener() { // from class: com.zepto.gx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.J(view);
            }
        };
        this.j = new View.OnFocusChangeListener() { // from class: com.zepto.hx1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.a.K(view, z);
            }
        };
        this.k = new z2.b() { // from class: com.zepto.ix1
            @Override // com.zepto.z2.b
            public final void onTouchExplorationStateChanged(boolean z) {
                this.a.L(z);
            }
        };
        this.o = LongCompanionObject.MAX_VALUE;
        Context context = aVar.getContext();
        int i = xy4.H;
        this.f = gx3.f(context, i, 67);
        this.e = gx3.f(aVar.getContext(), i, 50);
        this.g = gx3.g(aVar.getContext(), xy4.M, rp.a);
    }

    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.r = E(this.f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.e, 1.0f, 0.0f);
        this.q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z) {
        this.l = z;
        r();
        if (z) {
            return;
        }
        O(false);
        this.m = false;
    }

    public final ValueAnimator E(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.g);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zepto.jx1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.I(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final /* synthetic */ void H() {
        boolean zIsPopupShowing = this.h.isPopupShowing();
        O(zIsPopupShowing);
        this.m = zIsPopupShowing;
    }

    public final /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final /* synthetic */ void L(boolean z) {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView == null || b02.a(autoCompleteTextView)) {
            return;
        }
        dq7.B0(this.d, z ? 2 : 1);
    }

    public final /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.m = false;
            }
            Q();
            R();
        }
        return false;
    }

    public final /* synthetic */ void N() {
        R();
        O(false);
    }

    public final void O(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void P() {
        this.h.setOnTouchListener(new View.OnTouchListener() { // from class: com.zepto.lx1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.a.M(view, motionEvent);
            }
        });
        if (s) {
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.zepto.mx1
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.a.N();
                }
            });
        }
        this.h.setThreshold(0);
    }

    public final void Q() {
        if (this.h == null) {
            return;
        }
        if (G()) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        if (s) {
            O(!this.n);
        } else {
            this.n = !this.n;
            r();
        }
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }

    public final void R() {
        this.m = true;
        this.o = System.currentTimeMillis();
    }

    @Override // com.zepto.l22
    public void a(Editable editable) {
        if (this.p.isTouchExplorationEnabled() && b02.a(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Runnable() { // from class: com.zepto.kx1
            @Override // java.lang.Runnable
            public final void run() {
                this.c.H();
            }
        });
    }

    @Override // com.zepto.l22
    public int c() {
        return b15.g;
    }

    @Override // com.zepto.l22
    public int d() {
        return s ? qz4.g : qz4.h;
    }

    @Override // com.zepto.l22
    public View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.zepto.l22
    public View.OnClickListener f() {
        return this.i;
    }

    @Override // com.zepto.l22
    public z2.b h() {
        return this.k;
    }

    @Override // com.zepto.l22
    public boolean i(int i) {
        return i != 0;
    }

    @Override // com.zepto.l22
    public boolean j() {
        return true;
    }

    @Override // com.zepto.l22
    public boolean k() {
        return this.l;
    }

    @Override // com.zepto.l22
    public boolean l() {
        return true;
    }

    @Override // com.zepto.l22
    public boolean m() {
        return this.n;
    }

    @Override // com.zepto.l22
    public void n(EditText editText) {
        this.h = D(editText);
        P();
        this.a.setErrorIconDrawable((Drawable) null);
        if (!b02.a(editText) && this.p.isTouchExplorationEnabled()) {
            dq7.B0(this.d, 2);
        }
        this.a.setEndIconVisible(true);
    }

    @Override // com.zepto.l22
    public void o(View view, r3 r3Var) {
        if (!b02.a(this.h)) {
            r3Var.U(Spinner.class.getName());
        }
        if (r3Var.G()) {
            r3Var.f0(null);
        }
    }

    @Override // com.zepto.l22
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || b02.a(this.h)) {
            return;
        }
        boolean z = accessibilityEvent.getEventType() == 32768 && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            Q();
            R();
        }
    }

    @Override // com.zepto.l22
    public void s() {
        F();
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // com.zepto.l22
    public boolean t() {
        return true;
    }

    @Override // com.zepto.l22
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (s) {
                this.h.setOnDismissListener(null);
            }
        }
    }
}
