package com.zepto;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ri5 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final RelativeLayout d;
    public final AppCompatImageView e;
    public final TextView f;

    public ri5(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView3, TextView textView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = relativeLayout;
        this.e = appCompatImageView3;
        this.f = textView;
    }

    public static ri5 a(View view) {
        int i = R.id.back_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) zp7.a(view, R.id.back_icon);
        if (appCompatImageView != null) {
            i = R.id.launcherIv;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) zp7.a(view, R.id.launcherIv);
            if (appCompatImageView2 != null) {
                i = R.id.nexGenHolder;
                RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.nexGenHolder);
                if (relativeLayout != null) {
                    i = R.id.notificationIv;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) zp7.a(view, R.id.notificationIv);
                    if (appCompatImageView3 != null) {
                        i = R.id.service_label;
                        TextView textView = (TextView) zp7.a(view, R.id.service_label);
                        if (textView != null) {
                            return new ri5((ConstraintLayout) view, appCompatImageView, appCompatImageView2, relativeLayout, appCompatImageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
