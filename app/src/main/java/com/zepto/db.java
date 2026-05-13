package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class db {
    public final ScrollView a;
    public final d47 b;
    public final MyTextView c;
    public final CustomWegetLayout d;
    public final MyTextView e;
    public final CustomWegetLayout f;
    public final ImageView g;
    public final MyTextView h;
    public final Spinner i;
    public final MyTextView j;
    public final AppCompatEditText k;
    public final MyTextView l;

    public db(ScrollView scrollView, d47 d47Var, MyTextView myTextView, CustomWegetLayout customWegetLayout, MyTextView myTextView2, CustomWegetLayout customWegetLayout2, ImageView imageView, MyTextView myTextView3, Spinner spinner, MyTextView myTextView4, AppCompatEditText appCompatEditText, MyTextView myTextView5) {
        this.a = scrollView;
        this.b = d47Var;
        this.c = myTextView;
        this.d = customWegetLayout;
        this.e = myTextView2;
        this.f = customWegetLayout2;
        this.g = imageView;
        this.h = myTextView3;
        this.i = spinner;
        this.j = myTextView4;
        this.k = appCompatEditText;
        this.l = myTextView5;
    }

    public static db a(View view) {
        int i = R.id.applicationStatusHeader;
        View viewA = zp7.a(view, R.id.applicationStatusHeader);
        if (viewA != null) {
            d47 d47VarA = d47.a(viewA);
            i = R.id.forstateTv;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.forstateTv);
            if (myTextView != null) {
                i = R.id.id_get_details_service;
                CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.id_get_details_service);
                if (customWegetLayout != null) {
                    i = R.id.idLayoutTitle;
                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.idLayoutTitle);
                    if (myTextView2 != null) {
                        i = R.id.reset;
                        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) zp7.a(view, R.id.reset);
                        if (customWegetLayout2 != null) {
                            i = R.id.rightStatePin;
                            ImageView imageView = (ImageView) zp7.a(view, R.id.rightStatePin);
                            if (imageView != null) {
                                i = R.id.select_state_name;
                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.select_state_name);
                                if (myTextView3 != null) {
                                    i = R.id.stateSpinner;
                                    Spinner spinner = (Spinner) zp7.a(view, R.id.stateSpinner);
                                    if (spinner != null) {
                                        i = R.id.time_text;
                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.time_text);
                                        if (myTextView4 != null) {
                                            i = R.id.txt_vehicle_no;
                                            AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.txt_vehicle_no);
                                            if (appCompatEditText != null) {
                                                i = R.id.vehicleTv;
                                                MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.vehicleTv);
                                                if (myTextView5 != null) {
                                                    return new db((ScrollView) view, d47VarA, myTextView, customWegetLayout, myTextView2, customWegetLayout2, imageView, myTextView3, spinner, myTextView4, appCompatEditText, myTextView5);
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

    public static db c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static db d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_download_check_post_receipt2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
