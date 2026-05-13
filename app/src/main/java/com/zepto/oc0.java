package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oc0 {
    public final LinearLayout a;
    public final d47 b;
    public final WebView c;

    public oc0(LinearLayout linearLayout, d47 d47Var, WebView webView) {
        this.a = linearLayout;
        this.b = d47Var;
        this.c = webView;
    }

    public static oc0 a(View view) {
        int i = R.id.holder1;
        View viewA = zp7.a(view, R.id.holder1);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            WebView webView = (WebView) zp7.a(view, R.id.paymentWv);
            if (webView != null) {
                return new oc0((LinearLayout) view, d47VarA, webView);
            }
            i = R.id.paymentWv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static oc0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static oc0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.challan_payment_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
