package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sf {
    public final NestedScrollView a;
    public final RecyclerView b;
    public final NestedScrollView c;
    public final d47 d;
    public final MyTextView e;

    public sf(NestedScrollView nestedScrollView, RecyclerView recyclerView, NestedScrollView nestedScrollView2, d47 d47Var, MyTextView myTextView) {
        this.a = nestedScrollView;
        this.b = recyclerView;
        this.c = nestedScrollView2;
        this.d = d47Var;
        this.e = myTextView;
    }

    public static sf a(View view) {
        int i = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            i = R.id.topHolder;
            View viewA = zp7.a(view, R.id.topHolder);
            if (viewA != null) {
                d47 d47VarA = d47.a(viewA);
                i = R.id.tv_view_challan;
                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.tv_view_challan);
                if (myTextView != null) {
                    return new sf(nestedScrollView, recyclerView, nestedScrollView, d47VarA, myTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static sf c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static sf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_runnning_auction_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public NestedScrollView b() {
        return this.a;
    }
}
