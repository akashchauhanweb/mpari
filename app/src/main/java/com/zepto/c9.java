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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c9 extends lq7 {
    public final EditText A;
    public final EditText B;
    public final EditText C;
    public final EditText D;
    public final EditText E;
    public final EditText F;
    public final EditText G;
    public final EditText H;
    public final RadioButton I;
    public final RadioButton J;
    public final RadioGroup K;
    public final EditText L;
    public final EditText M;
    public final EditText N;
    public final EditText O;
    public final EditText P;
    public final AppCompatTextView Q;
    public final LinearLayout R;
    public final ImageView S;
    public final LinearLayout T;
    public final ri5 U;
    public final AppCompatEditText V;
    public final ProgressBar W;
    public final CheckBox X;
    public final TextView Y;
    public final RelativeLayout Z;
    public final RadioButton a0;
    public final TextView b0;
    public final TextView c0;
    public final TextView d0;
    public final TextView e0;
    public final TextView f0;
    public final TextView g0;
    public final TextView h0;
    public final TextView i0;
    public final TextView j0;
    public final TextView k0;
    public final TextView l0;
    public final TextView m0;
    public final TextView n0;
    public final TextView o0;
    public final TextView p0;
    public final TextView q0;
    public final RadioButton r0;
    public final RadioGroup s0;
    public final AppCompatEditText t0;
    public final TextView w;
    public final EditText x;
    public final EditText y;
    public final EditText z;

    public c9(Object obj, View view, int i, TextView textView, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, EditText editText10, EditText editText11, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, EditText editText12, EditText editText13, EditText editText14, EditText editText15, EditText editText16, AppCompatTextView appCompatTextView, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, ri5 ri5Var, AppCompatEditText appCompatEditText, ProgressBar progressBar, CheckBox checkBox, TextView textView2, RelativeLayout relativeLayout, RadioButton radioButton3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, RadioButton radioButton4, RadioGroup radioGroup2, AppCompatEditText appCompatEditText2) {
        super(obj, view, i);
        this.w = textView;
        this.x = editText;
        this.y = editText2;
        this.z = editText3;
        this.A = editText4;
        this.B = editText5;
        this.C = editText6;
        this.D = editText7;
        this.E = editText8;
        this.F = editText9;
        this.G = editText10;
        this.H = editText11;
        this.I = radioButton;
        this.J = radioButton2;
        this.K = radioGroup;
        this.L = editText12;
        this.M = editText13;
        this.N = editText14;
        this.O = editText15;
        this.P = editText16;
        this.Q = appCompatTextView;
        this.R = linearLayout;
        this.S = imageView;
        this.T = linearLayout2;
        this.U = ri5Var;
        this.V = appCompatEditText;
        this.W = progressBar;
        this.X = checkBox;
        this.Y = textView2;
        this.Z = relativeLayout;
        this.a0 = radioButton3;
        this.b0 = textView3;
        this.c0 = textView4;
        this.d0 = textView5;
        this.e0 = textView6;
        this.f0 = textView7;
        this.g0 = textView8;
        this.h0 = textView9;
        this.i0 = textView10;
        this.j0 = textView11;
        this.k0 = textView12;
        this.l0 = textView13;
        this.m0 = textView14;
        this.n0 = textView15;
        this.o0 = textView16;
        this.p0 = textView17;
        this.q0 = textView18;
        this.r0 = radioButton4;
        this.s0 = radioGroup2;
        this.t0 = appCompatEditText2;
    }

    public static c9 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static c9 y(LayoutInflater layoutInflater, Object obj) {
        return (c9) lq7.o(layoutInflater, R.layout.activity_dl_address_details, null, false, obj);
    }
}
