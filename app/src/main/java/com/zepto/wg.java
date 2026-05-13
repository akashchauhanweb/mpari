package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wg extends lq7 {
    public final MyTextView A;
    public final AppCompatTextView B;
    public final MyTextView C;
    public final AppCompatTextView D;
    public final LinearLayout E;
    public final MyTextView F;
    public final CustomWegetLayout G;
    public final RadioGroup H;
    public final AppCompatTextView I;
    public final MyTextView J;
    public final AppCompatTextView K;
    public final MyTextView L;
    public final AppCompatTextView M;
    public final MyTextView N;
    public final AppCompatTextView O;
    public final AppCompatEditText P;
    public final AppCompatTextView Q;
    public final AppCompatEditText R;
    public final AppCompatTextView S;
    public final CustomWegetLayout T;
    public final ImageView U;
    public final LinearLayout V;
    public final MyTextView W;
    public final AppCompatTextView X;
    public final Spinner Y;
    public final AppCompatTextView Z;
    public final d47 a0;
    public final RadioButton b0;
    public final RadioButton c0;
    public final MyTextView w;
    public final AppCompatTextView x;
    public final MyTextView y;
    public final AppCompatTextView z;

    public wg(Object obj, View view, int i, MyTextView myTextView, AppCompatTextView appCompatTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView2, MyTextView myTextView3, AppCompatTextView appCompatTextView3, MyTextView myTextView4, AppCompatTextView appCompatTextView4, LinearLayout linearLayout, MyTextView myTextView5, CustomWegetLayout customWegetLayout, RadioGroup radioGroup, AppCompatTextView appCompatTextView5, MyTextView myTextView6, AppCompatTextView appCompatTextView6, MyTextView myTextView7, AppCompatTextView appCompatTextView7, MyTextView myTextView8, AppCompatTextView appCompatTextView8, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView9, AppCompatEditText appCompatEditText2, AppCompatTextView appCompatTextView10, CustomWegetLayout customWegetLayout2, ImageView imageView, LinearLayout linearLayout2, MyTextView myTextView9, AppCompatTextView appCompatTextView11, Spinner spinner, AppCompatTextView appCompatTextView12, d47 d47Var, RadioButton radioButton, RadioButton radioButton2) {
        super(obj, view, i);
        this.w = myTextView;
        this.x = appCompatTextView;
        this.y = myTextView2;
        this.z = appCompatTextView2;
        this.A = myTextView3;
        this.B = appCompatTextView3;
        this.C = myTextView4;
        this.D = appCompatTextView4;
        this.E = linearLayout;
        this.F = myTextView5;
        this.G = customWegetLayout;
        this.H = radioGroup;
        this.I = appCompatTextView5;
        this.J = myTextView6;
        this.K = appCompatTextView6;
        this.L = myTextView7;
        this.M = appCompatTextView7;
        this.N = myTextView8;
        this.O = appCompatTextView8;
        this.P = appCompatEditText;
        this.Q = appCompatTextView9;
        this.R = appCompatEditText2;
        this.S = appCompatTextView10;
        this.T = customWegetLayout2;
        this.U = imageView;
        this.V = linearLayout2;
        this.W = myTextView9;
        this.X = appCompatTextView11;
        this.Y = spinner;
        this.Z = appCompatTextView12;
        this.a0 = d47Var;
        this.b0 = radioButton;
        this.c0 = radioButton2;
    }

    public static wg x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static wg y(LayoutInflater layoutInflater, Object obj) {
        return (wg) lq7.o(layoutInflater, R.layout.activity_transfer_permit_details, null, false, obj);
    }
}
