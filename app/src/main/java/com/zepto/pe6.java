package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import com.zepto.ed5;

/* JADX INFO: loaded from: classes.dex */
public class pe6 {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    public final float l;
    public ColorStateList m;
    public float n;
    public final int o;
    public boolean p = false;
    public Typeface q;

    public class a extends ed5.e {
        public final /* synthetic */ re6 a;

        public a(re6 re6Var) {
            this.a = re6Var;
        }

        @Override // com.zepto.ed5.e
        /* JADX INFO: renamed from: h */
        public void f(int i) {
            pe6.this.p = true;
            this.a.a(i);
        }

        @Override // com.zepto.ed5.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            pe6 pe6Var = pe6.this;
            pe6Var.q = Typeface.create(typeface, pe6Var.e);
            pe6.this.p = true;
            this.a.b(pe6.this.q, false);
        }
    }

    public class b extends re6 {
        public final /* synthetic */ Context a;
        public final /* synthetic */ TextPaint b;
        public final /* synthetic */ re6 c;

        public b(Context context, TextPaint textPaint, re6 re6Var) {
            this.a = context;
            this.b = textPaint;
            this.c = re6Var;
        }

        @Override // com.zepto.re6
        public void a(int i) {
            this.c.a(i);
        }

        @Override // com.zepto.re6
        public void b(Typeface typeface, boolean z) {
            pe6.this.p(this.a, this.b, typeface);
            this.c.b(typeface, z);
        }
    }

    public pe6(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, m15.q6);
        l(typedArrayObtainStyledAttributes.getDimension(m15.r6, 0.0f));
        k(vq3.a(context, typedArrayObtainStyledAttributes, m15.u6));
        this.a = vq3.a(context, typedArrayObtainStyledAttributes, m15.v6);
        this.b = vq3.a(context, typedArrayObtainStyledAttributes, m15.w6);
        this.e = typedArrayObtainStyledAttributes.getInt(m15.t6, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(m15.s6, 1);
        int iE = vq3.e(typedArrayObtainStyledAttributes, m15.C6, m15.B6);
        this.o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.d = typedArrayObtainStyledAttributes.getString(iE);
        this.g = typedArrayObtainStyledAttributes.getBoolean(m15.D6, false);
        this.c = vq3.a(context, typedArrayObtainStyledAttributes, m15.x6);
        this.h = typedArrayObtainStyledAttributes.getFloat(m15.y6, 0.0f);
        this.i = typedArrayObtainStyledAttributes.getFloat(m15.z6, 0.0f);
        this.j = typedArrayObtainStyledAttributes.getFloat(m15.A6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, m15.c4);
        int i2 = m15.d4;
        this.k = typedArrayObtainStyledAttributes2.hasValue(i2);
        this.l = typedArrayObtainStyledAttributes2.getFloat(i2, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.q == null && (str = this.d) != null) {
            this.q = Typeface.create(str, this.e);
        }
        if (this.q == null) {
            int i = this.f;
            if (i == 1) {
                this.q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.q = Typeface.SERIF;
            } else if (i != 3) {
                this.q = Typeface.DEFAULT;
            } else {
                this.q = Typeface.MONOSPACE;
            }
            this.q = Typeface.create(this.q, this.e);
        }
    }

    public Typeface e() {
        d();
        return this.q;
    }

    public Typeface f(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = ed5.g(context, this.o);
                this.q = typefaceG;
                if (typefaceG != null) {
                    this.q = Typeface.create(typefaceG, this.e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.d, e);
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(Context context, TextPaint textPaint, re6 re6Var) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, re6Var));
    }

    public void h(Context context, re6 re6Var) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.o;
        if (i == 0) {
            this.p = true;
        }
        if (this.p) {
            re6Var.b(this.q, true);
            return;
        }
        try {
            ed5.i(context, i, new a(re6Var), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            re6Var.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.d, e);
            this.p = true;
            re6Var.a(-3);
        }
    }

    public ColorStateList i() {
        return this.m;
    }

    public float j() {
        return this.n;
    }

    public void k(ColorStateList colorStateList) {
        this.m = colorStateList;
    }

    public void l(float f) {
        this.n = f;
    }

    public final boolean m(Context context) {
        if (qe6.a()) {
            return true;
        }
        int i = this.o;
        return (i != 0 ? ed5.c(context, i) : null) != null;
    }

    public void n(Context context, TextPaint textPaint, re6 re6Var) {
        o(context, textPaint, re6Var);
        ColorStateList colorStateList = this.m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.j;
        float f2 = this.h;
        float f3 = this.i;
        ColorStateList colorStateList2 = this.c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, re6 re6Var) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, re6Var);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = hp6.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = this.e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (this.k) {
            textPaint.setLetterSpacing(this.l);
        }
    }
}
