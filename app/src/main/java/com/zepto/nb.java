package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nb extends lq7 {
    public final vy3 A;
    public final iy3 B;
    public final CustomWegetLayout C;
    public final CardView D;
    public final MyTextView E;
    public final TextView F;
    public final MyTextView G;
    public final MyTextView H;
    public final TextView I;
    public final EditText w;
    public final LinearLayout x;
    public final CustomWegetLayout y;
    public final ImageView z;

    public nb(Object obj, View view, int i, EditText editText, LinearLayout linearLayout, CustomWegetLayout customWegetLayout, ImageView imageView, vy3 vy3Var, iy3 iy3Var, CustomWegetLayout customWegetLayout2, CardView cardView, MyTextView myTextView, TextView textView, MyTextView myTextView2, MyTextView myTextView3, TextView textView2) {
        super(obj, view, i);
        this.w = editText;
        this.x = linearLayout;
        this.y = customWegetLayout;
        this.z = imageView;
        this.A = vy3Var;
        this.B = iy3Var;
        this.C = customWegetLayout2;
        this.D = cardView;
        this.E = myTextView;
        this.F = textView;
        this.G = myTextView2;
        this.H = myTextView3;
        this.I = textView2;
    }

    public static nb x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static nb y(LayoutInflater layoutInflater, Object obj) {
        return (nb) lq7.o(layoutInflater, R.layout.activity_duplicate_ll, null, false, obj);
    }
}
