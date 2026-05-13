package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public class e06 {
    public static final oz0 m = new c85(0.5f);
    public pz0 a;
    public pz0 b;
    public pz0 c;
    public pz0 d;
    public oz0 e;
    public oz0 f;
    public oz0 g;
    public oz0 h;
    public mz1 i;
    public mz1 j;
    public mz1 k;
    public mz1 l;

    public interface c {
        oz0 a(oz0 oz0Var);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    public static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new a2(i3));
    }

    public static b d(Context context, int i, int i2, oz0 oz0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(m15.C5);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(m15.D5, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(m15.G5, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(m15.H5, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(m15.F5, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(m15.E5, i3);
            oz0 oz0VarM = m(typedArrayObtainStyledAttributes, m15.I5, oz0Var);
            oz0 oz0VarM2 = m(typedArrayObtainStyledAttributes, m15.L5, oz0VarM);
            oz0 oz0VarM3 = m(typedArrayObtainStyledAttributes, m15.M5, oz0VarM);
            oz0 oz0VarM4 = m(typedArrayObtainStyledAttributes, m15.K5, oz0VarM);
            return new b().y(i4, oz0VarM2).C(i5, oz0VarM3).u(i6, oz0VarM4).q(i7, m(typedArrayObtainStyledAttributes, m15.J5, oz0VarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new a2(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, oz0 oz0Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.Y3, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(m15.Z3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(m15.a4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, oz0Var);
    }

    public static oz0 m(TypedArray typedArray, int i, oz0 oz0Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return oz0Var;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new a2(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new c85(typedValuePeekValue.getFraction(1.0f, 1.0f)) : oz0Var;
    }

    public mz1 h() {
        return this.k;
    }

    public pz0 i() {
        return this.d;
    }

    public oz0 j() {
        return this.h;
    }

    public pz0 k() {
        return this.c;
    }

    public oz0 l() {
        return this.g;
    }

    public mz1 n() {
        return this.l;
    }

    public mz1 o() {
        return this.j;
    }

    public mz1 p() {
        return this.i;
    }

    public pz0 q() {
        return this.a;
    }

    public oz0 r() {
        return this.e;
    }

    public pz0 s() {
        return this.b;
    }

    public oz0 t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(mz1.class) && this.j.getClass().equals(mz1.class) && this.i.getClass().equals(mz1.class) && this.k.getClass().equals(mz1.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof ye5) && (this.a instanceof ye5) && (this.c instanceof ye5) && (this.d instanceof ye5));
    }

    public b v() {
        return new b(this);
    }

    public e06 w(float f) {
        return v().o(f).m();
    }

    public e06 x(oz0 oz0Var) {
        return v().p(oz0Var).m();
    }

    public e06 y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public e06(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    public static final class b {
        public pz0 a;
        public pz0 b;
        public pz0 c;
        public pz0 d;
        public oz0 e;
        public oz0 f;
        public oz0 g;
        public oz0 h;
        public mz1 i;
        public mz1 j;
        public mz1 k;
        public mz1 l;

        public b() {
            this.a = xq3.b();
            this.b = xq3.b();
            this.c = xq3.b();
            this.d = xq3.b();
            this.e = new a2(0.0f);
            this.f = new a2(0.0f);
            this.g = new a2(0.0f);
            this.h = new a2(0.0f);
            this.i = xq3.c();
            this.j = xq3.c();
            this.k = xq3.c();
            this.l = xq3.c();
        }

        public static float n(pz0 pz0Var) {
            if (pz0Var instanceof ye5) {
                return ((ye5) pz0Var).a;
            }
            if (pz0Var instanceof k41) {
                return ((k41) pz0Var).a;
            }
            return -1.0f;
        }

        public b A(float f) {
            this.e = new a2(f);
            return this;
        }

        public b B(oz0 oz0Var) {
            this.e = oz0Var;
            return this;
        }

        public b C(int i, oz0 oz0Var) {
            return D(xq3.a(i)).F(oz0Var);
        }

        public b D(pz0 pz0Var) {
            this.b = pz0Var;
            float fN = n(pz0Var);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f) {
            this.f = new a2(f);
            return this;
        }

        public b F(oz0 oz0Var) {
            this.f = oz0Var;
            return this;
        }

        public e06 m() {
            return new e06(this);
        }

        public b o(float f) {
            return A(f).E(f).w(f).s(f);
        }

        public b p(oz0 oz0Var) {
            return B(oz0Var).F(oz0Var).x(oz0Var).t(oz0Var);
        }

        public b q(int i, oz0 oz0Var) {
            return r(xq3.a(i)).t(oz0Var);
        }

        public b r(pz0 pz0Var) {
            this.d = pz0Var;
            float fN = n(pz0Var);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f) {
            this.h = new a2(f);
            return this;
        }

        public b t(oz0 oz0Var) {
            this.h = oz0Var;
            return this;
        }

        public b u(int i, oz0 oz0Var) {
            return v(xq3.a(i)).x(oz0Var);
        }

        public b v(pz0 pz0Var) {
            this.c = pz0Var;
            float fN = n(pz0Var);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f) {
            this.g = new a2(f);
            return this;
        }

        public b x(oz0 oz0Var) {
            this.g = oz0Var;
            return this;
        }

        public b y(int i, oz0 oz0Var) {
            return z(xq3.a(i)).B(oz0Var);
        }

        public b z(pz0 pz0Var) {
            this.a = pz0Var;
            float fN = n(pz0Var);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(e06 e06Var) {
            this.a = xq3.b();
            this.b = xq3.b();
            this.c = xq3.b();
            this.d = xq3.b();
            this.e = new a2(0.0f);
            this.f = new a2(0.0f);
            this.g = new a2(0.0f);
            this.h = new a2(0.0f);
            this.i = xq3.c();
            this.j = xq3.c();
            this.k = xq3.c();
            this.l = xq3.c();
            this.a = e06Var.a;
            this.b = e06Var.b;
            this.c = e06Var.c;
            this.d = e06Var.d;
            this.e = e06Var.e;
            this.f = e06Var.f;
            this.g = e06Var.g;
            this.h = e06Var.h;
            this.i = e06Var.i;
            this.j = e06Var.j;
            this.k = e06Var.k;
            this.l = e06Var.l;
        }
    }

    public e06() {
        this.a = xq3.b();
        this.b = xq3.b();
        this.c = xq3.b();
        this.d = xq3.b();
        this.e = new a2(0.0f);
        this.f = new a2(0.0f);
        this.g = new a2(0.0f);
        this.h = new a2(0.0f);
        this.i = xq3.c();
        this.j = xq3.c();
        this.k = xq3.c();
        this.l = xq3.c();
    }
}
