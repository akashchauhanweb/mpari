package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yd extends lq7 {
    public final EditText A;
    public final RadioButton A0;
    public final EditText B;
    public final RadioGroup B0;
    public final EditText C;
    public DlAddress C0;
    public final EditText D;
    public final EditText E;
    public final EditText F;
    public final EditText G;
    public final RadioButton H;
    public final RadioButton I;
    public final RadioGroup J;
    public final EditText K;
    public final EditText L;
    public final EditText M;
    public final EditText N;
    public final EditText O;
    public final ImageView P;
    public final LinearLayout Q;
    public final LinearLayout R;
    public final TextView S;
    public final ImageView T;
    public final LinearLayout U;
    public final LinearLayout V;
    public final vy3 W;
    public final ImageView X;
    public final ImageView Y;
    public final ImageView Z;
    public final ImageView a0;
    public final ProgressBar b0;
    public final MyTextView c0;
    public final MyTextView d0;
    public final CardView e0;
    public final CheckBox f0;
    public final CustomWegetLayout g0;
    public final RadioButton h0;
    public final TextView i0;
    public final TextView j0;
    public final MyTextView k0;
    public final MyTextView l0;
    public final TextView m0;
    public final TextView n0;
    public final TextView o0;
    public final TextView p0;
    public final TextView q0;
    public final TextView r0;
    public final TextView s0;
    public final TextView t0;
    public final TextView u0;
    public final TextView v0;
    public final EditText w;
    public final TextView w0;
    public final EditText x;
    public final TextView x0;
    public final EditText y;
    public final TextView y0;
    public final EditText z;
    public final TextView z0;

    public yd(Object obj, View view, int i, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, EditText editText10, EditText editText11, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, EditText editText12, EditText editText13, EditText editText14, EditText editText15, EditText editText16, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ImageView imageView2, LinearLayout linearLayout3, LinearLayout linearLayout4, vy3 vy3Var, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ProgressBar progressBar, MyTextView myTextView, MyTextView myTextView2, CardView cardView, CheckBox checkBox, CustomWegetLayout customWegetLayout, RadioButton radioButton3, TextView textView2, TextView textView3, MyTextView myTextView3, MyTextView myTextView4, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, RadioButton radioButton4, RadioGroup radioGroup2) {
        super(obj, view, i);
        this.w = editText;
        this.x = editText2;
        this.y = editText3;
        this.z = editText4;
        this.A = editText5;
        this.B = editText6;
        this.C = editText7;
        this.D = editText8;
        this.E = editText9;
        this.F = editText10;
        this.G = editText11;
        this.H = radioButton;
        this.I = radioButton2;
        this.J = radioGroup;
        this.K = editText12;
        this.L = editText13;
        this.M = editText14;
        this.N = editText15;
        this.O = editText16;
        this.P = imageView;
        this.Q = linearLayout;
        this.R = linearLayout2;
        this.S = textView;
        this.T = imageView2;
        this.U = linearLayout3;
        this.V = linearLayout4;
        this.W = vy3Var;
        this.X = imageView3;
        this.Y = imageView4;
        this.Z = imageView5;
        this.a0 = imageView6;
        this.b0 = progressBar;
        this.c0 = myTextView;
        this.d0 = myTextView2;
        this.e0 = cardView;
        this.f0 = checkBox;
        this.g0 = customWegetLayout;
        this.h0 = radioButton3;
        this.i0 = textView2;
        this.j0 = textView3;
        this.k0 = myTextView3;
        this.l0 = myTextView4;
        this.m0 = textView4;
        this.n0 = textView5;
        this.o0 = textView6;
        this.p0 = textView7;
        this.q0 = textView8;
        this.r0 = textView9;
        this.s0 = textView10;
        this.t0 = textView11;
        this.u0 = textView12;
        this.v0 = textView13;
        this.w0 = textView14;
        this.x0 = textView15;
        this.y0 = textView16;
        this.z0 = textView17;
        this.A0 = radioButton4;
        this.B0 = radioGroup2;
    }

    public static yd x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static yd y(LayoutInflater layoutInflater, Object obj) {
        return (yd) lq7.o(layoutInflater, R.layout.activity_new_cl_two, null, false, obj);
    }

    public abstract void z(DlAddress dlAddress);
}
