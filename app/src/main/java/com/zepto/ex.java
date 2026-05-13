package com.zepto;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ex extends lq7 {
    public final vy3 A;
    public final ImageView B;
    public final iy3 C;
    public final ImageView D;
    public final ImageView E;
    public final LinearLayout F;
    public final LinearLayout w;
    public final MyTextView x;
    public final MyTextView y;
    public final TextView z;

    public ex(Object obj, View view, int i, LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, TextView textView, vy3 vy3Var, ImageView imageView, iy3 iy3Var, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.w = linearLayout;
        this.x = myTextView;
        this.y = myTextView2;
        this.z = textView;
        this.A = vy3Var;
        this.B = imageView;
        this.C = iy3Var;
        this.D = imageView2;
        this.E = imageView3;
        this.F = linearLayout2;
    }
}
