package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y8 extends lq7 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ri5 D;
    public final TextView E;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final TextView z;

    public y8(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, ri5 ri5Var, TextView textView5) {
        super(obj, view, i);
        this.w = imageView;
        this.x = imageView2;
        this.y = imageView3;
        this.z = textView;
        this.A = textView2;
        this.B = textView3;
        this.C = textView4;
        this.D = ri5Var;
        this.E = textView5;
    }

    public static y8 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static y8 y(LayoutInflater layoutInflater, Object obj) {
        return (y8) lq7.o(layoutInflater, R.layout.activity_delete_account, null, false, obj);
    }
}
