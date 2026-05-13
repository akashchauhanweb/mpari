package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cg {
    public final RelativeLayout a;
    public final RecyclerView b;
    public final NestedScrollView c;
    public final AppCompatTextView d;
    public final AppCompatEditText e;
    public final ProgressBar f;
    public final MyTextView g;
    public final AppCompatTextView h;
    public final d47 i;
    public final AppCompatTextView j;

    public cg(RelativeLayout relativeLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, AppCompatTextView appCompatTextView2, d47 d47Var, AppCompatTextView appCompatTextView3) {
        this.a = relativeLayout;
        this.b = recyclerView;
        this.c = nestedScrollView;
        this.d = appCompatTextView;
        this.e = appCompatEditText;
        this.f = progressBar;
        this.g = myTextView;
        this.h = appCompatTextView2;
        this.i = d47Var;
        this.j = appCompatTextView3;
    }

    public static cg a(View view) {
        int i = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            i = R.id.nestedScrollView;
            NestedScrollView nestedScrollView = (NestedScrollView) zp7.a(view, R.id.nestedScrollView);
            if (nestedScrollView != null) {
                i = R.id.noChallanFoundTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.noChallanFoundTv);
                if (appCompatTextView != null) {
                    i = R.id.numberEt;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.numberEt);
                    if (appCompatEditText != null) {
                        i = R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progressBar);
                        if (progressBar != null) {
                            i = R.id.searchTv;
                            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.searchTv);
                            if (myTextView != null) {
                                i = R.id.titleTv;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                if (appCompatTextView2 != null) {
                                    i = R.id.topHolder;
                                    View viewA = zp7.a(view, R.id.topHolder);
                                    if (viewA != null) {
                                        d47 d47VarA = d47.a(viewA);
                                        i = R.id.totalChallanCountTv;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.totalChallanCountTv);
                                        if (appCompatTextView3 != null) {
                                            return new cg((RelativeLayout) view, recyclerView, nestedScrollView, appCompatTextView, appCompatEditText, progressBar, myTextView, appCompatTextView2, d47VarA, appCompatTextView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static cg c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static cg d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_search_print_challan_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
