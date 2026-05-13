package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.zepto.qv7;

/* JADX INFO: loaded from: classes.dex */
public abstract class zr7 {

    public class a implements cg4 {
        public final /* synthetic */ c a;
        public final /* synthetic */ d b;

        public a(c cVar, d dVar) {
            this.a = cVar;
            this.b = dVar;
        }

        @Override // com.zepto.cg4
        public qv7 a(View view, qv7 qv7Var) {
            return this.a.a(view, qv7Var, new d(this.b));
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            dq7.n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        qv7 a(View view, qv7 qv7Var, d dVar);
    }

    public static class d {
        public int a;
        public int b;
        public int c;
        public int d;

        public d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.d = dVar.d;
        }
    }

    public static void b(View view, c cVar) {
        dq7.E0(view, new a(cVar, new d(dq7.G(view), view.getPaddingTop(), dq7.F(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = yw1.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    public static InputMethodManager e(View view) {
        return (InputMethodManager) yy0.j(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float fW = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fW += dq7.w((View) parent);
        }
        return fW;
    }

    public static boolean g(View view) {
        return dq7.B(view) == 1;
    }

    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (dq7.T(view)) {
            dq7.n0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.zepto.yr7
            @Override // java.lang.Runnable
            public final void run() {
                zr7.l(view, z);
            }
        });
    }

    public static void l(View view, boolean z) {
        rw7 rw7VarL;
        if (!z || (rw7VarL = dq7.L(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            rw7VarL.d(qv7.m.a());
        }
    }
}
