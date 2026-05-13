package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bx {
    public final ScrollView a;
    public final MyTextView b;
    public final LinearLayout c;
    public final RadioButton d;
    public final d47 e;
    public final MyTextView f;
    public final AppCompatButton g;
    public final MyTextView h;
    public final AppCompatButton i;
    public final MyTextView j;
    public final MyTextView k;
    public final AppCompatEditText l;
    public final AppCompatEditText m;
    public final AppCompatEditText n;
    public final LinearLayout o;
    public final RadioButton p;

    public bx(ScrollView scrollView, MyTextView myTextView, LinearLayout linearLayout, RadioButton radioButton, d47 d47Var, MyTextView myTextView2, AppCompatButton appCompatButton, MyTextView myTextView3, AppCompatButton appCompatButton2, MyTextView myTextView4, MyTextView myTextView5, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, LinearLayout linearLayout2, RadioButton radioButton2) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = linearLayout;
        this.d = radioButton;
        this.e = d47Var;
        this.f = myTextView2;
        this.g = appCompatButton;
        this.h = myTextView3;
        this.i = appCompatButton2;
        this.j = myTextView4;
        this.k = myTextView5;
        this.l = appCompatEditText;
        this.m = appCompatEditText2;
        this.n = appCompatEditText3;
        this.o = linearLayout2;
        this.p = radioButton2;
    }

    public static bx a(View view) {
        int i = R.id.applNoTv;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.applNoTv);
        if (myTextView != null) {
            i = R.id.applicationNoLl;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.applicationNoLl);
            if (linearLayout != null) {
                i = R.id.applicationNoRb;
                RadioButton radioButton = (RadioButton) zp7.a(view, R.id.applicationNoRb);
                if (radioButton != null) {
                    i = R.id.applicationStatusHeader;
                    View viewA = zp7.a(view, R.id.applicationStatusHeader);
                    if (viewA != null) {
                        d47 d47VarA = d47.a(viewA);
                        i = R.id.chassisTv;
                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.chassisTv);
                        if (myTextView2 != null) {
                            i = R.id.idCancel;
                            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.idCancel);
                            if (appCompatButton != null) {
                                i = R.id.idLayoutTitle;
                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.idLayoutTitle);
                                if (myTextView3 != null) {
                                    i = R.id.idSubmit;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.idSubmit);
                                    if (appCompatButton2 != null) {
                                        i = R.id.rcNoTv;
                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.rcNoTv);
                                        if (myTextView4 != null) {
                                            i = R.id.time_text;
                                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.time_text);
                                            if (myTextView5 != null) {
                                                i = R.id.txt_application_no;
                                                AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.txt_application_no);
                                                if (appCompatEditText != null) {
                                                    i = R.id.txt_chassis_no;
                                                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) zp7.a(view, R.id.txt_chassis_no);
                                                    if (appCompatEditText2 != null) {
                                                        i = R.id.txt_reg_no;
                                                        AppCompatEditText appCompatEditText3 = (AppCompatEditText) zp7.a(view, R.id.txt_reg_no);
                                                        if (appCompatEditText3 != null) {
                                                            i = R.id.vehicleNoLl;
                                                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.vehicleNoLl);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.vehicleNoRb;
                                                                RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.vehicleNoRb);
                                                                if (radioButton2 != null) {
                                                                    return new bx((ScrollView) view, myTextView, linearLayout, radioButton, d47VarA, myTextView2, appCompatButton, myTextView3, appCompatButton2, myTextView4, myTextView5, appCompatEditText, appCompatEditText2, appCompatEditText3, linearLayout2, radioButton2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static bx c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static bx d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.application_status_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
