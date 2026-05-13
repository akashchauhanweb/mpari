package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class a23 {
    public final ScrollView a;
    public final AppCompatButton b;
    public final TextView c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f;
    public final v23 g;
    public final TextView h;
    public final TextView i;
    public final zh7 j;
    public final d47 k;
    public final MyTextView l;
    public final TextView m;
    public final MyTextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final MyTextView q;
    public final MyTextView r;
    public final TextView s;
    public final TextView t;

    public a23(ScrollView scrollView, AppCompatButton appCompatButton, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3, v23 v23Var, TextView textView4, TextView textView5, zh7 zh7Var, d47 d47Var, MyTextView myTextView, TextView textView6, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView7, TextView textView8) {
        this.a = scrollView;
        this.b = appCompatButton;
        this.c = textView;
        this.d = textView2;
        this.e = linearLayout;
        this.f = textView3;
        this.g = v23Var;
        this.h = textView4;
        this.i = textView5;
        this.j = zh7Var;
        this.k = d47Var;
        this.l = myTextView;
        this.m = textView6;
        this.n = myTextView2;
        this.o = myTextView3;
        this.p = myTextView4;
        this.q = myTextView5;
        this.r = myTextView6;
        this.s = textView7;
        this.t = textView8;
    }

    public static a23 a(View view) {
        int i = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
        if (appCompatButton != null) {
            i = R.id.firDateTv;
            TextView textView = (TextView) zp7.a(view, R.id.firDateTv);
            if (textView != null) {
                i = R.id.firNoTv;
                TextView textView2 = (TextView) zp7.a(view, R.id.firNoTv);
                if (textView2 != null) {
                    i = R.id.police_fir_layout;
                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.police_fir_layout);
                    if (linearLayout != null) {
                        i = R.id.policeStationTv;
                        TextView textView3 = (TextView) zp7.a(view, R.id.policeStationTv);
                        if (textView3 != null) {
                            i = R.id.rc_ind;
                            View viewA = zp7.a(view, R.id.rc_ind);
                            if (viewA != null) {
                                v23 v23VarA = v23.a(viewA);
                                i = R.id.reasonTV;
                                TextView textView4 = (TextView) zp7.a(view, R.id.reasonTV);
                                if (textView4 != null) {
                                    i = R.id.remarkTv;
                                    TextView textView5 = (TextView) zp7.a(view, R.id.remarkTv);
                                    if (textView5 != null) {
                                        i = R.id.stepper_layout;
                                        View viewA2 = zp7.a(view, R.id.stepper_layout);
                                        if (viewA2 != null) {
                                            zh7 zh7VarA = zh7.a(viewA2);
                                            i = R.id.topHolder;
                                            View viewA3 = zp7.a(view, R.id.topHolder);
                                            if (viewA3 != null) {
                                                d47 d47VarA = d47.a(viewA3);
                                                i = R.id.vahan_details_duplicate_rc;
                                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                                                if (myTextView != null) {
                                                    i = R.id.vahan_duplicate_rc;
                                                    TextView textView6 = (TextView) zp7.a(view, R.id.vahan_duplicate_rc);
                                                    if (textView6 != null) {
                                                        i = R.id.vahan_fir_date;
                                                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.vahan_fir_date);
                                                        if (myTextView2 != null) {
                                                            i = R.id.vahan_police_station;
                                                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vahan_police_station);
                                                            if (myTextView3 != null) {
                                                                i = R.id.vahan_reason;
                                                                MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vahan_reason);
                                                                if (myTextView4 != null) {
                                                                    i = R.id.vahan_remark;
                                                                    MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.vahan_remark);
                                                                    if (myTextView5 != null) {
                                                                        i = R.id.vahan_report_no;
                                                                        MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.vahan_report_no);
                                                                        if (myTextView6 != null) {
                                                                            i = R.id.vehicleNumberTv;
                                                                            TextView textView7 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                            if (textView7 != null) {
                                                                                i = R.id.vehicle_view;
                                                                                TextView textView8 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                if (textView8 != null) {
                                                                                    return new a23((ScrollView) view, appCompatButton, textView, textView2, linearLayout, textView3, v23VarA, textView4, textView5, zh7VarA, d47VarA, myTextView, textView6, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView7, textView8);
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

    public static a23 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a23 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.issueofduplicate_detailsview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
