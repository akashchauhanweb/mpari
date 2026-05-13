package com.zepto;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rc extends lq7 {
    public final EditText A;
    public final TextView B;
    public final ImageView C;
    public final ImageView D;
    public final LinearLayout E;
    public final TextView F;
    public final MyTextView G;
    public final MyTextView H;
    public final TextView w;
    public final AppCompatButton x;
    public final AppCompatButton y;
    public final AppCompatTextView z;

    public rc(Object obj, View view, int i, TextView textView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView, EditText editText, TextView textView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView3, MyTextView myTextView, MyTextView myTextView2) {
        super(obj, view, i);
        this.w = textView;
        this.x = appCompatButton;
        this.y = appCompatButton2;
        this.z = appCompatTextView;
        this.A = editText;
        this.B = textView2;
        this.C = imageView;
        this.D = imageView2;
        this.E = linearLayout;
        this.F = textView3;
        this.G = myTextView;
        this.H = myTextView2;
    }
}
