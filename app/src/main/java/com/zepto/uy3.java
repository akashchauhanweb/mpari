package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class uy3 {
    public final LinearLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final EditText e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final TextView i;
    public final ImageView j;
    public final LinearLayout k;
    public final MyTextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;

    public uy3(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, EditText editText, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, ImageView imageView2, LinearLayout linearLayout5, MyTextView myTextView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = editText;
        this.f = linearLayout2;
        this.g = linearLayout3;
        this.h = linearLayout4;
        this.i = textView3;
        this.j = imageView2;
        this.k = linearLayout5;
        this.l = myTextView;
        this.m = textView4;
        this.n = textView5;
        this.o = textView6;
        this.p = textView7;
        this.q = textView8;
        this.r = textView9;
        this.s = textView10;
        this.t = textView11;
    }

    public static uy3 a(View view) {
        int i = R.id.backButton;
        ImageView imageView = (ImageView) zp7.a(view, R.id.backButton);
        if (imageView != null) {
            i = R.id.default_otp;
            TextView textView = (TextView) zp7.a(view, R.id.default_otp);
            if (textView != null) {
                i = R.id.disPlay;
                TextView textView2 = (TextView) zp7.a(view, R.id.disPlay);
                if (textView2 != null) {
                    i = R.id.enterOtp;
                    EditText editText = (EditText) zp7.a(view, R.id.enterOtp);
                    if (editText != null) {
                        i = R.id.linera_otp;
                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.linera_otp);
                        if (linearLayout != null) {
                            i = R.id.nexgenarrow;
                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                            if (linearLayout2 != null) {
                                i = R.id.nexgenlogo;
                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                if (linearLayout3 != null) {
                                    i = R.id.resendOtp;
                                    TextView textView3 = (TextView) zp7.a(view, R.id.resendOtp);
                                    if (textView3 != null) {
                                        i = R.id.showmpin;
                                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.showmpin);
                                        if (imageView2 != null) {
                                            i = R.id.submit;
                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.submit);
                                            if (linearLayout4 != null) {
                                                i = R.id.time_text;
                                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.time_text);
                                                if (myTextView != null) {
                                                    i = R.id.tv_forgot;
                                                    TextView textView4 = (TextView) zp7.a(view, R.id.tv_forgot);
                                                    if (textView4 != null) {
                                                        i = R.id.tv_get_otp;
                                                        TextView textView5 = (TextView) zp7.a(view, R.id.tv_get_otp);
                                                        if (textView5 != null) {
                                                            i = R.id.tv_refresh_close;
                                                            TextView textView6 = (TextView) zp7.a(view, R.id.tv_refresh_close);
                                                            if (textView6 != null) {
                                                                i = R.id.tv_security_mpin;
                                                                TextView textView7 = (TextView) zp7.a(view, R.id.tv_security_mpin);
                                                                if (textView7 != null) {
                                                                    i = R.id.tv_send_otp;
                                                                    TextView textView8 = (TextView) zp7.a(view, R.id.tv_send_otp);
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
                                                                                    return new uy3((LinearLayout) view, imageView, textView, textView2, editText, linearLayout, linearLayout2, linearLayout3, textView3, imageView2, linearLayout4, myTextView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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

    public static uy3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static uy3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.mvvm_forget_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
