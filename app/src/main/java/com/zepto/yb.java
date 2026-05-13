package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yb {
    public final TextView A;
    public final d47 B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final LinearLayout h;
    public final RecyclerView i;
    public final LinearLayout j;
    public final TextView k;
    public final TextView l;
    public final LinearLayout m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final LinearLayout s;
    public final my2 t;
    public final LinearLayout u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public yb(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout3, RecyclerView recyclerView, LinearLayout linearLayout4, TextView textView6, TextView textView7, LinearLayout linearLayout5, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, LinearLayout linearLayout6, my2 my2Var, LinearLayout linearLayout7, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, d47 d47Var, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
        this.h = linearLayout3;
        this.i = recyclerView;
        this.j = linearLayout4;
        this.k = textView6;
        this.l = textView7;
        this.m = linearLayout5;
        this.n = textView8;
        this.o = textView9;
        this.p = textView10;
        this.q = textView11;
        this.r = textView12;
        this.s = linearLayout6;
        this.t = my2Var;
        this.u = linearLayout7;
        this.v = textView13;
        this.w = textView14;
        this.x = textView15;
        this.y = textView16;
        this.z = textView17;
        this.A = textView18;
        this.B = d47Var;
        this.C = textView19;
        this.D = textView20;
        this.E = textView21;
        this.F = textView22;
        this.G = textView23;
        this.H = textView24;
        this.I = textView25;
        this.J = textView26;
    }

    public static yb a(View view) {
        int i = R.id.address_layout;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.address_layout);
        if (linearLayout != null) {
            i = R.id.current_address;
            TextView textView = (TextView) zp7.a(view, R.id.current_address);
            if (textView != null) {
                i = R.id.description;
                TextView textView2 = (TextView) zp7.a(view, R.id.description);
                if (textView2 != null) {
                    i = R.id.fee_amount;
                    TextView textView3 = (TextView) zp7.a(view, R.id.fee_amount);
                    if (textView3 != null) {
                        i = R.id.fee_amount_txt;
                        TextView textView4 = (TextView) zp7.a(view, R.id.fee_amount_txt);
                        if (textView4 != null) {
                            i = R.id.fee_details;
                            TextView textView5 = (TextView) zp7.a(view, R.id.fee_details);
                            if (textView5 != null) {
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
                                            TextView textView6 = (TextView) zp7.a(view, R.id.fine_amount);
                                            if (textView6 != null) {
                                                i = R.id.fine_amount_txt;
                                                TextView textView7 = (TextView) zp7.a(view, R.id.fine_amount_txt);
                                                if (textView7 != null) {
                                                    i = R.id.linear_parent;
                                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.linear_parent);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.new_current_address;
                                                        TextView textView8 = (TextView) zp7.a(view, R.id.new_current_address);
                                                        if (textView8 != null) {
                                                            i = R.id.new_permanent_address;
                                                            TextView textView9 = (TextView) zp7.a(view, R.id.new_permanent_address);
                                                            if (textView9 != null) {
                                                                i = R.id.permenent_address;
                                                                TextView textView10 = (TextView) zp7.a(view, R.id.permenent_address);
                                                                if (textView10 != null) {
                                                                    i = R.id.postal_Charge;
                                                                    TextView textView11 = (TextView) zp7.a(view, R.id.postal_Charge);
                                                                    if (textView11 != null) {
                                                                        i = R.id.postal_dec;
                                                                        TextView textView12 = (TextView) zp7.a(view, R.id.postal_dec);
                                                                        if (textView12 != null) {
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
                                                                                        TextView textView13 = (TextView) zp7.a(view, R.id.serviceCharges);
                                                                                        if (textView13 != null) {
                                                                                            i = R.id.serviceCharges_title;
                                                                                            TextView textView14 = (TextView) zp7.a(view, R.id.serviceCharges_title);
                                                                                            if (textView14 != null) {
                                                                                                i = R.id.service_name;
                                                                                                TextView textView15 = (TextView) zp7.a(view, R.id.service_name);
                                                                                                if (textView15 != null) {
                                                                                                    i = R.id.service_title;
                                                                                                    TextView textView16 = (TextView) zp7.a(view, R.id.service_title);
                                                                                                    if (textView16 != null) {
                                                                                                        i = R.id.skip_to_dms;
                                                                                                        TextView textView17 = (TextView) zp7.a(view, R.id.skip_to_dms);
                                                                                                        if (textView17 != null) {
                                                                                                            i = R.id.submit_cod;
                                                                                                            TextView textView18 = (TextView) zp7.a(view, R.id.submit_cod);
                                                                                                            if (textView18 != null) {
                                                                                                                i = R.id.topHolder;
                                                                                                                View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                                if (viewA2 != null) {
                                                                                                                    d47 d47VarA = d47.a(viewA2);
                                                                                                                    i = R.id.total_amount;
                                                                                                                    TextView textView19 = (TextView) zp7.a(view, R.id.total_amount);
                                                                                                                    if (textView19 != null) {
                                                                                                                        i = R.id.total_amount_rec;
                                                                                                                        TextView textView20 = (TextView) zp7.a(view, R.id.total_amount_rec);
                                                                                                                        if (textView20 != null) {
                                                                                                                            i = R.id.total_amount_txt;
                                                                                                                            TextView textView21 = (TextView) zp7.a(view, R.id.total_amount_txt);
                                                                                                                            if (textView21 != null) {
                                                                                                                                i = R.id.total_amount_txt_rec;
                                                                                                                                TextView textView22 = (TextView) zp7.a(view, R.id.total_amount_txt_rec);
                                                                                                                                if (textView22 != null) {
                                                                                                                                    i = R.id.tran_dec;
                                                                                                                                    TextView textView23 = (TextView) zp7.a(view, R.id.tran_dec);
                                                                                                                                    if (textView23 != null) {
                                                                                                                                        i = R.id.trans_Charge;
                                                                                                                                        TextView textView24 = (TextView) zp7.a(view, R.id.trans_Charge);
                                                                                                                                        if (textView24 != null) {
                                                                                                                                            i = R.id.vehicle_number;
                                                                                                                                            TextView textView25 = (TextView) zp7.a(view, R.id.vehicle_number);
                                                                                                                                            if (textView25 != null) {
                                                                                                                                                i = R.id.vehicle_view;
                                                                                                                                                TextView textView26 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                                if (textView26 != null) {
                                                                                                                                                    return new yb((LinearLayout) view, linearLayout, textView, textView2, textView3, textView4, textView5, linearLayout2, recyclerView, linearLayout3, textView6, textView7, linearLayout4, textView8, textView9, textView10, textView11, textView12, linearLayout5, my2VarA, linearLayout6, textView13, textView14, textView15, textView16, textView17, textView18, d47VarA, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26);
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

    public static yb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static yb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_fees_details_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
