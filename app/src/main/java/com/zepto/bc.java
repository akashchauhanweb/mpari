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
public final class bc {
    public final CoordinatorLayout a;
    public final d47 b;
    public final FrameLayout c;
    public final LinearLayout d;
    public final WebView e;
    public final CoordinatorLayout f;

    public bc(CoordinatorLayout coordinatorLayout, d47 d47Var, FrameLayout frameLayout, LinearLayout linearLayout, WebView webView, CoordinatorLayout coordinatorLayout2) {
        this.a = coordinatorLayout;
        this.b = d47Var;
        this.c = frameLayout;
        this.d = linearLayout;
        this.e = webView;
        this.f = coordinatorLayout2;
    }

    public static bc a(View view) {
        int i = R.id.holder1;
        View viewA = zp7.a(view, R.id.holder1);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            i = R.id.nextBtnFl;
            FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.nextBtnFl);
            if (frameLayout != null) {
                i = R.id.next_button;
                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.next_button);
                if (linearLayout != null) {
                    i = R.id.paymentWv;
                    WebView webView = (WebView) zp7.a(view, R.id.paymentWv);
                    if (webView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        return new bc(coordinatorLayout, d47VarA, frameLayout, linearLayout, webView, coordinatorLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static bc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static bc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_informational_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
