package com.zepto;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.zepto.yd2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class v62 extends x2 {
    public static final Rect n = new Rect(IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);
    public static final yd2.a o = new a();
    public static final yd2.b p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = IntCompanionObject.MIN_VALUE;
    public int l = IntCompanionObject.MIN_VALUE;
    public int m = IntCompanionObject.MIN_VALUE;

    public class a implements yd2.a {
        @Override // com.zepto.yd2.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(r3 r3Var, Rect rect) {
            r3Var.j(rect);
        }
    }

    public class b implements yd2.b {
        @Override // com.zepto.yd2.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public r3 a(e56 e56Var, int i) {
            return (r3) e56Var.r(i);
        }

        @Override // com.zepto.yd2.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(e56 e56Var) {
            return e56Var.q();
        }
    }

    public class c extends s3 {
        public c() {
        }

        @Override // com.zepto.s3
        public r3 b(int i) {
            return r3.K(v62.this.H(i));
        }

        @Override // com.zepto.s3
        public r3 d(int i) {
            int i2 = i == 2 ? v62.this.k : v62.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // com.zepto.s3
        public boolean f(int i, int i2, Bundle bundle) {
            return v62.this.P(i, i2, bundle);
        }
    }

    public v62(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (dq7.z(view) == 0) {
            dq7.B0(view, 1);
        }
    }

    public static Rect D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    public static int F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.l;
    }

    public abstract int B(float f, float f2);

    public abstract void C(List list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i, Rect rect) {
        r3 r3Var;
        e56 e56VarY = y();
        int i2 = this.l;
        int iK = IntCompanionObject.MIN_VALUE;
        r3 r3Var2 = i2 == Integer.MIN_VALUE ? null : (r3) e56VarY.e(i2);
        if (i == 1 || i == 2) {
            r3Var = (r3) yd2.d(e56VarY, p, o, r3Var2, i, dq7.B(this.i) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.l;
            if (i3 != Integer.MIN_VALUE) {
                z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i, rect2);
            }
            r3Var = (r3) yd2.c(e56VarY, p, o, r3Var2, rect2, i);
        }
        if (r3Var != null) {
            iK = e56VarY.k(e56VarY.h(r3Var));
        }
        return T(iK);
    }

    public r3 H(int i) {
        return i == -1 ? u() : t(i);
    }

    public final void I(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            G(i, rect);
        }
    }

    public abstract boolean J(int i, int i2, Bundle bundle);

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i, AccessibilityEvent accessibilityEvent) {
    }

    public abstract void M(r3 r3Var);

    public abstract void N(int i, r3 r3Var);

    public abstract void O(int i, boolean z);

    public boolean P(int i, int i2, Bundle bundle) {
        return i != -1 ? Q(i, i2, bundle) : R(i2, bundle);
    }

    public final boolean Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? J(i, i2, bundle) : n(i) : S(i) : o(i) : T(i);
    }

    public final boolean R(int i, Bundle bundle) {
        return dq7.f0(this.i, i, bundle);
    }

    public final boolean S(int i) {
        int i2;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            n(i2);
        }
        this.k = i;
        this.i.invalidate();
        U(i, 32768);
        return true;
    }

    public final boolean T(int i) {
        int i2;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        O(i, true);
        U(i, 8);
        return true;
    }

    public final boolean U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.i, q(i, i2));
    }

    public final void V(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        U(i, 128);
        U(i2, 256);
    }

    @Override // com.zepto.x2
    public s3 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // com.zepto.x2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // com.zepto.x2
    public void g(View view, r3 r3Var) {
        super.g(view, r3Var);
        M(r3Var);
    }

    public final boolean n(int i) {
        if (this.k != i) {
            return false;
        }
        this.k = IntCompanionObject.MIN_VALUE;
        this.i.invalidate();
        U(i, 65536);
        return true;
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = IntCompanionObject.MIN_VALUE;
        O(i, false);
        U(i, 8);
        return true;
    }

    public final boolean p() {
        int i = this.l;
        return i != Integer.MIN_VALUE && J(i, 16, null);
    }

    public final AccessibilityEvent q(int i, int i2) {
        return i != -1 ? r(i, i2) : s(i2);
    }

    public final AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        r3 r3VarH = H(i);
        accessibilityEventObtain.getText().add(r3VarH.r());
        accessibilityEventObtain.setContentDescription(r3VarH.o());
        accessibilityEventObtain.setScrollable(r3VarH.E());
        accessibilityEventObtain.setPassword(r3VarH.D());
        accessibilityEventObtain.setEnabled(r3VarH.z());
        accessibilityEventObtain.setChecked(r3VarH.x());
        L(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(r3VarH.m());
        t3.c(accessibilityEventObtain, this.i, i);
        accessibilityEventObtain.setPackageName(this.i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent s(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    public final r3 t(int i) {
        r3 r3VarI = r3.I();
        r3VarI.a0(true);
        r3VarI.c0(true);
        r3VarI.U("android.view.View");
        Rect rect = n;
        r3VarI.Q(rect);
        r3VarI.R(rect);
        r3VarI.k0(this.i);
        N(i, r3VarI);
        if (r3VarI.r() == null && r3VarI.o() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        r3VarI.j(this.e);
        if (this.e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int i2 = r3VarI.i();
        if ((i2 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((i2 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        r3VarI.i0(this.i.getContext().getPackageName());
        r3VarI.r0(this.i, i);
        if (this.k == i) {
            r3VarI.O(true);
            r3VarI.a(128);
        } else {
            r3VarI.O(false);
            r3VarI.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            r3VarI.a(2);
        } else if (r3VarI.A()) {
            r3VarI.a(1);
        }
        r3VarI.d0(z);
        this.i.getLocationOnScreen(this.g);
        r3VarI.k(this.d);
        if (this.d.equals(rect)) {
            r3VarI.j(this.d);
            if (r3VarI.b != -1) {
                r3 r3VarI2 = r3.I();
                for (int i3 = r3VarI.b; i3 != -1; i3 = r3VarI2.b) {
                    r3VarI2.l0(this.i, -1);
                    r3VarI2.Q(n);
                    N(i3, r3VarI2);
                    r3VarI2.j(this.e);
                    Rect rect2 = this.d;
                    Rect rect3 = this.e;
                    rect2.offset(rect3.left, rect3.top);
                }
                r3VarI2.M();
            }
            this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f)) {
            this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            if (this.d.intersect(this.f)) {
                r3VarI.R(this.d);
                if (E(this.d)) {
                    r3VarI.v0(true);
                }
            }
        }
        return r3VarI;
    }

    public final r3 u() {
        r3 r3VarJ = r3.J(this.i);
        dq7.d0(this.i, r3VarJ);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (r3VarJ.l() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r3VarJ.d(this.i, ((Integer) arrayList.get(i)).intValue());
        }
        return r3VarJ;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        }
        V(IntCompanionObject.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && G(iF, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.k;
    }

    public final e56 y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        e56 e56Var = new e56();
        for (int i = 0; i < arrayList.size(); i++) {
            e56Var.l(((Integer) arrayList.get(i)).intValue(), t(((Integer) arrayList.get(i)).intValue()));
        }
        return e56Var;
    }

    public final void z(int i, Rect rect) {
        H(i).j(rect);
    }
}
