package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yf {
    public final LinearLayout A;
    public final LinearLayout a;
    public final LinearLayout b;
    public final RadioButton c;
    public final EditText d;
    public final RadioButton e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final EditText h;
    public final AppCompatTextView i;
    public final LinearLayout j;
    public final EditText k;
    public final LinearLayout l;
    public final MyTextView m;
    public final TextView n;
    public final RecyclerView o;
    public final AppCompatTextView p;
    public final d47 q;
    public final TextView r;
    public final TextView s;
    public final MyTextView t;
    public final TextView u;
    public final LinearLayout v;
    public final LinearLayout w;
    public final RadioButton x;
    public final TextView y;
    public final LinearLayout z;

    public yf(LinearLayout linearLayout, LinearLayout linearLayout2, RadioButton radioButton, EditText editText, RadioButton radioButton2, LinearLayout linearLayout3, LinearLayout linearLayout4, EditText editText2, AppCompatTextView appCompatTextView, LinearLayout linearLayout5, EditText editText3, LinearLayout linearLayout6, MyTextView myTextView, TextView textView, RecyclerView recyclerView, AppCompatTextView appCompatTextView2, d47 d47Var, TextView textView2, TextView textView3, MyTextView myTextView2, TextView textView4, LinearLayout linearLayout7, LinearLayout linearLayout8, RadioButton radioButton3, TextView textView5, LinearLayout linearLayout9, LinearLayout linearLayout10) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = radioButton;
        this.d = editText;
        this.e = radioButton2;
        this.f = linearLayout3;
        this.g = linearLayout4;
        this.h = editText2;
        this.i = appCompatTextView;
        this.j = linearLayout5;
        this.k = editText3;
        this.l = linearLayout6;
        this.m = myTextView;
        this.n = textView;
        this.o = recyclerView;
        this.p = appCompatTextView2;
        this.q = d47Var;
        this.r = textView2;
        this.s = textView3;
        this.t = myTextView2;
        this.u = textView4;
        this.v = linearLayout7;
        this.w = linearLayout8;
        this.x = radioButton3;
        this.y = textView5;
        this.z = linearLayout9;
        this.A = linearLayout10;
    }

    public static yf a(View view) {
        int i = R.id.challanNoLl;
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
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.getDetailsTv);
                                    if (appCompatTextView != null) {
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
                                                        i = R.id.rc_number;
                                                        TextView textView = (TextView) zp7.a(view, R.id.rc_number);
                                                        if (textView != null) {
                                                            i = R.id.rec_rc_recycler;
                                                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rec_rc_recycler);
                                                            if (recyclerView != null) {
                                                                i = R.id.titleTv;
                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                                                if (appCompatTextView2 != null) {
                                                                    i = R.id.topheader;
                                                                    View viewA = zp7.a(view, R.id.topheader);
                                                                    if (viewA != null) {
                                                                        d47 d47VarA = d47.a(viewA);
                                                                        i = R.id.tv_chassi_no;
                                                                        TextView textView2 = (TextView) zp7.a(view, R.id.tv_chassi_no);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tv_engine_no;
                                                                            TextView textView3 = (TextView) zp7.a(view, R.id.tv_engine_no);
                                                                            if (textView3 != null) {
                                                                                i = R.id.tv_my_vehicle_list;
                                                                                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.tv_my_vehicle_list);
                                                                                if (myTextView2 != null) {
                                                                                    i = R.id.tv_vehicle_no;
                                                                                    TextView textView4 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.vehicleDetailsLl;
                                                                                        LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.vehicleDetailsLl);
                                                                                        if (linearLayout6 != null) {
                                                                                            i = R.id.vehicleNoLl;
                                                                                            LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.vehicleNoLl);
                                                                                            if (linearLayout7 != null) {
                                                                                                i = R.id.vehicleNoRb;
                                                                                                RadioButton radioButton3 = (RadioButton) zp7.a(view, R.id.vehicleNoRb);
                                                                                                if (radioButton3 != null) {
                                                                                                    i = R.id.viewdetails;
                                                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.viewdetails);
                                                                                                    if (textView5 != null) {
                                                                                                        i = R.id.virtual_dl_view;
                                                                                                        LinearLayout linearLayout8 = (LinearLayout) zp7.a(view, R.id.virtual_dl_view);
                                                                                                        if (linearLayout8 != null) {
                                                                                                            i = R.id.virtualrc_layout;
                                                                                                            LinearLayout linearLayout9 = (LinearLayout) zp7.a(view, R.id.virtualrc_layout);
                                                                                                            if (linearLayout9 != null) {
                                                                                                                return new yf((LinearLayout) view, linearLayout, radioButton, editText, radioButton2, linearLayout2, linearLayout3, editText2, appCompatTextView, linearLayout4, editText3, linearLayout5, myTextView, textView, recyclerView, appCompatTextView2, d47VarA, textView2, textView3, myTextView2, textView4, linearLayout6, linearLayout7, radioButton3, textView5, linearLayout8, linearLayout9);
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

    public static yf c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static yf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_search_challan_online, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
