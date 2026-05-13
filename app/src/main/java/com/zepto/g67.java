package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class g67 {
    public final AppCompatTextView A;
    public final TextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final TextView H;
    public final TextView I;
    public final ScrollView a;
    public final TextView b;
    public final AppCompatTextView c;
    public final AppCompatButton d;
    public final ImageView e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final AppCompatTextView i;
    public final AppCompatTextView j;
    public final AppCompatTextView k;
    public final AppCompatTextView l;
    public final AppCompatTextView m;
    public final AppCompatTextView n;
    public final CardView o;
    public final CardView p;
    public final LinearLayout q;
    public final LinearLayout r;
    public final v23 s;
    public final AppCompatTextView t;
    public final AppCompatTextView u;
    public final d47 v;
    public final AppCompatTextView w;
    public final AppCompatTextView x;
    public final AppCompatTextView y;
    public final AppCompatTextView z;

    public g67(ScrollView scrollView, TextView textView, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, CardView cardView, CardView cardView2, LinearLayout linearLayout, LinearLayout linearLayout2, v23 v23Var, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, d47 d47Var, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, AppCompatTextView appCompatTextView14, TextView textView4, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17, AppCompatTextView appCompatTextView18, AppCompatTextView appCompatTextView19, TextView textView5, TextView textView6) {
        this.a = scrollView;
        this.b = textView;
        this.c = appCompatTextView;
        this.d = appCompatButton;
        this.e = imageView;
        this.f = imageView2;
        this.g = textView2;
        this.h = textView3;
        this.i = appCompatTextView2;
        this.j = appCompatTextView3;
        this.k = appCompatTextView4;
        this.l = appCompatTextView5;
        this.m = appCompatTextView6;
        this.n = appCompatTextView7;
        this.o = cardView;
        this.p = cardView2;
        this.q = linearLayout;
        this.r = linearLayout2;
        this.s = v23Var;
        this.t = appCompatTextView8;
        this.u = appCompatTextView9;
        this.v = d47Var;
        this.w = appCompatTextView10;
        this.x = appCompatTextView11;
        this.y = appCompatTextView12;
        this.z = appCompatTextView13;
        this.A = appCompatTextView14;
        this.B = textView4;
        this.C = appCompatTextView15;
        this.D = appCompatTextView16;
        this.E = appCompatTextView17;
        this.F = appCompatTextView18;
        this.G = appCompatTextView19;
        this.H = textView5;
        this.I = textView6;
    }

    public static g67 a(View view) {
        int i = R.id.bankNocDateTv;
        TextView textView = (TextView) zp7.a(view, R.id.bankNocDateTv);
        if (textView != null) {
            i = R.id.branchAddTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.branchAddTv);
            if (appCompatTextView != null) {
                i = R.id.btnSubmit;
                AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
                if (appCompatButton != null) {
                    i = R.id.downArrowHypoDetails;
                    ImageView imageView = (ImageView) zp7.a(view, R.id.downArrowHypoDetails);
                    if (imageView != null) {
                        i = R.id.downArrowHypoTermination;
                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.downArrowHypoTermination);
                        if (imageView2 != null) {
                            i = R.id.financeFromDateTv;
                            TextView textView2 = (TextView) zp7.a(view, R.id.financeFromDateTv);
                            if (textView2 != null) {
                                i = R.id.finance_upto_date;
                                TextView textView3 = (TextView) zp7.a(view, R.id.finance_upto_date);
                                if (textView3 != null) {
                                    i = R.id.finance_upto_date2;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.finance_upto_date2);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.financer_Add_Tv;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.financer_Add_Tv);
                                        if (appCompatTextView3 != null) {
                                            i = R.id.financerBranchTv;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.financerBranchTv);
                                            if (appCompatTextView4 != null) {
                                                i = R.id.financerNameTv;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.financerNameTv);
                                                if (appCompatTextView5 != null) {
                                                    i = R.id.header_title_hypo_details;
                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.header_title_hypo_details);
                                                    if (appCompatTextView6 != null) {
                                                        i = R.id.header_title_hypo_termination;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.header_title_hypo_termination);
                                                        if (appCompatTextView7 != null) {
                                                            i = R.id.hypoDetailsCv;
                                                            CardView cardView = (CardView) zp7.a(view, R.id.hypoDetailsCv);
                                                            if (cardView != null) {
                                                                i = R.id.hypoTermDetailsCv;
                                                                CardView cardView2 = (CardView) zp7.a(view, R.id.hypoTermDetailsCv);
                                                                if (cardView2 != null) {
                                                                    i = R.id.layoutHypoDetails;
                                                                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.layoutHypoDetails);
                                                                    if (linearLayout != null) {
                                                                        i = R.id.layoutHypoTerm;
                                                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.layoutHypoTerm);
                                                                        if (linearLayout2 != null) {
                                                                            i = R.id.rc_ind;
                                                                            View viewA = zp7.a(view, R.id.rc_ind);
                                                                            if (viewA != null) {
                                                                                v23 v23VarA = v23.a(viewA);
                                                                                i = R.id.terminationBankNameTv;
                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.terminationBankNameTv);
                                                                                if (appCompatTextView8 != null) {
                                                                                    i = R.id.terminationBranchNameTv;
                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.terminationBranchNameTv);
                                                                                    if (appCompatTextView9 != null) {
                                                                                        i = R.id.topHolder;
                                                                                        View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                        if (viewA2 != null) {
                                                                                            d47 d47VarA = d47.a(viewA2);
                                                                                            i = R.id.typeTv;
                                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.typeTv);
                                                                                            if (appCompatTextView10 != null) {
                                                                                                i = R.id.vahan_finance_from_date;
                                                                                                AppCompatTextView appCompatTextView11 = (AppCompatTextView) zp7.a(view, R.id.vahan_finance_from_date);
                                                                                                if (appCompatTextView11 != null) {
                                                                                                    i = R.id.vahan_financer_add;
                                                                                                    AppCompatTextView appCompatTextView12 = (AppCompatTextView) zp7.a(view, R.id.vahan_financer_add);
                                                                                                    if (appCompatTextView12 != null) {
                                                                                                        i = R.id.vahan_financer_branch;
                                                                                                        AppCompatTextView appCompatTextView13 = (AppCompatTextView) zp7.a(view, R.id.vahan_financer_branch);
                                                                                                        if (appCompatTextView13 != null) {
                                                                                                            i = R.id.vahan_financer_name;
                                                                                                            AppCompatTextView appCompatTextView14 = (AppCompatTextView) zp7.a(view, R.id.vahan_financer_name);
                                                                                                            if (appCompatTextView14 != null) {
                                                                                                                i = R.id.vahan_hypothecation_termination;
                                                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.vahan_hypothecation_termination);
                                                                                                                if (textView4 != null) {
                                                                                                                    i = R.id.vahan_term_branch_add;
                                                                                                                    AppCompatTextView appCompatTextView15 = (AppCompatTextView) zp7.a(view, R.id.vahan_term_branch_add);
                                                                                                                    if (appCompatTextView15 != null) {
                                                                                                                        i = R.id.vahan_term_branch_name;
                                                                                                                        AppCompatTextView appCompatTextView16 = (AppCompatTextView) zp7.a(view, R.id.vahan_term_branch_name);
                                                                                                                        if (appCompatTextView16 != null) {
                                                                                                                            i = R.id.vahan_term_noc_date;
                                                                                                                            AppCompatTextView appCompatTextView17 = (AppCompatTextView) zp7.a(view, R.id.vahan_term_noc_date);
                                                                                                                            if (appCompatTextView17 != null) {
                                                                                                                                i = R.id.vahan_termination_bank_name;
                                                                                                                                AppCompatTextView appCompatTextView18 = (AppCompatTextView) zp7.a(view, R.id.vahan_termination_bank_name);
                                                                                                                                if (appCompatTextView18 != null) {
                                                                                                                                    i = R.id.vahan_type;
                                                                                                                                    AppCompatTextView appCompatTextView19 = (AppCompatTextView) zp7.a(view, R.id.vahan_type);
                                                                                                                                    if (appCompatTextView19 != null) {
                                                                                                                                        i = R.id.vehicleNumberTv;
                                                                                                                                        TextView textView5 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                        if (textView5 != null) {
                                                                                                                                            i = R.id.vehicle_view;
                                                                                                                                            TextView textView6 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                            if (textView6 != null) {
                                                                                                                                                return new g67((ScrollView) view, textView, appCompatTextView, appCompatButton, imageView, imageView2, textView2, textView3, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, cardView, cardView2, linearLayout, linearLayout2, v23VarA, appCompatTextView8, appCompatTextView9, d47VarA, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, textView4, appCompatTextView15, appCompatTextView16, appCompatTextView17, appCompatTextView18, appCompatTextView19, textView5, textView6);
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

    public static g67 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static g67 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_hypothecation_termination, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
