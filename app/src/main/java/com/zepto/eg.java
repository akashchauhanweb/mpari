package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eg extends lq7 {
    public final ImageView A;
    public final vy3 B;
    public final CardView C;
    public final CustomWegetLayout D;
    public final CustomWegetLayout E;
    public final MyTextView F;
    public final TextView G;
    public final TextView H;
    public final CheckBox w;
    public final CheckBox x;
    public final CheckBox y;
    public final CheckBox z;

    public eg(Object obj, View view, int i, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, ImageView imageView, vy3 vy3Var, CardView cardView, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, MyTextView myTextView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.w = checkBox;
        this.x = checkBox2;
        this.y = checkBox3;
        this.z = checkBox4;
        this.A = imageView;
        this.B = vy3Var;
        this.C = cardView;
        this.D = customWegetLayout;
        this.E = customWegetLayout2;
        this.F = myTextView;
        this.G = textView;
        this.H = textView2;
    }

    public static eg x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static eg y(LayoutInflater layoutInflater, Object obj) {
        return (eg) lq7.o(layoutInflater, R.layout.activity_select_cl_service, null, false, obj);
    }
}
