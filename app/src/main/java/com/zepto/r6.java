package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class r6 {
    public final NestedScrollView a;
    public final RecyclerView b;
    public final AppCompatEditText c;
    public final NestedScrollView d;
    public final MyTextView e;
    public final d47 f;
    public final MyTextView g;

    public r6(NestedScrollView nestedScrollView, RecyclerView recyclerView, AppCompatEditText appCompatEditText, NestedScrollView nestedScrollView2, MyTextView myTextView, d47 d47Var, MyTextView myTextView2) {
        this.a = nestedScrollView;
        this.b = recyclerView;
        this.c = appCompatEditText;
        this.d = nestedScrollView2;
        this.e = myTextView;
        this.f = d47Var;
        this.g = myTextView2;
    }

    public static r6 a(View view) {
        int i = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            i = R.id.numberEt;
            AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.numberEt);
            if (appCompatEditText != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i = R.id.searchTv;
                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.searchTv);
                if (myTextView != null) {
                    i = R.id.topHolder;
                    View viewA = zp7.a(view, R.id.topHolder);
                    if (viewA != null) {
                        d47 d47VarA = d47.a(viewA);
                        i = R.id.tv_view_challan;
                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.tv_view_challan);
                        if (myTextView2 != null) {
                            return new r6(nestedScrollView, recyclerView, appCompatEditText, nestedScrollView, myTextView, d47VarA, myTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static r6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static r6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_available_fancy_number_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public NestedScrollView b() {
        return this.a;
    }
}
