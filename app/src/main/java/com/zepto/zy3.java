package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zy3 {
    public final CoordinatorLayout a;
    public final ImageView b;
    public final EditText c;
    public final ImageView d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public final EditText h;
    public final NestedScrollView i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final Spinner l;
    public final ImageView m;
    public final TextView n;
    public final LinearLayout o;
    public final TextView p;
    public final LinearLayout q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;

    public zy3(CoordinatorLayout coordinatorLayout, ImageView imageView, EditText editText, ImageView imageView2, EditText editText2, EditText editText3, EditText editText4, EditText editText5, NestedScrollView nestedScrollView, LinearLayout linearLayout, LinearLayout linearLayout2, Spinner spinner, ImageView imageView3, TextView textView, LinearLayout linearLayout3, TextView textView2, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.a = coordinatorLayout;
        this.b = imageView;
        this.c = editText;
        this.d = imageView2;
        this.e = editText2;
        this.f = editText3;
        this.g = editText4;
        this.h = editText5;
        this.i = nestedScrollView;
        this.j = linearLayout;
        this.k = linearLayout2;
        this.l = spinner;
        this.m = imageView3;
        this.n = textView;
        this.o = linearLayout3;
        this.p = textView2;
        this.q = linearLayout4;
        this.r = textView3;
        this.s = textView4;
        this.t = textView5;
        this.u = textView6;
    }

    public static zy3 a(View view) {
        int i = R.id.backButton;
        ImageView imageView = (ImageView) zp7.a(view, R.id.backButton);
        if (imageView != null) {
            i = R.id.confirmMpin;
            EditText editText = (EditText) zp7.a(view, R.id.confirmMpin);
            if (editText != null) {
                i = R.id.confirmShowMpin;
                ImageView imageView2 = (ImageView) zp7.a(view, R.id.confirmShowMpin);
                if (imageView2 != null) {
                    i = R.id.email;
                    EditText editText2 = (EditText) zp7.a(view, R.id.email);
                    if (editText2 != null) {
                        i = R.id.full_name;
                        EditText editText3 = (EditText) zp7.a(view, R.id.full_name);
                        if (editText3 != null) {
                            i = R.id.mobile_number;
                            EditText editText4 = (EditText) zp7.a(view, R.id.mobile_number);
                            if (editText4 != null) {
                                i = R.id.mpin;
                                EditText editText5 = (EditText) zp7.a(view, R.id.mpin);
                                if (editText5 != null) {
                                    i = R.id.nestedScrollView;
                                    NestedScrollView nestedScrollView = (NestedScrollView) zp7.a(view, R.id.nestedScrollView);
                                    if (nestedScrollView != null) {
                                        i = R.id.nexgenarrow;
                                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                        if (linearLayout != null) {
                                            i = R.id.nexgenlogo;
                                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                            if (linearLayout2 != null) {
                                                i = R.id.select_spinner;
                                                Spinner spinner = (Spinner) zp7.a(view, R.id.select_spinner);
                                                if (spinner != null) {
                                                    i = R.id.showmpin;
                                                    ImageView imageView3 = (ImageView) zp7.a(view, R.id.showmpin);
                                                    if (imageView3 != null) {
                                                        i = R.id.sign_in;
                                                        TextView textView = (TextView) zp7.a(view, R.id.sign_in);
                                                        if (textView != null) {
                                                            i = R.id.sign_up;
                                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.sign_up);
                                                            if (linearLayout3 != null) {
                                                                i = R.id.signUpTermCond;
                                                                TextView textView2 = (TextView) zp7.a(view, R.id.signUpTermCond);
                                                                if (textView2 != null) {
                                                                    i = R.id.submit;
                                                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.submit);
                                                                    if (linearLayout4 != null) {
                                                                        i = R.id.tv_already_account;
                                                                        TextView textView3 = (TextView) zp7.a(view, R.id.tv_already_account);
                                                                        if (textView3 != null) {
                                                                            i = R.id.tv_create_account;
                                                                            TextView textView4 = (TextView) zp7.a(view, R.id.tv_create_account);
                                                                            if (textView4 != null) {
                                                                                i = R.id.tv_fast_easy;
                                                                                TextView textView5 = (TextView) zp7.a(view, R.id.tv_fast_easy);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.tv_submit;
                                                                                    TextView textView6 = (TextView) zp7.a(view, R.id.tv_submit);
                                                                                    if (textView6 != null) {
                                                                                        return new zy3((CoordinatorLayout) view, imageView, editText, imageView2, editText2, editText3, editText4, editText5, nestedScrollView, linearLayout, linearLayout2, spinner, imageView3, textView, linearLayout3, textView2, linearLayout4, textView3, textView4, textView5, textView6);
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

    public static zy3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static zy3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.mvvm_sign_up, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
