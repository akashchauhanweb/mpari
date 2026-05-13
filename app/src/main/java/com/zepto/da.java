package com.zepto;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class da extends lq7 {
    public final iy3 A;
    public final FrameLayout B;
    public final WebView C;
    public final WebView D;
    public final ShimmerFrameLayout E;
    public final ImageView w;
    public final vy3 x;
    public final FrameLayout y;
    public final LinearLayout z;

    public da(Object obj, View view, int i, ImageView imageView, vy3 vy3Var, FrameLayout frameLayout, LinearLayout linearLayout, iy3 iy3Var, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.w = imageView;
        this.x = vy3Var;
        this.y = frameLayout;
        this.z = linearLayout;
        this.A = iy3Var;
        this.B = frameLayout2;
        this.C = webView;
        this.D = webView2;
        this.E = shimmerFrameLayout;
    }
}
