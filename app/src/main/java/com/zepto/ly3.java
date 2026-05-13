package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ly3 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final LinearLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final LinearLayout g;
    public final RecyclerView h;
    public final LinearLayout i;
    public final TextView j;
    public final TextView k;
    public final LinearLayout l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final LinearLayout r;
    public final my2 s;
    public final LinearLayout t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final d47 z;

    public ly3(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout3, RecyclerView recyclerView, LinearLayout linearLayout4, TextView textView5, TextView textView6, LinearLayout linearLayout5, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LinearLayout linearLayout6, my2 my2Var, LinearLayout linearLayout7, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, d47 d47Var, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = linearLayout3;
        this.h = recyclerView;
        this.i = linearLayout4;
        this.j = textView5;
        this.k = textView6;
        this.l = linearLayout5;
        this.m = textView7;
        this.n = textView8;
        this.o = textView9;
        this.p = textView10;
        this.q = textView11;
        this.r = linearLayout6;
        this.s = my2Var;
        this.t = linearLayout7;
        this.u = textView12;
        this.v = textView13;
        this.w = textView14;
        this.x = textView15;
        this.y = textView16;
        this.z = d47Var;
        this.A = textView17;
        this.B = textView18;
        this.C = textView19;
        this.D = textView20;
        this.E = textView21;
        this.F = textView22;
        this.G = textView23;
        this.H = textView24;
    }

    public static ly3 a(View view) {
        int i = R.id.address_layout;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.address_layout);
        if (linearLayout != null) {
            i = R.id.current_address;
            TextView textView = (TextView) zp7.a(view, R.id.current_address);
            if (textView != null) {
                i = R.id.fee_amount;
                TextView textView2 = (TextView) zp7.a(view, R.id.fee_amount);
                if (textView2 != null) {
                    i = R.id.fee_amount_txt;
                    TextView textView3 = (TextView) zp7.a(view, R.id.fee_amount_txt);
                    if (textView3 != null) {
                        i = R.id.fee_details;
                        TextView textView4 = (TextView) zp7.a(view, R.id.fee_details);
                        if (textView4 != null) {
                            i = R.id.fee_layout;
                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.fee_layout);
                            if (linearLayout2 != null) {
                                i = R.id.feeRecycle;
                                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.feeRecycle);
                                if (recyclerView != null) {
                                    i = R.id.fee_recycle_layout;
                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.fee_recycle_layout);
                                    if (linearLayout3 != null) {
                                        i = R.id.fine_amount;
                                        TextView textView5 = (TextView) zp7.a(view, R.id.fine_amount);
                                        if (textView5 != null) {
                                            i = R.id.fine_amount_txt;
                                            TextView textView6 = (TextView) zp7.a(view, R.id.fine_amount_txt);
                                            if (textView6 != null) {
                                                i = R.id.linear_parent;
                                                LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.linear_parent);
                                                if (linearLayout4 != null) {
                                                    i = R.id.new_current_address;
                                                    TextView textView7 = (TextView) zp7.a(view, R.id.new_current_address);
                                                    if (textView7 != null) {
                                                        i = R.id.new_permanent_address;
                                                        TextView textView8 = (TextView) zp7.a(view, R.id.new_permanent_address);
                                                        if (textView8 != null) {
                                                            i = R.id.permenent_address;
                                                            TextView textView9 = (TextView) zp7.a(view, R.id.permenent_address);
                                                            if (textView9 != null) {
                                                                i = R.id.postal_Charge;
                                                                TextView textView10 = (TextView) zp7.a(view, R.id.postal_Charge);
                                                                if (textView10 != null) {
                                                                    i = R.id.postal_dec;
                                                                    TextView textView11 = (TextView) zp7.a(view, R.id.postal_dec);
                                                                    if (textView11 != null) {
                                                                        i = R.id.postal_layout;
                                                                        LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.postal_layout);
                                                                        if (linearLayout5 != null) {
                                                                            i = R.id.rc_ind;
                                                                            View viewA = zp7.a(view, R.id.rc_ind);
                                                                            if (viewA != null) {
                                                                                my2 my2VarA = my2.a(viewA);
                                                                                i = R.id.recycle_under_layout;
                                                                                LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.recycle_under_layout);
                                                                                if (linearLayout6 != null) {
                                                                                    i = R.id.serviceCharges;
                                                                                    TextView textView12 = (TextView) zp7.a(view, R.id.serviceCharges);
                                                                                    if (textView12 != null) {
                                                                                        i = R.id.serviceCharges_title;
                                                                                        TextView textView13 = (TextView) zp7.a(view, R.id.serviceCharges_title);
                                                                                        if (textView13 != null) {
                                                                                            i = R.id.service_title;
                                                                                            TextView textView14 = (TextView) zp7.a(view, R.id.service_title);
                                                                                            if (textView14 != null) {
                                                                                                i = R.id.skip_to_dms;
                                                                                                TextView textView15 = (TextView) zp7.a(view, R.id.skip_to_dms);
                                                                                                if (textView15 != null) {
                                                                                                    i = R.id.submit_cod;
                                                                                                    TextView textView16 = (TextView) zp7.a(view, R.id.submit_cod);
                                                                                                    if (textView16 != null) {
                                                                                                        i = R.id.topHolder;
                                                                                                        View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                        if (viewA2 != null) {
                                                                                                            d47 d47VarA = d47.a(viewA2);
                                                                                                            i = R.id.total_amount;
                                                                                                            TextView textView17 = (TextView) zp7.a(view, R.id.total_amount);
                                                                                                            if (textView17 != null) {
                                                                                                                i = R.id.total_amount_rec;
                                                                                                                TextView textView18 = (TextView) zp7.a(view, R.id.total_amount_rec);
                                                                                                                if (textView18 != null) {
                                                                                                                    i = R.id.total_amount_txt;
                                                                                                                    TextView textView19 = (TextView) zp7.a(view, R.id.total_amount_txt);
                                                                                                                    if (textView19 != null) {
                                                                                                                        i = R.id.total_amount_txt_rec;
                                                                                                                        TextView textView20 = (TextView) zp7.a(view, R.id.total_amount_txt_rec);
                                                                                                                        if (textView20 != null) {
                                                                                                                            i = R.id.tran_dec;
                                                                                                                            TextView textView21 = (TextView) zp7.a(view, R.id.tran_dec);
                                                                                                                            if (textView21 != null) {
                                                                                                                                i = R.id.trans_Charge;
                                                                                                                                TextView textView22 = (TextView) zp7.a(view, R.id.trans_Charge);
                                                                                                                                if (textView22 != null) {
                                                                                                                                    i = R.id.vehicle_number;
                                                                                                                                    TextView textView23 = (TextView) zp7.a(view, R.id.vehicle_number);
                                                                                                                                    if (textView23 != null) {
                                                                                                                                        i = R.id.vehicle_view;
                                                                                                                                        TextView textView24 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                        if (textView24 != null) {
                                                                                                                                            return new ly3((LinearLayout) view, linearLayout, textView, textView2, textView3, textView4, linearLayout2, recyclerView, linearLayout3, textView5, textView6, linearLayout4, textView7, textView8, textView9, textView10, textView11, linearLayout5, my2VarA, linearLayout6, textView12, textView13, textView14, textView15, textView16, d47VarA, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24);
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

    public static ly3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ly3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.multiservice_feelayout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
