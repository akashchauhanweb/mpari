package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class xy3 {
    public final CoordinatorLayout a;
    public final LinearLayout b;
    public final ImageView c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final TextView g;
    public final LinearLayout h;
    public final EditText i;
    public final EditText j;
    public final LinearLayout k;
    public final LinearLayout l;
    public final ImageView m;
    public final LinearLayout n;
    public final TextView o;
    public final LinearLayout p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;

    public xy3(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, ImageView imageView, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, LinearLayout linearLayout2, EditText editText, EditText editText2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView2, LinearLayout linearLayout5, TextView textView4, LinearLayout linearLayout6, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.a = coordinatorLayout;
        this.b = linearLayout;
        this.c = imageView;
        this.d = textView;
        this.e = frameLayout;
        this.f = textView2;
        this.g = textView3;
        this.h = linearLayout2;
        this.i = editText;
        this.j = editText2;
        this.k = linearLayout3;
        this.l = linearLayout4;
        this.m = imageView2;
        this.n = linearLayout5;
        this.o = textView4;
        this.p = linearLayout6;
        this.q = textView5;
        this.r = textView6;
        this.s = textView7;
        this.t = textView8;
        this.u = textView9;
        this.v = textView10;
        this.w = textView11;
    }

    public static xy3 a(View view) {
        int i = R.id.another_layout;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.another_layout);
        if (linearLayout != null) {
            i = R.id.backButton;
            ImageView imageView = (ImageView) zp7.a(view, R.id.backButton);
            if (imageView != null) {
                i = R.id.change_account;
                TextView textView = (TextView) zp7.a(view, R.id.change_account);
                if (textView != null) {
                    i = R.id.entermpin_layout;
                    FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.entermpin_layout);
                    if (frameLayout != null) {
                        i = R.id.forgotmpin;
                        TextView textView2 = (TextView) zp7.a(view, R.id.forgotmpin);
                        if (textView2 != null) {
                            i = R.id.login_with_face;
                            TextView textView3 = (TextView) zp7.a(view, R.id.login_with_face);
                            if (textView3 != null) {
                                i = R.id.login_with_face_linear;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.login_with_face_linear);
                                if (linearLayout2 != null) {
                                    i = R.id.mobile_number;
                                    EditText editText = (EditText) zp7.a(view, R.id.mobile_number);
                                    if (editText != null) {
                                        i = R.id.mpinEditText;
                                        EditText editText2 = (EditText) zp7.a(view, R.id.mpinEditText);
                                        if (editText2 != null) {
                                            i = R.id.nexgenarrow;
                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                            if (linearLayout3 != null) {
                                                i = R.id.nexgenlogo;
                                                LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                                if (linearLayout4 != null) {
                                                    i = R.id.showmpin;
                                                    ImageView imageView2 = (ImageView) zp7.a(view, R.id.showmpin);
                                                    if (imageView2 != null) {
                                                        i = R.id.signInWithOtp;
                                                        LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.signInWithOtp);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.sign_up_text;
                                                            TextView textView4 = (TextView) zp7.a(view, R.id.sign_up_text);
                                                            if (textView4 != null) {
                                                                i = R.id.signWithMpin;
                                                                LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.signWithMpin);
                                                                if (linearLayout6 != null) {
                                                                    i = R.id.tv_dont_account;
                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.tv_dont_account);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tv_sign_in_mpin;
                                                                        TextView textView6 = (TextView) zp7.a(view, R.id.tv_sign_in_mpin);
                                                                        if (textView6 != null) {
                                                                            i = R.id.tv_sign_in_otp;
                                                                            TextView textView7 = (TextView) zp7.a(view, R.id.tv_sign_in_otp);
                                                                            if (textView7 != null) {
                                                                                i = R.id.tv_sign_into;
                                                                                TextView textView8 = (TextView) zp7.a(view, R.id.tv_sign_into);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.tv_your_account;
                                                                                    TextView textView9 = (TextView) zp7.a(view, R.id.tv_your_account);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.txt_conti;
                                                                                        TextView textView10 = (TextView) zp7.a(view, R.id.txt_conti);
                                                                                        if (textView10 != null) {
                                                                                            i = R.id.user_name;
                                                                                            TextView textView11 = (TextView) zp7.a(view, R.id.user_name);
                                                                                            if (textView11 != null) {
                                                                                                return new xy3((CoordinatorLayout) view, linearLayout, imageView, textView, frameLayout, textView2, textView3, linearLayout2, editText, editText2, linearLayout3, linearLayout4, imageView2, linearLayout5, textView4, linearLayout6, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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

    public static xy3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static xy3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.mvvm_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
