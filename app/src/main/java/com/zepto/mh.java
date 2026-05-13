package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mh {
    public final RelativeLayout a;
    public final TextView b;
    public final AppCompatEditText c;
    public final TextView d;
    public final AppCompatEditText e;
    public final AppCompatButton f;
    public final AppCompatButton g;
    public final AppCompatEditText h;
    public final AppCompatEditText i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final AppCompatEditText m;
    public final d47 n;
    public final TextView o;
    public final TextView p;

    public mh(RelativeLayout relativeLayout, TextView textView, AppCompatEditText appCompatEditText, TextView textView2, AppCompatEditText appCompatEditText2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4, TextView textView3, TextView textView4, TextView textView5, AppCompatEditText appCompatEditText5, d47 d47Var, TextView textView6, TextView textView7) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = appCompatEditText;
        this.d = textView2;
        this.e = appCompatEditText2;
        this.f = appCompatButton;
        this.g = appCompatButton2;
        this.h = appCompatEditText3;
        this.i = appCompatEditText4;
        this.j = textView3;
        this.k = textView4;
        this.l = textView5;
        this.m = appCompatEditText5;
        this.n = d47Var;
        this.o = textView6;
        this.p = textView7;
    }

    public static mh a(View view) {
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
                                    AppCompatEditText appCompatEditText4 = (AppCompatEditText) zp7.a(view, R.id.registrationDateEt);
                                    if (appCompatEditText4 != null) {
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
                                                    AppCompatEditText appCompatEditText5 = (AppCompatEditText) zp7.a(view, R.id.registrationUptoEt);
                                                    if (appCompatEditText5 != null) {
                                                        i = R.id.topHolder;
                                                        View viewA = zp7.a(view, R.id.topHolder);
                                                        if (viewA != null) {
                                                            d47 d47VarA = d47.a(viewA);
                                                            i = R.id.updateMobileHintTv;
                                                            TextView textView6 = (TextView) zp7.a(view, R.id.updateMobileHintTv);
                                                            if (textView6 != null) {
                                                                i = R.id.update_mobile_no;
                                                                TextView textView7 = (TextView) zp7.a(view, R.id.update_mobile_no);
                                                                if (textView7 != null) {
                                                                    return new mh((RelativeLayout) view, textView, appCompatEditText, textView2, appCompatEditText2, appCompatButton, appCompatButton2, appCompatEditText3, appCompatEditText4, textView3, textView4, textView5, appCompatEditText5, d47VarA, textView6, textView7);
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

    public static mh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static mh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_update_mobile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
