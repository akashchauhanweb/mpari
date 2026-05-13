package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class k6 {
    public final ConstraintLayout a;
    public final TextView b;
    public final EditText c;
    public final AppCompatTextView d;
    public final ConstraintLayout e;
    public final ImageView f;
    public final ri5 g;
    public final MyTextView h;
    public final MyTextView i;
    public final MyTextView j;
    public final AppCompatTextView k;
    public final AppCompatTextView l;
    public final AppCompatTextView m;

    public k6(ConstraintLayout constraintLayout, TextView textView, EditText editText, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, ImageView imageView, ri5 ri5Var, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = editText;
        this.d = appCompatTextView;
        this.e = constraintLayout2;
        this.f = imageView;
        this.g = ri5Var;
        this.h = myTextView;
        this.i = myTextView2;
        this.j = myTextView3;
        this.k = appCompatTextView2;
        this.l = appCompatTextView3;
        this.m = appCompatTextView4;
    }

    public static k6 a(View view) {
        int i = R.id.applicant_date;
        TextView textView = (TextView) zp7.a(view, R.id.applicant_date);
        if (textView != null) {
            i = R.id.applicationNoEt;
            EditText editText = (EditText) zp7.a(view, R.id.applicationNoEt);
            if (editText != null) {
                i = R.id.cancelTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.cancelTv);
                if (appCompatTextView != null) {
                    i = R.id.datePikerCL;
                    ConstraintLayout constraintLayout = (ConstraintLayout) zp7.a(view, R.id.datePikerCL);
                    if (constraintLayout != null) {
                        i = R.id.dob_cal;
                        ImageView imageView = (ImageView) zp7.a(view, R.id.dob_cal);
                        if (imageView != null) {
                            i = R.id.include3;
                            View viewA = zp7.a(view, R.id.include3);
                            if (viewA != null) {
                                ri5 ri5VarA = ri5.a(viewA);
                                i = R.id.myApplicationNo;
                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.myApplicationNo);
                                if (myTextView != null) {
                                    i = R.id.myDateOfBirth;
                                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.myDateOfBirth);
                                    if (myTextView2 != null) {
                                        i = R.id.note_Info;
                                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.note_Info);
                                        if (myTextView3 != null) {
                                            i = R.id.noteTitleTv;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.noteTitleTv);
                                            if (appCompatTextView2 != null) {
                                                i = R.id.submitTv;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.submitTv);
                                                if (appCompatTextView3 != null) {
                                                    i = R.id.topTitleTv;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                                    if (appCompatTextView4 != null) {
                                                        return new k6((ConstraintLayout) view, textView, editText, appCompatTextView, constraintLayout, imageView, ri5VarA, myTextView, myTextView2, myTextView3, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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

    public static k6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static k6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_app_number_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
