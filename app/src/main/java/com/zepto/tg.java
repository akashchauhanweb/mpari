package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tg {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final vy3 d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final RecyclerView k;
    public final TextView l;
    public final ProgressBar m;
    public final TextView n;

    public tg(LinearLayout linearLayout, TextView textView, TextView textView2, vy3 vy3Var, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, RecyclerView recyclerView, TextView textView6, ProgressBar progressBar, TextView textView7) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = vy3Var;
        this.e = linearLayout2;
        this.f = linearLayout3;
        this.g = linearLayout4;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.k = recyclerView;
        this.l = textView6;
        this.m = progressBar;
        this.n = textView7;
    }

    public static tg a(View view) {
        int i = R.id.ev_end_date;
        TextView textView = (TextView) zp7.a(view, R.id.ev_end_date);
        if (textView != null) {
            i = R.id.ev_start_date;
            TextView textView2 = (TextView) zp7.a(view, R.id.ev_start_date);
            if (textView2 != null) {
                i = R.id.header_acc_history;
                View viewA = zp7.a(view, R.id.header_acc_history);
                if (viewA != null) {
                    vy3 vy3VarA = vy3.a(viewA);
                    i = R.id.ll_comp_history;
                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.ll_comp_history);
                    if (linearLayout != null) {
                        i = R.id.ll_dashboard;
                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.ll_dashboard);
                        if (linearLayout2 != null) {
                            i = R.id.ll_reg_complaint;
                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.ll_reg_complaint);
                            if (linearLayout3 != null) {
                                i = R.id.logo_compl_hist;
                                TextView textView3 = (TextView) zp7.a(view, R.id.logo_compl_hist);
                                if (textView3 != null) {
                                    i = R.id.logo_dashboard;
                                    TextView textView4 = (TextView) zp7.a(view, R.id.logo_dashboard);
                                    if (textView4 != null) {
                                        i = R.id.logo_reg_compln;
                                        TextView textView5 = (TextView) zp7.a(view, R.id.logo_reg_compln);
                                        if (textView5 != null) {
                                            i = R.id.lv_complaint_list;
                                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.lv_complaint_list);
                                            if (recyclerView != null) {
                                                i = R.id.title_compn_hist;
                                                TextView textView6 = (TextView) zp7.a(view, R.id.title_compn_hist);
                                                if (textView6 != null) {
                                                    i = R.id.traffic_his_progress;
                                                    ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.traffic_his_progress);
                                                    if (progressBar != null) {
                                                        i = R.id.txt_view_details;
                                                        TextView textView7 = (TextView) zp7.a(view, R.id.txt_view_details);
                                                        if (textView7 != null) {
                                                            return new tg((LinearLayout) view, textView, textView2, vy3VarA, linearLayout, linearLayout2, linearLayout3, textView3, textView4, textView5, recyclerView, textView6, progressBar, textView7);
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

    public static tg c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static tg d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_traffic_homehistory, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
