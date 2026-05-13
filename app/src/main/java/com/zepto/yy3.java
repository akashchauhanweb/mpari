package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yy3 {
    public final CoordinatorLayout a;
    public final TextView b;
    public final TextView c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;

    public yy3(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = textView2;
        this.d = linearLayout;
        this.e = linearLayout2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
        this.i = textView6;
    }

    public static yy3 a(View view) {
        int i = R.id.btn_sign_in;
        TextView textView = (TextView) zp7.a(view, R.id.btn_sign_in);
        if (textView != null) {
            i = R.id.create_account;
            TextView textView2 = (TextView) zp7.a(view, R.id.create_account);
            if (textView2 != null) {
                i = R.id.sign_in;
                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.sign_in);
                if (linearLayout != null) {
                    i = R.id.sign_up;
                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.sign_up);
                    if (linearLayout2 != null) {
                        i = R.id.tv_disc;
                        TextView textView3 = (TextView) zp7.a(view, R.id.tv_disc);
                        if (textView3 != null) {
                            i = R.id.tv_new_mpariv;
                            TextView textView4 = (TextView) zp7.a(view, R.id.tv_new_mpariv);
                            if (textView4 != null) {
                                i = R.id.tv_sign_in;
                                TextView textView5 = (TextView) zp7.a(view, R.id.tv_sign_in);
                                if (textView5 != null) {
                                    i = R.id.tv_your_account;
                                    TextView textView6 = (TextView) zp7.a(view, R.id.tv_your_account);
                                    if (textView6 != null) {
                                        return new yy3((CoordinatorLayout) view, textView, textView2, linearLayout, linearLayout2, textView3, textView4, textView5, textView6);
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

    public static yy3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static yy3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.mvvm_sign_option, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
