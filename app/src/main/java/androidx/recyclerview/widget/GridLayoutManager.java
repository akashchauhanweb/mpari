package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zepto.r3;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public c O;
    public final Rect P;
    public boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    public static class b extends RecyclerView.q {
        public int e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;
        public boolean d = false;

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iD = d(i, i2);
            this.b.put(i, iD);
            return iD;
        }

        public int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iE = e(i, i2);
            this.a.put(i, iE);
            return iE;
        }

        public int d(int i, int i2) {
            int i3;
            int i4;
            int iC;
            int iA;
            if (!this.d || (iA = a(this.b, i)) == -1) {
                i3 = 0;
                i4 = 0;
                iC = 0;
            } else {
                i3 = this.b.get(iA);
                i4 = iA + 1;
                iC = c(iA, i2) + f(iA);
                if (iC == i2) {
                    i3++;
                    iC = 0;
                }
            }
            int iF = f(i);
            while (i4 < i) {
                int iF2 = f(i4);
                iC += iF2;
                if (iC == i2) {
                    i3++;
                    iC = 0;
                } else if (iC > i2) {
                    i3++;
                    iC = iF2;
                }
                i4++;
            }
            return iC + iF > i2 ? i3 + 1 : i3;
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        f3(RecyclerView.p.o0(context, attributeSet, i, i2).b);
    }

    public static int[] S2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return this.Q ? V2(a0Var) : super.A(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        g3();
        X2();
        return super.C1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        g3();
        X2();
        return super.E1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void G2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.G2(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I1(Rect rect, int i, int i2) {
        int iS;
        int iS2;
        if (this.K == null) {
            super.I1(rect, i, i2);
        }
        int iJ0 = j0() + k0();
        int iM0 = m0() + h0();
        if (this.s == 1) {
            iS2 = RecyclerView.p.s(i2, rect.height() + iM0, f0());
            int[] iArr = this.K;
            iS = RecyclerView.p.s(i, iArr[iArr.length - 1] + iJ0, g0());
        } else {
            iS = RecyclerView.p.s(i, rect.width() + iJ0, g0());
            int[] iArr2 = this.K;
            iS2 = RecyclerView.p.s(i2, iArr2[iArr2.length - 1] + iM0, f0());
        }
        H1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View P0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.P0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    public final void P2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.L[i2];
            b bVar = (b) view.getLayoutParams();
            int iB3 = b3(vVar, a0Var, n0(view));
            bVar.f = iB3;
            bVar.e = i5;
            i5 += iB3;
            i2 += i4;
        }
    }

    public final void Q2() {
        int iO = O();
        for (int i = 0; i < iO; i++) {
            b bVar = (b) N(i).getLayoutParams();
            int iA = bVar.a();
            this.M.put(iA, bVar.f());
            this.N.put(iA, bVar.e());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean R1() {
        return this.D == null && !this.I;
    }

    public final void R2(int i) {
        this.K = S2(this.K, this.J, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int S(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Z2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void T1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.J;
        for (int i = 0; i < this.J && cVar.c(a0Var) && iF > 0; i++) {
            int i2 = cVar.d;
            cVar2.a(i2, Math.max(0, cVar.g));
            iF -= this.O.f(i2);
            cVar.d += cVar.e;
        }
    }

    public final void T2() {
        this.M.clear();
        this.N.clear();
    }

    public final int U2(RecyclerView.a0 a0Var) {
        if (O() != 0 && a0Var.b() != 0) {
            Z1();
            boolean zT2 = t2();
            View viewD2 = d2(!zT2, true);
            View viewC2 = c2(!zT2, true);
            if (viewD2 != null && viewC2 != null) {
                int iB = this.O.b(n0(viewD2), this.J);
                int iB2 = this.O.b(n0(viewC2), this.J);
                int iMax = this.x ? Math.max(0, ((this.O.b(a0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zT2) {
                    return Math.round((iMax * (Math.abs(this.u.d(viewC2) - this.u.g(viewD2)) / ((this.O.b(n0(viewC2), this.J) - this.O.b(n0(viewD2), this.J)) + 1))) + (this.u.n() - this.u.g(viewD2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, r3 r3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.U0(view, r3Var);
            return;
        }
        b bVar = (b) layoutParams;
        int iZ2 = Z2(vVar, a0Var, bVar.a());
        if (this.s == 0) {
            r3Var.X(r3.d.a(bVar.e(), bVar.f(), iZ2, 1, false, false));
        } else {
            r3Var.X(r3.d.a(iZ2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    public final int V2(RecyclerView.a0 a0Var) {
        if (O() != 0 && a0Var.b() != 0) {
            Z1();
            View viewD2 = d2(!t2(), true);
            View viewC2 = c2(!t2(), true);
            if (viewD2 != null && viewC2 != null) {
                if (!t2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int iD = this.u.d(viewC2) - this.u.g(viewD2);
                int iB = this.O.b(n0(viewD2), this.J);
                return (int) ((iD / ((this.O.b(n0(viewC2), this.J) - iB) + 1)) * (this.O.b(a0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    public final void W2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int iA3 = a3(vVar, a0Var, aVar.b);
        if (z) {
            while (iA3 > 0) {
                int i2 = aVar.b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.b = i3;
                iA3 = a3(vVar, a0Var, i3);
            }
            return;
        }
        int iB = a0Var.b() - 1;
        int i4 = aVar.b;
        while (i4 < iB) {
            int i5 = i4 + 1;
            int iA32 = a3(vVar, a0Var, i5);
            if (iA32 <= iA3) {
                break;
            }
            i4 = i5;
            iA3 = iA32;
        }
        aVar.b = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public final void X2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public int Y2(int i, int i2) {
        if (this.s != 1 || !s2()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public final int Z2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.b(i, this.J);
        }
        int iF = vVar.f(i);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public final int a3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.c(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iF = vVar.f(i);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int b3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.f(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iF = vVar.f(i);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.h();
        this.O.g();
    }

    public final void c3(float f, int i) {
        R2(Math.max(Math.round(f * this.J), i));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            Q2();
        }
        super.d1(vVar, a0Var);
        T2();
    }

    public final void d3(View view, int i, boolean z) {
        int iP;
        int iP2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iY2 = Y2(bVar.e, bVar.f);
        if (this.s == 1) {
            iP2 = RecyclerView.p.P(iY2, i, i3, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iP = RecyclerView.p.P(this.u.o(), c0(), i2, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iP3 = RecyclerView.p.P(iY2, i, i2, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iP4 = RecyclerView.p.P(this.u.o(), v0(), i3, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        e3(view, iP2, iP, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.a0 a0Var) {
        super.e1(a0Var);
        this.I = false;
    }

    public final void e3(View view, int i, int i2, boolean z) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z ? N1(view, i, i2, qVar) : L1(view, i, i2, qVar)) {
            view.measure(i, i2);
        }
    }

    public void f3(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i >= 1) {
            this.J = i;
            this.O.h();
            z1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public final void g3() {
        int iB0;
        int iM0;
        if (r2() == 1) {
            iB0 = u0() - k0();
            iM0 = j0();
        } else {
            iB0 = b0() - h0();
            iM0 = m0();
        }
        R2(iB0 - iM0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View l2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
        int i;
        int iO;
        int iO2 = O();
        int i2 = 1;
        if (z2) {
            iO = O() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iO2;
            iO = 0;
        }
        int iB = a0Var.b();
        Z1();
        int iN = this.u.n();
        int i3 = this.u.i();
        View view = null;
        View view2 = null;
        while (iO != i) {
            View viewN = N(iO);
            int iN0 = n0(viewN);
            if (iN0 >= 0 && iN0 < iB && a3(vVar, a0Var, iN0) == 0) {
                if (((RecyclerView.q) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.u.g(viewN) < i3 && this.u.d(viewN) >= iN) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Z2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iF;
        int iF2;
        int iF3;
        int i8;
        int iP;
        int iP2;
        View viewD;
        int iM = this.u.m();
        boolean z = iM != 1073741824;
        int i9 = O() > 0 ? this.K[this.J] : 0;
        if (z) {
            g3();
        }
        boolean z2 = cVar.e == 1;
        int iA3 = this.J;
        if (!z2) {
            iA3 = a3(vVar, a0Var, cVar.d) + b3(vVar, a0Var, cVar.d);
        }
        int i10 = 0;
        while (i10 < this.J && cVar.c(a0Var) && iA3 > 0) {
            int i11 = cVar.d;
            int iB3 = b3(vVar, a0Var, i11);
            if (iB3 > this.J) {
                throw new IllegalArgumentException("Item at position " + i11 + " requires " + iB3 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            iA3 -= iB3;
            if (iA3 < 0 || (viewD = cVar.d(vVar)) == null) {
                break;
            }
            this.L[i10] = viewD;
            i10++;
        }
        if (i10 == 0) {
            bVar.b = true;
            return;
        }
        P2(vVar, a0Var, i10, z2);
        float f = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            View view = this.L[i13];
            if (cVar.l == null) {
                if (z2) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z2) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.P);
            d3(view, iM, false);
            int iE = this.u.e(view);
            if (iE > i12) {
                i12 = iE;
            }
            float f2 = (this.u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            c3(f, i9);
            i12 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                View view2 = this.L[i14];
                d3(view2, 1073741824, true);
                int iE2 = this.u.e(view2);
                if (iE2 > i12) {
                    i12 = iE2;
                }
            }
        }
        for (int i15 = 0; i15 < i10; i15++) {
            View view3 = this.L[i15];
            if (this.u.e(view3) != i12) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.b;
                int i16 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i17 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iY2 = Y2(bVar2.e, bVar2.f);
                if (this.s == 1) {
                    iP2 = RecyclerView.p.P(iY2, 1073741824, i17, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iP = View.MeasureSpec.makeMeasureSpec(i12 - i16, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i17, 1073741824);
                    iP = RecyclerView.p.P(iY2, 1073741824, i16, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                e3(view3, iP2, iP, true);
            }
        }
        bVar.a = i12;
        if (this.s == 1) {
            if (cVar.f == -1) {
                i6 = cVar.b;
                i8 = i6 - i12;
            } else {
                i8 = cVar.b;
                i6 = i8 + i12;
            }
            i4 = i8;
            i5 = 0;
            i3 = 0;
        } else {
            if (cVar.f == -1) {
                i2 = cVar.b;
                i = i2 - i12;
            } else {
                i = cVar.b;
                i2 = i + i12;
            }
            i3 = i;
            i4 = 0;
            i5 = i2;
            i6 = 0;
        }
        int i18 = 0;
        while (i18 < i10) {
            View view4 = this.L[i18];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.s == 1) {
                if (s2()) {
                    int iJ0 = j0() + this.K[this.J - bVar3.e];
                    iF3 = i6;
                    iF = iJ0;
                    iF2 = iJ0 - this.u.f(view4);
                } else {
                    int iJ02 = j0() + this.K[bVar3.e];
                    iF3 = i6;
                    iF2 = iJ02;
                    iF = this.u.f(view4) + iJ02;
                }
                i7 = i4;
            } else {
                int iM0 = m0() + this.K[bVar3.e];
                i7 = iM0;
                iF = i5;
                iF2 = i3;
                iF3 = this.u.f(view4) + iM0;
            }
            F0(view4, iF2, i7, iF, iF3);
            if (bVar3.c() || bVar3.b()) {
                bVar.c = true;
            }
            bVar.d |= view4.hasFocusable();
            i18++;
            i6 = iF3;
            i5 = iF;
            i3 = iF2;
            i4 = i7;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.a0 a0Var) {
        return this.Q ? U2(a0Var) : super.w(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void w2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        super.w2(vVar, a0Var, aVar, i);
        g3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            W2(vVar, a0Var, aVar, i);
        }
        X2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.a0 a0Var) {
        return this.Q ? V2(a0Var) : super.x(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.a0 a0Var) {
        return this.Q ? U2(a0Var) : super.z(a0Var);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        f3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        f3(i);
    }
}
