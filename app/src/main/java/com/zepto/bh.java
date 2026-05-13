package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bh {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final FrameLayout c;
    public final d47 d;
    public final WebView e;

    public bh(ConstraintLayout constraintLayout, LinearLayout linearLayout, FrameLayout frameLayout, d47 d47Var, WebView webView) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = frameLayout;
        this.d = d47Var;
        this.e = webView;
    }

    public static bh a(View view) {
        int i = R.id.download;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.download);
        if (linearLayout != null) {
            i = R.id.homeBtnFl;
            FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.homeBtnFl);
            if (frameLayout != null) {
                i = R.id.topHolder;
                View viewA = zp7.a(view, R.id.topHolder);
                if (viewA != null) {
                    d47 d47VarA = d47.a(viewA);
                    i = R.id.web_view;
                    WebView webView = (WebView) zp7.a(view, R.id.web_view);
                    if (webView != null) {
                        return new bh((ConstraintLayout) view, linearLayout, frameLayout, d47VarA, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static bh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static bh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_v__payment_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
