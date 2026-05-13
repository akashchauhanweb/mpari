package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class de extends lq7 {
    public final RelativeLayout A;
    public final TextView B;
    public final LinearLayout C;
    public final CheckBox D;
    public final EditText E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final ImageView J;
    public final TextView K;
    public final EditText L;
    public final TextView M;
    public final TextView N;
    public final ri5 O;
    public final TextView P;
    public final RadioButton Q;
    public final AppCompatEditText R;
    public final LinearLayout S;
    public final LinearLayout T;
    public final TextView U;
    public final CheckBox V;
    public final TextView W;
    public final Spinner X;
    public final Spinner Y;
    public final TextView Z;
    public final TextView a0;
    public final MyTextView b0;
    public final TextView c0;
    public final TextView d0;
    public final RadioGroup e0;
    public final RadioButton f0;
    public final TextView w;
    public final MyTextView x;
    public final FrameLayout y;
    public final CheckBox z;

    public de(Object obj, View view, int i, TextView textView, MyTextView myTextView, FrameLayout frameLayout, CheckBox checkBox, RelativeLayout relativeLayout, TextView textView2, LinearLayout linearLayout, CheckBox checkBox2, EditText editText, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView, TextView textView7, EditText editText2, TextView textView8, TextView textView9, ri5 ri5Var, TextView textView10, RadioButton radioButton, AppCompatEditText appCompatEditText, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView11, CheckBox checkBox3, TextView textView12, Spinner spinner, Spinner spinner2, TextView textView13, TextView textView14, MyTextView myTextView2, TextView textView15, TextView textView16, RadioGroup radioGroup, RadioButton radioButton2) {
        super(obj, view, i);
        this.w = textView;
        this.x = myTextView;
        this.y = frameLayout;
        this.z = checkBox;
        this.A = relativeLayout;
        this.B = textView2;
        this.C = linearLayout;
        this.D = checkBox2;
        this.E = editText;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
        this.I = textView6;
        this.J = imageView;
        this.K = textView7;
        this.L = editText2;
        this.M = textView8;
        this.N = textView9;
        this.O = ri5Var;
        this.P = textView10;
        this.Q = radioButton;
        this.R = appCompatEditText;
        this.S = linearLayout2;
        this.T = linearLayout3;
        this.U = textView11;
        this.V = checkBox3;
        this.W = textView12;
        this.X = spinner;
        this.Y = spinner2;
        this.Z = textView13;
        this.a0 = textView14;
        this.b0 = myTextView2;
        this.c0 = textView15;
        this.d0 = textView16;
        this.e0 = radioGroup;
        this.f0 = radioButton2;
    }

    public static de x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static de y(LayoutInflater layoutInflater, Object obj) {
        return (de) lq7.o(layoutInflater, R.layout.activity_new_learner_training, null, false, obj);
    }
}
