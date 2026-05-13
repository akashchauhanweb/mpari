package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wd extends lq7 {
    public final EditText A;
    public final EditText B;
    public final EditText C;
    public final EditText D;
    public final EditText E;
    public final RadioButton F;
    public final TextView G;
    public final vy3 H;
    public final ImageView I;
    public final ImageView J;
    public final RadioButton K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public final RadioGroup O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;
    public final TextView a0;
    public final TextView b0;
    public final CheckBox c0;
    public final AppCompatButton w;
    public final CheckBox x;
    public final EditText y;
    public final EditText z;

    public wd(Object obj, View view, int i, AppCompatButton appCompatButton, CheckBox checkBox, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, TextView textView, vy3 vy3Var, ImageView imageView, ImageView imageView2, RadioButton radioButton2, TextView textView2, ImageView imageView3, ImageView imageView4, RadioGroup radioGroup, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, CheckBox checkBox2) {
        super(obj, view, i);
        this.w = appCompatButton;
        this.x = checkBox;
        this.y = editText;
        this.z = editText2;
        this.A = editText3;
        this.B = editText4;
        this.C = editText5;
        this.D = editText6;
        this.E = editText7;
        this.F = radioButton;
        this.G = textView;
        this.H = vy3Var;
        this.I = imageView;
        this.J = imageView2;
        this.K = radioButton2;
        this.L = textView2;
        this.M = imageView3;
        this.N = imageView4;
        this.O = radioGroup;
        this.P = textView3;
        this.Q = textView4;
        this.R = textView5;
        this.S = textView6;
        this.T = textView7;
        this.U = textView8;
        this.V = textView9;
        this.W = textView10;
        this.X = textView11;
        this.Y = textView12;
        this.Z = textView13;
        this.a0 = textView14;
        this.b0 = textView15;
        this.c0 = checkBox2;
    }

    public static wd x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static wd y(LayoutInflater layoutInflater, Object obj) {
        return (wd) lq7.o(layoutInflater, R.layout.activity_new_cl_three, null, false, obj);
    }
}
