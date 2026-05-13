package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.zepto.e06;
import com.zepto.f06;
import com.zepto.g06;
import java.util.BitSet;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class wq3 extends Drawable implements h06 {
    public static final String x = "wq3";
    public static final Paint y;
    public c a;
    public final g06.g[] b;
    public final g06.g[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public e06 m;
    public final Paint n;
    public final Paint o;
    public final b06 p;
    public final f06.b q;
    public final f06 r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public int u;
    public final RectF v;
    public boolean w;

    public class a implements f06.b {
        public a() {
        }

        @Override // com.zepto.f06.b
        public void a(g06 g06Var, Matrix matrix, int i) {
            wq3.this.d.set(i, g06Var.e());
            wq3.this.b[i] = g06Var.f(matrix);
        }

        @Override // com.zepto.f06.b
        public void b(g06 g06Var, Matrix matrix, int i) {
            wq3.this.d.set(i + 4, g06Var.e());
            wq3.this.c[i] = g06Var.f(matrix);
        }
    }

    public class b implements e06.c {
        public final /* synthetic */ float a;

        public b(float f) {
            this.a = f;
        }

        @Override // com.zepto.e06.c
        public oz0 a(oz0 oz0Var) {
            return oz0Var instanceof c85 ? oz0Var : new nl(this.a, oz0Var);
        }
    }

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public wq3() {
        this(new e06());
    }

    public static int R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public static wq3 m(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(sq3.c(context, xy4.m, wq3.class.getSimpleName()));
        }
        wq3 wq3Var = new wq3();
        wq3Var.M(context);
        wq3Var.W(colorStateList);
        wq3Var.V(f);
        return wq3Var;
    }

    public int A() {
        return this.u;
    }

    public int B() {
        return (int) (((double) this.a.s) * Math.sin(Math.toRadians(r0.t)));
    }

    public int C() {
        return (int) (((double) this.a.s) * Math.cos(Math.toRadians(r0.t)));
    }

    public e06 D() {
        return this.a.a;
    }

    public final float E() {
        if (L()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float F() {
        return this.a.a.r().a(u());
    }

    public float G() {
        return this.a.a.t().a(u());
    }

    public float H() {
        return this.a.p;
    }

    public float I() {
        return w() + H();
    }

    public final boolean J() {
        c cVar = this.a;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || T());
    }

    public final boolean K() {
        Paint.Style style = this.a.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean L() {
        Paint.Style style = this.a.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    public void M(Context context) {
        this.a.b = new c12(context);
        i0();
    }

    public final void N() {
        super.invalidateSelf();
    }

    public boolean O() {
        c12 c12Var = this.a.b;
        return c12Var != null && c12Var.d();
    }

    public boolean P() {
        return this.a.a.u(u());
    }

    public final void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (!this.w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.v.width() - getBounds().width());
            int iHeight = (int) (this.v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.a.r * 2) + iWidth, ((int) this.v.height()) + (this.a.r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f = (getBounds().left - this.a.r) - iWidth;
            float f2 = (getBounds().top - this.a.r) - iHeight;
            canvas2.translate(-f, -f2);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void S(Canvas canvas) {
        canvas.translate(B(), C());
    }

    public boolean T() {
        return (P() || this.g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void U(oz0 oz0Var) {
        setShapeAppearanceModel(this.a.a.x(oz0Var));
    }

    public void V(float f) {
        c cVar = this.a;
        if (cVar.o != f) {
            cVar.o = f;
            i0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f) {
        c cVar = this.a;
        if (cVar.k != f) {
            cVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public void Y(int i, int i2, int i3, int i4) {
        c cVar = this.a;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.a.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void Z(float f) {
        c cVar = this.a;
        if (cVar.n != f) {
            cVar.n = f;
            i0();
        }
    }

    public void a0(boolean z) {
        this.w = z;
    }

    public void b0(int i) {
        this.p.d(i);
        this.a.u = false;
        N();
    }

    public void c0(float f, int i) {
        f0(f);
        e0(ColorStateList.valueOf(i));
    }

    public void d0(float f, ColorStateList colorStateList) {
        f0(f);
        e0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.n.setColorFilter(this.s);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(R(alpha, this.a.m));
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.a.l);
        int alpha2 = this.o.getAlpha();
        this.o.setAlpha(R(alpha2, this.a.m));
        if (this.e) {
            i();
            g(u(), this.g);
            this.e = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.n.setAlpha(alpha);
        this.o.setAlpha(alpha2);
    }

    public void e0(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void f0(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.a.j != 1.0f) {
            this.f.reset();
            Matrix matrix = this.f;
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f);
        }
        path.computeBounds(this.v, true);
    }

    public final boolean g0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.a.d == null || color2 == (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.o.getColor())))) {
            return z;
        }
        this.o.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.a.q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.a.k);
        } else {
            g(u(), this.g);
            yw1.i(outline, this.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.k.set(getBounds());
        g(u(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public final void h(RectF rectF, Path path) {
        f06 f06Var = this.r;
        c cVar = this.a;
        f06Var.e(cVar.a, cVar.k, rectF, this.q, path);
    }

    public final boolean h0() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        c cVar = this.a;
        this.s = k(cVar.g, cVar.h, this.n, true);
        c cVar2 = this.a;
        this.t = k(cVar2.f, cVar2.h, this.o, false);
        c cVar3 = this.a;
        if (cVar3.u) {
            this.p.d(cVar3.g.getColorForState(getState(), 0));
        }
        return (lf4.a(porterDuffColorFilter, this.s) && lf4.a(porterDuffColorFilter2, this.t)) ? false : true;
    }

    public final void i() {
        e06 e06VarY = D().y(new b(-E()));
        this.m = e06VarY;
        this.r.d(e06VarY, this.a.k, v(), this.h);
    }

    public final void i0() {
        float fI = I();
        this.a.r = (int) Math.ceil(0.75f * fI);
        this.a.s = (int) Math.ceil(fI * 0.25f);
        h0();
        N();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.d) != null && colorStateList4.isStateful())));
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        this.u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public int l(int i) {
        float fI = I() + z();
        c12 c12Var = this.a.b;
        return c12Var != null ? c12Var.c(i, fI) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new c(this.a);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.a.s != 0) {
            canvas.drawPath(this.g, this.p.c());
        }
        for (int i = 0; i < 4; i++) {
            this.b[i].b(this.p, this.a.r, canvas);
            this.c[i].b(this.p, this.a.r, canvas);
        }
        if (this.w) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.g, y);
            canvas.translate(iB, iC);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.n, this.g, this.a.a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.zepto.ue6.b
    public boolean onStateChange(int[] iArr) {
        boolean z = g0(iArr) || h0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.a.a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, e06 e06Var, RectF rectF) {
        if (!e06Var.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = e06Var.t().a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void r(Canvas canvas) {
        q(canvas, this.o, this.h, this.m, v());
    }

    public float s() {
        return this.a.a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.a;
        if (cVar.m != i) {
            cVar.m = i;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        N();
    }

    @Override // com.zepto.h06
    public void setShapeAppearanceModel(e06 e06Var) {
        this.a.a = e06Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        h0();
        N();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.a;
        if (cVar.h != mode) {
            cVar.h = mode;
            h0();
            N();
        }
    }

    public float t() {
        return this.a.a.l().a(u());
    }

    public RectF u() {
        this.i.set(getBounds());
        return this.i;
    }

    public final RectF v() {
        this.j.set(u());
        float fE = E();
        this.j.inset(fE, fE);
        return this.j;
    }

    public float w() {
        return this.a.o;
    }

    public ColorStateList x() {
        return this.a.d;
    }

    public float y() {
        return this.a.k;
    }

    public float z() {
        return this.a.n;
    }

    public wq3(Context context, AttributeSet attributeSet, int i, int i2) {
        this(e06.e(context, attributeSet, i, i2).m());
    }

    public static class c extends Drawable.ConstantState {
        public e06 a;
        public c12 b;
        public ColorFilter c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(e06 e06Var, c12 c12Var) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = e06Var;
            this.b = c12Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            wq3 wq3Var = new wq3(this);
            wq3Var.e = true;
            return wq3Var;
        }

        public c(c cVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }
    }

    public wq3(e06 e06Var) {
        this(new c(e06Var, null));
    }

    public wq3(c cVar) {
        f06 f06Var;
        this.b = new g06.g[4];
        this.c = new g06.g[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new b06();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            f06Var = f06.k();
        } else {
            f06Var = new f06();
        }
        this.r = f06Var;
        this.v = new RectF();
        this.w = true;
        this.a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        h0();
        g0(getState());
        this.q = new a();
    }
}
