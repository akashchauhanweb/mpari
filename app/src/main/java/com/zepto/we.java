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
public final class we {
    public final ScrollView a;
    public final MyTextView b;
    public final AppCompatButton c;
    public final EditText d;
    public final EditText e;
    public final TextView f;
    public final MyTextView g;
    public final LinearLayout h;
    public final MyTextView i;
    public final d47 j;
    public final MyTextView k;
    public final TextView l;
    public final TextView m;

    public we(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, EditText editText, EditText editText2, TextView textView, MyTextView myTextView2, LinearLayout linearLayout, MyTextView myTextView3, d47 d47Var, MyTextView myTextView4, TextView textView2, TextView textView3) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = appCompatButton;
        this.d = editText;
        this.e = editText2;
        this.f = textView;
        this.g = myTextView2;
        this.h = linearLayout;
        this.i = myTextView3;
        this.j = d47Var;
        this.k = myTextView4;
        this.l = textView2;
        this.m = textView3;
    }

    public static we a(View view) {
        int i = R.id.approved_by;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.approved_by);
        if (myTextView != null) {
            i = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
            if (appCompatButton != null) {
                i = R.id.enter_approved_by;
                EditText editText = (EditText) zp7.a(view, R.id.enter_approved_by);
                if (editText != null) {
                    i = R.id.enter_file_reference_no;
                    EditText editText2 = (EditText) zp7.a(view, R.id.enter_file_reference_no);
                    if (editText2 != null) {
                        i = R.id.enter_release_date;
                        TextView textView = (TextView) zp7.a(view, R.id.enter_release_date);
                        if (textView != null) {
                            i = R.id.file_refernce_no;
                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.file_refernce_no);
                            if (myTextView2 != null) {
                                i = R.id.rc_relesae_layout;
                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.rc_relesae_layout);
                                if (linearLayout != null) {
                                    i = R.id.release_date;
                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.release_date);
                                    if (myTextView3 != null) {
                                        i = R.id.topHolder;
                                        View viewA = zp7.a(view, R.id.topHolder);
                                        if (viewA != null) {
                                            d47 d47VarA = d47.a(viewA);
                                            i = R.id.vahan_details_duplicate_rc;
                                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                                            if (myTextView4 != null) {
                                                i = R.id.vehicleNumberTv;
                                                TextView textView2 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                if (textView2 != null) {
                                                    i = R.id.vehicle_view;
                                                    TextView textView3 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                    if (textView3 != null) {
                                                        return new we((ScrollView) view, myTextView, appCompatButton, editText, editText2, textView, myTextView2, linearLayout, myTextView3, d47VarA, myTextView4, textView2, textView3);
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

    public static we c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static we d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_rcrelease, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
