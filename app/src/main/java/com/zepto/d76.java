package com.zepto;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class d76 {
    public static final int n = 1;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int e;
    public boolean l;
    public int d = 0;
    public Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    public int g = IntCompanionObject.MAX_VALUE;
    public float h = 0.0f;
    public float i = 1.0f;
    public int j = n;
    public boolean k = true;
    public TextUtils.TruncateAt m = null;

    public static class a extends Exception {
    }

    public d76(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    public static d76 b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new d76(charSequence, textPaint, i);
    }

    public StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int iMax = Math.max(0, this.c);
        CharSequence charSequenceEllipsize = this.a;
        if (this.g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.b, iMax, this.m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.e);
        this.e = iMin;
        if (this.l && this.g == 1) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.d, iMin, this.b, iMax);
        builderObtain.setAlignment(this.f);
        builderObtain.setIncludePad(this.k);
        builderObtain.setTextDirection(this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.g);
        float f = this.h;
        if (f != 0.0f || this.i != 1.0f) {
            builderObtain.setLineSpacing(f, this.i);
        }
        if (this.g > 1) {
            builderObtain.setHyphenationFrequency(this.j);
        }
        return builderObtain.build();
    }

    public d76 c(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public d76 d(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public d76 e(int i) {
        this.j = i;
        return this;
    }

    public d76 f(boolean z) {
        this.k = z;
        return this;
    }

    public d76 g(boolean z) {
        this.l = z;
        return this;
    }

    public d76 h(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    public d76 i(int i) {
        this.g = i;
        return this;
    }

    public d76 j(e76 e76Var) {
        return this;
    }
}
