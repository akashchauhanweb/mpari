package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ra extends lq7 {
    public final TextView A;
    public final vy3 B;
    public final MyTextView C;
    public final CustomWegetLayout D;
    public final LinearLayout E;
    public final MyTextView F;
    public final MyTextView G;
    public final MyTextView H;
    public final MyTextView I;
    public final MyTextView w;
    public final MyTextView x;
    public final NestedScrollView y;
    public final MyTextView z;

    public ra(Object obj, View view, int i, MyTextView myTextView, MyTextView myTextView2, NestedScrollView nestedScrollView, MyTextView myTextView3, TextView textView, vy3 vy3Var, MyTextView myTextView4, CustomWegetLayout customWegetLayout, LinearLayout linearLayout, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8) {
        super(obj, view, i);
        this.w = myTextView;
        this.x = myTextView2;
        this.y = nestedScrollView;
        this.z = myTextView3;
        this.A = textView;
        this.B = vy3Var;
        this.C = myTextView4;
        this.D = customWegetLayout;
        this.E = linearLayout;
        this.F = myTextView5;
        this.G = myTextView6;
        this.H = myTextView7;
        this.I = myTextView8;
    }

    public static ra x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static ra y(LayoutInflater layoutInflater, Object obj) {
        return (ra) lq7.o(layoutInflater, R.layout.activity_dl_slots_next, null, false, obj);
    }
}
