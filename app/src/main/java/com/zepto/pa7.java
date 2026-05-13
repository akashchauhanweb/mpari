package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pa7 {
    public final Spinner A;
    public final LinearLayout B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final RadioButton E;
    public final d47 F;
    public final EditText G;
    public final MyTextView H;
    public final AppCompatTextView I;
    public final MyTextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final AppCompatTextView N;
    public final TextView O;
    public final MyTextView P;
    public final MyTextView Q;
    public final AppCompatTextView R;
    public final AppCompatTextView S;
    public final AppCompatTextView T;
    public final AppCompatTextView U;
    public final AppCompatTextView V;
    public final MyTextView W;
    public final TextView X;
    public final TextView Y;
    public final ScrollView a;
    public final Spinner b;
    public final TextView c;
    public final AppCompatTextView d;
    public final AppCompatButton e;
    public final RadioButton f;
    public final ImageView g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;
    public final AppCompatTextView k;
    public final AppCompatTextView l;
    public final AppCompatTextView m;
    public final AppCompatTextView n;
    public final AppCompatTextView o;
    public final AppCompatTextView p;
    public final LinearLayout q;
    public final CardView r;
    public final CardView s;
    public final MyTextView t;
    public final LinearLayout u;
    public final LinearLayout v;
    public final MyTextView w;
    public final EditText x;
    public final Spinner y;
    public final v23 z;

    public pa7(ScrollView scrollView, Spinner spinner, TextView textView, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, RadioButton radioButton, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, LinearLayout linearLayout, CardView cardView, CardView cardView2, MyTextView myTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, MyTextView myTextView2, EditText editText, Spinner spinner2, v23 v23Var, Spinner spinner3, LinearLayout linearLayout4, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, RadioButton radioButton2, d47 d47Var, EditText editText2, MyTextView myTextView3, AppCompatTextView appCompatTextView10, MyTextView myTextView4, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, AppCompatTextView appCompatTextView14, TextView textView4, MyTextView myTextView5, MyTextView myTextView6, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17, AppCompatTextView appCompatTextView18, AppCompatTextView appCompatTextView19, MyTextView myTextView7, TextView textView5, TextView textView6) {
        this.a = scrollView;
        this.b = spinner;
        this.c = textView;
        this.d = appCompatTextView;
        this.e = appCompatButton;
        this.f = radioButton;
        this.g = imageView;
        this.h = imageView2;
        this.i = textView2;
        this.j = textView3;
        this.k = appCompatTextView2;
        this.l = appCompatTextView3;
        this.m = appCompatTextView4;
        this.n = appCompatTextView5;
        this.o = appCompatTextView6;
        this.p = appCompatTextView7;
        this.q = linearLayout;
        this.r = cardView;
        this.s = cardView2;
        this.t = myTextView;
        this.u = linearLayout2;
        this.v = linearLayout3;
        this.w = myTextView2;
        this.x = editText;
        this.y = spinner2;
        this.z = v23Var;
        this.A = spinner3;
        this.B = linearLayout4;
        this.C = appCompatTextView8;
        this.D = appCompatTextView9;
        this.E = radioButton2;
        this.F = d47Var;
        this.G = editText2;
        this.H = myTextView3;
        this.I = appCompatTextView10;
        this.J = myTextView4;
        this.K = appCompatTextView11;
        this.L = appCompatTextView12;
        this.M = appCompatTextView13;
        this.N = appCompatTextView14;
        this.O = textView4;
        this.P = myTextView5;
        this.Q = myTextView6;
        this.R = appCompatTextView15;
        this.S = appCompatTextView16;
        this.T = appCompatTextView17;
        this.U = appCompatTextView18;
        this.V = appCompatTextView19;
        this.W = myTextView7;
        this.X = textView5;
        this.Y = textView6;
    }

    public static pa7 a(View view) {
        int i = R.id.authorityToTv;
        Spinner spinner = (Spinner) zp7.a(view, R.id.authorityToTv);
        if (spinner != null) {
            i = R.id.bankNocDateTv;
            TextView textView = (TextView) zp7.a(view, R.id.bankNocDateTv);
            if (textView != null) {
                i = R.id.branchAddTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.branchAddTv);
                if (appCompatTextView != null) {
                    i = R.id.btnSubmit;
                    AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
                    if (appCompatButton != null) {
                        i = R.id.continuationOfHypoRb;
                        RadioButton radioButton = (RadioButton) zp7.a(view, R.id.continuationOfHypoRb);
                        if (radioButton != null) {
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
                                                i = R.id.financerAddTv;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.financerAddTv);
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
                                                                    i = R.id.hpt_option;
                                                                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.hpt_option);
                                                                    if (linearLayout != null) {
                                                                        i = R.id.hypoDetailsCv;
                                                                        CardView cardView = (CardView) zp7.a(view, R.id.hypoDetailsCv);
                                                                        if (cardView != null) {
                                                                            i = R.id.hypoTermDetailsCv;
                                                                            CardView cardView2 = (CardView) zp7.a(view, R.id.hypoTermDetailsCv);
                                                                            if (cardView2 != null) {
                                                                                i = R.id.hypothecation_option;
                                                                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.hypothecation_option);
                                                                                if (myTextView != null) {
                                                                                    i = R.id.layoutHypoDetails;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.layoutHypoDetails);
                                                                                    if (linearLayout2 != null) {
                                                                                        i = R.id.layoutHypoTerm;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.layoutHypoTerm);
                                                                                        if (linearLayout3 != null) {
                                                                                            i = R.id.ncrb_clearance_no;
                                                                                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.ncrb_clearance_no);
                                                                                            if (myTextView2 != null) {
                                                                                                i = R.id.ncrb_no;
                                                                                                EditText editText = (EditText) zp7.a(view, R.id.ncrb_no);
                                                                                                if (editText != null) {
                                                                                                    i = R.id.nocReasonTv;
                                                                                                    Spinner spinner2 = (Spinner) zp7.a(view, R.id.nocReasonTv);
                                                                                                    if (spinner2 != null) {
                                                                                                        i = R.id.rc_ind;
                                                                                                        View viewA = zp7.a(view, R.id.rc_ind);
                                                                                                        if (viewA != null) {
                                                                                                            v23 v23VarA = v23.a(viewA);
                                                                                                            i = R.id.select_spinner;
                                                                                                            Spinner spinner3 = (Spinner) zp7.a(view, R.id.select_spinner);
                                                                                                            if (spinner3 != null) {
                                                                                                                i = R.id.terminate_upto_layout;
                                                                                                                LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.terminate_upto_layout);
                                                                                                                if (linearLayout4 != null) {
                                                                                                                    i = R.id.terminationBankNameTv;
                                                                                                                    AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.terminationBankNameTv);
                                                                                                                    if (appCompatTextView8 != null) {
                                                                                                                        i = R.id.terminationBranchNameTv;
                                                                                                                        AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.terminationBranchNameTv);
                                                                                                                        if (appCompatTextView9 != null) {
                                                                                                                            i = R.id.terminationOfHypoRb;
                                                                                                                            RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.terminationOfHypoRb);
                                                                                                                            if (radioButton2 != null) {
                                                                                                                                i = R.id.topHolder;
                                                                                                                                View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                                                if (viewA2 != null) {
                                                                                                                                    d47 d47VarA = d47.a(viewA2);
                                                                                                                                    i = R.id.transfree_name;
                                                                                                                                    EditText editText2 = (EditText) zp7.a(view, R.id.transfree_name);
                                                                                                                                    if (editText2 != null) {
                                                                                                                                        i = R.id.transfree_title;
                                                                                                                                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.transfree_title);
                                                                                                                                        if (myTextView3 != null) {
                                                                                                                                            i = R.id.typeTv;
                                                                                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.typeTv);
                                                                                                                                            if (appCompatTextView10 != null) {
                                                                                                                                                i = R.id.vahan_authority_to;
                                                                                                                                                MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vahan_authority_to);
                                                                                                                                                if (myTextView4 != null) {
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
                                                                                                                                                                    i = R.id.vahan_noc;
                                                                                                                                                                    TextView textView4 = (TextView) zp7.a(view, R.id.vahan_noc);
                                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                                        i = R.id.vahan_reason_for_taking_noc;
                                                                                                                                                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.vahan_reason_for_taking_noc);
                                                                                                                                                                        if (myTextView5 != null) {
                                                                                                                                                                            i = R.id.vahan_state_to;
                                                                                                                                                                            MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.vahan_state_to);
                                                                                                                                                                            if (myTextView6 != null) {
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
                                                                                                                                                                                                    i = R.id.vahan_vehicle_noc_details;
                                                                                                                                                                                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.vahan_vehicle_noc_details);
                                                                                                                                                                                                    if (myTextView7 != null) {
                                                                                                                                                                                                        i = R.id.vehicleNumberTv;
                                                                                                                                                                                                        TextView textView5 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                                                            i = R.id.vehicle_view;
                                                                                                                                                                                                            TextView textView6 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                                                return new pa7((ScrollView) view, spinner, textView, appCompatTextView, appCompatButton, radioButton, imageView, imageView2, textView2, textView3, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, linearLayout, cardView, cardView2, myTextView, linearLayout2, linearLayout3, myTextView2, editText, spinner2, v23VarA, spinner3, linearLayout4, appCompatTextView8, appCompatTextView9, radioButton2, d47VarA, editText2, myTextView3, appCompatTextView10, myTextView4, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, textView4, myTextView5, myTextView6, appCompatTextView15, appCompatTextView16, appCompatTextView17, appCompatTextView18, appCompatTextView19, myTextView7, textView5, textView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static pa7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static pa7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_noc, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
