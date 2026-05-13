package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class q8 {
    public final LinearLayout a;
    public final ConstraintLayout b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final LinearLayout f;
    public final TextView g;
    public final LinearLayout h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final ConstraintLayout m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final vy3 q;

    public q8(LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ConstraintLayout constraintLayout2, TextView textView7, TextView textView8, TextView textView9, vy3 vy3Var) {
        this.a = linearLayout;
        this.b = constraintLayout;
        this.c = textView;
        this.d = imageView;
        this.e = imageView2;
        this.f = linearLayout2;
        this.g = textView2;
        this.h = linearLayout3;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
        this.l = textView6;
        this.m = constraintLayout2;
        this.n = textView7;
        this.o = textView8;
        this.p = textView9;
        this.q = vy3Var;
    }

    public static q8 a(View view) {
        int i = R.id.challan_help;
        ConstraintLayout constraintLayout = (ConstraintLayout) zp7.a(view, R.id.challan_help);
        if (constraintLayout != null) {
            i = R.id.helpSupport;
            TextView textView = (TextView) zp7.a(view, R.id.helpSupport);
            if (textView != null) {
                i = R.id.imageView7;
                ImageView imageView = (ImageView) zp7.a(view, R.id.imageView7);
                if (imageView != null) {
                    i = R.id.imageView8;
                    ImageView imageView2 = (ImageView) zp7.a(view, R.id.imageView8);
                    if (imageView2 != null) {
                        i = R.id.layout_timing;
                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.layout_timing);
                        if (linearLayout != null) {
                            i = R.id.phone_number_text;
                            TextView textView2 = (TextView) zp7.a(view, R.id.phone_number_text);
                            if (textView2 != null) {
                                i = R.id.raise_complaint_ll;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.raise_complaint_ll);
                                if (linearLayout2 != null) {
                                    i = R.id.text;
                                    TextView textView3 = (TextView) zp7.a(view, R.id.text);
                                    if (textView3 != null) {
                                        i = R.id.text1;
                                        TextView textView4 = (TextView) zp7.a(view, R.id.text1);
                                        if (textView4 != null) {
                                            i = R.id.text_desc;
                                            TextView textView5 = (TextView) zp7.a(view, R.id.text_desc);
                                            if (textView5 != null) {
                                                i = R.id.text_email;
                                                TextView textView6 = (TextView) zp7.a(view, R.id.text_email);
                                                if (textView6 != null) {
                                                    i = R.id.text_number;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) zp7.a(view, R.id.text_number);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.text_raise;
                                                        TextView textView7 = (TextView) zp7.a(view, R.id.text_raise);
                                                        if (textView7 != null) {
                                                            i = R.id.text_time;
                                                            TextView textView8 = (TextView) zp7.a(view, R.id.text_time);
                                                            if (textView8 != null) {
                                                                i = R.id.textView4;
                                                                TextView textView9 = (TextView) zp7.a(view, R.id.textView4);
                                                                if (textView9 != null) {
                                                                    i = R.id.topheader;
                                                                    View viewA = zp7.a(view, R.id.topheader);
                                                                    if (viewA != null) {
                                                                        return new q8((LinearLayout) view, constraintLayout, textView, imageView, imageView2, linearLayout, textView2, linearLayout2, textView3, textView4, textView5, textView6, constraintLayout2, textView7, textView8, textView9, vy3.a(viewA));
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

    public static q8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static q8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_contact_us, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
