package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sh {
    public final RelativeLayout a;
    public final TextView b;
    public final TextView c;
    public final AppCompatTextView d;
    public final EditText e;
    public final EditText f;
    public final vy3 g;
    public final LinearLayout h;
    public final RadioButton i;
    public final AppCompatTextView j;
    public final LinearLayout k;
    public final RadioButton l;

    public sh(RelativeLayout relativeLayout, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, EditText editText, EditText editText2, vy3 vy3Var, LinearLayout linearLayout, RadioButton radioButton, AppCompatTextView appCompatTextView2, LinearLayout linearLayout2, RadioButton radioButton2) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = textView2;
        this.d = appCompatTextView;
        this.e = editText;
        this.f = editText2;
        this.g = vy3Var;
        this.h = linearLayout;
        this.i = radioButton;
        this.j = appCompatTextView2;
        this.k = linearLayout2;
        this.l = radioButton2;
    }

    public static sh a(View view) {
        int i = R.id.chassisTv;
        TextView textView = (TextView) zp7.a(view, R.id.chassisTv);
        if (textView != null) {
            i = R.id.firstInputTv;
            TextView textView2 = (TextView) zp7.a(view, R.id.firstInputTv);
            if (textView2 != null) {
                i = R.id.getDetailsTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.getDetailsTv);
                if (appCompatTextView != null) {
                    i = R.id.inputChasisEt;
                    EditText editText = (EditText) zp7.a(view, R.id.inputChasisEt);
                    if (editText != null) {
                        i = R.id.inputEt;
                        EditText editText2 = (EditText) zp7.a(view, R.id.inputEt);
                        if (editText2 != null) {
                            i = R.id.mHeader;
                            View viewA = zp7.a(view, R.id.mHeader);
                            if (viewA != null) {
                                vy3 vy3VarA = vy3.a(viewA);
                                i = R.id.rcNoLl;
                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.rcNoLl);
                                if (linearLayout != null) {
                                    i = R.id.rcNoRb;
                                    RadioButton radioButton = (RadioButton) zp7.a(view, R.id.rcNoRb);
                                    if (radioButton != null) {
                                        i = R.id.topTitleTv;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.transactionNoLl;
                                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.transactionNoLl);
                                            if (linearLayout2 != null) {
                                                i = R.id.transactionNoRb;
                                                RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.transactionNoRb);
                                                if (radioButton2 != null) {
                                                    return new sh((RelativeLayout) view, textView, textView2, appCompatTextView, editText, editText2, vy3VarA, linearLayout, radioButton, appCompatTextView2, linearLayout2, radioButton2);
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

    public static sh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static sh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_verify_pending_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
