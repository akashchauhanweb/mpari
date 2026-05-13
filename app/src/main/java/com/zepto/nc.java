package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nc extends lq7 {
    public final ImageView A;
    public final iy3 B;
    public final ImageView C;
    public final CardView D;
    public final CustomWegetLayout E;
    public final CustomWegetLayout F;
    public final TextView G;
    public final LinearLayout H;
    public final MyTextView w;
    public final ConstraintLayout x;
    public final ImageView y;
    public final ImageView z;

    public nc(Object obj, View view, int i, MyTextView myTextView, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, iy3 iy3Var, ImageView imageView4, CardView cardView, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, TextView textView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.w = myTextView;
        this.x = constraintLayout;
        this.y = imageView;
        this.z = imageView2;
        this.A = imageView3;
        this.B = iy3Var;
        this.C = imageView4;
        this.D = cardView;
        this.E = customWegetLayout;
        this.F = customWegetLayout2;
        this.G = textView;
        this.H = linearLayout;
    }

    public static nc x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static nc y(LayoutInflater layoutInflater, Object obj) {
        return (nc) lq7.o(layoutInflater, R.layout.activity_ll_application_number, null, false, obj);
    }
}
