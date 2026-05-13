package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gc7 {
    public final CoordinatorLayout a;
    public final d47 b;
    public final WebView c;

    public gc7(CoordinatorLayout coordinatorLayout, d47 d47Var, WebView webView) {
        this.a = coordinatorLayout;
        this.b = d47Var;
        this.c = webView;
    }

    public static gc7 a(View view) {
        int i = R.id.topHolder;
        View viewA = zp7.a(view, R.id.topHolder);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            WebView webView = (WebView) zp7.a(view, R.id.web_view);
            if (webView != null) {
                return new gc7((CoordinatorLayout) view, d47VarA, webView);
            }
            i = R.id.web_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static gc7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static gc7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_payment_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
