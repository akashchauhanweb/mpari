package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.zepto.dq7;
import com.zepto.dr3;
import com.zepto.g15;
import com.zepto.gx3;
import com.zepto.jz4;
import com.zepto.m15;
import com.zepto.rp;
import com.zepto.xy4;
import com.zepto.zr7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public final int a;
    public final TimeInterpolator b;
    public final ValueAnimator c;
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public final int h;
    public boolean i;
    public final List j;
    public final int k;
    public final float l;
    public final Paint m;
    public final RectF n;
    public final int o;
    public float p;
    public boolean q;
    public double r;
    public int s;
    public int t;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.z);
    }

    public void b(b bVar) {
        this.j.add(bVar);
    }

    public final void c(float f, float f2) {
        this.t = dr3.a((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) h(2)) + zr7.c(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fH = h(this.t);
        float fCos = (((float) Math.cos(this.r)) * fH) + f;
        float f2 = height;
        float fSin = (fH * ((float) Math.sin(this.r))) + f2;
        this.m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.k, this.m);
        double dSin = Math.sin(this.r);
        double dCos = Math.cos(this.r);
        this.m.setStrokeWidth(this.o);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.m);
        canvas.drawCircle(f, f2, this.l, this.m);
    }

    public RectF e() {
        return this.n;
    }

    public final int f(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public float g() {
        return this.p;
    }

    public final int h(int i) {
        return i == 2 ? Math.round(this.s * 0.66f) : this.s;
    }

    public int i() {
        return this.k;
    }

    public final Pair j(float f) {
        float fG = g();
        if (Math.abs(fG - f) > 180.0f) {
            if (fG > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (fG < 180.0f && f > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f));
    }

    public final boolean k(float f, float f2, boolean z, boolean z2, boolean z3) {
        float f3 = f(f, f2);
        boolean z4 = false;
        boolean z5 = g() != f3;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.d) {
            z4 = true;
        }
        o(f3, z4);
        return true;
    }

    public final /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void m(int i) {
        this.s = i;
        invalidate();
    }

    public void n(float f) {
        o(f, false);
    }

    public void o(float f, boolean z) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            p(f, false);
            return;
        }
        Pair pairJ = j(f);
        this.c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.c.setDuration(this.a);
        this.c.setInterpolator(this.b);
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.a.l(valueAnimator2);
            }
        });
        this.c.addListener(new a());
        this.c.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.e = x;
            this.f = y;
            this.g = true;
            this.q = false;
            z = true;
            z2 = false;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.e);
            int i2 = (int) (y - this.f);
            this.g = (i * i) + (i2 * i2) > this.h;
            z2 = this.q;
            boolean z4 = actionMasked == 1;
            if (this.i) {
                c(x, y);
            }
            z3 = z4;
            z = false;
        } else {
            z2 = false;
            z = false;
            z3 = false;
        }
        this.q |= k(x, y, z2, z, z3);
        return true;
    }

    public final void p(float f, boolean z) {
        float f2 = f % 360.0f;
        this.p = f2;
        this.r = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.t);
        float fCos = width + (((float) Math.cos(this.r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.r)));
        RectF rectF = this.n;
        int i = this.k;
        rectF.set(fCos - i, fSin - i, fCos + i, fSin + i);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f2, z);
        }
        invalidate();
    }

    public void q(boolean z) {
        if (this.i && !z) {
            this.t = 1;
        }
        this.i = z;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ValueAnimator();
        this.j = new ArrayList();
        Paint paint = new Paint();
        this.m = paint;
        this.n = new RectF();
        this.t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.i1, i, g15.v);
        this.a = gx3.f(context, xy4.B, 200);
        this.b = gx3.g(context, xy4.L, rp.b);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(m15.k1, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(m15.l1, 0);
        this.o = getResources().getDimensionPixelSize(jz4.v);
        this.l = r7.getDimensionPixelSize(jz4.t);
        int color = typedArrayObtainStyledAttributes.getColor(m15.j1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        dq7.B0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
