package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class t17 {
    public final CoordinatorLayout a;
    public final TextView b;
    public final k27 c;
    public final ImageView d;
    public final vy3 e;
    public final AppCompatTextView f;
    public final LinearLayout g;
    public final FrameLayout h;
    public final FrameLayout i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final CustomWegetLayout o;
    public final RecyclerView p;
    public final CardView q;
    public final RecyclerView r;
    public final TextView s;
    public final TextView t;
    public final View u;
    public final View v;

    public t17(CoordinatorLayout coordinatorLayout, TextView textView, k27 k27Var, ImageView imageView, vy3 vy3Var, AppCompatTextView appCompatTextView, LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, CustomWegetLayout customWegetLayout, RecyclerView recyclerView, CardView cardView, RecyclerView recyclerView2, TextView textView7, TextView textView8, View view, View view2) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = k27Var;
        this.d = imageView;
        this.e = vy3Var;
        this.f = appCompatTextView;
        this.g = linearLayout;
        this.h = frameLayout;
        this.i = frameLayout2;
        this.j = textView2;
        this.k = textView3;
        this.l = textView4;
        this.m = textView5;
        this.n = textView6;
        this.o = customWegetLayout;
        this.p = recyclerView;
        this.q = cardView;
        this.r = recyclerView2;
        this.s = textView7;
        this.t = textView8;
        this.u = view;
        this.v = view2;
    }

    public static t17 a(View view) {
        int i = R.id.application_no;
        TextView textView = (TextView) zp7.a(view, R.id.application_no);
        if (textView != null) {
            i = R.id.dms_layout;
            View viewA = zp7.a(view, R.id.dms_layout);
            if (viewA != null) {
                k27 k27VarA = k27.a(viewA);
                i = R.id.downArrowVehicleDetails;
                ImageView imageView = (ImageView) zp7.a(view, R.id.downArrowVehicleDetails);
                if (imageView != null) {
                    i = R.id.header_layout;
                    View viewA2 = zp7.a(view, R.id.header_layout);
                    if (viewA2 != null) {
                        vy3 vy3VarA = vy3.a(viewA2);
                        i = R.id.header_title_vehicle_details;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.header_title_vehicle_details);
                        if (appCompatTextView != null) {
                            i = R.id.linearLayout2;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.linearLayout2);
                            if (linearLayout != null) {
                                i = R.id.linear_parent;
                                FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.linear_parent);
                                if (frameLayout != null) {
                                    i = R.id.nextBtnFl;
                                    FrameLayout frameLayout2 = (FrameLayout) zp7.a(view, R.id.nextBtnFl);
                                    if (frameLayout2 != null) {
                                        i = R.id.service_name;
                                        TextView textView2 = (TextView) zp7.a(view, R.id.service_name);
                                        if (textView2 != null) {
                                            i = R.id.skipped_upload_doc;
                                            TextView textView3 = (TextView) zp7.a(view, R.id.skipped_upload_doc);
                                            if (textView3 != null) {
                                                i = R.id.submit;
                                                TextView textView4 = (TextView) zp7.a(view, R.id.submit);
                                                if (textView4 != null) {
                                                    i = R.id.textView;
                                                    TextView textView5 = (TextView) zp7.a(view, R.id.textView);
                                                    if (textView5 != null) {
                                                        i = R.id.textView2;
                                                        TextView textView6 = (TextView) zp7.a(view, R.id.textView2);
                                                        if (textView6 != null) {
                                                            i = R.id.upload_documents;
                                                            CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.upload_documents);
                                                            if (customWegetLayout != null) {
                                                                i = R.id.upload_list_rv;
                                                                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.upload_list_rv);
                                                                if (recyclerView != null) {
                                                                    i = R.id.uploaded_doc_list;
                                                                    CardView cardView = (CardView) zp7.a(view, R.id.uploaded_doc_list);
                                                                    if (cardView != null) {
                                                                        i = R.id.uploaded_list;
                                                                        RecyclerView recyclerView2 = (RecyclerView) zp7.a(view, R.id.uploaded_list);
                                                                        if (recyclerView2 != null) {
                                                                            i = R.id.vehicle_number;
                                                                            TextView textView7 = (TextView) zp7.a(view, R.id.vehicle_number);
                                                                            if (textView7 != null) {
                                                                                i = R.id.vehicle_view;
                                                                                TextView textView8 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.view8;
                                                                                    View viewA3 = zp7.a(view, R.id.view8);
                                                                                    if (viewA3 != null) {
                                                                                        i = R.id.view9;
                                                                                        View viewA4 = zp7.a(view, R.id.view9);
                                                                                        if (viewA4 != null) {
                                                                                            return new t17((CoordinatorLayout) view, textView, k27VarA, imageView, vy3VarA, appCompatTextView, linearLayout, frameLayout, frameLayout2, textView2, textView3, textView4, textView5, textView6, customWegetLayout, recyclerView, cardView, recyclerView2, textView7, textView8, viewA3, viewA4);
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

    public static t17 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static t17 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_dms_activity_reupload, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
