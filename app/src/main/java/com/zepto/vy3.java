package com.zepto;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class vy3 {
    public final LinearLayout a;
    public final ImageView b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final ImageView e;
    public final CardView f;
    public final TextView g;

    public vy3(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView2, CardView cardView, TextView textView) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = linearLayout2;
        this.d = linearLayout3;
        this.e = imageView2;
        this.f = cardView;
        this.g = textView;
    }

    public static vy3 a(View view) {
        int i = R.id.iv_report_traffic_violation_icon;
        ImageView imageView = (ImageView) zp7.a(view, R.id.iv_report_traffic_violation_icon);
        if (imageView != null) {
            i = R.id.ll_home;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.ll_home);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i = R.id.mvvm_Back;
                ImageView imageView2 = (ImageView) zp7.a(view, R.id.mvvm_Back);
                if (imageView2 != null) {
                    i = R.id.round_card_view;
                    CardView cardView = (CardView) zp7.a(view, R.id.round_card_view);
                    if (cardView != null) {
                        i = R.id.service_label;
                        TextView textView = (TextView) zp7.a(view, R.id.service_label);
                        if (textView != null) {
                            return new vy3(linearLayout2, imageView, linearLayout, linearLayout2, imageView2, cardView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
