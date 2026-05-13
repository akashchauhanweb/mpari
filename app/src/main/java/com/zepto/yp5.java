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
public final class yp5 {
    public final View A;
    public final ProgressBar B;
    public final CheckedTextView C;
    public final MyTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final d47 G;
    public final View H;
    public final RelativeLayout a;
    public final MyTextView b;
    public final AppCompatTextView c;
    public final MyTextView d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final CheckedTextView g;
    public final MyTextView h;
    public final AppCompatTextView i;
    public final AppCompatTextView j;
    public final MyTextView k;
    public final AppCompatTextView l;
    public final LinearLayout m;
    public final MyTextView n;
    public final AppCompatTextView o;
    public final MyTextView p;
    public final AppCompatTextView q;
    public final ExpandableTextView r;
    public final MyTextView s;
    public final MyTextView t;
    public final AppCompatTextView u;
    public final LinearLayout v;
    public final CheckedTextView w;
    public final AppCompatTextView x;
    public final MyTextView y;
    public final AppCompatTextView z;

    public yp5(RelativeLayout relativeLayout, MyTextView myTextView, AppCompatTextView appCompatTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, CheckedTextView checkedTextView, MyTextView myTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, MyTextView myTextView4, AppCompatTextView appCompatTextView6, LinearLayout linearLayout, MyTextView myTextView5, AppCompatTextView appCompatTextView7, MyTextView myTextView6, AppCompatTextView appCompatTextView8, ExpandableTextView expandableTextView, MyTextView myTextView7, MyTextView myTextView8, AppCompatTextView appCompatTextView9, LinearLayout linearLayout2, CheckedTextView checkedTextView2, AppCompatTextView appCompatTextView10, MyTextView myTextView9, AppCompatTextView appCompatTextView11, View view, ProgressBar progressBar, CheckedTextView checkedTextView3, MyTextView myTextView10, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, d47 d47Var, View view2) {
        this.a = relativeLayout;
        this.b = myTextView;
        this.c = appCompatTextView;
        this.d = myTextView2;
        this.e = appCompatTextView2;
        this.f = appCompatTextView3;
        this.g = checkedTextView;
        this.h = myTextView3;
        this.i = appCompatTextView4;
        this.j = appCompatTextView5;
        this.k = myTextView4;
        this.l = appCompatTextView6;
        this.m = linearLayout;
        this.n = myTextView5;
        this.o = appCompatTextView7;
        this.p = myTextView6;
        this.q = appCompatTextView8;
        this.r = expandableTextView;
        this.s = myTextView7;
        this.t = myTextView8;
        this.u = appCompatTextView9;
        this.v = linearLayout2;
        this.w = checkedTextView2;
        this.x = appCompatTextView10;
        this.y = myTextView9;
        this.z = appCompatTextView11;
        this.A = view;
        this.B = progressBar;
        this.C = checkedTextView3;
        this.D = myTextView10;
        this.E = appCompatTextView12;
        this.F = appCompatTextView13;
        this.G = d47Var;
        this.H = view2;
    }

    public static yp5 a(View view) {
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
                                i = R.id.challanPlaceTv;
                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.challanPlaceTv);
                                if (myTextView3 != null) {
                                    i = R.id.challanPlaceValue;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.challanPlaceValue);
                                    if (appCompatTextView4 != null) {
                                        i = R.id.challanPrint1Tv;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.challanPrint1Tv);
                                        if (appCompatTextView5 != null) {
                                            i = R.id.challanTv;
                                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.challanTv);
                                            if (myTextView4 != null) {
                                                i = R.id.challanValue;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.challanValue);
                                                if (appCompatTextView6 != null) {
                                                    i = R.id.dlNoHolder;
                                                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.dlNoHolder);
                                                    if (linearLayout != null) {
                                                        i = R.id.dlNoTv;
                                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.dlNoTv);
                                                        if (myTextView5 != null) {
                                                            i = R.id.dlNoValue;
                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.dlNoValue);
                                                            if (appCompatTextView7 != null) {
                                                                i = R.id.dlRcNoTv;
                                                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.dlRcNoTv);
                                                                if (myTextView6 != null) {
                                                                    i = R.id.dlRcValue;
                                                                    AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.dlRcValue);
                                                                    if (appCompatTextView8 != null) {
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
                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.ownerNameValue);
                                                                                    if (appCompatTextView9 != null) {
                                                                                        i = R.id.parentLlHolder;
                                                                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.parentLlHolder);
                                                                                        if (linearLayout2 != null) {
                                                                                            i = R.id.paymentCb;
                                                                                            CheckedTextView checkedTextView2 = (CheckedTextView) zp7.a(view, R.id.paymentCb);
                                                                                            if (checkedTextView2 != null) {
                                                                                                i = R.id.paymentReceiptTv;
                                                                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.paymentReceiptTv);
                                                                                                if (appCompatTextView10 != null) {
                                                                                                    i = R.id.paymentStatusTv;
                                                                                                    MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.paymentStatusTv);
                                                                                                    if (myTextView9 != null) {
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
                                                                                                                        MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.stateTv);
                                                                                                                        if (myTextView10 != null) {
                                                                                                                            i = R.id.stateValue;
                                                                                                                            AppCompatTextView appCompatTextView12 = (AppCompatTextView) zp7.a(view, R.id.stateValue);
                                                                                                                            if (appCompatTextView12 != null) {
                                                                                                                                i = R.id.titleTv;
                                                                                                                                AppCompatTextView appCompatTextView13 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                                                                                                                if (appCompatTextView13 != null) {
                                                                                                                                    i = R.id.topHolder;
                                                                                                                                    View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                                                    if (viewA2 != null) {
                                                                                                                                        d47 d47VarA = d47.a(viewA2);
                                                                                                                                        i = R.id.view2;
                                                                                                                                        View viewA3 = zp7.a(view, R.id.view2);
                                                                                                                                        if (viewA3 != null) {
                                                                                                                                            return new yp5((RelativeLayout) view, myTextView, appCompatTextView, myTextView2, appCompatTextView2, appCompatTextView3, checkedTextView, myTextView3, appCompatTextView4, appCompatTextView5, myTextView4, appCompatTextView6, linearLayout, myTextView5, appCompatTextView7, myTextView6, appCompatTextView8, expandableTextView, myTextView7, myTextView8, appCompatTextView9, linearLayout2, checkedTextView2, appCompatTextView10, myTextView9, appCompatTextView11, viewA, progressBar, checkedTextView3, myTextView10, appCompatTextView12, appCompatTextView13, d47VarA, viewA3);
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

    public static yp5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static yp5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.search_challan_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
