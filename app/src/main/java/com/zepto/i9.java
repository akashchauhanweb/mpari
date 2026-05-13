package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i9 extends lq7 {
    public final ImageView A;
    public final ri5 B;
    public final TextView C;
    public final RadioButton D;
    public final EditText E;
    public final TextView F;
    public final LinearLayout G;
    public final LinearLayout H;
    public final TextView I;
    public final CheckBox J;
    public final TextView K;
    public final EditText L;
    public final TextView M;
    public final MyTextView N;
    public final TextView O;
    public final RadioGroup P;
    public final RadioButton Q;
    public final TextView w;
    public final CheckBox x;
    public final RelativeLayout y;
    public final TextView z;

    public i9(Object obj, View view, int i, TextView textView, CheckBox checkBox, RelativeLayout relativeLayout, TextView textView2, ImageView imageView, ri5 ri5Var, TextView textView3, RadioButton radioButton, EditText editText, TextView textView4, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView5, CheckBox checkBox2, TextView textView6, EditText editText2, TextView textView7, MyTextView myTextView, TextView textView8, RadioGroup radioGroup, RadioButton radioButton2) {
        super(obj, view, i);
        this.w = textView;
        this.x = checkBox;
        this.y = relativeLayout;
        this.z = textView2;
        this.A = imageView;
        this.B = ri5Var;
        this.C = textView3;
        this.D = radioButton;
        this.E = editText;
        this.F = textView4;
        this.G = linearLayout;
        this.H = linearLayout2;
        this.I = textView5;
        this.J = checkBox2;
        this.K = textView6;
        this.L = editText2;
        this.M = textView7;
        this.N = myTextView;
        this.O = textView8;
        this.P = radioGroup;
        this.Q = radioButton2;
    }

    public static i9 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static i9 y(LayoutInflater layoutInflater, Object obj) {
        return (i9) lq7.o(layoutInflater, R.layout.activity_dl_cov, null, false, obj);
    }
}
