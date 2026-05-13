package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lv4 {
    public final LinearLayout a;
    public final d47 b;
    public final WebView c;
    public final LinearLayout d;

    public lv4(LinearLayout linearLayout, d47 d47Var, WebView webView, LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = d47Var;
        this.c = webView;
        this.d = linearLayout2;
    }

    public static lv4 a(View view) {
        int i = R.id.echallanHolder;
        View viewA = zp7.a(view, R.id.echallanHolder);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            WebView webView = (WebView) zp7.a(view, R.id.paymentWv);
            if (webView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new lv4(linearLayout, d47VarA, webView, linearLayout);
            }
            i = R.id.paymentWv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static lv4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static lv4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.print_challan_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
