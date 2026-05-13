package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e9 extends lq7 {
    public final EditText A;
    public final TextView B;
    public final ri5 C;
    public final LinearLayout D;
    public final MyTextView E;
    public final MyTextView F;
    public final TextView w;
    public final AppCompatButton x;
    public final AppCompatButton y;
    public final AppCompatTextView z;

    public e9(Object obj, View view, int i, TextView textView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView, EditText editText, TextView textView2, ri5 ri5Var, LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2) {
        super(obj, view, i);
        this.w = textView;
        this.x = appCompatButton;
        this.y = appCompatButton2;
        this.z = appCompatTextView;
        this.A = editText;
        this.B = textView2;
        this.C = ri5Var;
        this.D = linearLayout;
        this.E = myTextView;
        this.F = myTextView2;
    }

    public static e9 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static e9 y(LayoutInflater layoutInflater, Object obj) {
        return (e9) lq7.o(layoutInflater, R.layout.activity_dl_app, null, false, obj);
    }
}
