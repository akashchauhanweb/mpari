package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oh {
    public final CoordinatorLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final EditText f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final TextView i;
    public final ImageView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final LinearLayout r;

    public oh(CoordinatorLayout coordinatorLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, EditText editText, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LinearLayout linearLayout3) {
        this.a = coordinatorLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = editText;
        this.g = linearLayout;
        this.h = linearLayout2;
        this.i = textView4;
        this.j = imageView2;
        this.k = textView5;
        this.l = textView6;
        this.m = textView7;
        this.n = textView8;
        this.o = textView9;
        this.p = textView10;
        this.q = textView11;
        this.r = linearLayout3;
    }

    public static oh a(View view) {
        int i = R.id.backButton;
        ImageView imageView = (ImageView) zp7.a(view, R.id.backButton);
        if (imageView != null) {
            i = R.id.btn_verify;
            TextView textView = (TextView) zp7.a(view, R.id.btn_verify);
            if (textView != null) {
                i = R.id.default_otp;
                TextView textView2 = (TextView) zp7.a(view, R.id.default_otp);
                if (textView2 != null) {
                    i = R.id.disPlay;
                    TextView textView3 = (TextView) zp7.a(view, R.id.disPlay);
                    if (textView3 != null) {
                        i = R.id.enterOtp;
                        EditText editText = (EditText) zp7.a(view, R.id.enterOtp);
                        if (editText != null) {
                            i = R.id.nexgenarrow;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                            if (linearLayout != null) {
                                i = R.id.nexgenlogo;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                if (linearLayout2 != null) {
                                    i = R.id.resendOtp;
                                    TextView textView4 = (TextView) zp7.a(view, R.id.resendOtp);
                                    if (textView4 != null) {
                                        i = R.id.showmpin;
                                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.showmpin);
                                        if (imageView2 != null) {
                                            i = R.id.tv_get_otp;
                                            TextView textView5 = (TextView) zp7.a(view, R.id.tv_get_otp);
                                            if (textView5 != null) {
                                                i = R.id.tv_mobile_no;
                                                TextView textView6 = (TextView) zp7.a(view, R.id.tv_mobile_no);
                                                if (textView6 != null) {
                                                    i = R.id.tv_refresh_close;
                                                    TextView textView7 = (TextView) zp7.a(view, R.id.tv_refresh_close);
                                                    if (textView7 != null) {
                                                        i = R.id.tv__send_otp;
                                                        TextView textView8 = (TextView) zp7.a(view, R.id.tv__send_otp);
                                                        if (textView8 != null) {
                                                            i = R.id.tv_verify;
                                                            TextView textView9 = (TextView) zp7.a(view, R.id.tv_verify);
                                                            if (textView9 != null) {
                                                                i = R.id.tv_verify_otp;
                                                                TextView textView10 = (TextView) zp7.a(view, R.id.tv_verify_otp);
                                                                if (textView10 != null) {
                                                                    i = R.id.tv_wait_otp;
                                                                    TextView textView11 = (TextView) zp7.a(view, R.id.tv_wait_otp);
                                                                    if (textView11 != null) {
                                                                        i = R.id.verify_user;
                                                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.verify_user);
                                                                        if (linearLayout3 != null) {
                                                                            return new oh((CoordinatorLayout) view, imageView, textView, textView2, textView3, editText, linearLayout, linearLayout2, textView4, imageView2, textView5, textView6, textView7, textView8, textView9, textView10, textView11, linearLayout3);
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

    public static oh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static oh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_verify_mobile_number_user_register, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
