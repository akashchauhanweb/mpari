package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean h;

    public SearchBar$ScrollingViewBehavior() {
        this.h = false;
    }

    @Override // com.zepto.ol2
    public boolean T() {
        return true;
    }

    public final void Y(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(0.0f);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean zL = super.l(coordinatorLayout, view, view2);
        if (!this.h && (view2 instanceof AppBarLayout)) {
            this.h = true;
            Y((AppBarLayout) view2);
        }
        return zL;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
    }
}
