package com.zepto;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class as7 {
    public static final ns7 a;
    public static final Property b;
    public static final Property c;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(as7.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            as7.g(view, f.floatValue());
        }
    }

    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return dq7.u(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            dq7.x0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new ms7();
        } else {
            a = new ls7();
        }
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        a.a(view);
    }

    public static hr7 b(View view) {
        return new gr7(view);
    }

    public static float c(View view) {
        return a.b(view);
    }

    public static cv7 d(View view) {
        return new bv7(view);
    }

    public static void e(View view) {
        a.c(view);
    }

    public static void f(View view, int i, int i2, int i3, int i4) {
        a.d(view, i, i2, i3, i4);
    }

    public static void g(View view, float f) {
        a.e(view, f);
    }

    public static void h(View view, int i) {
        a.f(view, i);
    }

    public static void i(View view, Matrix matrix) {
        a.g(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        a.h(view, matrix);
    }
}
