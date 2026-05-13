package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ge {
    public final MyTextView A;
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final d47 D;
    public final RelativeLayout a;
    public final MyTextView b;
    public final AppCompatTextView c;
    public final MyTextView d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final CheckedTextView g;
    public final MyTextView h;
    public final AppCompatTextView i;
    public final MyTextView j;
    public final AppCompatTextView k;
    public final AppCompatTextView l;
    public final MyTextView m;
    public final AppCompatTextView n;
    public final MyTextView o;
    public final AppCompatTextView p;
    public final AppCompatTextView q;
    public final CheckedTextView r;
    public final RelativeLayout s;
    public final MyTextView t;
    public final AppCompatTextView u;
    public final MyTextView v;
    public final AppCompatTextView w;
    public final View x;
    public final ProgressBar y;
    public final CheckedTextView z;

    public ge(RelativeLayout relativeLayout, MyTextView myTextView, AppCompatTextView appCompatTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, CheckedTextView checkedTextView, MyTextView myTextView3, AppCompatTextView appCompatTextView4, MyTextView myTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, MyTextView myTextView5, AppCompatTextView appCompatTextView7, MyTextView myTextView6, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, CheckedTextView checkedTextView2, RelativeLayout relativeLayout2, MyTextView myTextView7, AppCompatTextView appCompatTextView10, MyTextView myTextView8, AppCompatTextView appCompatTextView11, View view, ProgressBar progressBar, CheckedTextView checkedTextView3, MyTextView myTextView9, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, d47 d47Var) {
        this.a = relativeLayout;
        this.b = myTextView;
        this.c = appCompatTextView;
        this.d = myTextView2;
        this.e = appCompatTextView2;
        this.f = appCompatTextView3;
        this.g = checkedTextView;
        this.h = myTextView3;
        this.i = appCompatTextView4;
        this.j = myTextView4;
        this.k = appCompatTextView5;
        this.l = appCompatTextView6;
        this.m = myTextView5;
        this.n = appCompatTextView7;
        this.o = myTextView6;
        this.p = appCompatTextView8;
        this.q = appCompatTextView9;
        this.r = checkedTextView2;
        this.s = relativeLayout2;
        this.t = myTextView7;
        this.u = appCompatTextView10;
        this.v = myTextView8;
        this.w = appCompatTextView11;
        this.x = view;
        this.y = progressBar;
        this.z = checkedTextView3;
        this.A = myTextView9;
        this.B = appCompatTextView12;
        this.C = appCompatTextView13;
        this.D = d47Var;
    }

    public static ge a(View view) {
        int i = R.id.amountTv;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.amountTv);
        if (myTextView != null) {
            i = R.id.amountValue;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.amountValue);
            if (appCompatTextView != null) {
                i = R.id.challanDateTv;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.challanDateTv);
                if (myTextView2 != null) {
                    i = R.id.challanDateValue;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.challanDateValue);
                    if (appCompatTextView2 != null) {
                        i = R.id.challanDetailTv;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.challanDetailTv);
                        if (appCompatTextView3 != null) {
                            i = R.id.challanDetailsCb;
                            CheckedTextView checkedTextView = (CheckedTextView) zp7.a(view, R.id.challanDetailsCb);
                            if (checkedTextView != null) {
                                i = R.id.challanTv;
                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.challanTv);
                                if (myTextView3 != null) {
                                    i = R.id.challanValue;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.challanValue);
                                    if (appCompatTextView4 != null) {
                                        i = R.id.dlRcNoTv;
                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.dlRcNoTv);
                                        if (myTextView4 != null) {
                                            i = R.id.dlRcValue;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.dlRcValue);
                                            if (appCompatTextView5 != null) {
                                                i = R.id.downloadNoticeTv;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.downloadNoticeTv);
                                                if (appCompatTextView6 != null) {
                                                    i = R.id.offenceTv;
                                                    MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.offenceTv);
                                                    if (myTextView5 != null) {
                                                        i = R.id.offenceValue;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.offenceValue);
                                                        if (appCompatTextView7 != null) {
                                                            i = R.id.ownerNameTv;
                                                            MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.ownerNameTv);
                                                            if (myTextView6 != null) {
                                                                i = R.id.ownerNameValue;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.ownerNameValue);
                                                                if (appCompatTextView8 != null) {
                                                                    i = R.id.payNowTv;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.payNowTv);
                                                                    if (appCompatTextView9 != null) {
                                                                        i = R.id.paymentCb;
                                                                        CheckedTextView checkedTextView2 = (CheckedTextView) zp7.a(view, R.id.paymentCb);
                                                                        if (checkedTextView2 != null) {
                                                                            i = R.id.paymentDateRl;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.paymentDateRl);
                                                                            if (relativeLayout != null) {
                                                                                i = R.id.paymentDateTv;
                                                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.paymentDateTv);
                                                                                if (myTextView7 != null) {
                                                                                    i = R.id.paymentDateValue;
                                                                                    AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.paymentDateValue);
                                                                                    if (appCompatTextView10 != null) {
                                                                                        i = R.id.paymentStatusTv;
                                                                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.paymentStatusTv);
                                                                                        if (myTextView8 != null) {
                                                                                            i = R.id.paymentStatusValue;
                                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) zp7.a(view, R.id.paymentStatusValue);
                                                                                            if (appCompatTextView11 != null) {
                                                                                                i = R.id.paymentView;
                                                                                                View viewA = zp7.a(view, R.id.paymentView);
                                                                                                if (viewA != null) {
                                                                                                    i = R.id.progressBar;
                                                                                                    ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progressBar);
                                                                                                    if (progressBar != null) {
                                                                                                        i = R.id.receiptCb;
                                                                                                        CheckedTextView checkedTextView3 = (CheckedTextView) zp7.a(view, R.id.receiptCb);
                                                                                                        if (checkedTextView3 != null) {
                                                                                                            i = R.id.stateTv;
                                                                                                            MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.stateTv);
                                                                                                            if (myTextView9 != null) {
                                                                                                                i = R.id.stateValue;
                                                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) zp7.a(view, R.id.stateValue);
                                                                                                                if (appCompatTextView12 != null) {
                                                                                                                    i = R.id.titleTv;
                                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                                                                                                    if (appCompatTextView13 != null) {
                                                                                                                        i = R.id.topHolder;
                                                                                                                        View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                                        if (viewA2 != null) {
                                                                                                                            return new ge((RelativeLayout) view, myTextView, appCompatTextView, myTextView2, appCompatTextView2, appCompatTextView3, checkedTextView, myTextView3, appCompatTextView4, myTextView4, appCompatTextView5, appCompatTextView6, myTextView5, appCompatTextView7, myTextView6, appCompatTextView8, appCompatTextView9, checkedTextView2, relativeLayout, myTextView7, appCompatTextView10, myTextView8, appCompatTextView11, viewA, progressBar, checkedTextView3, myTextView9, appCompatTextView12, appCompatTextView13, d47.a(viewA2));
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ge c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ge d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_notice_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
