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
public final class i6 {
    public final ScrollView a;
    public final MyTextView b;
    public final d47 c;
    public final AppCompatButton d;
    public final MyTextView e;
    public final AppCompatButton f;
    public final MyTextView g;
    public final AppCompatEditText h;

    public i6(ScrollView scrollView, MyTextView myTextView, d47 d47Var, AppCompatButton appCompatButton, MyTextView myTextView2, AppCompatButton appCompatButton2, MyTextView myTextView3, AppCompatEditText appCompatEditText) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = d47Var;
        this.d = appCompatButton;
        this.e = myTextView2;
        this.f = appCompatButton2;
        this.g = myTextView3;
        this.h = appCompatEditText;
    }

    public static i6 a(View view) {
        int i = R.id.application_no;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.application_no);
        if (myTextView != null) {
            i = R.id.applicationStatusHeader;
            View viewA = zp7.a(view, R.id.applicationStatusHeader);
            if (viewA != null) {
                d47 d47VarA = d47.a(viewA);
                i = R.id.idCancel;
                AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.idCancel);
                if (appCompatButton != null) {
                    i = R.id.idLayoutTitle;
                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.idLayoutTitle);
                    if (myTextView2 != null) {
                        i = R.id.idSubmit;
                        AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.idSubmit);
                        if (appCompatButton2 != null) {
                            i = R.id.time_text;
                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.time_text);
                            if (myTextView3 != null) {
                                i = R.id.txt_rcptnumber;
                                AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.txt_rcptnumber);
                                if (appCompatEditText != null) {
                                    return new i6((ScrollView) view, myTextView, d47VarA, appCompatButton, myTextView2, appCompatButton2, myTextView3, appCompatEditText);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static i6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static i6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_allotment_letter, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
