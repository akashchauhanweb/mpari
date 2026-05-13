package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y6 extends lq7 {
    public final LinearLayout A;
    public final LinearLayout B;
    public final vy3 C;
    public final iy3 D;
    public final CustomWegetLayout E;
    public final CardView F;
    public final MyTextView G;
    public final Spinner H;
    public final TextView I;
    public final TextView J;
    public final MyTextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final EditText O;
    public final TextView P;
    public final EditText Q;
    public final TextView R;
    public final EditText S;
    public final TextView T;
    public final EditText U;
    public final TextView V;
    public final EditText W;
    public final TextView X;
    public final EditText Y;
    public final EditText Z;
    public final TextView a0;
    public final LinearLayout w;
    public final EditText x;
    public final CustomWegetLayout y;
    public final ImageView z;

    public y6(Object obj, View view, int i, LinearLayout linearLayout, EditText editText, CustomWegetLayout customWegetLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, vy3 vy3Var, iy3 iy3Var, CustomWegetLayout customWegetLayout2, CardView cardView, MyTextView myTextView, Spinner spinner, TextView textView, TextView textView2, MyTextView myTextView2, TextView textView3, TextView textView4, TextView textView5, EditText editText2, TextView textView6, EditText editText3, TextView textView7, EditText editText4, TextView textView8, EditText editText5, TextView textView9, EditText editText6, TextView textView10, EditText editText7, EditText editText8, TextView textView11) {
        super(obj, view, i);
        this.w = linearLayout;
        this.x = editText;
        this.y = customWegetLayout;
        this.z = imageView;
        this.A = linearLayout2;
        this.B = linearLayout3;
        this.C = vy3Var;
        this.D = iy3Var;
        this.E = customWegetLayout2;
        this.F = cardView;
        this.G = myTextView;
        this.H = spinner;
        this.I = textView;
        this.J = textView2;
        this.K = myTextView2;
        this.L = textView3;
        this.M = textView4;
        this.N = textView5;
        this.O = editText2;
        this.P = textView6;
        this.Q = editText3;
        this.R = textView7;
        this.S = editText4;
        this.T = textView8;
        this.U = editText5;
        this.V = textView9;
        this.W = editText6;
        this.X = textView10;
        this.Y = editText7;
        this.Z = editText8;
        this.a0 = textView11;
    }

    public static y6 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static y6 y(LayoutInflater layoutInflater, Object obj) {
        return (y6) lq7.o(layoutInflater, R.layout.activity_change_name_ll, null, false, obj);
    }
}
