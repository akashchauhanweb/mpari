package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u8 extends lq7 {
    public final AppCompatEditText A;
    public final AppCompatEditText B;
    public final TextView C;
    public final LinearLayout D;
    public final EditText E;
    public final TextView F;
    public final RelativeLayout G;
    public final Spinner H;
    public final AppCompatEditText I;
    public final LinearLayout J;
    public final AppCompatEditText K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final EditText P;
    public final TextView Q;
    public final TextView R;
    public final vy3 S;
    public final TextView T;
    public final RadioButton U;
    public final AppCompatEditText V;
    public final LinearLayout W;
    public final LinearLayout X;
    public final TextView Y;
    public final LinearLayout Z;
    public final TextView a0;
    public final CheckBox b0;
    public final CheckBox c0;
    public final RelativeLayout d0;
    public final Spinner e0;
    public final TextView f0;
    public final TextView g0;
    public final AppCompatEditText h0;
    public final AppCompatEditText i0;
    public final Spinner j0;
    public final RelativeLayout k0;
    public final MyTextView l0;
    public final TextView m0;
    public final TextView n0;
    public final RadioGroup o0;
    public final RadioButton p0;
    public final TextView w;
    public final RecyclerView x;
    public final LinearLayout y;
    public final TextView z;

    public u8(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView2, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, TextView textView3, LinearLayout linearLayout2, EditText editText, TextView textView4, RelativeLayout relativeLayout, Spinner spinner, AppCompatEditText appCompatEditText3, LinearLayout linearLayout3, AppCompatEditText appCompatEditText4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, EditText editText2, TextView textView9, TextView textView10, vy3 vy3Var, TextView textView11, RadioButton radioButton, AppCompatEditText appCompatEditText5, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView12, LinearLayout linearLayout6, TextView textView13, CheckBox checkBox, CheckBox checkBox2, RelativeLayout relativeLayout2, Spinner spinner2, TextView textView14, TextView textView15, AppCompatEditText appCompatEditText6, AppCompatEditText appCompatEditText7, Spinner spinner3, RelativeLayout relativeLayout3, MyTextView myTextView, TextView textView16, TextView textView17, RadioGroup radioGroup, RadioButton radioButton2) {
        super(obj, view, i);
        this.w = textView;
        this.x = recyclerView;
        this.y = linearLayout;
        this.z = textView2;
        this.A = appCompatEditText;
        this.B = appCompatEditText2;
        this.C = textView3;
        this.D = linearLayout2;
        this.E = editText;
        this.F = textView4;
        this.G = relativeLayout;
        this.H = spinner;
        this.I = appCompatEditText3;
        this.J = linearLayout3;
        this.K = appCompatEditText4;
        this.L = textView5;
        this.M = textView6;
        this.N = textView7;
        this.O = textView8;
        this.P = editText2;
        this.Q = textView9;
        this.R = textView10;
        this.S = vy3Var;
        this.T = textView11;
        this.U = radioButton;
        this.V = appCompatEditText5;
        this.W = linearLayout4;
        this.X = linearLayout5;
        this.Y = textView12;
        this.Z = linearLayout6;
        this.a0 = textView13;
        this.b0 = checkBox;
        this.c0 = checkBox2;
        this.d0 = relativeLayout2;
        this.e0 = spinner2;
        this.f0 = textView14;
        this.g0 = textView15;
        this.h0 = appCompatEditText6;
        this.i0 = appCompatEditText7;
        this.j0 = spinner3;
        this.k0 = relativeLayout3;
        this.l0 = myTextView;
        this.m0 = textView16;
        this.n0 = textView17;
        this.o0 = radioGroup;
        this.p0 = radioButton2;
    }

    public static u8 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static u8 y(LayoutInflater layoutInflater, Object obj) {
        return (u8) lq7.o(layoutInflater, R.layout.activity_cov_list, null, false, obj);
    }
}
