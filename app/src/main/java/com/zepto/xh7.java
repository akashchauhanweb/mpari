package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class xh7 {
    public final RelativeLayout a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final LinearLayout e;
    public final TextView f;
    public final d47 g;

    public xh7(RelativeLayout relativeLayout, TextView textView, TextView textView2, ImageView imageView, LinearLayout linearLayout, TextView textView3, d47 d47Var) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
        this.e = linearLayout;
        this.f = textView3;
        this.g = d47Var;
    }

    public static xh7 a(View view) {
        int i = R.id.apptNoTv;
        TextView textView = (TextView) zp7.a(view, R.id.apptNoTv);
        if (textView != null) {
            i = R.id.homeTv;
            TextView textView2 = (TextView) zp7.a(view, R.id.homeTv);
            if (textView2 != null) {
                i = R.id.imageView6;
                ImageView imageView = (ImageView) zp7.a(view, R.id.imageView6);
                if (imageView != null) {
                    i = R.id.lin_layour;
                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.lin_layour);
                    if (linearLayout != null) {
                        i = R.id.reprint_recipt;
                        TextView textView3 = (TextView) zp7.a(view, R.id.reprint_recipt);
                        if (textView3 != null) {
                            i = R.id.topHolder;
                            View viewA = zp7.a(view, R.id.topHolder);
                            if (viewA != null) {
                                return new xh7((RelativeLayout) view, textView, textView2, imageView, linearLayout, textView3, d47.a(viewA));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static xh7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static xh7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_slot_success_booked, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
