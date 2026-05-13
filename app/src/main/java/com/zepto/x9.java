package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x9 extends lq7 {
    public final EditText A;
    public final EditText B;
    public final EditText C;
    public final EditText D;
    public final EditText E;
    public final EditText F;
    public final EditText G;
    public final EditText H;
    public final EditText I;
    public final EditText J;
    public final EditText K;
    public final RadioButton L;
    public final RadioGroup M;
    public final ri5 N;
    public final RadioButton O;
    public final TextView P;
    public final Spinner Q;
    public final RadioButton R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;
    public final EditText a0;
    public final TextView b0;
    public final TextView c0;
    public final TextView d0;
    public final TextView e0;
    public final TextView f0;
    public final TextView g0;
    public final TextView h0;
    public final TextView i0;
    public final EditText j0;
    public final EditText k0;
    public final EditText l0;
    public final AppCompatButton w;
    public final TextView x;
    public final EditText y;
    public final EditText z;

    public x9(Object obj, View view, int i, AppCompatButton appCompatButton, TextView textView, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, EditText editText10, EditText editText11, EditText editText12, EditText editText13, RadioButton radioButton, RadioGroup radioGroup, ri5 ri5Var, RadioButton radioButton2, TextView textView2, Spinner spinner, RadioButton radioButton3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, EditText editText14, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, EditText editText15, EditText editText16, EditText editText17) {
        super(obj, view, i);
        this.w = appCompatButton;
        this.x = textView;
        this.y = editText;
        this.z = editText2;
        this.A = editText3;
        this.B = editText4;
        this.C = editText5;
        this.D = editText6;
        this.E = editText7;
        this.F = editText8;
        this.G = editText9;
        this.H = editText10;
        this.I = editText11;
        this.J = editText12;
        this.K = editText13;
        this.L = radioButton;
        this.M = radioGroup;
        this.N = ri5Var;
        this.O = radioButton2;
        this.P = textView2;
        this.Q = spinner;
        this.R = radioButton3;
        this.S = textView3;
        this.T = textView4;
        this.U = textView5;
        this.V = textView6;
        this.W = textView7;
        this.X = textView8;
        this.Y = textView9;
        this.Z = textView10;
        this.a0 = editText14;
        this.b0 = textView11;
        this.c0 = textView12;
        this.d0 = textView13;
        this.e0 = textView14;
        this.f0 = textView15;
        this.g0 = textView16;
        this.h0 = textView17;
        this.i0 = textView18;
        this.j0 = editText15;
        this.k0 = editText16;
        this.l0 = editText17;
    }

    public static x9 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static x9 y(LayoutInflater layoutInflater, Object obj) {
        return (x9) lq7.o(layoutInflater, R.layout.activity_dl_personal_details, null, false, obj);
    }
}
