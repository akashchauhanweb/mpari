package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yb4 {
    public final RelativeLayout a;
    public final TextView b;
    public final AppCompatEditText c;
    public final TextView d;
    public final AppCompatEditText e;
    public final AppCompatButton f;
    public final AppCompatButton g;
    public final AppCompatEditText h;
    public final AppCompatTextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final AppCompatTextView m;
    public final d47 n;
    public final TextView o;

    public yb4(RelativeLayout relativeLayout, TextView textView, AppCompatEditText appCompatEditText, TextView textView2, AppCompatEditText appCompatEditText2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatEditText appCompatEditText3, AppCompatTextView appCompatTextView, TextView textView3, TextView textView4, TextView textView5, AppCompatTextView appCompatTextView2, d47 d47Var, TextView textView6) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = appCompatEditText;
        this.d = textView2;
        this.e = appCompatEditText2;
        this.f = appCompatButton;
        this.g = appCompatButton2;
        this.h = appCompatEditText3;
        this.i = appCompatTextView;
        this.j = textView3;
        this.k = textView4;
        this.l = textView5;
        this.m = appCompatTextView2;
        this.n = d47Var;
        this.o = textView6;
    }

    public static yb4 a(View view) {
        int i = R.id.chassis_no;
        TextView textView = (TextView) zp7.a(view, R.id.chassis_no);
        if (textView != null) {
            i = R.id.chassisNoEt;
            AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.chassisNoEt);
            if (appCompatEditText != null) {
                i = R.id.engine_no;
                TextView textView2 = (TextView) zp7.a(view, R.id.engine_no);
                if (textView2 != null) {
                    i = R.id.engineNoEt;
                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) zp7.a(view, R.id.engineNoEt);
                    if (appCompatEditText2 != null) {
                        i = R.id.idCancel;
                        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.idCancel);
                        if (appCompatButton != null) {
                            i = R.id.idSubmit;
                            AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.idSubmit);
                            if (appCompatButton2 != null) {
                                i = R.id.regNoEt;
                                AppCompatEditText appCompatEditText3 = (AppCompatEditText) zp7.a(view, R.id.regNoEt);
                                if (appCompatEditText3 != null) {
                                    i = R.id.registrationDateEt;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.registrationDateEt);
                                    if (appCompatTextView != null) {
                                        i = R.id.registration_dt;
                                        TextView textView3 = (TextView) zp7.a(view, R.id.registration_dt);
                                        if (textView3 != null) {
                                            i = R.id.registration_no;
                                            TextView textView4 = (TextView) zp7.a(view, R.id.registration_no);
                                            if (textView4 != null) {
                                                i = R.id.registration_upto_date;
                                                TextView textView5 = (TextView) zp7.a(view, R.id.registration_upto_date);
                                                if (textView5 != null) {
                                                    i = R.id.registrationUptoEt;
                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.registrationUptoEt);
                                                    if (appCompatTextView2 != null) {
                                                        i = R.id.topHolder;
                                                        View viewA = zp7.a(view, R.id.topHolder);
                                                        if (viewA != null) {
                                                            d47 d47VarA = d47.a(viewA);
                                                            i = R.id.update_mobile_no;
                                                            TextView textView6 = (TextView) zp7.a(view, R.id.update_mobile_no);
                                                            if (textView6 != null) {
                                                                return new yb4((RelativeLayout) view, textView, appCompatEditText, textView2, appCompatEditText2, appCompatButton, appCompatButton2, appCompatEditText3, appCompatTextView, textView3, textView4, textView5, appCompatTextView2, d47VarA, textView6);
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

    public static yb4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static yb4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.nomines_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
