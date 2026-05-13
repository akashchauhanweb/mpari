package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ph extends lq7 {
    public final AppCompatTextView A;
    public final d47 B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView w;
    public final AppCompatTextView x;
    public final MyTextView y;
    public final AppCompatTextView z;

    public ph(Object obj, View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MyTextView myTextView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, d47 d47Var, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        super(obj, view, i);
        this.w = appCompatTextView;
        this.x = appCompatTextView2;
        this.y = myTextView;
        this.z = appCompatTextView3;
        this.A = appCompatTextView4;
        this.B = d47Var;
        this.C = appCompatImageView;
        this.D = appCompatTextView5;
        this.E = appCompatTextView6;
        this.F = appCompatTextView7;
    }

    public static ph x(LayoutInflater layoutInflater) {
        kd1.d();
        return y(layoutInflater, null);
    }

    public static ph y(LayoutInflater layoutInflater, Object obj) {
        return (ph) lq7.o(layoutInflater, R.layout.activity_verify_notice_payment_response, null, false, obj);
    }
}
