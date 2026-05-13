package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class xf {
    public final RelativeLayout a;
    public final AppCompatTextView b;
    public final RecyclerView c;
    public final AppCompatTextView d;
    public final NestedScrollView e;
    public final AppCompatTextView f;
    public final AppCompatEditText g;
    public final AppCompatTextView h;
    public final ProgressBar i;
    public final MyTextView j;
    public final LinearLayout k;
    public final AppCompatTextView l;
    public final d47 m;
    public final AppCompatTextView n;

    public xf(RelativeLayout relativeLayout, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatTextView appCompatTextView2, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView3, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView4, ProgressBar progressBar, MyTextView myTextView, LinearLayout linearLayout, AppCompatTextView appCompatTextView5, d47 d47Var, AppCompatTextView appCompatTextView6) {
        this.a = relativeLayout;
        this.b = appCompatTextView;
        this.c = recyclerView;
        this.d = appCompatTextView2;
        this.e = nestedScrollView;
        this.f = appCompatTextView3;
        this.g = appCompatEditText;
        this.h = appCompatTextView4;
        this.i = progressBar;
        this.j = myTextView;
        this.k = linearLayout;
        this.l = appCompatTextView5;
        this.m = d47Var;
        this.n = appCompatTextView6;
    }

    public static xf a(View view) {
        int i = R.id.allTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.allTv);
        if (appCompatTextView != null) {
            i = R.id.challanListRv;
            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.challanListRv);
            if (recyclerView != null) {
                i = R.id.disposeTv;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.disposeTv);
                if (appCompatTextView2 != null) {
                    i = R.id.nestedScrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) zp7.a(view, R.id.nestedScrollView);
                    if (nestedScrollView != null) {
                        i = R.id.noChallanFoundTv;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.noChallanFoundTv);
                        if (appCompatTextView3 != null) {
                            i = R.id.numberEt;
                            AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.numberEt);
                            if (appCompatEditText != null) {
                                i = R.id.pendingTv;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.pendingTv);
                                if (appCompatTextView4 != null) {
                                    i = R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progressBar);
                                    if (progressBar != null) {
                                        i = R.id.searchTv;
                                        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.searchTv);
                                        if (myTextView != null) {
                                            i = R.id.tabBarLl;
                                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.tabBarLl);
                                            if (linearLayout != null) {
                                                i = R.id.titleTv;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                                if (appCompatTextView5 != null) {
                                                    i = R.id.topHolder;
                                                    View viewA = zp7.a(view, R.id.topHolder);
                                                    if (viewA != null) {
                                                        d47 d47VarA = d47.a(viewA);
                                                        i = R.id.totalChallanCountTv;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.totalChallanCountTv);
                                                        if (appCompatTextView6 != null) {
                                                            return new xf((RelativeLayout) view, appCompatTextView, recyclerView, appCompatTextView2, nestedScrollView, appCompatTextView3, appCompatEditText, appCompatTextView4, progressBar, myTextView, linearLayout, appCompatTextView5, d47VarA, appCompatTextView6);
                                                        }
                                                    }
                                                }
                                            }
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

    public static xf c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static xf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_search_challan_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
