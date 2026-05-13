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
public final class h7 {
    public final MyTextView A;
    public final MyTextView B;
    public final LinearLayout C;
    public final MyTextView D;
    public final AppCompatTextView E;
    public final MyTextView F;
    public final MyTextView G;
    public final LinearLayout H;
    public final MyTextView I;
    public final MyTextView J;
    public final MyTextView K;
    public final MyTextView L;
    public final LinearLayout M;
    public final MyTextView N;
    public final CoordinatorLayout a;
    public final MyTextView b;
    public final LinearLayout c;
    public final MyTextView d;
    public final MyTextView e;
    public final LinearLayout f;
    public final MyTextView g;
    public final ri5 h;
    public final MyTextView i;
    public final MyTextView j;
    public final LinearLayout k;
    public final MyTextView l;
    public final MyTextView m;
    public final LinearLayout n;
    public final MyTextView o;
    public final MyTextView p;
    public final LinearLayout q;
    public final MyTextView r;
    public final MyTextView s;
    public final LinearLayout t;
    public final MyTextView u;
    public final MyTextView v;
    public final LinearLayout w;
    public final MyTextView x;
    public final MyTextView y;
    public final LinearLayout z;

    public h7(CoordinatorLayout coordinatorLayout, MyTextView myTextView, LinearLayout linearLayout, MyTextView myTextView2, MyTextView myTextView3, LinearLayout linearLayout2, MyTextView myTextView4, ri5 ri5Var, MyTextView myTextView5, MyTextView myTextView6, LinearLayout linearLayout3, MyTextView myTextView7, MyTextView myTextView8, LinearLayout linearLayout4, MyTextView myTextView9, MyTextView myTextView10, LinearLayout linearLayout5, MyTextView myTextView11, MyTextView myTextView12, LinearLayout linearLayout6, MyTextView myTextView13, MyTextView myTextView14, LinearLayout linearLayout7, MyTextView myTextView15, MyTextView myTextView16, LinearLayout linearLayout8, MyTextView myTextView17, MyTextView myTextView18, LinearLayout linearLayout9, MyTextView myTextView19, AppCompatTextView appCompatTextView, MyTextView myTextView20, MyTextView myTextView21, LinearLayout linearLayout10, MyTextView myTextView22, MyTextView myTextView23, MyTextView myTextView24, MyTextView myTextView25, LinearLayout linearLayout11, MyTextView myTextView26) {
        this.a = coordinatorLayout;
        this.b = myTextView;
        this.c = linearLayout;
        this.d = myTextView2;
        this.e = myTextView3;
        this.f = linearLayout2;
        this.g = myTextView4;
        this.h = ri5Var;
        this.i = myTextView5;
        this.j = myTextView6;
        this.k = linearLayout3;
        this.l = myTextView7;
        this.m = myTextView8;
        this.n = linearLayout4;
        this.o = myTextView9;
        this.p = myTextView10;
        this.q = linearLayout5;
        this.r = myTextView11;
        this.s = myTextView12;
        this.t = linearLayout6;
        this.u = myTextView13;
        this.v = myTextView14;
        this.w = linearLayout7;
        this.x = myTextView15;
        this.y = myTextView16;
        this.z = linearLayout8;
        this.A = myTextView17;
        this.B = myTextView18;
        this.C = linearLayout9;
        this.D = myTextView19;
        this.E = appCompatTextView;
        this.F = myTextView20;
        this.G = myTextView21;
        this.H = linearLayout10;
        this.I = myTextView22;
        this.J = myTextView23;
        this.K = myTextView24;
        this.L = myTextView25;
        this.M = linearLayout11;
        this.N = myTextView26;
    }

