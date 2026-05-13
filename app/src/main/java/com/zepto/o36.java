package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o36 {
    public final CoordinatorLayout a;
    public final d47 b;
    public final LinearLayout c;
    public final FrameLayout d;
    public final WebView e;
    public final CoordinatorLayout f;

    public o36(CoordinatorLayout coordinatorLayout, d47 d47Var, LinearLayout linearLayout, FrameLayout frameLayout, WebView webView, CoordinatorLayout coordinatorLayout2) {
        this.a = coordinatorLayout;
        this.b = d47Var;
        this.c = linearLayout;
        this.d = frameLayout;
        this.e = webView;
        this.f = coordinatorLayout2;
    }

    public static o36 a(View view) {
        int i = R.id.holder1;
        View viewA = zp7.a(view, R.id.holder1);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            i = R.id.homeBtn;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.homeBtn);
            if (linearLayout != null) {
                i = R.id.homeBtnFl;
                FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.homeBtnFl);
                if (frameLayout != null) {
                    i = R.id.paymentWv;
                    WebView webView = (WebView) zp7.a(view, R.id.paymentWv);
                    if (webView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        return new o36(coordinatorLayout, d47VarA, linearLayout, frameLayout, webView, coordinatorLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static o36 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static o36 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.slot_receipt_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
