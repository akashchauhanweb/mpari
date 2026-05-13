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
public final class uz5 {
    public final LinearLayout a;
    public final RelativeLayout b;
    public final ImageView c;
    public final RelativeLayout d;
    public final ImageView e;
    public final ImageView f;
    public final TextView g;
    public final ImageView h;
    public final RelativeLayout i;
    public final ImageView j;
    public final TextView k;
    public final ImageView l;
    public final d47 m;
    public final TextView n;
    public final TextView o;

    public uz5(LinearLayout linearLayout, RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, ImageView imageView2, ImageView imageView3, TextView textView, ImageView imageView4, RelativeLayout relativeLayout3, ImageView imageView5, TextView textView2, ImageView imageView6, d47 d47Var, TextView textView3, TextView textView4) {
        this.a = linearLayout;
        this.b = relativeLayout;
        this.c = imageView;
        this.d = relativeLayout2;
        this.e = imageView2;
        this.f = imageView3;
        this.g = textView;
        this.h = imageView4;
        this.i = relativeLayout3;
        this.j = imageView5;
        this.k = textView2;
        this.l = imageView6;
        this.m = d47Var;
        this.n = textView3;
        this.o = textView4;
    }

    public static uz5 a(View view) {
        int i = R.id.changeLangRl;
        RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.changeLangRl);
        if (relativeLayout != null) {
            i = R.id.changeMpinImg;
            ImageView imageView = (ImageView) zp7.a(view, R.id.changeMpinImg);
            if (imageView != null) {
                i = R.id.changeMpinRl;
                RelativeLayout relativeLayout2 = (RelativeLayout) zp7.a(view, R.id.changeMpinRl);
                if (relativeLayout2 != null) {
                    i = R.id.changeMpinViewImg;
                    ImageView imageView2 = (ImageView) zp7.a(view, R.id.changeMpinViewImg);
                    if (imageView2 != null) {
                        i = R.id.chooseLangImg;
                        ImageView imageView3 = (ImageView) zp7.a(view, R.id.chooseLangImg);
                        if (imageView3 != null) {
                            i = R.id.chooseLangTv;
                            TextView textView = (TextView) zp7.a(view, R.id.chooseLangTv);
                            if (textView != null) {
                                i = R.id.chooseLangViewIv;
                                ImageView imageView4 = (ImageView) zp7.a(view, R.id.chooseLangViewIv);
                                if (imageView4 != null) {
                                    i = R.id.deleteAccRl;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) zp7.a(view, R.id.deleteAccRl);
                                    if (relativeLayout3 != null) {
                                        i = R.id.deleteAcctImg;
                                        ImageView imageView5 = (ImageView) zp7.a(view, R.id.deleteAcctImg);
                                        if (imageView5 != null) {
                                            i = R.id.deleteAcctTv;
                                            TextView textView2 = (TextView) zp7.a(view, R.id.deleteAcctTv);
                                            if (textView2 != null) {
                                                i = R.id.deleteAcctViewImg;
                                                ImageView imageView6 = (ImageView) zp7.a(view, R.id.deleteAcctViewImg);
                                                if (imageView6 != null) {
                                                    i = R.id.topHolder;
                                                    View viewA = zp7.a(view, R.id.topHolder);
                                                    if (viewA != null) {
                                                        d47 d47VarA = d47.a(viewA);
                                                        i = R.id.txtSettings;
                                                        TextView textView3 = (TextView) zp7.a(view, R.id.txtSettings);
                                                        if (textView3 != null) {
                                                            i = R.id.virtualRcTv;
                                                            TextView textView4 = (TextView) zp7.a(view, R.id.virtualRcTv);
                                                            if (textView4 != null) {
                                                                return new uz5((LinearLayout) view, relativeLayout, imageView, relativeLayout2, imageView2, imageView3, textView, imageView4, relativeLayout3, imageView5, textView2, imageView6, d47VarA, textView3, textView4);
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

    public static uz5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static uz5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.setting_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
