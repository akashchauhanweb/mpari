package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class b8 {
    public final LinearLayout a;
    public final Spinner b;
    public final Spinner c;
    public final TextView d;
    public final MyTextView e;
    public final MyTextView f;
    public final MyTextView g;
    public final CustomWegetLayout h;
    public final CustomWegetLayout i;

    public b8(LinearLayout linearLayout, Spinner spinner, Spinner spinner2, TextView textView, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2) {
        this.a = linearLayout;
        this.b = spinner;
        this.c = spinner2;
        this.d = textView;
        this.e = myTextView;
        this.f = myTextView2;
        this.g = myTextView3;
        this.h = customWegetLayout;
        this.i = customWegetLayout2;
    }

    public static b8 a(View view) {
        int i = R.id.current_rto;
        Spinner spinner = (Spinner) zp7.a(view, R.id.current_rto);
        if (spinner != null) {
            i = R.id.current_state;
            Spinner spinner2 = (Spinner) zp7.a(view, R.id.current_state);
            if (spinner2 != null) {
                i = R.id.dl_no;
                TextView textView = (TextView) zp7.a(view, R.id.dl_no);
                if (textView != null) {
                    i = R.id.dl_number_new;
                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.dl_number_new);
                    if (myTextView != null) {
                        i = R.id.txt_req_submit;
                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.txt_req_submit);
                        if (myTextView2 != null) {
                            i = R.id.txt_req_submit_rto;
                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.txt_req_submit_rto);
                            if (myTextView3 != null) {
                                i = R.id.txt_service_cancel;
                                CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.txt_service_cancel);
                                if (customWegetLayout != null) {
                                    i = R.id.txt_service_submit;
                                    CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) zp7.a(view, R.id.txt_service_submit);
                                    if (customWegetLayout2 != null) {
                                        return new b8((LinearLayout) view, spinner, spinner2, textView, myTextView, myTextView2, myTextView3, customWegetLayout, customWegetLayout2);
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

    public static b8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_cl_rto_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
