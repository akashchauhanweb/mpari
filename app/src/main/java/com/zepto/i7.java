package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i7 {
    public final LinearLayout a;
    public final EditText b;
    public final AppCompatTextView c;
    public final EditText d;
    public final RadioButton e;
    public final LinearLayout f;
    public final Spinner g;
    public final ImageView h;
    public final AppCompatTextView i;
    public final AppCompatTextView j;
    public final d47 k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final RadioButton n;

    public i7(LinearLayout linearLayout, EditText editText, AppCompatTextView appCompatTextView, EditText editText2, RadioButton radioButton, LinearLayout linearLayout2, Spinner spinner, ImageView imageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, d47 d47Var, LinearLayout linearLayout3, LinearLayout linearLayout4, RadioButton radioButton2) {
        this.a = linearLayout;
        this.b = editText;
        this.c = appCompatTextView;
        this.d = editText2;
        this.e = radioButton;
        this.f = linearLayout2;
        this.g = spinner;
        this.h = imageView;
        this.i = appCompatTextView2;
        this.j = appCompatTextView3;
        this.k = d47Var;
        this.l = linearLayout3;
        this.m = linearLayout4;
        this.n = radioButton2;
    }

    public static i7 a(View view) {
        int i = R.id.enter_vehicle_number;
        EditText editText = (EditText) zp7.a(view, R.id.enter_vehicle_number);
        if (editText != null) {
            i = R.id.getDetailsTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.getDetailsTv);
            if (appCompatTextView != null) {
                i = R.id.inputEt;
                EditText editText2 = (EditText) zp7.a(view, R.id.inputEt);
                if (editText2 != null) {
                    i = R.id.noticeNoRb;
                    RadioButton radioButton = (RadioButton) zp7.a(view, R.id.noticeNoRb);
                    if (radioButton != null) {
                        i = R.id.noticeServiceLl;
                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.noticeServiceLl);
                        if (linearLayout != null) {
                            i = R.id.state_spinner;
                            Spinner spinner = (Spinner) zp7.a(view, R.id.state_spinner);
                            if (spinner != null) {
                                i = R.id.tax_mode_icon;
                                ImageView imageView = (ImageView) zp7.a(view, R.id.tax_mode_icon);
                                if (imageView != null) {
                                    i = R.id.taxhead;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.taxhead);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.titleTv;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                        if (appCompatTextView3 != null) {
                                            i = R.id.top_back;
                                            View viewA = zp7.a(view, R.id.top_back);
                                            if (viewA != null) {
                                                d47 d47VarA = d47.a(viewA);
                                                i = R.id.vehicleDetailsLl;
                                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.vehicleDetailsLl);
                                                if (linearLayout2 != null) {
                                                    i = R.id.vehicleNoLl;
                                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.vehicleNoLl);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.vehicleNoRb;
                                                        RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.vehicleNoRb);
                                                        if (radioButton2 != null) {
                                                            return new i7((LinearLayout) view, editText, appCompatTextView, editText2, radioButton, linearLayout, spinner, imageView, appCompatTextView2, appCompatTextView3, d47VarA, linearLayout2, linearLayout3, radioButton2);
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

    public static i7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static i7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_check_post_receipt_status, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
