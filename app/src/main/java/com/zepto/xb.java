package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class xb {
    public final ScrollView a;
    public final MyTextView b;
    public final AppCompatButton c;
    public final ImageView d;
    public final MyTextView e;
    public final Spinner f;
    public final d47 g;
    public final AppCompatEditText h;
    public final MyTextView i;

    public xb(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, ImageView imageView, MyTextView myTextView2, Spinner spinner, d47 d47Var, AppCompatEditText appCompatEditText, MyTextView myTextView3) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = appCompatButton;
        this.d = imageView;
        this.e = myTextView2;
        this.f = spinner;
        this.g = d47Var;
        this.h = appCompatEditText;
        this.i = myTextView3;
    }

    public static xb a(View view) {
        int i = R.id.application_no;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.application_no);
        if (myTextView != null) {
            i = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
            if (appCompatButton != null) {
                i = R.id.rightStatePin;
                ImageView imageView = (ImageView) zp7.a(view, R.id.rightStatePin);
                if (imageView != null) {
                    i = R.id.state_name;
                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.state_name);
                    if (myTextView2 != null) {
                        i = R.id.stateSpinner;
                        Spinner spinner = (Spinner) zp7.a(view, R.id.stateSpinner);
                        if (spinner != null) {
                            i = R.id.topHolder;
                            View viewA = zp7.a(view, R.id.topHolder);
                            if (viewA != null) {
                                d47 d47VarA = d47.a(viewA);
                                i = R.id.txt_rcptnumber;
                                AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.txt_rcptnumber);
                                if (appCompatEditText != null) {
                                    i = R.id.vahan_details_duplicate_rc;
                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                                    if (myTextView3 != null) {
                                        return new xb((ScrollView) view, myTextView, appCompatButton, imageView, myTextView2, spinner, d47VarA, appCompatEditText, myTextView3);
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

    public static xb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static xb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_fancy_fee_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
