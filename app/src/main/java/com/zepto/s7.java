package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s7 extends lq7 {
    public final FrameLayout A;
    public final WebView B;
    public final WebView C;
    public final ShimmerFrameLayout D;
    public final ImageView w;
    public final vy3 x;
    public final FrameLayout y;
    public final iy3 z;

    public s7(Object obj, View view, int i, ImageView imageView, vy3 vy3Var, FrameLayout frameLayout, iy3 iy3Var, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.w = imageView;
        this.x = vy3Var;
        this.y = frameLayout;
        this.z = iy3Var;
        this.A = frameLayout2;
        this.B = webView;
        this.C = webView2;
        this.D = shimmerFrameLayout;
    }

    public static s7 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static s7 y(LayoutInflater layoutInflater, Object obj) {
        return (s7) lq7.o(layoutInflater, R.layout.activity_cl_fee_payment, null, false, obj);
    }
}
