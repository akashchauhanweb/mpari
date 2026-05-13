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
public final class c6 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final LinearLayout a;
    public final ProgressBar b;
    public final MaterialCardView c;
    public final CardView d;
    public final vy3 e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final CardView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final RecyclerView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public c6(LinearLayout linearLayout, ProgressBar progressBar, MaterialCardView materialCardView, CardView cardView, vy3 vy3Var, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, CardView cardView2, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18) {
        this.a = linearLayout;
        this.b = progressBar;
        this.c = materialCardView;
        this.d = cardView;
        this.e = vy3Var;
        this.f = linearLayout2;
        this.g = linearLayout3;
        this.h = linearLayout4;
        this.i = linearLayout5;
        this.j = cardView2;
        this.k = textView;
        this.l = textView2;
        this.m = textView3;
        this.n = recyclerView;
        this.o = textView4;
        this.p = textView5;
        this.q = textView6;
        this.r = textView7;
        this.s = textView8;
        this.t = textView9;
        this.u = textView10;
        this.v = textView11;
        this.w = textView12;
        this.x = textView13;
        this.y = textView14;
        this.z = textView15;
        this.A = textView16;
        this.B = textView17;
        this.C = textView18;
    }

    public static c6 a(View view) {
        int i = R.id.acc_dash_progress;
        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.acc_dash_progress);
        if (progressBar != null) {
            i = R.id.cv_complaint_status;
            MaterialCardView materialCardView = (MaterialCardView) zp7.a(view, R.id.cv_complaint_status);
            if (materialCardView != null) {
                i = R.id.cv_report_complaint;
                CardView cardView = (CardView) zp7.a(view, R.id.cv_report_complaint);
                if (cardView != null) {
                    i = R.id.header_acc_dash;
                    View viewA = zp7.a(view, R.id.header_acc_dash);
                    if (viewA != null) {
                        vy3 vy3VarA = vy3.a(viewA);
                        i = R.id.ll_comp_history;
                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.ll_comp_history);
                        if (linearLayout != null) {
                            i = R.id.ll_dashboard;
                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.ll_dashboard);
                            if (linearLayout2 != null) {
                                i = R.id.ll_last_record;
                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.ll_last_record);
                                if (linearLayout3 != null) {
                                    i = R.id.ll_reg_complaint;
                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.ll_reg_complaint);
                                    if (linearLayout4 != null) {
                                        i = R.id.ll_statistics;
                                        CardView cardView2 = (CardView) zp7.a(view, R.id.ll_statistics);
                                        if (cardView2 != null) {
                                            i = R.id.logo_dashboard;
                                            TextView textView = (TextView) zp7.a(view, R.id.logo_dashboard);
                                            if (textView != null) {
                                                i = R.id.logo_reg_acc_repo;
                                                TextView textView2 = (TextView) zp7.a(view, R.id.logo_reg_acc_repo);
                                                if (textView2 != null) {
                                                    i = R.id.logo_repo_acc_hist;
                                                    TextView textView3 = (TextView) zp7.a(view, R.id.logo_repo_acc_hist);
                                                    if (textView3 != null) {
                                                        i = R.id.recycler_records;
                                                        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.recycler_records);
                                                        if (recyclerView != null) {
                                                            i = R.id.tv_acc_id;
                                                            TextView textView4 = (TextView) zp7.a(view, R.id.tv_acc_id);
                                                            if (textView4 != null) {
                                                                i = R.id.tv_last_acc_repo;
                                                                TextView textView5 = (TextView) zp7.a(view, R.id.tv_last_acc_repo);
                                                                if (textView5 != null) {
                                                                    i = R.id.tv_location;
                                                                    TextView textView6 = (TextView) zp7.a(view, R.id.tv_location);
                                                                    if (textView6 != null) {
                                                                        i = R.id.tv_statistics;
                                                                        TextView textView7 = (TextView) zp7.a(view, R.id.tv_statistics);
                                                                        if (textView7 != null) {
                                                                            i = R.id.tv_status;
                                                                            TextView textView8 = (TextView) zp7.a(view, R.id.tv_status);
                                                                            if (textView8 != null) {
                                                                                i = R.id.tv_vehicle_no;
                                                                                TextView textView9 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.tv_viola_date;
                                                                                    TextView textView10 = (TextView) zp7.a(view, R.id.tv_viola_date);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.txt_acc_dashboard;
                                                                                        TextView textView11 = (TextView) zp7.a(view, R.id.txt_acc_dashboard);
                                                                                        if (textView11 != null) {
                                                                                            i = R.id.txt_acc_id;
                                                                                            TextView textView12 = (TextView) zp7.a(view, R.id.txt_acc_id);
                                                                                            if (textView12 != null) {
                                                                                                i = R.id.txt_acc_state;
                                                                                                TextView textView13 = (TextView) zp7.a(view, R.id.txt_acc_state);
                                                                                                if (textView13 != null) {
                                                                                                    i = R.id.txt_vehicle_number;
                                                                                                    TextView textView14 = (TextView) zp7.a(view, R.id.txt_vehicle_number);
                                                                                                    if (textView14 != null) {
                                                                                                        i = R.id.txt_view_details;
                                                                                                        TextView textView15 = (TextView) zp7.a(view, R.id.txt_view_details);
                                                                                                        if (textView15 != null) {
                                                                                                            i = R.id.txt_violation_date;
                                                                                                            TextView textView16 = (TextView) zp7.a(view, R.id.txt_violation_date);
                                                                                                            if (textView16 != null) {
                                                                                                                i = R.id.txt_violation_location;
                                                                                                                TextView textView17 = (TextView) zp7.a(view, R.id.txt_violation_location);
                                                                                                                if (textView17 != null) {
                                                                                                                    i = R.id.txt_violation_status;
                                                                                                                    TextView textView18 = (TextView) zp7.a(view, R.id.txt_violation_status);
                                                                                                                    if (textView18 != null) {
                                                                                                                        return new c6((LinearLayout) view, progressBar, materialCardView, cardView, vy3VarA, linearLayout, linearLayout2, linearLayout3, linearLayout4, cardView2, textView, textView2, textView3, recyclerView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18);
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

    public static c6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static c6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_accident_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
