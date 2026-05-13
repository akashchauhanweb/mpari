package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b56 extends lq7 {
    public final View A;
    public final View B;
    public final CustomWegetLayout C;
    public final ImageView D;
    public final CheckedTextView E;
    public final AppCompatTextView F;
    public final AppCompatEditText G;
    public final Spinner H;
    public final AppCompatTextView I;
    public final CheckedTextView J;
    public final d47 K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final CheckedTextView w;
    public final LinearLayout x;
    public final CustomWegetLayout y;
    public final RelativeLayout z;

    public b56(Object obj, View view, int i, CheckedTextView checkedTextView, LinearLayout linearLayout, CustomWegetLayout customWegetLayout, RelativeLayout relativeLayout, View view2, View view3, CustomWegetLayout customWegetLayout2, ImageView imageView, CheckedTextView checkedTextView2, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, Spinner spinner, AppCompatTextView appCompatTextView2, CheckedTextView checkedTextView3, d47 d47Var, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i);
        this.w = checkedTextView;
        this.x = linearLayout;
        this.y = customWegetLayout;
        this.z = relativeLayout;
        this.A = view2;
        this.B = view3;
        this.C = customWegetLayout2;
        this.D = imageView;
        this.E = checkedTextView2;
        this.F = appCompatTextView;
        this.G = appCompatEditText;
        this.H = spinner;
        this.I = appCompatTextView2;
        this.J = checkedTextView3;
        this.K = d47Var;
        this.L = appCompatTextView3;
        this.M = appCompatTextView4;
    }

    public static b56 x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static b56 y(LayoutInflater layoutInflater, Object obj) {
        return (b56) lq7.o(layoutInflater, R.layout.sp_permit_details, null, false, obj);
    }
}
