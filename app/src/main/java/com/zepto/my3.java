package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class my3 {
    public final CoordinatorLayout a;
    public final LinearLayout b;
    public final AppCompatButton c;
    public final AppCompatButton d;
    public final LinearLayout e;
    public final d47 f;
    public final RecyclerView g;
    public final TextView h;

    public my3(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, LinearLayout linearLayout2, d47 d47Var, RecyclerView recyclerView, TextView textView) {
        this.a = coordinatorLayout;
        this.b = linearLayout;
        this.c = appCompatButton;
        this.d = appCompatButton2;
        this.e = linearLayout2;
        this.f = d47Var;
        this.g = recyclerView;
        this.h = textView;
    }

    public static my3 a(View view) {
        int i = R.id.elg_dl_services;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.elg_dl_services);
        if (linearLayout != null) {
            i = R.id.reset_button;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.reset_button);
            if (appCompatButton != null) {
                i = R.id.submit_button;
                AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.submit_button);
                if (appCompatButton2 != null) {
                    i = R.id.submit_layout;
                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.submit_layout);
                    if (linearLayout2 != null) {
                        i = R.id.topHolder;
                        View viewA = zp7.a(view, R.id.topHolder);
                        if (viewA != null) {
                            d47 d47VarA = d47.a(viewA);
                            i = R.id.vahan_recyclerView;
                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.vahan_recyclerView);
                            if (recyclerView != null) {
                                i = R.id.vahan_title;
                                TextView textView = (TextView) zp7.a(view, R.id.vahan_title);
                                if (textView != null) {
                                    return new my3((CoordinatorLayout) view, linearLayout, appCompatButton, appCompatButton2, linearLayout2, d47VarA, recyclerView, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static my3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static my3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.multiservicelayout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
