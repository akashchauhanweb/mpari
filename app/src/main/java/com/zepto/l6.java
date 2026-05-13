package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class l6 {
    public final RelativeLayout a;
    public final TextView b;
    public final AppCompatButton c;
    public final LinearLayout d;
    public final vy3 e;
    public final AppCompatEditText f;
    public final AppCompatButton g;
    public final MyTextView h;
    public final MyTextView i;

    public l6(RelativeLayout relativeLayout, TextView textView, AppCompatButton appCompatButton, LinearLayout linearLayout, vy3 vy3Var, AppCompatEditText appCompatEditText, AppCompatButton appCompatButton2, MyTextView myTextView, MyTextView myTextView2) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = appCompatButton;
        this.d = linearLayout;
        this.e = vy3Var;
        this.f = appCompatEditText;
        this.g = appCompatButton2;
        this.h = myTextView;
        this.i = myTextView2;
    }

    public static l6 a(View view) {
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
                        vy3 vy3VarA = vy3.a(viewA);
                        i = R.id.mob_number;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.mob_number);
                        if (appCompatEditText != null) {
                            i = R.id.reset_button;
                            AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.reset_button);
                            if (appCompatButton2 != null) {
                                i = R.id.tv_dl_no;
                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.tv_dl_no);
                                if (myTextView != null) {
                                    i = R.id.txt_mob_number;
                                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.txt_mob_number);
                                    if (myTextView2 != null) {
                                        return new l6((RelativeLayout) view, textView, appCompatButton, linearLayout, vy3VarA, appCompatEditText, appCompatButton2, myTextView, myTextView2);
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

    public static l6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static l6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_appl_cancel_verify_mobile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
