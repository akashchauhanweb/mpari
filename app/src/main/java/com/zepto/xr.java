package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.zepto.ed5;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class xr {
    public final TextView a;
    public jg6 b;
    public jg6 c;
    public jg6 d;
    public jg6 e;
    public jg6 f;
    public jg6 g;
    public jg6 h;
    public final yr i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public class a extends ed5.e {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // com.zepto.ed5.e
        /* JADX INFO: renamed from: h */
        public void f(int i) {
        }

        @Override // com.zepto.ed5.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = f.a(typeface, i, (this.b & 2) != 0);
            }
            xr.this.n(this.c, typeface);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ TextView c;
        public final /* synthetic */ Typeface e;
        public final /* synthetic */ int f;

        public b(TextView textView, Typeface typeface, int i) {
            this.c = textView;
            this.e = typeface;
            this.f = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.setTypeface(this.e, this.f);
        }
    }

    public static class c {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class f {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public xr(TextView textView) {
        this.a = textView;
        this.i = new yr(textView);
    }

    public static jg6 d(Context context, ir irVar, int i) {
        ColorStateList colorStateListF = irVar.f(context, i);
        if (colorStateListF == null) {
            return null;
        }
        jg6 jg6Var = new jg6();
        jg6Var.d = true;
        jg6Var.a = colorStateListF;
        return jg6Var;
    }

    public void A(int i, float f2) {
        if (bs7.b || l()) {
            return;
        }
        B(i, f2);
    }

    public final void B(int i, float f2) {
        this.i.t(i, f2);
    }

    public final void C(Context context, lg6 lg6Var) {
        String strO;
        this.j = lg6Var.k(c25.P2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iK = lg6Var.k(c25.R2, -1);
            this.k = iK;
            if (iK != -1) {
                this.j &= 2;
            }
        }
        int i2 = c25.Q2;
        if (!lg6Var.s(i2) && !lg6Var.s(c25.S2)) {
            int i3 = c25.O2;
            if (lg6Var.s(i3)) {
                this.m = false;
                int iK2 = lg6Var.k(i3, 1);
                if (iK2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i4 = c25.S2;
        if (lg6Var.s(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = lg6Var.j(i2, this.j, new a(i5, i6, new WeakReference(this.a)));
                if (typefaceJ != null) {
                    if (i < 28 || this.k == -1) {
                        this.l = typefaceJ;
                    } else {
                        this.l = f.a(Typeface.create(typefaceJ, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strO = lg6Var.o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(strO, this.j);
        } else {
            this.l = f.a(Typeface.create(strO, 0), this.k, (this.j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, jg6 jg6Var) {
        if (drawable == null || jg6Var == null) {
            return;
        }
        ir.i(drawable, jg6Var, this.a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.a);
        a(drawableArrA[0], this.f);
        a(drawableArrA[2], this.g);
    }

    public void c() {
        this.i.a();
    }

    public int e() {
        return this.i.f();
    }

    public int f() {
        return this.i.g();
    }

    public int g() {
        return this.i.h();
    }

    public int[] h() {
        return this.i.i();
    }

    public int i() {
        return this.i.j();
    }

    public ColorStateList j() {
        jg6 jg6Var = this.h;
        if (jg6Var != null) {
            return jg6Var.a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        jg6 jg6Var = this.h;
        if (jg6Var != null) {
            return jg6Var.b;
        }
        return null;
    }

    public boolean l() {
        return this.i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.xr.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (dq7.T(textView)) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (bs7.b) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i) {
        String strO;
        lg6 lg6VarT = lg6.t(context, i, c25.M2);
        int i2 = c25.U2;
        if (lg6VarT.s(i2)) {
            s(lg6VarT.a(i2, false));
        }
        int i3 = c25.N2;
        if (lg6VarT.s(i3) && lg6VarT.f(i3, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, lg6VarT);
        int i4 = c25.T2;
        if (lg6VarT.s(i4) && (strO = lg6VarT.o(i4)) != null) {
            e.d(this.a, strO);
        }
        lg6VarT.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        c02.e(editorInfo, textView.getText());
    }

    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    public void t(int i, int i2, int i3, int i4) {
        this.i.p(i, i2, i3, i4);
    }

    public void u(int[] iArr, int i) {
        this.i.q(iArr, i);
    }

    public void v(int i) {
        this.i.r(i);
    }

    public void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new jg6();
        }
        jg6 jg6Var = this.h;
        jg6Var.a = colorStateList;
        jg6Var.d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new jg6();
        }
        jg6 jg6Var = this.h;
        jg6Var.b = mode;
        jg6Var.c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.a);
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.a);
        Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            TextView textView2 = this.a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView3 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        jg6 jg6Var = this.h;
        this.b = jg6Var;
        this.c = jg6Var;
        this.d = jg6Var;
        this.e = jg6Var;
        this.f = jg6Var;
        this.g = jg6Var;
    }
}
