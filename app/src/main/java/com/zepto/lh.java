package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    public final LinearLayout a;
    public final CheckBox b;
    public final CheckBox c;
    public final CheckBox d;
    public final CheckBox e;
    public final CheckBox f;
    public final CheckBox g;
    public final CheckBox h;
    public final MyTextView i;
    public final MyTextView j;
    public final d47 k;
    public final CheckBox l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final MyTextView r;
    public final MyTextView s;

    public lh(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, MyTextView myTextView, MyTextView myTextView2, d47 d47Var, CheckBox checkBox8, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, MyTextView myTextView3, MyTextView myTextView4) {
        this.a = linearLayout;
        this.b = checkBox;
        this.c = checkBox2;
        this.d = checkBox3;
        this.e = checkBox4;
        this.f = checkBox5;
        this.g = checkBox6;
        this.h = checkBox7;
        this.i = myTextView;
        this.j = myTextView2;
        this.k = d47Var;
        this.l = checkBox8;
        this.m = textView;
        this.n = textView2;
        this.o = textView3;
        this.p = textView4;
        this.q = textView5;
        this.r = myTextView3;
        this.s = myTextView4;
    }

    public static lh a(View view) {
        int i = R.id.change_of_address;
        CheckBox checkBox = (CheckBox) zp7.a(view, R.id.change_of_address);
        if (checkBox != null) {
            i = R.id.duplicate_rc;
            CheckBox checkBox2 = (CheckBox) zp7.a(view, R.id.duplicate_rc);
            if (checkBox2 != null) {
                i = R.id.hyper_add;
                CheckBox checkBox3 = (CheckBox) zp7.a(view, R.id.hyper_add);
                if (checkBox3 != null) {
                    i = R.id.hyper_con;
                    CheckBox checkBox4 = (CheckBox) zp7.a(view, R.id.hyper_con);
                    if (checkBox4 != null) {
                        i = R.id.hyper_term;
                        CheckBox checkBox5 = (CheckBox) zp7.a(view, R.id.hyper_term);
                        if (checkBox5 != null) {
                            i = R.id.noc_service;
                            CheckBox checkBox6 = (CheckBox) zp7.a(view, R.id.noc_service);
                            if (checkBox6 != null) {
                                i = R.id.rc_particular;
                                CheckBox checkBox7 = (CheckBox) zp7.a(view, R.id.rc_particular);
                                if (checkBox7 != null) {
                                    i = R.id.rto;
                                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.rto);
                                    if (myTextView != null) {
                                        i = R.id.state;
                                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.state);
                                        if (myTextView2 != null) {
                                            i = R.id.topHolder;
                                            View viewA = zp7.a(view, R.id.topHolder);
                                            if (viewA != null) {
                                                d47 d47VarA = d47.a(viewA);
                                                i = R.id.trans_owner;
                                                CheckBox checkBox8 = (CheckBox) zp7.a(view, R.id.trans_owner);
                                                if (checkBox8 != null) {
                                                    i = R.id.txt_reset;
                                                    TextView textView = (TextView) zp7.a(view, R.id.txt_reset);
                                                    if (textView != null) {
                                                        i = R.id.txt_rto;
                                                        TextView textView2 = (TextView) zp7.a(view, R.id.txt_rto);
                                                        if (textView2 != null) {
                                                            i = R.id.txt_service_submit;
                                                            TextView textView3 = (TextView) zp7.a(view, R.id.txt_service_submit);
                                                            if (textView3 != null) {
                                                                i = R.id.txt_state_name;
                                                                TextView textView4 = (TextView) zp7.a(view, R.id.txt_state_name);
                                                                if (textView4 != null) {
                                                                    i = R.id.txt_vehicle_number;
                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.txt_vehicle_number);
                                                                    if (textView5 != null) {
                                                                        i = R.id.vahan_service_lable;
                                                                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vahan_service_lable);
                                                                        if (myTextView3 != null) {
                                                                            i = R.id.vehicle_number;
                                                                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vehicle_number);
                                                                            if (myTextView4 != null) {
                                                                                return new lh((LinearLayout) view, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, myTextView, myTextView2, d47VarA, checkBox8, textView, textView2, textView3, textView4, textView5, myTextView3, myTextView4);
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

    public static lh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static lh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_select_service_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
