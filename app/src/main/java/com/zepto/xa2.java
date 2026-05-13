package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class xa2 {
    public final LinearLayout a;
    public final TextView b;
    public final RelativeLayout c;
    public final RecyclerView d;
    public final ImageView e;
    public final LinearLayout f;
    public final TextView g;
    public final TextView h;
    public final vy3 i;
    public final ProgressBar j;
    public final ProgressBar k;

    public xa2(LinearLayout linearLayout, TextView textView, RelativeLayout relativeLayout, RecyclerView recyclerView, ImageView imageView, LinearLayout linearLayout2, TextView textView2, TextView textView3, vy3 vy3Var, ProgressBar progressBar, ProgressBar progressBar2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = relativeLayout;
        this.d = recyclerView;
        this.e = imageView;
        this.f = linearLayout2;
        this.g = textView2;
        this.h = textView3;
        this.i = vy3Var;
        this.j = progressBar;
        this.k = progressBar2;
    }

    public static xa2 a(View view) {
        int i = R.id.my_transations;
        TextView textView = (TextView) zp7.a(view, R.id.my_transations);
        if (textView != null) {
            i = R.id.rl_notransaction;
            RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.rl_notransaction);
            if (relativeLayout != null) {
                i = R.id.rv_vahan_trans;
                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rv_vahan_trans);
                if (recyclerView != null) {
                    i = R.id.status_image;
                    ImageView imageView = (ImageView) zp7.a(view, R.id.status_image);
                    if (imageView != null) {
                        i = R.id.status_linear;
                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.status_linear);
                        if (linearLayout != null) {
                            i = R.id.status_txt;
                            TextView textView2 = (TextView) zp7.a(view, R.id.status_txt);
                            if (textView2 != null) {
                                i = R.id.status_txt2;
                                TextView textView3 = (TextView) zp7.a(view, R.id.status_txt2);
                                if (textView3 != null) {
                                    i = R.id.topHeader;
                                    View viewA = zp7.a(view, R.id.topHeader);
                                    if (viewA != null) {
                                        vy3 vy3VarA = vy3.a(viewA);
                                        i = R.id.tran_progress;
                                        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.tran_progress);
                                        if (progressBar != null) {
                                            i = R.id.trans_bar;
                                            ProgressBar progressBar2 = (ProgressBar) zp7.a(view, R.id.trans_bar);
                                            if (progressBar2 != null) {
                                                return new xa2((LinearLayout) view, textView, relativeLayout, recyclerView, imageView, linearLayout, textView2, textView3, vy3VarA, progressBar, progressBar2);
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

    public static xa2 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static xa2 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fetch_vahan_transactions, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
