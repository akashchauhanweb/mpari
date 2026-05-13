package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rb extends lq7 {
    public final TextView A;
    public final ImageView B;
    public final EditText C;
    public final AppCompatEditText D;
    public final ri5 E;
    public final AppCompatEditText F;
    public final AppCompatEditText G;
    public final TextView H;
    public final RadioButton I;
    public final RadioGroup J;
    public final RadioButton K;
    public final RadioButton L;
    public final Spinner M;
    public final TextView N;
    public final Spinner O;
    public final Spinner P;
    public final Spinner Q;
    public final RelativeLayout R;
    public final TextView S;
    public final AppCompatTextView T;
    public final AppCompatEditText U;
    public final TextView V;
    public final AppCompatTextView W;
    public final AppCompatTextView X;
    public final TextView Y;
    public final TextView Z;
    public final AppCompatTextView a0;
    public final AppCompatEditText b0;
    public final AppCompatTextView c0;
    public final AppCompatEditText d0;
    public final TextView e0;
    public final EditText f0;
    public final TextView g0;
    public final AppCompatTextView h0;
    public final AppCompatEditText i0;
    public final AppCompatTextView j0;
    public final AppCompatEditText k0;
    public final AppCompatEditText l0;
    public final AppCompatTextView m0;
    public final AppCompatEditText n0;
    public final AppCompatTextView o0;
    public final TextView p0;
    public final AppCompatEditText w;
    public final LinearLayout x;
    public final EditText y;
    public final AppCompatEditText z;

    public rb(Object obj, View view, int i, AppCompatEditText appCompatEditText, LinearLayout linearLayout, EditText editText, AppCompatEditText appCompatEditText2, TextView textView, ImageView imageView, EditText editText2, AppCompatEditText appCompatEditText3, ri5 ri5Var, AppCompatEditText appCompatEditText4, AppCompatEditText appCompatEditText5, TextView textView2, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, RadioButton radioButton3, Spinner spinner, TextView textView3, Spinner spinner2, Spinner spinner3, Spinner spinner4, RelativeLayout relativeLayout, TextView textView4, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText6, TextView textView5, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, TextView textView6, TextView textView7, AppCompatTextView appCompatTextView4, AppCompatEditText appCompatEditText7, AppCompatTextView appCompatTextView5, AppCompatEditText appCompatEditText8, TextView textView8, EditText editText3, TextView textView9, AppCompatTextView appCompatTextView6, AppCompatEditText appCompatEditText9, AppCompatTextView appCompatTextView7, AppCompatEditText appCompatEditText10, AppCompatEditText appCompatEditText11, AppCompatTextView appCompatTextView8, AppCompatEditText appCompatEditText12, AppCompatTextView appCompatTextView9, TextView textView10) {
        super(obj, view, i);
        this.w = appCompatEditText;
        this.x = linearLayout;
        this.y = editText;
        this.z = appCompatEditText2;
        this.A = textView;
        this.B = imageView;
        this.C = editText2;
        this.D = appCompatEditText3;
        this.E = ri5Var;
        this.F = appCompatEditText4;
        this.G = appCompatEditText5;
        this.H = textView2;
        this.I = radioButton;
        this.J = radioGroup;
        this.K = radioButton2;
        this.L = radioButton3;
        this.M = spinner;
        this.N = textView3;
        this.O = spinner2;
        this.P = spinner3;
        this.Q = spinner4;
        this.R = relativeLayout;
        this.S = textView4;
        this.T = appCompatTextView;
        this.U = appCompatEditText6;
        this.V = textView5;
        this.W = appCompatTextView2;
        this.X = appCompatTextView3;
        this.Y = textView6;
        this.Z = textView7;
        this.a0 = appCompatTextView4;
        this.b0 = appCompatEditText7;
        this.c0 = appCompatTextView5;
        this.d0 = appCompatEditText8;
        this.e0 = textView8;
        this.f0 = editText3;
        this.g0 = textView9;
        this.h0 = appCompatTextView6;
        this.i0 = appCompatEditText9;
        this.j0 = appCompatTextView7;
        this.k0 = appCompatEditText10;
        this.l0 = appCompatEditText11;
        this.m0 = appCompatTextView8;
        this.n0 = appCompatEditText12;
        this.o0 = appCompatTextView9;
        this.p0 = textView10;
    }

    public static rb x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static rb y(LayoutInflater layoutInflater, Object obj) {
        return (rb) lq7.o(layoutInflater, R.layout.activity_edit_app_personal_details, null, false, obj);
    }
}
