package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nh {
    public final ConstraintLayout a;
    public final MyTextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final MyTextView e;
    public final ri5 f;
    public final MyTextView g;
    public final MyTextView h;
    public final MyTextView i;
    public final AppCompatTextView j;
    public final MyTextView k;
    public final MyTextView l;
    public final MyTextView m;
    public final MyTextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final MyTextView q;

    public nh(ConstraintLayout constraintLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, ri5 ri5Var, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, AppCompatTextView appCompatTextView, MyTextView myTextView8, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14) {
        this.a = constraintLayout;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = myTextView3;
        this.e = myTextView4;
        this.f = ri5Var;
        this.g = myTextView5;
        this.h = myTextView6;
        this.i = myTextView7;
        this.j = appCompatTextView;
        this.k = myTextView8;
        this.l = myTextView9;
        this.m = myTextView10;
        this.n = myTextView11;
        this.o = myTextView12;
        this.p = myTextView13;
        this.q = myTextView14;
    }

    public static nh a(View view) {
        int i = R.id.amount;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.amount);
        if (myTextView != null) {
            i = R.id.applicationDate;
            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.applicationDate);
            if (myTextView2 != null) {
                i = R.id.applicationDateTl;
                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.applicationDateTl);
                if (myTextView3 != null) {
                    i = R.id.applicationNo;
                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.applicationNo);
                    if (myTextView4 != null) {
                        i = R.id.include3;
                        View viewA = zp7.a(view, R.id.include3);
                        if (viewA != null) {
                            ri5 ri5VarA = ri5.a(viewA);
                            i = R.id.myApplicationNoTl;
                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.myApplicationNoTl);
                            if (myTextView5 != null) {
                                i = R.id.receiptdate;
                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.receiptdate);
                                if (myTextView6 != null) {
                                    i = R.id.receiptno;
                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.receiptno);
                                    if (myTextView7 != null) {
                                        i = R.id.topTitleTv;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                        if (appCompatTextView != null) {
                                            i = R.id.transactionname;
                                            MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.transactionname);
                                            if (myTextView8 != null) {
                                                i = R.id.tv_amount;
                                                MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.tv_amount);
                                                if (myTextView9 != null) {
                                                    i = R.id.tv_receiptdate;
                                                    MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.tv_receiptdate);
                                                    if (myTextView10 != null) {
                                                        i = R.id.tv_receiptno;
                                                        MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.tv_receiptno);
                                                        if (myTextView11 != null) {
                                                            i = R.id.tv_transactionname;
                                                            MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.tv_transactionname);
                                                            if (myTextView12 != null) {
                                                                i = R.id.tvvehicleno;
                                                                MyTextView myTextView13 = (MyTextView) zp7.a(view, R.id.tvvehicleno);
                                                                if (myTextView13 != null) {
                                                                    i = R.id.vehicleno;
                                                                    MyTextView myTextView14 = (MyTextView) zp7.a(view, R.id.vehicleno);
                                                                    if (myTextView14 != null) {
                                                                        return new nh((ConstraintLayout) view, myTextView, myTextView2, myTextView3, myTextView4, ri5VarA, myTextView5, myTextView6, myTextView7, appCompatTextView, myTextView8, myTextView9, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14);
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

    public static nh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static nh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vehicle_transcation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
