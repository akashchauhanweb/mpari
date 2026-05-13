package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m6 {
    public final CoordinatorLayout a;
    public final d47 b;
    public final MyTextView c;
    public final RecyclerView d;

    public m6(CoordinatorLayout coordinatorLayout, d47 d47Var, MyTextView myTextView, RecyclerView recyclerView) {
        this.a = coordinatorLayout;
        this.b = d47Var;
        this.c = myTextView;
        this.d = recyclerView;
    }

    public static m6 a(View view) {
        int i = R.id.applicationStatusHeader;
        View viewA = zp7.a(view, R.id.applicationStatusHeader);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            int i2 = R.id.idLayoutTitle;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.idLayoutTitle);
            if (myTextView != null) {
                i2 = R.id.list_item;
                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.list_item);
                if (recyclerView != null) {
                    return new m6((CoordinatorLayout) view, d47VarA, myTextView, recyclerView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static m6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static m6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_appl_status_application_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
