package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c55 {
    public final ScrollView a;
    public final MyTextView b;
    public final AppCompatButton c;
    public final TextView d;
    public final LinearLayout e;
    public final EditText f;
    public final d47 g;
    public final MyTextView h;
    public final MyTextView i;
    public final TextView j;
    public final TextView k;

    public c55(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, TextView textView, LinearLayout linearLayout, EditText editText, d47 d47Var, MyTextView myTextView2, MyTextView myTextView3, TextView textView2, TextView textView3) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = appCompatButton;
        this.d = textView;
        this.e = linearLayout;
        this.f = editText;
        this.g = d47Var;
        this.h = myTextView2;
        this.i = myTextView3;
        this.j = textView2;
        this.k = textView3;
    }

    public static c55 a(View view) {
        int i = R.id.appForRcCancellayion;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.appForRcCancellayion);
        if (myTextView != null) {
            i = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
            if (appCompatButton != null) {
                i = R.id.firDateTv;
                TextView textView = (TextView) zp7.a(view, R.id.firDateTv);
                if (textView != null) {
                    i = R.id.police_fir_layout;
                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.police_fir_layout);
                    if (linearLayout != null) {
                        i = R.id.remarkTv;
                        EditText editText = (EditText) zp7.a(view, R.id.remarkTv);
                        if (editText != null) {
                            i = R.id.topHolder;
                            View viewA = zp7.a(view, R.id.topHolder);
                            if (viewA != null) {
                                d47 d47VarA = d47.a(viewA);
                                i = R.id.vahan_fir_date;
                                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.vahan_fir_date);
                                if (myTextView2 != null) {
                                    i = R.id.vahan_remark;
                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vahan_remark);
                                    if (myTextView3 != null) {
                                        i = R.id.vehicleNumberTv;
                                        TextView textView2 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                        if (textView2 != null) {
                                            i = R.id.vehicle_view;
                                            TextView textView3 = (TextView) zp7.a(view, R.id.vehicle_view);
                                            if (textView3 != null) {
                                                return new c55((ScrollView) view, myTextView, appCompatButton, textView, linearLayout, editText, d47VarA, myTextView2, myTextView3, textView2, textView3);
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

    public static c55 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static c55 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.rccanceltion, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
