package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.zepto.qv7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dv7 {
    public e a;

    public static final class a {
        public final vz2 a;
        public final vz2 b;

        public a(vz2 vz2Var, vz2 vz2Var2) {
            this.a = vz2Var;
            this.b = vz2Var2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public vz2 a() {
            return this.a;
        }

        public vz2 b() {
            return this.b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.g(bounds);
            this.b = d.f(bounds);
        }
    }

    public static abstract class b {
        public WindowInsets a;
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public abstract void b(dv7 dv7Var);

        public abstract void c(dv7 dv7Var);

        public abstract qv7 d(qv7 qv7Var, List list);

        public abstract a e(dv7 dv7Var, a aVar);
    }

    public static class c extends e {
        public static final Interpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final Interpolator f = new i82();
        public static final Interpolator g = new DecelerateInterpolator();

        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public qv7 b;

            /* JADX INFO: renamed from: com.zepto.dv7$c$a$a, reason: collision with other inner class name */
            public class C0076a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ dv7 a;
                public final /* synthetic */ qv7 b;
                public final /* synthetic */ qv7 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public C0076a(dv7 dv7Var, qv7 qv7Var, qv7 qv7Var2, int i, View view) {
                    this.a = dv7Var;
                    this.b = qv7Var;
                    this.c = qv7Var2;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.e, c.o(this.b, this.c, this.a.b(), this.d), Collections.singletonList(this.a));
                }
            }

            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ dv7 a;
                public final /* synthetic */ View b;

                public b(dv7 dv7Var, View view) {
                    this.a = dv7Var;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.a.e(1.0f);
                    c.i(this.b, this.a);
                }
            }

            /* JADX INFO: renamed from: com.zepto.dv7$c$a$c, reason: collision with other inner class name */
            public class RunnableC0077c implements Runnable {
                public final /* synthetic */ View c;
                public final /* synthetic */ dv7 e;
                public final /* synthetic */ a f;
                public final /* synthetic */ ValueAnimator g;

                public RunnableC0077c(View view, dv7 dv7Var, a aVar, ValueAnimator valueAnimator) {
                    this.c = view;
                    this.e = dv7Var;
                    this.f = aVar;
                    this.g = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.c, this.e, this.f);
                    this.g.start();
                }
            }

            public a(View view, b bVar) {
                this.a = bVar;
                qv7 qv7VarI = dq7.I(view);
                this.b = qv7VarI != null ? new qv7.b(qv7VarI).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int iE;
                if (!view.isLaidOut()) {
                    this.b = qv7.x(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                qv7 qv7VarX = qv7.x(windowInsets, view);
                if (this.b == null) {
                    this.b = dq7.I(view);
                }
                if (this.b == null) {
                    this.b = qv7VarX;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if ((bVarN == null || !Objects.equals(bVarN.a, windowInsets)) && (iE = c.e(qv7VarX, this.b)) != 0) {
                    qv7 qv7Var = this.b;
                    dv7 dv7Var = new dv7(iE, c.g(iE, qv7VarX, qv7Var), 160L);
                    dv7Var.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(dv7Var.a());
                    a aVarF = c.f(qv7VarX, qv7Var, iE);
                    c.j(view, dv7Var, windowInsets, false);
                    duration.addUpdateListener(new C0076a(dv7Var, qv7VarX, qv7Var, iE, view));
                    duration.addListener(new b(dv7Var, view));
                    hh4.a(view, new RunnableC0077c(view, dv7Var, aVarF, duration));
                    this.b = qv7VarX;
                    return c.m(view, windowInsets);
                }
                return c.m(view, windowInsets);
            }
        }

        public c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static int e(qv7 qv7Var, qv7 qv7Var2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!qv7Var.f(i2).equals(qv7Var2.f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        public static a f(qv7 qv7Var, qv7 qv7Var2, int i) {
            vz2 vz2VarF = qv7Var.f(i);
            vz2 vz2VarF2 = qv7Var2.f(i);
            return new a(vz2.b(Math.min(vz2VarF.a, vz2VarF2.a), Math.min(vz2VarF.b, vz2VarF2.b), Math.min(vz2VarF.c, vz2VarF2.c), Math.min(vz2VarF.d, vz2VarF2.d)), vz2.b(Math.max(vz2VarF.a, vz2VarF2.a), Math.max(vz2VarF.b, vz2VarF2.b), Math.max(vz2VarF.c, vz2VarF2.c), Math.max(vz2VarF.d, vz2VarF2.d)));
        }

        public static Interpolator g(int i, qv7 qv7Var, qv7 qv7Var2) {
            return (i & 8) != 0 ? qv7Var.f(qv7.m.a()).d > qv7Var2.f(qv7.m.a()).d ? e : f : g;
        }

        public static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void i(View view, dv7 dv7Var) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.b(dv7Var);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), dv7Var);
                }
            }
        }

        public static void j(View view, dv7 dv7Var, WindowInsets windowInsets, boolean z) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.a = windowInsets;
                if (!z) {
                    bVarN.c(dv7Var);
                    z = bVarN.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    j(viewGroup.getChildAt(i), dv7Var, windowInsets, z);
                }
            }
        }

        public static void k(View view, qv7 qv7Var, List list) {
            b bVarN = n(view);
            if (bVarN != null) {
                qv7Var = bVarN.d(qv7Var, list);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    k(viewGroup.getChildAt(i), qv7Var, list);
                }
            }
        }

        public static void l(View view, dv7 dv7Var, a aVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.e(dv7Var, aVar);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    l(viewGroup.getChildAt(i), dv7Var, aVar);
                }
            }
        }

        public static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(e05.L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b n(View view) {
            Object tag = view.getTag(e05.S);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }

        public static qv7 o(qv7 qv7Var, qv7 qv7Var2, float f2, int i) {
            qv7.b bVar = new qv7.b(qv7Var);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar.b(i2, qv7Var.f(i2));
                } else {
                    vz2 vz2VarF = qv7Var.f(i2);
                    vz2 vz2VarF2 = qv7Var2.f(i2);
                    float f3 = 1.0f - f2;
                    bVar.b(i2, qv7.o(vz2VarF, (int) (((double) ((vz2VarF.a - vz2VarF2.a) * f3)) + 0.5d), (int) (((double) ((vz2VarF.b - vz2VarF2.b) * f3)) + 0.5d), (int) (((double) ((vz2VarF.c - vz2VarF2.c) * f3)) + 0.5d), (int) (((double) ((vz2VarF.d - vz2VarF2.d) * f3)) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void p(View view, b bVar) {
            Object tag = view.getTag(e05.L);
            if (bVar == null) {
                view.setTag(e05.S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = h(view, bVar);
            view.setTag(e05.S, onApplyWindowInsetsListenerH);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    public static class d extends e {
        public final WindowInsetsAnimation e;

        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List b;
            public ArrayList c;
            public final HashMap d;

            public a(b bVar) {
                super(bVar.a());
                this.d = new HashMap();
                this.a = bVar;
            }

            public final dv7 a(WindowInsetsAnimation windowInsetsAnimation) {
                dv7 dv7Var = (dv7) this.d.get(windowInsetsAnimation);
                if (dv7Var != null) {
                    return dv7Var;
                }
                dv7 dv7VarF = dv7.f(windowInsetsAnimation);
                this.d.put(windowInsetsAnimation, dv7VarF);
                return dv7VarF;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.b(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = ov7.a(list.get(size));
                    dv7 dv7VarA = a(windowInsetsAnimationA);
                    dv7VarA.e(windowInsetsAnimationA.getFraction());
                    this.c.add(dv7VarA);
                }
                return this.a.d(qv7.w(windowInsets), this.b).v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            lv7.a();
            return kv7.a(aVar.a().e(), aVar.b().e());
        }

        public static vz2 f(WindowInsetsAnimation.Bounds bounds) {
            return vz2.d(bounds.getUpperBound());
        }

        public static vz2 g(WindowInsetsAnimation.Bounds bounds) {
            return vz2.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // com.zepto.dv7.e
        public long a() {
            return this.e.getDurationMillis();
        }

        @Override // com.zepto.dv7.e
        public float b() {
            return this.e.getInterpolatedFraction();
        }

        @Override // com.zepto.dv7.e
        public int c() {
            return this.e.getTypeMask();
        }

        @Override // com.zepto.dv7.e
        public void d(float f) {
            this.e.setFraction(f);
        }

        public d(int i, Interpolator interpolator, long j) {
            this(jv7.a(i, interpolator, j));
        }
    }

    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    public dv7(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i, interpolator, j);
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    public static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    public static dv7 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new dv7(windowInsetsAnimation);
    }

    public long a() {
        return this.a.a();
    }

    public float b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public void e(float f) {
        this.a.d(f);
    }

    public dv7(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }
}
