package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.zepto.zm6;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m31 extends zm6 {
    public float A;
    public int B;
    public int C;
    public long D;
    public final RectF s;
    public final Matrix t;
    public float u;
    public float v;
    public l31 w;
    public Runnable x;
    public Runnable y;
    public float z;

    public static class a implements Runnable {
        public final WeakReference c;
        public final long e;
        public final long f = System.currentTimeMillis();
        public final float g;
        public final float h;
        public final float i;
        public final float j;
        public final float k;
        public final float l;
        public final boolean m;

        public a(m31 m31Var, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.c = new WeakReference(m31Var);
            this.e = j;
            this.g = f;
            this.h = f2;
            this.i = f3;
            this.j = f4;
            this.k = f5;
            this.l = f6;
            this.m = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            m31 m31Var = (m31) this.c.get();
            if (m31Var == null) {
                return;
            }
            float fMin = Math.min(this.e, System.currentTimeMillis() - this.f);
            float fB = v31.b(fMin, 0.0f, this.i, this.e);
            float fB2 = v31.b(fMin, 0.0f, this.j, this.e);
            float fA = v31.a(fMin, 0.0f, this.l, this.e);
            if (fMin < this.e) {
                float[] fArr = m31Var.e;
                m31Var.m(fB - (fArr[0] - this.g), fB2 - (fArr[1] - this.h));
                if (!this.m) {
                    m31Var.D(this.k + fA, m31Var.s.centerX(), m31Var.s.centerY());
                }
                if (m31Var.v()) {
                    return;
                }
                m31Var.post(this);
            }
        }
    }

    public static class b implements Runnable {
        public final WeakReference c;
        public final long e;
        public final long f = System.currentTimeMillis();
        public final float g;
        public final float h;
        public final float i;
        public final float j;

        public b(m31 m31Var, long j, float f, float f2, float f3, float f4) {
            this.c = new WeakReference(m31Var);
            this.e = j;
            this.g = f;
            this.h = f2;
            this.i = f3;
            this.j = f4;
        }

        @Override // java.lang.Runnable
        public void run() {
            m31 m31Var = (m31) this.c.get();
            if (m31Var == null) {
                return;
            }
            float fMin = Math.min(this.e, System.currentTimeMillis() - this.f);
            float fA = v31.a(fMin, 0.0f, this.h, this.e);
            if (fMin >= this.e) {
                m31Var.z();
            } else {
                m31Var.D(this.g + fA, this.i, this.j);
                m31Var.post(this);
            }
        }
    }

    public m31(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = new RectF();
        this.t = new Matrix();
        this.v = 10.0f;
        this.y = null;
        this.B = 0;
        this.C = 0;
        this.D = 500L;
    }

    public final void A(float f, float f2) {
        float fWidth = this.s.width();
        float fHeight = this.s.height();
        float fMax = Math.max(this.s.width() / f, this.s.height() / f2);
        RectF rectF = this.s;
        float f3 = ((fWidth - (f * fMax)) / 2.0f) + rectF.left;
        float f4 = ((fHeight - (f2 * fMax)) / 2.0f) + rectF.top;
        this.g.reset();
        this.g.postScale(fMax, fMax);
        this.g.postTranslate(f3, f4);
        setImageMatrix(this.g);
    }

    public void B(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j, currentScale, f - currentScale, f2, f3);
        this.y = bVar;
        post(bVar);
    }

    public void C(float f) {
        D(f, this.s.centerX(), this.s.centerY());
    }

    public void D(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            l(f / getCurrentScale(), f2, f3);
        }
    }

    public void E(float f) {
        F(f, this.s.centerX(), this.s.centerY());
    }

    public void F(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            l(f / getCurrentScale(), f2, f3);
        }
    }

    public l31 getCropBoundsChangeListener() {
        return this.w;
    }

    public float getMaxScale() {
        return this.z;
    }

    public float getMinScale() {
        return this.A;
    }

    public float getTargetAspectRatio() {
        return this.u;
    }

    @Override // com.zepto.zm6
    public void j() {
        super.j();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.u == 0.0f) {
            this.u = intrinsicWidth / intrinsicHeight;
        }
        int i = this.h;
        float f = this.u;
        int i2 = (int) (i / f);
        int i3 = this.i;
        if (i2 > i3) {
            this.s.set((i - ((int) (i3 * f))) / 2, 0.0f, r4 + r2, i3);
        } else {
            this.s.set(0.0f, (i3 - i2) / 2, i, i2 + r6);
        }
        s(intrinsicWidth, intrinsicHeight);
        A(intrinsicWidth, intrinsicHeight);
        l31 l31Var = this.w;
        if (l31Var != null) {
            l31Var.a(this.u);
        }
        zm6.b bVar = this.j;
        if (bVar != null) {
            bVar.b(getCurrentScale());
            this.j.c(getCurrentAngle());
        }
    }

    @Override // com.zepto.zm6
    public void l(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.l(f, f2, f3);
        } else {
            if (f >= 1.0f || getCurrentScale() * f < getMinScale()) {
                return;
            }
            super.l(f, f2, f3);
        }
    }

    public final float[] q() {
        this.t.reset();
        this.t.setRotate(-getCurrentAngle());
        float[] fArr = this.d;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        float[] fArrB = h65.b(this.s);
        this.t.mapPoints(fArrCopyOf);
        this.t.mapPoints(fArrB);
        RectF rectFD = h65.d(fArrCopyOf);
        RectF rectFD2 = h65.d(fArrB);
        float f = rectFD.left - rectFD2.left;
        float f2 = rectFD.top - rectFD2.top;
        float f3 = rectFD.right - rectFD2.right;
        float f4 = rectFD.bottom - rectFD2.bottom;
        float[] fArr2 = new float[4];
        if (f <= 0.0f) {
            f = 0.0f;
        }
        fArr2[0] = f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        fArr2[1] = f2;
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        fArr2[2] = f3;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        fArr2[3] = f4;
        this.t.reset();
        this.t.setRotate(getCurrentAngle());
        this.t.mapPoints(fArr2);
        return fArr2;
    }

    public final void r() {
        if (getDrawable() == null) {
            return;
        }
        s(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    public final void s(float f, float f2) {
        float fMin = Math.min(Math.min(this.s.width() / f, this.s.width() / f2), Math.min(this.s.height() / f2, this.s.height() / f));
        this.A = fMin;
        this.z = fMin * this.v;
    }

    public void setCropBoundsChangeListener(l31 l31Var) {
        this.w = l31Var;
    }

    public void setCropRect(RectF rectF) {
        this.u = rectF.width() / rectF.height();
        this.s.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        r();
        z();
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float fMax;
        float f2;
        if (!this.n || v()) {
            return;
        }
        float[] fArr = this.e;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.s.centerX() - f3;
        float fCenterY = this.s.centerY() - f4;
        this.t.reset();
        this.t.setTranslate(fCenterX, fCenterY);
        float[] fArr2 = this.d;
        float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.t.mapPoints(fArrCopyOf);
        boolean zW = w(fArrCopyOf);
        if (zW) {
            float[] fArrQ = q();
            float f5 = -(fArrQ[0] + fArrQ[2]);
            f2 = -(fArrQ[1] + fArrQ[3]);
            f = f5;
            fMax = 0.0f;
        } else {
            RectF rectF = new RectF(this.s);
            this.t.reset();
            this.t.setRotate(getCurrentAngle());
            this.t.mapRect(rectF);
            float[] fArrC = h65.c(this.d);
            f = fCenterX;
            fMax = (Math.max(rectF.width() / fArrC[0], rectF.height() / fArrC[1]) * currentScale) - currentScale;
            f2 = fCenterY;
        }
        if (z) {
            a aVar = new a(this, this.D, f3, f4, f, f2, currentScale, fMax, zW);
            this.x = aVar;
            post(aVar);
        } else {
            m(f, f2);
            if (zW) {
                return;
            }
            D(currentScale + fMax, this.s.centerX(), this.s.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.D = j;
    }

    public void setMaxResultImageSizeX(int i) {
        this.B = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.C = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.v = f;
    }

    public void setTargetAspectRatio(float f) {
        if (getDrawable() == null) {
            this.u = f;
            return;
        }
        if (f == 0.0f) {
            this.u = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.u = f;
        }
        l31 l31Var = this.w;
        if (l31Var != null) {
            l31Var.a(this.u);
        }
    }

    public void t() {
        removeCallbacks(this.x);
        removeCallbacks(this.y);
    }

    public void u(Bitmap.CompressFormat compressFormat, int i, p60 p60Var) {
        t();
        setImageToWrapCropBounds(false);
        new q60(getContext(), getViewBitmap(), new tx2(this.s, h65.d(this.d), getCurrentScale(), getCurrentAngle()), new n31(this.B, this.C, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo()), p60Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean v() {
        return w(this.d);
    }

    public boolean w(float[] fArr) {
        this.t.reset();
        this.t.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.t.mapPoints(fArrCopyOf);
        float[] fArrB = h65.b(this.s);
        this.t.mapPoints(fArrB);
        return h65.d(fArrCopyOf).contains(h65.d(fArrB));
    }

    public void x(float f) {
        k(f, this.s.centerX(), this.s.centerY());
    }

    public void y(TypedArray typedArray) {
        float fAbs = Math.abs(typedArray.getFloat(q15.V, 0.0f));
        float fAbs2 = Math.abs(typedArray.getFloat(q15.W, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            this.u = 0.0f;
        } else {
            this.u = fAbs / fAbs2;
        }
    }

    public void z() {
        setImageToWrapCropBounds(true);
    }
}
