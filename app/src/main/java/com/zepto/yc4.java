package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yc4 {
    public final RelativeLayout a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final RecyclerView d;
    public final AppCompatTextView e;
    public final NestedScrollView f;
    public final AppCompatTextView g;
    public final AppCompatTextView h;
    public final RecyclerView i;
    public final AppCompatTextView j;
    public final ProgressBar k;
    public final LinearLayout l;
    public final d47 m;
    public final AppCompatTextView n;

    public yc4(RelativeLayout relativeLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RecyclerView recyclerView, AppCompatTextView appCompatTextView3, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, RecyclerView recyclerView2, AppCompatTextView appCompatTextView6, ProgressBar progressBar, LinearLayout linearLayout, d47 d47Var, AppCompatTextView appCompatTextView7) {
        this.a = relativeLayout;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = recyclerView;
        this.e = appCompatTextView3;
        this.f = nestedScrollView;
        this.g = appCompatTextView4;
        this.h = appCompatTextView5;
        this.i = recyclerView2;
        this.j = appCompatTextView6;
        this.k = progressBar;
        this.l = linearLayout;
        this.m = d47Var;
        this.n = appCompatTextView7;
    }

    public static yc4 a(View view) {
        int i = R.id.allTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.allTv);
        if (appCompatTextView != null) {
            i = R.id.challanDetailsTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.challanDetailsTv);
            if (appCompatTextView2 != null) {
                i = R.id.challanListRv;
                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.challanListRv);
                if (recyclerView != null) {
                    i = R.id.disposeTv;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.disposeTv);
                    if (appCompatTextView3 != null) {
                        i = R.id.nestedScrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) zp7.a(view, R.id.nestedScrollView);
                        if (nestedScrollView != null) {
                            i = R.id.noChallanFoundTv;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.noChallanFoundTv);
                            if (appCompatTextView4 != null) {
                                i = R.id.noticeDetailsTv;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.noticeDetailsTv);
                                if (appCompatTextView5 != null) {
                                    i = R.id.noticeListRv;
                                    RecyclerView recyclerView2 = (RecyclerView) zp7.a(view, R.id.noticeListRv);
                                    if (recyclerView2 != null) {
                                        i = R.id.pendingTv;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.pendingTv);
                                        if (appCompatTextView6 != null) {
                                            i = R.id.progressBar;
                                            ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progressBar);
                                            if (progressBar != null) {
                                                i = R.id.tabBarLl;
                                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.tabBarLl);
                                                if (linearLayout != null) {
                                                    i = R.id.topHolder;
                                                    View viewA = zp7.a(view, R.id.topHolder);
                                                    if (viewA != null) {
                                                        d47 d47VarA = d47.a(viewA);
                                                        i = R.id.totalChallanCountTv;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.totalChallanCountTv);
                                                        if (appCompatTextView7 != null) {
                                                            return new yc4((RelativeLayout) view, appCompatTextView, appCompatTextView2, recyclerView, appCompatTextView3, nestedScrollView, appCompatTextView4, appCompatTextView5, recyclerView2, appCompatTextView6, progressBar, linearLayout, d47VarA, appCompatTextView7);
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

    public static yc4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static yc4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.notice_challan_vehicle_search_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
