package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ig {
    public final CoordinatorLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final TextView d;
    public final MaterialCardView e;
    public final MaterialCardView f;
    public final MaterialCardView g;
    public final MaterialCardView h;
    public final MaterialCardView i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public final ImageView m;
    public final LinearLayout n;
    public final LinearLayout o;
    public final LinearLayout p;
    public final TextView q;
    public final LinearLayout r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;

    public ig(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView2, LinearLayout linearLayout6, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.a = coordinatorLayout;
        this.b = linearLayout;
        this.c = linearLayout2;
        this.d = textView;
        this.e = materialCardView;
        this.f = materialCardView2;
        this.g = materialCardView3;
        this.h = materialCardView4;
        this.i = materialCardView5;
        this.j = imageView;
        this.k = imageView2;
        this.l = imageView3;
        this.m = imageView4;
        this.n = linearLayout3;
        this.o = linearLayout4;
        this.p = linearLayout5;
        this.q = textView2;
        this.r = linearLayout6;
        this.s = textView3;
        this.t = textView4;
        this.u = textView5;
        this.v = textView6;
        this.w = textView7;
        this.x = textView8;
    }

    public static ig a(View view) {
        int i = R.id.addcontactdetails;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.addcontactdetails);
        if (linearLayout != null) {
            i = R.id.contact_amblunce;
            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.contact_amblunce);
            if (linearLayout2 != null) {
                i = R.id.create_emerg_profile;
                TextView textView = (TextView) zp7.a(view, R.id.create_emerg_profile);
                if (textView != null) {
                    i = R.id.cv_citizen_sentinel;
                    MaterialCardView materialCardView = (MaterialCardView) zp7.a(view, R.id.cv_citizen_sentinel);
                    if (materialCardView != null) {
                        i = R.id.cv_report_accident;
                        MaterialCardView materialCardView2 = (MaterialCardView) zp7.a(view, R.id.cv_report_accident);
                        if (materialCardView2 != null) {
                            i = R.id.cv_report_accident_icon;
                            MaterialCardView materialCardView3 = (MaterialCardView) zp7.a(view, R.id.cv_report_accident_icon);
                            if (materialCardView3 != null) {
                                i = R.id.cv_report_traffic_violation;
                                MaterialCardView materialCardView4 = (MaterialCardView) zp7.a(view, R.id.cv_report_traffic_violation);
                                if (materialCardView4 != null) {
                                    i = R.id.cv_report_traffic_violation_icon;
                                    MaterialCardView materialCardView5 = (MaterialCardView) zp7.a(view, R.id.cv_report_traffic_violation_icon);
                                    if (materialCardView5 != null) {
                                        i = R.id.iv_report_accident_icon;
                                        ImageView imageView = (ImageView) zp7.a(view, R.id.iv_report_accident_icon);
                                        if (imageView != null) {
                                            i = R.id.iv_report_accident_view_more;
                                            ImageView imageView2 = (ImageView) zp7.a(view, R.id.iv_report_accident_view_more);
                                            if (imageView2 != null) {
                                                i = R.id.iv_report_traffic_violation_icon;
                                                ImageView imageView3 = (ImageView) zp7.a(view, R.id.iv_report_traffic_violation_icon);
                                                if (imageView3 != null) {
                                                    i = R.id.iv_report_traffic_violation_view_more;
                                                    ImageView imageView4 = (ImageView) zp7.a(view, R.id.iv_report_traffic_violation_view_more);
                                                    if (imageView4 != null) {
                                                        i = R.id.ll_citizen_sentinel;
                                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.ll_citizen_sentinel);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.nexgenarrow;
                                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                                            if (linearLayout4 != null) {
                                                                i = R.id.nexgenlogo;
                                                                LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                                                if (linearLayout5 != null) {
                                                                    i = R.id.service_label;
                                                                    TextView textView2 = (TextView) zp7.a(view, R.id.service_label);
                                                                    if (textView2 != null) {
                                                                        i = R.id.tap_notify;
                                                                        LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.tap_notify);
                                                                        if (linearLayout6 != null) {
                                                                            i = R.id.tv_call_ambulance;
                                                                            TextView textView3 = (TextView) zp7.a(view, R.id.tv_call_ambulance);
                                                                            if (textView3 != null) {
                                                                                i = R.id.tv_citizen_sentinel;
                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.tv_citizen_sentinel);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.tv_emerg_note;
                                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.tv_emerg_note);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.tv_report_traffic_violation;
                                                                                        TextView textView6 = (TextView) zp7.a(view, R.id.tv_report_traffic_violation);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.tv_tap_dial;
                                                                                            TextView textView7 = (TextView) zp7.a(view, R.id.tv_tap_dial);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.tv_tap_notify_contact;
                                                                                                TextView textView8 = (TextView) zp7.a(view, R.id.tv_tap_notify_contact);
                                                                                                if (textView8 != null) {
                                                                                                    return new ig((CoordinatorLayout) view, linearLayout, linearLayout2, textView, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, imageView, imageView2, imageView3, imageView4, linearLayout3, linearLayout4, linearLayout5, textView2, linearLayout6, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static ig c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ig d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sos_home_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
