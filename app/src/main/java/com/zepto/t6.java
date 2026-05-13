package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class t6 {
    public final MyTextView A;
    public final MyTextView B;
    public final LinearLayout C;
    public final MyTextView D;
    public final MyTextView E;
    public final CoordinatorLayout a;
    public final MyTextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final LinearLayout e;
    public final MyTextView f;
    public final MyTextView g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final MyTextView j;
    public final MyTextView k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final MyTextView n;
    public final LinearLayout o;
    public final MyTextView p;
    public final ri5 q;
    public final MyTextView r;
    public final MyTextView s;
    public final MyTextView t;
    public final MyTextView u;
    public final MyTextView v;
    public final MyTextView w;
    public final MyTextView x;
    public final AppCompatTextView y;
    public final MyTextView z;

    public t6(CoordinatorLayout coordinatorLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, LinearLayout linearLayout, MyTextView myTextView4, MyTextView myTextView5, LinearLayout linearLayout2, LinearLayout linearLayout3, MyTextView myTextView6, MyTextView myTextView7, LinearLayout linearLayout4, LinearLayout linearLayout5, MyTextView myTextView8, LinearLayout linearLayout6, MyTextView myTextView9, ri5 ri5Var, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14, MyTextView myTextView15, MyTextView myTextView16, AppCompatTextView appCompatTextView, MyTextView myTextView17, MyTextView myTextView18, MyTextView myTextView19, LinearLayout linearLayout7, MyTextView myTextView20, MyTextView myTextView21) {
        this.a = coordinatorLayout;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = myTextView3;
        this.e = linearLayout;
        this.f = myTextView4;
        this.g = myTextView5;
        this.h = linearLayout2;
        this.i = linearLayout3;
        this.j = myTextView6;
        this.k = myTextView7;
        this.l = linearLayout4;
        this.m = linearLayout5;
        this.n = myTextView8;
        this.o = linearLayout6;
        this.p = myTextView9;
        this.q = ri5Var;
        this.r = myTextView10;
        this.s = myTextView11;
        this.t = myTextView12;
        this.u = myTextView13;
        this.v = myTextView14;
        this.w = myTextView15;
        this.x = myTextView16;
        this.y = appCompatTextView;
        this.z = myTextView17;
        this.A = myTextView18;
        this.B = myTextView19;
        this.C = linearLayout7;
        this.D = myTextView20;
        this.E = myTextView21;
    }

    public static t6 a(View view) {
        int i = R.id.amount;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.amount);
        if (myTextView != null) {
            i = R.id.applicationDate;
            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.applicationDate);
            if (myTextView2 != null) {
                i = R.id.challan_amount;
                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.challan_amount);
                if (myTextView3 != null) {
                    i = R.id.challan_amount_linear;
                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.challan_amount_linear);
                    if (linearLayout != null) {
                        i = R.id.challan_date;
                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.challan_date);
                        if (myTextView4 != null) {
                            i = R.id.challan_number;
                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.challan_number);
                            if (myTextView5 != null) {
                                i = R.id.challan_paymentdate_linear;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.challan_paymentdate_linear);
                                if (linearLayout2 != null) {
                                    i = R.id.challan_receipt_linear;
                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.challan_receipt_linear);
                                    if (linearLayout3 != null) {
                                        i = R.id.challan_state;
                                        MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.challan_state);
                                        if (myTextView6 != null) {
                                            i = R.id.challan_status;
                                            MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.challan_status);
                                            if (myTextView7 != null) {
                                                i = R.id.challan_status_linear;
                                                LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.challan_status_linear);
                                                if (linearLayout4 != null) {
                                                    i = R.id.challan_transation_linear;
                                                    LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.challan_transation_linear);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.dl_number_txt;
                                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.dl_number_txt);
                                                        if (myTextView8 != null) {
                                                            i = R.id.driving_linear;
                                                            LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.driving_linear);
                                                            if (linearLayout6 != null) {
                                                                i = R.id.drivinglic_no;
                                                                MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.drivinglic_no);
                                                                if (myTextView9 != null) {
                                                                    i = R.id.include3;
                                                                    View viewA = zp7.a(view, R.id.include3);
                                                                    if (viewA != null) {
                                                                        ri5 ri5VarA = ri5.a(viewA);
                                                                        i = R.id.offence;
                                                                        MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.offence);
                                                                        if (myTextView10 != null) {
                                                                            i = R.id.payment_date;
                                                                            MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.payment_date);
                                                                            if (myTextView11 != null) {
                                                                                i = R.id.payment_date_text;
                                                                                MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.payment_date_text);
                                                                                if (myTextView12 != null) {
                                                                                    i = R.id.receiptNo;
                                                                                    MyTextView myTextView13 = (MyTextView) zp7.a(view, R.id.receiptNo);
                                                                                    if (myTextView13 != null) {
                                                                                        i = R.id.receipt_number_Text;
                                                                                        MyTextView myTextView14 = (MyTextView) zp7.a(view, R.id.receipt_number_Text);
                                                                                        if (myTextView14 != null) {
                                                                                            i = R.id.state;
                                                                                            MyTextView myTextView15 = (MyTextView) zp7.a(view, R.id.state);
                                                                                            if (myTextView15 != null) {
                                                                                                i = R.id.status;
                                                                                                MyTextView myTextView16 = (MyTextView) zp7.a(view, R.id.status);
                                                                                                if (myTextView16 != null) {
                                                                                                    i = R.id.topTitleTv;
                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                                                                                    if (appCompatTextView != null) {
                                                                                                        i = R.id.transation_id;
                                                                                                        MyTextView myTextView17 = (MyTextView) zp7.a(view, R.id.transation_id);
                                                                                                        if (myTextView17 != null) {
                                                                                                            i = R.id.transation_id_txt;
                                                                                                            MyTextView myTextView18 = (MyTextView) zp7.a(view, R.id.transation_id_txt);
                                                                                                            if (myTextView18 != null) {
                                                                                                                i = R.id.tvvehicleno;
                                                                                                                MyTextView myTextView19 = (MyTextView) zp7.a(view, R.id.tvvehicleno);
                                                                                                                if (myTextView19 != null) {
                                                                                                                    i = R.id.vehicle_linear;
                                                                                                                    LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.vehicle_linear);
                                                                                                                    if (linearLayout7 != null) {
                                                                                                                        i = R.id.vehicle_number;
                                                                                                                        MyTextView myTextView20 = (MyTextView) zp7.a(view, R.id.vehicle_number);
                                                                                                                        if (myTextView20 != null) {
                                                                                                                            i = R.id.vehicleno;
                                                                                                                            MyTextView myTextView21 = (MyTextView) zp7.a(view, R.id.vehicleno);
                                                                                                                            if (myTextView21 != null) {
                                                                                                                                return new t6((CoordinatorLayout) view, myTextView, myTextView2, myTextView3, linearLayout, myTextView4, myTextView5, linearLayout2, linearLayout3, myTextView6, myTextView7, linearLayout4, linearLayout5, myTextView8, linearLayout6, myTextView9, ri5VarA, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14, myTextView15, myTextView16, appCompatTextView, myTextView17, myTextView18, myTextView19, linearLayout7, myTextView20, myTextView21);
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

    public static t6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static t6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_challan_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
