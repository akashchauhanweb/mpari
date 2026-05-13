package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mb {
    public final ScrollView a;
    public final AppCompatEditText b;
    public final AppCompatButton c;
    public final d47 d;
    public final MyTextView e;
    public final MyTextView f;

    public mb(ScrollView scrollView, AppCompatEditText appCompatEditText, AppCompatButton appCompatButton, d47 d47Var, MyTextView myTextView, MyTextView myTextView2) {
        this.a = scrollView;
        this.b = appCompatEditText;
        this.c = appCompatButton;
        this.d = d47Var;
        this.e = myTextView;
        this.f = myTextView2;
    }

    public static mb a(View view) {
        int i = R.id.app_no;
        AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.app_no);
        if (appCompatEditText != null) {
            i = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
            if (appCompatButton != null) {
                i = R.id.topHolder;
                View viewA = zp7.a(view, R.id.topHolder);
                if (viewA != null) {
                    d47 d47VarA = d47.a(viewA);
                    i = R.id.vahan_details_duplicate_rc;
                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                    if (myTextView != null) {
                        i = R.id.vehicle_no_txt;
                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.vehicle_no_txt);
                        if (myTextView2 != null) {
                            return new mb((ScrollView) view, appCompatEditText, appCompatButton, d47VarA, myTextView, myTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static mb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static mb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_duplicate_fitness_certificate_download, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
