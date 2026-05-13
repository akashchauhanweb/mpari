package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pc extends lq7 {
    public final View A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final vy3 E;
    public final ImageView F;
    public final TextView G;
    public final LinearLayout H;
    public final iy3 I;
    public final ImageView J;
    public final TextView K;
    public final zo1 L;
    public final RecyclerView M;
    public final View N;
    public final ImageView w;
    public final TextView x;
    public final ImageView y;
    public final TextView z;

    public pc(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, View view2, TextView textView3, TextView textView4, TextView textView5, vy3 vy3Var, ImageView imageView3, TextView textView6, LinearLayout linearLayout, iy3 iy3Var, ImageView imageView4, TextView textView7, zo1 zo1Var, RecyclerView recyclerView, View view3) {
        super(obj, view, i);
        this.w = imageView;
        this.x = textView;
        this.y = imageView2;
        this.z = textView2;
        this.A = view2;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = vy3Var;
        this.F = imageView3;
        this.G = textView6;
        this.H = linearLayout;
        this.I = iy3Var;
        this.J = imageView4;
        this.K = textView7;
        this.L = zo1Var;
        this.M = recyclerView;
        this.N = view3;
    }

    public static pc x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static pc y(LayoutInflater layoutInflater, Object obj) {
        return (pc) lq7.o(layoutInflater, R.layout.activity_ll_appointment, null, false, obj);
    }
}
