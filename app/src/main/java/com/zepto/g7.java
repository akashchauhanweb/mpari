package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class g7 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final EditText D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout a;
    public final FrameLayout b;
    public final TextView c;
    public final EditText d;
    public final EditText e;
    public final EditText f;
    public final LinearLayout g;
    public final CustomWegetLayout h;
    public final EditText i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final vy3 l;
    public final EditText m;
    public final iy3 n;
    public final RecyclerView o;
    public final bs4 p;
    public final CustomWegetLayout q;
    public final EditText r;
    public final EditText s;
    public final EditText t;
    public final Spinner u;
    public final Spinner v;
    public final TextView w;
    public final MyTextView x;
    public final AppCompatTextView y;
    public final MyTextView z;

    public g7(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, EditText editText, EditText editText2, EditText editText3, LinearLayout linearLayout2, CustomWegetLayout customWegetLayout, EditText editText4, LinearLayout linearLayout3, LinearLayout linearLayout4, vy3 vy3Var, EditText editText5, iy3 iy3Var, RecyclerView recyclerView, bs4 bs4Var, CustomWegetLayout customWegetLayout2, EditText editText6, EditText editText7, EditText editText8, Spinner spinner, Spinner spinner2, TextView textView2, MyTextView myTextView, AppCompatTextView appCompatTextView, MyTextView myTextView2, TextView textView3, TextView textView4, TextView textView5, EditText editText9, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = textView;
        this.d = editText;
        this.e = editText2;
        this.f = editText3;
        this.g = linearLayout2;
        this.h = customWegetLayout;
        this.i = editText4;
        this.j = linearLayout3;
        this.k = linearLayout4;
        this.l = vy3Var;
        this.m = editText5;
        this.n = iy3Var;
        this.o = recyclerView;
        this.p = bs4Var;
        this.q = customWegetLayout2;
        this.r = editText6;
        this.s = editText7;
        this.t = editText8;
        this.u = spinner;
        this.v = spinner2;
        this.w = textView2;
        this.x = myTextView;
        this.y = appCompatTextView;
        this.z = myTextView2;
        this.A = textView3;
        this.B = textView4;
        this.C = textView5;
        this.D = editText9;
        this.E = textView6;
        this.F = textView7;
        this.G = textView8;
        this.H = textView9;
        this.I = textView10;
        this.J = textView11;
    }

    public static g7 a(View view) {
        int i = R.id.app_cat_layout;
        FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.app_cat_layout);
        if (frameLayout != null) {
            i = R.id.dl_no_txt;
            TextView textView = (TextView) zp7.a(view, R.id.dl_no_txt);
            if (textView != null) {
                i = R.id.dupdl_optional;
                EditText editText = (EditText) zp7.a(view, R.id.dupdl_optional);
                if (editText != null) {
                    i = R.id.fnameVal;
                    EditText editText2 = (EditText) zp7.a(view, R.id.fnameVal);
                    if (editText2 != null) {
                        i = R.id.id_change_dob_reason;
                        EditText editText3 = (EditText) zp7.a(view, R.id.id_change_dob_reason);
                        if (editText3 != null) {
                            i = R.id.id_dupdl;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.id_dupdl);
                            if (linearLayout != null) {
                                i = R.id.id_next_service;
                                CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.id_next_service);
                                if (customWegetLayout != null) {
                                    i = R.id.lNameVal;
                                    EditText editText4 = (EditText) zp7.a(view, R.id.lNameVal);
                                    if (editText4 != null) {
                                        i = R.id.ll_details;
                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.ll_details);
                                        if (linearLayout2 != null) {
                                            i = R.id.ll_relation;
                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.ll_relation);
                                            if (linearLayout3 != null) {
                                                i = R.id.mHeader;
                                                View viewA = zp7.a(view, R.id.mHeader);
                                                if (viewA != null) {
                                                    vy3 vy3VarA = vy3.a(viewA);
                                                    i = R.id.mNameVal;
                                                    EditText editText5 = (EditText) zp7.a(view, R.id.mNameVal);
                                                    if (editText5 != null) {
                                                        i = R.id.multi_head;
                                                        View viewA2 = zp7.a(view, R.id.multi_head);
                                                        if (viewA2 != null) {
                                                            iy3 iy3VarA = iy3.a(viewA2);
                                                            i = R.id.multi_steps;
                                                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.multi_steps);
                                                            if (recyclerView != null) {
                                                                i = R.id.psl;
                                                                View viewA3 = zp7.a(view, R.id.psl);
                                                                if (viewA3 != null) {
                                                                    bs4 bs4VarA = bs4.a(viewA3);
                                                                    i = R.id.reset;
                                                                    CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) zp7.a(view, R.id.reset);
                                                                    if (customWegetLayout2 != null) {
                                                                        i = R.id.rfnameVal;
                                                                        EditText editText6 = (EditText) zp7.a(view, R.id.rfnameVal);
                                                                        if (editText6 != null) {
                                                                            i = R.id.rlNameVal;
                                                                            EditText editText7 = (EditText) zp7.a(view, R.id.rlNameVal);
                                                                            if (editText7 != null) {
                                                                                i = R.id.rmNameVal;
                                                                                EditText editText8 = (EditText) zp7.a(view, R.id.rmNameVal);
                                                                                if (editText8 != null) {
                                                                                    i = R.id.spn_app_cat;
                                                                                    Spinner spinner = (Spinner) zp7.a(view, R.id.spn_app_cat);
                                                                                    if (spinner != null) {
                                                                                        i = R.id.spn_rel_Status;
                                                                                        Spinner spinner2 = (Spinner) zp7.a(view, R.id.spn_rel_Status);
                                                                                        if (spinner2 != null) {
                                                                                            i = R.id.tv_lic_detail;
                                                                                            TextView textView2 = (TextView) zp7.a(view, R.id.tv_lic_detail);
                                                                                            if (textView2 != null) {
                                                                                                i = R.id.tv_reason;
                                                                                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.tv_reason);
                                                                                                if (myTextView != null) {
                                                                                                    i = R.id.tv_reason_manually;
                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.tv_reason_manually);
                                                                                                    if (appCompatTextView != null) {
                                                                                                        i = R.id.txtAppCategory;
                                                                                                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.txtAppCategory);
                                                                                                        if (myTextView2 != null) {
                                                                                                            i = R.id.txt_ffname;
                                                                                                            TextView textView3 = (TextView) zp7.a(view, R.id.txt_ffname);
                                                                                                            if (textView3 != null) {
                                                                                                                i = R.id.txt_fname;
                                                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.txt_fname);
                                                                                                                if (textView4 != null) {
                                                                                                                    i = R.id.txt_full_name;
                                                                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.txt_full_name);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i = R.id.txt_full_name_val;
                                                                                                                        EditText editText9 = (EditText) zp7.a(view, R.id.txt_full_name_val);
                                                                                                                        if (editText9 != null) {
                                                                                                                            i = R.id.txt_last_name;
                                                                                                                            TextView textView6 = (TextView) zp7.a(view, R.id.txt_last_name);
                                                                                                                            if (textView6 != null) {
                                                                                                                                i = R.id.txt_lname;
                                                                                                                                TextView textView7 = (TextView) zp7.a(view, R.id.txt_lname);
                                                                                                                                if (textView7 != null) {
                                                                                                                                    i = R.id.txt_md_name;
                                                                                                                                    TextView textView8 = (TextView) zp7.a(view, R.id.txt_md_name);
                                                                                                                                    if (textView8 != null) {
                                                                                                                                        i = R.id.txt_mname;
                                                                                                                                        TextView textView9 = (TextView) zp7.a(view, R.id.txt_mname);
                                                                                                                                        if (textView9 != null) {
                                                                                                                                            i = R.id.txt_relation;
                                                                                                                                            TextView textView10 = (TextView) zp7.a(view, R.id.txt_relation);
                                                                                                                                            if (textView10 != null) {
                                                                                                                                                i = R.id.txt_view_details;
                                                                                                                                                TextView textView11 = (TextView) zp7.a(view, R.id.txt_view_details);
                                                                                                                                                if (textView11 != null) {
                                                                                                                                                    return new g7((LinearLayout) view, frameLayout, textView, editText, editText2, editText3, linearLayout, customWegetLayout, editText4, linearLayout2, linearLayout3, vy3VarA, editText5, iy3VarA, recyclerView, bs4VarA, customWegetLayout2, editText6, editText7, editText8, spinner, spinner2, textView2, myTextView, appCompatTextView, myTextView2, textView3, textView4, textView5, editText9, textView6, textView7, textView8, textView9, textView10, textView11);
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

    public static g7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static g7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_change_of_name, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
