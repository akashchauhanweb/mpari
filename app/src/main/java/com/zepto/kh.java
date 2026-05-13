package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kh {
    public final ScrollView a;
    public final MyTextView b;
    public final AppCompatButton c;
    public final EditText d;
    public final EditText e;
    public final EditText f;
    public final CheckBox g;
    public final MyTextView h;
    public final CheckBox i;
    public final LinearLayout j;
    public final EditText k;
    public final CheckBox l;
    public final RadioButton m;
    public final RadioButton n;
    public final LinearLayout o;
    public final d47 p;
    public final MyTextView q;
    public final MyTextView r;
    public final TextView s;
    public final TextView t;

    public kh(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, EditText editText, EditText editText2, EditText editText3, CheckBox checkBox, MyTextView myTextView2, CheckBox checkBox2, LinearLayout linearLayout, EditText editText4, CheckBox checkBox3, RadioButton radioButton, RadioButton radioButton2, LinearLayout linearLayout2, d47 d47Var, MyTextView myTextView3, MyTextView myTextView4, TextView textView, TextView textView2) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = appCompatButton;
        this.d = editText;
        this.e = editText2;
        this.f = editText3;
        this.g = checkBox;
        this.h = myTextView2;
        this.i = checkBox2;
        this.j = linearLayout;
        this.k = editText4;
        this.l = checkBox3;
        this.m = radioButton;
        this.n = radioButton2;
        this.o = linearLayout2;
        this.p = d47Var;
        this.q = myTextView3;
        this.r = myTextView4;
        this.s = textView;
        this.t = textView2;
    }

    public static kh a(View view) {
        int i = R.id.apply_tax_exemption;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.apply_tax_exemption);
        if (myTextView != null) {
            i = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
            if (appCompatButton != null) {
                i = R.id.enter_fitness_certificate;
                EditText editText = (EditText) zp7.a(view, R.id.enter_fitness_certificate);
                if (editText != null) {
                    i = R.id.enter_permit;
                    EditText editText2 = (EditText) zp7.a(view, R.id.enter_permit);
                    if (editText2 != null) {
                        i = R.id.enter_rc_seraial_no;
                        EditText editText3 = (EditText) zp7.a(view, R.id.enter_rc_seraial_no);
                        if (editText3 != null) {
                            i = R.id.fitness_certificate;
                            CheckBox checkBox = (CheckBox) zp7.a(view, R.id.fitness_certificate);
                            if (checkBox != null) {
                                i = R.id.optional_detail;
                                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.optional_detail);
                                if (myTextView2 != null) {
                                    i = R.id.permit;
                                    CheckBox checkBox2 = (CheckBox) zp7.a(view, R.id.permit);
                                    if (checkBox2 != null) {
                                        i = R.id.police_fir_layout;
                                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.police_fir_layout);
                                        if (linearLayout != null) {
                                            i = R.id.remarkTv;
                                            EditText editText4 = (EditText) zp7.a(view, R.id.remarkTv);
                                            if (editText4 != null) {
                                                i = R.id.surrender_rc;
                                                CheckBox checkBox3 = (CheckBox) zp7.a(view, R.id.surrender_rc);
                                                if (checkBox3 != null) {
                                                    i = R.id.tax_no;
                                                    RadioButton radioButton = (RadioButton) zp7.a(view, R.id.tax_no);
                                                    if (radioButton != null) {
                                                        i = R.id.tax_yes;
                                                        RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.tax_yes);
                                                        if (radioButton2 != null) {
                                                            i = R.id.text_exemption;
                                                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.text_exemption);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.topHolder;
                                                                View viewA = zp7.a(view, R.id.topHolder);
                                                                if (viewA != null) {
                                                                    d47 d47VarA = d47.a(viewA);
                                                                    i = R.id.vahan_details_duplicate_rc;
                                                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                                                                    if (myTextView3 != null) {
                                                                        i = R.id.vahan_remark;
                                                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vahan_remark);
                                                                        if (myTextView4 != null) {
                                                                            i = R.id.vehicleNumberTv;
                                                                            TextView textView = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                            if (textView != null) {
                                                                                i = R.id.vehicle_view;
                                                                                TextView textView2 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                if (textView2 != null) {
                                                                                    return new kh((ScrollView) view, myTextView, appCompatButton, editText, editText2, editText3, checkBox, myTextView2, checkBox2, linearLayout, editText4, checkBox3, radioButton, radioButton2, linearLayout2, d47VarA, myTextView3, myTextView4, textView, textView2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static kh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static kh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_rc_surrender, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
