package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mc {
    public final ConstraintLayout a;
    public final MyTextView b;
    public final TextView c;
    public final MyTextView d;
    public final TextView e;
    public final MyTextView f;
    public final MyTextView g;
    public final TextView h;
    public final AppCompatTextView i;
    public final TextView j;
    public final TextView k;
    public final ri5 l;
    public final MyTextView m;
    public final AppCompatTextView n;
    public final TextView o;
    public final MyTextView p;
    public final MyTextView q;
    public final TextView r;

    public mc(ConstraintLayout constraintLayout, MyTextView myTextView, TextView textView, MyTextView myTextView2, TextView textView2, MyTextView myTextView3, MyTextView myTextView4, TextView textView3, AppCompatTextView appCompatTextView, TextView textView4, TextView textView5, ri5 ri5Var, MyTextView myTextView5, AppCompatTextView appCompatTextView2, TextView textView6, MyTextView myTextView6, MyTextView myTextView7, TextView textView7) {
        this.a = constraintLayout;
        this.b = myTextView;
        this.c = textView;
        this.d = myTextView2;
        this.e = textView2;
        this.f = myTextView3;
        this.g = myTextView4;
        this.h = textView3;
        this.i = appCompatTextView;
        this.j = textView4;
        this.k = textView5;
        this.l = ri5Var;
        this.m = myTextView5;
        this.n = appCompatTextView2;
        this.o = textView6;
        this.p = myTextView6;
        this.q = myTextView7;
        this.r = textView7;
    }

    public static mc a(View view) {
        int i = R.id.ageTv;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.ageTv);
        if (myTextView != null) {
            i = R.id.ageValue;
            TextView textView = (TextView) zp7.a(view, R.id.ageValue);
            if (textView != null) {
                i = R.id.app_dob;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.app_dob);
                if (myTextView2 != null) {
                    i = R.id.app_dob_val;
                    TextView textView2 = (TextView) zp7.a(view, R.id.app_dob_val);
                    if (textView2 != null) {
                        i = R.id.app_father_name;
                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.app_father_name);
                        if (myTextView3 != null) {
                            i = R.id.app_gender;
                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.app_gender);
                            if (myTextView4 != null) {
                                i = R.id.app_gender_val;
                                TextView textView3 = (TextView) zp7.a(view, R.id.app_gender_val);
                                if (textView3 != null) {
                                    i = R.id.cancelTv;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.cancelTv);
                                    if (appCompatTextView != null) {
                                        i = R.id.f_first_name;
                                        TextView textView4 = (TextView) zp7.a(view, R.id.f_first_name);
                                        if (textView4 != null) {
                                            i = R.id.first_name;
                                            TextView textView5 = (TextView) zp7.a(view, R.id.first_name);
                                            if (textView5 != null) {
                                                i = R.id.include3;
                                                View viewA = zp7.a(view, R.id.include3);
                                                if (viewA != null) {
                                                    ri5 ri5VarA = ri5.a(viewA);
                                                    i = R.id.myApplicationNo;
                                                    MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.myApplicationNo);
                                                    if (myTextView5 != null) {
                                                        i = R.id.proceedTv;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.proceedTv);
                                                        if (appCompatTextView2 != null) {
                                                            i = R.id.slotDataValue;
                                                            TextView textView6 = (TextView) zp7.a(view, R.id.slotDataValue);
                                                            if (textView6 != null) {
                                                                i = R.id.slotDateTv;
                                                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.slotDateTv);
                                                                if (myTextView6 != null) {
                                                                    i = R.id.slotTimeTv;
                                                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.slotTimeTv);
                                                                    if (myTextView7 != null) {
                                                                        i = R.id.slotTimeValue;
                                                                        TextView textView7 = (TextView) zp7.a(view, R.id.slotTimeValue);
                                                                        if (textView7 != null) {
                                                                            return new mc((ConstraintLayout) view, myTextView, textView, myTextView2, textView2, myTextView3, myTextView4, textView3, appCompatTextView, textView4, textView5, ri5VarA, myTextView5, appCompatTextView2, textView6, myTextView6, myTextView7, textView7);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static mc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static mc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ll_app_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
