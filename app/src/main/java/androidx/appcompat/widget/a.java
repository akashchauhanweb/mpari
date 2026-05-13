package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.zepto.a6;
import com.zepto.nf2;
import com.zepto.qi6;
import com.zepto.r05;
import com.zepto.s16;
import com.zepto.tw1;
import com.zepto.x5;
import com.zepto.zy4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a implements a6.a {
    public c A;
    public b B;
    public final f C;
    public int D;
    public d k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final SparseBooleanArray x;
    public e y;
    public C0003a z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0003a extends h {
        public C0003a(Context context, l lVar, View view) {
            super(context, lVar, view, false, zy4.i);
            if (!((androidx.appcompat.view.menu.g) lVar.getItem()).l()) {
                View view2 = a.this.k;
                f(view2 == null ? (View) a.this.i : view2);
            }
            j(a.this.C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            a aVar = a.this;
            aVar.z = null;
            aVar.D = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public s16 a() {
            C0003a c0003a = a.this.z;
            if (c0003a != null) {
                return c0003a.c();
            }
            return null;
        }
    }

    public class c implements Runnable {
        public e c;

        public c(e eVar) {
            this.c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.c != null) {
                a.this.c.d();
            }
            View view = (View) a.this.i;
            if (view != null && view.getWindowToken() != null && this.c.m()) {
                a.this.y = this.c;
            }
            a.this.A = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0004a extends nf2 {
            public final /* synthetic */ a j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0004a(View view, a aVar) {
                super(view);
                this.j = aVar;
            }

            @Override // com.zepto.nf2
            public s16 b() {
                e eVar = a.this.y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // com.zepto.nf2
            public boolean c() {
                a.this.N();
                return true;
            }

            @Override // com.zepto.nf2
            public boolean d() {
                a aVar = a.this;
                if (aVar.A != null) {
                    return false;
                }
                aVar.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, zy4.h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            qi6.a(this, getContentDescription());
            setOnTouchListener(new C0004a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.N();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                tw1.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, zy4.i);
            h(8388613);
            j(a.this.C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (a.this.c != null) {
                a.this.c.close();
            }
            a.this.y = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof l) {
                eVar.F().e(false);
            }
            i.a aVarP = a.this.p();
            if (aVarP != null) {
                aVarP.b(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.c) {
                return false;
            }
            a.this.D = ((l) eVar).getItem().getItemId();
            i.a aVarP = a.this.p();
            if (aVarP != null) {
                return aVarP.c(eVar);
            }
            return false;
        }
    }

    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new C0005a();
        public int c;

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$g$a, reason: collision with other inner class name */
        public class C0005a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
        }

        public g(Parcel parcel) {
            this.c = parcel.readInt();
        }
    }

    public a(Context context) {
        super(context, r05.c, r05.b);
        this.x = new SparseBooleanArray();
        this.C = new f();
    }

    public boolean B() {
        return E() | F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable D() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean E() {
        Object obj;
        c cVar = this.A;
        if (cVar != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.A = null;
            return true;
        }
        e eVar = this.y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean F() {
        C0003a c0003a = this.z;
        if (c0003a == null) {
            return false;
        }
        c0003a.b();
        return true;
    }

    public boolean G() {
        return this.A != null || H();
    }

    public boolean H() {
        e eVar = this.y;
        return eVar != null && eVar.d();
    }

    public void I(Configuration configuration) {
        if (!this.s) {
            this.r = x5.b(this.b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            eVar.M(true);
        }
    }

    public void J(boolean z) {
        this.v = z;
    }

    public void K(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.b(this.c);
    }

    public void L(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.m = true;
            this.l = drawable;
        }
    }

    public void M(boolean z) {
        this.n = z;
        this.o = true;
    }

    public boolean N() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.n || H() || (eVar = this.c) == null || this.i == null || this.A != null || eVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.b, this.c, this.k, true));
        this.A = cVar;
        ((View) this.i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        B();
        super.b(eVar, z);
    }

    @Override // androidx.appcompat.view.menu.a
    public void d(androidx.appcompat.view.menu.g gVar, j.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void e(Context context, androidx.appcompat.view.menu.e eVar) {
        super.e(context, eVar);
        Resources resources = context.getResources();
        x5 x5VarB = x5.b(context);
        if (!this.o) {
            this.n = x5VarB.f();
        }
        if (!this.u) {
            this.p = x5VarB.c();
        }
        if (!this.s) {
            this.r = x5VarB.d();
        }
        int measuredWidth = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.a);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = measuredWidth;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).c) > 0 && (menuItemFindItem = this.c.findItem(i)) != null) {
            g((l) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean g(l lVar) {
        boolean z = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.i0() != this.c) {
            lVar2 = (l) lVar2.i0();
        }
        View viewC = C(lVar2.getItem());
        if (viewC == null) {
            return false;
        }
        this.D = lVar.getItem().getItemId();
        int size = lVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0003a c0003a = new C0003a(this.b, lVar, viewC);
        this.z = c0003a;
        c0003a.g(z);
        this.z.k();
        super.g(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void i(boolean z) {
        int size;
        super.i(z);
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            ArrayList arrayListU = eVar.u();
            int size2 = arrayListU.size();
            for (int i = 0; i < size2; i++) {
                a6 a6VarA = ((androidx.appcompat.view.menu.g) arrayListU.get(i)).a();
                if (a6VarA != null) {
                    a6VarA.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.c;
        ArrayList arrayListB = eVar2 != null ? eVar2.B() : null;
        if (!this.n || arrayListB == null || ((size = arrayListB.size()) != 1 ? size <= 0 : !(!((androidx.appcompat.view.menu.g) arrayListB.get(0)).isActionViewExpanded()))) {
            d dVar = this.k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.k);
                }
            }
        } else {
            if (this.k == null) {
                this.k = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.k, actionMenuView.F());
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.i
    public boolean j() {
        ArrayList arrayListG;
        int size;
        int i;
        int iL;
        ?? r0;
        int i2;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.c;
        View view = null;
        ?? r3 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i3 = aVar.r;
        int i4 = aVar.q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.i;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayListG.get(i7);
            if (gVar.o()) {
                i5++;
            } else if (gVar.n()) {
                i6++;
            } else {
                z = true;
            }
            if (aVar.v && gVar.isActionViewExpanded()) {
                i3 = 0;
            }
        }
        if (aVar.n && (z || i6 + i5 > i3)) {
            i3--;
        }
        int i8 = i3 - i5;
        SparseBooleanArray sparseBooleanArray = aVar.x;
        sparseBooleanArray.clear();
        if (aVar.t) {
            int i9 = aVar.w;
            iL = i4 / i9;
            i = i9 + ((i4 % i9) / iL);
        } else {
            i = 0;
            iL = 0;
        }
        int i10 = 0;
        int i11 = 0;
        ?? r02 = aVar;
        while (i10 < size) {
            ?? r15 = (androidx.appcompat.view.menu.g) arrayListG.get(i10);
            if (r15.o()) {
                View viewQ = r02.q(r15, view, viewGroup);
                if (r02.t) {
                    iL -= ActionMenuView.L(viewQ, i, iL, iMakeMeasureSpec, r3);
                } else {
                    viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewQ.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r0 = r3;
                i2 = size;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i8 > 0 || z2) && i4 > 0 && (!r02.t || iL > 0);
                boolean z4 = z3;
                i2 = size;
                if (z3) {
                    View viewQ2 = r02.q(r15, null, viewGroup);
                    if (r02.t) {
                        int iL2 = ActionMenuView.L(viewQ2, i, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewQ2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewQ2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z3 = z5 & (!r02.t ? i4 + i11 <= 0 : i4 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i12 = 0; i12 < i10; i12++) {
                        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayListG.get(i12);
                        if (gVar2.getGroupId() == groupId2) {
                            if (gVar2.l()) {
                                i8++;
                            }
                            gVar2.u(false);
                        }
                    }
                }
                if (z3) {
                    i8--;
                }
                r15.u(z3);
                r0 = 0;
            } else {
                r0 = r3;
                i2 = size;
                r15.u(r0);
            }
            i10++;
            r3 = r0;
            size = i2;
            view = null;
            r02 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable k() {
        g gVar = new g();
        gVar.c = this.D;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return super.o(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.a
    public View q(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.q(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public j r(ViewGroup viewGroup) {
        j jVar = this.i;
        j jVarR = super.r(viewGroup);
        if (jVar != jVarR) {
            ((ActionMenuView) jVarR).setPresenter(this);
        }
        return jVarR;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean t(int i, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}
