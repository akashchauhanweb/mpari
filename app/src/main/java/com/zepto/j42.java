package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j42 {
    public final CoordinatorLayout a;
    public final vy3 b;
    public final FrameLayout c;
    public final WebView d;
    public final TextView e;
    public final TextView f;

    public j42(CoordinatorLayout coordinatorLayout, vy3 vy3Var, FrameLayout frameLayout, WebView webView, TextView textView, TextView textView2) {
        this.a = coordinatorLayout;
        this.b = vy3Var;
        this.c = frameLayout;
        this.d = webView;
        this.e = textView;
        this.f = textView2;
    }

    public static j42 a(View view) {
        int i = R.id.header_layout;
        View viewA = zp7.a(view, R.id.header_layout);
        if (viewA != null) {
            vy3 vy3VarA = vy3.a(viewA);
            i = R.id.linear_parent;
            FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.linear_parent);
            if (frameLayout != null) {
                i = R.id.paymentWv;
                WebView webView = (WebView) zp7.a(view, R.id.paymentWv);
                if (webView != null) {
                    i = R.id.vehicle_number;
                    TextView textView = (TextView) zp7.a(view, R.id.vehicle_number);
                    if (textView != null) {
                        i = R.id.vehicle_view;
                        TextView textView2 = (TextView) zp7.a(view, R.id.vehicle_view);
                        if (textView2 != null) {
                            return new j42((CoordinatorLayout) view, vy3VarA, frameLayout, webView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static j42 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static j42 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.esign_dms, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
