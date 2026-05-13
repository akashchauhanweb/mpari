package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    public int A;
    public int B;
    public boolean C;
    public d D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;
    public int s;
    public c t;
    public i u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static class a {
        public i a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            this.c = this.d ? this.a.i() : this.a.n();
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.p();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int iP = this.a.p();
            if (iP >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - iP) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int iE = this.c - this.a.e(view);
                    int iN = this.a.n();
                    int iMin = iE - (iN + Math.min(this.a.g(view) - iN, 0));
                    if (iMin < 0) {
                        this.c += Math.min(i2, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.a.g(view);
            int iN2 = iG - this.a.n();
            this.c = iG;
            if (iN2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - iP) - this.a.d(view))) - (iG + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(iN2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a0Var.b();
        }

        public void e() {
            this.b = -1;
            this.c = IntCompanionObject.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    public static class c {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int k;
        public boolean m;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public boolean j = false;
        public List l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.a0 a0Var) {
            int i = this.d;
            return i >= 0 && i < a0Var.b();
        }

        public View d(RecyclerView.v vVar) {
            if (this.l != null) {
                return e();
            }
            View viewO = vVar.o(this.d);
            this.d += this.e;
            return viewO;
        }

        public final View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.d0) this.l.get(i)).a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int iA;
            int size = this.l.size();
            View view2 = null;
            int i = IntCompanionObject.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.d0) this.l.get(i2)).a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.d) * this.e) >= 0 && iA < i) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int c;
        public int e;
        public boolean f;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public boolean c() {
            return this.c >= 0;
        }

        public void d() {
            this.c = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.c = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.c = dVar.c;
            this.e = dVar.e;
            this.f = dVar.f;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private View o2() {
        return N(this.x ? 0 : O() - 1);
    }

    private View p2() {
        return N(this.x ? O() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    public final void A2(RecyclerView.v vVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int iO = O();
        if (!this.x) {
            for (int i4 = 0; i4 < iO; i4++) {
                View viewN = N(i4);
                if (this.u.d(viewN) > i3 || this.u.q(viewN) > i3) {
                    y2(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = iO - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View viewN2 = N(i6);
            if (this.u.d(viewN2) > i3 || this.u.q(viewN2) > i3) {
                y2(vVar, i5, i6);
                return;
            }
        }
    }

    public boolean B2() {
        return this.u.l() == 0 && this.u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return D2(i, vVar, a0Var);
    }

    public final void C2() {
        if (this.s == 1 || !s2()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D1(int i) {
        this.A = i;
        this.B = IntCompanionObject.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.d();
        }
        z1();
    }

    public int D2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        Z1();
        this.t.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        K2(i2, iAbs, true, a0Var);
        c cVar = this.t;
        int iA2 = cVar.g + a2(vVar, cVar, a0Var, false);
        if (iA2 < 0) {
            return 0;
        }
        if (iAbs > iA2) {
            i = i2 * iA2;
        }
        this.u.s(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return D2(i, vVar, a0Var);
    }

    public void E2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        l(null);
        if (i != this.s || this.u == null) {
            i iVarB = i.b(this, i);
            this.u = iVarB;
            this.E.a = iVarB;
            this.s = i;
            z1();
        }
    }

    public void F2(boolean z) {
        l(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        z1();
    }

    public void G2(boolean z) {
        l(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View H(int i) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iN0 = i - n0(N(0));
        if (iN0 >= 0 && iN0 < iO) {
            View viewN = N(iN0);
            if (n0(viewN) == i) {
                return viewN;
            }
        }
        return super.H(i);
    }

    public final boolean H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        View viewL2;
        boolean z = false;
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, a0Var)) {
            aVar.c(viewA0, n0(viewA0));
            return true;
        }
        boolean z2 = this.v;
        boolean z3 = this.y;
        if (z2 != z3 || (viewL2 = l2(vVar, a0Var, aVar.d, z3)) == null) {
            return false;
        }
        aVar.b(viewL2, n0(viewL2));
        if (!a0Var.e() && R1()) {
            int iG = this.u.g(viewL2);
            int iD = this.u.d(viewL2);
            int iN = this.u.n();
            int i = this.u.i();
            boolean z4 = iD <= iN && iG < iN;
            if (iG >= i && iD > i) {
                z = true;
            }
            if (z4 || z) {
                if (aVar.d) {
                    iN = i;
                }
                aVar.c = iN;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    public final boolean I2(RecyclerView.a0 a0Var, a aVar) {
        int i;
        if (!a0Var.e() && (i = this.A) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                aVar.b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.c()) {
                    boolean z = this.D.f;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.u.i() - this.D.e;
                    } else {
                        aVar.c = this.u.n() + this.D.e;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.n() + this.B;
                    }
                    return true;
                }
                View viewH = H(this.A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.d = (this.A < n0(N(0))) == this.x;
                    }
                    aVar.a();
                } else {
                    if (this.u.e(viewH) > this.u.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.u.g(viewH) - this.u.n() < 0) {
                        aVar.c = this.u.n();
                        aVar.d = false;
                        return true;
                    }
                    if (this.u.i() - this.u.d(viewH) < 0) {
                        aVar.c = this.u.i();
                        aVar.d = true;
                        return true;
                    }
                    aVar.c = aVar.d ? this.u.d(viewH) + this.u.p() : this.u.g(viewH);
                }
                return true;
            }
            this.A = -1;
            this.B = IntCompanionObject.MIN_VALUE;
        }
        return false;
    }

    public final void J2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (I2(a0Var, aVar) || H2(vVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.y ? a0Var.b() - 1 : 0;
    }

    public final void K2(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int iN;
        this.t.m = B2();
        this.t.f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(a0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z2 = i == 1;
        c cVar = this.t;
        int i3 = z2 ? iMax2 : iMax;
        cVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View viewO2 = o2();
            c cVar2 = this.t;
            cVar2.e = this.x ? -1 : 1;
            int iN0 = n0(viewO2);
            c cVar3 = this.t;
            cVar2.d = iN0 + cVar3.e;
            cVar3.b = this.u.d(viewO2);
            iN = this.u.d(viewO2) - this.u.i();
        } else {
            View viewP2 = p2();
            this.t.h += this.u.n();
            c cVar4 = this.t;
            cVar4.e = this.x ? 1 : -1;
            int iN02 = n0(viewP2);
            c cVar5 = this.t;
            cVar4.d = iN02 + cVar5.e;
            cVar5.b = this.u.g(viewP2);
            iN = (-this.u.g(viewP2)) + this.u.n();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - iN;
        }
        cVar6.g = iN;
    }

    public final void L2(int i, int i2) {
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        cVar.e = this.x ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean M1() {
        return (c0() == 1073741824 || v0() == 1073741824 || !w0()) ? false : true;
    }

    public final void M2(a aVar) {
        L2(aVar.b, aVar.c);
    }

    public final void N2(int i, int i2) {
        this.t.c = i2 - this.u.n();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.O0(recyclerView, vVar);
        if (this.C) {
            q1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        P1(gVar);
    }

    public final void O2(a aVar) {
        N2(aVar.b, aVar.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View P0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int iX1;
        C2();
        if (O() == 0 || (iX1 = X1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Z1();
        K2(iX1, (int) (this.u.o() * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.g = IntCompanionObject.MIN_VALUE;
        cVar.a = false;
        a2(vVar, cVar, a0Var, true);
        View viewK2 = iX1 == -1 ? k2() : j2();
        View viewP2 = iX1 == -1 ? p2() : o2();
        if (!viewP2.hasFocusable()) {
            return viewK2;
        }
        if (viewK2 == null) {
            return null;
        }
        return viewP2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(e2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean R1() {
        return this.D == null && this.v == this.y;
    }

    public void S1(RecyclerView.a0 a0Var, int[] iArr) {
        int i;
        int iQ2 = q2(a0Var);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = iQ2;
            iQ2 = 0;
        }
        iArr[0] = iQ2;
        iArr[1] = i;
    }

    public void T1(RecyclerView.a0 a0Var, c cVar, RecyclerView.p.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= a0Var.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    public final int U1(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return l.a(a0Var, this.u, d2(!this.z, true), c2(!this.z, true), this, this.z);
    }

    public final int V1(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return l.b(a0Var, this.u, d2(!this.z, true), c2(!this.z, true), this, this.z, this.x);
    }

    public final int W1(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return l.c(a0Var, this.u, d2(!this.z, true), c2(!this.z, true), this, this.z);
    }

    public int X1(int i) {
        if (i == 1) {
            return (this.s != 1 && s2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.s != 1 && s2()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.s == 0) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 33) {
            if (this.s == 1) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 66) {
            if (this.s == 0) {
                return 1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 130 && this.s == 1) {
            return 1;
        }
        return IntCompanionObject.MIN_VALUE;
    }

    public c Y1() {
        return new c();
    }

    public void Z1() {
        if (this.t == null) {
            this.t = Y1();
        }
    }

    public int a2(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            x2(vVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            u2(vVar, a0Var, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !a0Var.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    x2(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public final View b2() {
        return h2(0, O());
    }

    public View c2(boolean z, boolean z2) {
        return this.x ? i2(0, O(), z, z2) : i2(O() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF d(int i) {
        if (O() == 0) {
            return null;
        }
        int i2 = (i < n0(N(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM2;
        int i5;
        View viewH;
        int iG;
        int i6;
        int i7 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            q1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.c()) {
            this.A = this.D.c;
        }
        Z1();
        this.t.a = false;
        C2();
        View viewA0 = a0();
        a aVar = this.E;
        if (!aVar.e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.d = this.x ^ this.y;
            J2(vVar, a0Var, aVar2);
            this.E.e = true;
        } else if (viewA0 != null && (this.u.g(viewA0) >= this.u.i() || this.u.d(viewA0) <= this.u.n())) {
            this.E.c(viewA0, n0(viewA0));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(a0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.u.n();
        int iMax2 = Math.max(0, this.H[1]) + this.u.j();
        if (a0Var.e() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewH = H(i5)) != null) {
            if (this.x) {
                i6 = this.u.i() - this.u.d(viewH);
                iG = this.B;
            } else {
                iG = this.u.g(viewH) - this.u.n();
                i6 = this.B;
            }
            int i8 = i6 - iG;
            if (i8 > 0) {
                iMax += i8;
            } else {
                iMax2 -= i8;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.d ? !this.x : this.x) {
            i7 = 1;
        }
        w2(vVar, a0Var, aVar3, i7);
        B(vVar);
        this.t.m = B2();
        this.t.j = a0Var.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.d) {
            O2(aVar4);
            c cVar2 = this.t;
            cVar2.h = iMax;
            a2(vVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i2 = cVar3.b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                iMax2 += i10;
            }
            M2(this.E);
            c cVar4 = this.t;
            cVar4.h = iMax2;
            cVar4.d += cVar4.e;
            a2(vVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i = cVar5.b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                N2(i9, i2);
                c cVar6 = this.t;
                cVar6.h = i11;
                a2(vVar, cVar6, a0Var, false);
                i2 = this.t.b;
            }
        } else {
            M2(aVar4);
            c cVar7 = this.t;
            cVar7.h = iMax2;
            a2(vVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i = cVar8.b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                iMax += i13;
            }
            O2(this.E);
            c cVar9 = this.t;
            cVar9.h = iMax;
            cVar9.d += cVar9.e;
            a2(vVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i2 = cVar10.b;
            int i14 = cVar10.c;
            if (i14 > 0) {
                L2(i12, i);
                c cVar11 = this.t;
                cVar11.h = i14;
                a2(vVar, cVar11, a0Var, false);
                i = this.t.b;
            }
        }
        if (O() > 0) {
            if (this.x ^ this.y) {
                int iM22 = m2(i, vVar, a0Var, true);
                i3 = i2 + iM22;
                i4 = i + iM22;
                iM2 = n2(i3, vVar, a0Var, false);
            } else {
                int iN2 = n2(i2, vVar, a0Var, true);
                i3 = i2 + iN2;
                i4 = i + iN2;
                iM2 = m2(i4, vVar, a0Var, false);
            }
            i2 = i3 + iM2;
            i = i4 + iM2;
        }
        v2(vVar, a0Var, i2, i);
        if (a0Var.e()) {
            this.E.e();
        } else {
            this.u.t();
        }
        this.v = this.y;
    }

    public View d2(boolean z, boolean z2) {
        return this.x ? i2(O() - 1, -1, z, z2) : i2(0, O(), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.a0 a0Var) {
        super.e1(a0Var);
        this.D = null;
        this.A = -1;
        this.B = IntCompanionObject.MIN_VALUE;
        this.E.e();
    }

    public int e2() {
        View viewI2 = i2(0, O(), false, true);
        if (viewI2 == null) {
            return -1;
        }
        return n0(viewI2);
    }

    public final View f2() {
        return h2(O() - 1, -1);
    }

    public int g2() {
        View viewI2 = i2(O() - 1, -1, false, true);
        if (viewI2 == null) {
            return -1;
        }
        return n0(viewI2);
    }

    public View h2(int i, int i2) {
        int i3;
        int i4;
        Z1();
        if (i2 <= i && i2 >= i) {
            return N(i);
        }
        if (this.u.g(N(i)) < this.u.n()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.d();
            }
            z1();
        }
    }

    public View i2(int i, int i2, boolean z, boolean z2) {
        Z1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable j1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (O() > 0) {
            Z1();
            boolean z = this.v ^ this.x;
            dVar.f = z;
            if (z) {
                View viewO2 = o2();
                dVar.e = this.u.i() - this.u.d(viewO2);
                dVar.c = n0(viewO2);
            } else {
                View viewP2 = p2();
                dVar.c = n0(viewP2);
                dVar.e = this.u.g(viewP2) - this.u.n();
            }
        } else {
            dVar.d();
        }
        return dVar;
    }

    public final View j2() {
        return this.x ? b2() : f2();
    }

    public final View k2() {
        return this.x ? f2() : b2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(String str) {
        if (this.D == null) {
            super.l(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View l2(androidx.recyclerview.widget.RecyclerView.v r17, androidx.recyclerview.widget.RecyclerView.a0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.Z1()
            int r1 = r16.O()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.O()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.i r7 = r0.u
            int r7 = r7.n()
            androidx.recyclerview.widget.i r8 = r0.u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.N(r1)
            int r13 = r0.n0(r12)
            androidx.recyclerview.widget.i r14 = r0.u
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.i r15 = r0.u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.l2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean, boolean):android.view.View");
    }

    public final int m2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -D2(-i3, vVar, a0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.u.i() - i5) <= 0) {
            return i4;
        }
        this.u.s(i2);
        return i2 + i4;
    }

    public final int n2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int iN;
        int iN2 = i - this.u.n();
        if (iN2 <= 0) {
            return 0;
        }
        int i2 = -D2(iN2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (iN = i3 - this.u.n()) <= 0) {
            return i2;
        }
        this.u.s(-iN);
        return i2 - iN;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.s == 1;
    }

    public int q2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.u.o();
        }
        return 0;
    }

    public int r2() {
        return this.s;
    }

    public boolean s2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (O() == 0 || i == 0) {
            return;
        }
        Z1();
        K2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        T1(a0Var, this.t, cVar);
    }

    public boolean t2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void u(int i, RecyclerView.p.c cVar) {
        boolean z;
        int i2;
        d dVar = this.D;
        if (dVar == null || !dVar.c()) {
            C2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.f;
            i2 = dVar2.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int iJ0;
        int iF;
        View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                g(viewD);
            } else {
                h(viewD, 0);
            }
        }
        G0(viewD, 0, 0);
        bVar.a = this.u.e(viewD);
        if (this.s == 1) {
            if (s2()) {
                iF = u0() - k0();
                iJ0 = iF - this.u.f(viewD);
            } else {
                iJ0 = j0();
                iF = this.u.f(viewD) + iJ0;
            }
            if (cVar.f == -1) {
                int i4 = cVar.b;
                i3 = i4;
                i2 = iF;
                i = i4 - bVar.a;
            } else {
                int i5 = cVar.b;
                i = i5;
                i2 = iF;
                i3 = bVar.a + i5;
            }
        } else {
            int iM0 = m0();
            int iF2 = this.u.f(viewD) + iM0;
            if (cVar.f == -1) {
                int i6 = cVar.b;
                i2 = i6;
                i = iM0;
                i3 = iF2;
                iJ0 = i6 - bVar.a;
            } else {
                int i7 = cVar.b;
                i = iM0;
                i2 = bVar.a + i7;
                i3 = iF2;
                iJ0 = i7;
            }
        }
        F0(viewD, iJ0, i, i2, i3);
        if (qVar.c() || qVar.b()) {
            bVar.c = true;
        }
        bVar.d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    public final void v2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        if (!a0Var.g() || O() == 0 || a0Var.e() || !R1()) {
            return;
        }
        List listK = vVar.k();
        int size = listK.size();
        int iN0 = n0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) listK.get(i3);
            if (!d0Var.x()) {
                if ((d0Var.o() < iN0) != this.x) {
                    iE += this.u.e(d0Var.a);
                } else {
                    iE2 += this.u.e(d0Var.a);
                }
            }
        }
        this.t.l = listK;
        if (iE > 0) {
            N2(n0(p2()), i);
            c cVar = this.t;
            cVar.h = iE;
            cVar.c = 0;
            cVar.a();
            a2(vVar, this.t, a0Var, false);
        }
        if (iE2 > 0) {
            L2(n0(o2()), i2);
            c cVar2 = this.t;
            cVar2.h = iE2;
            cVar2.c = 0;
            cVar2.a();
            a2(vVar, this.t, a0Var, false);
        }
        this.t.l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    public void w2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    public final void x2(RecyclerView.v vVar, c cVar) {
        if (!cVar.a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            z2(vVar, i, i2);
        } else {
            A2(vVar, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y0() {
        return true;
    }

    public final void y2(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                t1(i, vVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                t1(i3, vVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    public final void z2(RecyclerView.v vVar, int i, int i2) {
        int iO = O();
        if (i < 0) {
            return;
        }
        int iH = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < iO; i3++) {
                View viewN = N(i3);
                if (this.u.g(viewN) < iH || this.u.r(viewN) < iH) {
                    y2(vVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = iO - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View viewN2 = N(i5);
            if (this.u.g(viewN2) < iH || this.u.r(viewN2) < iH) {
                y2(vVar, i4, i5);
                return;
            }
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = IntCompanionObject.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        E2(i);
        F2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = IntCompanionObject.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d dVarO0 = RecyclerView.p.o0(context, attributeSet, i, i2);
        E2(dVarO0.a);
        F2(dVarO0.c);
        G2(dVarO0.d);
    }
}
