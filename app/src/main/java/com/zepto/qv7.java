package com.zepto;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class qv7 {
    public static final qv7 b;
    public final l a;

    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static qv7 a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            qv7 qv7VarA = new b().c(vz2.c(rect)).d(vz2.c(rect2)).a();
                            qv7VarA.t(qv7VarA);
                            qv7VarA.d(view.getRootView());
                            return qv7VarA;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    public static class e extends d {
        public e() {
        }

        @Override // com.zepto.qv7.f
        public void c(int i, vz2 vz2Var) {
            this.c.setInsets(n.a(i), vz2Var.e());
        }

        public e(qv7 qv7Var) {
            super(qv7Var);
        }
    }

    public static class f {
        public final qv7 a;
        public vz2[] b;

        public f() {
            this(new qv7((qv7) null));
        }

        public final void a() {
            vz2[] vz2VarArr = this.b;
            if (vz2VarArr != null) {
                vz2 vz2VarF = vz2VarArr[m.b(1)];
                vz2 vz2VarF2 = this.b[m.b(2)];
                if (vz2VarF2 == null) {
                    vz2VarF2 = this.a.f(2);
                }
                if (vz2VarF == null) {
                    vz2VarF = this.a.f(1);
                }
                g(vz2.a(vz2VarF, vz2VarF2));
                vz2 vz2Var = this.b[m.b(16)];
                if (vz2Var != null) {
                    f(vz2Var);
                }
                vz2 vz2Var2 = this.b[m.b(32)];
                if (vz2Var2 != null) {
                    d(vz2Var2);
                }
                vz2 vz2Var3 = this.b[m.b(64)];
                if (vz2Var3 != null) {
                    h(vz2Var3);
                }
            }
        }

        public abstract qv7 b();

        public void c(int i, vz2 vz2Var) {
            if (this.b == null) {
                this.b = new vz2[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[m.b(i2)] = vz2Var;
                }
            }
        }

        public void d(vz2 vz2Var) {
        }

        public abstract void e(vz2 vz2Var);

        public void f(vz2 vz2Var) {
        }

        public abstract void g(vz2 vz2Var);

        public void h(vz2 vz2Var) {
        }

        public f(qv7 qv7Var) {
            this.a = qv7Var;
        }
    }

    public static class g extends l {
        public static boolean h;
        public static Method i;
        public static Class j;
        public static Field k;
        public static Field l;
        public final WindowInsets c;
        public vz2[] d;
        public vz2 e;
        public qv7 f;
        public vz2 g;

        public g(qv7 qv7Var, WindowInsets windowInsets) {
            super(qv7Var);
            this.e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private vz2 t(int i2, boolean z) {
            vz2 vz2VarA = vz2.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    vz2VarA = vz2.a(vz2VarA, u(i3, z));
                }
            }
            return vz2VarA;
        }

        private vz2 v() {
            qv7 qv7Var = this.f;
            return qv7Var != null ? qv7Var.g() : vz2.e;
        }

        private vz2 w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!h) {
                x();
            }
            Method method = i;
            if (method != null && j != null && k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(objInvoke));
                    if (rect != null) {
                        return vz2.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            h = true;
        }

        @Override // com.zepto.qv7.l
        public void d(View view) {
            vz2 vz2VarW = w(view);
            if (vz2VarW == null) {
                vz2VarW = vz2.e;
            }
            q(vz2VarW);
        }

        @Override // com.zepto.qv7.l
        public void e(qv7 qv7Var) {
            qv7Var.t(this.f);
            qv7Var.s(this.g);
        }

        @Override // com.zepto.qv7.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((g) obj).g);
            }
            return false;
        }

        @Override // com.zepto.qv7.l
        public vz2 g(int i2) {
            return t(i2, false);
        }

        @Override // com.zepto.qv7.l
        public final vz2 k() {
            if (this.e == null) {
                this.e = vz2.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // com.zepto.qv7.l
        public qv7 m(int i2, int i3, int i4, int i5) {
            b bVar = new b(qv7.w(this.c));
            bVar.d(qv7.o(k(), i2, i3, i4, i5));
            bVar.c(qv7.o(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // com.zepto.qv7.l
        public boolean o() {
            return this.c.isRound();
        }

        @Override // com.zepto.qv7.l
        public void p(vz2[] vz2VarArr) {
            this.d = vz2VarArr;
        }

        @Override // com.zepto.qv7.l
        public void q(vz2 vz2Var) {
            this.g = vz2Var;
        }

        @Override // com.zepto.qv7.l
        public void r(qv7 qv7Var) {
            this.f = qv7Var;
        }

        public vz2 u(int i2, boolean z) {
            vz2 vz2VarG;
            int i3;
            if (i2 == 1) {
                return z ? vz2.b(0, Math.max(v().b, k().b), 0, 0) : vz2.b(0, k().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    vz2 vz2VarV = v();
                    vz2 vz2VarI = i();
                    return vz2.b(Math.max(vz2VarV.a, vz2VarI.a), 0, Math.max(vz2VarV.c, vz2VarI.c), Math.max(vz2VarV.d, vz2VarI.d));
                }
                vz2 vz2VarK = k();
                qv7 qv7Var = this.f;
                vz2VarG = qv7Var != null ? qv7Var.g() : null;
                int iMin = vz2VarK.d;
                if (vz2VarG != null) {
                    iMin = Math.min(iMin, vz2VarG.d);
                }
                return vz2.b(vz2VarK.a, 0, vz2VarK.c, iMin);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return j();
                }
                if (i2 == 32) {
                    return h();
                }
                if (i2 == 64) {
                    return l();
                }
                if (i2 != 128) {
                    return vz2.e;
                }
                qv7 qv7Var2 = this.f;
                sk1 sk1VarE = qv7Var2 != null ? qv7Var2.e() : f();
                return sk1VarE != null ? vz2.b(sk1VarE.b(), sk1VarE.d(), sk1VarE.c(), sk1VarE.a()) : vz2.e;
            }
            vz2[] vz2VarArr = this.d;
            vz2VarG = vz2VarArr != null ? vz2VarArr[m.b(8)] : null;
            if (vz2VarG != null) {
                return vz2VarG;
            }
            vz2 vz2VarK2 = k();
            vz2 vz2VarV2 = v();
            int i4 = vz2VarK2.d;
            if (i4 > vz2VarV2.d) {
                return vz2.b(0, 0, 0, i4);
            }
            vz2 vz2Var = this.g;
            return (vz2Var == null || vz2Var.equals(vz2.e) || (i3 = this.g.d) <= vz2VarV2.d) ? vz2.e : vz2.b(0, 0, 0, i3);
        }

        public g(qv7 qv7Var, g gVar) {
            this(qv7Var, new WindowInsets(gVar.c));
        }
    }

    public static class h extends g {
        public vz2 m;

        public h(qv7 qv7Var, WindowInsets windowInsets) {
            super(qv7Var, windowInsets);
            this.m = null;
        }

        @Override // com.zepto.qv7.l
        public qv7 b() {
            return qv7.w(this.c.consumeStableInsets());
        }

        @Override // com.zepto.qv7.l
        public qv7 c() {
            return qv7.w(this.c.consumeSystemWindowInsets());
        }

        @Override // com.zepto.qv7.l
        public final vz2 i() {
            if (this.m == null) {
                this.m = vz2.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // com.zepto.qv7.l
        public boolean n() {
            return this.c.isConsumed();
        }

        @Override // com.zepto.qv7.l
        public void s(vz2 vz2Var) {
            this.m = vz2Var;
        }

        public h(qv7 qv7Var, h hVar) {
            super(qv7Var, hVar);
            this.m = null;
            this.m = hVar.m;
        }
    }

    public static class i extends h {
        public i(qv7 qv7Var, WindowInsets windowInsets) {
            super(qv7Var, windowInsets);
        }

        @Override // com.zepto.qv7.l
        public qv7 a() {
            return qv7.w(this.c.consumeDisplayCutout());
        }

        @Override // com.zepto.qv7.g, com.zepto.qv7.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.c, iVar.c) && Objects.equals(this.g, iVar.g);
        }

        @Override // com.zepto.qv7.l
        public sk1 f() {
            return sk1.e(this.c.getDisplayCutout());
        }

        @Override // com.zepto.qv7.l
        public int hashCode() {
            return this.c.hashCode();
        }

        public i(qv7 qv7Var, i iVar) {
            super(qv7Var, iVar);
        }
    }

    public static class j extends i {
        public vz2 n;
        public vz2 o;
        public vz2 p;

        public j(qv7 qv7Var, WindowInsets windowInsets) {
            super(qv7Var, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // com.zepto.qv7.l
        public vz2 h() {
            if (this.o == null) {
                this.o = vz2.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // com.zepto.qv7.l
        public vz2 j() {
            if (this.n == null) {
                this.n = vz2.d(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // com.zepto.qv7.l
        public vz2 l() {
            if (this.p == null) {
                this.p = vz2.d(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // com.zepto.qv7.g, com.zepto.qv7.l
        public qv7 m(int i, int i2, int i3, int i4) {
            return qv7.w(this.c.inset(i, i2, i3, i4));
        }

        @Override // com.zepto.qv7.h, com.zepto.qv7.l
        public void s(vz2 vz2Var) {
        }

        public j(qv7 qv7Var, j jVar) {
            super(qv7Var, jVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }

    public static class k extends j {
        public static final qv7 q = qv7.w(WindowInsets.CONSUMED);

        public k(qv7 qv7Var, WindowInsets windowInsets) {
            super(qv7Var, windowInsets);
        }

        @Override // com.zepto.qv7.g, com.zepto.qv7.l
        public final void d(View view) {
        }

        @Override // com.zepto.qv7.g, com.zepto.qv7.l
        public vz2 g(int i) {
            return vz2.d(this.c.getInsets(n.a(i)));
        }

        public k(qv7 qv7Var, k kVar) {
            super(qv7Var, kVar);
        }
    }

    public static class l {
        public static final qv7 b = new b().a().a().b().c();
        public final qv7 a;

        public l(qv7 qv7Var) {
            this.a = qv7Var;
        }

        public qv7 a() {
            return this.a;
        }

        public qv7 b() {
            return this.a;
        }

        public qv7 c() {
            return this.a;
        }

        public void d(View view) {
        }

        public void e(qv7 qv7Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && lf4.a(k(), lVar.k()) && lf4.a(i(), lVar.i()) && lf4.a(f(), lVar.f());
        }

        public sk1 f() {
            return null;
        }

        public vz2 g(int i) {
            return vz2.e;
        }

        public vz2 h() {
            return k();
        }

        public int hashCode() {
            return lf4.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public vz2 i() {
            return vz2.e;
        }

        public vz2 j() {
            return k();
        }

        public vz2 k() {
            return vz2.e;
        }

        public vz2 l() {
            return k();
        }

        public qv7 m(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(vz2[] vz2VarArr) {
        }

        public void q(vz2 vz2Var) {
        }

        public void r(qv7 qv7Var) {
        }

        public void s(vz2 vz2Var) {
        }
    }

    public static final class m {
        public static int a() {
            return 8;
        }

        public static int b(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        public static int c() {
            return 32;
        }

        public static int d() {
            return 7;
        }
    }

    public static final class n {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = k.q;
        } else {
            b = l.b;
        }
    }

    public qv7(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new k(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.a = new j(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new i(this, windowInsets);
        } else {
            this.a = new h(this, windowInsets);
        }
    }

    public static vz2 o(vz2 vz2Var, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, vz2Var.a - i2);
        int iMax2 = Math.max(0, vz2Var.b - i3);
        int iMax3 = Math.max(0, vz2Var.c - i4);
        int iMax4 = Math.max(0, vz2Var.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? vz2Var : vz2.b(iMax, iMax2, iMax3, iMax4);
    }

    public static qv7 w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static qv7 x(WindowInsets windowInsets, View view) {
        qv7 qv7Var = new qv7((WindowInsets) lu4.g(windowInsets));
        if (view != null && dq7.T(view)) {
            qv7Var.t(dq7.I(view));
            qv7Var.d(view.getRootView());
        }
        return qv7Var;
    }

    public qv7 a() {
        return this.a.a();
    }

    public qv7 b() {
        return this.a.b();
    }

    public qv7 c() {
        return this.a.c();
    }

    public void d(View view) {
        this.a.d(view);
    }

    public sk1 e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qv7) {
            return lf4.a(this.a, ((qv7) obj).a);
        }
        return false;
    }

    public vz2 f(int i2) {
        return this.a.g(i2);
    }

    public vz2 g() {
        return this.a.i();
    }

    public vz2 h() {
        return this.a.j();
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.a.k().d;
    }

    public int j() {
        return this.a.k().a;
    }

    public int k() {
        return this.a.k().c;
    }

    public int l() {
        return this.a.k().b;
    }

    public boolean m() {
        return !this.a.k().equals(vz2.e);
    }

    public qv7 n(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean p() {
        return this.a.n();
    }

    public qv7 q(int i2, int i3, int i4, int i5) {
        return new b(this).d(vz2.b(i2, i3, i4, i5)).a();
    }

    public void r(vz2[] vz2VarArr) {
        this.a.p(vz2VarArr);
    }

    public void s(vz2 vz2Var) {
        this.a.q(vz2Var);
    }

    public void t(qv7 qv7Var) {
        this.a.r(qv7Var);
    }

    public void u(vz2 vz2Var) {
        this.a.s(vz2Var);
    }

    public WindowInsets v() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }

    public static class c extends f {
        public static Field e;
        public static boolean f;
        public static Constructor g;
        public static boolean h;
        public WindowInsets c;
        public vz2 d;

        public c() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                h = true;
            }
            Constructor constructor = g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // com.zepto.qv7.f
        public qv7 b() {
            a();
            qv7 qv7VarW = qv7.w(this.c);
            qv7VarW.r(this.b);
            qv7VarW.u(this.d);
            return qv7VarW;
        }

        @Override // com.zepto.qv7.f
        public void e(vz2 vz2Var) {
            this.d = vz2Var;
        }

        @Override // com.zepto.qv7.f
        public void g(vz2 vz2Var) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(vz2Var.a, vz2Var.b, vz2Var.c, vz2Var.d);
            }
        }

        public c(qv7 qv7Var) {
            super(qv7Var);
            this.c = qv7Var.v();
        }
    }

    public static class d extends f {
        public final WindowInsets.Builder c;

        public d() {
            this.c = xv7.a();
        }

        @Override // com.zepto.qv7.f
        public qv7 b() {
            a();
            qv7 qv7VarW = qv7.w(this.c.build());
            qv7VarW.r(this.b);
            return qv7VarW;
        }

        @Override // com.zepto.qv7.f
        public void d(vz2 vz2Var) {
            this.c.setMandatorySystemGestureInsets(vz2Var.e());
        }

        @Override // com.zepto.qv7.f
        public void e(vz2 vz2Var) {
            this.c.setStableInsets(vz2Var.e());
        }

        @Override // com.zepto.qv7.f
        public void f(vz2 vz2Var) {
            this.c.setSystemGestureInsets(vz2Var.e());
        }

        @Override // com.zepto.qv7.f
        public void g(vz2 vz2Var) {
            this.c.setSystemWindowInsets(vz2Var.e());
        }

        @Override // com.zepto.qv7.f
        public void h(vz2 vz2Var) {
            this.c.setTappableElementInsets(vz2Var.e());
        }

        public d(qv7 qv7Var) {
            WindowInsets.Builder builderA;
            super(qv7Var);
            WindowInsets windowInsetsV = qv7Var.v();
            if (windowInsetsV != null) {
                builderA = yv7.a(windowInsetsV);
            } else {
                builderA = xv7.a();
            }
            this.c = builderA;
        }
    }

    public static final class b {
        public final f a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e();
            } else if (i >= 29) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        public qv7 a() {
            return this.a.b();
        }

        public b b(int i, vz2 vz2Var) {
            this.a.c(i, vz2Var);
            return this;
        }

        public b c(vz2 vz2Var) {
            this.a.e(vz2Var);
            return this;
        }

        public b d(vz2 vz2Var) {
            this.a.g(vz2Var);
            return this;
        }

        public b(qv7 qv7Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e(qv7Var);
            } else if (i >= 29) {
                this.a = new d(qv7Var);
            } else {
                this.a = new c(qv7Var);
            }
        }
    }

    public qv7(qv7 qv7Var) {
        if (qv7Var != null) {
            l lVar = qv7Var.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.a = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.a = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.a = new g(this, (g) lVar);
            } else {
                this.a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.a = new l(this);
    }
}
