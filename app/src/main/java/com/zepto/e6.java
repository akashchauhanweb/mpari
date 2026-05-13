package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e6 {
    public final LinearLayout a;
    public final ProgressBar b;
    public final MaterialCardView c;
    public final CardView d;
    public final TextView e;
    public final TextView f;
    public final vy3 g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final LinearLayout j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final RecyclerView n;
    public final TextView o;
    public final TextView p;

    public e6(LinearLayout linearLayout, ProgressBar progressBar, MaterialCardView materialCardView, CardView cardView, TextView textView, TextView textView2, vy3 vy3Var, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, RecyclerView recyclerView, TextView textView6, TextView textView7) {
        this.a = linearLayout;
        this.b = progressBar;
        this.c = materialCardView;
        this.d = cardView;
        this.e = textView;
        this.f = textView2;
        this.g = vy3Var;
        this.h = linearLayout2;
        this.i = linearLayout3;
        this.j = linearLayout4;
        this.k = textView3;
        this.l = textView4;
        this.m = textView5;
        this.n = recyclerView;
        this.o = textView6;
        this.p = textView7;
    }

    public static e6 a(View view) {
        int i = R.id.acc_hist_progress;
        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.acc_hist_progress);
        if (progressBar != null) {
            i = R.id.cv_complaint_status;
            MaterialCardView materialCardView = (MaterialCardView) zp7.a(view, R.id.cv_complaint_status);
            if (materialCardView != null) {
                i = R.id.cv_report_complaint;
                CardView cardView = (CardView) zp7.a(view, R.id.cv_report_complaint);
                if (cardView != null) {
                    i = R.id.ev_end_date;
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
                                            i = R.id.logo_dashboard;
                                            TextView textView3 = (TextView) zp7.a(view, R.id.logo_dashboard);
                                            if (textView3 != null) {
                                                i = R.id.logo_reg_acc_repo;
                                                TextView textView4 = (TextView) zp7.a(view, R.id.logo_reg_acc_repo);
                                                if (textView4 != null) {
                                                    i = R.id.logo_repo_acc_hist;
                                                    TextView textView5 = (TextView) zp7.a(view, R.id.logo_repo_acc_hist);
                                                    if (textView5 != null) {
                                                        i = R.id.lv_acc_list;
                                                        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.lv_acc_list);
                                                        if (recyclerView != null) {
                                                            i = R.id.tv_acc_repo_hist;
                                                            TextView textView6 = (TextView) zp7.a(view, R.id.tv_acc_repo_hist);
                                                            if (textView6 != null) {
                                                                i = R.id.txt_view_details;
                                                                TextView textView7 = (TextView) zp7.a(view, R.id.txt_view_details);
                                                                if (textView7 != null) {
                                                                    return new e6((LinearLayout) view, progressBar, materialCardView, cardView, textView, textView2, vy3VarA, linearLayout, linearLayout2, linearLayout3, textView3, textView4, textView5, recyclerView, textView6, textView7);
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

    public static e6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static e6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_accident_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
