package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.zepto.a45;
import com.zepto.dq7;
import com.zepto.dz4;
import com.zepto.g15;
import com.zepto.jz4;
import com.zepto.m15;
import com.zepto.p05;
import com.zepto.r3;
import com.zepto.tr;
import com.zepto.vq3;
import com.zepto.x2;
import com.zepto.xy4;
import com.zepto.zz4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends a45 implements ClockHandView.b {
    public final ClockHandView B;
    public final Rect C;
    public final RectF D;
    public final Rect E;
    public final SparseArray F;
    public final x2 G;
    public final int[] H;
    public final float[] I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public String[] N;
    public float O;
    public final ColorStateList P;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.B.i()) - ClockFaceView.this.J);
            return true;
        }
    }

    public class b extends x2 {
        public b() {
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            int iIntValue = ((Integer) view.getTag(zz4.r)).intValue();
            if (iIntValue > 0) {
                r3Var.u0((View) ClockFaceView.this.F.get(iIntValue - 1));
            }
            r3Var.X(r3.d.a(0, 1, iIntValue, 1, false, view.isSelected()));
            r3Var.V(true);
            r3Var.b(r3.a.i);
        }

        @Override // com.zepto.x2
        public boolean j(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.j(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.C);
            float fCenterX = ClockFaceView.this.C.centerX();
            float fCenterY = ClockFaceView.this.C.centerY();
            ClockFaceView.this.B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.z);
    }

    public static float Q(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    @Override // com.zepto.a45
    public void F(int i) {
        if (i != E()) {
            super.F(i);
            this.B.m(E());
        }
    }

    @Override // com.zepto.a45
    public void H() {
        super.H();
        for (int i = 0; i < this.F.size(); i++) {
            ((TextView) this.F.get(i)).setVisibility(0);
        }
    }

    public final void N() {
        RectF rectFE = this.B.e();
        TextView textViewP = P(rectFE);
        for (int i = 0; i < this.F.size(); i++) {
            TextView textView = (TextView) this.F.get(i);
            if (textView != null) {
                textView.setSelected(textView == textViewP);
                textView.getPaint().setShader(O(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.C);
        this.D.set(this.C);
        textView.getLineBounds(0, this.E);
        RectF rectF2 = this.D;
        Rect rect = this.E;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.D)) {
            return new RadialGradient(rectF.centerX() - this.D.left, rectF.centerY() - this.D.top, rectF.width() * 0.5f, this.H, this.I, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final TextView P(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.F.size(); i++) {
            TextView textView2 = (TextView) this.F.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.C);
                this.D.set(this.C);
                this.D.union(rectF);
                float fWidth = this.D.width() * this.D.height();
                if (fWidth < f) {
                    textView = textView2;
                    f = fWidth;
                }
            }
        }
        return textView;
    }

    public void R(String[] strArr, int i) {
        this.N = strArr;
        S(i);
    }

    public final void S(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.F.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.N.length, size); i2++) {
            TextView textView = (TextView) this.F.get(i2);
            if (i2 >= this.N.length) {
                removeView(textView);
                this.F.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(p05.l, (ViewGroup) this, false);
                    this.F.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.N[i2]);
                textView.setTag(zz4.r, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(zz4.m, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                dq7.q0(textView, this.G);
                textView.setTextColor(this.P);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.N[i2]));
                }
            }
        }
        this.B.q(z);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f, boolean z) {
        if (Math.abs(this.O - f) > 0.001f) {
            this.O = f;
            N();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        r3.x0(accessibilityNodeInfo).W(r3.c.b(1, this.N.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iQ = (int) (this.M / Q(this.K / displayMetrics.heightPixels, this.L / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
        setMeasuredDimension(iQ, iQ);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = new Rect();
        this.D = new RectF();
        this.E = new Rect();
        this.F = new SparseArray();
        this.I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.f1, i, g15.v);
        Resources resources = getResources();
        ColorStateList colorStateListA = vq3.a(context, typedArrayObtainStyledAttributes, m15.h1);
        this.P = colorStateListA;
        LayoutInflater.from(context).inflate(p05.m, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(zz4.l);
        this.B = clockHandView;
        this.J = resources.getDimensionPixelSize(jz4.u);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.H = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = tr.a(context, dz4.f).getDefaultColor();
        ColorStateList colorStateListA2 = vq3.a(context, typedArrayObtainStyledAttributes, m15.g1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        R(strArr, 0);
        this.K = resources.getDimensionPixelSize(jz4.H);
        this.L = resources.getDimensionPixelSize(jz4.I);
        this.M = resources.getDimensionPixelSize(jz4.w);
    }
}
