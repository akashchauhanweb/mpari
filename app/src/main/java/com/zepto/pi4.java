package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pi4 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final TextView e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final LinearLayout j;
    public final TextView k;
    public final LinearLayout l;
    public final LinearLayout m;

    public pi4(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, TextView textView2, LinearLayout linearLayout10, LinearLayout linearLayout11) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearLayout3;
        this.d = linearLayout4;
        this.e = textView;
        this.f = linearLayout5;
        this.g = linearLayout6;
        this.h = linearLayout7;
        this.i = linearLayout8;
        this.j = linearLayout9;
        this.k = textView2;
        this.l = linearLayout10;
        this.m = linearLayout11;
    }

    public static pi4 a(View view) {
        int i = R.id.checkpostfeereceipt;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.checkpostfeereceipt);
        if (linearLayout != null) {
            i = R.id.d_to;
            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.d_to);
            if (linearLayout2 != null) {
                i = R.id.downloadFancyReceipt;
                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.downloadFancyReceipt);
                if (linearLayout3 != null) {
                    i = R.id.enrolled_state_vahan;
                    TextView textView = (TextView) zp7.a(view, R.id.enrolled_state_vahan);
                    if (textView != null) {
                        i = R.id.fancy_no_allocate_status;
                        LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.fancy_no_allocate_status);
                        if (linearLayout4 != null) {
                            i = R.id.fancy_no_avaliable_status;
                            LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.fancy_no_avaliable_status);
                            if (linearLayout5 != null) {
                                i = R.id.nexgenarrow;
                                LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                if (linearLayout6 != null) {
                                    i = R.id.nexgenlogo;
                                    LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                    if (linearLayout7 != null) {
                                        i = R.id.pucc_download;
                                        LinearLayout linearLayout8 = (LinearLayout) zp7.a(view, R.id.pucc_download);
                                        if (linearLayout8 != null) {
                                            i = R.id.vahan_service_lable;
                                            TextView textView2 = (TextView) zp7.a(view, R.id.vahan_service_lable);
                                            if (textView2 != null) {
                                                i = R.id.view_allotment_letter;
                                                LinearLayout linearLayout9 = (LinearLayout) zp7.a(view, R.id.view_allotment_letter);
                                                if (linearLayout9 != null) {
                                                    i = R.id.viewtaxreceipt;
                                                    LinearLayout linearLayout10 = (LinearLayout) zp7.a(view, R.id.viewtaxreceipt);
                                                    if (linearLayout10 != null) {
                                                        return new pi4((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, textView, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, textView2, linearLayout9, linearLayout10);
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

    public static pi4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static pi4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.otherservice_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
