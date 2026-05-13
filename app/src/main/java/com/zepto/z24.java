package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.zepto.r3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class z24 implements androidx.appcompat.view.menu.i {
    public int A;
    public int B;
    public NavigationMenuView a;
    public LinearLayout b;
    public i.a c;
    public androidx.appcompat.view.menu.e d;
    public int e;
    public c f;
    public LayoutInflater g;
    public ColorStateList i;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public RippleDrawable o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public int z;
    public int h = 0;
    public int j = 0;
    public boolean k = true;
    public boolean y = true;
    public int C = -1;
    public final View.OnClickListener D = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            z24.this.a0(true);
            androidx.appcompat.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            z24 z24Var = z24.this;
            boolean zO = z24Var.d.O(itemData, z24Var, 0);
            if (itemData != null && itemData.isCheckable() && zO) {
                z24.this.f.M(itemData);
            } else {
                z = false;
            }
            z24.this.a0(false);
            if (z) {
                z24.this.i(false);
            }
        }
    }

    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    public class c extends RecyclerView.h {
        public final ArrayList d = new ArrayList();
        public androidx.appcompat.view.menu.g e;
        public boolean f;

        public class a extends x2 {
            public final /* synthetic */ int d;
            public final /* synthetic */ boolean e;

            public a(int i, boolean z) {
                this.d = i;
                this.e = z;
            }

            @Override // com.zepto.x2
            public void g(View view, r3 r3Var) {
                super.g(view, r3Var);
                r3Var.X(r3.d.a(c.this.B(this.d), 1, 1, 1, this.e, view.isSelected()));
            }
        }

        public c() {
            J();
        }

        public final int B(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (z24.this.f.g(i3) == 2 || z24.this.f.g(i3) == 3) {
                    i2--;
                }
            }
            return i2;
        }

        public final void C(int i, int i2) {
            while (i < i2) {
                ((g) this.d.get(i)).b = true;
                i++;
            }
        }

        public Bundle D() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.g gVar = this.e;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                e eVar = (e) this.d.get(i);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.g gVarA = ((g) eVar).a();
                    View actionView = gVarA != null ? gVarA.getActionView() : null;
                    if (actionView != null) {
                        nl4 nl4Var = new nl4();
                        actionView.saveHierarchyState(nl4Var);
                        sparseArray.put(gVarA.getItemId(), nl4Var);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.g E() {
            return this.e;
        }

        public int F() {
            int i = 0;
            for (int i2 = 0; i2 < z24.this.f.e(); i2++) {
                int iG = z24.this.f.g(i2);
                if (iG == 0 || iG == 1) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void p(l lVar, int i) {
            int iG = g(i);
            if (iG != 0) {
                if (iG != 1) {
                    if (iG != 2) {
                        return;
                    }
                    f fVar = (f) this.d.get(i);
                    lVar.a.setPadding(z24.this.t, fVar.b(), z24.this.u, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.a;
                textView.setText(((g) this.d.get(i)).a().getTitle());
                ef6.n(textView, z24.this.h);
                textView.setPadding(z24.this.v, textView.getPaddingTop(), z24.this.w, textView.getPaddingBottom());
                ColorStateList colorStateList = z24.this.i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                L(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.a;
            navigationMenuItemView.setIconTintList(z24.this.m);
            navigationMenuItemView.setTextAppearance(z24.this.j);
            ColorStateList colorStateList2 = z24.this.l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = z24.this.n;
            dq7.u0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = z24.this.o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.d.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
            z24 z24Var = z24.this;
            int i2 = z24Var.p;
            int i3 = z24Var.q;
            navigationMenuItemView.setPadding(i2, i3, i2, i3);
            navigationMenuItemView.setIconPadding(z24.this.r);
            z24 z24Var2 = z24.this;
            if (z24Var2.x) {
                navigationMenuItemView.setIconSize(z24Var2.s);
            }
            navigationMenuItemView.setMaxLines(z24.this.z);
            navigationMenuItemView.D(gVar.a(), z24.this.k);
            L(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public l r(ViewGroup viewGroup, int i) {
            if (i == 0) {
                z24 z24Var = z24.this;
                return new i(z24Var.g, viewGroup, z24Var.D);
            }
            if (i == 1) {
                return new k(z24.this.g, viewGroup);
            }
            if (i == 2) {
                return new j(z24.this.g, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new b(z24.this.b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void w(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.a).E();
            }
        }

        public final void J() {
            if (this.f) {
                return;
            }
            boolean z = true;
            this.f = true;
            this.d.clear();
            this.d.add(new d());
            int size = z24.this.d.G().size();
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) z24.this.d.G().get(i2);
                if (gVar.isChecked()) {
                    M(gVar);
                }
                if (gVar.isCheckable()) {
                    gVar.t(false);
                }
                if (gVar.hasSubMenu()) {
                    SubMenu subMenu = gVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.d.add(new f(z24.this.B, 0));
                        }
                        this.d.add(new g(gVar));
                        int size3 = this.d.size();
                        int size4 = subMenu.size();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < size4) {
                            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) subMenu.getItem(i3);
                            if (gVar2.isVisible()) {
                                if (!z3 && gVar2.getIcon() != null) {
                                    z3 = z;
                                }
                                if (gVar2.isCheckable()) {
                                    gVar2.t(false);
                                }
                                if (gVar.isChecked()) {
                                    M(gVar);
                                }
                                this.d.add(new g(gVar2));
                            }
                            i3++;
                            z = true;
                        }
                        if (z3) {
                            C(size3, this.d.size());
                        }
                    }
                } else {
                    int groupId = gVar.getGroupId();
                    if (groupId != i) {
                        size2 = this.d.size();
                        z2 = gVar.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList arrayList = this.d;
                            int i4 = z24.this.B;
                            arrayList.add(new f(i4, i4));
                        }
                    } else if (!z2 && gVar.getIcon() != null) {
                        C(size2, this.d.size());
                        z2 = true;
                    }
                    g gVar3 = new g(gVar);
                    gVar3.b = z2;
                    this.d.add(gVar3);
                    i = groupId;
                }
                i2++;
                z = true;
            }
            this.f = false;
        }

        public void K(Bundle bundle) {
            androidx.appcompat.view.menu.g gVarA;
            View actionView;
            nl4 nl4Var;
            androidx.appcompat.view.menu.g gVarA2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f = true;
                int size = this.d.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = (e) this.d.get(i2);
                    if ((eVar instanceof g) && (gVarA2 = ((g) eVar).a()) != null && gVarA2.getItemId() == i) {
                        M(gVarA2);
                        break;
                    }
                    i2++;
                }
                this.f = false;
                J();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.d.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = (e) this.d.get(i3);
                    if ((eVar2 instanceof g) && (gVarA = ((g) eVar2).a()) != null && (actionView = gVarA.getActionView()) != null && (nl4Var = (nl4) sparseParcelableArray.get(gVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(nl4Var);
                    }
                }
            }
        }

        public final void L(View view, int i, boolean z) {
            dq7.q0(view, new a(i, z));
        }

        public void M(androidx.appcompat.view.menu.g gVar) {
            if (this.e == gVar || !gVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.g gVar2 = this.e;
            if (gVar2 != null) {
                gVar2.setChecked(false);
            }
            this.e = gVar;
            gVar.setChecked(true);
        }

        public void N(boolean z) {
            this.f = z;
        }

        public void O() {
            J();
            j();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long f(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int g(int i) {
            e eVar = (e) this.d.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    public static class d implements e {
    }

    public interface e {
    }

    public static class f implements e {
        public final int a;
        public final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public static class g implements e {
        public final androidx.appcompat.view.menu.g a;
        public boolean b;

        public g(androidx.appcompat.view.menu.g gVar) {
            this.a = gVar;
        }

        public androidx.appcompat.view.menu.g a() {
            return this.a;
        }
    }

    public class h extends androidx.recyclerview.widget.k {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.k, com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.W(r3.c.a(z24.this.f.F(), 1, false));
        }
    }

    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(p05.d, viewGroup, false));
            this.a.setOnClickListener(onClickListener);
        }
    }

    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(p05.f, viewGroup, false));
        }
    }

    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(p05.g, viewGroup, false));
        }
    }

    public static abstract class l extends RecyclerView.d0 {
        public l(View view) {
            super(view);
        }
    }

    public androidx.appcompat.view.menu.j A(ViewGroup viewGroup) {
        if (this.a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.g.inflate(p05.h, viewGroup, false);
            this.a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.a));
            if (this.f == null) {
                this.f = new c();
            }
            int i2 = this.C;
            if (i2 != -1) {
                this.a.setOverScrollMode(i2);
            }
            LinearLayout linearLayout = (LinearLayout) this.g.inflate(p05.e, (ViewGroup) this.a, false);
            this.b = linearLayout;
            dq7.B0(linearLayout, 2);
            this.a.setAdapter(this.f);
        }
        return this.a;
    }

    public int B() {
        return this.w;
    }

    public int C() {
        return this.v;
    }

    public final boolean D() {
        return r() > 0;
    }

    public View E(int i2) {
        View viewInflate = this.g.inflate(i2, (ViewGroup) this.b, false);
        d(viewInflate);
        return viewInflate;
    }

    public void F(boolean z) {
        if (this.y != z) {
            this.y = z;
            b0();
        }
    }

    public void G(androidx.appcompat.view.menu.g gVar) {
        this.f.M(gVar);
    }

    public void H(int i2) {
        this.u = i2;
        i(false);
    }

    public void I(int i2) {
        this.t = i2;
        i(false);
    }

    public void J(int i2) {
        this.e = i2;
    }

    public void K(Drawable drawable) {
        this.n = drawable;
        i(false);
    }

    public void L(RippleDrawable rippleDrawable) {
        this.o = rippleDrawable;
        i(false);
    }

    public void M(int i2) {
        this.p = i2;
        i(false);
    }

    public void N(int i2) {
        this.r = i2;
        i(false);
    }

    public void O(int i2) {
        if (this.s != i2) {
            this.s = i2;
            this.x = true;
            i(false);
        }
    }

    public void P(ColorStateList colorStateList) {
        this.m = colorStateList;
        i(false);
    }

    public void Q(int i2) {
        this.z = i2;
        i(false);
    }

    public void R(int i2) {
        this.j = i2;
        i(false);
    }

    public void S(boolean z) {
        this.k = z;
        i(false);
    }

    public void T(ColorStateList colorStateList) {
        this.l = colorStateList;
        i(false);
    }

    public void U(int i2) {
        this.q = i2;
        i(false);
    }

    public void V(int i2) {
        this.C = i2;
        NavigationMenuView navigationMenuView = this.a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void W(ColorStateList colorStateList) {
        this.i = colorStateList;
        i(false);
    }

    public void X(int i2) {
        this.w = i2;
        i(false);
    }

    public void Y(int i2) {
        this.v = i2;
        i(false);
    }

    public void Z(int i2) {
        this.h = i2;
        i(false);
    }

    public void a0(boolean z) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.N(z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        i.a aVar = this.c;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    public final void b0() {
        int i2 = (D() || !this.y) ? 0 : this.A;
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.i
    public int c() {
        return this.e;
    }

    public void d(View view) {
        this.b.addView(view);
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(Context context, androidx.appcompat.view.menu.e eVar) {
        this.g = LayoutInflater.from(context);
        this.d = eVar;
        this.B = context.getResources().getDimensionPixelOffset(jz4.f);
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f.K(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(androidx.appcompat.view.menu.l lVar) {
        return false;
    }

    public void h(qv7 qv7Var) {
        int iL = qv7Var.l();
        if (this.A != iL) {
            this.A = iL;
            b0();
        }
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, qv7Var.i());
        dq7.g(this.b, qv7Var);
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(boolean z) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.O();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable k() {
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.D());
        }
        if (this.b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean m(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    public androidx.appcompat.view.menu.g o() {
        return this.f.E();
    }

    public int p() {
        return this.u;
    }

    public int q() {
        return this.t;
    }

    public int r() {
        return this.b.getChildCount();
    }

    public View s(int i2) {
        return this.b.getChildAt(i2);
    }

    public Drawable t() {
        return this.n;
    }

    public int u() {
        return this.p;
    }

    public int v() {
        return this.r;
    }

    public int w() {
        return this.z;
    }

    public ColorStateList x() {
        return this.l;
    }

    public ColorStateList y() {
        return this.m;
    }

    public int z() {
        return this.q;
    }
}
