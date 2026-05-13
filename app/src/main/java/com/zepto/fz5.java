package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class fz5 {
    public final RelativeLayout a;
    public final TextView b;
    public final AppCompatButton c;
    public final LinearLayout d;
    public final ri5 e;
    public final TextView f;
    public final AppCompatButton g;
    public final MyTextView h;
    public final MyTextView i;

    public fz5(RelativeLayout relativeLayout, TextView textView, AppCompatButton appCompatButton, LinearLayout linearLayout, ri5 ri5Var, TextView textView2, AppCompatButton appCompatButton2, MyTextView myTextView, MyTextView myTextView2) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = appCompatButton;
        this.d = linearLayout;
        this.e = ri5Var;
        this.f = textView2;
        this.g = appCompatButton2;
        this.h = myTextView;
        this.i = myTextView2;
    }

    public static fz5 a(View view) {
        int i = R.id.applNumberTv;
        TextView textView = (TextView) zp7.a(view, R.id.applNumberTv);
        if (textView != null) {
            i = R.id.generate_otp;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.generate_otp);
            if (appCompatButton != null) {
                i = R.id.linear_mob;
                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.linear_mob);
                if (linearLayout != null) {
                    i = R.id.mHeader;
                    View viewA = zp7.a(view, R.id.mHeader);
                    if (viewA != null) {
                        ri5 ri5VarA = ri5.a(viewA);
                        i = R.id.mob_number;
                        TextView textView2 = (TextView) zp7.a(view, R.id.mob_number);
                        if (textView2 != null) {
                            i = R.id.reset_button;
                            AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.reset_button);
                            if (appCompatButton2 != null) {
                                i = R.id.tv_dl_no;
                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.tv_dl_no);
                                if (myTextView != null) {
                                    i = R.id.txt_mob_number;
                                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.txt_mob_number);
                                    if (myTextView2 != null) {
                                        return new fz5((RelativeLayout) view, textView, appCompatButton, linearLayout, ri5VarA, textView2, appCompatButton2, myTextView, myTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static fz5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static fz5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.service_withdrawn_otp_verify, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
