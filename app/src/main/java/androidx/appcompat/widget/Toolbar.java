package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.zepto.bs7;
import com.zepto.c25;
import com.zepto.dq7;
import com.zepto.g96;
import com.zepto.gf5;
import com.zepto.jk2;
import com.zepto.jr0;
import com.zepto.lg6;
import com.zepto.mr;
import com.zepto.ps3;
import com.zepto.qi6;
import com.zepto.qs3;
import com.zepto.t5;
import com.zepto.tr;
import com.zepto.ve1;
import com.zepto.wp3;
import com.zepto.ws3;
import com.zepto.z1;
import com.zepto.zy4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements ps3 {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final qs3 G;
    public ArrayList H;
    public h I;
    public final ActionMenuView.e J;
    public androidx.appcompat.widget.c K;
    public androidx.appcompat.widget.a L;
    public f M;
    public i.a N;
    public e.a O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final Runnable T;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public ImageView e;
    public Drawable f;
    public CharSequence g;
    public ImageButton h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public gf5 t;
    public int u;
    public int v;
    public int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.d(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.S();
        }
    }

    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.O;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.a.J()) {
                Toolbar.this.G.e(eVar);
            }
            e.a aVar = Toolbar.this.O;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: com.zepto.ni6
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.i {
        public androidx.appcompat.view.menu.e a;
        public androidx.appcompat.view.menu.g b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.i
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.i
        public void e(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.a;
            if (eVar2 != null && (gVar = this.b) != null) {
                eVar2.f(gVar);
            }
            this.a = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public void f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(boolean z) {
            if (this.b != null) {
                androidx.appcompat.view.menu.e eVar = this.a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.a.getItem(i) == this.b) {
                            return;
                        }
                    }
                }
                l(this.a, this.b);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean j() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public Parcelable k() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean l(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.i;
            if (callback instanceof jr0) {
                ((jr0) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.i = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean m(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.h);
            }
            Toolbar.this.i = gVar.getActionView();
            this.b = gVar;
            ViewParent parent2 = Toolbar.this.i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.a = (toolbar4.n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.b = 2;
                toolbar4.i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.i);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.i;
            if (callback instanceof jr0) {
                ((jr0) callback).c();
            }
            Toolbar.this.T();
            return true;
        }
    }

    public static class g extends t5.a {
        public int b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = 8388627;
        }

        public g(g gVar) {
            super((t5.a) gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(t5.a aVar) {
            super(aVar);
            this.b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.N);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new g96(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.J();
    }

    public final int C(View view, int i2, int[] iArr, int i3) {
        g gVar = (g) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int D(View view, int i2, int[] iArr, int i3) {
        g gVar = (g) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int E(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void F(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // com.zepto.ps3
    public void G(ws3 ws3Var) {
        this.G.a(ws3Var);
    }

    @Override // com.zepto.ps3
    public void H(ws3 ws3Var) {
        this.G.f(ws3Var);
    }

    public final void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final void J() {
        removeCallbacks(this.T);
        post(this.T);
    }

    public void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).b != 2 && childAt != this.a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void L(int i2, int i3) {
        h();
        this.t.g(i2, i3);
    }

    public void M(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar == null && this.a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarN = this.a.N();
        if (eVarN == eVar) {
            return;
        }
        if (eVarN != null) {
            eVarN.Q(this.L);
            eVarN.Q(this.M);
        }
        if (this.M == null) {
            this.M = new f();
        }
        aVar.J(true);
        if (eVar != null) {
            eVar.c(aVar, this.j);
            eVar.c(this.M, this.j);
        } else {
            aVar.e(this.j, null);
            this.M.e(this.j, null);
            aVar.i(true);
            this.M.i(true);
        }
        this.a.setPopupTheme(this.k);
        this.a.setPresenter(aVar);
        this.L = aVar;
        T();
    }

    public void N(i.a aVar, e.a aVar2) {
        this.N = aVar;
        this.O = aVar2;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void O(Context context, int i2) {
        this.m = i2;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void P(Context context, int i2) {
        this.l = i2;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public final boolean Q() {
        if (!this.P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.P();
    }

    public void T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z = v() && onBackInvokedDispatcherA != null && dq7.T(this) && this.S;
            if (z && this.R == null) {
                if (this.Q == null) {
                    this.Q = e.b(new Runnable() { // from class: com.zepto.mi6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.c.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.Q);
                this.R = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.R) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.Q);
            this.R = null;
        }
    }

    public void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView((View) this.E.get(size));
        }
        this.E.clear();
    }

    public final void b(List list, int i2) {
        boolean z = dq7.B(this) == 1;
        int childCount = getChildCount();
        int iB = jk2.b(i2, dq7.B(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && R(childAt) && p(gVar.a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && R(childAt2) && p(gVar2.a) == iB) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.b = 1;
        if (!z || this.i == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.a) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.M;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void g() {
        if (this.h == null) {
            mr mrVar = new mr(getContext(), null, zy4.M);
            this.h = mrVar;
            mrVar.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.a = (this.n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.b = 2;
            this.h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        gf5 gf5Var = this.t;
        if (gf5Var != null) {
            return gf5Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        gf5 gf5Var = this.t;
        if (gf5Var != null) {
            return gf5Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        gf5 gf5Var = this.t;
        if (gf5Var != null) {
            return gf5Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        gf5 gf5Var = this.t;
        if (gf5Var != null) {
            return gf5Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarN;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (eVarN = actionMenuView.N()) == null || !eVarN.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return dq7.B(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return dq7.B(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public ve1 getWrapper() {
        if (this.K == null) {
            this.K = new androidx.appcompat.widget.c(this, true);
        }
        return this.K;
    }

    public final void h() {
        if (this.t == null) {
            this.t = new gf5();
        }
    }

    public final void i() {
        if (this.e == null) {
            this.e = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.a.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.a.getMenu();
            if (this.M == null) {
                this.M = new f();
            }
            this.a.setExpandedActionViewsExclusive(true);
            eVar.c(this.M, this.j);
            T();
        }
    }

    public final void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.J);
            this.a.O(this.N, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.a = (this.n & 112) | 8388613;
            this.a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.a, false);
        }
    }

    public final void l() {
        if (this.d == null) {
            this.d = new mr(getContext(), null, zy4.M);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof t5.a ? new g((t5.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        T();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.F;
        boolean zB = bs7.b(this);
        int i4 = !zB ? 1 : 0;
        if (R(this.d)) {
            F(this.d, i2, 0, i3, 0, this.o);
            measuredWidth = this.d.getMeasuredWidth() + s(this.d);
            iMax = Math.max(0, this.d.getMeasuredHeight() + t(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (R(this.h)) {
            F(this.h, i2, 0, i3, 0, this.o);
            measuredWidth = this.h.getMeasuredWidth() + s(this.h);
            iMax = Math.max(iMax, this.h.getMeasuredHeight() + t(this.h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (R(this.a)) {
            F(this.a, i2, iMax3, i3, 0, this.o);
            measuredWidth2 = this.a.getMeasuredWidth() + s(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + t(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (R(this.i)) {
            iMax4 += E(this.i, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.i.getMeasuredHeight() + t(this.i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (R(this.e)) {
            iMax4 += E(this.e, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.e.getMeasuredHeight() + t(this.e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((g) childAt.getLayoutParams()).b == 0 && R(childAt)) {
                iMax4 += E(childAt, i2, iMax4, i3, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i6 = this.r + this.s;
        int i7 = this.p + this.q;
        if (R(this.b)) {
            E(this.b, i2, iMax4 + i7, i3, i6, iArr);
            int measuredWidth3 = this.b.getMeasuredWidth() + s(this.b);
            measuredHeight = this.b.getMeasuredHeight() + t(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (R(this.c)) {
            iMax2 = Math.max(iMax2, E(this.c, i2, iMax4 + i7, i3, measuredHeight + i6, iArr));
            measuredHeight += this.c.getMeasuredHeight() + t(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), Q() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.c());
        ActionMenuView actionMenuView = this.a;
        androidx.appcompat.view.menu.e eVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = iVar.f;
        if (i2 != 0 && this.M != null && eVarN != null && (menuItemFindItem = eVarN.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.g) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        h();
        this.t.f(i2 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.M;
        if (fVar != null && (gVar = fVar.b) != null) {
            iVar.f = gVar.getItemId();
        }
        iVar.g = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(int i2) {
        int iB = dq7.B(this);
        int iB2 = jk2.b(i2, iB) & 7;
        return (iB2 == 1 || iB2 == 3 || iB2 == 5) ? iB2 : iB == 1 ? 5 : 3;
    }

    public final int q(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iR = r(gVar.a);
        if (iR == 48) {
            return getPaddingTop() - i3;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.w & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return wp3.b(marginLayoutParams) + wp3.a(marginLayoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.S != z) {
            this.S = z;
            T();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(tr.b(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = IntCompanionObject.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = IntCompanionObject.MIN_VALUE;
        }
        if (i2 != this.u) {
            this.u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(tr.b(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(tr.b(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.k != i2) {
            this.k = i2;
            if (i2 == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int measuredWidth = 0;
        while (i4 < size) {
            View view = (View) list.get(i4);
            g gVar = (g) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i2;
            int i6 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i3;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, i6);
            int iMax3 = Math.max(0, -i5);
            int iMax4 = Math.max(0, -i6);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i4++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    public boolean v() {
        f fVar = this.M;
        return (fVar == null || fVar.b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void y() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        I();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new qs3(new Runnable() { // from class: com.zepto.li6
            @Override // java.lang.Runnable
            public final void run() {
                this.c.y();
            }
        });
        this.H = new ArrayList();
        this.J = new a();
        this.T = new b();
        Context context2 = getContext();
        int[] iArr = c25.W2;
        lg6 lg6VarV = lg6.v(context2, attributeSet, iArr, i2, 0);
        dq7.o0(this, context, iArr, attributeSet, lg6VarV.r(), i2, 0);
        this.l = lg6VarV.n(c25.y3, 0);
        this.m = lg6VarV.n(c25.p3, 0);
        this.w = lg6VarV.l(c25.X2, this.w);
        this.n = lg6VarV.l(c25.Y2, 48);
        int iE = lg6VarV.e(c25.s3, 0);
        int i3 = c25.x3;
        iE = lg6VarV.s(i3) ? lg6VarV.e(i3, iE) : iE;
        this.s = iE;
        this.r = iE;
        this.q = iE;
        this.p = iE;
        int iE2 = lg6VarV.e(c25.v3, -1);
        if (iE2 >= 0) {
            this.p = iE2;
        }
        int iE3 = lg6VarV.e(c25.u3, -1);
        if (iE3 >= 0) {
            this.q = iE3;
        }
        int iE4 = lg6VarV.e(c25.w3, -1);
        if (iE4 >= 0) {
            this.r = iE4;
        }
        int iE5 = lg6VarV.e(c25.t3, -1);
        if (iE5 >= 0) {
            this.s = iE5;
        }
        this.o = lg6VarV.f(c25.j3, -1);
        int iE6 = lg6VarV.e(c25.f3, IntCompanionObject.MIN_VALUE);
        int iE7 = lg6VarV.e(c25.b3, IntCompanionObject.MIN_VALUE);
        int iF = lg6VarV.f(c25.d3, 0);
        int iF2 = lg6VarV.f(c25.e3, 0);
        h();
        this.t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.t.g(iE6, iE7);
        }
        this.u = lg6VarV.e(c25.g3, IntCompanionObject.MIN_VALUE);
        this.v = lg6VarV.e(c25.c3, IntCompanionObject.MIN_VALUE);
        this.f = lg6VarV.g(c25.a3);
        this.g = lg6VarV.p(c25.Z2);
        CharSequence charSequenceP = lg6VarV.p(c25.r3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = lg6VarV.p(c25.o3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.j = getContext();
        setPopupTheme(lg6VarV.n(c25.n3, 0));
        Drawable drawableG = lg6VarV.g(c25.m3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = lg6VarV.p(c25.l3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = lg6VarV.g(c25.h3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = lg6VarV.p(c25.i3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i4 = c25.z3;
        if (lg6VarV.s(i4)) {
            setTitleTextColor(lg6VarV.c(i4));
        }
        int i5 = c25.q3;
        if (lg6VarV.s(i5)) {
            setSubtitleTextColor(lg6VarV.c(i5));
        }
        int i6 = c25.k3;
        if (lg6VarV.s(i6)) {
            x(lg6VarV.n(i6, 0));
        }
        lg6VarV.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.e)) {
                c(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && z(imageView)) {
                removeView(this.e);
                this.E.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            qi6.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.d)) {
                c(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && z(textView)) {
                removeView(this.c);
                this.E.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!z(this.c)) {
                c(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && z(textView)) {
                removeView(this.b);
                this.E.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.l;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!z(this.b)) {
                c(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends z1 {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public int f;
        public boolean g;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readInt();
            this.g = parcel.readInt() != 0;
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
