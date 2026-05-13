package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bb {
    public final ConstraintLayout a;
    public final MyTextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final MyTextView e;
    public final MyTextView f;
    public final ri5 g;
    public final MyTextView h;
    public final MyTextView i;
    public final MyTextView j;
    public final AppCompatTextView k;
    public final MyTextView l;
    public final MyTextView m;
    public final MyTextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final MyTextView q;

    public bb(ConstraintLayout constraintLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, ri5 ri5Var, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, AppCompatTextView appCompatTextView, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14) {
        this.a = constraintLayout;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = myTextView3;
        this.e = myTextView4;
        this.f = myTextView5;
        this.g = ri5Var;
        this.h = myTextView6;
        this.i = myTextView7;
        this.j = myTextView8;
        this.k = appCompatTextView;
        this.l = myTextView9;
        this.m = myTextView10;
        this.n = myTextView11;
        this.o = myTextView12;
        this.p = myTextView13;
        this.q = myTextView14;
    }

    public static bb a(View view) {
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
                        i = R.id.drivinglic_no;
                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.drivinglic_no);
                        if (myTextView5 != null) {
                            i = R.id.include3;
                            View viewA = zp7.a(view, R.id.include3);
                            if (viewA != null) {
                                ri5 ri5VarA = ri5.a(viewA);
                                i = R.id.myApplicationNoTl;
                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.myApplicationNoTl);
                                if (myTextView6 != null) {
                                    i = R.id.receiptdate;
                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.receiptdate);
                                    if (myTextView7 != null) {
                                        i = R.id.receiptno;
                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.receiptno);
                                        if (myTextView8 != null) {
                                            i = R.id.topTitleTv;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                            if (appCompatTextView != null) {
                                                i = R.id.transactionname;
                                                MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.transactionname);
                                                if (myTextView9 != null) {
                                                    i = R.id.tv_amount;
                                                    MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.tv_amount);
                                                    if (myTextView10 != null) {
                                                        i = R.id.tv_receiptdate;
                                                        MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.tv_receiptdate);
                                                        if (myTextView11 != null) {
                                                            i = R.id.tv_receiptno;
                                                            MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.tv_receiptno);
                                                            if (myTextView12 != null) {
                                                                i = R.id.tv_transactionname;
                                                                MyTextView myTextView13 = (MyTextView) zp7.a(view, R.id.tv_transactionname);
                                                                if (myTextView13 != null) {
                                                                    i = R.id.tvdrivinglic_no;
                                                                    MyTextView myTextView14 = (MyTextView) zp7.a(view, R.id.tvdrivinglic_no);
                                                                    if (myTextView14 != null) {
                                                                        return new bb((ConstraintLayout) view, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, ri5VarA, myTextView6, myTextView7, myTextView8, appCompatTextView, myTextView9, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14);
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

    public static bb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static bb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_dl_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
