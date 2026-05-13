package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.zepto.fn6;

/* JADX INFO: loaded from: classes.dex */
public abstract class xt7 extends fn6 {
    public static final String[] M = {"android:visibility:visibility", "android:visibility:parent"};
    public int L = 3;

    public class a extends gn6 {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            this.c.setTag(wz4.a, null);
            xq7.a(this.a).c(this.b);
            fn6Var.V(this);
        }

        @Override // com.zepto.gn6, com.zepto.fn6.f
        public void c(fn6 fn6Var) {
            if (this.b.getParent() == null) {
                xq7.a(this.a).a(this.b);
            } else {
                xt7.this.cancel();
            }
        }

        @Override // com.zepto.gn6, com.zepto.fn6.f
        public void d(fn6 fn6Var) {
            xq7.a(this.a).c(this.b);
        }
    }

    public static class b extends AnimatorListenerAdapter implements fn6.f {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public b(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        @Override // com.zepto.fn6.f
        public void a(fn6 fn6Var) {
        }

        @Override // com.zepto.fn6.f
        public void b(fn6 fn6Var) {
            f();
            fn6Var.V(this);
        }

        @Override // com.zepto.fn6.f
        public void c(fn6 fn6Var) {
            g(true);
        }

        @Override // com.zepto.fn6.f
        public void d(fn6 fn6Var) {
            g(false);
        }

        @Override // com.zepto.fn6.f
        public void e(fn6 fn6Var) {
        }

        public final void f() {
            if (!this.f) {
                as7.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            xq7.c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f) {
                return;
            }
            as7.h(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f) {
                return;
            }
            as7.h(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    private void k0(mn6 mn6Var) {
        mn6Var.a.put("android:visibility:visibility", Integer.valueOf(mn6Var.b.getVisibility()));
        mn6Var.a.put("android:visibility:parent", mn6Var.b.getParent());
        int[] iArr = new int[2];
        mn6Var.b.getLocationOnScreen(iArr);
        mn6Var.a.put("android:visibility:screenLocation", iArr);
    }

    @Override // com.zepto.fn6
    public String[] I() {
        return M;
    }

    @Override // com.zepto.fn6
    public boolean K(mn6 mn6Var, mn6 mn6Var2) {
        if (mn6Var == null && mn6Var2 == null) {
            return false;
        }
        if (mn6Var != null && mn6Var2 != null && mn6Var2.a.containsKey("android:visibility:visibility") != mn6Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarL0 = l0(mn6Var, mn6Var2);
        if (cVarL0.a) {
            return cVarL0.c == 0 || cVarL0.d == 0;
        }
        return false;
    }

    @Override // com.zepto.fn6
    public void f(mn6 mn6Var) {
        k0(mn6Var);
    }

    @Override // com.zepto.fn6
    public void i(mn6 mn6Var) {
        k0(mn6Var);
    }

    public final c l0(mn6 mn6Var, mn6 mn6Var2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (mn6Var == null || !mn6Var.a.containsKey("android:visibility:visibility")) {
            cVar.c = -1;
            cVar.e = null;
        } else {
            cVar.c = ((Integer) mn6Var.a.get("android:visibility:visibility")).intValue();
            cVar.e = (ViewGroup) mn6Var.a.get("android:visibility:parent");
        }
        if (mn6Var2 == null || !mn6Var2.a.containsKey("android:visibility:visibility")) {
            cVar.d = -1;
            cVar.f = null;
        } else {
            cVar.d = ((Integer) mn6Var2.a.get("android:visibility:visibility")).intValue();
            cVar.f = (ViewGroup) mn6Var2.a.get("android:visibility:parent");
        }
        if (mn6Var != null && mn6Var2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i == i2 && cVar.e == cVar.f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.b = false;
                    cVar.a = true;
                } else if (i2 == 0) {
                    cVar.b = true;
                    cVar.a = true;
                }
            } else if (cVar.f == null) {
                cVar.b = false;
                cVar.a = true;
            } else if (cVar.e == null) {
                cVar.b = true;
                cVar.a = true;
            }
        } else if (mn6Var == null && cVar.d == 0) {
            cVar.b = true;
            cVar.a = true;
        } else if (mn6Var2 == null && cVar.c == 0) {
            cVar.b = false;
            cVar.a = true;
        }
        return cVar;
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, mn6 mn6Var, mn6 mn6Var2);

    public Animator n0(ViewGroup viewGroup, mn6 mn6Var, int i, mn6 mn6Var2, int i2) {
        if ((this.L & 1) != 1 || mn6Var2 == null) {
            return null;
        }
        if (mn6Var == null) {
            View view = (View) mn6Var2.b.getParent();
            if (l0(v(view, false), J(view, false)).a) {
                return null;
            }
        }
        return m0(viewGroup, mn6Var2.b, mn6Var, mn6Var2);
    }

    public abstract Animator o0(ViewGroup viewGroup, View view, mn6 mn6Var, mn6 mn6Var2);

    @Override // com.zepto.fn6
    public Animator p(ViewGroup viewGroup, mn6 mn6Var, mn6 mn6Var2) {
        c cVarL0 = l0(mn6Var, mn6Var2);
        if (!cVarL0.a) {
            return null;
        }
        if (cVarL0.e == null && cVarL0.f == null) {
            return null;
        }
        return cVarL0.b ? n0(viewGroup, mn6Var, cVarL0.c, mn6Var2, cVarL0.d) : p0(viewGroup, mn6Var, cVarL0.c, mn6Var2, cVarL0.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[PHI: r8
      0x0073: PHI (r8v3 android.view.View) = 
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v6 android.view.View)
     binds: [B:26:0x0048, B:31:0x0057, B:37:0x0082, B:39:0x0085, B:41:0x008b, B:43:0x008f, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator p0(android.view.ViewGroup r18, com.zepto.mn6 r19, int r20, com.zepto.mn6 r21, int r22) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.xt7.p0(android.view.ViewGroup, com.zepto.mn6, int, com.zepto.mn6, int):android.animation.Animator");
    }

    public void q0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.L = i;
    }
}
