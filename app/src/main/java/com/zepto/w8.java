package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class w8 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final TextView h;
    public final LinearLayout i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final LinearLayout n;

    public w8(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, TextView textView, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12, LinearLayout linearLayout13) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearLayout3;
        this.d = linearLayout4;
        this.e = linearLayout5;
        this.f = linearLayout6;
        this.g = linearLayout7;
        this.h = textView;
        this.i = linearLayout8;
        this.j = linearLayout9;
        this.k = linearLayout10;
        this.l = linearLayout11;
        this.m = linearLayout12;
        this.n = linearLayout13;
    }

    public static w8 a(View view) {
        int i = R.id.app_status_layout;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.app_status_layout);
        if (linearLayout != null) {
            i = R.id.change_of_address;
            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.change_of_address);
            if (linearLayout2 != null) {
                i = R.id.dispose_app_layout;
                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.dispose_app_layout);
                if (linearLayout3 != null) {
                    i = R.id.dl_abstract;
                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.dl_abstract);
                    if (linearLayout4 != null) {
                        i = R.id.dl_replacement;
                        LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.dl_replacement);
                        if (linearLayout5 != null) {
                            i = R.id.duplicate_dl;
                            LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.duplicate_dl);
                            if (linearLayout6 != null) {
                                i = R.id.enrolled_state_sarthi;
                                TextView textView = (TextView) zp7.a(view, R.id.enrolled_state_sarthi);
                                if (textView != null) {
                                    i = R.id.internationl_permit;
                                    LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.internationl_permit);
                                    if (linearLayout7 != null) {
                                        i = R.id.mobile_update_service;
                                        LinearLayout linearLayout8 = (LinearLayout) zp7.a(view, R.id.mobile_update_service);
                                        if (linearLayout8 != null) {
                                            i = R.id.nexgenarrow;
                                            LinearLayout linearLayout9 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                            if (linearLayout9 != null) {
                                                i = R.id.nexgenlogo;
                                                LinearLayout linearLayout10 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                                if (linearLayout10 != null) {
                                                    i = R.id.renewal_of_dl;
                                                    LinearLayout linearLayout11 = (LinearLayout) zp7.a(view, R.id.renewal_of_dl);
                                                    if (linearLayout11 != null) {
                                                        i = R.id.withdraw_service_layout;
                                                        LinearLayout linearLayout12 = (LinearLayout) zp7.a(view, R.id.withdraw_service_layout);
                                                        if (linearLayout12 != null) {
                                                            return new w8((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12);
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

    public static w8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static w8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_d_l_service_home, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