    public static h7 a(View view) {
        int i = R.id.amount;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.amount);
        if (myTextView != null) {
            i = R.id.amount_linear;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.amount_linear);
            if (linearLayout != null) {
                i = R.id.amount_txt;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.amount_txt);
                if (myTextView2 != null) {
                    i = R.id.chasis_no;
                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.chasis_no);
                    if (myTextView3 != null) {
                        i = R.id.chasis_no_linear;
                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.chasis_no_linear);
                        if (linearLayout2 != null) {
                            i = R.id.chassis_no_txt;
                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.chassis_no_txt);
                            if (myTextView4 != null) {
                                i = R.id.include3;
                                View viewA = zp7.a(view, R.id.include3);
                                if (viewA != null) {
                                    ri5 ri5VarA = ri5.a(viewA);
                                    i = R.id.owner_name;
                                    MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.owner_name);
                                    if (myTextView5 != null) {
                                        i = R.id.payment_date;
                                        MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.payment_date);
                                        if (myTextView6 != null) {
                                            i = R.id.payment_date_linear;
                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.payment_date_linear);
                                            if (linearLayout3 != null) {
                                                i = R.id.payment_date_text;
                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.payment_date_text);
                                                if (myTextView7 != null) {
                                                    i = R.id.payment_mode;
                                                    MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.payment_mode);
                                                    if (myTextView8 != null) {
                                                        i = R.id.payment_mode_linear;
                                                        LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.payment_mode_linear);
                                                        if (linearLayout4 != null) {
                                                            i = R.id.payment_mode_txt;
                                                            MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.payment_mode_txt);
                                                            if (myTextView9 != null) {
                                                                i = R.id.payment_status;
                                                                MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.payment_status);
                                                                if (myTextView10 != null) {
                                                                    i = R.id.payment_status_linear;
                                                                    LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.payment_status_linear);
                                                                    if (linearLayout5 != null) {
                                                                        i = R.id.payment_status_txt;
                                                                        MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.payment_status_txt);
                                                                        if (myTextView11 != null) {
                                                                            i = R.id.receipt_no;
                                                                            MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.receipt_no);
                                                                            if (myTextView12 != null) {
                                                                                i = R.id.receipt_number_linear;
                                                                                LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.receipt_number_linear);
                                                                                if (linearLayout6 != null) {
                                                                                    i = R.id.receipt_number_Text;
                                                                                    MyTextView myTextView13 = (MyTextView) zp7.a(view, R.id.receipt_number_Text);
                                                                                    if (myTextView13 != null) {
                                                                                        i = R.id.tax_from;
                                                                                        MyTextView myTextView14 = (MyTextView) zp7.a(view, R.id.tax_from);
                                                                                        if (myTextView14 != null) {
                                                                                            i = R.id.tax_from_linear;
                                                                                            LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.tax_from_linear);
                                                                                            if (linearLayout7 != null) {
                                                                                                i = R.id.tax_from_text;
                                                                                                MyTextView myTextView15 = (MyTextView) zp7.a(view, R.id.tax_from_text);
                                                                                                if (myTextView15 != null) {
                                                                                                    i = R.id.tax_mode;
                                                                                                    MyTextView myTextView16 = (MyTextView) zp7.a(view, R.id.tax_mode);
                                                                                                    if (myTextView16 != null) {
                                                                                                        i = R.id.tax_mode_linear;
                                                                                                        LinearLayout linearLayout8 = (LinearLayout) zp7.a(view, R.id.tax_mode_linear);
                                                                                                        if (linearLayout8 != null) {
                                                                                                            i = R.id.tax_mode_txt;
                                                                                                            MyTextView myTextView17 = (MyTextView) zp7.a(view, R.id.tax_mode_txt);
                                                                                                            if (myTextView17 != null) {
                                                                                                                i = R.id.tax_upto;
                                                                                                                MyTextView myTextView18 = (MyTextView) zp7.a(view, R.id.tax_upto);
                                                                                                                if (myTextView18 != null) {
                                                                                                                    i = R.id.tax_upto_linear;
                                                                                                                    LinearLayout linearLayout9 = (LinearLayout) zp7.a(view, R.id.tax_upto_linear);
                                                                                                                    if (linearLayout9 != null) {
                                                                                                                        i = R.id.tax_upto_txt;
                                                                                                                        MyTextView myTextView19 = (MyTextView) zp7.a(view, R.id.tax_upto_txt);
                                                                                                                        if (myTextView19 != null) {
                                                                                                                            i = R.id.topTitleTv;
                                                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                                                                                                            if (appCompatTextView != null) {
                                                                                                                                i = R.id.tv_owner_name;
                                                                                                                                MyTextView myTextView20 = (MyTextView) zp7.a(view, R.id.tv_owner_name);
                                                                                                                                if (myTextView20 != null) {
                                                                                                                                    i = R.id.vehciel_type;
                                                                                                                                    MyTextView myTextView21 = (MyTextView) zp7.a(view, R.id.vehciel_type);
                                                                                                                                    if (myTextView21 != null) {
                                                                                                                                        i = R.id.vehcile_type_linear;
                                                                                                                                        LinearLayout linearLayout10 = (LinearLayout) zp7.a(view, R.id.vehcile_type_linear);
                                                                                                                                        if (linearLayout10 != null) {
                                                                                                                                            i = R.id.vehcile_type_txt;
                                                                                                                                            MyTextView myTextView22 = (MyTextView) zp7.a(view, R.id.vehcile_type_txt);
                                                                                                                                            if (myTextView22 != null) {
                                                                                                                                                i = R.id.vehicle_class;
                                                                                                                                                MyTextView myTextView23 = (MyTextView) zp7.a(view, R.id.vehicle_class);
                                                                                                                                                if (myTextView23 != null) {
                                                                                                                                                    i = R.id.vehicle_class_txt;
                                                                                                                                                    MyTextView myTextView24 = (MyTextView) zp7.a(view, R.id.vehicle_class_txt);
                                                                                                                                                    if (myTextView24 != null) {
                                                                                                                                                        i = R.id.vehicle_number;
                                                                                                                                                        MyTextView myTextView25 = (MyTextView) zp7.a(view, R.id.vehicle_number);
                                                                                                                                                        if (myTextView25 != null) {
                                                                                                                                                            i = R.id.vehicle_number_linear;
                                                                                                                                                            LinearLayout linearLayout11 = (LinearLayout) zp7.a(view, R.id.vehicle_number_linear);
                                                                                                                                                            if (linearLayout11 != null) {
                                                                                                                                                                i = R.id.vehicle_number_txt;
                                                                                                                                                                MyTextView myTextView26 = (MyTextView) zp7.a(view, R.id.vehicle_number_txt);
                                                                                                                                                                if (myTextView26 != null) {
                                                                                                                                                                    return new h7((CoordinatorLayout) view, myTextView, linearLayout, myTextView2, myTextView3, linearLayout2, myTextView4, ri5VarA, myTextView5, myTextView6, linearLayout3, myTextView7, myTextView8, linearLayout4, myTextView9, myTextView10, linearLayout5, myTextView11, myTextView12, linearLayout6, myTextView13, myTextView14, linearLayout7, myTextView15, myTextView16, linearLayout8, myTextView17, myTextView18, linearLayout9, myTextView19, appCompatTextView, myTextView20, myTextView21, linearLayout10, myTextView22, myTextView23, myTextView24, myTextView25, linearLayout11, myTextView26);
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

    public static h7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static h7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_check_post_receipt_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
