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
public final class bz1 {
    public final ScrollView a;
    public final AppCompatTextView b;
    public final AppCompatEditText c;
    public final ProgressBar d;
    public final RecyclerView e;
    public final MyTextView f;
    public final AppCompatTextView g;
    public final d47 h;
    public final AppCompatTextView i;

    public bz1(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, ProgressBar progressBar, RecyclerView recyclerView, MyTextView myTextView, AppCompatTextView appCompatTextView2, d47 d47Var, AppCompatTextView appCompatTextView3) {
        this.a = scrollView;
        this.b = appCompatTextView;
        this.c = appCompatEditText;
        this.d = progressBar;
        this.e = recyclerView;
        this.f = myTextView;
        this.g = appCompatTextView2;
        this.h = d47Var;
        this.i = appCompatTextView3;
    }

    public static bz1 a(View view) {
        int i = R.id.noChallanFoundTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.noChallanFoundTv);
        if (appCompatTextView != null) {
            i = R.id.numberEt;
            AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.numberEt);
            if (appCompatEditText != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.reprintReceiptRv;
                    RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.reprintReceiptRv);
                    if (recyclerView != null) {
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
                                        return new bz1((ScrollView) view, appCompatTextView, appCompatEditText, progressBar, recyclerView, myTextView, appCompatTextView2, d47VarA, appCompatTextView3);
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

    public static bz1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static bz1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.echallan_payment_reprint_receipt_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
