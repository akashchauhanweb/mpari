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
public final class f67 {
    public final AppCompatTextView A;
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final TextView F;
    public final TextView G;
    public final ScrollView a;
    public final TextView b;
    public final AppCompatTextView c;
    public final AppCompatButton d;
    public final ImageView e;
    public final ImageView f;
    public final TextView g;
    public final AppCompatTextView h;
    public final AppCompatTextView i;
    public final AppCompatTextView j;
    public final AppCompatTextView k;
    public final AppCompatTextView l;
    public final CardView m;
    public final CardView n;
    public final LinearLayout o;
    public final LinearLayout p;
    public final v23 q;
    public final AppCompatTextView r;
    public final AppCompatTextView s;
    public final d47 t;
    public final AppCompatTextView u;
    public final AppCompatTextView v;
    public final AppCompatTextView w;
    public final AppCompatTextView x;
    public final AppCompatTextView y;
    public final TextView z;

    public f67(ScrollView scrollView, TextView textView, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, ImageView imageView, ImageView imageView2, TextView textView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, CardView cardView, CardView cardView2, LinearLayout linearLayout, LinearLayout linearLayout2, v23 v23Var, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, d47 d47Var, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, TextView textView3, AppCompatTextView appCompatTextView14, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17, AppCompatTextView appCompatTextView18, TextView textView4, TextView textView5) {
        this.a = scrollView;
        this.b = textView;
        this.c = appCompatTextView;
        this.d = appCompatButton;
        this.e = imageView;
        this.f = imageView2;
        this.g = textView2;
        this.h = appCompatTextView2;
        this.i = appCompatTextView3;
        this.j = appCompatTextView4;
        this.k = appCompatTextView5;
        this.l = appCompatTextView6;
        this.m = cardView;
        this.n = cardView2;
        this.o = linearLayout;
        this.p = linearLayout2;
        this.q = v23Var;
        this.r = appCompatTextView7;
        this.s = appCompatTextView8;
        this.t = d47Var;
        this.u = appCompatTextView9;
        this.v = appCompatTextView10;
        this.w = appCompatTextView11;
        this.x = appCompatTextView12;
        this.y = appCompatTextView13;
        this.z = textView3;
        this.A = appCompatTextView14;
        this.B = appCompatTextView15;
        this.C = appCompatTextView16;
        this.D = appCompatTextView17;
        this.E = appCompatTextView18;
        this.F = textView4;
        this.G = textView5;
    }

    public static f67 a(View view) {
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
                                i = R.id.financerAddTv;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.financerAddTv);
                                if (appCompatTextView2 != null) {
                                    i = R.id.financerBranchTv;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.financerBranchTv);
                                    if (appCompatTextView3 != null) {
                                        i = R.id.financerNameTv;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.financerNameTv);
                                        if (appCompatTextView4 != null) {
                                            i = R.id.header_title_hypo_details;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.header_title_hypo_details);
                                            if (appCompatTextView5 != null) {
                                                i = R.id.header_title_hypo_termination;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.header_title_hypo_termination);
                                                if (appCompatTextView6 != null) {
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
                                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.terminationBankNameTv);
                                                                        if (appCompatTextView7 != null) {
                                                                            i = R.id.terminationBranchNameTv;
                                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.terminationBranchNameTv);
                                                                            if (appCompatTextView8 != null) {
                                                                                i = R.id.topHolder;
                                                                                View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                if (viewA2 != null) {
                                                                                    d47 d47VarA = d47.a(viewA2);
                                                                                    i = R.id.typeTv;
                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.typeTv);
                                                                                    if (appCompatTextView9 != null) {
                                                                                        i = R.id.vahan_finance_from_date;
                                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.vahan_finance_from_date);
                                                                                        if (appCompatTextView10 != null) {
                                                                                            i = R.id.vahan_financer_add;
                                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) zp7.a(view, R.id.vahan_financer_add);
                                                                                            if (appCompatTextView11 != null) {
                                                                                                i = R.id.vahan_financer_branch;
                                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) zp7.a(view, R.id.vahan_financer_branch);
                                                                                                if (appCompatTextView12 != null) {
                                                                                                    i = R.id.vahan_financer_name;
                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) zp7.a(view, R.id.vahan_financer_name);
                                                                                                    if (appCompatTextView13 != null) {
                                                                                                        i = R.id.vahan_hypothecation_continuation;
                                                                                                        TextView textView3 = (TextView) zp7.a(view, R.id.vahan_hypothecation_continuation);
                                                                                                        if (textView3 != null) {
                                                                                                            i = R.id.vahan_term_branch_add;
                                                                                                            AppCompatTextView appCompatTextView14 = (AppCompatTextView) zp7.a(view, R.id.vahan_term_branch_add);
                                                                                                            if (appCompatTextView14 != null) {
                                                                                                                i = R.id.vahan_term_branch_name;
                                                                                                                AppCompatTextView appCompatTextView15 = (AppCompatTextView) zp7.a(view, R.id.vahan_term_branch_name);
                                                                                                                if (appCompatTextView15 != null) {
                                                                                                                    i = R.id.vahan_term_noc_date;
                                                                                                                    AppCompatTextView appCompatTextView16 = (AppCompatTextView) zp7.a(view, R.id.vahan_term_noc_date);
                                                                                                                    if (appCompatTextView16 != null) {
                                                                                                                        i = R.id.vahan_termination_bank_name;
                                                                                                                        AppCompatTextView appCompatTextView17 = (AppCompatTextView) zp7.a(view, R.id.vahan_termination_bank_name);
                                                                                                                        if (appCompatTextView17 != null) {
                                                                                                                            i = R.id.vahan_type;
                                                                                                                            AppCompatTextView appCompatTextView18 = (AppCompatTextView) zp7.a(view, R.id.vahan_type);
                                                                                                                            if (appCompatTextView18 != null) {
                                                                                                                                i = R.id.vehicleNumberTv;
                                                                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                if (textView4 != null) {
                                                                                                                                    i = R.id.vehicle_view;
                                                                                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                    if (textView5 != null) {
                                                                                                                                        return new f67((ScrollView) view, textView, appCompatTextView, appCompatButton, imageView, imageView2, textView2, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, cardView, cardView2, linearLayout, linearLayout2, v23VarA, appCompatTextView7, appCompatTextView8, d47VarA, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, textView3, appCompatTextView14, appCompatTextView15, appCompatTextView16, appCompatTextView17, appCompatTextView18, textView4, textView5);
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

    public static f67 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static f67 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_hypothecation_continuation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
