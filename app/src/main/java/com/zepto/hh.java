package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hh {
    public final CoordinatorLayout a;
    public final AppCompatButton b;
    public final AppCompatButton c;
    public final AppCompatButton d;
    public final AppCompatTextView e;
    public final AppCompatEditText f;
    public final LinearLayout g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final LinearLayout k;
    public final AppCompatButton l;
    public final AppCompatButton m;
    public final LinearLayout n;
    public final d47 o;
    public final TextView p;
    public final LinearLayout q;
    public final AppCompatTextView r;
    public final AppCompatEditText s;
    public final RecyclerView t;

    public hh(CoordinatorLayout coordinatorLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout2, AppCompatButton appCompatButton4, AppCompatButton appCompatButton5, LinearLayout linearLayout3, d47 d47Var, TextView textView4, LinearLayout linearLayout4, AppCompatTextView appCompatTextView2, AppCompatEditText appCompatEditText2, RecyclerView recyclerView) {
        this.a = coordinatorLayout;
        this.b = appCompatButton;
        this.c = appCompatButton2;
        this.d = appCompatButton3;
        this.e = appCompatTextView;
        this.f = appCompatEditText;
        this.g = linearLayout;
        this.h = textView;
        this.i = textView2;
        this.j = textView3;
        this.k = linearLayout2;
        this.l = appCompatButton4;
        this.m = appCompatButton5;
        this.n = linearLayout3;
        this.o = d47Var;
        this.p = textView4;
        this.q = linearLayout4;
        this.r = appCompatTextView2;
        this.s = appCompatEditText2;
        this.t = recyclerView;
    }

    public static hh a(View view) {
        int i = R.id.btn_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btn_cancel);
        if (appCompatButton != null) {
            i = R.id.btn_my_vehicle;
            AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.btn_my_vehicle);
            if (appCompatButton2 != null) {
                i = R.id.btn_othe_vehicle;
                AppCompatButton appCompatButton3 = (AppCompatButton) zp7.a(view, R.id.btn_othe_vehicle);
                if (appCompatButton3 != null) {
                    i = R.id.chasis_no_last_five_digits;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.chasis_no_last_five_digits);
                    if (appCompatTextView != null) {
                        i = R.id.chassi_number;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.chassi_number);
                        if (appCompatEditText != null) {
                            i = R.id.enter_new_vehicle_linear;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.enter_new_vehicle_linear);
                            if (linearLayout != null) {
                                i = R.id.enter_vehicle_no;
                                TextView textView = (TextView) zp7.a(view, R.id.enter_vehicle_no);
                                if (textView != null) {
                                    i = R.id.new_note;
                                    TextView textView2 = (TextView) zp7.a(view, R.id.new_note);
                                    if (textView2 != null) {
                                        i = R.id.notes;
                                        TextView textView3 = (TextView) zp7.a(view, R.id.notes);
                                        if (textView3 != null) {
                                            i = R.id.other_New_VehicleLayout;
                                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.other_New_VehicleLayout);
                                            if (linearLayout2 != null) {
                                                i = R.id.reset_button;
                                                AppCompatButton appCompatButton4 = (AppCompatButton) zp7.a(view, R.id.reset_button);
                                                if (appCompatButton4 != null) {
                                                    i = R.id.submit_button;
                                                    AppCompatButton appCompatButton5 = (AppCompatButton) zp7.a(view, R.id.submit_button);
                                                    if (appCompatButton5 != null) {
                                                        i = R.id.submit_layout;
                                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.submit_layout);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.topHolder;
                                                            View viewA = zp7.a(view, R.id.topHolder);
                                                            if (viewA != null) {
                                                                d47 d47VarA = d47.a(viewA);
                                                                i = R.id.vahan_service_lable;
                                                                TextView textView4 = (TextView) zp7.a(view, R.id.vahan_service_lable);
                                                                if (textView4 != null) {
                                                                    i = R.id.vehicle_linear;
                                                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.vehicle_linear);
                                                                    if (linearLayout4 != null) {
                                                                        i = R.id.vehicle_no;
                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.vehicle_no);
                                                                        if (appCompatTextView2 != null) {
                                                                            i = R.id.vehicle_number;
                                                                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) zp7.a(view, R.id.vehicle_number);
                                                                            if (appCompatEditText2 != null) {
                                                                                i = R.id.vehicleServiceRecycler;
                                                                                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.vehicleServiceRecycler);
                                                                                if (recyclerView != null) {
                                                                                    return new hh((CoordinatorLayout) view, appCompatButton, appCompatButton2, appCompatButton3, appCompatTextView, appCompatEditText, linearLayout, textView, textView2, textView3, linearLayout2, appCompatButton4, appCompatButton5, linearLayout3, d47VarA, textView4, linearLayout4, appCompatTextView2, appCompatEditText2, recyclerView);
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

    public static hh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static hh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_main_view_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
