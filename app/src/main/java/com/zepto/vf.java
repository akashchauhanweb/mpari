package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class vf {
    public final LinearLayout a;
    public final FrameLayout b;
    public final LinearLayout c;
    public final MyTextView d;
    public final TextView e;
    public final TextView f;
    public final MyTextView g;
    public final LinearLayout h;
    public final EditText i;
    public final EditText j;
    public final LinearLayout k;
    public final CustomWegetLayout l;
    public final vy3 m;
    public final iy3 n;
    public final RecyclerView o;
    public final RadioButton p;
    public final AppCompatEditText q;
    public final bs4 r;
    public final CustomWegetLayout s;
    public final Spinner t;
    public final MyTextView u;
    public final MyTextView v;
    public final AppCompatTextView w;
    public final MyTextView x;
    public final TextView y;
    public final RadioButton z;

    public vf(LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, MyTextView myTextView, TextView textView, TextView textView2, MyTextView myTextView2, LinearLayout linearLayout3, EditText editText, EditText editText2, LinearLayout linearLayout4, CustomWegetLayout customWegetLayout, vy3 vy3Var, iy3 iy3Var, RecyclerView recyclerView, RadioButton radioButton, AppCompatEditText appCompatEditText, bs4 bs4Var, CustomWegetLayout customWegetLayout2, Spinner spinner, MyTextView myTextView3, MyTextView myTextView4, AppCompatTextView appCompatTextView, MyTextView myTextView5, TextView textView3, RadioButton radioButton2) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = linearLayout2;
        this.d = myTextView;
        this.e = textView;
        this.f = textView2;
        this.g = myTextView2;
        this.h = linearLayout3;
        this.i = editText;
        this.j = editText2;
        this.k = linearLayout4;
        this.l = customWegetLayout;
        this.m = vy3Var;
        this.n = iy3Var;
        this.o = recyclerView;
        this.p = radioButton;
        this.q = appCompatEditText;
        this.r = bs4Var;
        this.s = customWegetLayout2;
        this.t = spinner;
        this.u = myTextView3;
        this.v = myTextView4;
        this.w = appCompatTextView;
        this.x = myTextView5;
        this.y = textView3;
        this.z = radioButton2;
    }

    public static vf a(View view) {
        int i = R.id.app_cat_layout;
        FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.app_cat_layout);
        if (frameLayout != null) {
            i = R.id.bottomHolder;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.bottomHolder);
            if (linearLayout != null) {
                i = R.id.changeDobDlTv;
                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.changeDobDlTv);
                if (myTextView != null) {
                    i = R.id.dl_dob;
                    TextView textView = (TextView) zp7.a(view, R.id.dl_dob);
                    if (textView != null) {
                        i = R.id.dl_no_txt;
                        TextView textView2 = (TextView) zp7.a(view, R.id.dl_no_txt);
                        if (textView2 != null) {
                            i = R.id.dobTv;
                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.dobTv);
                            if (myTextView2 != null) {
                                i = R.id.donate_layout;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.donate_layout);
                                if (linearLayout2 != null) {
                                    i = R.id.dupdl_optional;
                                    EditText editText = (EditText) zp7.a(view, R.id.dupdl_optional);
                                    if (editText != null) {
                                        i = R.id.id_change_dob_reason;
                                        EditText editText2 = (EditText) zp7.a(view, R.id.id_change_dob_reason);
                                        if (editText2 != null) {
                                            i = R.id.id_dupdl;
                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.id_dupdl);
                                            if (linearLayout3 != null) {
                                                i = R.id.id_next_service;
                                                CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.id_next_service);
                                                if (customWegetLayout != null) {
                                                    i = R.id.mHeader;
                                                    View viewA = zp7.a(view, R.id.mHeader);
                                                    if (viewA != null) {
                                                        vy3 vy3VarA = vy3.a(viewA);
                                                        i = R.id.multi_head;
                                                        View viewA2 = zp7.a(view, R.id.multi_head);
                                                        if (viewA2 != null) {
                                                            iy3 iy3VarA = iy3.a(viewA2);
                                                            i = R.id.multi_steps;
                                                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.multi_steps);
                                                            if (recyclerView != null) {
                                                                i = R.id.not_willing_to_donate;
                                                                RadioButton radioButton = (RadioButton) zp7.a(view, R.id.not_willing_to_donate);
                                                                if (radioButton != null) {
                                                                    i = R.id.org_mob_number;
                                                                    AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.org_mob_number);
                                                                    if (appCompatEditText != null) {
                                                                        i = R.id.psl;
                                                                        View viewA3 = zp7.a(view, R.id.psl);
                                                                        if (viewA3 != null) {
                                                                            bs4 bs4VarA = bs4.a(viewA3);
                                                                            i = R.id.reset;
                                                                            CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) zp7.a(view, R.id.reset);
                                                                            if (customWegetLayout2 != null) {
                                                                                i = R.id.spn_app_cat;
                                                                                Spinner spinner = (Spinner) zp7.a(view, R.id.spn_app_cat);
                                                                                if (spinner != null) {
                                                                                    i = R.id.tv_note_organ_donate;
                                                                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.tv_note_organ_donate);
                                                                                    if (myTextView3 != null) {
                                                                                        i = R.id.tv_reason;
                                                                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.tv_reason);
                                                                                        if (myTextView4 != null) {
                                                                                            i = R.id.tv_reason_manually;
                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.tv_reason_manually);
                                                                                            if (appCompatTextView != null) {
                                                                                                i = R.id.txtAppCategory;
                                                                                                MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.txtAppCategory);
                                                                                                if (myTextView5 != null) {
                                                                                                    i = R.id.txt_view_details;
                                                                                                    TextView textView3 = (TextView) zp7.a(view, R.id.txt_view_details);
                                                                                                    if (textView3 != null) {
                                                                                                        i = R.id.willing_to_donate;
                                                                                                        RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.willing_to_donate);
                                                                                                        if (radioButton2 != null) {
                                                                                                            return new vf((LinearLayout) view, frameLayout, linearLayout, myTextView, textView, textView2, myTextView2, linearLayout2, editText, editText2, linearLayout3, customWegetLayout, vy3VarA, iy3VarA, recyclerView, radioButton, appCompatEditText, bs4VarA, customWegetLayout2, spinner, myTextView3, myTextView4, appCompatTextView, myTextView5, textView3, radioButton2);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static vf c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static vf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sarthi_dob_change, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
