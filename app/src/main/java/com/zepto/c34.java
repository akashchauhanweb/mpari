package com.zepto;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import com.zepto.d24;
import com.zepto.jq;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c34 {
    public static final c34 a = new c34();

    public static final class a implements d24.c {
        public final /* synthetic */ WeakReference a;
        public final /* synthetic */ d24 b;

        public a(WeakReference weakReference, d24 d24Var) {
            this.a = weakReference;
            this.b = d24Var;
        }

        @Override // com.zepto.d24.c
        public void a(d24 controller, j24 destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(destination, "destination");
            NavigationView navigationView = (NavigationView) this.a.get();
            if (navigationView == null) {
                this.b.h0(this);
                return;
            }
            if (destination instanceof md2) {
                return;
            }
            Menu menu = navigationView.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                item.setChecked(c34.c(destination, item.getItemId()));
            }
        }
    }

    public static final BottomSheetBehavior b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
            if (cVarF instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVarF;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return b((View) parent);
        }
        return null;
    }

    public static final boolean c(j24 j24Var, int i) {
        Intrinsics.checkNotNullParameter(j24Var, "<this>");
        Iterator it = j24.m.c(j24Var).iterator();
        while (it.hasNext()) {
            if (((j24) it.next()).P() == i) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(d24 navController, jq configuration) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        mh4 mh4VarB = configuration.b();
        j24 j24VarD = navController.D();
        if (mh4VarB != null && j24VarD != null && configuration.c(j24VarD)) {
            mh4VarB.a();
            return true;
        }
        if (navController.S()) {
            return true;
        }
        jq.b bVarA = configuration.a();
        if (bVarA != null) {
            return bVarA.a();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(android.view.MenuItem r5, com.zepto.d24 r6) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.c34.e(android.view.MenuItem, com.zepto.d24):boolean");
    }

    public static final void f(pq activity, d24 navController, jq configuration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.r(new w5(activity, configuration));
    }

    public static final void g(final NavigationView navigationView, final d24 navController) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationView.d() { // from class: com.zepto.b34
            @Override // com.google.android.material.navigation.NavigationView.d
            public final boolean a(MenuItem menuItem) {
                return c34.h(navController, navigationView, menuItem);
            }
        });
        navController.r(new a(new WeakReference(navigationView), navController));
    }

    public static final boolean h(d24 navController, NavigationView navigationView, MenuItem item) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(navigationView, "$navigationView");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean zE = e(item, navController);
        if (zE) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof mh4) {
                ((mh4) parent).close();
            } else {
                BottomSheetBehavior bottomSheetBehaviorB = b(navigationView);
                if (bottomSheetBehaviorB != null) {
                    bottomSheetBehaviorB.X0(5);
                }
            }
        }
        return zE;
    }
}
