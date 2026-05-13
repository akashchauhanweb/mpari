package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zv5 {
    public final RelativeLayout a;
    public final MyTextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final MyTextView e;
    public final AppCompatButton f;
    public final MyTextView g;
    public final MyTextView h;
    public final MyTextView i;
    public final MyTextView j;
    public final ri5 k;
    public final RecyclerView l;
    public final AppCompatButton m;

    public zv5(RelativeLayout relativeLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, AppCompatButton appCompatButton, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, ri5 ri5Var, RecyclerView recyclerView, AppCompatButton appCompatButton2) {
        this.a = relativeLayout;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = myTextView3;
        this.e = myTextView4;
        this.f = appCompatButton;
        this.g = myTextView5;
        this.h = myTextView6;
        this.i = myTextView7;
        this.j = myTextView8;
        this.k = ri5Var;
        this.l = recyclerView;
        this.m = appCompatButton2;
    }

    public static zv5 a(View view) {
        int i = R.id.applDate;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.applDate);
        if (myTextView != null) {
            i = R.id.applDateValue;
            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.applDateValue);
            if (myTextView2 != null) {
                i = R.id.applNo;
                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.applNo);
                if (myTextView3 != null) {
                    i = R.id.applNoValue;
                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.applNoValue);
                    if (myTextView4 != null) {
                        i = R.id.cancelBtn;
                        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.cancelBtn);
                        if (appCompatButton != null) {
                            i = R.id.dob;
                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.dob);
                            if (myTextView5 != null) {
                                i = R.id.dobValue;
                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.dobValue);
                                if (myTextView6 != null) {
                                    i = R.id.fullName;
                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.fullName);
                                    if (myTextView7 != null) {
                                        i = R.id.fullNameValue;
                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.fullNameValue);
                                        if (myTextView8 != null) {
                                            i = R.id.mHeader;
                                            View viewA = zp7.a(view, R.id.mHeader);
                                            if (viewA != null) {
                                                ri5 ri5VarA = ri5.a(viewA);
                                                i = R.id.selectedWithdrawnRv;
                                                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.selectedWithdrawnRv);
                                                if (recyclerView != null) {
                                                    i = R.id.submitBtn;
                                                    AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.submitBtn);
                                                    if (appCompatButton2 != null) {
                                                        return new zv5((RelativeLayout) view, myTextView, myTextView2, myTextView3, myTextView4, appCompatButton, myTextView5, myTextView6, myTextView7, myTextView8, ri5VarA, recyclerView, appCompatButton2);
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

    public static zv5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static zv5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.selected_withdrawn_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
