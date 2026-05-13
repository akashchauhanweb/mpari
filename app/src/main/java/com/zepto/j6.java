package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j6 {
    public final ConstraintLayout a;
    public final ProgressBar b;
    public final MyTextView c;
    public final MyTextView d;
    public final MyTextView e;
    public final MyTextView f;
    public final MyTextView g;
    public final TextView h;
    public final TextView i;
    public final MyTextView j;
    public final ri5 k;
    public final ConstraintLayout l;
    public final LinearLayout m;
    public final MyTextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final MyTextView q;
    public final MyTextView r;
    public final MyTextView s;
    public final AppCompatTextView t;
    public final AppCompatTextView u;

    public j6(ConstraintLayout constraintLayout, ProgressBar progressBar, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, TextView textView, TextView textView2, MyTextView myTextView6, ri5 ri5Var, ConstraintLayout constraintLayout2, LinearLayout linearLayout, MyTextView myTextView7, MyTextView myTextView8, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.a = constraintLayout;
        this.b = progressBar;
        this.c = myTextView;
        this.d = myTextView2;
        this.e = myTextView3;
        this.f = myTextView4;
        this.g = myTextView5;
        this.h = textView;
        this.i = textView2;
        this.j = myTextView6;
        this.k = ri5Var;
        this.l = constraintLayout2;
        this.m = linearLayout;
        this.n = myTextView7;
        this.o = myTextView8;
        this.p = myTextView9;
        this.q = myTextView10;
        this.r = myTextView11;
        this.s = myTextView12;
        this.t = appCompatTextView;
        this.u = appCompatTextView2;
    }

    public static j6 a(View view) {
        int i = R.id.app_prog;
        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.app_prog);
        if (progressBar != null) {
            i = R.id.applicantName;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.applicantName);
            if (myTextView != null) {
                i = R.id.applicantNameTl;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.applicantNameTl);
                if (myTextView2 != null) {
                    i = R.id.applicationDate;
                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.applicationDate);
                    if (myTextView3 != null) {
                        i = R.id.applicationDateTl;
                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.applicationDateTl);
                        if (myTextView4 != null) {
                            i = R.id.applicationNo;
                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.applicationNo);
                            if (myTextView5 != null) {
                                i = R.id.btnCancel;
                                TextView textView = (TextView) zp7.a(view, R.id.btnCancel);
                                if (textView != null) {
                                    i = R.id.btnConfirm;
                                    TextView textView2 = (TextView) zp7.a(view, R.id.btnConfirm);
                                    if (textView2 != null) {
                                        i = R.id.duplicateDLTl;
                                        MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.duplicateDLTl);
                                        if (myTextView6 != null) {
                                            i = R.id.include3;
                                            View viewA = zp7.a(view, R.id.include3);
                                            if (viewA != null) {
                                                ri5 ri5VarA = ri5.a(viewA);
                                                i = R.id.layout;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) zp7.a(view, R.id.layout);
                                                if (constraintLayout != null) {
                                                    i = R.id.layoutbottom;
                                                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.layoutbottom);
                                                    if (linearLayout != null) {
                                                        i = R.id.myApplicationNoTl;
                                                        MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.myApplicationNoTl);
                                                        if (myTextView7 != null) {
                                                            i = R.id.renewalDLTl;
                                                            MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.renewalDLTl);
                                                            if (myTextView8 != null) {
                                                                i = R.id.rtoName;
                                                                MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.rtoName);
                                                                if (myTextView9 != null) {
                                                                    i = R.id.rtoNameTl;
                                                                    MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.rtoNameTl);
                                                                    if (myTextView10 != null) {
                                                                        i = R.id.stateName;
                                                                        MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.stateName);
                                                                        if (myTextView11 != null) {
                                                                            i = R.id.stateNameTl;
                                                                            MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.stateNameTl);
                                                                            if (myTextView12 != null) {
                                                                                i = R.id.topTitleTv;
                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                                                                if (appCompatTextView != null) {
                                                                                    i = R.id.trans_applied_TitleTv;
                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.trans_applied_TitleTv);
                                                                                    if (appCompatTextView2 != null) {
                                                                                        return new j6((ConstraintLayout) view, progressBar, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, textView, textView2, myTextView6, ri5VarA, constraintLayout, linearLayout, myTextView7, myTextView8, myTextView9, myTextView10, myTextView11, myTextView12, appCompatTextView, appCompatTextView2);
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

    public static j6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static j6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_app_details_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
