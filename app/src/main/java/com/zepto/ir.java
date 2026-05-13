package com.zepto;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.zepto.cd5;

/* JADX INFO: loaded from: classes.dex */
public final class ir {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static ir c;
    public cd5 a;

    public class a implements cd5.c {
        public final int[] a = {sz4.R, sz4.P, sz4.a};
        public final int[] b = {sz4.o, sz4.B, sz4.t, sz4.p, sz4.q, sz4.s, sz4.r};
        public final int[] c = {sz4.O, sz4.Q, sz4.k, sz4.K, sz4.L, sz4.M, sz4.N};
        public final int[] d = {sz4.w, sz4.i, sz4.v};
        public final int[] e = {sz4.J, sz4.S};
        public final int[] f = {sz4.c, sz4.g, sz4.d, sz4.h};

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
        @Override // com.zepto.cd5.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = com.zepto.ir.a()
                int[] r1 = r7.a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = com.zepto.zy4.u
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = com.zepto.zy4.s
                goto L11
            L20:
                int[] r1 = r7.d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = com.zepto.sz4.u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = com.zepto.sz4.l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = com.zepto.zw1.a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = com.zepto.jf6.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = com.zepto.ir.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.ir.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // com.zepto.cd5.c
        public PorterDuff.Mode b(int i) {
            if (i == sz4.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // com.zepto.cd5.c
        public Drawable c(cd5 cd5Var, Context context, int i) {
            if (i == sz4.j) {
                return new LayerDrawable(new Drawable[]{cd5Var.i(context, sz4.i), cd5Var.i(context, sz4.k)});
            }
            if (i == sz4.y) {
                return l(cd5Var, context, lz4.g);
            }
            if (i == sz4.x) {
                return l(cd5Var, context, lz4.h);
            }
            if (i == sz4.z) {
                return l(cd5Var, context, lz4.i);
            }
            return null;
        }

        @Override // com.zepto.cd5.c
        public ColorStateList d(Context context, int i) {
            if (i == sz4.m) {
                return tr.a(context, fz4.e);
            }
            if (i == sz4.I) {
                return tr.a(context, fz4.h);
            }
            if (i == sz4.H) {
                return k(context);
            }
            if (i == sz4.f) {
                return j(context);
            }
            if (i == sz4.b) {
                return g(context);
            }
            if (i == sz4.e) {
                return i(context);
            }
            if (i == sz4.D || i == sz4.E) {
                return tr.a(context, fz4.g);
            }
            if (f(this.b, i)) {
                return jf6.e(context, zy4.u);
            }
            if (f(this.e, i)) {
                return tr.a(context, fz4.d);
            }
            if (f(this.f, i)) {
                return tr.a(context, fz4.c);
            }
            if (i == sz4.A) {
                return tr.a(context, fz4.f);
            }
            return null;
        }

        @Override // com.zepto.cd5.c
        public boolean e(Context context, int i, Drawable drawable) {
            if (i == sz4.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i2 = zy4.u;
                m(drawableFindDrawableByLayerId, jf6.c(context, i2), ir.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), jf6.c(context, i2), ir.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), jf6.c(context, zy4.s), ir.b);
                return true;
            }
            if (i != sz4.y && i != sz4.x && i != sz4.z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), jf6.b(context, zy4.u), ir.b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i3 = zy4.s;
            m(drawableFindDrawableByLayerId2, jf6.c(context, i3), ir.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), jf6.c(context, i3), ir.b);
            return true;
        }

        public final boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i) {
            int iC = jf6.c(context, zy4.t);
            return new ColorStateList(new int[][]{jf6.b, jf6.e, jf6.c, jf6.i}, new int[]{jf6.b(context, zy4.r), sr0.g(iC, i), sr0.g(iC, i), i});
        }

        public final ColorStateList i(Context context) {
            return h(context, jf6.c(context, zy4.q));
        }

        public final ColorStateList j(Context context) {
            return h(context, jf6.c(context, zy4.r));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = zy4.x;
            ColorStateList colorStateListE = jf6.e(context, i);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = jf6.b;
                iArr2[0] = jf6.b(context, i);
                iArr[1] = jf6.f;
                iArr2[1] = jf6.c(context, zy4.s);
                iArr[2] = jf6.i;
                iArr2[2] = jf6.c(context, i);
            } else {
                int[] iArr3 = jf6.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = jf6.f;
                iArr2[1] = jf6.c(context, zy4.s);
                iArr[2] = jf6.i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(cd5 cd5Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableI = cd5Var.i(context, sz4.F);
            Drawable drawableI2 = cd5Var.i(context, sz4.G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (zw1.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = ir.b;
            }
            drawable.setColorFilter(ir.e(i, mode));
        }
    }

    public static synchronized ir b() {
        try {
            if (c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        return cd5.k(i, mode);
    }

    public static synchronized void h() {
        if (c == null) {
            ir irVar = new ir();
            c = irVar;
            irVar.a = cd5.g();
            c.a.t(new a());
        }
    }

    public static void i(Drawable drawable, jg6 jg6Var, int[] iArr) {
        cd5.v(drawable, jg6Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.i(context, i);
    }

    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.j(context, i, z);
    }

    public synchronized ColorStateList f(Context context, int i) {
        return this.a.l(context, i);
    }

    public synchronized void g(Context context) {
        this.a.r(context);
    }
}
