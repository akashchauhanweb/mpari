package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lg extends lq7 {
    public final AppCompatTextView A;
    public final CustomWegetLayout B;
    public final Spinner C;
    public final Spinner D;
    public final AppCompatTextView E;
    public final AppCompatEditText F;
    public final AppCompatTextView G;
    public final RelativeLayout H;
    public final View I;
    public final AppCompatEditText J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final View M;
    public final CustomWegetLayout N;
    public final ImageView O;
    public final AppCompatEditText P;
    public final AppCompatTextView Q;
    public final CheckedTextView R;
    public final CheckedTextView S;
    public final d47 T;
    public final AppCompatTextView U;
    public final AppCompatEditText V;
    public final AppCompatTextView W;
    public final AppCompatEditText X;
    public final AppCompatTextView Y;
    public final AppCompatTextView Z;
    public final AppCompatTextView a0;
    public final TextView w;
    public final CheckedTextView x;
    public final LinearLayout y;
    public final Spinner z;

    public lg(Object obj, View view, int i, TextView textView, CheckedTextView checkedTextView, LinearLayout linearLayout, Spinner spinner, AppCompatTextView appCompatTextView, CustomWegetLayout customWegetLayout, Spinner spinner2, Spinner spinner3, AppCompatTextView appCompatTextView2, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView3, RelativeLayout relativeLayout, View view2, AppCompatEditText appCompatEditText2, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, View view3, CustomWegetLayout customWegetLayout2, ImageView imageView, AppCompatEditText appCompatEditText3, AppCompatTextView appCompatTextView6, CheckedTextView checkedTextView2, CheckedTextView checkedTextView3, d47 d47Var, AppCompatTextView appCompatTextView7, AppCompatEditText appCompatEditText4, AppCompatTextView appCompatTextView8, AppCompatEditText appCompatEditText5, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11) {
        super(obj, view, i);
        this.w = textView;
        this.x = checkedTextView;
        this.y = linearLayout;
        this.z = spinner;
        this.A = appCompatTextView;
        this.B = customWegetLayout;
        this.C = spinner2;
        this.D = spinner3;
        this.E = appCompatTextView2;
        this.F = appCompatEditText;
        this.G = appCompatTextView3;
        this.H = relativeLayout;
        this.I = view2;
        this.J = appCompatEditText2;
        this.K = appCompatTextView4;
        this.L = appCompatTextView5;
        this.M = view3;
        this.N = customWegetLayout2;
        this.O = imageView;
        this.P = appCompatEditText3;
        this.Q = appCompatTextView6;
        this.R = checkedTextView2;
        this.S = checkedTextView3;
        this.T = d47Var;
        this.U = appCompatTextView7;
        this.V = appCompatEditText4;
        this.W = appCompatTextView8;
        this.X = appCompatEditText5;
        this.Y = appCompatTextView9;
        this.Z = appCompatTextView10;
        this.a0 = appCompatTextView11;
    }

    public static lg x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static lg y(LayoutInflater layoutInflater, Object obj) {
        return (lg) lq7.o(layoutInflater, R.layout.activity_sp_details, null, false, obj);
    }
}
