package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.zepto.iq3;
import com.zepto.wb0;

/* JADX INFO: loaded from: classes.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.b, iq3 {

    public static class Behavior extends CoordinatorLayout.c {
        public Behavior() {
        }

        public boolean I(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            wb0.a(view);
            return I(coordinatorLayout, null, view2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
