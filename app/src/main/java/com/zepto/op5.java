package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class op5 {
    public final MyTextView A;
    public final TextView B;
    public final RelativeLayout a;
    public final com.nic.mparivahan.MyTextView b;
    public final MyTextView c;
    public final AppCompatTextView d;
    public final TextView e;
    public final TextView f;
    public final AppCompatEditText g;
    public final AppCompatButton h;
    public final CheckBox i;
    public final CardView j;
    public final ImageView k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final AppCompatEditText n;
    public final iy3 o;
    public final vy3 p;
    public final AppCompatTextView q;
    public final ProgressBar r;
    public final TextView s;
    public final AppCompatButton t;
    public final CardView u;
    public final MyTextView v;
    public final AppCompatButton w;
    public final LinearLayout x;
    public final MyTextView y;
    public final AppCompatTextView z;

    public op5(RelativeLayout relativeLayout, com.nic.mparivahan.MyTextView myTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, AppCompatEditText appCompatEditText, AppCompatButton appCompatButton, CheckBox checkBox, CardView cardView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatEditText appCompatEditText2, iy3 iy3Var, vy3 vy3Var, AppCompatTextView appCompatTextView2, ProgressBar progressBar, TextView textView3, AppCompatButton appCompatButton2, CardView cardView2, MyTextView myTextView3, AppCompatButton appCompatButton3, LinearLayout linearLayout3, MyTextView myTextView4, AppCompatTextView appCompatTextView3, MyTextView myTextView5, TextView textView4) {
        this.a = relativeLayout;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = appCompatTextView;
        this.e = textView;
        this.f = textView2;
        this.g = appCompatEditText;
        this.h = appCompatButton;
        this.i = checkBox;
        this.j = cardView;
        this.k = imageView;
        this.l = linearLayout;
        this.m = linearLayout2;
        this.n = appCompatEditText2;
        this.o = iy3Var;
        this.p = vy3Var;
        this.q = appCompatTextView2;
        this.r = progressBar;
        this.s = textView3;
        this.t = appCompatButton2;
        this.u = cardView2;
        this.v = myTextView3;
        this.w = appCompatButton3;
        this.x = linearLayout3;
        this.y = myTextView4;
        this.z = appCompatTextView3;
        this.A = myTextView5;
        this.B = textView4;
    }

    public static op5 a(View view) {
        int i = R.id.agreeTermCond;
        com.nic.mparivahan.MyTextView myTextView = (com.nic.mparivahan.MyTextView) zp7.a(view, R.id.agreeTermCond);
        if (myTextView != null) {
            i = R.id.chassi_number;
            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.chassi_number);
            if (myTextView2 != null) {
                i = R.id.demo_top;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.demo_top);
                if (appCompatTextView != null) {
                    i = R.id.dl_no_txt;
                    TextView textView = (TextView) zp7.a(view, R.id.dl_no_txt);
                    if (textView != null) {
                        i = R.id.dl_number;
                        TextView textView2 = (TextView) zp7.a(view, R.id.dl_number);
                        if (textView2 != null) {
                            i = R.id.et_otp;
                            AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.et_otp);
                            if (appCompatEditText != null) {
                                i = R.id.generate_otp;
                                AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.generate_otp);
                                if (appCompatButton != null) {
                                    i = R.id.i_have_terms;
                                    CheckBox checkBox = (CheckBox) zp7.a(view, R.id.i_have_terms);
                                    if (checkBox != null) {
                                        i = R.id.icon_image;
                                        CardView cardView = (CardView) zp7.a(view, R.id.icon_image);
                                        if (cardView != null) {
                                            i = R.id.iv_report_traffic_violation_icon;
                                            ImageView imageView = (ImageView) zp7.a(view, R.id.iv_report_traffic_violation_icon);
                                            if (imageView != null) {
                                                i = R.id.linear_mob;
                                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.linear_mob);
                                                if (linearLayout != null) {
                                                    i = R.id.linear_otp;
                                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.linear_otp);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.mob_number;
                                                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) zp7.a(view, R.id.mob_number);
                                                        if (appCompatEditText2 != null) {
                                                            i = R.id.multi_head;
                                                            View viewA = zp7.a(view, R.id.multi_head);
                                                            if (viewA != null) {
                                                                iy3 iy3VarA = iy3.a(viewA);
                                                                i = R.id.mvvmId;
                                                                View viewA2 = zp7.a(view, R.id.mvvmId);
                                                                if (viewA2 != null) {
                                                                    vy3 vy3VarA = vy3.a(viewA2);
                                                                    i = R.id.otp_time;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.otp_time);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = R.id.pb_pwm;
                                                                        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.pb_pwm);
                                                                        if (progressBar != null) {
                                                                            i = R.id.resendOtp;
                                                                            TextView textView3 = (TextView) zp7.a(view, R.id.resendOtp);
                                                                            if (textView3 != null) {
                                                                                i = R.id.reset_button;
                                                                                AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.reset_button);
                                                                                if (appCompatButton2 != null) {
                                                                                    i = R.id.round_card_view;
                                                                                    CardView cardView2 = (CardView) zp7.a(view, R.id.round_card_view);
                                                                                    if (cardView2 != null) {
                                                                                        i = R.id.select_service;
                                                                                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.select_service);
                                                                                        if (myTextView3 != null) {
                                                                                            i = R.id.submit;
                                                                                            AppCompatButton appCompatButton3 = (AppCompatButton) zp7.a(view, R.id.submit);
                                                                                            if (appCompatButton3 != null) {
                                                                                                i = R.id.termCndLl;
                                                                                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.termCndLl);
                                                                                                if (linearLayout3 != null) {
                                                                                                    i = R.id.tv_dl_no;
                                                                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.tv_dl_no);
                                                                                                    if (myTextView4 != null) {
                                                                                                        i = R.id.tv_enter_otp;
                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.tv_enter_otp);
                                                                                                        if (appCompatTextView3 != null) {
                                                                                                            i = R.id.update_mob;
                                                                                                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.update_mob);
                                                                                                            if (myTextView5 != null) {
                                                                                                                i = R.id.update_mobile_no;
                                                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.update_mobile_no);
                                                                                                                if (textView4 != null) {
                                                                                                                    return new op5((RelativeLayout) view, myTextView, myTextView2, appCompatTextView, textView, textView2, appCompatEditText, appCompatButton, checkBox, cardView, imageView, linearLayout, linearLayout2, appCompatEditText2, iy3VarA, vy3VarA, appCompatTextView2, progressBar, textView3, appCompatButton2, cardView2, myTextView3, appCompatButton3, linearLayout3, myTextView4, appCompatTextView3, myTextView5, textView4);
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

    public static op5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static op5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.screen_7_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
