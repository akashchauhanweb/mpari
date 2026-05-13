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
public final class fh {
    public final ScrollView a;
    public final MyTextView b;
    public final AppCompatButton c;
    public final TextView d;
    public final EditText e;
    public final LinearLayout f;
    public final EditText g;
    public final Spinner h;
    public final EditText i;
    public final Spinner j;
    public final ImageView k;
    public final ImageView l;
    public final d47 m;
    public final MyTextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final MyTextView q;
    public final MyTextView r;
    public final MyTextView s;
    public final TextView t;
    public final TextView u;

    public fh(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, TextView textView, EditText editText, LinearLayout linearLayout, EditText editText2, Spinner spinner, EditText editText3, Spinner spinner2, ImageView imageView, ImageView imageView2, d47 d47Var, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, TextView textView2, TextView textView3) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = appCompatButton;
        this.d = textView;
        this.e = editText;
        this.f = linearLayout;
        this.g = editText2;
        this.h = spinner;
        this.i = editText3;
        this.j = spinner2;
        this.k = imageView;
        this.l = imageView2;
        this.m = d47Var;
        this.n = myTextView2;
        this.o = myTextView3;
        this.p = myTextView4;
        this.q = myTextView5;
        this.r = myTextView6;
        this.s = myTextView7;
        this.t = textView2;
        this.u = textView3;
    }

    public static fh a(View view) {
        int i = R.id.ApplyForDupPermit;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.ApplyForDupPermit);
        if (myTextView != null) {
            i = R.id.btnSubmit;
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
                                        i = R.id.required_document_Spinner;
                                        Spinner spinner2 = (Spinner) zp7.a(view, R.id.required_document_Spinner);
                                        if (spinner2 != null) {
                                            i = R.id.rightReasonPin;
                                            ImageView imageView = (ImageView) zp7.a(view, R.id.rightReasonPin);
                                            if (imageView != null) {
                                                i = R.id.rightrequired_documentPin;
                                                ImageView imageView2 = (ImageView) zp7.a(view, R.id.rightrequired_documentPin);
                                                if (imageView2 != null) {
                                                    i = R.id.topHoldermenu;
                                                    View viewA = zp7.a(view, R.id.topHoldermenu);
                                                    if (viewA != null) {
                                                        d47 d47VarA = d47.a(viewA);
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
                                                                            i = R.id.vahan_required_document;
                                                                            MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.vahan_required_document);
                                                                            if (myTextView7 != null) {
                                                                                i = R.id.vehicleNumberTv;
                                                                                TextView textView2 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.vehicle_view;
                                                                                    TextView textView3 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                    if (textView3 != null) {
                                                                                        return new fh((ScrollView) view, myTextView, appCompatButton, textView, editText, linearLayout, editText2, spinner, editText3, spinner2, imageView, imageView2, d47VarA, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, textView2, textView3);
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

    public static fh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static fh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_duplicate_permit_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
