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
public final class v44 {
    public final AppCompatTextView A;
    public final RelativeLayout a;
    public final MyTextView b;
    public final AppCompatTextView c;
    public final MyTextView d;
    public final AppCompatTextView e;
    public final CheckedTextView f;
    public final MyTextView g;
    public final AppCompatTextView h;
    public final MyTextView i;
    public final AppCompatTextView j;
    public final LinearLayout k;
    public final MyTextView l;
    public final AppCompatTextView m;
    public final ExpandableTextView n;
    public final MyTextView o;
    public final CheckedTextView p;
    public final View q;
    public final ProgressBar r;
    public final MyTextView s;
    public final AppCompatTextView t;
    public final CheckedTextView u;
    public final MyTextView v;
    public final AppCompatTextView w;
    public final MyTextView x;
    public final AppCompatTextView y;
    public final d47 z;

    public v44(RelativeLayout relativeLayout, MyTextView myTextView, AppCompatTextView appCompatTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView2, CheckedTextView checkedTextView, MyTextView myTextView3, AppCompatTextView appCompatTextView3, MyTextView myTextView4, AppCompatTextView appCompatTextView4, LinearLayout linearLayout, MyTextView myTextView5, AppCompatTextView appCompatTextView5, ExpandableTextView expandableTextView, MyTextView myTextView6, CheckedTextView checkedTextView2, View view, ProgressBar progressBar, MyTextView myTextView7, AppCompatTextView appCompatTextView6, CheckedTextView checkedTextView3, MyTextView myTextView8, AppCompatTextView appCompatTextView7, MyTextView myTextView9, AppCompatTextView appCompatTextView8, d47 d47Var, AppCompatTextView appCompatTextView9) {
        this.a = relativeLayout;
        this.b = myTextView;
        this.c = appCompatTextView;
        this.d = myTextView2;
        this.e = appCompatTextView2;
        this.f = checkedTextView;
        this.g = myTextView3;
        this.h = appCompatTextView3;
        this.i = myTextView4;
        this.j = appCompatTextView4;
        this.k = linearLayout;
        this.l = myTextView5;
        this.m = appCompatTextView5;
        this.n = expandableTextView;
        this.o = myTextView6;
        this.p = checkedTextView2;
        this.q = view;
        this.r = progressBar;
        this.s = myTextView7;
        this.t = appCompatTextView6;
        this.u = checkedTextView3;
        this.v = myTextView8;
        this.w = appCompatTextView7;
        this.x = myTextView9;
        this.y = appCompatTextView8;
        this.z = d47Var;
        this.A = appCompatTextView9;
    }

    public static v44 a(View view) {
        int i = R.id.accusedNameTv;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.accusedNameTv);
        if (myTextView != null) {
            i = R.id.accusedNameValue;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.accusedNameValue);
            if (appCompatTextView != null) {
                i = R.id.challanDateTv;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.challanDateTv);
                if (myTextView2 != null) {
                    i = R.id.challanDateValue;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.challanDateValue);
                    if (appCompatTextView2 != null) {
                        i = R.id.challanDetailsCb;
                        CheckedTextView checkedTextView = (CheckedTextView) zp7.a(view, R.id.challanDetailsCb);
                        if (checkedTextView != null) {
                            i = R.id.challanPlaceTv;
                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.challanPlaceTv);
                            if (myTextView3 != null) {
                                i = R.id.challanPlaceValue;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.challanPlaceValue);
                                if (appCompatTextView3 != null) {
                                    i = R.id.challanTv;
                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.challanTv);
                                    if (myTextView4 != null) {
                                        i = R.id.challanValue;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.challanValue);
                                        if (appCompatTextView4 != null) {
                                            i = R.id.dlNoHolder;
                                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.dlNoHolder);
                                            if (linearLayout != null) {
                                                i = R.id.dlNoTv;
                                                MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.dlNoTv);
                                                if (myTextView5 != null) {
                                                    i = R.id.dlNoValue;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.dlNoValue);
                                                    if (appCompatTextView5 != null) {
                                                        i = R.id.expandableTv;
                                                        ExpandableTextView expandableTextView = (ExpandableTextView) zp7.a(view, R.id.expandableTv);
                                                        if (expandableTextView != null) {
                                                            i = R.id.offenceTv;
                                                            MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.offenceTv);
                                                            if (myTextView6 != null) {
                                                                i = R.id.paymentCb;
                                                                CheckedTextView checkedTextView2 = (CheckedTextView) zp7.a(view, R.id.paymentCb);
                                                                if (checkedTextView2 != null) {
                                                                    i = R.id.paymentView;
                                                                    View viewA = zp7.a(view, R.id.paymentView);
                                                                    if (viewA != null) {
                                                                        i = R.id.progressBar;
                                                                        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progressBar);
                                                                        if (progressBar != null) {
                                                                            i = R.id.rcNoTv;
                                                                            MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.rcNoTv);
                                                                            if (myTextView7 != null) {
                                                                                i = R.id.rcNoValue;
                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.rcNoValue);
                                                                                if (appCompatTextView6 != null) {
                                                                                    i = R.id.receiptCb;
                                                                                    CheckedTextView checkedTextView3 = (CheckedTextView) zp7.a(view, R.id.receiptCb);
                                                                                    if (checkedTextView3 != null) {
                                                                                        i = R.id.stateTv;
                                                                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.stateTv);
                                                                                        if (myTextView8 != null) {
                                                                                            i = R.id.stateValue;
                                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.stateValue);
                                                                                            if (appCompatTextView7 != null) {
                                                                                                i = R.id.statusTv;
                                                                                                MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.statusTv);
                                                                                                if (myTextView9 != null) {
                                                                                                    i = R.id.statusValue;
                                                                                                    AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.statusValue);
                                                                                                    if (appCompatTextView8 != null) {
                                                                                                        i = R.id.topHolder;
                                                                                                        View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                        if (viewA2 != null) {
                                                                                                            d47 d47VarA = d47.a(viewA2);
                                                                                                            i = R.id.viewMoreTv;
                                                                                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.viewMoreTv);
                                                                                                            if (appCompatTextView9 != null) {
                                                                                                                return new v44((RelativeLayout) view, myTextView, appCompatTextView, myTextView2, appCompatTextView2, checkedTextView, myTextView3, appCompatTextView3, myTextView4, appCompatTextView4, linearLayout, myTextView5, appCompatTextView5, expandableTextView, myTextView6, checkedTextView2, viewA, progressBar, myTextView7, appCompatTextView6, checkedTextView3, myTextView8, appCompatTextView7, myTextView9, appCompatTextView8, d47VarA, appCompatTextView9);
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

    public static v44 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static v44 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.new_challan_details_less_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
