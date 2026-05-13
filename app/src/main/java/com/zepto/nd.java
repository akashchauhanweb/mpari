package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nd {
    public final ScrollView a;
    public final AppCompatButton b;
    public final EditText c;
    public final MyTextView d;
    public final EditText e;
    public final MyTextView f;
    public final TextView g;
    public final TextView h;
    public final d47 i;
    public final TextView j;
    public final MyTextView k;
    public final TextView l;
    public final TextView m;

    public nd(ScrollView scrollView, AppCompatButton appCompatButton, EditText editText, MyTextView myTextView, EditText editText2, MyTextView myTextView2, TextView textView, TextView textView2, d47 d47Var, TextView textView3, MyTextView myTextView3, TextView textView4, TextView textView5) {
        this.a = scrollView;
        this.b = appCompatButton;
        this.c = editText;
        this.d = myTextView;
        this.e = editText2;
        this.f = myTextView2;
        this.g = textView;
        this.h = textView2;
        this.i = d47Var;
        this.j = textView3;
        this.k = myTextView3;
        this.l = textView4;
        this.m = textView5;
    }

    public static nd a(View view) {
        int i = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
        if (appCompatButton != null) {
            i = R.id.fee_amount;
            EditText editText = (EditText) zp7.a(view, R.id.fee_amount);
            if (editText != null) {
                i = R.id.fee_amount_txt;
                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.fee_amount_txt);
                if (myTextView != null) {
                    i = R.id.fine_amount;
                    EditText editText2 = (EditText) zp7.a(view, R.id.fine_amount);
                    if (editText2 != null) {
                        i = R.id.fine_amount_txt;
                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.fine_amount_txt);
                        if (myTextView2 != null) {
                            i = R.id.missfeetobepaid;
                            TextView textView = (TextView) zp7.a(view, R.id.missfeetobepaid);
                            if (textView != null) {
                                i = R.id.notes;
                                TextView textView2 = (TextView) zp7.a(view, R.id.notes);
                                if (textView2 != null) {
                                    i = R.id.topHolder;
                                    View viewA = zp7.a(view, R.id.topHolder);
                                    if (viewA != null) {
                                        d47 d47VarA = d47.a(viewA);
                                        i = R.id.total_amount;
                                        TextView textView3 = (TextView) zp7.a(view, R.id.total_amount);
                                        if (textView3 != null) {
                                            i = R.id.total_amount_txt;
                                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.total_amount_txt);
                                            if (myTextView3 != null) {
                                                i = R.id.vehicleNumberTv;
                                                TextView textView4 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                if (textView4 != null) {
                                                    i = R.id.vehicle_view;
                                                    TextView textView5 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                    if (textView5 != null) {
                                                        return new nd((ScrollView) view, appCompatButton, editText, myTextView, editText2, myTextView2, textView, textView2, d47VarA, textView3, myTextView3, textView4, textView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static nd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static nd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_miscellaneous_fee_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
