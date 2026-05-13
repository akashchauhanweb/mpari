package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class wf {
    public final RelativeLayout A;
    public final MyTextView B;
    public final LinearLayout C;
    public final AppCompatTextView D;
    public final d47 E;
    public final AppCompatImageView F;
    public final MyTextView G;
    public final RelativeLayout H;
    public final TextView I;
    public final TextView J;
    public final MyTextView K;
    public final TextView L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final RadioButton O;
    public final TextView P;
    public final LinearLayout Q;
    public final LinearLayout R;
    public final LinearLayout a;
    public final AppCompatTextView b;
    public final CheckedTextView c;
    public final LinearLayout d;
    public final RadioButton e;
    public final EditText f;
    public final RadioButton g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final EditText j;
    public final AppCompatTextView k;
    public final LinearLayout l;
    public final EditText m;
    public final LinearLayout n;
    public final MyTextView o;
    public final AppCompatImageView p;
    public final RelativeLayout q;
    public final MyTextView r;
    public final CheckedTextView s;
    public final RelativeLayout t;
    public final View u;
    public final TextView v;
    public final RecyclerView w;
    public final CheckedTextView x;
    public final View y;
    public final AppCompatImageView z;

    public wf(LinearLayout linearLayout, AppCompatTextView appCompatTextView, CheckedTextView checkedTextView, LinearLayout linearLayout2, RadioButton radioButton, EditText editText, RadioButton radioButton2, LinearLayout linearLayout3, LinearLayout linearLayout4, EditText editText2, AppCompatTextView appCompatTextView2, LinearLayout linearLayout5, EditText editText3, LinearLayout linearLayout6, MyTextView myTextView, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, MyTextView myTextView2, CheckedTextView checkedTextView2, RelativeLayout relativeLayout2, View view, TextView textView, RecyclerView recyclerView, CheckedTextView checkedTextView3, View view2, AppCompatImageView appCompatImageView2, RelativeLayout relativeLayout3, MyTextView myTextView3, LinearLayout linearLayout7, AppCompatTextView appCompatTextView3, d47 d47Var, AppCompatImageView appCompatImageView3, MyTextView myTextView4, RelativeLayout relativeLayout4, TextView textView2, TextView textView3, MyTextView myTextView5, TextView textView4, LinearLayout linearLayout8, LinearLayout linearLayout9, RadioButton radioButton3, TextView textView5, LinearLayout linearLayout10, LinearLayout linearLayout11) {
        this.a = linearLayout;
        this.b = appCompatTextView;
        this.c = checkedTextView;
        this.d = linearLayout2;
        this.e = radioButton;
        this.f = editText;
        this.g = radioButton2;
        this.h = linearLayout3;
        this.i = linearLayout4;
        this.j = editText2;
        this.k = appCompatTextView2;
        this.l = linearLayout5;
        this.m = editText3;
        this.n = linearLayout6;
        this.o = myTextView;
        this.p = appCompatImageView;
        this.q = relativeLayout;
        this.r = myTextView2;
        this.s = checkedTextView2;
        this.t = relativeLayout2;
        this.u = view;
        this.v = textView;
        this.w = recyclerView;
        this.x = checkedTextView3;
        this.y = view2;
        this.z = appCompatImageView2;
        this.A = relativeLayout3;
        this.B = myTextView3;
        this.C = linearLayout7;
        this.D = appCompatTextView3;
        this.E = d47Var;
        this.F = appCompatImageView3;
        this.G = myTextView4;
        this.H = relativeLayout4;
        this.I = textView2;
        this.J = textView3;
        this.K = myTextView5;
        this.L = textView4;
        this.M = linearLayout8;
        this.N = linearLayout9;
        this.O = radioButton3;
        this.P = textView5;
        this.Q = linearLayout10;
        this.R = linearLayout11;
    }

    public static wf a(View view) {
        int i = R.id.challanDetailTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.challanDetailTv);
        if (appCompatTextView != null) {
            i = R.id.challanDetailsCb;
            CheckedTextView checkedTextView = (CheckedTextView) zp7.a(view, R.id.challanDetailsCb);
            if (checkedTextView != null) {
                i = R.id.challanNoLl;
                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.challanNoLl);
                if (linearLayout != null) {
                    i = R.id.challanNoRb;
                    RadioButton radioButton = (RadioButton) zp7.a(view, R.id.challanNoRb);
                    if (radioButton != null) {
                        i = R.id.chasisEt;
                        EditText editText = (EditText) zp7.a(view, R.id.chasisEt);
                        if (editText != null) {
                            i = R.id.dLNoRb;
                            RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.dLNoRb);
                            if (radioButton2 != null) {
                                i = R.id.delet_icon;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.delet_icon);
                                if (linearLayout2 != null) {
                                    i = R.id.drivingLicenseLl;
                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.drivingLicenseLl);
                                    if (linearLayout3 != null) {
                                        i = R.id.engineEt;
                                        EditText editText2 = (EditText) zp7.a(view, R.id.engineEt);
                                        if (editText2 != null) {
                                            i = R.id.getDetailsTv;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.getDetailsTv);
                                            if (appCompatTextView2 != null) {
                                                i = R.id.inner_parent;
                                                LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.inner_parent);
                                                if (linearLayout4 != null) {
                                                    i = R.id.inputEt;
                                                    EditText editText3 = (EditText) zp7.a(view, R.id.inputEt);
                                                    if (editText3 != null) {
                                                        i = R.id.linear_parent;
                                                        LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.linear_parent);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.myDlLicence;
                                                            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.myDlLicence);
                                                            if (myTextView != null) {
                                                                i = R.id.payChallanIv;
                                                                AppCompatImageView appCompatImageView = (AppCompatImageView) zp7.a(view, R.id.payChallanIv);
                                                                if (appCompatImageView != null) {
                                                                    i = R.id.payChallanRl;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.payChallanRl);
                                                                    if (relativeLayout != null) {
                                                                        i = R.id.payChallanTv;
                                                                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.payChallanTv);
                                                                        if (myTextView2 != null) {
                                                                            i = R.id.paymentCb;
                                                                            CheckedTextView checkedTextView2 = (CheckedTextView) zp7.a(view, R.id.paymentCb);
                                                                            if (checkedTextView2 != null) {
                                                                                i = R.id.paymentStatusRl;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) zp7.a(view, R.id.paymentStatusRl);
                                                                                if (relativeLayout2 != null) {
                                                                                    i = R.id.paymentView;
                                                                                    View viewA = zp7.a(view, R.id.paymentView);
                                                                                    if (viewA != null) {
                                                                                        i = R.id.rc_number;
                                                                                        TextView textView = (TextView) zp7.a(view, R.id.rc_number);
                                                                                        if (textView != null) {
                                                                                            i = R.id.rec_rc_recycler;
                                                                                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rec_rc_recycler);
                                                                                            if (recyclerView != null) {
                                                                                                i = R.id.receiptCb;
                                                                                                CheckedTextView checkedTextView3 = (CheckedTextView) zp7.a(view, R.id.receiptCb);
                                                                                                if (checkedTextView3 != null) {
                                                                                                    i = R.id.receiptView;
                                                                                                    View viewA2 = zp7.a(view, R.id.receiptView);
                                                                                                    if (viewA2 != null) {
                                                                                                        i = R.id.reprintReceiptIv;
                                                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) zp7.a(view, R.id.reprintReceiptIv);
                                                                                                        if (appCompatImageView2 != null) {
                                                                                                            i = R.id.reprintReceiptRl;
                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) zp7.a(view, R.id.reprintReceiptRl);
                                                                                                            if (relativeLayout3 != null) {
                                                                                                                i = R.id.reprintReceiptTv;
                                                                                                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.reprintReceiptTv);
                                                                                                                if (myTextView3 != null) {
                                                                                                                    i = R.id.topBtnHolderLl;
                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.topBtnHolderLl);
                                                                                                                    if (linearLayout6 != null) {
                                                                                                                        i = R.id.topTitleTv;
                                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                                                                                                        if (appCompatTextView3 != null) {
                                                                                                                            i = R.id.topheader;
                                                                                                                            View viewA3 = zp7.a(view, R.id.topheader);
                                                                                                                            if (viewA3 != null) {
                                                                                                                                d47 d47VarA = d47.a(viewA3);
                                                                                                                                i = R.id.transStatusIv;
                                                                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) zp7.a(view, R.id.transStatusIv);
                                                                                                                                if (appCompatImageView3 != null) {
                                                                                                                                    i = R.id.transactionTv;
                                                                                                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.transactionTv);
                                                                                                                                    if (myTextView4 != null) {
                                                                                                                                        i = R.id.transcationStatusRl;
                                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) zp7.a(view, R.id.transcationStatusRl);
                                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                                            i = R.id.tv_chassi_no;
                                                                                                                                            TextView textView2 = (TextView) zp7.a(view, R.id.tv_chassi_no);
                                                                                                                                            if (textView2 != null) {
                                                                                                                                                i = R.id.tv_engine_no;
                                                                                                                                                TextView textView3 = (TextView) zp7.a(view, R.id.tv_engine_no);
                                                                                                                                                if (textView3 != null) {
                                                                                                                                                    i = R.id.tv_my_vehicle_list;
                                                                                                                                                    MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.tv_my_vehicle_list);
                                                                                                                                                    if (myTextView5 != null) {
                                                                                                                                                        i = R.id.tv_vehicle_no;
                                                                                                                                                        TextView textView4 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                            i = R.id.vehicleDetailsLl;
                                                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.vehicleDetailsLl);
                                                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                                                i = R.id.vehicleNoLl;
                                                                                                                                                                LinearLayout linearLayout8 = (LinearLayout) zp7.a(view, R.id.vehicleNoLl);
                                                                                                                                                                if (linearLayout8 != null) {
                                                                                                                                                                    i = R.id.vehicleNoRb;
                                                                                                                                                                    RadioButton radioButton3 = (RadioButton) zp7.a(view, R.id.vehicleNoRb);
                                                                                                                                                                    if (radioButton3 != null) {
                                                                                                                                                                        i = R.id.viewdetails;
                                                                                                                                                                        TextView textView5 = (TextView) zp7.a(view, R.id.viewdetails);
                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                            i = R.id.virtual_dl_view;
                                                                                                                                                                            LinearLayout linearLayout9 = (LinearLayout) zp7.a(view, R.id.virtual_dl_view);
                                                                                                                                                                            if (linearLayout9 != null) {
                                                                                                                                                                                i = R.id.virtualrc_layout;
                                                                                                                                                                                LinearLayout linearLayout10 = (LinearLayout) zp7.a(view, R.id.virtualrc_layout);
                                                                                                                                                                                if (linearLayout10 != null) {
                                                                                                                                                                                    return new wf((LinearLayout) view, appCompatTextView, checkedTextView, linearLayout, radioButton, editText, radioButton2, linearLayout2, linearLayout3, editText2, appCompatTextView2, linearLayout4, editText3, linearLayout5, myTextView, appCompatImageView, relativeLayout, myTextView2, checkedTextView2, relativeLayout2, viewA, textView, recyclerView, checkedTextView3, viewA2, appCompatImageView2, relativeLayout3, myTextView3, linearLayout6, appCompatTextView3, d47VarA, appCompatImageView3, myTextView4, relativeLayout4, textView2, textView3, myTextView5, textView4, linearLayout7, linearLayout8, radioButton3, textView5, linearLayout9, linearLayout10);
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

    public static wf c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static wf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_search_challan, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
