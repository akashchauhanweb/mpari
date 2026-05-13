package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s6 {
    public final ScrollView a;
    public final AppCompatButton b;
    public final ImageView c;
    public final ImageView d;
    public final Spinner e;
    public final MyTextView f;
    public final Spinner g;
    public final d47 h;
    public final MyTextView i;
    public final MyTextView j;

    public s6(ScrollView scrollView, AppCompatButton appCompatButton, ImageView imageView, ImageView imageView2, Spinner spinner, MyTextView myTextView, Spinner spinner2, d47 d47Var, MyTextView myTextView2, MyTextView myTextView3) {
        this.a = scrollView;
        this.b = appCompatButton;
        this.c = imageView;
        this.d = imageView2;
        this.e = spinner;
        this.f = myTextView;
        this.g = spinner2;
        this.h = d47Var;
        this.i = myTextView2;
        this.j = myTextView3;
    }

    public static s6 a(View view) {
        int i = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
        if (appCompatButton != null) {
            i = R.id.rightRTOPin;
            ImageView imageView = (ImageView) zp7.a(view, R.id.rightRTOPin);
            if (imageView != null) {
                i = R.id.rightStatePin;
                ImageView imageView2 = (ImageView) zp7.a(view, R.id.rightStatePin);
                if (imageView2 != null) {
                    i = R.id.rtoSpinner;
                    Spinner spinner = (Spinner) zp7.a(view, R.id.rtoSpinner);
                    if (spinner != null) {
                        i = R.id.state_name;
                        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.state_name);
                        if (myTextView != null) {
                            i = R.id.stateSpinner;
                            Spinner spinner2 = (Spinner) zp7.a(view, R.id.stateSpinner);
                            if (spinner2 != null) {
                                i = R.id.topHolder;
                                View viewA = zp7.a(view, R.id.topHolder);
                                if (viewA != null) {
                                    d47 d47VarA = d47.a(viewA);
                                    i = R.id.vahan_details_duplicate_rc;
                                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                                    if (myTextView2 != null) {
                                        i = R.id.vahan_reason;
                                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vahan_reason);
                                        if (myTextView3 != null) {
                                            return new s6((ScrollView) view, appCompatButton, imageView, imageView2, spinner, myTextView, spinner2, d47VarA, myTextView2, myTextView3);
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

    public static s6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static s6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_available_fancy_number_status, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
