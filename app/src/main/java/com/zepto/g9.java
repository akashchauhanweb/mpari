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
public abstract class g9 extends lq7 {
    public final ImageView A;
    public final ImageView B;
    public final CardView C;
    public final CustomWegetLayout D;
    public final CustomWegetLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final MyTextView w;
    public final ConstraintLayout x;
    public final ImageView y;
    public final ImageView z;

    public g9(Object obj, View view, int i, MyTextView myTextView, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, CardView cardView, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, TextView textView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.w = myTextView;
        this.x = constraintLayout;
        this.y = imageView;
        this.z = imageView2;
        this.A = imageView3;
        this.B = imageView4;
        this.C = cardView;
        this.D = customWegetLayout;
        this.E = customWegetLayout2;
        this.F = textView;
        this.G = linearLayout;
    }

    public static g9 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static g9 y(LayoutInflater layoutInflater, Object obj) {
        return (g9) lq7.o(layoutInflater, R.layout.activity_dl_application_screen, null, false, obj);
    }
}
