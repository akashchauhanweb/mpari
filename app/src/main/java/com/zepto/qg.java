package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qg {
    public final TextView A;
    public final LinearLayout a;
    public final vy3 b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final CardView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final RecyclerView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final ProgressBar s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public qg(LinearLayout linearLayout, vy3 vy3Var, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, CardView cardView, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, ProgressBar progressBar, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18) {
        this.a = linearLayout;
        this.b = vy3Var;
        this.c = linearLayout2;
        this.d = linearLayout3;
        this.e = linearLayout4;
        this.f = linearLayout5;
        this.g = cardView;
        this.h = textView;
        this.i = textView2;
        this.j = textView3;
        this.k = recyclerView;
        this.l = textView4;
        this.m = textView5;
        this.n = textView6;
        this.o = textView7;
        this.p = textView8;
        this.q = textView9;
        this.r = textView10;
        this.s = progressBar;
        this.t = textView11;
        this.u = textView12;
        this.v = textView13;
        this.w = textView14;
        this.x = textView15;
        this.y = textView16;
        this.z = textView17;
        this.A = textView18;
    }

    public static qg a(View view) {
        int i = R.id.header_acc_dash;
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
                            CardView cardView = (CardView) zp7.a(view, R.id.ll_statistics);
                            if (cardView != null) {
                                i = R.id.logo_compl_hist;
                                TextView textView = (TextView) zp7.a(view, R.id.logo_compl_hist);
                                if (textView != null) {
                                    i = R.id.logo_dashboard;
                                    TextView textView2 = (TextView) zp7.a(view, R.id.logo_dashboard);
                                    if (textView2 != null) {
                                        i = R.id.logo_reg_compln;
                                        TextView textView3 = (TextView) zp7.a(view, R.id.logo_reg_compln);
                                        if (textView3 != null) {
                                            i = R.id.recycler_records;
                                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.recycler_records);
                                            if (recyclerView != null) {
                                                i = R.id.title_location;
                                                TextView textView4 = (TextView) zp7.a(view, R.id.title_location);
                                                if (textView4 != null) {
                                                    i = R.id.title_report_violation;
                                                    TextView textView5 = (TextView) zp7.a(view, R.id.title_report_violation);
                                                    if (textView5 != null) {
                                                        i = R.id.title_statistics;
                                                        TextView textView6 = (TextView) zp7.a(view, R.id.title_statistics);
                                                        if (textView6 != null) {
                                                            i = R.id.title_status;
                                                            TextView textView7 = (TextView) zp7.a(view, R.id.title_status);
                                                            if (textView7 != null) {
                                                                i = R.id.title_vehicleno;
                                                                TextView textView8 = (TextView) zp7.a(view, R.id.title_vehicleno);
                                                                if (textView8 != null) {
                                                                    i = R.id.title_violationDate;
                                                                    TextView textView9 = (TextView) zp7.a(view, R.id.title_violationDate);
                                                                    if (textView9 != null) {
                                                                        i = R.id.title_violationid;
                                                                        TextView textView10 = (TextView) zp7.a(view, R.id.title_violationid);
                                                                        if (textView10 != null) {
                                                                            i = R.id.traffic_progress;
                                                                            ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.traffic_progress);
                                                                            if (progressBar != null) {
                                                                                i = R.id.txt_traffic_dashboard;
                                                                                TextView textView11 = (TextView) zp7.a(view, R.id.txt_traffic_dashboard);
                                                                                if (textView11 != null) {
                                                                                    i = R.id.txt_traffic_state;
                                                                                    TextView textView12 = (TextView) zp7.a(view, R.id.txt_traffic_state);
                                                                                    if (textView12 != null) {
                                                                                        i = R.id.txt_vehicle_number;
                                                                                        TextView textView13 = (TextView) zp7.a(view, R.id.txt_vehicle_number);
                                                                                        if (textView13 != null) {
                                                                                            i = R.id.txt_view_details;
                                                                                            TextView textView14 = (TextView) zp7.a(view, R.id.txt_view_details);
                                                                                            if (textView14 != null) {
                                                                                                i = R.id.txt_violation_date;
                                                                                                TextView textView15 = (TextView) zp7.a(view, R.id.txt_violation_date);
                                                                                                if (textView15 != null) {
                                                                                                    i = R.id.txt_violation_id;
                                                                                                    TextView textView16 = (TextView) zp7.a(view, R.id.txt_violation_id);
                                                                                                    if (textView16 != null) {
                                                                                                        i = R.id.txt_violation_location;
                                                                                                        TextView textView17 = (TextView) zp7.a(view, R.id.txt_violation_location);
                                                                                                        if (textView17 != null) {
                                                                                                            i = R.id.txt_violation_status;
                                                                                                            TextView textView18 = (TextView) zp7.a(view, R.id.txt_violation_status);
                                                                                                            if (textView18 != null) {
                                                                                                                return new qg((LinearLayout) view, vy3VarA, linearLayout, linearLayout2, linearLayout3, linearLayout4, cardView, textView, textView2, textView3, recyclerView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, progressBar, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18);
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

    public static qg c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static qg d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_traffic_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
