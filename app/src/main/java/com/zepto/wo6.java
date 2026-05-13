package com.zepto;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.zepto.ed5;
import com.zepto.ie2;
import com.zepto.je2;

/* JADX INFO: loaded from: classes.dex */
public abstract class wo6 {
    public static final bp6 a;
    public static final no3 b;

    public static class a extends je2.c {
        public ed5.e a;

        public a(ed5.e eVar) {
            this.a = eVar;
        }

        @Override // com.zepto.je2.c
        public void a(int i) {
            ed5.e eVar = this.a;
            if (eVar != null) {
                eVar.f(i);
            }
        }

        @Override // com.zepto.je2.c
        public void b(Typeface typeface) {
            ed5.e eVar = this.a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new ap6();
        } else if (i >= 28) {
            a = new zo6();
        } else {
            a = new yo6();
        }
        b = new no3(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, je2.b[] bVarArr, int i) {
        return a.b(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(Context context, ie2.b bVar, Resources resources, int i, String str, int i2, int i3, ed5.e eVar, Handler handler, boolean z) {
        Typeface typefaceA;
        if (bVar instanceof ie2.e) {
            ie2.e eVar2 = (ie2.e) bVar;
            Typeface typefaceG = g(eVar2.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = je2.c(context, eVar2.b(), i3, !z ? eVar != null : eVar2.a() != 0, z ? eVar2.d() : -1, ed5.e.e(handler), new a(eVar));
        } else {
            typefaceA = a.a(context, (ie2.c) bVar, resources, i3);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            b.d(e(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceC = a.c(context, resources, i, str, i3);
        if (typefaceC != null) {
            b.d(e(resources, i, str, i2, i3), typefaceC);
        }
        return typefaceC;
    }

    public static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface f(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) b.c(e(resources, i, str, i2, i3));
    }

    public static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
