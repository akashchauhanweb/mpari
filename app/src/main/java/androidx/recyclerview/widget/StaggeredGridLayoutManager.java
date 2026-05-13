package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    public BitSet B;
    public boolean G;
    public boolean H;
    public e I;
    public int J;
    public int[] O;
    public f[] t;
    public i u;
    public i v;
    public int w;
    public int x;
    public final androidx.recyclerview.widget.f y;
    public int s = -1;
    public boolean z = false;
    public boolean A = false;
    public int C = -1;
    public int D = IntCompanionObject.MIN_VALUE;
    public d E = new d();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.Y1();
        }
    }

    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.n();
        }

        public void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.n() + i;
            }
        }

        public void c() {
            this.a = -1;
            this.b = IntCompanionObject.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = fVarArr[i].p(IntCompanionObject.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {
        public f e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int c;
        public int e;
        public int f;
        public int[] g;
        public int h;
        public int[] i;
        public List j;
        public boolean k;
        public boolean l;
        public boolean m;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public void c() {
            this.g = null;
            this.f = 0;
            this.c = -1;
            this.e = -1;
        }

        public void d() {
            this.g = null;
            this.f = 0;
            this.h = 0;
            this.i = null;
            this.j = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            if (this.f > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.h);
            if (this.h > 0) {
                parcel.writeIntArray(this.i);
            }
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeList(this.j);
        }

        public e(Parcel parcel) {
            this.c = parcel.readInt();
            this.e = parcel.readInt();
            int i = parcel.readInt();
            this.f = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.g = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.h = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.i = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.k = parcel.readInt() == 1;
            this.l = parcel.readInt() == 1;
            this.m = parcel.readInt() == 1;
            this.j = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f = eVar.f;
            this.c = eVar.c;
            this.e = eVar.e;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.j = eVar.j;
        }
    }

    public class f {
        public ArrayList a = new ArrayList();
        public int b = IntCompanionObject.MIN_VALUE;
        public int c = IntCompanionObject.MIN_VALUE;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public void a(View view) {
            c cVarN = n(view);
            cVarN.e = this;
            this.a.add(view);
            this.c = IntCompanionObject.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = IntCompanionObject.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void b(boolean z, int i) {
            int iL = z ? l(IntCompanionObject.MIN_VALUE) : p(IntCompanionObject.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iL >= StaggeredGridLayoutManager.this.u.i()) {
                if (z || iL <= StaggeredGridLayoutManager.this.u.n()) {
                    if (i != Integer.MIN_VALUE) {
                        iL += i;
                    }
                    this.c = iL;
                    this.b = iL;
                }
            }
        }

        public void c() {
            d.a aVarF;
            ArrayList arrayList = this.a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (cVarN.f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.e == 1) {
                this.c += aVarF.c(this.e);
            }
        }

        public void d() {
            d.a aVarF;
            View view = (View) this.a.get(0);
            c cVarN = n(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (cVarN.f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.e == -1) {
                this.b -= aVarF.c(this.e);
            }
        }

        public void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.z ? i(this.a.size() - 1, -1, true) : i(0, this.a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.z ? i(0, this.a.size(), true) : i(this.a.size() - 1, -1, true);
        }

        public int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iN = StaggeredGridLayoutManager.this.u.n();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.a.get(i);
                int iG = StaggeredGridLayoutManager.this.u.g(view);
                int iD = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iG >= i3 : iG > i3;
                if (!z3 ? iD > iN : iD >= iN) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iG >= iN && iD <= i3) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                        if (iG < iN || iD > i3) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                    }
                }
                i += i4;
            }
            return -1;
        }

        public int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        public int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        public int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.n0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.n0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.n0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.n0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        public int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = IntCompanionObject.MIN_VALUE;
            this.c = IntCompanionObject.MIN_VALUE;
        }

        public void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        public void s() {
            int size = this.a.size();
            View view = (View) this.a.remove(size - 1);
            c cVarN = n(view);
            cVarN.e = null;
            if (cVarN.c() || cVarN.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view);
            }
            if (size == 1) {
                this.b = IntCompanionObject.MIN_VALUE;
            }
            this.c = IntCompanionObject.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.a.remove(0);
            c cVarN = n(view);
            cVarN.e = null;
            if (this.a.size() == 0) {
                this.c = IntCompanionObject.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view);
            }
            this.b = IntCompanionObject.MIN_VALUE;
        }

        public void u(View view) {
            c cVarN = n(view);
            cVarN.e = this;
            this.a.add(0, view);
            this.b = IntCompanionObject.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = IntCompanionObject.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.p.d dVarO0 = RecyclerView.p.o0(context, attributeSet, i, i2);
        N2(dVarO0.a);
        P2(dVarO0.b);
        O2(dVarO0.c);
        this.y = new androidx.recyclerview.widget.f();
        g2();
    }

    private void A2(View view, int i, int i2, boolean z) {
        o(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iX2 = X2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iX22 = X2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? N1(view, iX2, iX22, cVar) : L1(view, iX2, iX22, cVar)) {
            view.measure(iX2, iX22);
        }
    }

    private void K2() {
        if (this.w == 1 || !z2()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    private int a2(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.a(a0Var, this.u, k2(!this.N), j2(!this.N), this, this.N);
    }

    private int b2(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.b(a0Var, this.u, k2(!this.N), j2(!this.N), this, this.N, this.A);
    }

    private int c2(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.c(a0Var, this.u, k2(!this.N), j2(!this.N), this, this.N);
    }

    private int d2(int i) {
        if (i == 1) {
            return (this.w != 1 && z2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.w != 1 && z2()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.w == 0) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 33) {
            if (this.w == 1) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 66) {
            if (this.w == 0) {
                return 1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 130 && this.w == 1) {
            return 1;
        }
        return IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return c2(a0Var);
    }

    public final void B2(View view, c cVar, boolean z) {
        if (cVar.f) {
            if (this.w == 1) {
                A2(view, this.J, RecyclerView.p.P(b0(), c0(), m0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
                return;
            } else {
                A2(view, RecyclerView.p.P(u0(), v0(), j0() + k0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
        }
        if (this.w == 1) {
            A2(view, RecyclerView.p.P(this.x, v0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.P(b0(), c0(), m0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            A2(view, RecyclerView.p.P(u0(), v0(), j0() + k0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.P(this.x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return L2(i, vVar, a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D1(int i) {
        e eVar = this.I;
        if (eVar != null && eVar.c != i) {
            eVar.c();
        }
        this.C = i;
        this.D = IntCompanionObject.MIN_VALUE;
        z1();
    }

    public final boolean D2(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == z2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return L2(i, vVar, a0Var);
    }

    public void E2(int i, RecyclerView.a0 a0Var) {
        int iP2;
        int i2;
        if (i > 0) {
            iP2 = q2();
            i2 = 1;
        } else {
            iP2 = p2();
            i2 = -1;
        }
        this.y.a = true;
        U2(iP2, a0Var);
        M2(i2);
        androidx.recyclerview.widget.f fVar = this.y;
        fVar.c = iP2 + fVar.d;
        fVar.b = Math.abs(i);
    }

    public final void F2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }

    public final void G2(RecyclerView.v vVar, androidx.recyclerview.widget.f fVar) {
        if (!fVar.a || fVar.i) {
            return;
        }
        if (fVar.b == 0) {
            if (fVar.e == -1) {
                H2(vVar, fVar.g);
                return;
            } else {
                I2(vVar, fVar.f);
                return;
            }
        }
        if (fVar.e != -1) {
            int iT2 = t2(fVar.g) - fVar.g;
            I2(vVar, iT2 < 0 ? fVar.f : Math.min(iT2, fVar.b) + fVar.f);
        } else {
            int i = fVar.f;
            int iS2 = i - s2(i);
            H2(vVar, iS2 < 0 ? fVar.g : fVar.g - Math.min(iS2, fVar.b));
        }
    }

    public final void H2(RecyclerView.v vVar, int i) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.u.g(viewN) < i || this.u.r(viewN) < i) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].s();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.s();
            }
            s1(viewN, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(int i) {
        super.I0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I1(Rect rect, int i, int i2) {
        int iS;
        int iS2;
        int iJ0 = j0() + k0();
        int iM0 = m0() + h0();
        if (this.w == 1) {
            iS2 = RecyclerView.p.s(i2, rect.height() + iM0, f0());
            iS = RecyclerView.p.s(i, (this.x * this.s) + iJ0, g0());
        } else {
            iS = RecyclerView.p.s(i, rect.width() + iJ0, g0());
            iS2 = RecyclerView.p.s(i2, (this.x * this.s) + iM0, f0());
        }
        H1(iS, iS2);
    }

    public final void I2(RecyclerView.v vVar, int i) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.u.d(viewN) > i || this.u.q(viewN) > i) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].t();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.t();
            }
            s1(viewN, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(int i) {
        super.J0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    public final void J2() {
        if (this.v.l() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i = 0; i < iO; i++) {
            View viewN = N(i);
            float fE = this.v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i2 = this.x;
        int iRound = Math.round(fMax * this.s);
        if (this.v.l() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.v.o());
        }
        V2(iRound);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < iO; i3++) {
            View viewN2 = N(i3);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f) {
                if (z2() && this.w == 1) {
                    int i4 = this.s;
                    int i5 = cVar.e.e;
                    viewN2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = cVar.e.e;
                    int i7 = this.x * i6;
                    int i8 = i6 * i2;
                    if (this.w == 1) {
                        viewN2.offsetLeftAndRight(i7 - i8);
                    } else {
                        viewN2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
    }

    public int L2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        E2(i, a0Var);
        int iH2 = h2(vVar, this.y, a0Var);
        if (this.y.b >= iH2) {
            i = i < 0 ? -iH2 : iH2;
        }
        this.u.s(-i);
        this.G = this.A;
        androidx.recyclerview.widget.f fVar = this.y;
        fVar.b = 0;
        G2(vVar, fVar);
        return i;
    }

    public final void M2(int i) {
        androidx.recyclerview.widget.f fVar = this.y;
        fVar.e = i;
        fVar.d = this.A != (i == -1) ? -1 : 1;
    }

    public void N2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i == this.w) {
            return;
        }
        this.w = i;
        i iVar = this.u;
        this.u = this.v;
        this.v = iVar;
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.O0(recyclerView, vVar);
        u1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        P1(gVar);
    }

    public void O2(boolean z) {
        l(null);
        e eVar = this.I;
        if (eVar != null && eVar.k != z) {
            eVar.k = z;
        }
        this.z = z;
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View P0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View viewG;
        View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        K2();
        int iD2 = d2(i);
        if (iD2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewG.getLayoutParams();
        boolean z = cVar.f;
        f fVar = cVar.e;
        int iQ2 = iD2 == 1 ? q2() : p2();
        U2(iQ2, a0Var);
        M2(iD2);
        androidx.recyclerview.widget.f fVar2 = this.y;
        fVar2.c = fVar2.d + iQ2;
        fVar2.b = (int) (this.u.o() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.y;
        fVar3.h = true;
        fVar3.a = false;
        h2(vVar, fVar3, a0Var);
        this.G = this.A;
        if (!z && (viewM = fVar.m(iQ2, iD2)) != null && viewM != viewG) {
            return viewM;
        }
        if (D2(iD2)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View viewM2 = this.t[i2].m(iQ2, iD2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View viewM3 = this.t[i3].m(iQ2, iD2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (iD2 == -1);
        if (!z) {
            View viewH = H(z2 ? fVar.f() : fVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (D2(iD2)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.e) {
                    View viewH2 = H(z2 ? this.t[i4].f() : this.t[i4].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                View viewH3 = H(z2 ? this.t[i5].f() : this.t[i5].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void P2(int i) {
        l(null);
        if (i != this.s) {
            y2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new f(i2);
            }
            z1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (O() > 0) {
            View viewK2 = k2(false);
            View viewJ2 = j2(false);
            if (viewK2 == null || viewJ2 == null) {
                return;
            }
            int iN0 = n0(viewK2);
            int iN02 = n0(viewJ2);
            if (iN0 < iN02) {
                accessibilityEvent.setFromIndex(iN0);
                accessibilityEvent.setToIndex(iN02);
            } else {
                accessibilityEvent.setFromIndex(iN02);
                accessibilityEvent.setToIndex(iN0);
            }
        }
    }

    public final void Q2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                W2(this.t[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean R1() {
        return this.I == null;
    }

    public final boolean R2(RecyclerView.a0 a0Var, b bVar) {
        bVar.a = this.G ? m2(a0Var.b()) : i2(a0Var.b());
        bVar.b = IntCompanionObject.MIN_VALUE;
        return true;
    }

    public final void S1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    public boolean S2(RecyclerView.a0 a0Var, b bVar) {
        int i;
        if (!a0Var.e() && (i = this.C) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.c == -1 || eVar.f < 1) {
                    View viewH = H(this.C);
                    if (viewH != null) {
                        bVar.a = this.A ? q2() : p2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.D) - this.u.d(viewH);
                            } else {
                                bVar.b = (this.u.n() + this.D) - this.u.g(viewH);
                            }
                            return true;
                        }
                        if (this.u.e(viewH) > this.u.o()) {
                            bVar.b = bVar.c ? this.u.i() : this.u.n();
                            return true;
                        }
                        int iG = this.u.g(viewH) - this.u.n();
                        if (iG < 0) {
                            bVar.b = -iG;
                            return true;
                        }
                        int i2 = this.u.i() - this.u.d(viewH);
                        if (i2 < 0) {
                            bVar.b = i2;
                            return true;
                        }
                        bVar.b = IntCompanionObject.MIN_VALUE;
                    } else {
                        int i3 = this.C;
                        bVar.a = i3;
                        int i4 = this.D;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = X1(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = IntCompanionObject.MIN_VALUE;
                    bVar.a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = IntCompanionObject.MIN_VALUE;
        }
        return false;
    }

    public final void T1(b bVar) {
        e eVar = this.I;
        int i = eVar.f;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    e eVar2 = this.I;
                    int i3 = eVar2.g[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.l ? this.u.i() : this.u.n();
                    }
                    this.t[i2].v(i3);
                }
            } else {
                eVar.d();
                e eVar3 = this.I;
                eVar3.c = eVar3.e;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.m;
        O2(eVar4.k);
        K2();
        e eVar5 = this.I;
        int i4 = eVar5.c;
        if (i4 != -1) {
            this.C = i4;
            bVar.c = eVar5.l;
        } else {
            bVar.c = this.A;
        }
        if (eVar5.h > 1) {
            d dVar = this.E;
            dVar.a = eVar5.i;
            dVar.b = eVar5.j;
        }
    }

    public void T2(RecyclerView.a0 a0Var, b bVar) {
        if (S2(a0Var, bVar) || R2(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    public boolean U1() {
        int iL = this.t[0].l(IntCompanionObject.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(IntCompanionObject.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    public final void U2(int i, RecyclerView.a0 a0Var) {
        int iO;
        int iO2;
        int iC;
        androidx.recyclerview.widget.f fVar = this.y;
        boolean z = false;
        fVar.b = 0;
        fVar.c = i;
        if (!D0() || (iC = a0Var.c()) == -1) {
            iO = 0;
            iO2 = 0;
        } else {
            if (this.A == (iC < i)) {
                iO = this.u.o();
                iO2 = 0;
            } else {
                iO2 = this.u.o();
                iO = 0;
            }
        }
        if (R()) {
            this.y.f = this.u.n() - iO2;
            this.y.g = this.u.i() + iO;
        } else {
            this.y.g = this.u.h() + iO;
            this.y.f = -iO2;
        }
        androidx.recyclerview.widget.f fVar2 = this.y;
        fVar2.h = false;
        fVar2.a = true;
        if (this.u.l() == 0 && this.u.h() == 0) {
            z = true;
        }
        fVar2.i = z;
    }

    public boolean V1() {
        int iP = this.t[0].p(IntCompanionObject.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(IntCompanionObject.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    public void V2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.l());
    }

    public final void W1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.e == 1) {
            if (cVar.f) {
                S1(view);
                return;
            } else {
                cVar.e.a(view);
                return;
            }
        }
        if (cVar.f) {
            F2(view);
        } else {
            cVar.e.u(view);
        }
    }

    public final void W2(f fVar, int i, int i2) {
        int iJ = fVar.j();
        if (i == -1) {
            if (fVar.o() + iJ <= i2) {
                this.B.set(fVar.e, false);
            }
        } else if (fVar.k() - iJ >= i2) {
            this.B.set(fVar.e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i, int i2) {
        w2(i, i2, 1);
    }

    public final int X1(int i) {
        if (O() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < p2()) != this.A ? -1 : 1;
    }

    public final int X2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView) {
        this.E.b();
        z1();
    }

    public boolean Y1() {
        int iP2;
        int iQ2;
        if (O() == 0 || this.F == 0 || !x0()) {
            return false;
        }
        if (this.A) {
            iP2 = q2();
            iQ2 = p2();
        } else {
            iP2 = p2();
            iQ2 = q2();
        }
        if (iP2 == 0 && x2() != null) {
            this.E.b();
            A1();
            z1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i = this.A ? -1 : 1;
        int i2 = iQ2 + 1;
        d.a aVarE = this.E.e(iP2, i2, i, true);
        if (aVarE == null) {
            this.M = false;
            this.E.d(i2);
            return false;
        }
        d.a aVarE2 = this.E.e(iP2, aVarE.c, i * (-1), true);
        if (aVarE2 == null) {
            this.E.d(aVarE.c);
        } else {
            this.E.d(aVarE2.c + 1);
        }
        A1();
        z1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        w2(i, i2, 8);
    }

    public final boolean Z1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.u.i()) {
                ArrayList arrayList = fVar.a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (fVar.o() > this.u.n()) {
            return !fVar.n((View) fVar.a.get(0)).f;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i, int i2) {
        w2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i, int i2, Object obj) {
        w2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF d(int i) {
        int iX1 = X1(i);
        PointF pointF = new PointF();
        if (iX1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = iX1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iX1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        C2(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.a0 a0Var) {
        super.e1(a0Var);
        this.C = -1;
        this.D = IntCompanionObject.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public final d.a e2(int i) {
        d.a aVar = new d.a();
        aVar.f = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.f[i2] = i - this.t[i2].l(i);
        }
        return aVar;
    }

    public final d.a f2(int i) {
        d.a aVar = new d.a();
        aVar.f = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.f[i2] = this.t[i2].p(i) - i;
        }
        return aVar;
    }

    public final void g2() {
        this.u = i.b(this, this.w);
        this.v = i.b(this, 1 - this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int h2(RecyclerView.v vVar, androidx.recyclerview.widget.f fVar, RecyclerView.a0 a0Var) {
        f fVarV2;
        int iE;
        int i;
        int iE2;
        int iE3;
        boolean z;
        ?? r9 = 0;
        this.B.set(0, this.s, true);
        int i2 = this.y.i ? fVar.e == 1 ? IntCompanionObject.MAX_VALUE : IntCompanionObject.MIN_VALUE : fVar.e == 1 ? fVar.g + fVar.b : fVar.f - fVar.b;
        Q2(fVar.e, i2);
        int i3 = this.A ? this.u.i() : this.u.n();
        ?? r0 = false;
        while (fVar.a(a0Var) && (this.y.i || !this.B.isEmpty())) {
            View viewB = fVar.b(vVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.E.g(iA);
            ?? r3 = iG == -1 ? 1 : r9;
            if (r3 != 0) {
                fVarV2 = cVar.f ? this.t[r9] : v2(fVar);
                this.E.n(iA, fVarV2);
            } else {
                fVarV2 = this.t[iG];
            }
            f fVar2 = fVarV2;
            cVar.e = fVar2;
            if (fVar.e == 1) {
                i(viewB);
            } else {
                j(viewB, r9);
            }
            B2(viewB, cVar, r9);
            if (fVar.e == 1) {
                int iR2 = cVar.f ? r2(i3) : fVar2.l(i3);
                int iE4 = this.u.e(viewB) + iR2;
                if (r3 != 0 && cVar.f) {
                    d.a aVarE2 = e2(iR2);
                    aVarE2.e = -1;
                    aVarE2.c = iA;
                    this.E.a(aVarE2);
                }
                i = iE4;
                iE = iR2;
            } else {
                int iU2 = cVar.f ? u2(i3) : fVar2.p(i3);
                iE = iU2 - this.u.e(viewB);
                if (r3 != 0 && cVar.f) {
                    d.a aVarF2 = f2(iU2);
                    aVarF2.e = 1;
                    aVarF2.c = iA;
                    this.E.a(aVarF2);
                }
                i = iU2;
            }
            if (cVar.f && fVar.d == -1) {
                if (r3 != 0) {
                    this.M = true;
                } else {
                    if (!(fVar.e == 1 ? U1() : V1())) {
                        d.a aVarF = this.E.f(iA);
                        if (aVarF != null) {
                            aVarF.g = true;
                        }
                        this.M = true;
                    }
                }
            }
            W1(viewB, cVar, fVar);
            if (z2() && this.w == 1) {
                int i4 = cVar.f ? this.v.i() : this.v.i() - (((this.s - 1) - fVar2.e) * this.x);
                iE3 = i4;
                iE2 = i4 - this.v.e(viewB);
            } else {
                int iN = cVar.f ? this.v.n() : (fVar2.e * this.x) + this.v.n();
                iE2 = iN;
                iE3 = this.v.e(viewB) + iN;
            }
            if (this.w == 1) {
                F0(viewB, iE2, iE, iE3, i);
            } else {
                F0(viewB, iE, iE2, i, iE3);
            }
            if (cVar.f) {
                Q2(this.y.e, i2);
            } else {
                W2(fVar2, this.y.e, i2);
            }
            G2(vVar, this.y);
            if (!this.y.h || !viewB.hasFocusable()) {
                z = false;
            } else if (cVar.f) {
                this.B.clear();
                z = false;
            } else {
                z = false;
                this.B.set(fVar2.e, false);
            }
            r9 = z;
            r0 = true;
        }
        ?? r32 = r9;
        if (r0 == false) {
            G2(vVar, this.y);
        }
        int iN2 = this.y.e == -1 ? this.u.n() - u2(this.u.n()) : r2(this.u.i()) - this.u.i();
        return iN2 > 0 ? Math.min(fVar.b, iN2) : r32 == true ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.c();
                this.I.d();
            }
            z1();
        }
    }

    public final int i2(int i) {
        int iO = O();
        for (int i2 = 0; i2 < iO; i2++) {
            int iN0 = n0(N(i2));
            if (iN0 >= 0 && iN0 < i) {
                return iN0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable j1() {
        int iP;
        int iN;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.k = this.z;
        eVar.l = this.G;
        eVar.m = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar.h = 0;
        } else {
            eVar.i = iArr;
            eVar.h = iArr.length;
            eVar.j = dVar.b;
        }
        if (O() > 0) {
            eVar.c = this.G ? q2() : p2();
            eVar.e = l2();
            int i = this.s;
            eVar.f = i;
            eVar.g = new int[i];
            for (int i2 = 0; i2 < this.s; i2++) {
                if (this.G) {
                    iP = this.t[i2].l(IntCompanionObject.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iN = this.u.i();
                        iP -= iN;
                    }
                } else {
                    iP = this.t[i2].p(IntCompanionObject.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iN = this.u.n();
                        iP -= iN;
                    }
                }
                eVar.g[i2] = iP;
            }
        } else {
            eVar.c = -1;
            eVar.e = -1;
            eVar.f = 0;
        }
        return eVar;
    }

    public View j2(boolean z) {
        int iN = this.u.n();
        int i = this.u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.u.g(viewN);
            int iD = this.u.d(viewN);
            if (iD > iN && iG < i) {
                if (iD <= i || !z) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(int i) {
        if (i == 0) {
            Y1();
        }
    }

    public View k2(boolean z) {
        int iN = this.u.n();
        int i = this.u.i();
        int iO = O();
        View view = null;
        for (int i2 = 0; i2 < iO; i2++) {
            View viewN = N(i2);
            int iG = this.u.g(viewN);
            if (this.u.d(viewN) > iN && iG < i) {
                if (iG >= iN || !z) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(String str) {
        if (this.I == null) {
            super.l(str);
        }
    }

    public int l2() {
        View viewJ2 = this.A ? j2(true) : k2(true);
        if (viewJ2 == null) {
            return -1;
        }
        return n0(viewJ2);
    }

    public final int m2(int i) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iN0 = n0(N(iO));
            if (iN0 >= 0 && iN0 < i) {
                return iN0;
            }
        }
        return 0;
    }

    public final void n2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i;
        int iR2 = r2(IntCompanionObject.MIN_VALUE);
        if (iR2 != Integer.MIN_VALUE && (i = this.u.i() - iR2) > 0) {
            int i2 = i - (-L2(-i, vVar, a0Var));
            if (!z || i2 <= 0) {
                return;
            }
            this.u.s(i2);
        }
    }

    public final void o2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int iN;
        int iU2 = u2(IntCompanionObject.MAX_VALUE);
        if (iU2 != Integer.MAX_VALUE && (iN = iU2 - this.u.n()) > 0) {
            int iL2 = iN - L2(iN, vVar, a0Var);
            if (!z || iL2 <= 0) {
                return;
            }
            this.u.s(-iL2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.w == 0;
    }

    public int p2() {
        if (O() == 0) {
            return 0;
        }
        return n0(N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.w == 1;
    }

    public int q2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return n0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public final int r2(int i) {
        int iL = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int iL2 = this.t[i2].l(i);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    public final int s2(int i) {
        int iP = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int iP2 = this.t[i2].p(i);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.w != 0) {
            i = i2;
        }
        if (O() == 0 || i == 0) {
            return;
        }
        E2(i, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.s; i4++) {
            androidx.recyclerview.widget.f fVar = this.y;
            if (fVar.d == -1) {
                iL = fVar.f;
                iP = this.t[i4].p(iL);
            } else {
                iL = this.t[i4].l(fVar.g);
                iP = this.y.g;
            }
            int i5 = iL - iP;
            if (i5 >= 0) {
                this.O[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.O, 0, i3);
        for (int i6 = 0; i6 < i3 && this.y.a(a0Var); i6++) {
            cVar.a(this.y.c, this.O[i6]);
            androidx.recyclerview.widget.f fVar2 = this.y;
            fVar2.c += fVar2.d;
        }
    }

    public final int t2(int i) {
        int iL = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int iL2 = this.t[i2].l(i);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    public final int u2(int i) {
        int iP = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int iP2 = this.t[i2].p(i);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.a0 a0Var) {
        return a2(a0Var);
    }

    public final f v2(androidx.recyclerview.widget.f fVar) {
        int i;
        int i2;
        int i3;
        if (D2(fVar.e)) {
            i2 = this.s - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.s;
            i2 = 0;
            i3 = 1;
        }
        f fVar2 = null;
        if (fVar.e == 1) {
            int iN = this.u.n();
            int i4 = IntCompanionObject.MAX_VALUE;
            while (i2 != i) {
                f fVar3 = this.t[i2];
                int iL = fVar3.l(iN);
                if (iL < i4) {
                    fVar2 = fVar3;
                    i4 = iL;
                }
                i2 += i3;
            }
            return fVar2;
        }
        int i5 = this.u.i();
        int i6 = IntCompanionObject.MIN_VALUE;
        while (i2 != i) {
            f fVar4 = this.t[i2];
            int iP = fVar4.p(i5);
            if (iP > i6) {
                fVar2 = fVar4;
                i6 = iP;
            }
            i2 += i3;
        }
        return fVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.a0 a0Var) {
        return b2(a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.q2()
            goto Ld
        L9:
            int r0 = r6.p2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.A
            if (r7 == 0) goto L4e
            int r7 = r6.p2()
            goto L52
        L4e:
            int r7 = r6.q2()
        L52:
            if (r3 > r7) goto L57
            r6.z1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.a0 a0Var) {
        return c2(a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View x2() {
        /*
            r12 = this;
            int r0 = r12.O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.z2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            boolean r9 = r12.Z1(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.N(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.i r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.i r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.a0 a0Var) {
        return a2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y0() {
        return this.F != 0;
    }

    public void y2() {
        this.E.b();
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.a0 a0Var) {
        return b2(a0Var);
    }

    public boolean z2() {
        return d0() == 1;
    }

    public static class d {
        public int[] a;
        public List b;

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = (a) this.b.get(i);
                if (aVar2.c == aVar.c) {
                    this.b.remove(i);
                }
                if (aVar2.c >= aVar.c) {
                    this.b.add(i, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.b.get(size)).c >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public a e(int i, int i2, int i3, boolean z) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = (a) this.b.get(i4);
                int i5 = aVar.c;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.e == i3 || (z && aVar.g))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                if (aVar.c == i) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int iMin = Math.min(i2 + 1, this.a.length);
            Arrays.fill(this.a, i, iMin, -1);
            return iMin;
        }

        public final int i(int i) {
            if (this.b == null) {
                return -1;
            }
            a aVarF = f(i);
            if (aVarF != null) {
                this.b.remove(aVarF);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (((a) this.b.get(i2)).c >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            a aVar = (a) this.b.get(i2);
            this.b.remove(i2);
            return aVar.c;
        }

        public void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            l(i, i2);
        }

        public void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        public final void l(int i, int i2) {
            List list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                int i3 = aVar.c;
                if (i3 >= i) {
                    aVar.c = i3 + i2;
                }
            }
        }

        public final void m(int i, int i2) {
            List list = this.b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                int i4 = aVar.c;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        aVar.c = i4 - i2;
                    }
                }
            }
        }

        public void n(int i, f fVar) {
            c(i);
            this.a[i] = fVar.e;
        }

        public int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0022a();
            public int c;
            public int e;
            public int[] f;
            public boolean g;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0022a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(Parcel parcel) {
                this.c = parcel.readInt();
                this.e = parcel.readInt();
                this.g = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int c(int i) {
                int[] iArr = this.f;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.c + ", mGapDir=" + this.e + ", mHasUnwantedGapAfter=" + this.g + ", mGapPerSpan=" + Arrays.toString(this.f) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.c);
                parcel.writeInt(this.e);
                parcel.writeInt(this.g ? 1 : 0);
                int[] iArr = this.f;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f);
                }
            }

            public a() {
            }
        }
    }
}
