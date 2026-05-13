package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o8 extends lq7 {
    public final TextView A;
    public final TextView B;
    public final LinearLayout C;
    public final EditText D;
    public final TextView E;
    public final LinearLayout F;
    public final AppCompatTextView G;
    public final EditText H;
    public final CustomWegetLayout I;
    public final TextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final AppCompatTextView N;
    public final AppCompatTextView O;
    public final AppCompatTextView P;
    public final AppCompatTextView Q;
    public final AppCompatTextView R;
    public final vy3 S;
    public final TextView w;
    public final CustomWegetLayout x;
    public final EditText y;
    public final AppCompatTextView z;

    public o8(Object obj, View view, int i, TextView textView, CustomWegetLayout customWegetLayout, EditText editText, AppCompatTextView appCompatTextView, TextView textView2, TextView textView3, LinearLayout linearLayout, EditText editText2, TextView textView4, LinearLayout linearLayout2, AppCompatTextView appCompatTextView2, EditText editText3, CustomWegetLayout customWegetLayout2, TextView textView5, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, vy3 vy3Var) {
        super(obj, view, i);
        this.w = textView;
        this.x = customWegetLayout;
        this.y = editText;
        this.z = appCompatTextView;
        this.A = textView2;
        this.B = textView3;
        this.C = linearLayout;
        this.D = editText2;
        this.E = textView4;
        this.F = linearLayout2;
        this.G = appCompatTextView2;
        this.H = editText3;
        this.I = customWegetLayout2;
        this.J = textView5;
        this.K = appCompatTextView3;
        this.L = appCompatTextView4;
        this.M = appCompatTextView5;
        this.N = appCompatTextView6;
        this.O = appCompatTextView7;
        this.P = appCompatTextView8;
        this.Q = appCompatTextView9;
        this.R = appCompatTextView10;
        this.S = vy3Var;
    }

    public static o8 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static o8 y(LayoutInflater layoutInflater, Object obj) {
        return (o8) lq7.o(layoutInflater, R.layout.activity_confirm_mob_no, null, false, obj);
    }
}
