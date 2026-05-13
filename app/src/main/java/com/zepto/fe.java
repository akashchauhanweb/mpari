package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fe {
    public final ImageView A;
    public final zh7 B;
    public final TextView C;
    public final d47 D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final TextView H;
    public final TextView I;
    public final ScrollView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final RadioButton d;
    public final RadioButton e;
    public final TextView f;
    public final AppCompatTextView g;
    public final AppCompatTextView h;
    public final LinearLayout i;
    public final TextView j;
    public final AppCompatTextView k;
    public final AppCompatTextView l;
    public final TextView m;
    public final AppCompatTextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final LinearLayout r;
    public final EditText s;
    public final LinearLayout t;
    public final TextView u;
    public final AppCompatTextView v;
    public final TextView w;
    public final RadioGroup x;
    public final v23 y;
    public final Spinner z;

    public fe(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RadioButton radioButton, RadioButton radioButton2, TextView textView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, LinearLayout linearLayout, TextView textView2, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, TextView textView3, AppCompatTextView appCompatTextView7, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout2, EditText editText, LinearLayout linearLayout3, TextView textView7, AppCompatTextView appCompatTextView8, TextView textView8, RadioGroup radioGroup, v23 v23Var, Spinner spinner, ImageView imageView, zh7 zh7Var, TextView textView9, d47 d47Var, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, TextView textView10, TextView textView11) {
        this.a = scrollView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = radioButton;
        this.e = radioButton2;
        this.f = textView;
        this.g = appCompatTextView3;
        this.h = appCompatTextView4;
        this.i = linearLayout;
        this.j = textView2;
        this.k = appCompatTextView5;
        this.l = appCompatTextView6;
        this.m = textView3;
        this.n = appCompatTextView7;
        this.o = textView4;
        this.p = textView5;
        this.q = textView6;
        this.r = linearLayout2;
        this.s = editText;
        this.t = linearLayout3;
        this.u = textView7;
        this.v = appCompatTextView8;
        this.w = textView8;
        this.x = radioGroup;
        this.y = v23Var;
        this.z = spinner;
        this.A = imageView;
        this.B = zh7Var;
        this.C = textView9;
        this.D = d47Var;
        this.E = appCompatTextView9;
        this.F = appCompatTextView10;
        this.G = appCompatTextView11;
        this.H = textView10;
        this.I = textView11;
    }

    public static fe a(View view) {
        int i = R.id.add_insurance_Detail;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.add_insurance_Detail);
        if (appCompatTextView != null) {
            i = R.id.add_nominee_Detail;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.add_nominee_Detail);
            if (appCompatTextView2 != null) {
                i = R.id.add_nominee_no;
                RadioButton radioButton = (RadioButton) zp7.a(view, R.id.add_nominee_no);
                if (radioButton != null) {
                    i = R.id.add_nominee_yes;
                    RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.add_nominee_yes);
                    if (radioButton2 != null) {
                        i = R.id.declared_insurance;
                        TextView textView = (TextView) zp7.a(view, R.id.declared_insurance);
                        if (textView != null) {
                            i = R.id.declared_insurance_txt;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.declared_insurance_txt);
                            if (appCompatTextView3 != null) {
                                i = R.id.insurance_company_txt;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.insurance_company_txt);
                                if (appCompatTextView4 != null) {
                                    i = R.id.insurance_detail;
                                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.insurance_detail);
                                    if (linearLayout != null) {
                                        i = R.id.insurance_from;
                                        TextView textView2 = (TextView) zp7.a(view, R.id.insurance_from);
                                        if (textView2 != null) {
                                            i = R.id.insurance_from_txt;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.insurance_from_txt);
                                            if (appCompatTextView5 != null) {
                                                i = R.id.insurance_type_txt;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.insurance_type_txt);
                                                if (appCompatTextView6 != null) {
                                                    i = R.id.insurance_upto;
                                                    TextView textView3 = (TextView) zp7.a(view, R.id.insurance_upto);
                                                    if (textView3 != null) {
                                                        i = R.id.insurance_upto_txt;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.insurance_upto_txt);
                                                        if (appCompatTextView7 != null) {
                                                            i = R.id.insuranceconpany;
                                                            TextView textView4 = (TextView) zp7.a(view, R.id.insuranceconpany);
                                                            if (textView4 != null) {
                                                                i = R.id.insurancetype;
                                                                TextView textView5 = (TextView) zp7.a(view, R.id.insurancetype);
                                                                if (textView5 != null) {
                                                                    i = R.id.nomineeDateOfBirth;
                                                                    TextView textView6 = (TextView) zp7.a(view, R.id.nomineeDateOfBirth);
                                                                    if (textView6 != null) {
                                                                        i = R.id.nominee_detail;
                                                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nominee_detail);
                                                                        if (linearLayout2 != null) {
                                                                            i = R.id.nomineeName;
                                                                            EditText editText = (EditText) zp7.a(view, R.id.nomineeName);
                                                                            if (editText != null) {
                                                                                i = R.id.nominneLinear;
                                                                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.nominneLinear);
                                                                                if (linearLayout3 != null) {
                                                                                    i = R.id.policy_number;
                                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.policy_number);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.policy_number_txt;
                                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.policy_number_txt);
                                                                                        if (appCompatTextView8 != null) {
                                                                                            i = R.id.previousPage;
                                                                                            TextView textView8 = (TextView) zp7.a(view, R.id.previousPage);
                                                                                            if (textView8 != null) {
                                                                                                i = R.id.radioGroup_id;
                                                                                                RadioGroup radioGroup = (RadioGroup) zp7.a(view, R.id.radioGroup_id);
                                                                                                if (radioGroup != null) {
                                                                                                    i = R.id.rc_ind;
                                                                                                    View viewA = zp7.a(view, R.id.rc_ind);
                                                                                                    if (viewA != null) {
                                                                                                        v23 v23VarA = v23.a(viewA);
                                                                                                        i = R.id.relationWithNominee;
                                                                                                        Spinner spinner = (Spinner) zp7.a(view, R.id.relationWithNominee);
                                                                                                        if (spinner != null) {
                                                                                                            i = R.id.rightLabelPin;
                                                                                                            ImageView imageView = (ImageView) zp7.a(view, R.id.rightLabelPin);
                                                                                                            if (imageView != null) {
                                                                                                                i = R.id.stepper_layout;
                                                                                                                View viewA2 = zp7.a(view, R.id.stepper_layout);
                                                                                                                if (viewA2 != null) {
                                                                                                                    zh7 zh7VarA = zh7.a(viewA2);
                                                                                                                    i = R.id.submitForm;
                                                                                                                    TextView textView9 = (TextView) zp7.a(view, R.id.submitForm);
                                                                                                                    if (textView9 != null) {
                                                                                                                        i = R.id.topHolder;
                                                                                                                        View viewA3 = zp7.a(view, R.id.topHolder);
                                                                                                                        if (viewA3 != null) {
                                                                                                                            d47 d47VarA = d47.a(viewA3);
                                                                                                                            i = R.id.vahan_financer_add;
                                                                                                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.vahan_financer_add);
                                                                                                                            if (appCompatTextView9 != null) {
                                                                                                                                i = R.id.vahan_financer_name;
                                                                                                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.vahan_financer_name);
                                                                                                                                if (appCompatTextView10 != null) {
                                                                                                                                    i = R.id.vahan_type;
                                                                                                                                    AppCompatTextView appCompatTextView11 = (AppCompatTextView) zp7.a(view, R.id.vahan_type);
                                                                                                                                    if (appCompatTextView11 != null) {
                                                                                                                                        i = R.id.vehicleNumberTv;
                                                                                                                                        TextView textView10 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            i = R.id.vehicle_view;
                                                                                                                                            TextView textView11 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                            if (textView11 != null) {
                                                                                                                                                return new fe((ScrollView) view, appCompatTextView, appCompatTextView2, radioButton, radioButton2, textView, appCompatTextView3, appCompatTextView4, linearLayout, textView2, appCompatTextView5, appCompatTextView6, textView3, appCompatTextView7, textView4, textView5, textView6, linearLayout2, editText, linearLayout3, textView7, appCompatTextView8, textView8, radioGroup, v23VarA, spinner, imageView, zh7VarA, textView9, d47VarA, appCompatTextView9, appCompatTextView10, appCompatTextView11, textView10, textView11);
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

    public static fe c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static fe d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_nominee_and_insurance_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
