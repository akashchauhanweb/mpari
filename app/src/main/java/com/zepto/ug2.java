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
import androidx.cardview.widget.CardView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ug2 {
    public final LinearLayout a;
    public final MaterialCardView b;
    public final CardView c;
    public final EditText d;
    public final TextView e;
    public final EditText f;
    public final TextView g;
    public final EditText h;
    public final ImageButton i;
    public final ImageButton j;
    public final LinearLayout k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final MapView n;
    public final AppCompatButton o;
    public final ScrollView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;

    public ug2(LinearLayout linearLayout, MaterialCardView materialCardView, CardView cardView, EditText editText, TextView textView, EditText editText2, TextView textView2, EditText editText3, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, MapView mapView, AppCompatButton appCompatButton, ScrollView scrollView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.a = linearLayout;
        this.b = materialCardView;
        this.c = cardView;
        this.d = editText;
        this.e = textView;
        this.f = editText2;
        this.g = textView2;
        this.h = editText3;
        this.i = imageButton;
        this.j = imageButton2;
        this.k = linearLayout2;
        this.l = linearLayout3;
        this.m = linearLayout4;
        this.n = mapView;
        this.o = appCompatButton;
        this.p = scrollView;
        this.q = textView3;
        this.r = textView4;
        this.s = textView5;
        this.t = textView6;
        this.u = textView7;
        this.v = textView8;
    }

    public static ug2 a(View view) {
        int i = R.id.cv_complaint_status;
        MaterialCardView materialCardView = (MaterialCardView) zp7.a(view, R.id.cv_complaint_status);
        if (materialCardView != null) {
            i = R.id.cv_report_accident_page;
            CardView cardView = (CardView) zp7.a(view, R.id.cv_report_accident_page);
            if (cardView != null) {
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
                            TextView textView2 = (TextView) zp7.a(view, R.id.ev_time_picker);
                            if (textView2 != null) {
                                i = R.id.ev_vehicle_no;
                                EditText editText3 = (EditText) zp7.a(view, R.id.ev_vehicle_no);
                                if (editText3 != null) {
                                    i = R.id.ib_imagePicker;
                                    ImageButton imageButton = (ImageButton) zp7.a(view, R.id.ib_imagePicker);
                                    if (imageButton != null) {
                                        i = R.id.ib_videoPicker;
                                        ImageButton imageButton2 = (ImageButton) zp7.a(view, R.id.ib_videoPicker);
                                        if (imageButton2 != null) {
                                            i = R.id.ll_acc_report;
                                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.ll_acc_report);
                                            if (linearLayout != null) {
                                                i = R.id.ll_dashboard;
                                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.ll_dashboard);
                                                if (linearLayout2 != null) {
                                                    i = R.id.ll_report_accident_page;
                                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.ll_report_accident_page);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.mapv_report_traffic_violation_page;
                                                        MapView mapView = (MapView) zp7.a(view, R.id.mapv_report_traffic_violation_page);
                                                        if (mapView != null) {
                                                            i = R.id.submit_acc_report;
                                                            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.submit_acc_report);
                                                            if (appCompatButton != null) {
                                                                i = R.id.sv_report_accident_page;
                                                                ScrollView scrollView = (ScrollView) zp7.a(view, R.id.sv_report_accident_page);
                                                                if (scrollView != null) {
                                                                    i = R.id.textView11111;
                                                                    TextView textView3 = (TextView) zp7.a(view, R.id.textView11111);
                                                                    if (textView3 != null) {
                                                                        i = R.id.textView2;
                                                                        TextView textView4 = (TextView) zp7.a(view, R.id.textView2);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tv_date;
                                                                            TextView textView5 = (TextView) zp7.a(view, R.id.tv_date);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tv_location;
                                                                                TextView textView6 = (TextView) zp7.a(view, R.id.tv_location);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tv_report_accident_page;
                                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.tv_report_accident_page);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.tv_vehicle_no;
                                                                                        TextView textView8 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                                        if (textView8 != null) {
                                                                                            return new ug2((LinearLayout) view, materialCardView, cardView, editText, textView, editText2, textView2, editText3, imageButton, imageButton2, linearLayout, linearLayout2, linearLayout3, mapView, appCompatButton, scrollView, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static ug2 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_report_accident, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
