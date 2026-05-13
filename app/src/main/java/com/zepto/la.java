package com.zepto;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class la extends lq7 {
    public final ImageView A;
    public final iy3 B;
    public final LinearLayout C;
    public final ImageView D;
    public final ImageView E;
    public final CardView F;
    public final CustomWegetLayout G;
    public final LinearLayout H;
    public final TextView I;
    public final LinearLayout J;
    public final CustomWegetLayout K;
    public final TextView L;
    public final MyTextView w;
    public final ConstraintLayout x;
    public final TextView y;
    public final ImageView z;

    public la(Object obj, View view, int i, MyTextView myTextView, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, iy3 iy3Var, LinearLayout linearLayout, ImageView imageView3, ImageView imageView4, CardView cardView, CustomWegetLayout customWegetLayout, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, CustomWegetLayout customWegetLayout2, TextView textView3) {
        super(obj, view, i);
        this.w = myTextView;
        this.x = constraintLayout;
        this.y = textView;
        this.z = imageView;
        this.A = imageView2;
        this.B = iy3Var;
        this.C = linearLayout;
        this.D = imageView3;
        this.E = imageView4;
        this.F = cardView;
        this.G = customWegetLayout;
        this.H = linearLayout2;
        this.I = textView2;
        this.J = linearLayout3;
        this.K = customWegetLayout2;
        this.L = textView3;
    }
}
