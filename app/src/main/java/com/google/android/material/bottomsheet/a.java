package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zepto.cg4;
import com.zepto.dq7;
import com.zepto.g15;
import com.zepto.hr;
import com.zepto.jq3;
import com.zepto.lz1;
import com.zepto.p05;
import com.zepto.qv7;
import com.zepto.r3;
import com.zepto.sq3;
import com.zepto.wq3;
import com.zepto.x2;
import com.zepto.xy4;
import com.zepto.zr7;
import com.zepto.zu7;
import com.zepto.zz4;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends hr {
    public BottomSheetBehavior f;
    public FrameLayout g;
    public CoordinatorLayout h;
    public FrameLayout i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public f n;
    public boolean o;
    public jq3 p;
    public BottomSheetBehavior.g q;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    public class C0034a implements cg4 {
        public C0034a() {
        }

        @Override // com.zepto.cg4
        public qv7 a(View view, qv7 qv7Var) {
            if (a.this.n != null) {
                a.this.f.F0(a.this.n);
            }
            if (qv7Var != null) {
                a aVar = a.this;
                aVar.n = new f(aVar.i, qv7Var, null);
                a.this.n.e(a.this.getWindow());
                a.this.f.c0(a.this.n);
            }
            return qv7Var;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.k && aVar.isShowing() && a.this.r()) {
                a.this.cancel();
            }
        }
    }

    public class c extends x2 {
        public c() {
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            if (!a.this.k) {
                r3Var.Z(false);
            } else {
                r3Var.a(1048576);
                r3Var.Z(true);
            }
        }

        @Override // com.zepto.x2
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                a aVar = a.this;
                if (aVar.k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i, bundle);
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class e extends BottomSheetBehavior.g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            if (i == 5) {
                a.this.cancel();
            }
        }
    }

    public static class f extends BottomSheetBehavior.g {
        public final Boolean a;
        public final qv7 b;
        public Window c;
        public boolean d;

        public /* synthetic */ f(View view, qv7 qv7Var, C0034a c0034a) {
            this(view, qv7Var);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            d(view);
        }

        public final void d(View view) {
            if (view.getTop() < this.b.l()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.a;
                    lz1.f(window, bool == null ? this.d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.b.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    lz1.f(window2, this.d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public void e(Window window) {
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                this.d = zu7.a(window, window.getDecorView()).a();
            }
        }

        public f(View view, qv7 qv7Var) {
            this.b = qv7Var;
            wq3 wq3VarT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListX = wq3VarT0 != null ? wq3VarT0.x() : dq7.s(view);
            if (colorStateListX != null) {
                this.a = Boolean.valueOf(sq3.h(colorStateListX.getDefaultColor()));
                return;
            }
            Integer numD = zr7.d(view);
            if (numD != null) {
                this.a = Boolean.valueOf(sq3.h(numD.intValue()));
            } else {
                this.a = null;
            }
        }
    }

    public a(Context context) {
        this(context, 0);
        this.o = getContext().getTheme().obtainStyledAttributes(new int[]{xy4.r}).getBoolean(0, false);
    }

    public static int f(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(xy4.c, typedValue, true) ? typedValue.resourceId : g15.c;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior bottomSheetBehaviorQ = q();
        if (!this.j || bottomSheetBehaviorQ.v0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorQ.X0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            zu7.b(window, !z);
            f fVar = this.n;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        t();
    }

    @Override // com.zepto.hr, com.zepto.fu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(IntCompanionObject.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.n;
        if (fVar != null) {
            fVar.e(null);
        }
        jq3 jq3Var = this.p;
        if (jq3Var != null) {
            jq3Var.f();
        }
    }

    @Override // com.zepto.fu0, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.v0() != 5) {
            return;
        }
        this.f.X0(4);
    }

    public final FrameLayout p() {
        if (this.g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), p05.a, null);
            this.g = frameLayout;
            this.h = (CoordinatorLayout) frameLayout.findViewById(zz4.e);
            FrameLayout frameLayout2 = (FrameLayout) this.g.findViewById(zz4.f);
            this.i = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.q);
            this.f.P0(this.k);
            this.p = new jq3(this.f, this.i);
        }
        return this.g;
    }

    public BottomSheetBehavior q() {
        if (this.f == null) {
            p();
        }
        return this.f;
    }

    public boolean r() {
        if (!this.m) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.l = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.m = true;
        }
        return this.l;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.P0(z);
            }
            if (getWindow() != null) {
                t();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override // com.zepto.hr, com.zepto.fu0, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(u(i, null, null));
    }

    public final void t() {
        jq3 jq3Var = this.p;
        if (jq3Var == null) {
            return;
        }
        if (this.k) {
            jq3Var.c();
        } else {
            jq3Var.f();
        }
    }

    public final View u(int i, View view, ViewGroup.LayoutParams layoutParams) {
        p();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g.findViewById(zz4.e);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.o) {
            dq7.E0(this.i, new C0034a());
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view);
        } else {
            this.i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(zz4.U).setOnClickListener(new b());
        dq7.q0(this.i, new c());
        this.i.setOnTouchListener(new d());
        return this.g;
    }

    @Override // com.zepto.hr, com.zepto.fu0, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(u(0, view, null));
    }

    @Override // com.zepto.hr, com.zepto.fu0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(u(0, view, layoutParams));
    }

    public a(Context context, int i) {
        super(context, f(context, i));
        this.k = true;
        this.l = true;
        this.q = new e();
        h(1);
        this.o = getContext().getTheme().obtainStyledAttributes(new int[]{xy4.r}).getBoolean(0, false);
    }
}
