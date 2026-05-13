package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sq7 {
    public final LinearLayout a;
    public final d47 b;
    public final WebView c;
    public final LinearLayout d;

    public sq7(LinearLayout linearLayout, d47 d47Var, WebView webView, LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = d47Var;
        this.c = webView;
        this.d = linearLayout2;
    }

    public static sq7 a(View view) {
        int i = R.id.holder;
        View viewA = zp7.a(view, R.id.holder);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            WebView webView = (WebView) zp7.a(view, R.id.paymentWv);
            if (webView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new sq7(linearLayout, d47VarA, webView, linearLayout);
            }
            i = R.id.paymentWv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static sq7 b(LayoutInflater layoutInflater) {
        return c(layoutInflater, null, false);
    }

    public static sq7 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_forms, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
