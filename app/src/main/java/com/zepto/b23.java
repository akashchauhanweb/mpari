package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b23 {
    public final ScrollView a;
    public final AppCompatButton b;
    public final TextView c;
    public final EditText d;
    public final LinearLayout e;
    public final EditText f;
    public final v23 g;
    public final Spinner h;
    public final EditText i;
    public final ImageView j;
    public final zh7 k;
    public final d47 l;
    public final MyTextView m;
    public final TextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final MyTextView q;
    public final MyTextView r;
    public final MyTextView s;
    public final TextView t;
    public final TextView u;

    public b23(ScrollView scrollView, AppCompatButton appCompatButton, TextView textView, EditText editText, LinearLayout linearLayout, EditText editText2, v23 v23Var, Spinner spinner, EditText editText3, ImageView imageView, zh7 zh7Var, d47 d47Var, MyTextView myTextView, TextView textView2, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView3, TextView textView4) {
        this.a = scrollView;
        this.b = appCompatButton;
        this.c = textView;
        this.d = editText;
        this.e = linearLayout;
        this.f = editText2;
        this.g = v23Var;
        this.h = spinner;
        this.i = editText3;
        this.j = imageView;
        this.k = zh7Var;
        this.l = d47Var;
        this.m = myTextView;
        this.n = textView2;
        this.o = myTextView2;
        this.p = myTextView3;
        this.q = myTextView4;
        this.r = myTextView5;
        this.s = myTextView6;
        this.t = textView3;
        this.u = textView4;
    }

    public static b23 a(View view) {
        int i = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
        if (appCompatButton != null) {
            i = R.id.firDateTv;
            TextView textView = (TextView) zp7.a(view, R.id.firDateTv);
            if (textView != null) {
                i = R.id.firNoTv;
                EditText editText = (EditText) zp7.a(view, R.id.firNoTv);
                if (editText != null) {
                    i = R.id.police_fir_layout;
                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.police_fir_layout);
                    if (linearLayout != null) {
                        i = R.id.policeStationTv;
                        EditText editText2 = (EditText) zp7.a(view, R.id.policeStationTv);
                        if (editText2 != null) {
                            i = R.id.rc_ind;
                            View viewA = zp7.a(view, R.id.rc_ind);
                            if (viewA != null) {
                                v23 v23VarA = v23.a(viewA);
                                i = R.id.reasonSpinner;
                                Spinner spinner = (Spinner) zp7.a(view, R.id.reasonSpinner);
                                if (spinner != null) {
                                    i = R.id.remarkTv;
                                    EditText editText3 = (EditText) zp7.a(view, R.id.remarkTv);
                                    if (editText3 != null) {
                                        i = R.id.rightReasonPin;
                                        ImageView imageView = (ImageView) zp7.a(view, R.id.rightReasonPin);
                                        if (imageView != null) {
                                            i = R.id.stepper_layout;
                                            View viewA2 = zp7.a(view, R.id.stepper_layout);
                                            if (viewA2 != null) {
                                                zh7 zh7VarA = zh7.a(viewA2);
                                                i = R.id.topHolder;
                                                View viewA3 = zp7.a(view, R.id.topHolder);
                                                if (viewA3 != null) {
                                                    d47 d47VarA = d47.a(viewA3);
                                                    i = R.id.vahan_details_duplicate_rc;
                                                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                                                    if (myTextView != null) {
                                                        i = R.id.vahan_duplicate_rc;
                                                        TextView textView2 = (TextView) zp7.a(view, R.id.vahan_duplicate_rc);
                                                        if (textView2 != null) {
                                                            i = R.id.vahan_fir_date;
                                                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.vahan_fir_date);
                                                            if (myTextView2 != null) {
                                                                i = R.id.vahan_police_station;
                                                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vahan_police_station);
                                                                if (myTextView3 != null) {
                                                                    i = R.id.vahan_reason;
                                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vahan_reason);
                                                                    if (myTextView4 != null) {
                                                                        i = R.id.vahan_remark;
                                                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.vahan_remark);
                                                                        if (myTextView5 != null) {
                                                                            i = R.id.vahan_report_no;
                                                                            MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.vahan_report_no);
                                                                            if (myTextView6 != null) {
                                                                                i = R.id.vehicleNumberTv;
                                                                                TextView textView3 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.vehicle_view;
                                                                                    TextView textView4 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                    if (textView4 != null) {
                                                                                        return new b23((ScrollView) view, appCompatButton, textView, editText, linearLayout, editText2, v23VarA, spinner, editText3, imageView, zh7VarA, d47VarA, myTextView, textView2, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView3, textView4);
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

    public static b23 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b23 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.issueofduplicate_rc_multi, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
