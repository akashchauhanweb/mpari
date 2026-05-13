package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rh {
    public final RelativeLayout a;
    public final RecyclerView b;
    public final AppCompatTextView c;
    public final AppCompatEditText d;
    public final ProgressBar e;
    public final MyTextView f;
    public final AppCompatTextView g;
    public final d47 h;
    public final AppCompatTextView i;

    public rh(RelativeLayout relativeLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, AppCompatTextView appCompatTextView2, d47 d47Var, AppCompatTextView appCompatTextView3) {
        this.a = relativeLayout;
        this.b = recyclerView;
        this.c = appCompatTextView;
        this.d = appCompatEditText;
        this.e = progressBar;
        this.f = myTextView;
        this.g = appCompatTextView2;
        this.h = d47Var;
        this.i = appCompatTextView3;
    }

    public static rh a(View view) {
        int i = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.challanListRv);
        if (recyclerView != null) {
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
                                        return new rh((RelativeLayout) view, recyclerView, appCompatTextView, appCompatEditText, progressBar, myTextView, appCompatTextView2, d47VarA, appCompatTextView3);
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

    public static rh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static rh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_verify_payment_challan_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
