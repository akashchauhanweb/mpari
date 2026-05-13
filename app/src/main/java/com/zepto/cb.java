package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cb {
    public final ConstraintLayout a;
    public final ri5 b;
    public final WebView c;

    public cb(ConstraintLayout constraintLayout, ri5 ri5Var, WebView webView) {
        this.a = constraintLayout;
        this.b = ri5Var;
        this.c = webView;
    }

    public static cb a(View view) {
        int i = R.id.include3;
        View viewA = zp7.a(view, R.id.include3);
        if (viewA != null) {
            ri5 ri5VarA = ri5.a(viewA);
            WebView webView = (WebView) zp7.a(view, R.id.web_view);
            if (webView != null) {
                return new cb((ConstraintLayout) view, ri5VarA, webView);
            }
            i = R.id.web_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static cb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static cb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_download_application, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
