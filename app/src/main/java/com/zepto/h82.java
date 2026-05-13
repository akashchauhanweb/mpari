package com.zepto;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class h82 extends Drawable {
    public Bitmap b;
    public int d;
    public int e;
    public final Paint a = new Paint(2);
    public int c = KotlinVersion.MAX_COMPONENT_VALUE;

    public h82(Bitmap bitmap) {
        b(bitmap);
    }

    public Bitmap a() {
        return this.b;
    }

    public void b(Bitmap bitmap) {
        this.b = bitmap;
        if (bitmap != null) {
            this.d = bitmap.getWidth();
            this.e = this.b.getHeight();
        } else {
            this.e = 0;
            this.d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.b, (Rect) null, getBounds(), this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.c = i;
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }
}
