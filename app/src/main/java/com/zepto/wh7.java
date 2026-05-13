package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendarview.CalendarView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class wh7 {
    public final LinearLayout a;
    public final CalendarView b;
    public final ConstraintLayout c;
    public final View d;
    public final s23 e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final TextView h;
    public final TextView i;
    public final RecyclerView j;
    public final TextView k;
    public final TextView l;
    public final d47 m;
    public final TextView n;
    public final TextView o;
    public final TextView p;

    public wh7(LinearLayout linearLayout, CalendarView calendarView, ConstraintLayout constraintLayout, View view, s23 s23Var, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3, TextView textView4, d47 d47Var, TextView textView5, TextView textView6, TextView textView7) {
        this.a = linearLayout;
        this.b = calendarView;
        this.c = constraintLayout;
        this.d = view;
        this.e = s23Var;
        this.f = linearLayout2;
        this.g = linearLayout3;
        this.h = textView;
        this.i = textView2;
        this.j = recyclerView;
        this.k = textView3;
        this.l = textView4;
        this.m = d47Var;
        this.n = textView5;
        this.o = textView6;
        this.p = textView7;
    }

    public static wh7 a(View view) {
        int i = R.id.calendarView;
        CalendarView calendarView = (CalendarView) zp7.a(view, R.id.calendarView);
        if (calendarView != null) {
            i = R.id.cl_day_info;
            ConstraintLayout constraintLayout = (ConstraintLayout) zp7.a(view, R.id.cl_day_info);
            if (constraintLayout != null) {
                i = R.id.custom_view;
                View viewA = zp7.a(view, R.id.custom_view);
                if (viewA != null) {
                    i = R.id.include2;
                    View viewA2 = zp7.a(view, R.id.include2);
                    if (viewA2 != null) {
                        s23 s23VarA = s23.a(viewA2);
                        i = R.id.layoutCalender;
                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.layoutCalender);
                        if (linearLayout != null) {
                            i = R.id.linearLayout3;
                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.linearLayout3);
                            if (linearLayout2 != null) {
                                i = R.id.noSlotFoundTv;
                                TextView textView = (TextView) zp7.a(view, R.id.noSlotFoundTv);
                                if (textView != null) {
                                    i = R.id.service_name;
                                    TextView textView2 = (TextView) zp7.a(view, R.id.service_name);
                                    if (textView2 != null) {
                                        i = R.id.slot_list;
                                        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.slot_list);
                                        if (recyclerView != null) {
                                            i = R.id.textView5;
                                            TextView textView3 = (TextView) zp7.a(view, R.id.textView5);
                                            if (textView3 != null) {
                                                i = R.id.textView6;
                                                TextView textView4 = (TextView) zp7.a(view, R.id.textView6);
                                                if (textView4 != null) {
                                                    i = R.id.topHolder;
                                                    View viewA3 = zp7.a(view, R.id.topHolder);
                                                    if (viewA3 != null) {
                                                        d47 d47VarA = d47.a(viewA3);
                                                        i = R.id.tv_current_date;
                                                        TextView textView5 = (TextView) zp7.a(view, R.id.tv_current_date);
                                                        if (textView5 != null) {
                                                            i = R.id.vehicle_number;
                                                            TextView textView6 = (TextView) zp7.a(view, R.id.vehicle_number);
                                                            if (textView6 != null) {
                                                                i = R.id.vehicle_view;
                                                                TextView textView7 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                if (textView7 != null) {
                                                                    return new wh7((LinearLayout) view, calendarView, constraintLayout, viewA, s23VarA, linearLayout, linearLayout2, textView, textView2, recyclerView, textView3, textView4, d47VarA, textView5, textView6, textView7);
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

    public static wh7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static wh7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_slot_booking, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
