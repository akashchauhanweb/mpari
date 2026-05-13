package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class uh {
    public final LinearLayout a;
    public final RecyclerView b;
    public final TextView c;
    public final vy3 d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final ImageView m;

    public uh(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, vy3 vy3Var, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ImageView imageView2) {
        this.a = linearLayout;
        this.b = recyclerView;
        this.c = textView;
        this.d = vy3Var;
        this.e = imageView;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
        this.i = textView5;
        this.j = textView6;
        this.k = textView7;
        this.l = textView8;
        this.m = imageView2;
    }

    public static uh a(View view) {
        int i = R.id.acc_feedback;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.acc_feedback);
        if (recyclerView != null) {
            i = R.id.b_ok_button;
            TextView textView = (TextView) zp7.a(view, R.id.b_ok_button);
            if (textView != null) {
                i = R.id.header_details;
                View viewA = zp7.a(view, R.id.header_details);
                if (viewA != null) {
                    vy3 vy3VarA = vy3.a(viewA);
                    i = R.id.imageView;
                    ImageView imageView = (ImageView) zp7.a(view, R.id.imageView);
                    if (imageView != null) {
                        i = R.id.tv_location;
                        TextView textView2 = (TextView) zp7.a(view, R.id.tv_location);
                        if (textView2 != null) {
                            i = R.id.tv_status;
                            TextView textView3 = (TextView) zp7.a(view, R.id.tv_status);
                            if (textView3 != null) {
                                i = R.id.tv_vehicle_no;
                                TextView textView4 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                if (textView4 != null) {
                                    i = R.id.txt_id;
                                    TextView textView5 = (TextView) zp7.a(view, R.id.txt_id);
                                    if (textView5 != null) {
                                        i = R.id.txt_location;
                                        TextView textView6 = (TextView) zp7.a(view, R.id.txt_location);
                                        if (textView6 != null) {
                                            i = R.id.txt_status;
                                            TextView textView7 = (TextView) zp7.a(view, R.id.txt_status);
                                            if (textView7 != null) {
                                                i = R.id.txt_vehicle_number;
                                                TextView textView8 = (TextView) zp7.a(view, R.id.txt_vehicle_number);
                                                if (textView8 != null) {
                                                    i = R.id.videoView;
                                                    ImageView imageView2 = (ImageView) zp7.a(view, R.id.videoView);
                                                    if (imageView2 != null) {
                                                        return new uh((LinearLayout) view, recyclerView, textView, vy3VarA, imageView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, imageView2);
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

    public static uh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static uh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_view_accident_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
