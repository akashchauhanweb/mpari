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
public abstract class gc extends lq7 {
    public final AppCompatTextView A;
    public final ri5 B;
    public final LinearLayout C;
    public final MyTextView D;
    public final EditText w;
    public final AppCompatButton x;
    public final AppCompatButton y;
    public final TextView z;

    public gc(Object obj, View view, int i, EditText editText, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView, AppCompatTextView appCompatTextView, ri5 ri5Var, LinearLayout linearLayout, MyTextView myTextView) {
        super(obj, view, i);
        this.w = editText;
        this.x = appCompatButton;
        this.y = appCompatButton2;
        this.z = textView;
        this.A = appCompatTextView;
        this.B = ri5Var;
        this.C = linearLayout;
        this.D = myTextView;
    }

    public static gc x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static gc y(LayoutInflater layoutInflater, Object obj) {
        return (gc) lq7.o(layoutInflater, R.layout.activity_learner_download, null, false, obj);
    }
}
