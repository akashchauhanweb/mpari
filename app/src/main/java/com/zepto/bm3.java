package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bm3 extends lq7 {
    public final WebView A;
    public final ShimmerFrameLayout B;
    public final ImageView w;
    public final vy3 x;
    public final FrameLayout y;
    public final FrameLayout z;

    public bm3(Object obj, View view, int i, ImageView imageView, vy3 vy3Var, FrameLayout frameLayout, FrameLayout frameLayout2, WebView webView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.w = imageView;
        this.x = vy3Var;
        this.y = frameLayout;
        this.z = frameLayout2;
        this.A = webView;
        this.B = shimmerFrameLayout;
    }

    public static bm3 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static bm3 y(LayoutInflater layoutInflater, Object obj) {
        return (bm3) lq7.o(layoutInflater, R.layout.ll_test_activity, null, false, obj);
    }
}
