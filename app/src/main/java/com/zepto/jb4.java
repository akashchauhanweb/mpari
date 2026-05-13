package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jb4 {
    public final RelativeLayout a;
    public final TextView b;
    public final AppCompatButton c;
    public final AppCompatButton d;
    public final TextView e;
    public final AppCompatTextView f;
    public final TextView g;
    public final Spinner h;
    public final AppCompatEditText i;
    public final ImageView j;
    public final d47 k;
    public final MyTextView l;

    public jb4(RelativeLayout relativeLayout, TextView textView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView2, AppCompatTextView appCompatTextView, TextView textView3, Spinner spinner, AppCompatEditText appCompatEditText, ImageView imageView, d47 d47Var, MyTextView myTextView) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = appCompatButton;
        this.d = appCompatButton2;
        this.e = textView2;
        this.f = appCompatTextView;
        this.g = textView3;
        this.h = spinner;
        this.i = appCompatEditText;
        this.j = imageView;
        this.k = d47Var;
        this.l = myTextView;
    }

    public static jb4 a(View view) {
        int i = R.id.chassis_no;
        TextView textView = (TextView) zp7.a(view, R.id.chassis_no);
        if (textView != null) {
            i = R.id.idCancel;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.idCancel);
            if (appCompatButton != null) {
                i = R.id.idSubmit;
                AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.idSubmit);
                if (appCompatButton2 != null) {
                    i = R.id.nomination_date;
                    TextView textView2 = (TextView) zp7.a(view, R.id.nomination_date);
                    if (textView2 != null) {
                        i = R.id.nominationdate_selection;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.nominationdate_selection);
                        if (appCompatTextView != null) {
                            i = R.id.nominee_name;
                            TextView textView3 = (TextView) zp7.a(view, R.id.nominee_name);
                            if (textView3 != null) {
                                i = R.id.periodmodespin;
                                Spinner spinner = (Spinner) zp7.a(view, R.id.periodmodespin);
                                if (spinner != null) {
                                    i = R.id.regNoEt;
                                    AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.regNoEt);
                                    if (appCompatEditText != null) {
                                        i = R.id.rightReasonPin;
                                        ImageView imageView = (ImageView) zp7.a(view, R.id.rightReasonPin);
                                        if (imageView != null) {
                                            i = R.id.topHolder;
                                            View viewA = zp7.a(view, R.id.topHolder);
                                            if (viewA != null) {
                                                d47 d47VarA = d47.a(viewA);
                                                i = R.id.update_mobile_no;
                                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.update_mobile_no);
                                                if (myTextView != null) {
                                                    return new jb4((RelativeLayout) view, textView, appCompatButton, appCompatButton2, textView2, appCompatTextView, textView3, spinner, appCompatEditText, imageView, d47VarA, myTextView);
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

    public static jb4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static jb4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.nominee_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
