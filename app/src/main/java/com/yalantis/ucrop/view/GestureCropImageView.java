package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.zepto.m31;
import com.zepto.ve5;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class GestureCropImageView extends m31 {
    public ScaleGestureDetector E;
    public ve5 F;
    public GestureDetector G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public int L;

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.B(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.m(-f, -f2);
            return true;
        }
    }

    public class c extends ve5.b {
        public c() {
        }

        @Override // com.zepto.ve5.a
        public boolean a(ve5 ve5Var) {
            GestureCropImageView.this.k(ve5Var.c(), GestureCropImageView.this.H, GestureCropImageView.this.I);
            return true;
        }
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.l(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.H, GestureCropImageView.this.I);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void I() {
        this.G = new GestureDetector(getContext(), new b(), null, true);
        this.E = new ScaleGestureDetector(getContext(), new d());
        this.F = new ve5(new c());
    }

    public int getDoubleTapScaleSteps() {
        return this.L;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.L));
    }

    @Override // com.zepto.zm6
    public void i() {
        super.i();
        I();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
            t();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.H = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.I = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.G.onTouchEvent(motionEvent);
        if (this.K) {
            this.E.onTouchEvent(motionEvent);
        }
        if (this.J) {
            this.F.d(motionEvent);
        }
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 1) {
            z();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.L = i;
    }

    public void setRotateEnabled(boolean z) {
        this.J = z;
    }

    public void setScaleEnabled(boolean z) {
        this.K = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.J = true;
        this.K = true;
        this.L = 5;
    }
}
