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
public final class gb {
    public final ScrollView a;
    public final MyTextView b;
    public final d47 c;
    public final MyTextView d;
    public final AppCompatButton e;
    public final MyTextView f;
    public final AppCompatButton g;
    public final MyTextView h;
    public final MyTextView i;
    public final AppCompatEditText j;
    public final AppCompatEditText k;
    public final AppCompatEditText l;

    public gb(ScrollView scrollView, MyTextView myTextView, d47 d47Var, MyTextView myTextView2, AppCompatButton appCompatButton, MyTextView myTextView3, AppCompatButton appCompatButton2, MyTextView myTextView4, MyTextView myTextView5, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = d47Var;
        this.d = myTextView2;
        this.e = appCompatButton;
        this.f = myTextView3;
        this.g = appCompatButton2;
        this.h = myTextView4;
        this.i = myTextView5;
        this.j = appCompatEditText;
        this.k = appCompatEditText2;
        this.l = appCompatEditText3;
    }

    public static gb a(View view) {
        int i = R.id.application_no;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.application_no);
        if (myTextView != null) {
            i = R.id.applicationStatusHeader;
            View viewA = zp7.a(view, R.id.applicationStatusHeader);
            if (viewA != null) {
                d47 d47VarA = d47.a(viewA);
                i = R.id.chassisTv;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.chassisTv);
                if (myTextView2 != null) {
                    i = R.id.idCancel;
                    AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.idCancel);
                    if (appCompatButton != null) {
                        i = R.id.idLayoutTitle;
                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.idLayoutTitle);
                        if (myTextView3 != null) {
                            i = R.id.idSubmit;
                            AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.idSubmit);
                            if (appCompatButton2 != null) {
                                i = R.id.registration_no;
                                MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.registration_no);
                                if (myTextView4 != null) {
                                    i = R.id.time_text;
                                    MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.time_text);
                                    if (myTextView5 != null) {
                                        i = R.id.txt_application_no;
                                        AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.txt_application_no);
                                        if (appCompatEditText != null) {
                                            i = R.id.txt_chassis_no;
                                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) zp7.a(view, R.id.txt_chassis_no);
                                            if (appCompatEditText2 != null) {
                                                i = R.id.txt_reg_no;
                                                AppCompatEditText appCompatEditText3 = (AppCompatEditText) zp7.a(view, R.id.txt_reg_no);
                                                if (appCompatEditText3 != null) {
                                                    return new gb((ScrollView) view, myTextView, d47VarA, myTextView2, appCompatButton, myTextView3, appCompatButton2, myTextView4, myTextView5, appCompatEditText, appCompatEditText2, appCompatEditText3);
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

    public static gb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static gb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_download_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
