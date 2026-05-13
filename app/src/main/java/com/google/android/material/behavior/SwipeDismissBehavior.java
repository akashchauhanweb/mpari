package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.zepto.dq7;
import com.zepto.oq7;
import com.zepto.r3;
import com.zepto.u3;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {
    public oq7 a;
    public c b;
    public boolean c;
    public boolean d;
    public boolean f;
    public float e = 0.0f;
    public int g = 2;
    public float h = 0.5f;
    public float i = 0.0f;
    public float j = 0.5f;
    public final oq7.c k = new a();

    public class a extends oq7.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // com.zepto.oq7.c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = dq7.B(view) == 1;
            int i3 = SwipeDismissBehavior.this.g;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return SwipeDismissBehavior.L(width, i, width2);
        }

        @Override // com.zepto.oq7.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.zepto.oq7.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // com.zepto.oq7.c
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.d = false;
            }
        }

        @Override // com.zepto.oq7.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // com.zepto.oq7.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.j;
            float fAbs = Math.abs(i - this.a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // com.zepto.oq7.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.zepto.oq7 r5 = r5.a
                int r1 = r3.getTop()
                boolean r5 = r5.O(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                com.zepto.dq7.i0(r3, r5)
                goto L4a
            L3f:
                if (r4 == 0) goto L4a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.b
                if (r4 == 0) goto L4a
                r4.a(r3)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override // com.zepto.oq7.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.J(view);
        }

        public final boolean n(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.h);
            }
            boolean z = dq7.B(view) == 1;
            int i = SwipeDismissBehavior.this.g;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }
    }

    public class b implements u3 {
        public b() {
        }

        @Override // com.zepto.u3
        public boolean a(View view, u3.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z = dq7.B(view) == 1;
            int i = SwipeDismissBehavior.this.g;
            dq7.a0(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i);
    }

    public class d implements Runnable {
        public final View c;
        public final boolean e;

        public d(View view, boolean z) {
            this.c = view;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            oq7 oq7Var = SwipeDismissBehavior.this.a;
            if (oq7Var != null && oq7Var.m(true)) {
                dq7.i0(this.c, this);
            } else {
                if (!this.e || (cVar = SwipeDismissBehavior.this.b) == null) {
                    return;
                }
                cVar.a(this.c);
            }
        }
    }

    public static float K(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int L(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float N(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.F(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public final void M(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.f ? oq7.n(viewGroup, this.e, this.k) : oq7.o(viewGroup, this.k);
        }
    }

    public void O(float f) {
        this.j = K(0.0f, f, 1.0f);
    }

    public void P(c cVar) {
        this.b = cVar;
    }

    public void Q(float f) {
        this.i = K(0.0f, f, 1.0f);
    }

    public void R(int i) {
        this.g = i;
    }

    public final void S(View view) {
        dq7.k0(view, 1048576);
        if (J(view)) {
            dq7.m0(view, r3.a.y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zB = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!zB) {
            return false;
        }
        M(coordinatorLayout);
        return !this.d && this.a.P(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean zP = super.p(coordinatorLayout, view, i);
        if (dq7.z(view) == 0) {
            dq7.B0(view, 1);
            S(view);
        }
        return zP;
    }
}
