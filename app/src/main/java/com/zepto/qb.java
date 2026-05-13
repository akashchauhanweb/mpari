package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class qb {
    public final RelativeLayout a;
    public final TextView b;
    public final MyTextView c;
    public final AppCompatButton d;
    public final AppCompatButton e;
    public final LinearLayout f;
    public final ri5 g;
    public final EditText h;
    public final MyTextView i;

    public qb(RelativeLayout relativeLayout, TextView textView, MyTextView myTextView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, LinearLayout linearLayout, ri5 ri5Var, EditText editText, MyTextView myTextView2) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = myTextView;
        this.d = appCompatButton;
        this.e = appCompatButton2;
        this.f = linearLayout;
        this.g = ri5Var;
        this.h = editText;
        this.i = myTextView2;
    }

    public static qb a(View view) {
        int i = R.id.applNumberTv;
        TextView textView = (TextView) zp7.a(view, R.id.applNumberTv);
        if (textView != null) {
            i = R.id.applTv;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.applTv);
            if (myTextView != null) {
                i = R.id.cancelBtn;
                AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.cancelBtn);
                if (appCompatButton != null) {
                    i = R.id.generateOtp;
                    AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.generateOtp);
                    if (appCompatButton2 != null) {
                        i = R.id.linear_mob;
                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.linear_mob);
                        if (linearLayout != null) {
                            i = R.id.mHeader;
                            View viewA = zp7.a(view, R.id.mHeader);
                            if (viewA != null) {
                                ri5 ri5VarA = ri5.a(viewA);
                                i = R.id.mob_number;
                                EditText editText = (EditText) zp7.a(view, R.id.mob_number);
                                if (editText != null) {
                                    i = R.id.txt_mob_number;
                                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.txt_mob_number);
                                    if (myTextView2 != null) {
                                        return new qb((RelativeLayout) view, textView, myTextView, appCompatButton, appCompatButton2, linearLayout, ri5VarA, editText, myTextView2);
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

    public static qb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static qb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_edit_app_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
