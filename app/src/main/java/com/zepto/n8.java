package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class n8 {
    public final CoordinatorLayout a;
    public final MyTextView b;
    public final LinearLayout c;
    public final RadioButton d;
    public final d47 e;
    public final AppCompatTextView f;
    public final MyTextView g;
    public final AppCompatTextView h;
    public final MyTextView i;
    public final AppCompatButton j;
    public final MyTextView k;
    public final AppCompatTextView l;
    public final LinearLayout m;
    public final RadioButton n;
    public final TextView o;
    public final TextView p;

    public n8(CoordinatorLayout coordinatorLayout, MyTextView myTextView, LinearLayout linearLayout, RadioButton radioButton, d47 d47Var, AppCompatTextView appCompatTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView2, MyTextView myTextView3, AppCompatButton appCompatButton, MyTextView myTextView4, AppCompatTextView appCompatTextView3, LinearLayout linearLayout2, RadioButton radioButton2, TextView textView, TextView textView2) {
        this.a = coordinatorLayout;
        this.b = myTextView;
        this.c = linearLayout;
        this.d = radioButton;
        this.e = d47Var;
        this.f = appCompatTextView;
        this.g = myTextView2;
        this.h = appCompatTextView2;
        this.i = myTextView3;
        this.j = appCompatButton;
        this.k = myTextView4;
        this.l = appCompatTextView3;
        this.m = linearLayout2;
        this.n = radioButton2;
        this.o = textView;
        this.p = textView2;
    }

    public static n8 a(View view) {
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
                        i = R.id.fee_amount;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.fee_amount);
                        if (appCompatTextView != null) {
                            i = R.id.fine_amount_tv;
                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.fine_amount_tv);
                            if (myTextView2 != null) {
                                i = R.id.fine_amount_txt;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.fine_amount_txt);
                                if (appCompatTextView2 != null) {
                                    i = R.id.idLayoutTitle;
                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.idLayoutTitle);
                                    if (myTextView3 != null) {
                                        i = R.id.paynow;
                                        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.paynow);
                                        if (appCompatButton != null) {
                                            i = R.id.total_amount_tv;
                                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.total_amount_tv);
                                            if (myTextView4 != null) {
                                                i = R.id.total_amount_txt;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.total_amount_txt);
                                                if (appCompatTextView3 != null) {
                                                    i = R.id.vehicleNoLl;
                                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.vehicleNoLl);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.vehicleNoRb;
                                                        RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.vehicleNoRb);
                                                        if (radioButton2 != null) {
                                                            i = R.id.vehicle_number;
                                                            TextView textView = (TextView) zp7.a(view, R.id.vehicle_number);
                                                            if (textView != null) {
                                                                i = R.id.vehicle_view;
                                                                TextView textView2 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                if (textView2 != null) {
                                                                    return new n8((CoordinatorLayout) view, myTextView, linearLayout, radioButton, d47VarA, appCompatTextView, myTextView2, appCompatTextView2, myTextView3, appCompatButton, myTextView4, appCompatTextView3, linearLayout2, radioButton2, textView, textView2);
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

    public static n8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static n8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_compounding_fee2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
