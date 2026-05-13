package com.facebook.shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.zepto.k15;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public static final PorterDuffXfermode r = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    public Paint a;
    public Paint b;
    public d c;
    public g d;
    public Bitmap e;
    public Bitmap f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public ViewTreeObserver.OnGlobalLayoutListener o;
    public ValueAnimator p;
    public Bitmap q;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z = ShimmerFrameLayout.this.n;
            ShimmerFrameLayout.this.l();
            if (ShimmerFrameLayout.this.g || z) {
                ShimmerFrameLayout.this.o();
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fMax = Math.max(0.0f, Math.min(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            float f = 1.0f - fMax;
            ShimmerFrameLayout.this.setMaskOffsetX((int) ((r1.d.a * f) + (ShimmerFrameLayout.this.d.c * fMax)));
            ShimmerFrameLayout.this.setMaskOffsetY((int) ((r1.d.b * f) + (ShimmerFrameLayout.this.d.d * fMax)));
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[e.values().length];
            b = iArr;
            try {
                iArr[e.CW_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.CW_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.CW_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[e.CW_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[f.values().length];
            a = iArr2;
            try {
                iArr2[f.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[f.RADIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class d {
        public e a;
        public float b;
        public float c;
        public int d;
        public int e;
        public float f;
        public float g;
        public float h;
        public f i;

        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        public int[] a() {
            return c.a[this.i.ordinal()] != 2 ? new int[]{0, -16777216, -16777216, 0} : new int[]{-16777216, -16777216, 0};
        }

        public float[] b() {
            return c.a[this.i.ordinal()] != 2 ? new float[]{Math.max(((1.0f - this.f) - this.c) / 2.0f, 0.0f), Math.max((1.0f - this.f) / 2.0f, 0.0f), Math.min((this.f + 1.0f) / 2.0f, 1.0f), Math.min(((this.f + 1.0f) + this.c) / 2.0f, 1.0f)} : new float[]{0.0f, Math.min(this.f, 1.0f), Math.min(this.f + this.c, 1.0f)};
        }

        public int c(int i) {
            int i2 = this.e;
            return i2 > 0 ? i2 : (int) (i * this.h);
        }

        public int d(int i) {
            int i2 = this.d;
            return i2 > 0 ? i2 : (int) (i * this.g);
        }
    }

    public enum e {
        CW_0,
        CW_90,
        CW_180,
        CW_270
    }

    public enum f {
        LINEAR,
        RADIAL
    }

    public static class g {
        public int a;
        public int b;
        public int c;
        public int d;

        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        public void a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static float g(float f2, float f3, float f4) {
        return Math.min(f3, Math.max(f2, f4));
    }

    private ViewTreeObserver.OnGlobalLayoutListener getLayoutListener() {
        return new a();
    }

    private Bitmap getMaskBitmap() {
        Shader radialGradient;
        int i;
        int i2;
        int i3;
        Bitmap bitmap = this.q;
        if (bitmap != null) {
            return bitmap;
        }
        int iD = this.c.d(getWidth());
        int iC = this.c.c(getHeight());
        this.q = h(iD, iC);
        Canvas canvas = new Canvas(this.q);
        if (c.a[this.c.i.ordinal()] != 2) {
            int i4 = c.b[this.c.a.ordinal()];
            int i5 = 0;
            if (i4 == 2) {
                i = iC;
                i2 = 0;
                i3 = 0;
            } else if (i4 == 3) {
                i2 = 0;
                i3 = 0;
                i = 0;
                i5 = iD;
            } else if (i4 != 4) {
                i3 = iD;
                i2 = 0;
                i = 0;
            } else {
                i2 = iC;
                i3 = 0;
                i = 0;
            }
            radialGradient = new LinearGradient(i5, i2, i3, i, this.c.a(), this.c.b(), Shader.TileMode.REPEAT);
        } else {
            radialGradient = new RadialGradient(iD / 2, iC / 2, (float) (((double) Math.max(iD, iC)) / Math.sqrt(2.0d)), this.c.a(), this.c.b(), Shader.TileMode.REPEAT);
        }
        Shader shader = radialGradient;
        canvas.rotate(this.c.b, iD / 2, iC / 2);
        Paint paint = new Paint();
        paint.setShader(shader);
        float f2 = -(((int) (Math.sqrt(2.0d) * ((double) Math.max(iD, iC)))) / 2);
        canvas.drawRect(f2, f2, iD + r3, iC + r3, paint);
        return this.q;
    }

    private Animator getShimmerAnimation() {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        int width = getWidth();
        int height = getHeight();
        int i = c.a[this.c.i.ordinal()];
        int i2 = c.b[this.c.a.ordinal()];
        if (i2 == 2) {
            this.d.a(0, -height, 0, height);
        } else if (i2 == 3) {
            this.d.a(width, 0, -width, 0);
        } else if (i2 != 4) {
            this.d.a(-width, 0, width, 0);
        } else {
            this.d.a(0, height, 0, -height);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (this.j / this.h) + 1.0f);
        this.p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.h + this.j);
        this.p.setRepeatCount(this.i);
        this.p.setRepeatMode(this.k);
        this.p.addUpdateListener(new b());
        return this.p;
    }

    public static Bitmap h(int i, int i2) {
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskOffsetX(int i) {
        if (this.l == i) {
            return;
        }
        this.l = i;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskOffsetY(int i) {
        if (this.m == i) {
            return;
        }
        this.m = i;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.n || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            i(canvas);
        }
    }

    public e getAngle() {
        return this.c.a;
    }

    public float getBaseAlpha() {
        return this.a.getAlpha() / 255.0f;
    }

    public float getDropoff() {
        return this.c.c;
    }

    public int getDuration() {
        return this.h;
    }

    public int getFixedHeight() {
        return this.c.e;
    }

    public int getFixedWidth() {
        return this.c.d;
    }

    public float getIntensity() {
        return this.c.f;
    }

    public f getMaskShape() {
        return this.c.i;
    }

    public float getRelativeHeight() {
        return this.c.h;
    }

    public float getRelativeWidth() {
        return this.c.g;
    }

    public int getRepeatCount() {
        return this.i;
    }

    public int getRepeatDelay() {
        return this.j;
    }

    public int getRepeatMode() {
        return this.k;
    }

    public float getTilt() {
        return this.c.b;
    }

    public final boolean i(Canvas canvas) {
        Bitmap bitmapS = s();
        Bitmap bitmapR = r();
        if (bitmapS == null || bitmapR == null) {
            return false;
        }
        k(new Canvas(bitmapS));
        canvas.drawBitmap(bitmapS, 0.0f, 0.0f, this.a);
        j(new Canvas(bitmapR));
        canvas.drawBitmap(bitmapR, 0.0f, 0.0f, (Paint) null);
        return true;
    }

    public final void j(Canvas canvas) {
        Bitmap maskBitmap = getMaskBitmap();
        if (maskBitmap == null) {
            return;
        }
        int i = this.l;
        canvas.clipRect(i, this.m, maskBitmap.getWidth() + i, this.m + maskBitmap.getHeight());
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        super.dispatchDraw(canvas);
        canvas.drawBitmap(maskBitmap, this.l, this.m, this.b);
    }

    public final void k(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        super.dispatchDraw(canvas);
    }

    public final void l() {
        p();
        m();
        n();
    }

    public final void m() {
        Bitmap bitmap = this.q;
        if (bitmap != null) {
            bitmap.recycle();
            this.q = null;
        }
    }

    public final void n() {
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f = null;
        }
        Bitmap bitmap2 = this.e;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.e = null;
        }
    }

    public void o() {
        if (this.n) {
            return;
        }
        getShimmerAnimation().start();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.o == null) {
            this.o = getLayoutListener();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        p();
        if (this.o != null) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.o);
            this.o = null;
        }
        super.onDetachedFromWindow();
    }

    public void p() {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.p.removeAllUpdateListeners();
            this.p.cancel();
        }
        this.p = null;
        this.n = false;
    }

    public final Bitmap q() {
        int width = getWidth();
        int height = getHeight();
        try {
            return h(width, height);
        } catch (OutOfMemoryError unused) {
            StringBuilder sb = new StringBuilder("ShimmerFrameLayout failed to create working bitmap");
            sb.append(" (width = ");
            sb.append(width);
            sb.append(", height = ");
            sb.append(height);
            sb.append(")\n\n");
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
            Log.d("ShimmerFrameLayout", sb.toString());
            return null;
        }
    }

    public final Bitmap r() {
        if (this.e == null) {
            this.e = q();
        }
        return this.e;
    }

    public final Bitmap s() {
        if (this.f == null) {
            this.f = q();
        }
        return this.f;
    }

    public void setAngle(e eVar) {
        this.c.a = eVar;
        l();
    }

    public void setAutoStart(boolean z) {
        this.g = z;
        l();
    }

    public void setBaseAlpha(float f2) {
        this.a.setAlpha((int) (g(0.0f, 1.0f, f2) * 255.0f));
        l();
    }

    public void setDropoff(float f2) {
        this.c.c = f2;
        l();
    }

    public void setDuration(int i) {
        this.h = i;
        l();
    }

    public void setFixedHeight(int i) {
        this.c.e = i;
        l();
    }

    public void setFixedWidth(int i) {
        this.c.d = i;
        l();
    }

    public void setIntensity(float f2) {
        this.c.f = f2;
        l();
    }

    public void setMaskShape(f fVar) {
        this.c.i = fVar;
        l();
    }

    public void setRelativeHeight(int i) {
        this.c.h = i;
        l();
    }

    public void setRelativeWidth(int i) {
        this.c.g = i;
        l();
    }

    public void setRepeatCount(int i) {
        this.i = i;
        l();
    }

    public void setRepeatDelay(int i) {
        this.j = i;
        l();
    }

    public void setRepeatMode(int i) {
        this.k = i;
        l();
    }

    public void setTilt(float f2) {
        this.c.b = f2;
        l();
    }

    public void t() {
        setAutoStart(false);
        setDuration(1000);
        setRepeatCount(-1);
        setRepeatDelay(0);
        setRepeatMode(1);
        d dVar = this.c;
        dVar.a = e.CW_0;
        dVar.i = f.LINEAR;
        dVar.c = 0.5f;
        dVar.d = 0;
        dVar.e = 0;
        dVar.f = 0.0f;
        dVar.g = 1.0f;
        dVar.h = 1.0f;
        dVar.b = 20.0f;
        this.d = new g(null);
        setBaseAlpha(0.3f);
        l();
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.c = new d(null);
        this.a = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.b.setDither(true);
        this.b.setFilterBitmap(true);
        this.b.setXfermode(r);
        t();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k15.a, 0, 0);
            try {
                int i2 = k15.c;
                if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                    setAutoStart(typedArrayObtainStyledAttributes.getBoolean(i2, false));
                }
                int i3 = k15.d;
                if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                    setBaseAlpha(typedArrayObtainStyledAttributes.getFloat(i3, 0.0f));
                }
                int i4 = k15.f;
                if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                    setDuration(typedArrayObtainStyledAttributes.getInt(i4, 0));
                }
                int i5 = k15.l;
                if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                    setRepeatCount(typedArrayObtainStyledAttributes.getInt(i5, 0));
                }
                int i6 = k15.m;
                if (typedArrayObtainStyledAttributes.hasValue(i6)) {
                    setRepeatDelay(typedArrayObtainStyledAttributes.getInt(i6, 0));
                }
                int i7 = k15.n;
                if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                    setRepeatMode(typedArrayObtainStyledAttributes.getInt(i7, 0));
                }
                int i8 = k15.b;
                if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                    int i9 = typedArrayObtainStyledAttributes.getInt(i8, 0);
                    if (i9 == 90) {
                        this.c.a = e.CW_90;
                    } else if (i9 == 180) {
                        this.c.a = e.CW_180;
                    } else if (i9 != 270) {
                        this.c.a = e.CW_0;
                    } else {
                        this.c.a = e.CW_270;
                    }
                }
                int i10 = k15.o;
                if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                    if (typedArrayObtainStyledAttributes.getInt(i10, 0) != 1) {
                        this.c.i = f.LINEAR;
                    } else {
                        this.c.i = f.RADIAL;
                    }
                }
                int i11 = k15.e;
                if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                    this.c.c = typedArrayObtainStyledAttributes.getFloat(i11, 0.0f);
                }
                int i12 = k15.h;
                if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                    this.c.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, 0);
                }
                int i13 = k15.g;
                if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                    this.c.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
                }
                int i14 = k15.i;
                if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                    this.c.f = typedArrayObtainStyledAttributes.getFloat(i14, 0.0f);
                }
                int i15 = k15.k;
                if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                    this.c.g = typedArrayObtainStyledAttributes.getFloat(i15, 0.0f);
                }
                int i16 = k15.j;
                if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                    this.c.h = typedArrayObtainStyledAttributes.getFloat(i16, 0.0f);
                }
                int i17 = k15.p;
                if (typedArrayObtainStyledAttributes.hasValue(i17)) {
                    this.c.b = typedArrayObtainStyledAttributes.getFloat(i17, 0.0f);
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
    }
}
