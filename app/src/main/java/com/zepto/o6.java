package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o6 {
    public final MyTextView A;
    public final TextView B;
    public final TextView C;
    public final MyTextView D;
    public final MyTextView E;
    public final MyTextView F;
    public final MyTextView G;
    public final RecyclerView H;
    public final RecyclerView I;
    public final MyTextView J;
    public final MyTextView K;
    public final MyTextView L;
    public final com.nic.mparivahan.dlservices.widget.MyTextView M;
    public final AppCompatTextView N;
    public final AppCompatTextView O;
    public final AppCompatTextView P;
    public final MyTextView Q;
    public final MyTextView R;
    public final View S;
    public final View T;
    public final View U;
    public final View V;
    public final ConstraintLayout a;
    public final ProgressBar b;
    public final MyTextView c;
    public final MyTextView d;
    public final MyTextView e;
    public final MyTextView f;
    public final MyTextView g;
    public final MyTextView h;
    public final AppCompatTextView i;
    public final CheckBox j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final MyTextView p;
    public final AppCompatTextView q;
    public final MyTextView r;
    public final MyTextView s;
    public final MyTextView t;
    public final ri5 u;
    public final NestedScrollView v;
    public final MyTextView w;
    public final LinearLayout x;
    public final MyTextView y;
    public final MyTextView z;

    public o6(ConstraintLayout constraintLayout, ProgressBar progressBar, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, AppCompatTextView appCompatTextView, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, MyTextView myTextView7, AppCompatTextView appCompatTextView2, MyTextView myTextView8, MyTextView myTextView9, MyTextView myTextView10, ri5 ri5Var, NestedScrollView nestedScrollView, MyTextView myTextView11, LinearLayout linearLayout, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14, TextView textView6, TextView textView7, MyTextView myTextView15, MyTextView myTextView16, MyTextView myTextView17, MyTextView myTextView18, RecyclerView recyclerView, RecyclerView recyclerView2, MyTextView myTextView19, MyTextView myTextView20, MyTextView myTextView21, com.nic.mparivahan.dlservices.widget.MyTextView myTextView22, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, MyTextView myTextView23, MyTextView myTextView24, View view, View view2, View view3, View view4) {
        this.a = constraintLayout;
        this.b = progressBar;
        this.c = myTextView;
        this.d = myTextView2;
        this.e = myTextView3;
        this.f = myTextView4;
        this.g = myTextView5;
        this.h = myTextView6;
        this.i = appCompatTextView;
        this.j = checkBox;
        this.k = textView;
        this.l = textView2;
        this.m = textView3;
        this.n = textView4;
        this.o = textView5;
        this.p = myTextView7;
        this.q = appCompatTextView2;
        this.r = myTextView8;
        this.s = myTextView9;
        this.t = myTextView10;
        this.u = ri5Var;
        this.v = nestedScrollView;
        this.w = myTextView11;
        this.x = linearLayout;
        this.y = myTextView12;
        this.z = myTextView13;
        this.A = myTextView14;
        this.B = textView6;
        this.C = textView7;
        this.D = myTextView15;
        this.E = myTextView16;
        this.F = myTextView17;
        this.G = myTextView18;
        this.H = recyclerView;
        this.I = recyclerView2;
        this.J = myTextView19;
        this.K = myTextView20;
        this.L = myTextView21;
        this.M = myTextView22;
        this.N = appCompatTextView3;
        this.O = appCompatTextView4;
        this.P = appCompatTextView5;
        this.Q = myTextView23;
        this.R = myTextView24;
        this.S = view;
        this.T = view2;
        this.U = view3;
        this.V = view4;
    }

    public static o6 a(View view) {
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
                                i = R.id.applicationSubTl;
                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.applicationSubTl);
                                if (myTextView6 != null) {
                                    i = R.id.cancelTv;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.cancelTv);
                                    if (appCompatTextView != null) {
                                        i = R.id.checkBox;
                                        CheckBox checkBox = (CheckBox) zp7.a(view, R.id.checkBox);
                                        if (checkBox != null) {
                                            i = R.id.circle_image_five;
                                            TextView textView = (TextView) zp7.a(view, R.id.circle_image_five);
                                            if (textView != null) {
                                                i = R.id.circle_image_four;
                                                TextView textView2 = (TextView) zp7.a(view, R.id.circle_image_four);
                                                if (textView2 != null) {
                                                    i = R.id.circle_image_one;
                                                    TextView textView3 = (TextView) zp7.a(view, R.id.circle_image_one);
                                                    if (textView3 != null) {
                                                        i = R.id.circle_image_three;
                                                        TextView textView4 = (TextView) zp7.a(view, R.id.circle_image_three);
                                                        if (textView4 != null) {
                                                            i = R.id.circle_image_two;
                                                            TextView textView5 = (TextView) zp7.a(view, R.id.circle_image_two);
                                                            if (textView5 != null) {
                                                                i = R.id.completeTl;
                                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.completeTl);
                                                                if (myTextView7 != null) {
                                                                    i = R.id.disposeTv;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.disposeTv);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = R.id.duplicateDLTl;
                                                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.duplicateDLTl);
                                                                        if (myTextView8 != null) {
                                                                            i = R.id.feePaymentTl;
                                                                            MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.feePaymentTl);
                                                                            if (myTextView9 != null) {
                                                                                i = R.id.floatBtn;
                                                                                MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.floatBtn);
                                                                                if (myTextView10 != null) {
                                                                                    i = R.id.include3;
                                                                                    View viewA = zp7.a(view, R.id.include3);
                                                                                    if (viewA != null) {
                                                                                        ri5 ri5VarA = ri5.a(viewA);
                                                                                        i = R.id.linear_parent;
                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) zp7.a(view, R.id.linear_parent);
                                                                                        if (nestedScrollView != null) {
                                                                                            i = R.id.myApplicationNoTl;
                                                                                            MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.myApplicationNoTl);
                                                                                            if (myTextView11 != null) {
                                                                                                i = R.id.newlayout;
                                                                                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.newlayout);
                                                                                                if (linearLayout != null) {
                                                                                                    i = R.id.pendingT1;
                                                                                                    MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.pendingT1);
                                                                                                    if (myTextView12 != null) {
                                                                                                        i = R.id.pendingT2;
                                                                                                        MyTextView myTextView13 = (MyTextView) zp7.a(view, R.id.pendingT2);
                                                                                                        if (myTextView13 != null) {
                                                                                                            i = R.id.pendingT3;
                                                                                                            MyTextView myTextView14 = (MyTextView) zp7.a(view, R.id.pendingT3);
                                                                                                            if (myTextView14 != null) {
                                                                                                                i = R.id.present_status;
                                                                                                                TextView textView6 = (TextView) zp7.a(view, R.id.present_status);
                                                                                                                if (textView6 != null) {
                                                                                                                    i = R.id.present_status_val;
                                                                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.present_status_val);
                                                                                                                    if (textView7 != null) {
                                                                                                                        i = R.id.proceedTl;
                                                                                                                        MyTextView myTextView15 = (MyTextView) zp7.a(view, R.id.proceedTl);
                                                                                                                        if (myTextView15 != null) {
                                                                                                                            i = R.id.renewalDLTl;
                                                                                                                            MyTextView myTextView16 = (MyTextView) zp7.a(view, R.id.renewalDLTl);
                                                                                                                            if (myTextView16 != null) {
                                                                                                                                i = R.id.rtoName;
                                                                                                                                MyTextView myTextView17 = (MyTextView) zp7.a(view, R.id.rtoName);
                                                                                                                                if (myTextView17 != null) {
                                                                                                                                    i = R.id.rtoNameTl;
                                                                                                                                    MyTextView myTextView18 = (MyTextView) zp7.a(view, R.id.rtoNameTl);
                                                                                                                                    if (myTextView18 != null) {
                                                                                                                                        i = R.id.rv_app_status;
                                                                                                                                        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rv_app_status);
                                                                                                                                        if (recyclerView != null) {
                                                                                                                                            i = R.id.rv_app_status_two;
                                                                                                                                            RecyclerView recyclerView2 = (RecyclerView) zp7.a(view, R.id.rv_app_status_two);
                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                i = R.id.slotBookingTl;
                                                                                                                                                MyTextView myTextView19 = (MyTextView) zp7.a(view, R.id.slotBookingTl);
                                                                                                                                                if (myTextView19 != null) {
                                                                                                                                                    i = R.id.stateName;
                                                                                                                                                    MyTextView myTextView20 = (MyTextView) zp7.a(view, R.id.stateName);
                                                                                                                                                    if (myTextView20 != null) {
                                                                                                                                                        i = R.id.stateNameTl;
                                                                                                                                                        MyTextView myTextView21 = (MyTextView) zp7.a(view, R.id.stateNameTl);
                                                                                                                                                        if (myTextView21 != null) {
                                                                                                                                                            i = R.id.submitted_tv;
                                                                                                                                                            com.nic.mparivahan.dlservices.widget.MyTextView myTextView22 = (com.nic.mparivahan.dlservices.widget.MyTextView) zp7.a(view, R.id.submitted_tv);
                                                                                                                                                            if (myTextView22 != null) {
                                                                                                                                                                i = R.id.topTitleTv;
                                                                                                                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                                                                                                                                                if (appCompatTextView3 != null) {
                                                                                                                                                                    i = R.id.trans_applied_TitleTv;
                                                                                                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.trans_applied_TitleTv);
                                                                                                                                                                    if (appCompatTextView4 != null) {
                                                                                                                                                                        i = R.id.trans_status_TitleTv;
                                                                                                                                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.trans_status_TitleTv);
                                                                                                                                                                        if (appCompatTextView5 != null) {
                                                                                                                                                                            i = R.id.uploadDMS;
                                                                                                                                                                            MyTextView myTextView23 = (MyTextView) zp7.a(view, R.id.uploadDMS);
                                                                                                                                                                            if (myTextView23 != null) {
                                                                                                                                                                                i = R.id.uploadPhotos;
                                                                                                                                                                                MyTextView myTextView24 = (MyTextView) zp7.a(view, R.id.uploadPhotos);
                                                                                                                                                                                if (myTextView24 != null) {
                                                                                                                                                                                    i = R.id.view_four;
                                                                                                                                                                                    View viewA2 = zp7.a(view, R.id.view_four);
                                                                                                                                                                                    if (viewA2 != null) {
                                                                                                                                                                                        i = R.id.view_one;
                                                                                                                                                                                        View viewA3 = zp7.a(view, R.id.view_one);
                                                                                                                                                                                        if (viewA3 != null) {
                                                                                                                                                                                            i = R.id.view_three;
                                                                                                                                                                                            View viewA4 = zp7.a(view, R.id.view_three);
                                                                                                                                                                                            if (viewA4 != null) {
                                                                                                                                                                                                i = R.id.view_two;
                                                                                                                                                                                                View viewA5 = zp7.a(view, R.id.view_two);
                                                                                                                                                                                                if (viewA5 != null) {
                                                                                                                                                                                                    return new o6((ConstraintLayout) view, progressBar, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, appCompatTextView, checkBox, textView, textView2, textView3, textView4, textView5, myTextView7, appCompatTextView2, myTextView8, myTextView9, myTextView10, ri5VarA, nestedScrollView, myTextView11, linearLayout, myTextView12, myTextView13, myTextView14, textView6, textView7, myTextView15, myTextView16, myTextView17, myTextView18, recyclerView, recyclerView2, myTextView19, myTextView20, myTextView21, myTextView22, appCompatTextView3, appCompatTextView4, appCompatTextView5, myTextView23, myTextView24, viewA2, viewA3, viewA4, viewA5);
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

    public static o6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static o6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_application_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
