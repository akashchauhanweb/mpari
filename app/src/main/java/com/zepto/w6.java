package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w6 extends lq7 {
    public final CustomWegetLayout A;
    public final ImageView B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final vy3 E;
    public final iy3 F;
    public final CustomWegetLayout G;
    public final CardView H;
    public final MyTextView I;
    public final Spinner J;
    public final TextView K;
    public final MyTextView L;
    public final TextView M;
    public final MyTextView N;
    public final AppCompatTextView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final EditText S;
    public final TextView T;
    public final EditText U;
    public final TextView V;
    public final EditText W;
    public final TextView X;
    public final EditText Y;
    public final TextView Z;
    public final EditText a0;
    public final TextView b0;
    public final EditText c0;
    public final EditText d0;
    public final TextView e0;
    public final EditText w;
    public final LinearLayout x;
    public final EditText y;
    public final LinearLayout z;

    public w6(Object obj, View view, int i, EditText editText, LinearLayout linearLayout, EditText editText2, LinearLayout linearLayout2, CustomWegetLayout customWegetLayout, ImageView imageView, LinearLayout linearLayout3, LinearLayout linearLayout4, vy3 vy3Var, iy3 iy3Var, CustomWegetLayout customWegetLayout2, CardView cardView, MyTextView myTextView, Spinner spinner, TextView textView, MyTextView myTextView2, TextView textView2, MyTextView myTextView3, AppCompatTextView appCompatTextView, TextView textView3, TextView textView4, TextView textView5, EditText editText3, TextView textView6, EditText editText4, TextView textView7, EditText editText5, TextView textView8, EditText editText6, TextView textView9, EditText editText7, TextView textView10, EditText editText8, EditText editText9, TextView textView11) {
        super(obj, view, i);
        this.w = editText;
        this.x = linearLayout;
        this.y = editText2;
        this.z = linearLayout2;
        this.A = customWegetLayout;
        this.B = imageView;
        this.C = linearLayout3;
        this.D = linearLayout4;
        this.E = vy3Var;
        this.F = iy3Var;
        this.G = customWegetLayout2;
        this.H = cardView;
        this.I = myTextView;
        this.J = spinner;
        this.K = textView;
        this.L = myTextView2;
        this.M = textView2;
        this.N = myTextView3;
        this.O = appCompatTextView;
        this.P = textView3;
        this.Q = textView4;
        this.R = textView5;
        this.S = editText3;
        this.T = textView6;
        this.U = editText4;
        this.V = textView7;
        this.W = editText5;
        this.X = textView8;
        this.Y = editText6;
        this.Z = textView9;
        this.a0 = editText7;
        this.b0 = textView10;
        this.c0 = editText8;
        this.d0 = editText9;
        this.e0 = textView11;
    }

    public static w6 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static w6 y(LayoutInflater layoutInflater, Object obj) {
        return (w6) lq7.o(layoutInflater, R.layout.activity_change_name_cl, null, false, obj);
    }
}
