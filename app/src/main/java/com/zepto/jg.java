package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jg extends lq7 {
    public final RelativeLayout A;
    public final View B;
    public final Spinner C;
    public final Spinner D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final ImageView G;
    public final View H;
    public final ImageView I;
    public final CheckedTextView J;
    public final CheckedTextView K;
    public final d47 L;
    public final AppCompatTextView M;
    public final AppCompatTextView N;
    public final AppCompatTextView O;
    public final AppCompatTextView w;
    public final AppCompatTextView x;
    public final CheckedTextView y;
    public final CustomWegetLayout z;

    public jg(Object obj, View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, CheckedTextView checkedTextView, CustomWegetLayout customWegetLayout, RelativeLayout relativeLayout, View view2, Spinner spinner, Spinner spinner2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ImageView imageView, View view3, ImageView imageView2, CheckedTextView checkedTextView2, CheckedTextView checkedTextView3, d47 d47Var, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        super(obj, view, i);
        this.w = appCompatTextView;
        this.x = appCompatTextView2;
        this.y = checkedTextView;
        this.z = customWegetLayout;
        this.A = relativeLayout;
        this.B = view2;
        this.C = spinner;
        this.D = spinner2;
        this.E = appCompatTextView3;
        this.F = appCompatTextView4;
        this.G = imageView;
        this.H = view3;
        this.I = imageView2;
        this.J = checkedTextView2;
        this.K = checkedTextView3;
        this.L = d47Var;
        this.M = appCompatTextView5;
        this.N = appCompatTextView6;
        this.O = appCompatTextView7;
    }

    public static jg x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static jg y(LayoutInflater layoutInflater, Object obj) {
        return (jg) lq7.o(layoutInflater, R.layout.activity_sp_basic_details, null, false, obj);
    }
}
