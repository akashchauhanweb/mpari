package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ug extends lq7 {
    public final d47 A;
    public final MyTextView B;
    public final TextView C;
    public final MyTextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final AppCompatButton w;
    public final MyTextView x;
    public final EditText y;
    public final MyTextView z;

    public ug(Object obj, View view, int i, AppCompatButton appCompatButton, MyTextView myTextView, EditText editText, MyTextView myTextView2, d47 d47Var, MyTextView myTextView3, TextView textView, MyTextView myTextView4, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.w = appCompatButton;
        this.x = myTextView;
        this.y = editText;
        this.z = myTextView2;
        this.A = d47Var;
        this.B = myTextView3;
        this.C = textView;
        this.D = myTextView4;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
    }

    public static ug x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static ug y(LayoutInflater layoutInflater, Object obj) {
        return (ug) lq7.o(layoutInflater, R.layout.activity_transfer_permit, null, false, obj);
    }
}
