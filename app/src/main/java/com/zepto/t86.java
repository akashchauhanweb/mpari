package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.pdfview.subsamplincscaleimageview.decoder.SkiaImageDecoder;
import com.pdfview.subsamplincscaleimageview.decoder.SkiaImageRegionDecoder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t86 extends View {
    public static Bitmap.Config B0 = null;
    public static final String v0 = "t86";
    public PointF A;
    public PointF B;
    public PointF C;
    public Float D;
    public PointF E;
    public PointF F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public Rect K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public GestureDetector P;
    public GestureDetector Q;
    public rx2 R;
    public final ReadWriteLock S;
    public se1 T;
    public se1 U;
    public PointF V;
    public float W;
    public Bitmap a;
    public final float a0;
    public boolean b;
    public float b0;
    public boolean c;
    public boolean c0;
    public Uri d;
    public PointF d0;
    public int e;
    public PointF e0;
    public boolean f;
    public PointF f0;
    public Map g;
    public d g0;
    public boolean h;
    public boolean h0;
    public int i;
    public boolean i0;
    public float j;
    public View.OnLongClickListener j0;
    public float k;
    public final Handler k0;
    public int l;
    public Paint l0;
    public int m;
    public Paint m0;
    public int n;
    public Paint n0;
    public int o;
    public Paint o0;
    public int p;
    public j p0;
    public Executor q;
    public Matrix q0;
    public boolean r;
    public RectF r0;
    public boolean s;
    public final float[] s0;
    public boolean t;
    public final float[] t0;
    public boolean u;
    public final float u0;
    public float v;
    public int w;
    public int x;
    public float y;
    public float z;
    public static final List w0 = Arrays.asList(0, 90, 180, 270, -1);
    public static final List x0 = Arrays.asList(1, 2, 3);
    public static final List y0 = Arrays.asList(2, 1);
    public static final List z0 = Arrays.asList(1, 2, 3);
    public static final List A0 = Arrays.asList(2, 1, 3, 4);

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1 && t86.this.j0 != null) {
                t86.this.O = 0;
                t86 t86Var = t86.this;
                t86.super.setOnLongClickListener(t86Var.j0);
                t86.this.performLongClick();
                t86.super.setOnLongClickListener(null);
            }
            return true;
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!t86.this.t || !t86.this.h0 || t86.this.A == null) {
                return super.onDoubleTapEvent(motionEvent);
            }
            t86.this.setGestureDetector(this.a);
            if (!t86.this.u) {
                t86 t86Var = t86.this;
                t86Var.W(t86Var.Q0(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
            t86.this.V = new PointF(motionEvent.getX(), motionEvent.getY());
            t86.this.B = new PointF(t86.this.A.x, t86.this.A.y);
            t86 t86Var2 = t86.this;
            t86Var2.z = t86Var2.y;
            t86.this.N = true;
            t86.this.L = true;
            t86.this.b0 = -1.0f;
            t86 t86Var3 = t86.this;
            t86Var3.e0 = t86Var3.Q0(t86Var3.V);
            t86.this.f0 = new PointF(motionEvent.getX(), motionEvent.getY());
            t86.this.d0 = new PointF(t86.this.e0.x, t86.this.e0.y);
            t86.this.c0 = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!t86.this.s || !t86.this.h0 || t86.this.A == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || t86.this.L))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = new PointF(t86.this.A.x + (f * 0.25f), t86.this.A.y + (f2 * 0.25f));
            new e(t86.this, new PointF(((t86.this.getWidth() / 2) - pointF.x) / t86.this.y, ((t86.this.getHeight() / 2) - pointF.y) / t86.this.y), (a) null).e(1).h(false).g(3).c();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            t86.this.performClick();
            return true;
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            t86.this.performClick();
            return true;
        }
    }

    public final class e {
        public final float a;
        public final PointF b;
        public final PointF c;
        public long d;
        public int e;
        public int f;
        public boolean g;
        public boolean h;

        public /* synthetic */ e(t86 t86Var, float f, PointF pointF, PointF pointF2, a aVar) {
            this(f, pointF, pointF2);
        }

        public void c() {
            PointF pointFK0;
            if (t86.this.g0 != null) {
                d.c(t86.this.g0);
            }
            int paddingLeft = t86.this.getPaddingLeft() + (((t86.this.getWidth() - t86.this.getPaddingRight()) - t86.this.getPaddingLeft()) / 2);
            int paddingTop = t86.this.getPaddingTop() + (((t86.this.getHeight() - t86.this.getPaddingBottom()) - t86.this.getPaddingTop()) / 2);
            float fL0 = t86.this.l0(this.a);
            if (this.h) {
                t86 t86Var = t86.this;
                PointF pointF = this.b;
                pointFK0 = t86Var.k0(pointF.x, pointF.y, fL0, new PointF());
            } else {
                pointFK0 = this.b;
            }
            a aVar = null;
            t86.this.g0 = new d(aVar);
            t86.this.g0.a = t86.this.y;
            t86.this.g0.b = fL0;
            t86.this.g0.l = System.currentTimeMillis();
            t86.this.g0.e = pointFK0;
            t86.this.g0.c = t86.this.getCenter();
            t86.this.g0.d = pointFK0;
            t86.this.g0.f = t86.this.I0(pointFK0);
            t86.this.g0.g = new PointF(paddingLeft, paddingTop);
            t86.this.g0.h = this.d;
            t86.this.g0.i = this.g;
            t86.this.g0.j = this.e;
            t86.this.g0.k = this.f;
            t86.this.g0.l = System.currentTimeMillis();
            d.d(t86.this.g0, null);
            PointF pointF2 = this.c;
            if (pointF2 != null) {
                float f = pointF2.x - (t86.this.g0.c.x * fL0);
                float f2 = this.c.y - (t86.this.g0.c.y * fL0);
                j jVar = new j(fL0, new PointF(f, f2), aVar);
                t86.this.d0(true, jVar);
                t86.this.g0.g = new PointF(this.c.x + (jVar.b.x - f), this.c.y + (jVar.b.y - f2));
            }
            t86.this.invalidate();
        }

        public e d(long j) {
            this.d = j;
            return this;
        }

        public e e(int i) {
            if (t86.y0.contains(Integer.valueOf(i))) {
                this.e = i;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i);
        }

        public e f(boolean z) {
            this.g = z;
            return this;
        }

        public final e g(int i) {
            this.f = i;
            return this;
        }

        public final e h(boolean z) {
            this.h = z;
            return this;
        }

        public /* synthetic */ e(t86 t86Var, float f, PointF pointF, a aVar) {
            this(f, pointF);
        }

        public /* synthetic */ e(t86 t86Var, PointF pointF, a aVar) {
            this(pointF);
        }

        public e(PointF pointF) {
            this.d = 500L;
            this.e = 2;
            this.f = 1;
            this.g = true;
            this.h = true;
            this.a = t86.this.y;
            this.b = pointF;
            this.c = null;
        }

        public e(float f, PointF pointF) {
            this.d = 500L;
            this.e = 2;
            this.f = 1;
            this.g = true;
            this.h = true;
            this.a = f;
            this.b = pointF;
            this.c = null;
        }

        public e(float f, PointF pointF, PointF pointF2) {
            this.d = 500L;
            this.e = 2;
            this.f = 1;
            this.g = true;
            this.h = true;
            this.a = f;
            this.b = pointF;
            this.c = pointF2;
        }
    }

    public static class f extends AsyncTask {
        public final WeakReference a;
        public final WeakReference b;
        public final WeakReference c;
        public final Uri d;
        public final boolean e;
        public Bitmap f;
        public Exception g;

        public f(t86 t86Var, Context context, se1 se1Var, Uri uri, boolean z) {
            this.a = new WeakReference(t86Var);
            this.b = new WeakReference(context);
            this.c = new WeakReference(se1Var);
            this.d = uri;
            this.e = z;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            try {
                String string = this.d.toString();
                Context context = (Context) this.b.get();
                se1 se1Var = (se1) this.c.get();
                t86 t86Var = (t86) this.a.get();
                if (context == null || se1Var == null || t86Var == null) {
                    return null;
                }
                t86Var.U("BitmapLoadTask.doInBackground", new Object[0]);
                this.f = ((ix2) se1Var.a()).a(context, this.d);
                return Integer.valueOf(t86Var.e0(context, string));
            } catch (Exception e) {
                Log.e(t86.v0, "Failed to load bitmap", e);
                this.g = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(t86.v0, "Failed to load bitmap - OutOfMemoryError", e2);
                this.g = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            t86 t86Var = (t86) this.a.get();
            if (t86Var != null) {
                Bitmap bitmap = this.f;
                if (bitmap == null || num == null) {
                    if (this.g != null) {
                        t86.z(t86Var);
                    }
                } else if (this.e) {
                    t86Var.p0(bitmap);
                } else {
                    t86Var.o0(bitmap, num.intValue(), false);
                }
            }
        }
    }

    public interface g {
    }

    public interface h {
    }

    public interface i {
    }

    public static class j {
        public float a;
        public final PointF b;

        public /* synthetic */ j(float f, PointF pointF, a aVar) {
            this(f, pointF);
        }

        public j(float f, PointF pointF) {
            this.a = f;
            this.b = pointF;
        }
    }

    public static class k {
        public Rect a;
        public int b;
        public Bitmap c;
        public boolean d;
        public boolean e;
        public Rect f;
        public Rect g;

        public k() {
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    public static class l extends AsyncTask {
        public final WeakReference a;
        public final WeakReference b;
        public final WeakReference c;
        public Exception d;

        public l(t86 t86Var, rx2 rx2Var, k kVar) {
            this.a = new WeakReference(t86Var);
            this.b = new WeakReference(rx2Var);
            this.c = new WeakReference(kVar);
            kVar.d = true;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) {
            try {
                t86 t86Var = (t86) this.a.get();
                rx2 rx2Var = (rx2) this.b.get();
                k kVar = (k) this.c.get();
                if (rx2Var == null || kVar == null || t86Var == null || !rx2Var.a() || !kVar.e) {
                    if (kVar == null) {
                        return null;
                    }
                    kVar.d = false;
                    return null;
                }
                t86Var.U("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", kVar.a, Integer.valueOf(kVar.b));
                t86Var.S.readLock().lock();
                try {
                    if (!rx2Var.a()) {
                        kVar.d = false;
                        t86Var.S.readLock().unlock();
                        return null;
                    }
                    t86Var.b0(kVar.a, kVar.g);
                    if (t86Var.J != null) {
                        kVar.g.offset(t86Var.J.left, t86Var.J.top);
                    }
                    Bitmap bitmapB = rx2Var.b(kVar.g, kVar.b);
                    t86Var.S.readLock().unlock();
                    return bitmapB;
                } catch (Throwable th) {
                    t86Var.S.readLock().unlock();
                    throw th;
                }
            } catch (Exception e) {
                Log.e(t86.v0, "Failed to decode tile", e);
                this.d = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(t86.v0, "Failed to decode tile - OutOfMemoryError", e2);
                this.d = new RuntimeException(e2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            t86 t86Var = (t86) this.a.get();
            k kVar = (k) this.c.get();
            if (t86Var == null || kVar == null) {
                return;
            }
            if (bitmap != null) {
                kVar.c = bitmap;
                kVar.d = false;
                t86Var.r0();
            } else if (this.d != null) {
                t86.z(t86Var);
            }
        }
    }

    public static class m extends AsyncTask {
        public final WeakReference a;
        public final WeakReference b;
        public final WeakReference c;
        public final Uri d;
        public rx2 e;
        public Exception f;

        public m(t86 t86Var, Context context, se1 se1Var, Uri uri) {
            this.a = new WeakReference(t86Var);
            this.b = new WeakReference(context);
            this.c = new WeakReference(se1Var);
            this.d = uri;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int[] doInBackground(Void... voidArr) {
            try {
                String string = this.d.toString();
                Context context = (Context) this.b.get();
                se1 se1Var = (se1) this.c.get();
                t86 t86Var = (t86) this.a.get();
                if (context == null || se1Var == null || t86Var == null) {
                    return null;
                }
                t86Var.U("TilesInitTask.doInBackground", new Object[0]);
                rx2 rx2Var = (rx2) se1Var.a();
                this.e = rx2Var;
                Point pointD = rx2Var.d(context, this.d);
                int iWidth = pointD.x;
                int iHeight = pointD.y;
                int iE0 = t86Var.e0(context, string);
                if (t86Var.J != null) {
                    t86Var.J.left = Math.max(0, t86Var.J.left);
                    t86Var.J.top = Math.max(0, t86Var.J.top);
                    t86Var.J.right = Math.min(iWidth, t86Var.J.right);
                    t86Var.J.bottom = Math.min(iHeight, t86Var.J.bottom);
                    iWidth = t86Var.J.width();
                    iHeight = t86Var.J.height();
                }
                return new int[]{iWidth, iHeight, iE0};
            } catch (Exception e) {
                Log.e(t86.v0, "Failed to initialise bitmap decoder", e);
                this.f = e;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(int[] iArr) {
            t86 t86Var = (t86) this.a.get();
            if (t86Var != null) {
                rx2 rx2Var = this.e;
                if (rx2Var != null && iArr != null && iArr.length == 3) {
                    t86Var.s0(rx2Var, iArr[0], iArr[1], iArr[2]);
                } else if (this.f != null) {
                    t86.z(t86Var);
                }
            }
        }
    }

    public t86(Context context, AttributeSet attributeSet) {
        int resourceId;
        String string;
        super(context, attributeSet);
        this.f = true;
        this.i = 0;
        this.j = 2.0f;
        this.k = m0();
        this.l = -1;
        this.m = 1;
        this.n = 1;
        this.o = IntCompanionObject.MAX_VALUE;
        this.p = IntCompanionObject.MAX_VALUE;
        this.q = AsyncTask.THREAD_POOL_EXECUTOR;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = 1.0f;
        this.w = 1;
        this.x = 500;
        this.S = new ReentrantReadWriteLock(true);
        this.T = new zs0(SkiaImageDecoder.class);
        this.U = new zs0(SkiaImageRegionDecoder.class);
        this.s0 = new float[8];
        this.t0 = new float[8];
        this.u0 = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.k0 = new Handler(new a());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p15.a);
            int i2 = p15.b;
            if (typedArrayObtainStyledAttributes.hasValue(i2) && (string = typedArrayObtainStyledAttributes.getString(i2)) != null && string.length() > 0) {
                setImage(sx2.a(string).l());
            }
            int i3 = p15.e;
            if (typedArrayObtainStyledAttributes.hasValue(i3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i3, 0)) > 0) {
                setImage(sx2.j(resourceId).l());
            }
            int i4 = p15.c;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                setPanEnabled(typedArrayObtainStyledAttributes.getBoolean(i4, true));
            }
            int i5 = p15.g;
            if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                setZoomEnabled(typedArrayObtainStyledAttributes.getBoolean(i5, true));
            }
            int i6 = p15.d;
            if (typedArrayObtainStyledAttributes.hasValue(i6)) {
                setQuickScaleEnabled(typedArrayObtainStyledAttributes.getBoolean(i6, true));
            }
            int i7 = p15.f;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                setTileBackgroundColor(typedArrayObtainStyledAttributes.getColor(i7, Color.argb(0, 0, 0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.a0 = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return B0;
    }

    private int getRequiredRotation() {
        int i2 = this.i;
        return i2 == -1 ? this.I : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.P = new GestureDetector(context, new b(context));
        this.Q = new GestureDetector(context, new c());
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        B0 = config;
    }

    public static /* synthetic */ h z(t86 t86Var) {
        t86Var.getClass();
        return null;
    }

    public final void A0(yx2 yx2Var) {
        if (yx2Var == null || !w0.contains(Integer.valueOf(yx2Var.b()))) {
            return;
        }
        this.i = yx2Var.b();
        this.D = Float.valueOf(yx2Var.c());
        this.E = yx2Var.a();
        invalidate();
    }

    public final int B0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.G : this.H;
    }

    public final int C0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.H : this.G;
    }

    public final void D0(float f2, PointF pointF, int i2) {
    }

    public final void E0(sx2 sx2Var, sx2 sx2Var2, yx2 yx2Var) {
        if (sx2Var == null) {
            throw new NullPointerException("imageSource must not be null");
        }
        z0(true);
        if (yx2Var != null) {
            A0(yx2Var);
        }
        if (sx2Var2 != null) {
            if (sx2Var.b() != null) {
                throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            }
            if (sx2Var.f() <= 0 || sx2Var.d() <= 0) {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            }
            this.G = sx2Var.f();
            this.H = sx2Var.d();
            this.K = sx2Var2.e();
            if (sx2Var2.b() != null) {
                this.c = sx2Var2.i();
                p0(sx2Var2.b());
            } else {
                Uri uriH = sx2Var2.h();
                if (uriH == null && sx2Var2.c() != null) {
                    uriH = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + sx2Var2.c());
                }
                a0(new f(this, getContext(), this.T, uriH, true));
            }
        }
        if (sx2Var.b() != null && sx2Var.e() != null) {
            o0(Bitmap.createBitmap(sx2Var.b(), sx2Var.e().left, sx2Var.e().top, sx2Var.e().width(), sx2Var.e().height()), 0, false);
            return;
        }
        if (sx2Var.b() != null) {
            o0(sx2Var.b(), 0, sx2Var.i());
            return;
        }
        this.J = sx2Var.e();
        Uri uriH2 = sx2Var.h();
        this.d = uriH2;
        if (uriH2 == null && sx2Var.c() != null) {
            this.d = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + sx2Var.c());
        }
        if (sx2Var.g() || this.J != null) {
            a0(new m(this, getContext(), this.U, this.d));
        } else {
            a0(new f(this, getContext(), this.T, this.d, false));
        }
    }

    public final void F0(float[] fArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
    }

    public final void G0(float f2, PointF pointF) {
        this.g0 = null;
        this.D = Float.valueOf(f2);
        this.E = pointF;
        this.F = pointF;
        invalidate();
    }

    public final PointF H0(float f2, float f3, PointF pointF) {
        if (this.A == null) {
            return null;
        }
        pointF.set(K0(f2), L0(f3));
        return pointF;
    }

    public final PointF I0(PointF pointF) {
        return H0(pointF.x, pointF.y, new PointF());
    }

    public final void J0(Rect rect, Rect rect2) {
        rect2.set((int) K0(rect.left), (int) L0(rect.top), (int) K0(rect.right), (int) L0(rect.bottom));
    }

    public final float K0(float f2) {
        PointF pointF = this.A;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 * this.y) + pointF.x;
    }

    public final float L0(float f2) {
        PointF pointF = this.A;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 * this.y) + pointF.y;
    }

    public final boolean M0(k kVar) {
        return R0(0.0f) <= ((float) kVar.a.right) && ((float) kVar.a.left) <= R0((float) getWidth()) && S0(0.0f) <= ((float) kVar.a.bottom) && ((float) kVar.a.top) <= S0((float) getHeight());
    }

    public final PointF N0(float f2, float f3, float f4) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.p0 == null) {
            this.p0 = new j(0.0f, new PointF(0.0f, 0.0f), null);
        }
        this.p0.a = f4;
        this.p0.b.set(paddingLeft - (f2 * f4), paddingTop - (f3 * f4));
        d0(true, this.p0);
        return this.p0.b;
    }

    public final PointF O0(float f2, float f3) {
        return P0(f2, f3, new PointF());
    }

    public final PointF P0(float f2, float f3, PointF pointF) {
        if (this.A == null) {
            return null;
        }
        pointF.set(R0(f2), S0(f3));
        return pointF;
    }

    public final int Q(float f2) {
        int iRound;
        if (this.l > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f2 *= this.l / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int iC0 = (int) (C0() * f2);
        int iB0 = (int) (B0() * f2);
        if (iC0 == 0 || iB0 == 0) {
            return 32;
        }
        int i2 = 1;
        if (B0() > iB0 || C0() > iC0) {
            iRound = Math.round(B0() / iB0);
            int iRound2 = Math.round(C0() / iC0);
            if (iRound >= iRound2) {
                iRound = iRound2;
            }
        } else {
            iRound = 1;
        }
        while (true) {
            int i3 = i2 * 2;
            if (i3 >= iRound) {
                return i2;
            }
            i2 = i3;
        }
    }

    public final PointF Q0(PointF pointF) {
        return P0(pointF.x, pointF.y, new PointF());
    }

    public final boolean R() {
        boolean zI0 = i0();
        if (!this.i0 && zI0) {
            u0();
            this.i0 = true;
            n0();
        }
        return zI0;
    }

    public final float R0(float f2) {
        PointF pointF = this.A;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 - pointF.x) / this.y;
    }

    public final boolean S() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.G > 0 && this.H > 0 && (this.a != null || i0());
        if (!this.h0 && z) {
            u0();
            this.h0 = true;
            q0();
        }
        return z;
    }

    public final float S0(float f2) {
        PointF pointF = this.A;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 - pointF.y) / this.y;
    }

    public final void T() {
        if (this.l0 == null) {
            Paint paint = new Paint();
            this.l0 = paint;
            paint.setAntiAlias(true);
            this.l0.setFilterBitmap(true);
            this.l0.setDither(true);
        }
        if ((this.m0 == null || this.n0 == null) && this.h) {
            Paint paint2 = new Paint();
            this.m0 = paint2;
            paint2.setTextSize(v0(12));
            this.m0.setColor(-65281);
            this.m0.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.n0 = paint3;
            paint3.setColor(-65281);
            this.n0.setStyle(Paint.Style.STROKE);
            this.n0.setStrokeWidth(v0(1));
        }
    }

    public final void U(String str, Object... objArr) {
        if (this.h) {
            Log.d(v0, String.format(str, objArr));
        }
    }

    public final float V(float f2, float f3, float f4, float f5) {
        float f6 = f2 - f3;
        float f7 = f4 - f5;
        return (float) Math.sqrt((f6 * f6) + (f7 * f7));
    }

    public final void W(PointF pointF, PointF pointF2) {
        if (!this.s) {
            PointF pointF3 = this.F;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = C0() / 2;
                pointF.y = B0() / 2;
            }
        }
        float fMin = Math.min(this.j, this.v);
        float f2 = this.y;
        boolean z = ((double) f2) <= ((double) fMin) * 0.9d || f2 == this.k;
        if (!z) {
            fMin = m0();
        }
        float f3 = fMin;
        int i2 = this.w;
        if (i2 == 3) {
            G0(f3, pointF);
        } else if (i2 == 2 || !z || !this.s) {
            new e(this, f3, pointF, (a) null).f(false).d(this.x).g(4).c();
        } else if (i2 == 1) {
            new e(this, f3, pointF, pointF2, null).f(false).d(this.x).g(4).c();
        }
        invalidate();
    }

    public final float X(int i2, long j2, float f2, float f3, long j3) {
        if (i2 == 1) {
            return Z(j2, f2, f3, j3);
        }
        if (i2 == 2) {
            return Y(j2, f2, f3, j3);
        }
        throw new IllegalStateException("Unexpected easing type: " + i2);
    }

    public final float Y(long j2, float f2, float f3, long j3) {
        float f4;
        float f5 = j2 / (j3 / 2.0f);
        if (f5 < 1.0f) {
            f4 = (f3 / 2.0f) * f5;
        } else {
            float f6 = f5 - 1.0f;
            f4 = (-f3) / 2.0f;
            f5 = (f6 * (f6 - 2.0f)) - 1.0f;
        }
        return (f4 * f5) + f2;
    }

    public final float Z(long j2, float f2, float f3, long j3) {
        float f4 = j2 / j3;
        return ((-f3) * f4 * (f4 - 2.0f)) + f2;
    }

    public final void a0(AsyncTask asyncTask) {
        asyncTask.executeOnExecutor(this.q, new Void[0]);
    }

    public final void b0(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (getRequiredRotation() == 90) {
            int i2 = rect.top;
            int i3 = this.H;
            rect2.set(i2, i3 - rect.right, rect.bottom, i3 - rect.left);
        } else if (getRequiredRotation() != 180) {
            int i4 = this.G;
            rect2.set(i4 - rect.bottom, rect.left, i4 - rect.top, rect.right);
        } else {
            int i5 = this.G;
            int i6 = i5 - rect.right;
            int i7 = this.H;
            rect2.set(i6, i7 - rect.bottom, i5 - rect.left, i7 - rect.top);
        }
    }

    public final void c0(boolean z) {
        boolean z2;
        float f2 = 0.0f;
        if (this.A == null) {
            this.A = new PointF(0.0f, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.p0 == null) {
            this.p0 = new j(f2, new PointF(0.0f, 0.0f), null);
        }
        this.p0.a = this.y;
        this.p0.b.set(this.A);
        d0(z, this.p0);
        this.y = this.p0.a;
        this.A.set(this.p0.b);
        if (!z2 || this.n == 4) {
            return;
        }
        this.A.set(N0(C0() / 2, B0() / 2, this.y));
    }

    public final void d0(boolean z, j jVar) {
        float fMax;
        int iMax;
        float fMax2;
        if (this.m == 2 && j0()) {
            z = false;
        }
        PointF pointF = jVar.b;
        float fL0 = l0(jVar.a);
        float fC0 = C0() * fL0;
        float fB0 = B0() * fL0;
        if (this.m == 3 && j0()) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - fC0);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - fB0);
        } else if (z) {
            pointF.x = Math.max(pointF.x, getWidth() - fC0);
            pointF.y = Math.max(pointF.y, getHeight() - fB0);
        } else {
            pointF.x = Math.max(pointF.x, -fC0);
            pointF.y = Math.max(pointF.y, -fB0);
        }
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? getPaddingLeft() / (getPaddingLeft() + getPaddingRight()) : 0.5f;
        float paddingTop = (getPaddingTop() > 0 || getPaddingBottom() > 0) ? getPaddingTop() / (getPaddingTop() + getPaddingBottom()) : 0.5f;
        if (this.m == 3 && j0()) {
            fMax = Math.max(0, getWidth() / 2);
            iMax = Math.max(0, getHeight() / 2);
        } else {
            if (z) {
                fMax = Math.max(0.0f, (getWidth() - fC0) * paddingLeft);
                fMax2 = Math.max(0.0f, (getHeight() - fB0) * paddingTop);
                pointF.x = Math.min(pointF.x, fMax);
                pointF.y = Math.min(pointF.y, fMax2);
                jVar.a = fL0;
            }
            fMax = Math.max(0, getWidth());
            iMax = Math.max(0, getHeight());
        }
        fMax2 = iMax;
        pointF.x = Math.min(pointF.x, fMax);
        pointF.y = Math.min(pointF.y, fMax2);
        jVar.a = fL0;
    }

    public final int e0(Context context, String str) {
        int i2 = 0;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    int i3 = cursorQuery.getInt(0);
                    if (!w0.contains(Integer.valueOf(i3)) || i3 == -1) {
                        Log.w(v0, "Unsupported orientation: " + i3);
                    } else {
                        i2 = i3;
                    }
                }
            } catch (Exception unused) {
                Log.w(v0, "Could not get orientation of image from media store");
                if (cursorQuery != null) {
                }
            }
            return i2;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final Point f0(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.o), Math.min(canvas.getMaximumBitmapHeight(), this.p));
    }

    public final synchronized void g0(Point point) {
        try {
            U("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
            j jVar = new j(0.0f, new PointF(0.0f, 0.0f), null);
            this.p0 = jVar;
            d0(true, jVar);
            int iQ = Q(this.p0.a);
            this.e = iQ;
            if (iQ > 1) {
                this.e = iQ / 2;
            }
            if (this.e != 1 || this.J != null || C0() >= point.x || B0() >= point.y) {
                h0(point);
                List list = (List) this.g.get(Integer.valueOf(this.e));
                if (this.f) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a0(new l(this, this.R, (k) it.next()));
                    }
                    x0(true);
                } else {
                    a0(new l(this, this.R, (k) list.get(0)));
                }
            } else {
                this.R.c();
                this.R = null;
                a0(new f(this, getContext(), this.T, this.d, false));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        return O0(getWidth() / 2, getHeight() / 2);
    }

    public float getMaxScale() {
        return this.j;
    }

    public final float getMinScale() {
        return m0();
    }

    public final int getOrientation() {
        return this.i;
    }

    public final int getSHeight() {
        return this.H;
    }

    public final int getSWidth() {
        return this.G;
    }

    public final float getScale() {
        return this.y;
    }

    public final yx2 getState() {
        if (this.A == null || this.G <= 0 || this.H <= 0) {
            return null;
        }
        return new yx2(getScale(), getCenter(), getOrientation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0(Point point) {
        U("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.g = new LinkedHashMap();
        int i2 = this.e;
        int i3 = 1;
        int i4 = 1;
        int i5 = 1;
        while (true) {
            int iC0 = C0() / i4;
            int iB0 = B0() / i5;
            int i6 = iC0 / i2;
            int i7 = iB0 / i2;
            while (true) {
                if (i6 + i4 + i3 <= point.x && (i6 <= ((double) getWidth()) * 1.25d || i2 >= this.e)) {
                    break;
                }
                i4++;
                iC0 = C0() / i4;
                i6 = iC0 / i2;
            }
            while (true) {
                if (i7 + i5 + i3 <= point.y && (i7 <= ((double) getHeight()) * 1.25d || i2 >= this.e)) {
                    break;
                }
                i5++;
                iB0 = B0() / i5;
                i7 = iB0 / i2;
            }
            ArrayList arrayList = new ArrayList(i4 * i5);
            int i8 = 0;
            while (i8 < i4) {
                int i9 = 0;
                while (i9 < i5) {
                    k kVar = new k(null);
                    kVar.b = i2;
                    kVar.e = i2 == this.e ? i3 : 0;
                    kVar.a = new Rect(i8 * iC0, i9 * iB0, i8 == i4 + (-1) ? C0() : (i8 + 1) * iC0, i9 == i5 + (-1) ? B0() : (i9 + 1) * iB0);
                    kVar.f = new Rect(0, 0, 0, 0);
                    kVar.g = new Rect(kVar.a);
                    arrayList.add(kVar);
                    i9++;
                    i3 = 1;
                }
                i8++;
                i3 = 1;
            }
            this.g.put(Integer.valueOf(i2), arrayList);
            i3 = 1;
            if (i2 == 1) {
                return;
            } else {
                i2 /= 2;
            }
        }
    }

    public final boolean i0() {
        boolean z = true;
        if (!this.f || (this.a != null && !this.b)) {
            return true;
        }
        Map map = this.g;
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == this.e) {
                for (k kVar : (List) entry.getValue()) {
                    if (kVar.d || kVar.c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public final boolean j0() {
        return this.h0;
    }

    public final PointF k0(float f2, float f3, float f4, PointF pointF) {
        PointF pointFN0 = N0(f2, f3, f4);
        pointF.set(((getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2)) - pointFN0.x) / f4, ((getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2)) - pointFN0.y) / f4);
        return pointF;
    }

    public final float l0(float f2) {
        return Math.min(this.j, Math.max(m0(), f2));
    }

    public final float m0() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i2 = this.n;
        if (i2 == 2 || i2 == 4) {
            return Math.max((getWidth() - paddingLeft) / C0(), (getHeight() - paddingBottom) / B0());
        }
        if (i2 == 3) {
            float f2 = this.k;
            if (f2 > 0.0f) {
                return f2;
            }
        }
        return Math.min((getWidth() - paddingLeft) / C0(), (getHeight() - paddingBottom) / B0());
    }

    public void n0() {
    }

    public final synchronized void o0(Bitmap bitmap, int i2, boolean z) {
        try {
            U("onImageLoaded", new Object[0]);
            int i3 = this.G;
            if (i3 > 0 && this.H > 0 && (i3 != bitmap.getWidth() || this.H != bitmap.getHeight())) {
                z0(false);
            }
            Bitmap bitmap2 = this.a;
            if (bitmap2 != null && !this.c) {
                bitmap2.recycle();
            }
            this.b = false;
            this.c = z;
            this.a = bitmap;
            this.G = bitmap.getWidth();
            this.H = bitmap.getHeight();
            this.I = i2;
            boolean zS = S();
            boolean zR = R();
            if (zS || zR) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float height;
        int i3;
        int i4;
        int i5;
        int i6;
        super.onDraw(canvas);
        T();
        if (this.G == 0 || this.H == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.g == null && this.R != null) {
            g0(f0(canvas));
        }
        if (S()) {
            u0();
            d dVar = this.g0;
            if (dVar != null && dVar.f != null) {
                float f2 = this.y;
                if (this.C == null) {
                    this.C = new PointF(0.0f, 0.0f);
                }
                this.C.set(this.A);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.g0.l;
                boolean z = jCurrentTimeMillis > this.g0.h;
                long jMin = Math.min(jCurrentTimeMillis, this.g0.h);
                this.y = X(this.g0.j, jMin, this.g0.a, this.g0.b - this.g0.a, this.g0.h);
                float fX = X(this.g0.j, jMin, this.g0.f.x, this.g0.g.x - this.g0.f.x, this.g0.h);
                float fX2 = X(this.g0.j, jMin, this.g0.f.y, this.g0.g.y - this.g0.f.y, this.g0.h);
                this.A.x -= K0(this.g0.d.x) - fX;
                this.A.y -= L0(this.g0.d.y) - fX2;
                c0(z || this.g0.a == this.g0.b);
                D0(f2, this.C, this.g0.k);
                x0(z);
                if (z) {
                    d.c(this.g0);
                    this.g0 = null;
                }
                invalidate();
            }
            int i7 = 180;
            int i8 = 90;
            if (this.g == null || !i0()) {
                i2 = 5;
                if (this.a != null) {
                    float width = this.y;
                    if (this.b) {
                        width *= this.G / r1.getWidth();
                        height = this.y * (this.H / this.a.getHeight());
                    } else {
                        height = width;
                    }
                    if (this.q0 == null) {
                        this.q0 = new Matrix();
                    }
                    this.q0.reset();
                    this.q0.postScale(width, height);
                    this.q0.postRotate(getRequiredRotation());
                    Matrix matrix = this.q0;
                    PointF pointF = this.A;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.q0;
                        float f3 = this.y;
                        matrix2.postTranslate(this.G * f3, f3 * this.H);
                    } else if (getRequiredRotation() == 90) {
                        this.q0.postTranslate(this.y * this.H, 0.0f);
                    } else if (getRequiredRotation() == 270) {
                        this.q0.postTranslate(0.0f, this.y * this.G);
                    }
                    if (this.o0 != null) {
                        if (this.r0 == null) {
                            this.r0 = new RectF();
                        }
                        this.r0.set(0.0f, 0.0f, this.b ? this.a.getWidth() : this.G, this.b ? this.a.getHeight() : this.H);
                        this.q0.mapRect(this.r0);
                        canvas.drawRect(this.r0, this.o0);
                    }
                    canvas.drawBitmap(this.a, this.q0, this.l0);
                }
            } else {
                int iMin = Math.min(this.e, Q(this.y));
                boolean z2 = false;
                for (Map.Entry entry : this.g.entrySet()) {
                    if (((Integer) entry.getKey()).intValue() == iMin) {
                        for (k kVar : (List) entry.getValue()) {
                            if (kVar.e && (kVar.d || kVar.c == null)) {
                                z2 = true;
                            }
                        }
                    }
                }
                for (Map.Entry entry2 : this.g.entrySet()) {
                    if (((Integer) entry2.getKey()).intValue() == iMin || z2) {
                        for (k kVar2 : (List) entry2.getValue()) {
                            J0(kVar2.a, kVar2.f);
                            if (kVar2.d || kVar2.c == null) {
                                i3 = i8;
                                i4 = i7;
                                i5 = iMin;
                                i6 = 5;
                                if (kVar2.d && this.h) {
                                    canvas.drawText("LOADING", kVar2.f.left + v0(5), kVar2.f.top + v0(35), this.m0);
                                }
                            } else {
                                if (this.o0 != null) {
                                    canvas.drawRect(kVar2.f, this.o0);
                                }
                                if (this.q0 == null) {
                                    this.q0 = new Matrix();
                                }
                                this.q0.reset();
                                i5 = iMin;
                                i6 = 5;
                                i3 = i8;
                                i4 = i7;
                                F0(this.s0, 0.0f, 0.0f, kVar2.c.getWidth(), 0.0f, kVar2.c.getWidth(), kVar2.c.getHeight(), 0.0f, kVar2.c.getHeight());
                                if (getRequiredRotation() == 0) {
                                    F0(this.t0, kVar2.f.left, kVar2.f.top, kVar2.f.right, kVar2.f.top, kVar2.f.right, kVar2.f.bottom, kVar2.f.left, kVar2.f.bottom);
                                } else if (getRequiredRotation() == i3) {
                                    F0(this.t0, kVar2.f.right, kVar2.f.top, kVar2.f.right, kVar2.f.bottom, kVar2.f.left, kVar2.f.bottom, kVar2.f.left, kVar2.f.top);
                                } else if (getRequiredRotation() == i4) {
                                    F0(this.t0, kVar2.f.right, kVar2.f.bottom, kVar2.f.left, kVar2.f.bottom, kVar2.f.left, kVar2.f.top, kVar2.f.right, kVar2.f.top);
                                } else if (getRequiredRotation() == 270) {
                                    F0(this.t0, kVar2.f.left, kVar2.f.bottom, kVar2.f.left, kVar2.f.top, kVar2.f.right, kVar2.f.top, kVar2.f.right, kVar2.f.bottom);
                                }
                                this.q0.setPolyToPoly(this.s0, 0, this.t0, 0, 4);
                                canvas.drawBitmap(kVar2.c, this.q0, this.l0);
                                if (this.h) {
                                    canvas.drawRect(kVar2.f, this.n0);
                                }
                            }
                            if (kVar2.e && this.h) {
                                canvas.drawText("ISS " + kVar2.b + " RECT " + kVar2.a.top + "," + kVar2.a.left + "," + kVar2.a.bottom + "," + kVar2.a.right, kVar2.f.left + v0(i6), kVar2.f.top + v0(15), this.m0);
                            }
                            i8 = i3;
                            i7 = i4;
                            iMin = i5;
                        }
                    }
                    i8 = i8;
                    i7 = i7;
                    iMin = iMin;
                }
                i2 = 5;
            }
            if (this.h) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scale: ");
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "%.2f", Float.valueOf(this.y)));
                sb.append(" (");
                sb.append(String.format(locale, "%.2f", Float.valueOf(m0())));
                sb.append(" - ");
                sb.append(String.format(locale, "%.2f", Float.valueOf(this.j)));
                sb.append(")");
                canvas.drawText(sb.toString(), v0(i2), v0(15), this.m0);
                canvas.drawText("Translate: " + String.format(locale, "%.2f", Float.valueOf(this.A.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(this.A.y)), v0(i2), v0(30), this.m0);
                PointF center = getCenter();
                canvas.drawText("Source center: " + String.format(locale, "%.2f", Float.valueOf(center.x)) + ":" + String.format(locale, "%.2f", Float.valueOf(center.y)), v0(i2), v0(45), this.m0);
                d dVar2 = this.g0;
                if (dVar2 != null) {
                    PointF pointFI0 = I0(dVar2.c);
                    PointF pointFI02 = I0(this.g0.e);
                    PointF pointFI03 = I0(this.g0.d);
                    canvas.drawCircle(pointFI0.x, pointFI0.y, v0(10), this.n0);
                    this.n0.setColor(-65536);
                    canvas.drawCircle(pointFI02.x, pointFI02.y, v0(20), this.n0);
                    this.n0.setColor(-16776961);
                    canvas.drawCircle(pointFI03.x, pointFI03.y, v0(25), this.n0);
                    this.n0.setColor(-16711681);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, v0(30), this.n0);
                }
                if (this.V != null) {
                    this.n0.setColor(-65536);
                    PointF pointF2 = this.V;
                    canvas.drawCircle(pointF2.x, pointF2.y, v0(20), this.n0);
                }
                if (this.e0 != null) {
                    this.n0.setColor(-16776961);
                    canvas.drawCircle(K0(this.e0.x), L0(this.e0.y), v0(35), this.n0);
                }
                if (this.f0 != null && this.N) {
                    this.n0.setColor(-16711681);
                    PointF pointF3 = this.f0;
                    canvas.drawCircle(pointF3.x, pointF3.y, v0(30), this.n0);
                }
                this.n0.setColor(-65281);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        boolean z = mode != 1073741824;
        boolean z2 = mode2 != 1073741824;
        if (this.G > 0 && this.H > 0) {
            if (z && z2) {
                size = C0();
                size2 = B0();
            } else if (z2) {
                size2 = (int) ((((double) B0()) / ((double) C0())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) C0()) / ((double) B0())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        U("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i3));
        PointF center = getCenter();
        if (!this.h0 || center == null) {
            return;
        }
        this.g0 = null;
        this.D = Float.valueOf(this.y);
        this.E = center;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        d dVar = this.g0;
        if (dVar != null && !dVar.i) {
            y0(true);
            return true;
        }
        d dVar2 = this.g0;
        if (dVar2 != null) {
            d.c(dVar2);
        }
        this.g0 = null;
        if (this.A == null) {
            GestureDetector gestureDetector2 = this.Q;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
            }
            return true;
        }
        if (!this.N && ((gestureDetector = this.P) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.L = false;
            this.M = false;
            this.O = 0;
            return true;
        }
        if (this.B == null) {
            this.B = new PointF(0.0f, 0.0f);
        }
        if (this.C == null) {
            this.C = new PointF(0.0f, 0.0f);
        }
        if (this.V == null) {
            this.V = new PointF(0.0f, 0.0f);
        }
        float f2 = this.y;
        this.C.set(this.A);
        boolean zT0 = t0(motionEvent);
        D0(f2, this.C, 2);
        return zT0 || super.onTouchEvent(motionEvent);
    }

    public final synchronized void p0(Bitmap bitmap) {
        try {
            U("onPreviewLoaded", new Object[0]);
            if (this.a == null && !this.i0) {
                Rect rect = this.K;
                if (rect != null) {
                    this.a = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.K.height());
                } else {
                    this.a = bitmap;
                }
                this.b = true;
                if (S()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void q0() {
    }

    public final synchronized void r0() {
        Bitmap bitmap;
        try {
            U("onTileLoaded", new Object[0]);
            S();
            R();
            if (i0() && (bitmap = this.a) != null) {
                if (!this.c) {
                    bitmap.recycle();
                }
                this.a = null;
                this.b = false;
                this.c = false;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void s0(rx2 rx2Var, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        try {
            U("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(this.i));
            int i8 = this.G;
            if (i8 > 0 && (i7 = this.H) > 0 && (i8 != i2 || i7 != i3)) {
                z0(false);
                Bitmap bitmap = this.a;
                if (bitmap != null) {
                    if (!this.c) {
                        bitmap.recycle();
                    }
                    this.a = null;
                    this.b = false;
                    this.c = false;
                }
            }
            this.R = rx2Var;
            this.G = i2;
            this.H = i3;
            this.I = i4;
            S();
            if (!R() && (i5 = this.o) > 0 && i5 != Integer.MAX_VALUE && (i6 = this.p) > 0 && i6 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
                g0(new Point(this.o, this.p));
            }
            invalidate();
            requestLayout();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setBitmapDecoderClass(Class<? extends ix2> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.T = new zs0(cls);
    }

    public final void setBitmapDecoderFactory(se1 se1Var) {
        if (se1Var == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.T = se1Var;
    }

    public final void setDebug(boolean z) {
        this.h = z;
    }

    public final void setDoubleTapZoomDpi(int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i2);
    }

    public final void setDoubleTapZoomDuration(int i2) {
        this.x = Math.max(0, i2);
    }

    public final void setDoubleTapZoomScale(float f2) {
        this.v = f2;
    }

    public final void setDoubleTapZoomStyle(int i2) {
        if (x0.contains(Integer.valueOf(i2))) {
            this.w = i2;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i2);
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.r = z;
    }

    public void setExecutor(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        this.q = executor;
    }

    public final void setHasBaseLayerTiles(boolean z) {
        this.f = z;
    }

    public final void setImage(sx2 sx2Var) {
        E0(sx2Var, null, null);
    }

    public final void setMaxScale(float f2) {
        this.j = f2;
    }

    public void setMaxTileSize(int i2) {
        this.o = i2;
        this.p = i2;
    }

    public final void setMaximumDpi(int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i2);
    }

    public final void setMinScale(float f2) {
        this.k = f2;
    }

    public final void setMinimumDpi(int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i2);
    }

    public final void setMinimumScaleType(int i2) {
        if (!A0.contains(Integer.valueOf(i2))) {
            throw new IllegalArgumentException("Invalid scale type: " + i2);
        }
        this.n = i2;
        if (j0()) {
            c0(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.l = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i2);
        if (j0()) {
            z0(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(h hVar) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.j0 = onLongClickListener;
    }

    public void setOnStateChangedListener(i iVar) {
    }

    public final void setOrientation(int i2) {
        if (!w0.contains(Integer.valueOf(i2))) {
            throw new IllegalArgumentException("Invalid orientation: " + i2);
        }
        this.i = i2;
        z0(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.s = z;
        if (z || (pointF = this.A) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.y * (C0() / 2));
        this.A.y = (getHeight() / 2) - (this.y * (B0() / 2));
        if (j0()) {
            x0(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i2) {
        if (!z0.contains(Integer.valueOf(i2))) {
            throw new IllegalArgumentException("Invalid pan limit: " + i2);
        }
        this.m = i2;
        if (j0()) {
            c0(true);
            invalidate();
        }
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.u = z;
    }

    public final void setRegionDecoderClass(Class<? extends rx2> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.U = new zs0(cls);
    }

    public final void setRegionDecoderFactory(se1 se1Var) {
        if (se1Var == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.U = se1Var;
    }

    public final void setTileBackgroundColor(int i2) {
        if (Color.alpha(i2) == 0) {
            this.o0 = null;
        } else {
            Paint paint = new Paint();
            this.o0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.o0.setColor(i2);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.t = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r1 != 262) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t0(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.t86.t0(android.view.MotionEvent):boolean");
    }

    public final void u0() {
        Float f2;
        if (getWidth() == 0 || getHeight() == 0 || this.G <= 0 || this.H <= 0) {
            return;
        }
        if (this.E != null && (f2 = this.D) != null) {
            this.y = f2.floatValue();
            if (this.A == null) {
                this.A = new PointF();
            }
            this.A.x = (getWidth() / 2) - (this.y * this.E.x);
            this.A.y = (getHeight() / 2) - (this.y * this.E.y);
            this.E = null;
            this.D = null;
            c0(true);
            x0(true);
        }
        c0(false);
    }

    public final int v0(int i2) {
        return (int) (this.u0 * i2);
    }

    public void w0() {
        z0(true);
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
    }

    public final void x0(boolean z) {
        if (this.R == null || this.g == null) {
            return;
        }
        int iMin = Math.min(this.e, Q(this.y));
        Iterator it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            for (k kVar : (List) ((Map.Entry) it.next()).getValue()) {
                if (kVar.b < iMin || (kVar.b > iMin && kVar.b != this.e)) {
                    kVar.e = false;
                    if (kVar.c != null) {
                        kVar.c.recycle();
                        kVar.c = null;
                    }
                }
                if (kVar.b == iMin) {
                    if (M0(kVar)) {
                        kVar.e = true;
                        if (!kVar.d && kVar.c == null && z) {
                            a0(new l(this, this.R, kVar));
                        }
                    } else if (kVar.b != this.e || !this.f) {
                        kVar.e = false;
                        if (kVar.c != null) {
                            kVar.c.recycle();
                            kVar.c = null;
                        }
                    }
                } else if (kVar.b == this.e) {
                    kVar.e = true;
                }
            }
        }
    }

    public final void y0(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void z0(boolean z) {
        U("reset newImage=" + z, new Object[0]);
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = Float.valueOf(0.0f);
        this.E = null;
        this.F = null;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = 0;
        this.e = 0;
        this.V = null;
        this.W = 0.0f;
        this.b0 = 0.0f;
        this.c0 = false;
        this.e0 = null;
        this.d0 = null;
        this.f0 = null;
        this.g0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        if (z) {
            this.d = null;
            this.S.writeLock().lock();
            try {
                rx2 rx2Var = this.R;
                if (rx2Var != null) {
                    rx2Var.c();
                    this.R = null;
                }
                this.S.writeLock().unlock();
                Bitmap bitmap = this.a;
                if (bitmap != null && !this.c) {
                    bitmap.recycle();
                }
                this.G = 0;
                this.H = 0;
                this.I = 0;
                this.J = null;
                this.K = null;
                this.h0 = false;
                this.i0 = false;
                this.a = null;
                this.b = false;
                this.c = false;
            } catch (Throwable th) {
                this.S.writeLock().unlock();
                throw th;
            }
        }
        Map map = this.g;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (k kVar : (List) ((Map.Entry) it.next()).getValue()) {
                    kVar.e = false;
                    if (kVar.c != null) {
                        kVar.c.recycle();
                        kVar.c = null;
                    }
                }
            }
            this.g = null;
        }
        setGestureDetector(getContext());
    }

    public static class d {
        public float a;
        public float b;
        public PointF c;
        public PointF d;
        public PointF e;
        public PointF f;
        public PointF g;
        public long h;
        public boolean i;
        public int j;
        public int k;
        public long l;

        public d() {
            this.h = 500L;
            this.i = true;
            this.j = 2;
            this.k = 1;
            this.l = System.currentTimeMillis();
        }

        public static /* synthetic */ g c(d dVar) {
            dVar.getClass();
            return null;
        }

        public static /* synthetic */ g d(d dVar, g gVar) {
            dVar.getClass();
            return gVar;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
