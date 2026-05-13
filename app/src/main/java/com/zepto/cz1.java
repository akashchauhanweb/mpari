package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cz1 {
    public final ScrollView a;
    public final AppCompatTextView b;
    public final AppCompatEditText c;
    public final ProgressBar d;
    public final MyTextView e;
    public final AppCompatTextView f;
    public final d47 g;
    public final AppCompatTextView h;
    public final RecyclerView i;

    public cz1(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, AppCompatTextView appCompatTextView2, d47 d47Var, AppCompatTextView appCompatTextView3, RecyclerView recyclerView) {
        this.a = scrollView;
        this.b = appCompatTextView;
        this.c = appCompatEditText;
        this.d = progressBar;
        this.e = myTextView;
        this.f = appCompatTextView2;
        this.g = d47Var;
        this.h = appCompatTextView3;
        this.i = recyclerView;
    }

    public static cz1 a(View view) {
        int i = R.id.noChallanFoundTv;
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
                                    i = R.id.transactionStatusRv;
                                    RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.transactionStatusRv);
                                    if (recyclerView != null) {
                                        return new cz1((ScrollView) view, appCompatTextView, appCompatEditText, progressBar, myTextView, appCompatTextView2, d47VarA, appCompatTextView3, recyclerView);
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

    public static cz1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static cz1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.echallan_payment_transcation_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
