package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yh {
    public final ConstraintLayout a;
    public final MyTextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final MyTextView e;
    public final MyTextView f;
    public final AppCompatTextView g;
    public final CheckBox h;
    public final CheckBox i;
    public final CheckBox j;
    public final ri5 k;
    public final MyTextView l;
    public final MyTextView m;
    public final MyTextView n;
    public final MyTextView o;
    public final AppCompatSpinner p;
    public final AppCompatSpinner q;
    public final MyTextView r;
    public final MyTextView s;
    public final AppCompatTextView t;
    public final AppCompatTextView u;
    public final MyTextView v;
    public final AppCompatTextView w;

    public yh(ConstraintLayout constraintLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, AppCompatTextView appCompatTextView, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, ri5 ri5Var, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, MyTextView myTextView9, AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, MyTextView myTextView10, MyTextView myTextView11, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, MyTextView myTextView12, AppCompatTextView appCompatTextView4) {
        this.a = constraintLayout;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = myTextView3;
        this.e = myTextView4;
        this.f = myTextView5;
        this.g = appCompatTextView;
        this.h = checkBox;
        this.i = checkBox2;
        this.j = checkBox3;
        this.k = ri5Var;
        this.l = myTextView6;
        this.m = myTextView7;
        this.n = myTextView8;
        this.o = myTextView9;
        this.p = appCompatSpinner;
        this.q = appCompatSpinner2;
        this.r = myTextView10;
        this.s = myTextView11;
        this.t = appCompatTextView2;
        this.u = appCompatTextView3;
        this.v = myTextView12;
        this.w = appCompatTextView4;
    }

    public static yh a(View view) {
        int i = R.id.applicantName;
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
                            i = R.id.cancelTv;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.cancelTv);
                            if (appCompatTextView != null) {
                                i = R.id.checkBox;
                                CheckBox checkBox = (CheckBox) zp7.a(view, R.id.checkBox);
                                if (checkBox != null) {
                                    i = R.id.check_duplDL;
                                    CheckBox checkBox2 = (CheckBox) zp7.a(view, R.id.check_duplDL);
                                    if (checkBox2 != null) {
                                        i = R.id.check_renewalDL;
                                        CheckBox checkBox3 = (CheckBox) zp7.a(view, R.id.check_renewalDL);
                                        if (checkBox3 != null) {
                                            i = R.id.include3;
                                            View viewA = zp7.a(view, R.id.include3);
                                            if (viewA != null) {
                                                ri5 ri5VarA = ri5.a(viewA);
                                                i = R.id.myApplicationNoTl;
                                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.myApplicationNoTl);
                                                if (myTextView6 != null) {
                                                    i = R.id.reason_remarkTl;
                                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.reason_remarkTl);
                                                    if (myTextView7 != null) {
                                                        i = R.id.rtoName;
                                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.rtoName);
                                                        if (myTextView8 != null) {
                                                            i = R.id.rtoNameTl;
                                                            MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.rtoNameTl);
                                                            if (myTextView9 != null) {
                                                                i = R.id.spinner_duplDL;
                                                                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) zp7.a(view, R.id.spinner_duplDL);
                                                                if (appCompatSpinner != null) {
                                                                    i = R.id.spinner_renewalDL;
                                                                    AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) zp7.a(view, R.id.spinner_renewalDL);
                                                                    if (appCompatSpinner2 != null) {
                                                                        i = R.id.stateName;
                                                                        MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.stateName);
                                                                        if (myTextView10 != null) {
                                                                            i = R.id.stateNameTl;
                                                                            MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.stateNameTl);
                                                                            if (myTextView11 != null) {
                                                                                i = R.id.topTitleTv;
                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                                                                if (appCompatTextView2 != null) {
                                                                                    i = R.id.trans_applied_TitleTv;
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.trans_applied_TitleTv);
                                                                                    if (appCompatTextView3 != null) {
                                                                                        i = R.id.transNameTl;
                                                                                        MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.transNameTl);
                                                                                        if (myTextView12 != null) {
                                                                                            i = R.id.withDrawTv;
                                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.withDrawTv);
                                                                                            if (appCompatTextView4 != null) {
                                                                                                return new yh((ConstraintLayout) view, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, appCompatTextView, checkBox, checkBox2, checkBox3, ri5VarA, myTextView6, myTextView7, myTextView8, myTextView9, appCompatSpinner, appCompatSpinner2, myTextView10, myTextView11, appCompatTextView2, appCompatTextView3, myTextView12, appCompatTextView4);
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

    public static yh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static yh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_withdraw_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
