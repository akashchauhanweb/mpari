package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eb3 {
    public final ScrollView a;
    public final d47 b;
    public final AppCompatButton c;
    public final AppCompatButton d;
    public final MyTextView e;
    public final AppCompatEditText f;
    public final MyTextView g;
    public final ImageView h;
    public final MyTextView i;
    public final MyTextView j;
    public final MyTextView k;
    public final MyTextView l;
    public final MyTextView m;

    public eb3(ScrollView scrollView, d47 d47Var, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, MyTextView myTextView, AppCompatEditText appCompatEditText, MyTextView myTextView2, ImageView imageView, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7) {
        this.a = scrollView;
        this.b = d47Var;
        this.c = appCompatButton;
        this.d = appCompatButton2;
        this.e = myTextView;
        this.f = appCompatEditText;
        this.g = myTextView2;
        this.h = imageView;
        this.i = myTextView3;
        this.j = myTextView4;
        this.k = myTextView5;
        this.l = myTextView6;
        this.m = myTextView7;
    }

    public static eb3 a(View view) {
        int i = R.id.applicationStatusHeader;
        View viewA = zp7.a(view, R.id.applicationStatusHeader);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            i = R.id.btnCancel;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnCancel);
            if (appCompatButton != null) {
                i = R.id.btnVerify;
                AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.btnVerify);
                if (appCompatButton2 != null) {
                    i = R.id.defaultOtpTv;
                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.defaultOtpTv);
                    if (myTextView != null) {
                        i = R.id.et_otp;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.et_otp);
                        if (appCompatEditText != null) {
                            i = R.id.idLayoutTitle;
                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.idLayoutTitle);
                            if (myTextView2 != null) {
                                i = R.id.showPassword;
                                ImageView imageView = (ImageView) zp7.a(view, R.id.showPassword);
                                if (imageView != null) {
                                    i = R.id.time_text;
                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.time_text);
                                    if (myTextView3 != null) {
                                        i = R.id.txt_application_no_value;
                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.txt_application_no_value);
                                        if (myTextView4 != null) {
                                            i = R.id.txt_chassis_no_value;
                                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.txt_chassis_no_value);
                                            if (myTextView5 != null) {
                                                i = R.id.txt_engine_no_value;
                                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.txt_engine_no_value);
                                                if (myTextView6 != null) {
                                                    i = R.id.txt_resend_otp;
                                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.txt_resend_otp);
                                                    if (myTextView7 != null) {
                                                        return new eb3((ScrollView) view, d47VarA, appCompatButton, appCompatButton2, myTextView, appCompatEditText, myTextView2, imageView, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7);
                                                    }
                                                }
                                            }
                                        }
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

    public static eb3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static eb3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_application_otp_verify_vahan_services, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
