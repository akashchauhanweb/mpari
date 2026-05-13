package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ih {
    public final ScrollView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;
    public final MyTextView f;
    public final MyTextView g;
    public final LinearLayout h;
    public final MyTextView i;
    public final AppCompatTextView j;
    public final AppCompatTextView k;
    public final LinearLayout l;
    public final AppCompatImageView m;
    public final AppCompatTextView n;
    public final AppCompatTextView o;
    public final RelativeLayout p;
    public final AppCompatTextView q;
    public final AppCompatTextView r;
    public final d47 s;
    public final AppCompatTextView t;
    public final MyTextView u;

    public ih(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, MyTextView myTextView, MyTextView myTextView2, LinearLayout linearLayout, MyTextView myTextView3, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, d47 d47Var, AppCompatTextView appCompatTextView11, MyTextView myTextView4) {
        this.a = scrollView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = appCompatTextView3;
        this.e = appCompatTextView4;
        this.f = myTextView;
        this.g = myTextView2;
        this.h = linearLayout;
        this.i = myTextView3;
        this.j = appCompatTextView5;
        this.k = appCompatTextView6;
        this.l = linearLayout2;
        this.m = appCompatImageView;
        this.n = appCompatTextView7;
        this.o = appCompatTextView8;
        this.p = relativeLayout;
        this.q = appCompatTextView9;
        this.r = appCompatTextView10;
        this.s = d47Var;
        this.t = appCompatTextView11;
        this.u = myTextView4;
    }

    public static ih a(View view) {
        int i = R.id.amountTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.amountTv);
        if (appCompatTextView != null) {
            i = R.id.amountValueTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.amountValueTv);
            if (appCompatTextView2 != null) {
                i = R.id.applicationNoTv;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.applicationNoTv);
                if (appCompatTextView3 != null) {
                    i = R.id.applicationNoValueTv;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.applicationNoValueTv);
                    if (appCompatTextView4 != null) {
                        i = R.id.buttonTv;
                        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.buttonTv);
                        if (myTextView != null) {
                            i = R.id.downloadFormsTv;
                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.downloadFormsTv);
                            if (myTextView2 != null) {
                                i = R.id.liner_rec;
                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.liner_rec);
                                if (linearLayout != null) {
                                    i = R.id.next_button;
                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.next_button);
                                    if (myTextView3 != null) {
                                        i = R.id.ownerNameTv;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.ownerNameTv);
                                        if (appCompatTextView5 != null) {
                                            i = R.id.ownerNameValueTv;
                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.ownerNameValueTv);
                                            if (appCompatTextView6 != null) {
                                                i = R.id.parent_payment;
                                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.parent_payment);
                                                if (linearLayout2 != null) {
                                                    i = R.id.paymentResponseIv;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) zp7.a(view, R.id.paymentResponseIv);
                                                    if (appCompatImageView != null) {
                                                        i = R.id.receiptNoTv;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.receiptNoTv);
                                                        if (appCompatTextView7 != null) {
                                                            i = R.id.receiptNoValueTv;
                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.receiptNoValueTv);
                                                            if (appCompatTextView8 != null) {
                                                                i = R.id.receipt_relative;
                                                                RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.receipt_relative);
                                                                if (relativeLayout != null) {
                                                                    i = R.id.registrationNo;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.registrationNo);
                                                                    if (appCompatTextView9 != null) {
                                                                        i = R.id.registrationNoTv;
                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.registrationNoTv);
                                                                        if (appCompatTextView10 != null) {
                                                                            i = R.id.topHolder;
                                                                            View viewA = zp7.a(view, R.id.topHolder);
                                                                            if (viewA != null) {
                                                                                d47 d47VarA = d47.a(viewA);
                                                                                i = R.id.transactionStatusTv;
                                                                                AppCompatTextView appCompatTextView11 = (AppCompatTextView) zp7.a(view, R.id.transactionStatusTv);
                                                                                if (appCompatTextView11 != null) {
                                                                                    i = R.id.try_again;
                                                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.try_again);
                                                                                    if (myTextView4 != null) {
                                                                                        return new ih((ScrollView) view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, myTextView, myTextView2, linearLayout, myTextView3, appCompatTextView5, appCompatTextView6, linearLayout2, appCompatImageView, appCompatTextView7, appCompatTextView8, relativeLayout, appCompatTextView9, appCompatTextView10, d47VarA, appCompatTextView11, myTextView4);
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

    public static ih c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ih d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_payment_status_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
