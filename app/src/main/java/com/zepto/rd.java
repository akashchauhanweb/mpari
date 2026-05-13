package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rd {
    public final ScrollView a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final RelativeLayout d;
    public final RelativeLayout e;
    public final RelativeLayout f;
    public final RelativeLayout g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final vy3 j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;

    public rd(ScrollView scrollView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout3, LinearLayout linearLayout4, vy3 vy3Var, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.a = scrollView;
        this.b = linearLayout;
        this.c = linearLayout2;
        this.d = relativeLayout;
        this.e = relativeLayout2;
        this.f = relativeLayout3;
        this.g = relativeLayout4;
        this.h = linearLayout3;
        this.i = linearLayout4;
        this.j = vy3Var;
        this.k = textView;
        this.l = textView2;
        this.m = textView3;
        this.n = textView4;
        this.o = textView5;
        this.p = textView6;
        this.q = textView7;
        this.r = textView8;
    }

    public static rd a(View view) {
        int i = R.id.fuelPumpLl;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.fuelPumpLl);
        if (linearLayout != null) {
            i = R.id.hospitalLl;
            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.hospitalLl);
            if (linearLayout2 != null) {
                i = R.id.nearHospitalRl;
                RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.nearHospitalRl);
                if (relativeLayout != null) {
                    i = R.id.nearestPollutionRl;
                    RelativeLayout relativeLayout2 = (RelativeLayout) zp7.a(view, R.id.nearestPollutionRl);
                    if (relativeLayout2 != null) {
                        i = R.id.nearestRTORl;
                        RelativeLayout relativeLayout3 = (RelativeLayout) zp7.a(view, R.id.nearestRTORl);
                        if (relativeLayout3 != null) {
                            i = R.id.nearestfuelPumpRl;
                            RelativeLayout relativeLayout4 = (RelativeLayout) zp7.a(view, R.id.nearestfuelPumpRl);
                            if (relativeLayout4 != null) {
                                i = R.id.puccLl;
                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.puccLl);
                                if (linearLayout3 != null) {
                                    i = R.id.rtoLl;
                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.rtoLl);
                                    if (linearLayout4 != null) {
                                        i = R.id.topheader;
                                        View viewA = zp7.a(view, R.id.topheader);
                                        if (viewA != null) {
                                            vy3 vy3VarA = vy3.a(viewA);
                                            i = R.id.tv_fuel_pump;
                                            TextView textView = (TextView) zp7.a(view, R.id.tv_fuel_pump);
                                            if (textView != null) {
                                                i = R.id.tv_fuel_view;
                                                TextView textView2 = (TextView) zp7.a(view, R.id.tv_fuel_view);
                                                if (textView2 != null) {
                                                    i = R.id.tv_hosp_view;
                                                    TextView textView3 = (TextView) zp7.a(view, R.id.tv_hosp_view);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_hospital;
                                                        TextView textView4 = (TextView) zp7.a(view, R.id.tv_hospital);
                                                        if (textView4 != null) {
                                                            i = R.id.tv_pollution_checking;
                                                            TextView textView5 = (TextView) zp7.a(view, R.id.tv_pollution_checking);
                                                            if (textView5 != null) {
                                                                i = R.id.tv_pollution_view;
                                                                TextView textView6 = (TextView) zp7.a(view, R.id.tv_pollution_view);
                                                                if (textView6 != null) {
                                                                    i = R.id.tv_rto;
                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.tv_rto);
                                                                    if (textView7 != null) {
                                                                        i = R.id.tv_rto_view;
                                                                        TextView textView8 = (TextView) zp7.a(view, R.id.tv_rto_view);
                                                                        if (textView8 != null) {
                                                                            return new rd((ScrollView) view, linearLayout, linearLayout2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout3, linearLayout4, vy3VarA, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static rd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static rd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_near_by_places, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
