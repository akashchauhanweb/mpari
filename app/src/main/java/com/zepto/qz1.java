package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qz1 extends lq7 {
    public final TextView A;
    public final RadioButton B;
    public final AppCompatEditText C;
    public final LinearLayout D;
    public final TextView E;
    public final CheckBox F;
    public final TextView G;
    public final RelativeLayout H;
    public final MyTextView I;
    public final TextView J;
    public final RadioGroup K;
    public final RadioButton L;
    public final TextView w;
    public final LinearLayout x;
    public final ImageView y;
    public final ri5 z;

    public qz1(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, ImageView imageView, ri5 ri5Var, TextView textView2, RadioButton radioButton, AppCompatEditText appCompatEditText, LinearLayout linearLayout2, TextView textView3, CheckBox checkBox, TextView textView4, RelativeLayout relativeLayout, MyTextView myTextView, TextView textView5, RadioGroup radioGroup, RadioButton radioButton2) {
        super(obj, view, i);
        this.w = textView;
        this.x = linearLayout;
        this.y = imageView;
        this.z = ri5Var;
        this.A = textView2;
        this.B = radioButton;
        this.C = appCompatEditText;
        this.D = linearLayout2;
        this.E = textView3;
        this.F = checkBox;
        this.G = textView4;
        this.H = relativeLayout;
        this.I = myTextView;
        this.J = textView5;
        this.K = radioGroup;
        this.L = radioButton2;
    }

    public static qz1 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static qz1 y(LayoutInflater layoutInflater, Object obj) {
        return (qz1) lq7.o(layoutInflater, R.layout.edit_appl_selected_cov_details, null, false, obj);
    }
}
