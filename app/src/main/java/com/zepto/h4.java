package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class h4 {
    public final LinearLayout a;
    public final MaterialCardView b;
    public final CardView c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final CardView h;
    public final RecyclerView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;

    public h4(LinearLayout linearLayout, MaterialCardView materialCardView, CardView cardView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, CardView cardView2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = linearLayout;
        this.b = materialCardView;
        this.c = cardView;
        this.d = linearLayout2;
        this.e = linearLayout3;
        this.f = linearLayout4;
        this.g = linearLayout5;
        this.h = cardView2;
        this.i = recyclerView;
        this.j = textView;
        this.k = textView2;
        this.l = textView3;
        this.m = textView4;
        this.n = textView5;
    }

    public static h4 a(View view) {
        int i = R.id.cv_complaint_status;
        MaterialCardView materialCardView = (MaterialCardView) zp7.a(view, R.id.cv_complaint_status);
        if (materialCardView != null) {
            i = R.id.cv_report_complaint;
            CardView cardView = (CardView) zp7.a(view, R.id.cv_report_complaint);
            if (cardView != null) {
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
                                    i = R.id.recycler_records;
                                    RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.recycler_records);
                                    if (recyclerView != null) {
                                        i = R.id.txt_acc_dashboard;
                                        TextView textView = (TextView) zp7.a(view, R.id.txt_acc_dashboard);
                                        if (textView != null) {
                                            i = R.id.txt_vehicle_number;
                                            TextView textView2 = (TextView) zp7.a(view, R.id.txt_vehicle_number);
                                            if (textView2 != null) {
                                                i = R.id.txt_violation_date;
                                                TextView textView3 = (TextView) zp7.a(view, R.id.txt_violation_date);
                                                if (textView3 != null) {
                                                    i = R.id.txt_violation_location;
                                                    TextView textView4 = (TextView) zp7.a(view, R.id.txt_violation_location);
                                                    if (textView4 != null) {
                                                        i = R.id.txt_violation_status;
                                                        TextView textView5 = (TextView) zp7.a(view, R.id.txt_violation_status);
                                                        if (textView5 != null) {
                                                            return new h4((LinearLayout) view, materialCardView, cardView, linearLayout, linearLayout2, linearLayout3, linearLayout4, cardView2, recyclerView, textView, textView2, textView3, textView4, textView5);
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

    public static h4 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.accident_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
