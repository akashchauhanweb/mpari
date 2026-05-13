package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class he {
    public final LinearLayout a;
    public final EditText b;
    public final EditText c;
    public final AppCompatTextView d;
    public final EditText e;
    public final RadioButton f;
    public final LinearLayout g;
    public final RecyclerView h;
    public final AppCompatTextView i;
    public final d47 j;
    public final TextView k;
    public final TextView l;
    public final MyTextView m;
    public final LinearLayout n;
    public final LinearLayout o;
    public final RadioButton p;
    public final LinearLayout q;

    public he(LinearLayout linearLayout, EditText editText, EditText editText2, AppCompatTextView appCompatTextView, EditText editText3, RadioButton radioButton, LinearLayout linearLayout2, RecyclerView recyclerView, AppCompatTextView appCompatTextView2, d47 d47Var, TextView textView, TextView textView2, MyTextView myTextView, LinearLayout linearLayout3, LinearLayout linearLayout4, RadioButton radioButton2, LinearLayout linearLayout5) {
        this.a = linearLayout;
        this.b = editText;
        this.c = editText2;
        this.d = appCompatTextView;
        this.e = editText3;
        this.f = radioButton;
        this.g = linearLayout2;
        this.h = recyclerView;
        this.i = appCompatTextView2;
        this.j = d47Var;
        this.k = textView;
        this.l = textView2;
        this.m = myTextView;
        this.n = linearLayout3;
        this.o = linearLayout4;
        this.p = radioButton2;
        this.q = linearLayout5;
    }

    public static he a(View view) {
        int i = R.id.chasisEt;
        EditText editText = (EditText) zp7.a(view, R.id.chasisEt);
        if (editText != null) {
            i = R.id.engineEt;
            EditText editText2 = (EditText) zp7.a(view, R.id.engineEt);
            if (editText2 != null) {
                i = R.id.getDetailsTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.getDetailsTv);
                if (appCompatTextView != null) {
                    i = R.id.inputEt;
                    EditText editText3 = (EditText) zp7.a(view, R.id.inputEt);
                    if (editText3 != null) {
                        i = R.id.noticeNoRb;
                        RadioButton radioButton = (RadioButton) zp7.a(view, R.id.noticeNoRb);
                        if (radioButton != null) {
                            i = R.id.noticeServiceLl;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.noticeServiceLl);
                            if (linearLayout != null) {
                                i = R.id.rec_rc_recycler;
                                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rec_rc_recycler);
                                if (recyclerView != null) {
                                    i = R.id.titleTv;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.topHolder;
                                        View viewA = zp7.a(view, R.id.topHolder);
                                        if (viewA != null) {
                                            d47 d47VarA = d47.a(viewA);
                                            i = R.id.tv_chassi_no;
                                            TextView textView = (TextView) zp7.a(view, R.id.tv_chassi_no);
                                            if (textView != null) {
                                                i = R.id.tv_engine_no;
                                                TextView textView2 = (TextView) zp7.a(view, R.id.tv_engine_no);
                                                if (textView2 != null) {
                                                    i = R.id.tv_my_vehicle_list;
                                                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.tv_my_vehicle_list);
                                                    if (myTextView != null) {
                                                        i = R.id.vehicleDetailsLl;
                                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.vehicleDetailsLl);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.vehicleNoLl;
                                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.vehicleNoLl);
                                                            if (linearLayout3 != null) {
                                                                i = R.id.vehicleNoRb;
                                                                RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.vehicleNoRb);
                                                                if (radioButton2 != null) {
                                                                    i = R.id.virtualrc_layout;
                                                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.virtualrc_layout);
                                                                    if (linearLayout4 != null) {
                                                                        return new he((LinearLayout) view, editText, editText2, appCompatTextView, editText3, radioButton, linearLayout, recyclerView, appCompatTextView2, d47VarA, textView, textView2, myTextView, linearLayout2, linearLayout3, radioButton2, linearLayout4);
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

    public static he c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static he d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_notice_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
