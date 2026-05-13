package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class tq1 {
    public final MyTextView A;
    public final MyTextView B;
    public final MyTextView C;
    public final CustomWegetLayout D;
    public final CustomWegetLayout E;
    public final LinearLayout a;
    public final CheckBox b;
    public final CheckBox c;
    public final CheckBox d;
    public final CheckBox e;
    public final CheckBox f;
    public final CheckBox g;
    public final Spinner h;
    public final Spinner i;
    public final ImageView j;
    public final TextView k;
    public final TextView l;
    public final MyTextView m;
    public final MyTextView n;
    public final CardView o;
    public final ImageView p;
    public final ImageView q;
    public final RelativeLayout r;
    public final FrameLayout s;
    public final ProgressBar t;
    public final CardView u;
    public final TextView v;
    public final TextView w;
    public final MyTextView x;
    public final MyTextView y;
    public final MyTextView z;

    public tq1(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, Spinner spinner, Spinner spinner2, ImageView imageView, TextView textView, TextView textView2, MyTextView myTextView, MyTextView myTextView2, CardView cardView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, FrameLayout frameLayout, ProgressBar progressBar, CardView cardView2, TextView textView3, TextView textView4, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2) {
        this.a = linearLayout;
        this.b = checkBox;
        this.c = checkBox2;
        this.d = checkBox3;
        this.e = checkBox4;
        this.f = checkBox5;
        this.g = checkBox6;
        this.h = spinner;
        this.i = spinner2;
        this.j = imageView;
        this.k = textView;
        this.l = textView2;
        this.m = myTextView;
        this.n = myTextView2;
        this.o = cardView;
        this.p = imageView2;
        this.q = imageView3;
        this.r = relativeLayout;
        this.s = frameLayout;
        this.t = progressBar;
        this.u = cardView2;
        this.v = textView3;
        this.w = textView4;
        this.x = myTextView3;
        this.y = myTextView4;
        this.z = myTextView5;
        this.A = myTextView6;
        this.B = myTextView7;
        this.C = myTextView8;
        this.D = customWegetLayout;
        this.E = customWegetLayout2;
    }

    public static tq1 a(View view) {
        int i = R.id.check_change_add;
        CheckBox checkBox = (CheckBox) zp7.a(view, R.id.check_change_add);
        if (checkBox != null) {
            i = R.id.check_dl_abs;
            CheckBox checkBox2 = (CheckBox) zp7.a(view, R.id.check_dl_abs);
            if (checkBox2 != null) {
                i = R.id.check_dl_replace;
                CheckBox checkBox3 = (CheckBox) zp7.a(view, R.id.check_dl_replace);
                if (checkBox3 != null) {
                    i = R.id.check_dup_dl;
                    CheckBox checkBox4 = (CheckBox) zp7.a(view, R.id.check_dup_dl);
                    if (checkBox4 != null) {
                        i = R.id.check_idp;
                        CheckBox checkBox5 = (CheckBox) zp7.a(view, R.id.check_idp);
                        if (checkBox5 != null) {
                            i = R.id.check_renewal_dl;
                            CheckBox checkBox6 = (CheckBox) zp7.a(view, R.id.check_renewal_dl);
                            if (checkBox6 != null) {
                                i = R.id.current_rto;
                                Spinner spinner = (Spinner) zp7.a(view, R.id.current_rto);
                                if (spinner != null) {
                                    i = R.id.current_state;
                                    Spinner spinner2 = (Spinner) zp7.a(view, R.id.current_state);
                                    if (spinner2 != null) {
                                        i = R.id.current_state_button;
                                        ImageView imageView = (ImageView) zp7.a(view, R.id.current_state_button);
                                        if (imageView != null) {
                                            i = R.id.dl_no;
                                            TextView textView = (TextView) zp7.a(view, R.id.dl_no);
                                            if (textView != null) {
                                                i = R.id.dl_no_txt;
                                                TextView textView2 = (TextView) zp7.a(view, R.id.dl_no_txt);
                                                if (textView2 != null) {
                                                    i = R.id.dl_number_new;
                                                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.dl_number_new);
                                                    if (myTextView != null) {
                                                        i = R.id.dl_service_new;
                                                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.dl_service_new);
                                                        if (myTextView2 != null) {
                                                            i = R.id.icon_image;
                                                            CardView cardView = (CardView) zp7.a(view, R.id.icon_image);
                                                            if (cardView != null) {
                                                                i = R.id.iv_down;
                                                                ImageView imageView2 = (ImageView) zp7.a(view, R.id.iv_down);
                                                                if (imageView2 != null) {
                                                                    i = R.id.iv_report_traffic_violation_icon;
                                                                    ImageView imageView3 = (ImageView) zp7.a(view, R.id.iv_report_traffic_violation_icon);
                                                                    if (imageView3 != null) {
                                                                        i = R.id.layout_req_submit_rto;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.layout_req_submit_rto);
                                                                        if (relativeLayout != null) {
                                                                            i = R.id.layout_request_state;
                                                                            FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.layout_request_state);
                                                                            if (frameLayout != null) {
                                                                                i = R.id.progress_bar_act;
                                                                                ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progress_bar_act);
                                                                                if (progressBar != null) {
                                                                                    i = R.id.round_card_view;
                                                                                    CardView cardView2 = (CardView) zp7.a(view, R.id.round_card_view);
                                                                                    if (cardView2 != null) {
                                                                                        i = R.id.rto;
                                                                                        TextView textView3 = (TextView) zp7.a(view, R.id.rto);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.state;
                                                                                            TextView textView4 = (TextView) zp7.a(view, R.id.state);
                                                                                            if (textView4 != null) {
                                                                                                i = R.id.tv_dl_no;
                                                                                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.tv_dl_no);
                                                                                                if (myTextView3 != null) {
                                                                                                    i = R.id.tv_last_endor_rto;
                                                                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.tv_last_endor_rto);
                                                                                                    if (myTextView4 != null) {
                                                                                                        i = R.id.tv_last_endor_state;
                                                                                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.tv_last_endor_state);
                                                                                                        if (myTextView5 != null) {
                                                                                                            i = R.id.txt_dl_service;
                                                                                                            MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.txt_dl_service);
                                                                                                            if (myTextView6 != null) {
                                                                                                                i = R.id.txt_req_submit;
                                                                                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.txt_req_submit);
                                                                                                                if (myTextView7 != null) {
                                                                                                                    i = R.id.txt_req_submit_rto;
                                                                                                                    MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.txt_req_submit_rto);
                                                                                                                    if (myTextView8 != null) {
                                                                                                                        i = R.id.txt_service_cancel;
                                                                                                                        CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.txt_service_cancel);
                                                                                                                        if (customWegetLayout != null) {
                                                                                                                            i = R.id.txt_service_submit;
                                                                                                                            CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) zp7.a(view, R.id.txt_service_submit);
                                                                                                                            if (customWegetLayout2 != null) {
                                                                                                                                return new tq1((LinearLayout) view, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, spinner, spinner2, imageView, textView, textView2, myTextView, myTextView2, cardView, imageView2, imageView3, relativeLayout, frameLayout, progressBar, cardView2, textView3, textView4, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, myTextView8, customWegetLayout, customWegetLayout2);
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

    public static tq1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static tq1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dl_services_11, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
