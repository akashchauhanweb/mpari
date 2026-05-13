package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o52 {
    public final LinearLayout a;
    public final d47 b;
    public final WebView c;

    public o52(LinearLayout linearLayout, d47 d47Var, WebView webView) {
        this.a = linearLayout;
        this.b = d47Var;
        this.c = webView;
    }

    public static o52 a(View view) {
        int i = R.id.topHolder;
        View viewA = zp7.a(view, R.id.topHolder);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            WebView webView = (WebView) zp7.a(view, R.id.videoWv);
            if (webView != null) {
                return new o52((LinearLayout) view, d47VarA, webView);
            }
            i = R.id.videoWv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static o52 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static o52 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.evidence_video_play, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
