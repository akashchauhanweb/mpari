package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.zepto.b15;
import com.zepto.bh4;
import com.zepto.c46;
import com.zepto.dq7;
import com.zepto.gs4;
import com.zepto.ie1;
import com.zepto.je1;
import com.zepto.jz4;
import com.zepto.l05;
import com.zepto.p05;
import com.zepto.r3;
import com.zepto.wb0;
import com.zepto.ww3;
import com.zepto.x08;
import com.zepto.x2;
import com.zepto.xs6;
import com.zepto.yd1;
import com.zepto.z90;
import com.zepto.zz4;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class c<S> extends gs4 {
    public static final Object p0 = "MONTHS_VIEW_GROUP_TAG";
    public static final Object q0 = "NAVIGATION_PREV_TAG";
    public static final Object r0 = "NAVIGATION_NEXT_TAG";
    public static final Object s0 = "SELECTOR_TOGGLE_TAG";
    public int e0;
    public com.google.android.material.datepicker.a f0;
    public ww3 g0;
    public l h0;
    public z90 i0;
    public RecyclerView j0;
    public RecyclerView k0;
    public View l0;
    public View m0;
    public View n0;
    public View o0;

    public class a implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.f a;

        public a(com.google.android.material.datepicker.f fVar) {
            this.a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iG2 = c.this.k2().g2() - 1;
            if (iG2 >= 0) {
                c.this.n2(this.a.B(iG2));
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int c;

        public b(int i) {
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.k0.r1(this.c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.c$c, reason: collision with other inner class name */
    public class C0038c extends x2 {
        public C0038c() {
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.W(null);
        }
    }

    public class d extends c46 {
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void S1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = c.this.k0.getWidth();
                iArr[1] = c.this.k0.getWidth();
            } else {
                iArr[0] = c.this.k0.getHeight();
                iArr[1] = c.this.k0.getHeight();
            }
        }
    }

    public class e implements m {
        public e() {
        }

        @Override // com.google.android.material.datepicker.c.m
        public void a(long j) {
            if (c.this.f0.h().a(j)) {
                c.Z1(c.this);
                throw null;
            }
        }
    }

    public class f extends x2 {
        public f() {
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.n0(false);
        }
    }

    public class g extends RecyclerView.o {
        public final Calendar a = xs6.i();
        public final Calendar b = xs6.i();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof x08) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                c.Z1(c.this);
                throw null;
            }
        }
    }

    public class h extends x2 {
        public h() {
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.f0(c.this.o0.getVisibility() == 0 ? c.this.c0(b15.u) : c.this.c0(b15.s));
        }
    }

    public class i extends RecyclerView.t {
        public final /* synthetic */ com.google.android.material.datepicker.f a;
        public final /* synthetic */ MaterialButton b;

        public i(com.google.android.material.datepicker.f fVar, MaterialButton materialButton) {
            this.a = fVar;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            int iE2 = i < 0 ? c.this.k2().e2() : c.this.k2().g2();
            c.this.g0 = this.a.B(iE2);
            this.b.setText(this.a.C(iE2));
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.q2();
        }
    }

    public class k implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.f a;

        public k(com.google.android.material.datepicker.f fVar) {
            this.a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iE2 = c.this.k2().e2() + 1;
            if (iE2 < c.this.k0.getAdapter().e()) {
                c.this.n2(this.a.B(iE2));
            }
        }
    }

    public enum l {
        DAY,
        YEAR
    }

    public interface m {
        void a(long j);
    }

    public static /* synthetic */ yd1 Z1(c cVar) {
        cVar.getClass();
        return null;
    }

    public static int i2(Context context) {
        return context.getResources().getDimensionPixelSize(jz4.L);
    }

    public static int j2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(jz4.S) + resources.getDimensionPixelOffset(jz4.T) + resources.getDimensionPixelOffset(jz4.R);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(jz4.N);
        int i2 = com.google.android.material.datepicker.e.e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(jz4.L) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(jz4.Q)) + resources.getDimensionPixelOffset(jz4.J);
    }

    public static c l2(yd1 yd1Var, int i2, com.google.android.material.datepicker.a aVar, ie1 ie1Var) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", yd1Var);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", ie1Var);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.l());
        cVar.L1(bundle);
        return cVar;
    }

    @Override // com.zepto.sf2
    public void C0(Bundle bundle) {
        super.C0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.e0 = bundle.getInt("THEME_RES_ID_KEY");
        wb0.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        wb0.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.g0 = (ww3) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // com.zepto.sf2
    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(v(), this.e0);
        this.i0 = new z90(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        ww3 ww3VarM = this.f0.m();
        if (com.google.android.material.datepicker.d.v2(contextThemeWrapper)) {
            i2 = p05.w;
            i3 = 1;
        } else {
            i2 = p05.u;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        viewInflate.setMinimumHeight(j2(F1()));
        GridView gridView = (GridView) viewInflate.findViewById(zz4.y);
        dq7.q0(gridView, new C0038c());
        int iJ = this.f0.j();
        gridView.setAdapter((ListAdapter) (iJ > 0 ? new je1(iJ) : new je1()));
        gridView.setNumColumns(ww3VarM.g);
        gridView.setEnabled(false);
        this.k0 = (RecyclerView) viewInflate.findViewById(zz4.B);
        this.k0.setLayoutManager(new d(v(), i3, false, i3));
        this.k0.setTag(p0);
        com.google.android.material.datepicker.f fVar = new com.google.android.material.datepicker.f(contextThemeWrapper, null, this.f0, null, new e());
        this.k0.setAdapter(fVar);
        int integer = contextThemeWrapper.getResources().getInteger(l05.c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(zz4.C);
        this.j0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.j0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.j0.setAdapter(new x08(this));
            this.j0.h(d2());
        }
        if (viewInflate.findViewById(zz4.t) != null) {
            c2(viewInflate, fVar);
        }
        if (!com.google.android.material.datepicker.d.v2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.k0);
        }
        this.k0.j1(fVar.D(this.g0));
        p2();
        return viewInflate;
    }

    @Override // com.zepto.gs4
    public boolean V1(bh4 bh4Var) {
        return super.V1(bh4Var);
    }

    @Override // com.zepto.sf2
    public void Y0(Bundle bundle) {
        super.Y0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.g0);
    }

    public final void c2(View view, com.google.android.material.datepicker.f fVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(zz4.t);
        materialButton.setTag(s0);
        dq7.q0(materialButton, new h());
        View viewFindViewById = view.findViewById(zz4.v);
        this.l0 = viewFindViewById;
        viewFindViewById.setTag(q0);
        View viewFindViewById2 = view.findViewById(zz4.u);
        this.m0 = viewFindViewById2;
        viewFindViewById2.setTag(r0);
        this.n0 = view.findViewById(zz4.C);
        this.o0 = view.findViewById(zz4.x);
        o2(l.DAY);
        materialButton.setText(this.g0.j());
        this.k0.k(new i(fVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.m0.setOnClickListener(new k(fVar));
        this.l0.setOnClickListener(new a(fVar));
    }

    public final RecyclerView.o d2() {
        return new g();
    }

    public com.google.android.material.datepicker.a e2() {
        return this.f0;
    }

    public z90 f2() {
        return this.i0;
    }

    public ww3 g2() {
        return this.g0;
    }

    public yd1 h2() {
        return null;
    }

    public LinearLayoutManager k2() {
        return (LinearLayoutManager) this.k0.getLayoutManager();
    }

    public final void m2(int i2) {
        this.k0.post(new b(i2));
    }

    public void n2(ww3 ww3Var) {
        com.google.android.material.datepicker.f fVar = (com.google.android.material.datepicker.f) this.k0.getAdapter();
        int iD = fVar.D(ww3Var);
        int iD2 = iD - fVar.D(this.g0);
        boolean z = Math.abs(iD2) > 3;
        boolean z2 = iD2 > 0;
        this.g0 = ww3Var;
        if (z && z2) {
            this.k0.j1(iD - 3);
            m2(iD);
        } else if (!z) {
            m2(iD);
        } else {
            this.k0.j1(iD + 3);
            m2(iD);
        }
    }

    public void o2(l lVar) {
        this.h0 = lVar;
        if (lVar == l.YEAR) {
            this.j0.getLayoutManager().D1(((x08) this.j0.getAdapter()).A(this.g0.f));
            this.n0.setVisibility(0);
            this.o0.setVisibility(8);
            this.l0.setVisibility(8);
            this.m0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.n0.setVisibility(8);
            this.o0.setVisibility(0);
            this.l0.setVisibility(0);
            this.m0.setVisibility(0);
            n2(this.g0);
        }
    }

    public final void p2() {
        dq7.q0(this.k0, new f());
    }

    public void q2() {
        l lVar = this.h0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            o2(l.DAY);
        } else if (lVar == l.DAY) {
            o2(lVar2);
        }
    }
}
