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
public final class lb {
    public final ScrollView a;
    public final AppCompatButton b;
    public final TextView c;
    public final EditText d;
    public final LinearLayout e;
    public final EditText f;
    public final Spinner g;
    public final EditText h;
    public final ImageView i;
    public final d47 j;
    public final MyTextView k;
    public final MyTextView l;
    public final MyTextView m;
    public final MyTextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final TextView q;
    public final TextView r;

    public lb(ScrollView scrollView, AppCompatButton appCompatButton, TextView textView, EditText editText, LinearLayout linearLayout, EditText editText2, Spinner spinner, EditText editText3, ImageView imageView, d47 d47Var, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView2, TextView textView3) {
        this.a = scrollView;
        this.b = appCompatButton;
        this.c = textView;
        this.d = editText;
        this.e = linearLayout;
        this.f = editText2;
        this.g = spinner;
        this.h = editText3;
        this.i = imageView;
        this.j = d47Var;
        this.k = myTextView;
        this.l = myTextView2;
        this.m = myTextView3;
        this.n = myTextView4;
        this.o = myTextView5;
        this.p = myTextView6;
        this.q = textView2;
        this.r = textView3;
    }

    public static lb a(View view) {
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
                            i = R.id.reasonSpinner;
                            Spinner spinner = (Spinner) zp7.a(view, R.id.reasonSpinner);
                            if (spinner != null) {
                                i = R.id.remarkTv;
                                EditText editText3 = (EditText) zp7.a(view, R.id.remarkTv);
                                if (editText3 != null) {
                                    i = R.id.rightReasonPin;
                                    ImageView imageView = (ImageView) zp7.a(view, R.id.rightReasonPin);
                                    if (imageView != null) {
                                        i = R.id.topHolder;
                                        View viewA = zp7.a(view, R.id.topHolder);
                                        if (viewA != null) {
                                            d47 d47VarA = d47.a(viewA);
                                            i = R.id.vahan_details_duplicate_rc;
                                            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                                            if (myTextView != null) {
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
                                                                    TextView textView2 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                    if (textView2 != null) {
                                                                        i = R.id.vehicle_view;
                                                                        TextView textView3 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                        if (textView3 != null) {
                                                                            return new lb((ScrollView) view, appCompatButton, textView, editText, linearLayout, editText2, spinner, editText3, imageView, d47VarA, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView2, textView3);
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

    public static lb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static lb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_duplicate_fitness_certificate, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
