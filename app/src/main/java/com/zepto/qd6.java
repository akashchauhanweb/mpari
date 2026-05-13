package com.zepto;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qd6 extends lq7 {
    public final WebView A;
    public final WebView B;
    public final ShimmerFrameLayout C;
    public final ImageView w;
    public final vy3 x;
    public final FrameLayout y;
    public final FrameLayout z;

    public qd6(Object obj, View view, int i, ImageView imageView, vy3 vy3Var, FrameLayout frameLayout, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.w = imageView;
        this.x = vy3Var;
        this.y = frameLayout;
        this.z = frameLayout2;
        this.A = webView;
        this.B = webView2;
        this.C = shimmerFrameLayout;
    }
}
