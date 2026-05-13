package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.cardview.widget.CardView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class vg2 {
    public final LinearLayout a;
    public final AppCompatSpinner b;
    public final AppCompatButton c;
    public final MaterialCardView d;
    public final CardView e;
    public final CardView f;
    public final EditText g;
    public final TextView h;
    public final EditText i;
    public final EditText j;
    public final EditText k;
    public final ImageButton l;
    public final ImageButton m;
    public final LinearLayout n;
    public final LinearLayout o;
    public final MapView p;
    public final AppCompatSpinner q;
    public final ScrollView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;

    public vg2(LinearLayout linearLayout, AppCompatSpinner appCompatSpinner, AppCompatButton appCompatButton, MaterialCardView materialCardView, CardView cardView, CardView cardView2, EditText editText, TextView textView, EditText editText2, EditText editText3, EditText editText4, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout2, LinearLayout linearLayout3, MapView mapView, AppCompatSpinner appCompatSpinner2, ScrollView scrollView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.a = linearLayout;
        this.b = appCompatSpinner;
        this.c = appCompatButton;
        this.d = materialCardView;
        this.e = cardView;
        this.f = cardView2;
        this.g = editText;
        this.h = textView;
        this.i = editText2;
        this.j = editText3;
        this.k = editText4;
        this.l = imageButton;
        this.m = imageButton2;
        this.n = linearLayout2;
        this.o = linearLayout3;
        this.p = mapView;
        this.q = appCompatSpinner2;
        this.r = scrollView;
        this.s = textView2;
        this.t = textView3;
        this.u = textView4;
        this.v = textView5;
        this.w = textView6;
        this.x = textView7;
    }

    public static vg2 a(View view) {
        int i = R.id.app_option;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) zp7.a(view, R.id.app_option);
        if (appCompatSpinner != null) {
            i = R.id.complain_reg;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.complain_reg);
            if (appCompatButton != null) {
                i = R.id.cv_complaint_status;
                MaterialCardView materialCardView = (MaterialCardView) zp7.a(view, R.id.cv_complaint_status);
                if (materialCardView != null) {
                    i = R.id.cv_report_complaint;
                    CardView cardView = (CardView) zp7.a(view, R.id.cv_report_complaint);
                    if (cardView != null) {
                        i = R.id.cv_report_traffic_violation_page;
                        CardView cardView2 = (CardView) zp7.a(view, R.id.cv_report_traffic_violation_page);
                        if (cardView2 != null) {
                            i = R.id.editTextTextPersonName11;
                            EditText editText = (EditText) zp7.a(view, R.id.editTextTextPersonName11);
                            if (editText != null) {
                                i = R.id.ev_calender_picker;
                                TextView textView = (TextView) zp7.a(view, R.id.ev_calender_picker);
                                if (textView != null) {
                                    i = R.id.ev_location;
                                    EditText editText2 = (EditText) zp7.a(view, R.id.ev_location);
                                    if (editText2 != null) {
                                        i = R.id.ev_time_picker;
                                        EditText editText3 = (EditText) zp7.a(view, R.id.ev_time_picker);
                                        if (editText3 != null) {
                                            i = R.id.ev_vehicle_no;
                                            EditText editText4 = (EditText) zp7.a(view, R.id.ev_vehicle_no);
                                            if (editText4 != null) {
                                                i = R.id.ib_imagePicker;
                                                ImageButton imageButton = (ImageButton) zp7.a(view, R.id.ib_imagePicker);
                                                if (imageButton != null) {
                                                    i = R.id.ib_videoPicker;
                                                    ImageButton imageButton2 = (ImageButton) zp7.a(view, R.id.ib_videoPicker);
                                                    if (imageButton2 != null) {
                                                        i = R.id.ll_dashboard;
                                                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.ll_dashboard);
                                                        if (linearLayout != null) {
                                                            i = R.id.ll_report_traffic_violation_page;
                                                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.ll_report_traffic_violation_page);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.mapv_report_traffic_violation_page;
                                                                MapView mapView = (MapView) zp7.a(view, R.id.mapv_report_traffic_violation_page);
                                                                if (mapView != null) {
                                                                    i = R.id.spn_state;
                                                                    AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) zp7.a(view, R.id.spn_state);
                                                                    if (appCompatSpinner2 != null) {
                                                                        i = R.id.sv_report_traffic_violation_page;
                                                                        ScrollView scrollView = (ScrollView) zp7.a(view, R.id.sv_report_traffic_violation_page);
                                                                        if (scrollView != null) {
                                                                            i = R.id.textView11111;
                                                                            TextView textView2 = (TextView) zp7.a(view, R.id.textView11111);
                                                                            if (textView2 != null) {
                                                                                i = R.id.textView2;
                                                                                TextView textView3 = (TextView) zp7.a(view, R.id.textView2);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.tv_date;
                                                                                    TextView textView4 = (TextView) zp7.a(view, R.id.tv_date);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.tv_location;
                                                                                        TextView textView5 = (TextView) zp7.a(view, R.id.tv_location);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.tv_report_traffic_violation;
                                                                                            TextView textView6 = (TextView) zp7.a(view, R.id.tv_report_traffic_violation);
                                                                                            if (textView6 != null) {
                                                                                                i = R.id.tv_vehicle_no;
                                                                                                TextView textView7 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                                                if (textView7 != null) {
                                                                                                    return new vg2((LinearLayout) view, appCompatSpinner, appCompatButton, materialCardView, cardView, cardView2, editText, textView, editText2, editText3, editText4, imageButton, imageButton2, linearLayout, linearLayout2, mapView, appCompatSpinner2, scrollView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static vg2 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_report_traffic_violation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
