package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eh {
    public final RelativeLayout a;
    public final AppCompatEditText b;
    public final TextView c;
    public final MyTextView d;
    public final AppCompatButton e;
    public final AppCompatEditText f;
    public final AppCompatEditText g;
    public final TextView h;
    public final TextView i;
    public final MyTextView j;
    public final TextView k;
    public final TextView l;
    public final AppCompatEditText m;
    public final ImageView n;
    public final LinearLayout o;
    public final CheckBox p;
    public final d47 q;
    public final MyTextView r;
    public final AppCompatButton s;
    public final MyTextView t;

    public eh(RelativeLayout relativeLayout, AppCompatEditText appCompatEditText, TextView textView, MyTextView myTextView, AppCompatButton appCompatButton, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, TextView textView2, TextView textView3, MyTextView myTextView2, TextView textView4, TextView textView5, AppCompatEditText appCompatEditText4, ImageView imageView, LinearLayout linearLayout, CheckBox checkBox, d47 d47Var, MyTextView myTextView3, AppCompatButton appCompatButton2, MyTextView myTextView4) {
        this.a = relativeLayout;
        this.b = appCompatEditText;
        this.c = textView;
        this.d = myTextView;
        this.e = appCompatButton;
        this.f = appCompatEditText2;
        this.g = appCompatEditText3;
        this.h = textView2;
        this.i = textView3;
        this.j = myTextView2;
        this.k = textView4;
        this.l = textView5;
        this.m = appCompatEditText4;
        this.n = imageView;
        this.o = linearLayout;
        this.p = checkBox;
        this.q = d47Var;
        this.r = myTextView3;
        this.s = appCompatButton2;
        this.t = myTextView4;
    }

    public static eh a(View view) {
        int i = R.id.aadharNoEt;
        AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.aadharNoEt);
        if (appCompatEditText != null) {
            i = R.id.aadharTv;
            TextView textView = (TextView) zp7.a(view, R.id.aadharTv);
            if (textView != null) {
                i = R.id.agreeTermCond;
                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.agreeTermCond);
                if (myTextView != null) {
                    i = R.id.cancelBtn;
                    AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.cancelBtn);
                    if (appCompatButton != null) {
                        i = R.id.mobileNoEt;
                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) zp7.a(view, R.id.mobileNoEt);
                        if (appCompatEditText2 != null) {
                            i = R.id.newMobileNoEt;
                            AppCompatEditText appCompatEditText3 = (AppCompatEditText) zp7.a(view, R.id.newMobileNoEt);
                            if (appCompatEditText3 != null) {
                                i = R.id.newMobileNoTv;
                                TextView textView2 = (TextView) zp7.a(view, R.id.newMobileNoTv);
                                if (textView2 != null) {
                                    i = R.id.note1Tv;
                                    TextView textView3 = (TextView) zp7.a(view, R.id.note1Tv);
                                    if (textView3 != null) {
                                        i = R.id.noteTv;
                                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.noteTv);
                                        if (myTextView2 != null) {
                                            i = R.id.registerNameTv;
                                            TextView textView4 = (TextView) zp7.a(view, R.id.registerNameTv);
                                            if (textView4 != null) {
                                                i = R.id.registeredMobileNoTv;
                                                TextView textView5 = (TextView) zp7.a(view, R.id.registeredMobileNoTv);
                                                if (textView5 != null) {
                                                    i = R.id.registeredNameEt;
                                                    AppCompatEditText appCompatEditText4 = (AppCompatEditText) zp7.a(view, R.id.registeredNameEt);
                                                    if (appCompatEditText4 != null) {
                                                        i = R.id.showHideAadhar;
                                                        ImageView imageView = (ImageView) zp7.a(view, R.id.showHideAadhar);
                                                        if (imageView != null) {
                                                            i = R.id.termCndLl;
                                                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.termCndLl);
                                                            if (linearLayout != null) {
                                                                i = R.id.term_condition;
                                                                CheckBox checkBox = (CheckBox) zp7.a(view, R.id.term_condition);
                                                                if (checkBox != null) {
                                                                    i = R.id.topHolder;
                                                                    View viewA = zp7.a(view, R.id.topHolder);
                                                                    if (viewA != null) {
                                                                        d47 d47VarA = d47.a(viewA);
                                                                        i = R.id.update_mobile_no;
                                                                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.update_mobile_no);
                                                                        if (myTextView3 != null) {
                                                                            i = R.id.updateMobileNoBtn;
                                                                            AppCompatButton appCompatButton2 = (AppCompatButton) zp7.a(view, R.id.updateMobileNoBtn);
                                                                            if (appCompatButton2 != null) {
                                                                                i = R.id.vehicleNoTv;
                                                                                MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vehicleNoTv);
                                                                                if (myTextView4 != null) {
                                                                                    return new eh((RelativeLayout) view, appCompatEditText, textView, myTextView, appCompatButton, appCompatEditText2, appCompatEditText3, textView2, textView3, myTextView2, textView4, textView5, appCompatEditText4, imageView, linearLayout, checkBox, d47VarA, myTextView3, appCompatButton2, myTextView4);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static eh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static eh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_confirm_update_mobile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
