package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vb extends lq7 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final EditText w;
    public final TextView x;
    public final ri5 y;
    public final TextView z;

    public vb(Object obj, View view, int i, EditText editText, TextView textView, ri5 ri5Var, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.w = editText;
        this.x = textView;
        this.y = ri5Var;
        this.z = textView2;
        this.A = textView3;
        this.B = textView4;
        this.C = textView5;
    }

    public static vb x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static vb y(LayoutInflater layoutInflater, Object obj) {
        return (vb) lq7.o(layoutInflater, R.layout.activity_edit_learner_appl, null, false, obj);
    }
}
