package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pd {
    public final RelativeLayout a;
    public final MyTextView b;
    public final TextView c;
    public final AppCompatButton d;
    public final CheckBox e;
    public final ImageView f;
    public final LinearLayout g;
    public final vy3 h;
    public final AppCompatEditText i;
    public final AppCompatButton j;
    public final CardView k;
    public final com.nic.mparivahan.dlservices.widget.MyTextView l;
    public final LinearLayout m;
    public final TextView n;
    public final com.nic.mparivahan.dlservices.widget.MyTextView o;
    public final com.nic.mparivahan.dlservices.widget.MyTextView p;
    public final com.nic.mparivahan.dlservices.widget.MyTextView q;

    public pd(RelativeLayout relativeLayout, MyTextView myTextView, TextView textView, AppCompatButton appCompatButton, CheckBox checkBox, ImageView imageView, LinearLayout linearLayout, vy3 vy3Var, AppCompatEditText appCompatEditText, AppCompatButton appCompatButton2, CardView cardView, com.nic.mparivahan.dlservices.widget.MyTextView myTextView2, LinearLayout linearLayout2, TextView textView2, com.nic.mparivahan.dlservices.widget.MyTextView myTextView3, com.nic.mparivahan.dlservices.widget.MyTextView myTextView4, com.nic.mparivahan.dlservices.widget.MyTextView myTextView5) {
        this.a = relativeLayout;
        this.b = myTextView;
        this.c = textView;
        this.d = appCompatButton;
        this.e = checkBox;
        this.f = imageView;
        this.g = linearLayout;
        this.h = vy3Var;
        this.i = appCompatEditText;
        this.j = appCompatButton2;
        this.k = cardView;
        this.l = myTextView2;
        this.m = linearLayout2;
        this.n = textView2;
        this.o = myTextView3;
        this.p = myTextView4;
        this.q = myTextView5;
    }

    public static pd a(View view) {
        int i = R.id.agreeTermCond;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.agreeTermCond);
        if (myTextView != null) {
            i = R.id.dl_number;
            TextView textView = (TextView) zp7.a(view, R.id.dl_number);
            if (textView != null) {
                i = R.id.generate_otp;
                AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.generate_otp);
                if (appCompatButton != null) {
                    i = R.id.i_have_terms;
                    CheckBox checkBox = (CheckBox) zp7.a(view, R.id.i_have_terms);
                    if (checkBox != null) {
                        i = R.id.iv_image;
                        ImageView imageView = (ImageView) zp7.a(view, R.id.iv_image);
                        if (imageView != null) {
                            i = R.id.linear_mob;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.linear_mob);
                            if (linearLayout != null) {
                                i = R.id.mHeader;
                                View viewA = zp7.a(view, R.id.mHeader);
                                if (viewA != null) {
                                    vy3 vy3VarA = vy3.a(viewA);
                                    i = R.id.mob_number;
                                    AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.mob_number);
                                    if (appCompatEditText != null) {
                                        i = R.id.reset_button;
                                        AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.reset_button);
                                        if (appCompatButton2 != null) {
                                            i = R.id.round_card_view;
                                            CardView cardView = (CardView) zp7.a(view, R.id.round_card_view);
                                            if (cardView != null) {
                                                i = R.id.select_service;
                                                com.nic.mparivahan.dlservices.widget.MyTextView myTextView2 = (com.nic.mparivahan.dlservices.widget.MyTextView) zp7.a(view, R.id.select_service);
                                                if (myTextView2 != null) {
                                                    i = R.id.termCndLl;
                                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.termCndLl);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.tv_cl_Details;
                                                        TextView textView2 = (TextView) zp7.a(view, R.id.tv_cl_Details);
                                                        if (textView2 != null) {
                                                            i = R.id.tv_dl_no;
                                                            com.nic.mparivahan.dlservices.widget.MyTextView myTextView3 = (com.nic.mparivahan.dlservices.widget.MyTextView) zp7.a(view, R.id.tv_dl_no);
                                                            if (myTextView3 != null) {
                                                                i = R.id.txt_mob_number;
                                                                com.nic.mparivahan.dlservices.widget.MyTextView myTextView4 = (com.nic.mparivahan.dlservices.widget.MyTextView) zp7.a(view, R.id.txt_mob_number);
                                                                if (myTextView4 != null) {
                                                                    i = R.id.update_mob;
                                                                    com.nic.mparivahan.dlservices.widget.MyTextView myTextView5 = (com.nic.mparivahan.dlservices.widget.MyTextView) zp7.a(view, R.id.update_mob);
                                                                    if (myTextView5 != null) {
                                                                        return new pd((RelativeLayout) view, myTextView, textView, appCompatButton, checkBox, imageView, linearLayout, vy3VarA, appCompatEditText, appCompatButton2, cardView, myTextView2, linearLayout2, textView2, myTextView3, myTextView4, myTextView5);
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

    public static pd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static pd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_mobile_otp_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
