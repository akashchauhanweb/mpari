package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zm6 extends AppCompatImageView {
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public Matrix g;
    public int h;
    public int i;
    public b j;
    public float[] k;
    public float[] l;
    public boolean m;
    public boolean n;
    public int o;
    public String p;
    public String q;
    public q62 r;

    public class a implements u60 {
        public a() {
        }

        @Override // com.zepto.u60
        public void a(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            b bVar = zm6.this.j;
            if (bVar != null) {
                bVar.a(exc);
            }
        }

        @Override // com.zepto.u60
        public void b(Bitmap bitmap, q62 q62Var, String str, String str2) {
            zm6.this.p = str;
            zm6.this.q = str2;
            zm6.this.r = q62Var;
            zm6 zm6Var = zm6.this;
            zm6Var.m = true;
            zm6Var.setImageBitmap(bitmap);
        }
    }

    public interface b {
        void a(Exception exc);

        void b(float f);

        void c(float f);

        void d();
    }

    public zm6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new float[8];
        this.e = new float[2];
        this.f = new float[9];
        this.g = new Matrix();
        this.m = false;
        this.n = false;
        this.o = 0;
        i();
    }

    public float f(Matrix matrix) {
        return (float) (-(Math.atan2(h(matrix, 1), h(matrix, 0)) * 57.29577951308232d));
    }

    public float g(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(h(matrix, 0), 2.0d) + Math.pow(h(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return f(this.g);
    }

    public float getCurrentScale() {
        return g(this.g);
    }

    public q62 getExifInfo() {
        return this.r;
    }

    public String getImageInputPath() {
        return this.p;
    }

    public String getImageOutputPath() {
        return this.q;
    }

    public int getMaxBitmapSize() {
        if (this.o <= 0) {
            this.o = w60.b(getContext());
        }
        return this.o;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof h82)) {
            return null;
        }
        return ((h82) getDrawable()).a();
    }

    public float h(Matrix matrix, int i) {
        matrix.getValues(this.f);
        return this.f[i];
    }

    public void i() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.k = h65.b(rectF);
        this.l = h65.a(rectF);
        this.n = true;
        b bVar = this.j;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void k(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.g.postRotate(f, f2, f3);
            setImageMatrix(this.g);
            b bVar = this.j;
            if (bVar != null) {
                bVar.c(f(this.g));
            }
        }
    }

    public void l(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.g.postScale(f, f, f2, f3);
            setImageMatrix(this.g);
            b bVar = this.j;
            if (bVar != null) {
                bVar.b(g(this.g));
            }
        }
    }

    public void m(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.g.postTranslate(f, f2);
        setImageMatrix(this.g);
    }

    public void n(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        w60.d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    public final void o() {
        this.g.mapPoints(this.d, this.k);
        this.g.mapPoints(this.e, this.l);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.m && !this.n)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.h = width - paddingLeft;
            this.i = height - paddingTop;
            j();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new h82(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.g.set(matrix);
        o();
    }

    public void setMaxBitmapSize(int i) {
        this.o = i;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(b bVar) {
        this.j = bVar;
    }
}
