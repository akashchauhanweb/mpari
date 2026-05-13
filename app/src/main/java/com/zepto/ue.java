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
public final class ue {
    public final ScrollView a;
    public final AppCompatButton b;
    public final AppCompatEditText c;
    public final MyTextView d;
    public final d47 e;
    public final MyTextView f;
    public final AppCompatEditText g;
    public final MyTextView h;

    public ue(ScrollView scrollView, AppCompatButton appCompatButton, AppCompatEditText appCompatEditText, MyTextView myTextView, d47 d47Var, MyTextView myTextView2, AppCompatEditText appCompatEditText2, MyTextView myTextView3) {
        this.a = scrollView;
        this.b = appCompatButton;
        this.c = appCompatEditText;
        this.d = myTextView;
        this.e = d47Var;
        this.f = myTextView2;
        this.g = appCompatEditText2;
        this.h = myTextView3;
    }

    public static ue a(View view) {
        int i = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
        if (appCompatButton != null) {
            i = R.id.chasis_no;
            AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.chasis_no);
            if (appCompatEditText != null) {
                i = R.id.chasis_no_txt;
                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.chasis_no_txt);
                if (myTextView != null) {
                    i = R.id.topHolder;
                    View viewA = zp7.a(view, R.id.topHolder);
                    if (viewA != null) {
                        d47 d47VarA = d47.a(viewA);
                        i = R.id.vahan_details_duplicate_rc;
                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                        if (myTextView2 != null) {
                            i = R.id.vehicle_no;
                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) zp7.a(view, R.id.vehicle_no);
                            if (appCompatEditText2 != null) {
                                i = R.id.vehicle_no_txt;
                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vehicle_no_txt);
                                if (myTextView3 != null) {
                                    return new ue((ScrollView) view, appCompatButton, appCompatEditText, myTextView, d47VarA, myTextView2, appCompatEditText2, myTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ue c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ue d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pucccertificate_download, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
