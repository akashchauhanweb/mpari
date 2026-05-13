package com.zepto;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d47 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final AppCompatImageView c;
    public final LinearLayout d;
    public final TextView e;
    public final AppCompatImageView f;
    public final RelativeLayout g;
    public final AppCompatImageView h;
    public final TextView i;

    public d47(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, LinearLayout linearLayout3, TextView textView, AppCompatImageView appCompatImageView2, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView3, TextView textView2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = appCompatImageView;
        this.d = linearLayout3;
        this.e = textView;
        this.f = appCompatImageView2;
        this.g = relativeLayout;
        this.h = appCompatImageView3;
        this.i = textView2;
    }

    public static d47 a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.launcherIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) zp7.a(view, R.id.launcherIv);
        if (appCompatImageView != null) {
            i = R.id.mainLayout;
            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.mainLayout);
            if (linearLayout2 != null) {
                i = R.id.multi_service_label;
                TextView textView = (TextView) zp7.a(view, R.id.multi_service_label);
                if (textView != null) {
                    i = R.id.mvvm_back;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) zp7.a(view, R.id.mvvm_back);
                    if (appCompatImageView2 != null) {
                        i = R.id.nexGenHolder;
                        RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.nexGenHolder);
                        if (relativeLayout != null) {
                            i = R.id.notificationIv;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) zp7.a(view, R.id.notificationIv);
                            if (appCompatImageView3 != null) {
                                i = R.id.vahan_service_lable;
                                TextView textView2 = (TextView) zp7.a(view, R.id.vahan_service_lable);
                                if (textView2 != null) {
                                    return new d47(linearLayout, linearLayout, appCompatImageView, linearLayout2, textView, appCompatImageView2, relativeLayout, appCompatImageView3, textView2);
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
