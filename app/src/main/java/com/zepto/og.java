package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class og {
    public final ScrollView a;
    public final TextView b;
    public final LinearLayout c;
    public final RadioButton d;
    public final d47 e;
    public final TextView f;
    public final AppCompatButton g;
    public final TextView h;
    public final AppCompatButton i;
    public final TextView j;
    public final TextView k;
    public final AppCompatEditText l;
    public final AppCompatEditText m;
    public final AppCompatEditText n;
    public final LinearLayout o;
    public final RadioButton p;

    public og(ScrollView scrollView, TextView textView, LinearLayout linearLayout, RadioButton radioButton, d47 d47Var, TextView textView2, AppCompatButton appCompatButton, TextView textView3, AppCompatButton appCompatButton2, TextView textView4, TextView textView5, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, LinearLayout linearLayout2, RadioButton radioButton2) {
        this.a = scrollView;
        this.b = textView;
        this.c = linearLayout;
        this.d = radioButton;
        this.e = d47Var;
        this.f = textView2;
        this.g = appCompatButton;
        this.h = textView3;
        this.i = appCompatButton2;
        this.j = textView4;
        this.k = textView5;
        this.l = appCompatEditText;
        this.m = appCompatEditText2;
        this.n = appCompatEditText3;
        this.o = linearLayout2;
        this.p = radioButton2;
    }

    public static og a(View view) {
        int i = R.id.applNoTv;
        TextView textView = (TextView) zp7.a(view, R.id.applNoTv);
        if (textView != null) {
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
                        TextView textView2 = (TextView) zp7.a(view, R.id.chassisTv);
                        if (textView2 != null) {
                            i = R.id.idCancel;
                            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.idCancel);
                            if (appCompatButton != null) {
                                i = R.id.idLayoutTitle;
                                TextView textView3 = (TextView) zp7.a(view, R.id.idLayoutTitle);
                                if (textView3 != null) {
                                    i = R.id.idSubmit;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.idSubmit);
                                    if (appCompatButton2 != null) {
                                        i = R.id.rcNoTv;
                                        TextView textView4 = (TextView) zp7.a(view, R.id.rcNoTv);
                                        if (textView4 != null) {
                                            i = R.id.time_text;
                                            TextView textView5 = (TextView) zp7.a(view, R.id.time_text);
                                            if (textView5 != null) {
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
                                                                    return new og((ScrollView) view, textView, linearLayout, radioButton, d47VarA, textView2, appCompatButton, textView3, appCompatButton2, textView4, textView5, appCompatEditText, appCompatEditText2, appCompatEditText3, linearLayout2, radioButton2);
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

    public static og c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static og d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tobuyer_application, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
