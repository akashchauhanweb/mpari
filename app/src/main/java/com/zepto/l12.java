package com.zepto;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class l12 extends ReplacementSpan {
    public final k12 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public short d = -1;
    public float e = 1.0f;

    public l12(k12 k12Var) {
        lu4.h(k12Var, "metadata cannot be null");
        this.b = k12Var;
    }

    public final k12 a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.a);
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        this.e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.b.e();
        this.d = (short) (this.b.e() * this.e);
        short sI = (short) (this.b.i() * this.e);
        this.c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
