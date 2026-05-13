package com.zepto;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class dp6 extends l12 {
    public static Paint f;

    public dp6(k12 k12Var) {
        super(k12Var);
    }

    public static Paint c() {
        if (f == null) {
            TextPaint textPaint = new TextPaint();
            f = textPaint;
            textPaint.setColor(androidx.emoji2.text.c.b().c());
            f.setStyle(Paint.Style.FILL);
        }
        return f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        if (androidx.emoji2.text.c.b().i()) {
            canvas.drawRect(f2, i3, f2 + b(), i5, c());
        }
        a().a(canvas, f2, i4, paint);
    }
}
