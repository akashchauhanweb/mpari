package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class sq1 {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final CardView d;
    public final TextView e;
    public final ImageView f;
    public final CustomWegetLayout g;
    public final CardView h;
    public final MyTextView i;
    public final LinearLayout j;
    public final MyTextView k;
    public final MyTextView l;
    public final MyTextView m;
    public final MyTextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final MyTextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final MyTextView v;

    public sq1(LinearLayout linearLayout, TextView textView, TextView textView2, CardView cardView, TextView textView3, ImageView imageView, CustomWegetLayout customWegetLayout, CardView cardView2, MyTextView myTextView, LinearLayout linearLayout2, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, TextView textView4, TextView textView5, TextView textView6, TextView textView7, MyTextView myTextView9) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = cardView;
        this.e = textView3;
        this.f = imageView;
        this.g = customWegetLayout;
        this.h = cardView2;
        this.i = myTextView;
        this.j = linearLayout2;
        this.k = myTextView2;
        this.l = myTextView3;
        this.m = myTextView4;
        this.n = myTextView5;
        this.o = myTextView6;
        this.p = myTextView7;
        this.q = myTextView8;
        this.r = textView4;
        this.s = textView5;
        this.t = textView6;
        this.u = textView7;
        this.v = myTextView9;
    }

    public static sq1 a(View view) {
        int i = R.id.dl_holder_name;
        TextView textView = (TextView) zp7.a(view, R.id.dl_holder_name);
        if (textView != null) {
            i = R.id.expire_date;
            TextView textView2 = (TextView) zp7.a(view, R.id.expire_date);
            if (textView2 != null) {
                i = R.id.icon_image;
                CardView cardView = (CardView) zp7.a(view, R.id.icon_image);
                if (cardView != null) {
                    i = R.id.issue_date;
                    TextView textView3 = (TextView) zp7.a(view, R.id.issue_date);
                    if (textView3 != null) {
                        i = R.id.iv_report_traffic_violation_icon;
                        ImageView imageView = (ImageView) zp7.a(view, R.id.iv_report_traffic_violation_icon);
                        if (imageView != null) {
                            i = R.id.ll_select_services;
                            CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.ll_select_services);
                            if (customWegetLayout != null) {
                                i = R.id.round_card_view;
                                CardView cardView2 = (CardView) zp7.a(view, R.id.round_card_view);
                                if (cardView2 != null) {
                                    i = R.id.select_service;
                                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.select_service);
                                    if (myTextView != null) {
                                        i = R.id.should_be_open;
                                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.should_be_open);
                                        if (linearLayout != null) {
                                            i = R.id.tv_current_addr_aadhaar;
                                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.tv_current_addr_aadhaar);
                                            if (myTextView2 != null) {
                                                i = R.id.tv_dl_details;
                                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.tv_dl_details);
                                                if (myTextView3 != null) {
                                                    i = R.id.tv_dl_holder_name;
                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.tv_dl_holder_name);
                                                    if (myTextView4 != null) {
                                                        i = R.id.tv_ekyc_demogra_details;
                                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.tv_ekyc_demogra_details);
                                                        if (myTextView5 != null) {
                                                            i = R.id.tv_expiry_date;
                                                            MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.tv_expiry_date);
                                                            if (myTextView6 != null) {
                                                                i = R.id.tv_issue_date;
                                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.tv_issue_date);
                                                                if (myTextView7 != null) {
                                                                    i = R.id.tv_owner_name_aadhaar;
                                                                    MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.tv_owner_name_aadhaar);
                                                                    if (myTextView8 != null) {
                                                                        i = R.id.txt_current_add;
                                                                        TextView textView4 = (TextView) zp7.a(view, R.id.txt_current_add);
                                                                        if (textView4 != null) {
                                                                            i = R.id.txt_dl_no;
                                                                            TextView textView5 = (TextView) zp7.a(view, R.id.txt_dl_no);
                                                                            if (textView5 != null) {
                                                                                i = R.id.txt_kyc_owner_name;
                                                                                TextView textView6 = (TextView) zp7.a(view, R.id.txt_kyc_owner_name);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.txt_relation;
                                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.txt_relation);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.txt_relation_txt;
                                                                                        MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.txt_relation_txt);
                                                                                        if (myTextView9 != null) {
                                                                                            return new sq1((LinearLayout) view, textView, textView2, cardView, textView3, imageView, customWegetLayout, cardView2, myTextView, linearLayout, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, myTextView8, textView4, textView5, textView6, textView7, myTextView9);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static sq1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static sq1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dl_services_10, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
