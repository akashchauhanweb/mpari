package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class bf {
    public final ScrollView a;
    public final MyTextView b;
    public final LinearLayout c;
    public final MyTextView d;
    public final LinearLayout e;
    public final EditText f;
    public final MyTextView g;
    public final CustomWegetLayout h;
    public final MyTextView i;
    public final CheckBox j;
    public final LinearLayout k;
    public final EditText l;
    public final MyTextView m;
    public final RecyclerView n;
    public final CustomWegetLayout o;
    public final TextView p;
    public final LinearLayout q;
    public final d47 r;
    public final TextView s;
    public final TextView t;
    public final CheckBox u;

    public bf(ScrollView scrollView, MyTextView myTextView, LinearLayout linearLayout, MyTextView myTextView2, LinearLayout linearLayout2, EditText editText, MyTextView myTextView3, CustomWegetLayout customWegetLayout, MyTextView myTextView4, CheckBox checkBox, LinearLayout linearLayout3, EditText editText2, MyTextView myTextView5, RecyclerView recyclerView, CustomWegetLayout customWegetLayout2, TextView textView, LinearLayout linearLayout4, d47 d47Var, TextView textView2, TextView textView3, CheckBox checkBox2) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = linearLayout;
        this.d = myTextView2;
        this.e = linearLayout2;
        this.f = editText;
        this.g = myTextView3;
        this.h = customWegetLayout;
        this.i = myTextView4;
        this.j = checkBox;
        this.k = linearLayout3;
        this.l = editText2;
        this.m = myTextView5;
        this.n = recyclerView;
        this.o = customWegetLayout2;
        this.p = textView;
        this.q = linearLayout4;
        this.r = d47Var;
        this.s = textView2;
        this.t = textView3;
        this.u = checkBox2;
    }

    public static bf a(View view) {
        int i = R.id.area_detail;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.area_detail);
        if (myTextView != null) {
            i = R.id.area_details_layout;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.area_details_layout);
            if (linearLayout != null) {
                i = R.id.area_selected;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.area_selected);
                if (myTextView2 != null) {
                    i = R.id.area_selected_details;
                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.area_selected_details);
                    if (linearLayout2 != null) {
                        i = R.id.enter_parking;
                        EditText editText = (EditText) zp7.a(view, R.id.enter_parking);
                        if (editText != null) {
                            i = R.id.enter_parking_txt;
                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.enter_parking_txt);
                            if (myTextView3 != null) {
                                i = R.id.id_next_service;
                                CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.id_next_service);
                                if (customWegetLayout != null) {
                                    i = R.id.optional_details;
                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.optional_details);
                                    if (myTextView4 != null) {
                                        i = R.id.other_area;
                                        CheckBox checkBox = (CheckBox) zp7.a(view, R.id.other_area);
                                        if (checkBox != null) {
                                            i = R.id.police_fir_layout;
                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.police_fir_layout);
                                            if (linearLayout3 != null) {
                                                i = R.id.purpose_of_journey;
                                                EditText editText2 = (EditText) zp7.a(view, R.id.purpose_of_journey);
                                                if (editText2 != null) {
                                                    i = R.id.purpose_of_journey_txt;
                                                    MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.purpose_of_journey_txt);
                                                    if (myTextView5 != null) {
                                                        i = R.id.reginRecycle;
                                                        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.reginRecycle);
                                                        if (recyclerView != null) {
                                                            i = R.id.reset;
                                                            CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) zp7.a(view, R.id.reset);
                                                            if (customWegetLayout2 != null) {
                                                                i = R.id.seclected_area;
                                                                TextView textView = (TextView) zp7.a(view, R.id.seclected_area);
                                                                if (textView != null) {
                                                                    i = R.id.text_exemption;
                                                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.text_exemption);
                                                                    if (linearLayout4 != null) {
                                                                        i = R.id.topHolder;
                                                                        View viewA = zp7.a(view, R.id.topHolder);
                                                                        if (viewA != null) {
                                                                            d47 d47VarA = d47.a(viewA);
                                                                            i = R.id.vehicleNumberTv;
                                                                            TextView textView2 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                            if (textView2 != null) {
                                                                                i = R.id.vehicle_view;
                                                                                TextView textView3 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.within_gujarat;
                                                                                    CheckBox checkBox2 = (CheckBox) zp7.a(view, R.id.within_gujarat);
                                                                                    if (checkBox2 != null) {
                                                                                        return new bf((ScrollView) view, myTextView, linearLayout, myTextView2, linearLayout2, editText, myTextView3, customWegetLayout, myTextView4, checkBox, linearLayout3, editText2, myTextView5, recyclerView, customWegetLayout2, textView, linearLayout4, d47VarA, textView2, textView3, checkBox2);
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

    public static bf c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static bf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_renewal_of_permit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
