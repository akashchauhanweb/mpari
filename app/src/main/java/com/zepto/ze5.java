package com.zepto;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ze5 implements an6 {
    public float a;
    public float b;
    public float c;
    public a d;

    public enum a {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public ze5(int i, int i2, a cornerType) {
        Intrinsics.checkParameterIsNotNull(cornerType, "cornerType");
        this.a = i;
        this.b = i * 2;
        this.c = i2;
        this.d = cornerType;
    }

    @Override // com.zepto.an6
    public Bitmap a(Bitmap source) {
        Intrinsics.checkParameterIsNotNull(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(source, tileMode, tileMode));
        n(canvas, paint, width, height);
        source.recycle();
        Intrinsics.checkExpressionValueIsNotNull(bitmap, "bitmap");
        return bitmap;
    }

    @Override // com.zepto.an6
    public String b() {
        return "RoundedTransformation(radius=" + this.a + ", margin=" + this.c + ", diameter=" + this.b + ", cornerType=" + this.d.name() + ")";
    }

    public final void c(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        float f4 = this.b;
        RectF rectF = new RectF(f3, f2 - f4, f4 + f3, f2);
        float f5 = this.a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.c;
        canvas.drawRect(new RectF(f6, f6, this.b + f6, f2 - this.a), paint);
        float f7 = this.c;
        canvas.drawRect(new RectF(this.a + f7, f7, f, f2), paint);
    }

    public final void d(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.b;
        RectF rectF = new RectF(f - f3, f2 - f3, f, f2);
        float f4 = this.a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.c;
        canvas.drawRect(new RectF(f5, f5, f - this.a, f2), paint);
        float f6 = this.a;
        canvas.drawRect(new RectF(f - f6, this.c, f, f2 - f6), paint);
    }

    public final void e(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.c, f2 - this.b, f, f2);
        float f3 = this.a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.c;
        canvas.drawRect(new RectF(f4, f4, f, f2 - this.a), paint);
    }

    public final void f(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        float f4 = this.b;
        RectF rectF = new RectF(f3, f3, f3 + f4, f4 + f3);
        float f5 = this.a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.b;
        RectF rectF2 = new RectF(f - f6, f2 - f6, f, f2);
        float f7 = this.a;
        canvas.drawRoundRect(rectF2, f7, f7, paint);
        float f8 = this.c;
        canvas.drawRect(new RectF(f8, this.a + f8, f - this.b, f2), paint);
        float f9 = this.c;
        canvas.drawRect(new RectF(this.b + f9, f9, f, f2 - this.a), paint);
    }

    public final void g(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.b;
        float f4 = this.c;
        RectF rectF = new RectF(f - f3, f4, f, f3 + f4);
        float f5 = this.a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.c;
        float f7 = this.b;
        RectF rectF2 = new RectF(f6, f2 - f7, f7 + f6, f2);
        float f8 = this.a;
        canvas.drawRoundRect(rectF2, f8, f8, paint);
        float f9 = this.c;
        float f10 = this.a;
        canvas.drawRect(new RectF(f9, f9, f - f10, f2 - f10), paint);
        float f11 = this.c;
        float f12 = this.a;
        canvas.drawRect(new RectF(f11 + f12, f11 + f12, f, f2), paint);
    }

    public final void h(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        RectF rectF = new RectF(f3, f3, this.b + f3, f2);
        float f4 = this.a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.c;
        canvas.drawRect(new RectF(this.a + f5, f5, f, f2), paint);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        RectF rectF = new RectF(f3, f3, f, this.b + f3);
        float f4 = this.a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        RectF rectF2 = new RectF(f - this.b, this.c, f, f2);
        float f5 = this.a;
        canvas.drawRoundRect(rectF2, f5, f5, paint);
        float f6 = this.c;
        float f7 = this.a;
        canvas.drawRect(new RectF(f6, f6 + f7, f - f7, f2), paint);
    }

    public final void j(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        RectF rectF = new RectF(f3, f3, f, this.b + f3);
        float f4 = this.a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.c;
        RectF rectF2 = new RectF(f5, f5, this.b + f5, f2);
        float f6 = this.a;
        canvas.drawRoundRect(rectF2, f6, f6, paint);
        float f7 = this.c;
        float f8 = this.a;
        canvas.drawRect(new RectF(f7 + f8, f7 + f8, f, f2), paint);
    }

    public final void k(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.c, f2 - this.b, f, f2);
        float f3 = this.a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        RectF rectF2 = new RectF(f - this.b, this.c, f, f2);
        float f4 = this.a;
        canvas.drawRoundRect(rectF2, f4, f4, paint);
        float f5 = this.c;
        float f6 = this.a;
        canvas.drawRect(new RectF(f5, f5, f - f6, f2 - f6), paint);
    }

    public final void l(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        RectF rectF = new RectF(f3, f3, this.b + f3, f2);
        float f4 = this.a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        RectF rectF2 = new RectF(this.c, f2 - this.b, f, f2);
        float f5 = this.a;
        canvas.drawRoundRect(rectF2, f5, f5, paint);
        float f6 = this.c;
        float f7 = this.a;
        canvas.drawRect(new RectF(f6 + f7, f6, f, f2 - f7), paint);
    }

    public final void m(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(f - this.b, this.c, f, f2);
        float f3 = this.a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.c;
        canvas.drawRect(new RectF(f4, f4, f - this.a, f2), paint);
    }

    public final void n(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        float f4 = f - f3;
        float f5 = f2 - f3;
        switch (af5.a[this.d.ordinal()]) {
            case 1:
                float f6 = this.c;
                RectF rectF = new RectF(f6, f6, f4, f5);
                float f7 = this.a;
                canvas.drawRoundRect(rectF, f7, f7, paint);
                break;
            case 2:
                o(canvas, paint, f4, f5);
                break;
            case 3:
                p(canvas, paint, f4, f5);
                break;
            case 4:
                c(canvas, paint, f4, f5);
                break;
            case 5:
                d(canvas, paint, f4, f5);
                break;
            case 6:
                q(canvas, paint, f4, f5);
                break;
            case 7:
                e(canvas, paint, f4, f5);
                break;
            case 8:
                h(canvas, paint, f4, f5);
                break;
            case 9:
                m(canvas, paint, f4, f5);
                break;
            case 10:
                k(canvas, paint, f4, f5);
                break;
            case 11:
                l(canvas, paint, f4, f5);
                break;
            case 12:
                i(canvas, paint, f4, f5);
                break;
            case 13:
                j(canvas, paint, f4, f5);
                break;
            case 14:
                f(canvas, paint, f4, f5);
                break;
            case 15:
                g(canvas, paint, f4, f5);
                break;
            default:
                float f8 = this.c;
                RectF rectF2 = new RectF(f8, f8, f4, f5);
                float f9 = this.a;
                canvas.drawRoundRect(rectF2, f9, f9, paint);
                break;
        }
    }

    public final void o(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        float f4 = this.b;
        RectF rectF = new RectF(f3, f3, f3 + f4, f4 + f3);
        float f5 = this.a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.c;
        float f7 = this.a;
        canvas.drawRect(new RectF(f6, f6 + f7, f7 + f6, f2), paint);
        float f8 = this.c;
        canvas.drawRect(new RectF(this.a + f8, f8, f, f2), paint);
    }

    public final void p(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.b;
        float f4 = this.c;
        RectF rectF = new RectF(f - f3, f4, f, f3 + f4);
        float f5 = this.a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.c;
        canvas.drawRect(new RectF(f6, f6, f - this.a, f2), paint);
        float f7 = this.a;
        canvas.drawRect(new RectF(f - f7, this.c + f7, f, f2), paint);
    }

    public final void q(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.c;
        RectF rectF = new RectF(f3, f3, f, this.b + f3);
        float f4 = this.a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.c;
        canvas.drawRect(new RectF(f5, this.a + f5, f, f2), paint);
    }

    public /* synthetic */ ze5(int i, int i2, a aVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? a.ALL : aVar);
    }
}
