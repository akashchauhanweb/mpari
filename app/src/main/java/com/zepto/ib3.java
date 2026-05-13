package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ib3 {
    public final ScrollView a;
    public final MyTextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final d47 e;
    public final CheckBox f;
    public final MyTextView g;
    public final RelativeLayout h;
    public final RelativeLayout i;
    public final LinearLayout j;
    public final MyTextView k;
    public final MyTextView l;
    public final MyTextView m;
    public final RecyclerView n;

    public ib3(ScrollView scrollView, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, d47 d47Var, CheckBox checkBox, MyTextView myTextView4, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, RecyclerView recyclerView) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = myTextView3;
        this.e = d47Var;
        this.f = checkBox;
        this.g = myTextView4;
        this.h = relativeLayout;
        this.i = relativeLayout2;
        this.j = linearLayout;
        this.k = myTextView5;
        this.l = myTextView6;
        this.m = myTextView7;
        this.n = recyclerView;
    }

    public static ib3 a(View view) {
        int i = R.id.applDateValue;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.applDateValue);
        if (myTextView != null) {
            i = R.id.applNoValue;
            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.applNoValue);
            if (myTextView2 != null) {
                i = R.id.applicantNameValue;
                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.applicantNameValue);
                if (myTextView3 != null) {
                    i = R.id.applicationStatusHeader;
                    View viewA = zp7.a(view, R.id.applicationStatusHeader);
                    if (viewA != null) {
                        d47 d47VarA = d47.a(viewA);
                        i = R.id.idAgreeTnC;
                        CheckBox checkBox = (CheckBox) zp7.a(view, R.id.idAgreeTnC);
                        if (checkBox != null) {
                            i = R.id.idLayoutTitle;
                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.idLayoutTitle);
                            if (myTextView4 != null) {
                                i = R.id.idWithdraw;
                                RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.idWithdraw);
                                if (relativeLayout != null) {
                                    i = R.id.idWithdrawCancel;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) zp7.a(view, R.id.idWithdrawCancel);
                                    if (relativeLayout2 != null) {
                                        i = R.id.lowerBtn;
                                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.lowerBtn);
                                        if (linearLayout != null) {
                                            i = R.id.registrationNoValue;
                                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.registrationNoValue);
                                            if (myTextView5 != null) {
                                                i = R.id.rtoNameValue;
                                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.rtoNameValue);
                                                if (myTextView6 != null) {
                                                    i = R.id.stateValue;
                                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.stateValue);
                                                    if (myTextView7 != null) {
                                                        i = R.id.transcationRv;
                                                        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.transcationRv);
                                                        if (recyclerView != null) {
                                                            return new ib3((ScrollView) view, myTextView, myTextView2, myTextView3, d47VarA, checkBox, myTextView4, relativeLayout, relativeLayout2, linearLayout, myTextView5, myTextView6, myTextView7, recyclerView);
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

    public static ib3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ib3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_withdrawn_transaction_applied, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
