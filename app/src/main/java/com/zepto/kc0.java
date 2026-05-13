package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kc0 {
    public final ScrollView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final MyTextView d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final AppCompatImageView g;
    public final d47 h;
    public final AppCompatTextView i;
    public final AppCompatTextView j;
    public final AppCompatTextView k;

    public kc0(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MyTextView myTextView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView, d47 d47Var, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        this.a = scrollView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = myTextView;
        this.e = appCompatTextView3;
        this.f = appCompatTextView4;
        this.g = appCompatImageView;
        this.h = d47Var;
        this.i = appCompatTextView5;
        this.j = appCompatTextView6;
        this.k = appCompatTextView7;
    }

    public static kc0 a(View view) {
        int i = R.id.amountTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.amountTv);
        if (appCompatTextView != null) {
            i = R.id.amountValueTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.amountValueTv);
            if (appCompatTextView2 != null) {
                i = R.id.buttonTv;
                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.buttonTv);
                if (myTextView != null) {
                    i = R.id.challanNoTv;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.challanNoTv);
                    if (appCompatTextView3 != null) {
                        i = R.id.challanNoValueTv;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.challanNoValueTv);
                        if (appCompatTextView4 != null) {
                            i = R.id.paymentResponseIv;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) zp7.a(view, R.id.paymentResponseIv);
                            if (appCompatImageView != null) {
                                i = R.id.topHolder;
                                View viewA = zp7.a(view, R.id.topHolder);
                                if (viewA != null) {
                                    d47 d47VarA = d47.a(viewA);
                                    i = R.id.transactionStatusTv;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.transactionStatusTv);
                                    if (appCompatTextView5 != null) {
                                        i = R.id.vehcileNoValueTv;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.vehcileNoValueTv);
                                        if (appCompatTextView6 != null) {
                                            i = R.id.vehicleNoTv;
                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.vehicleNoTv);
                                            if (appCompatTextView7 != null) {
                                                return new kc0((ScrollView) view, appCompatTextView, appCompatTextView2, myTextView, appCompatTextView3, appCompatTextView4, appCompatImageView, d47VarA, appCompatTextView5, appCompatTextView6, appCompatTextView7);
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

    public static kc0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static kc0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.challan_demo_response_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
