package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.carousel.b;
import com.zepto.er3;
import com.zepto.jz4;
import com.zepto.kb0;
import com.zepto.kx3;
import com.zepto.lu4;
import com.zepto.m15;
import com.zepto.nb0;
import com.zepto.ob0;
import com.zepto.rp;
import com.zepto.sr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.p implements kb0, RecyclerView.z.b {
    public int A;
    public Map B;
    public nb0 C;
    public final View.OnLayoutChangeListener D;
    public int E;
    public int F;
    public int G;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public final c w;
    public ob0 x;
    public com.google.android.material.carousel.c y;
    public com.google.android.material.carousel.b z;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public PointF a(int i) {
            return CarouselLayoutManager.this.d(i);
        }

        @Override // androidx.recyclerview.widget.g
        public int t(View view, int i) {
            if (CarouselLayoutManager.this.y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.n0(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int u(View view, int i) {
            if (CarouselLayoutManager.this.y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.n0(view));
        }
    }

    public static final class b {
        public final View a;
        public final float b;
        public final float c;
        public final d d;

        public b(View view, float f, float f2, d dVar) {
            this.a = view;
            this.b = f;
            this.c = f2;
            this.d = dVar;
        }
    }

    public static class c extends RecyclerView.o {
        public final Paint a;
        public List b;

        public c() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.i(canvas, recyclerView, a0Var);
            this.a.setStrokeWidth(recyclerView.getResources().getDimension(jz4.o));
            for (b.c cVar : this.b) {
                this.a.setColor(sr0.c(-65281, -16776961, cVar.c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2(), this.a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.b, this.a);
                }
            }
        }

        public void j(List list) {
            this.b = Collections.unmodifiableList(list);
        }
    }

    public static class d {
        public final b.c a;
        public final b.c b;

        public d(b.c cVar, b.c cVar2) {
            lu4.a(cVar.a <= cVar2.a);
            this.a = cVar;
            this.b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new kx3());
    }

    public static d D2(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            b.c cVar = (b.c) list.get(i5);
            float f6 = z ? cVar.b : cVar.a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new d((b.c) list.get(i), (b.c) list.get(i3));
    }

    private int O2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        if (this.y == null) {
            L2(vVar);
        }
        int iJ2 = j2(i, this.s, this.t, this.u);
        this.s += iJ2;
        V2(this.y);
        float f = this.z.f() / 2.0f;
        float fG2 = g2(n0(N(0)));
        Rect rect = new Rect();
        float f2 = E2() ? this.z.h().b : this.z.a().b;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < O(); i2++) {
            View viewN = N(i2);
            float fAbs = Math.abs(f2 - K2(viewN, fG2, f, rect));
            if (viewN != null && fAbs < f3) {
                this.F = n0(viewN);
                f3 = fAbs;
            }
            fG2 = a2(fG2, this.z.f());
        }
        m2(vVar, a0Var);
        return iJ2;
    }

    public static int j2(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private int l2(int i) {
        int iU2 = u2();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            return iU2 == 0 ? E2() ? 1 : -1 : IntCompanionObject.MIN_VALUE;
        }
        if (i == 33) {
            if (iU2 == 1) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        if (i == 66) {
            return iU2 == 0 ? E2() ? -1 : 1 : IntCompanionObject.MIN_VALUE;
        }
        if (i == 130) {
            if (iU2 == 1) {
                return 1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
        return IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.a0 a0Var) {
        return this.u - this.t;
    }

    public final int A2() {
        return this.C.j();
    }

    public final int B2(int i, com.google.android.material.carousel.b bVar) {
        return E2() ? (int) (((p2() - bVar.h().a) - (i * bVar.f())) - (bVar.f() / 2.0f)) : (int) (((i * bVar.f()) - bVar.a().a) + (bVar.f() / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (p()) {
            return O2(i, vVar, a0Var);
        }
        return 0;
    }

    public final int C2(int i, com.google.android.material.carousel.b bVar) {
        int i2 = IntCompanionObject.MAX_VALUE;
        for (b.c cVar : bVar.e()) {
            float f = (i * bVar.f()) + (bVar.f() / 2.0f);
            int iP2 = (E2() ? (int) ((p2() - cVar.a) - f) : (int) (f - cVar.a)) - this.s;
            if (Math.abs(i2) > Math.abs(iP2)) {
                i2 = iP2;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D1(int i) {
        this.F = i;
        if (this.y == null) {
            return;
        }
        this.s = B2(i, r2(i));
        this.A = er3.b(i, 0, Math.max(0, e() - 1));
        V2(this.y);
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (q()) {
            return O2(i, vVar, a0Var);
        }
        return 0;
    }

    public boolean E2() {
        return f() && d0() == 1;
    }

    public final boolean F2(float f, d dVar) {
        float fB2 = b2(f, s2(f, dVar) / 2.0f);
        if (E2()) {
            if (fB2 >= 0.0f) {
                return false;
            }
        } else if (fB2 <= p2()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G0(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final boolean G2(float f, d dVar) {
        float fA2 = a2(f, s2(f, dVar) / 2.0f);
        if (E2()) {
            if (fA2 <= p2()) {
                return false;
            }
        } else if (fA2 >= 0.0f) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void H2(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        view.post(new Runnable() { // from class: com.zepto.mb0
            @Override // java.lang.Runnable
            public final void run() {
                this.c.M2();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    public final void I2() {
        if (this.v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i = 0; i < O(); i++) {
                View viewN = N(i);
                Log.d("CarouselLayoutManager", "item position " + n0(viewN) + ", center:" + q2(viewN) + ", child index:" + i);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    public final b J2(RecyclerView.v vVar, float f, int i) {
        View viewO = vVar.o(i);
        G0(viewO, 0, 0);
        float fA2 = a2(f, this.z.f() / 2.0f);
        d dVarD2 = D2(this.z.g(), fA2, false);
        return new b(viewO, fA2, f2(viewO, fA2, dVarD2), dVarD2);
    }

    public final float K2(View view, float f, float f2, Rect rect) {
        float fA2 = a2(f, f2);
        d dVarD2 = D2(this.z.g(), fA2, false);
        float fF2 = f2(view, fA2, dVarD2);
        super.U(view, rect);
        U2(view, fA2, dVarD2);
        this.C.l(view, rect, f2, fF2);
        return fF2;
    }

    public final void L2(RecyclerView.v vVar) {
        View viewO = vVar.o(0);
        G0(viewO, 0, 0);
        com.google.android.material.carousel.b bVarC = this.x.c(this, viewO);
        if (E2()) {
            bVarC = com.google.android.material.carousel.b.m(bVarC, p2());
        }
        this.y = com.google.android.material.carousel.c.f(this, bVarC);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView) {
        super.M0(recyclerView);
        M2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    public final void M2() {
        this.y = null;
        z1();
    }

    public final void N2(RecyclerView.v vVar) {
        while (O() > 0) {
            View viewN = N(0);
            float fQ2 = q2(viewN);
            if (!G2(fQ2, D2(this.z.g(), fQ2, true))) {
                break;
            } else {
                s1(viewN, vVar);
            }
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            float fQ22 = q2(viewN2);
            if (!F2(fQ22, D2(this.z.g(), fQ22, true))) {
                return;
            } else {
                s1(viewN2, vVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.O0(recyclerView, vVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i);
        P1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View P0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int iL2;
        if (O() == 0 || (iL2 = l2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iL2 == -1) {
            if (n0(view) == 0) {
                return null;
            }
            c2(vVar, n0(N(0)) - 1, 0);
            return o2();
        }
        if (n0(view) == e() - 1) {
            return null;
        }
        c2(vVar, n0(N(O() - 1)) + 1, -1);
        return n2();
    }

    public final void P2(RecyclerView recyclerView, int i) {
        if (f()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(n0(N(0)));
            accessibilityEvent.setToIndex(n0(N(O() - 1)));
        }
    }

    public void Q2(int i) {
        this.G = i;
        M2();
    }

    public final void R2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.l0);
            Q2(typedArrayObtainStyledAttributes.getInt(m15.m0, 0));
            T2(typedArrayObtainStyledAttributes.getInt(m15.v5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void S2(ob0 ob0Var) {
        this.x = ob0Var;
        M2();
    }

    public void T2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        l(null);
        nb0 nb0Var = this.C;
        if (nb0Var == null || i != nb0Var.a) {
            this.C = nb0.b(this, i);
            M2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (f()) {
            fCenterY = rect.centerX();
        }
        float fS2 = s2(fCenterY, D2(this.z.g(), fCenterY, true));
        float fWidth = f() ? (rect.width() - fS2) / 2.0f : 0.0f;
        float fHeight = f() ? 0.0f : (rect.height() - fS2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public final void U2(View view, float f, d dVar) {
    }

    public final void V2(com.google.android.material.carousel.c cVar) {
        int i = this.u;
        int i2 = this.t;
        if (i <= i2) {
            this.z = E2() ? cVar.h() : cVar.l();
        } else {
            this.z = cVar.j(this.s, i2, i);
        }
        this.w.j(this.z.g());
    }

    public final void W2() {
        int iE = e();
        int i = this.E;
        if (iE == i || this.y == null) {
            return;
        }
        if (this.x.d(this, i)) {
            M2();
        }
        this.E = iE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i, int i2) {
        super.X0(recyclerView, i, i2);
        W2();
    }

    public final void X2() {
        if (!this.v || O() < 1) {
            return;
        }
        int i = 0;
        while (i < O() - 1) {
            int iN0 = n0(N(i));
            int i2 = i + 1;
            int iN02 = n0(N(i2));
            if (iN0 > iN02) {
                I2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + iN0 + "] and child at index [" + i2 + "] had adapter position [" + iN02 + "].");
            }
            i = i2;
        }
    }

    public final void Z1(View view, int i, b bVar) {
        float f = this.z.f() / 2.0f;
        j(view, i);
        float f2 = bVar.c;
        this.C.k(view, (int) (f2 - f), (int) (f2 + f));
        U2(view, bVar.b, bVar.d);
    }

    @Override // com.zepto.kb0
    public int a() {
        return u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i, int i2) {
        super.a1(recyclerView, i, i2);
        W2();
    }

    public final float a2(float f, float f2) {
        return E2() ? f - f2 : f + f2;
    }

    @Override // com.zepto.kb0
    public int b() {
        return this.G;
    }

    public final float b2(float f, float f2) {
        return E2() ? f + f2 : f - f2;
    }

    @Override // com.zepto.kb0
    public int c() {
        return b0();
    }

    public final void c2(RecyclerView.v vVar, int i, int i2) {
        if (i < 0 || i >= e()) {
            return;
        }
        b bVarJ2 = J2(vVar, g2(i), i);
        Z1(bVarJ2.a, i2, bVarJ2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF d(int i) {
        if (this.y == null) {
            return null;
        }
        int iT2 = t2(i, r2(i));
        return f() ? new PointF(iT2, 0.0f) : new PointF(0.0f, iT2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.b() <= 0 || p2() <= 0.0f) {
            q1(vVar);
            this.A = 0;
            return;
        }
        boolean zE2 = E2();
        boolean z = this.y == null;
        if (z) {
            L2(vVar);
        }
        int iK2 = k2(this.y);
        int iH2 = h2(a0Var, this.y);
        this.t = zE2 ? iH2 : iK2;
        if (zE2) {
            iH2 = iK2;
        }
        this.u = iH2;
        if (z) {
            this.s = iK2;
            this.B = this.y.i(e(), this.t, this.u, E2());
            int i = this.F;
            if (i != -1) {
                this.s = B2(i, r2(i));
            }
        }
        int i2 = this.s;
        this.s = i2 + j2(0, i2, this.t, this.u);
        this.A = er3.b(this.A, 0, a0Var.b());
        V2(this.y);
        B(vVar);
        m2(vVar, a0Var);
        this.E = e();
    }

    public final void d2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        float fG2 = g2(i);
        while (i < a0Var.b()) {
            b bVarJ2 = J2(vVar, fG2, i);
            if (F2(bVarJ2.c, bVarJ2.d)) {
                return;
            }
            fG2 = a2(fG2, this.z.f());
            if (!G2(bVarJ2.c, bVarJ2.d)) {
                Z1(bVarJ2.a, -1, bVarJ2);
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.a0 a0Var) {
        super.e1(a0Var);
        if (O() == 0) {
            this.A = 0;
        } else {
            this.A = n0(N(0));
        }
        X2();
    }

    public final void e2(RecyclerView.v vVar, int i) {
        float fG2 = g2(i);
        while (i >= 0) {
            b bVarJ2 = J2(vVar, fG2, i);
            if (G2(bVarJ2.c, bVarJ2.d)) {
                return;
            }
            fG2 = b2(fG2, this.z.f());
            if (!F2(bVarJ2.c, bVarJ2.d)) {
                Z1(bVarJ2.a, 0, bVarJ2);
            }
            i--;
        }
    }

    @Override // com.zepto.kb0
    public boolean f() {
        return this.C.a == 0;
    }

    public final float f2(View view, float f, d dVar) {
        b.c cVar = dVar.a;
        float f2 = cVar.b;
        b.c cVar2 = dVar.b;
        float fB = rp.b(f2, cVar2.b, cVar.a, cVar2.a, f);
        if (dVar.b != this.z.c() && dVar.a != this.z.j()) {
            return fB;
        }
        float fD = this.C.d((RecyclerView.q) view.getLayoutParams()) / this.z.f();
        b.c cVar3 = dVar.b;
        return fB + ((f - cVar3.a) * ((1.0f - cVar3.c) + fD));
    }

    public final float g2(int i) {
        return a2(z2() - this.s, this.z.f() * i);
    }

    public final int h2(RecyclerView.a0 a0Var, com.google.android.material.carousel.c cVar) {
        boolean zE2 = E2();
        com.google.android.material.carousel.b bVarL = zE2 ? cVar.l() : cVar.h();
        b.c cVarA = zE2 ? bVarL.a() : bVarL.h();
        int iB = (int) ((((((a0Var.b() - 1) * bVarL.f()) + i0()) * (zE2 ? -1.0f : 1.0f)) - (cVarA.a - z2())) + (w2() - cVarA.a));
        return zE2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    public int i2(int i) {
        return (int) (this.s - B2(i, r2(i)));
    }

    public final int k2(com.google.android.material.carousel.c cVar) {
        boolean zE2 = E2();
        com.google.android.material.carousel.b bVarH = zE2 ? cVar.h() : cVar.l();
        return (int) (((l0() * (zE2 ? 1 : -1)) + z2()) - b2((zE2 ? bVarH.h() : bVarH.a()).a, bVarH.f() / 2.0f));
    }

    public final void m2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        N2(vVar);
        if (O() == 0) {
            e2(vVar, this.A - 1);
            d2(vVar, a0Var, this.A);
        } else {
            int iN0 = n0(N(0));
            int iN02 = n0(N(O() - 1));
            e2(vVar, iN0 - 1);
            d2(vVar, a0Var, iN02 + 1);
        }
        X2();
    }

    public final View n2() {
        return N(E2() ? 0 : O() - 1);
    }

    public final View o2() {
        return N(E2() ? O() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return f();
    }

    public final int p2() {
        return f() ? a() : c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return !f();
    }

    public final float q2(View view) {
        super.U(view, new Rect());
        return f() ? r0.centerX() : r0.centerY();
    }

    public final com.google.android.material.carousel.b r2(int i) {
        com.google.android.material.carousel.b bVar;
        Map map = this.B;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(er3.b(i, 0, Math.max(0, e() + (-1)))))) == null) ? this.y.g() : bVar;
    }

    public final float s2(float f, d dVar) {
        b.c cVar = dVar.a;
        float f2 = cVar.d;
        b.c cVar2 = dVar.b;
        return rp.b(f2, cVar2.d, cVar.b, cVar2.b, f);
    }

    public int t2(int i, com.google.android.material.carousel.b bVar) {
        return B2(i, bVar) - this.s;
    }

    public int u2() {
        return this.C.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.a0 a0Var) {
        if (O() == 0 || this.y == null || e() <= 1) {
            return 0;
        }
        return (int) (u0() * (this.y.g().f() / x(a0Var)));
    }

    public final int v2() {
        return this.C.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.a0 a0Var) {
        return this.s;
    }

    public final int w2() {
        return this.C.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.a0 a0Var) {
        return this.u - this.t;
    }

    public final int x2() {
        return this.C.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.a0 a0Var) {
        if (O() == 0 || this.y == null || e() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.y.g().f() / A(a0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iC2;
        if (this.y == null || (iC2 = C2(n0(view), r2(n0(view)))) == 0) {
            return false;
        }
        P2(recyclerView, C2(n0(view), this.y.j(this.s + j2(iC2, this.s, this.t, this.u), this.t, this.u)));
        return true;
    }

    public final int y2() {
        return this.C.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.a0 a0Var) {
        return this.s;
    }

    public final int z2() {
        return this.C.i();
    }

    public CarouselLayoutManager(ob0 ob0Var) {
        this(ob0Var, 0);
    }

    public CarouselLayoutManager(ob0 ob0Var, int i) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: com.zepto.lb0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.a.H2(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        S2(ob0Var);
        T2(i);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: com.zepto.lb0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.a.H2(view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        S2(new kx3());
        R2(context, attributeSet);
    }
}
