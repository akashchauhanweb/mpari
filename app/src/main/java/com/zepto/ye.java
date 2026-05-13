package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ye extends lq7 {
    public final vy3 A;
    public final iy3 B;
    public final CardView C;
    public final MyTextView D;
    public final TextView E;
    public final MyTextView F;
    public final MyTextView G;
    public final TextView H;
    public final LinearLayout w;
    public final CustomWegetLayout x;
    public final CustomWegetLayout y;
    public final ImageView z;

    public ye(Object obj, View view, int i, LinearLayout linearLayout, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, ImageView imageView, vy3 vy3Var, iy3 iy3Var, CardView cardView, MyTextView myTextView, TextView textView, MyTextView myTextView2, MyTextView myTextView3, TextView textView2) {
        super(obj, view, i);
        this.w = linearLayout;
        this.x = customWegetLayout;
        this.y = customWegetLayout2;
        this.z = imageView;
        this.A = vy3Var;
        this.B = iy3Var;
        this.C = cardView;
        this.D = myTextView;
        this.E = textView;
        this.F = myTextView2;
        this.G = myTextView3;
        this.H = textView2;
    }

    public static ye x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static ye y(LayoutInflater layoutInflater, Object obj) {
        return (ye) lq7.o(layoutInflater, R.layout.activity_renewal_cl, null, false, obj);
    }
}
