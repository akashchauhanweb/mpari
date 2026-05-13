package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import io.github.glailton.expandabletextview.ExpandableTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class ne {
    public final LinearLayout A;
    public final MyTextView B;
    public final AppCompatTextView C;
    public final MyTextView D;
    public final AppCompatTextView E;
    public final View F;
    public final ProgressBar G;
    public final CheckedTextView H;
    public final AppCompatTextView I;
    public final MyTextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final d47 M;
    public final RelativeLayout a;
    public final MyTextView b;
    public final AppCompatTextView c;
    public final LinearLayout d;
    public final MyTextView e;
    public final AppCompatTextView f;
    public final AppCompatTextView g;
    public final CheckedTextView h;
    public final MyTextView i;
    public final AppCompatTextView j;
    public final AppCompatTextView k;
    public final AppCompatTextView l;
    public final MyTextView m;
    public final AppCompatTextView n;
    public final LinearLayout o;
    public final MyTextView p;
    public final AppCompatTextView q;
    public final MyTextView r;
    public final AppCompatTextView s;
    public final ExpandableTextView t;
    public final MyTextView u;
    public final MyTextView v;
    public final AppCompatTextView w;
    public final LinearLayout x;
    public final AppCompatTextView y;
    public final CheckedTextView z;

    public ne(RelativeLayout relativeLayout, MyTextView myTextView, AppCompatTextView appCompatTextView, LinearLayout linearLayout, MyTextView myTextView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, CheckedTextView checkedTextView, MyTextView myTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, MyTextView myTextView4, AppCompatTextView appCompatTextView7, LinearLayout linearLayout2, MyTextView myTextView5, AppCompatTextView appCompatTextView8, MyTextView myTextView6, AppCompatTextView appCompatTextView9, ExpandableTextView expandableTextView, MyTextView myTextView7, MyTextView myTextView8, AppCompatTextView appCompatTextView10, LinearLayout linearLayout3, AppCompatTextView appCompatTextView11, CheckedTextView checkedTextView2, LinearLayout linearLayout4, MyTextView myTextView9, AppCompatTextView appCompatTextView12, MyTextView myTextView10, AppCompatTextView appCompatTextView13, View view, ProgressBar progressBar, CheckedTextView checkedTextView3, AppCompatTextView appCompatTextView14, MyTextView myTextView11, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, d47 d47Var) {
        this.a = relativeLayout;
        this.b = myTextView;
        this.c = appCompatTextView;
        this.d = linearLayout;
        this.e = myTextView2;
        this.f = appCompatTextView2;
        this.g = appCompatTextView3;
        this.h = checkedTextView;
        this.i = myTextView3;
        this.j = appCompatTextView4;
        this.k = appCompatTextView5;
        this.l = appCompatTextView6;
        this.m = myTextView4;
        this.n = appCompatTextView7;
        this.o = linearLayout2;
        this.p = myTextView5;
        this.q = appCompatTextView8;
        this.r = myTextView6;
        this.s = appCompatTextView9;
        this.t = expandableTextView;
        this.u = myTextView7;
        this.v = myTextView8;
        this.w = appCompatTextView10;
        this.x = linearLayout3;
        this.y = appCompatTextView11;
        this.z = checkedTextView2;
        this.A = linearLayout4;
        this.B = myTextView9;
        this.C = appCompatTextView12;
        this.D = myTextView10;
        this.E = appCompatTextView13;
        this.F = view;
        this.G = progressBar;
        this.H = checkedTextView3;
        this.I = appCompatTextView14;
        this.J = myTextView11;
        this.K = appCompatTextView15;
        this.L = appCompatTextView16;
        this.M = d47Var;
    }

    public static ne a(View view) {
        int i = R.id.amountTv;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.amountTv);
        if (myTextView != null) {
            i = R.id.amountValue;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.amountValue);
            if (appCompatTextView != null) {
                i = R.id.bottomBtnHolderLl;
                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.bottomBtnHolderLl);
                if (linearLayout != null) {
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
                                    i = R.id.challanPlaceTv;
                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.challanPlaceTv);
                                    if (myTextView3 != null) {
                                        i = R.id.challanPlaceValue;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.challanPlaceValue);
                                        if (appCompatTextView4 != null) {
                                            i = R.id.challanPrint1Tv;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.challanPrint1Tv);
                                            if (appCompatTextView5 != null) {
                                                i = R.id.challanPrintTv;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.challanPrintTv);
                                                if (appCompatTextView6 != null) {
                                                    i = R.id.challanTv;
                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.challanTv);
                                                    if (myTextView4 != null) {
                                                        i = R.id.challanValue;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.challanValue);
                                                        if (appCompatTextView7 != null) {
                                                            i = R.id.dlNoHolder;
                                                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.dlNoHolder);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.dlNoTv;
                                                                MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.dlNoTv);
                                                                if (myTextView5 != null) {
                                                                    i = R.id.dlNoValue;
                                                                    AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.dlNoValue);
                                                                    if (appCompatTextView8 != null) {
                                                                        i = R.id.dlRcNoTv;
                                                                        MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.dlRcNoTv);
                                                                        if (myTextView6 != null) {
                                                                            i = R.id.dlRcValue;
                                                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.dlRcValue);
                                                                            if (appCompatTextView9 != null) {
                                                                                i = R.id.expandableTv;
                                                                                ExpandableTextView expandableTextView = (ExpandableTextView) zp7.a(view, R.id.expandableTv);
                                                                                if (expandableTextView != null) {
                                                                                    i = R.id.offenceTv;
                                                                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.offenceTv);
                                                                                    if (myTextView7 != null) {
                                                                                        i = R.id.ownerNameTv;
                                                                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.ownerNameTv);
                                                                                        if (myTextView8 != null) {
                                                                                            i = R.id.ownerNameValue;
                                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.ownerNameValue);
                                                                                            if (appCompatTextView10 != null) {
                                                                                                i = R.id.parentLlHolder;
                                                                                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.parentLlHolder);
                                                                                                if (linearLayout3 != null) {
                                                                                                    i = R.id.payNowTv;
                                                                                                    AppCompatTextView appCompatTextView11 = (AppCompatTextView) zp7.a(view, R.id.payNowTv);
                                                                                                    if (appCompatTextView11 != null) {
                                                                                                        i = R.id.paymentCb;
                                                                                                        CheckedTextView checkedTextView2 = (CheckedTextView) zp7.a(view, R.id.paymentCb);
                                                                                                        if (checkedTextView2 != null) {
                                                                                                            i = R.id.paymentDateRl;
                                                                                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.paymentDateRl);
                                                                                                            if (linearLayout4 != null) {
                                                                                                                i = R.id.paymentDateTv;
                                                                                                                MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.paymentDateTv);
                                                                                                                if (myTextView9 != null) {
                                                                                                                    i = R.id.paymentDateValue;
                                                                                                                    AppCompatTextView appCompatTextView12 = (AppCompatTextView) zp7.a(view, R.id.paymentDateValue);
                                                                                                                    if (appCompatTextView12 != null) {
                                                                                                                        i = R.id.paymentStatusTv;
                                                                                                                        MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.paymentStatusTv);
                                                                                                                        if (myTextView10 != null) {
                                                                                                                            i = R.id.paymentStatusValue;
                                                                                                                            AppCompatTextView appCompatTextView13 = (AppCompatTextView) zp7.a(view, R.id.paymentStatusValue);
                                                                                                                            if (appCompatTextView13 != null) {
                                                                                                                                i = R.id.paymentView;
                                                                                                                                View viewA = zp7.a(view, R.id.paymentView);
                                                                                                                                if (viewA != null) {
                                                                                                                                    i = R.id.progressBar;
                                                                                                                                    ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progressBar);
                                                                                                                                    if (progressBar != null) {
                                                                                                                                        i = R.id.receiptCb;
                                                                                                                                        CheckedTextView checkedTextView3 = (CheckedTextView) zp7.a(view, R.id.receiptCb);
                                                                                                                                        if (checkedTextView3 != null) {
                                                                                                                                            i = R.id.receiptTv;
                                                                                                                                            AppCompatTextView appCompatTextView14 = (AppCompatTextView) zp7.a(view, R.id.receiptTv);
                                                                                                                                            if (appCompatTextView14 != null) {
                                                                                                                                                i = R.id.stateTv;
                                                                                                                                                MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.stateTv);
                                                                                                                                                if (myTextView11 != null) {
                                                                                                                                                    i = R.id.stateValue;
                                                                                                                                                    AppCompatTextView appCompatTextView15 = (AppCompatTextView) zp7.a(view, R.id.stateValue);
                                                                                                                                                    if (appCompatTextView15 != null) {
                                                                                                                                                        i = R.id.titleTv;
                                                                                                                                                        AppCompatTextView appCompatTextView16 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                                                                                                                                        if (appCompatTextView16 != null) {
                                                                                                                                                            i = R.id.topHolder;
                                                                                                                                                            View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                                                                            if (viewA2 != null) {
                                                                                                                                                                return new ne((RelativeLayout) view, myTextView, appCompatTextView, linearLayout, myTextView2, appCompatTextView2, appCompatTextView3, checkedTextView, myTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, myTextView4, appCompatTextView7, linearLayout2, myTextView5, appCompatTextView8, myTextView6, appCompatTextView9, expandableTextView, myTextView7, myTextView8, appCompatTextView10, linearLayout3, appCompatTextView11, checkedTextView2, linearLayout4, myTextView9, appCompatTextView12, myTextView10, appCompatTextView13, viewA, progressBar, checkedTextView3, appCompatTextView14, myTextView11, appCompatTextView15, appCompatTextView16, d47.a(viewA2));
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

    public static ne c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ne d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_payment_challan, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
