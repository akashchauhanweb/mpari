package com.zepto;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class iy3 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final ImageView d;
    public final LinearLayout e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;

    public iy3(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, LinearLayout linearLayout4, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearLayout3;
        this.d = imageView;
        this.e = linearLayout4;
        this.f = imageView2;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
    }

    public static iy3 a(View view) {
        int i = R.id.ll_home;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.ll_home);
        if (linearLayout != null) {
            i = R.id.ll_homee;
            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.ll_homee);
            if (linearLayout2 != null) {
                i = R.id.mvvm_back;
                ImageView imageView = (ImageView) zp7.a(view, R.id.mvvm_back);
                if (imageView != null) {
                    LinearLayout linearLayout3 = (LinearLayout) view;
                    i = R.id.plus_icons;
                    ImageView imageView2 = (ImageView) zp7.a(view, R.id.plus_icons);
                    if (imageView2 != null) {
                        i = R.id.service_label;
                        TextView textView = (TextView) zp7.a(view, R.id.service_label);
                        if (textView != null) {
                            i = R.id.service_label_dl;
                            TextView textView2 = (TextView) zp7.a(view, R.id.service_label_dl);
                            if (textView2 != null) {
                                i = R.id.service_label_two;
                                TextView textView3 = (TextView) zp7.a(view, R.id.service_label_two);
                                if (textView3 != null) {
                                    return new iy3(linearLayout3, linearLayout, linearLayout2, imageView, linearLayout3, imageView2, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
