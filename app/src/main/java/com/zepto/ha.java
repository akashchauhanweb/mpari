package com.zepto;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ha extends lq7 {
    public final CustomWegetLayout A;
    public final ImageView B;
    public final vy3 C;
    public final LinearLayout D;
    public final iy3 E;
    public final RecyclerView F;
    public final RadioButton G;
    public final AppCompatEditText H;
    public final bs4 I;
    public final CustomWegetLayout J;
    public final CardView K;
    public final MyTextView L;
    public final Spinner M;
    public final MyTextView N;
    public final AppCompatTextView O;
    public final AppCompatTextView P;
    public final MyTextView Q;
    public final TextView R;
    public final RadioButton S;
    public final CheckBox w;
    public final TextView x;
    public final LinearLayout y;
    public final CardView z;

    public ha(Object obj, View view, int i, CheckBox checkBox, TextView textView, LinearLayout linearLayout, CardView cardView, CustomWegetLayout customWegetLayout, ImageView imageView, vy3 vy3Var, LinearLayout linearLayout2, iy3 iy3Var, RecyclerView recyclerView, RadioButton radioButton, AppCompatEditText appCompatEditText, bs4 bs4Var, CustomWegetLayout customWegetLayout2, CardView cardView2, MyTextView myTextView, Spinner spinner, MyTextView myTextView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MyTextView myTextView3, TextView textView2, RadioButton radioButton2) {
        super(obj, view, i);
        this.w = checkBox;
        this.x = textView;
        this.y = linearLayout;
        this.z = cardView;
        this.A = customWegetLayout;
        this.B = imageView;
        this.C = vy3Var;
        this.D = linearLayout2;
        this.E = iy3Var;
        this.F = recyclerView;
        this.G = radioButton;
        this.H = appCompatEditText;
        this.I = bs4Var;
        this.J = customWegetLayout2;
        this.K = cardView2;
        this.L = myTextView;
        this.M = spinner;
        this.N = myTextView2;
        this.O = appCompatTextView;
        this.P = appCompatTextView2;
        this.Q = myTextView3;
        this.R = textView2;
        this.S = radioButton2;
    }
}
