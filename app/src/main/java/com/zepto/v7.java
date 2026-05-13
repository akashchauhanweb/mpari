package com.zepto;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v7 extends lq7 {
    public final ImageView A;
    public final vy3 B;
    public final AppCompatEditText C;
    public final AppCompatEditText D;
    public final EditText E;
    public final CardView F;
    public final MyTextView G;
    public final CustomWegetLayout H;
    public final MyTextView I;
    public final MyTextView J;
    public final AppCompatTextView K;
    public final CustomWegetLayout w;
    public final TextView x;
    public final LinearLayout y;
    public final CardView z;

    public v7(Object obj, View view, int i, CustomWegetLayout customWegetLayout, TextView textView, LinearLayout linearLayout, CardView cardView, ImageView imageView, vy3 vy3Var, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, EditText editText, CardView cardView2, MyTextView myTextView, CustomWegetLayout customWegetLayout2, MyTextView myTextView2, MyTextView myTextView3, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.w = customWegetLayout;
        this.x = textView;
        this.y = linearLayout;
        this.z = cardView;
        this.A = imageView;
        this.B = vy3Var;
        this.C = appCompatEditText;
        this.D = appCompatEditText2;
        this.E = editText;
        this.F = cardView2;
        this.G = myTextView;
        this.H = customWegetLayout2;
        this.I = myTextView2;
        this.J = myTextView3;
        this.K = appCompatTextView;
    }
}
