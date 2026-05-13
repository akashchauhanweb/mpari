package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class ic {
    public final RadioButton A;
    public final RadioButton B;
    public final LinearLayout a;
    public final LinearLayout b;
    public final RadioGroup c;
    public final RadioButton d;
    public final MyTextView e;
    public final LinearLayout f;
    public final TextView g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final RecyclerView j;
    public final CheckBox k;
    public final TextView l;
    public final EditText m;
    public final TextView n;
    public final LinearLayout o;
    public final ri5 p;
    public final AppCompatEditText q;
    public final AppCompatTextView r;
    public final RadioGroup s;
    public final TextView t;
    public final RelativeLayout u;
    public final Spinner v;
    public final TextView w;
    public final EditText x;
    public final TextView y;
    public final RadioButton z;

    public ic(LinearLayout linearLayout, LinearLayout linearLayout2, RadioGroup radioGroup, RadioButton radioButton, MyTextView myTextView, LinearLayout linearLayout3, TextView textView, LinearLayout linearLayout4, LinearLayout linearLayout5, RecyclerView recyclerView, CheckBox checkBox, TextView textView2, EditText editText, TextView textView3, LinearLayout linearLayout6, ri5 ri5Var, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView, RadioGroup radioGroup2, TextView textView4, RelativeLayout relativeLayout, Spinner spinner, TextView textView5, EditText editText2, TextView textView6, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = radioGroup;
        this.d = radioButton;
        this.e = myTextView;
        this.f = linearLayout3;
        this.g = textView;
        this.h = linearLayout4;
        this.i = linearLayout5;
        this.j = recyclerView;
        this.k = checkBox;
        this.l = textView2;
        this.m = editText;
        this.n = textView3;
        this.o = linearLayout6;
        this.p = ri5Var;
        this.q = appCompatEditText;
        this.r = appCompatTextView;
        this.s = radioGroup2;
        this.t = textView4;
        this.u = relativeLayout;
        this.v = spinner;
        this.w = textView5;
        this.x = editText2;
        this.y = textView6;
        this.z = radioButton2;
        this.A = radioButton3;
        this.B = radioButton4;
    }

    public static ic a(View view) {
        int i = R.id.aadharLL;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.aadharLL);
        if (linearLayout != null) {
            i = R.id.aadharRg;
            RadioGroup radioGroup = (RadioGroup) zp7.a(view, R.id.aadharRg);
            if (radioGroup != null) {
                i = R.id.adharRadio;
                RadioButton radioButton = (RadioButton) zp7.a(view, R.id.adharRadio);
                if (radioButton != null) {
                    i = R.id.adhar_term;
                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.adhar_term);
                    if (myTextView != null) {
                        i = R.id.allOtherLL;
                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.allOtherLL);
                        if (linearLayout2 != null) {
                            i = R.id.authorizedCampTv;
                            TextView textView = (TextView) zp7.a(view, R.id.authorizedCampTv);
                            if (textView != null) {
                                i = R.id.buttonHolder;
                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.buttonHolder);
                                if (linearLayout3 != null) {
                                    i = R.id.campLLGJ;
                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.campLLGJ);
                                    if (linearLayout4 != null) {
                                        i = R.id.campRv;
                                        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.campRv);
                                        if (recyclerView != null) {
                                            i = R.id.decKyc;
                                            CheckBox checkBox = (CheckBox) zp7.a(view, R.id.decKyc);
                                            if (checkBox != null) {
                                                i = R.id.enterAadharOrVidTv;
                                                TextView textView2 = (TextView) zp7.a(view, R.id.enterAadharOrVidTv);
                                                if (textView2 != null) {
                                                    i = R.id.et_otp;
                                                    EditText editText = (EditText) zp7.a(view, R.id.et_otp);
                                                    if (editText != null) {
                                                        i = R.id.generateOtp;
                                                        TextView textView3 = (TextView) zp7.a(view, R.id.generateOtp);
                                                        if (textView3 != null) {
                                                            i = R.id.linear_mob;
                                                            LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.linear_mob);
                                                            if (linearLayout5 != null) {
                                                                i = R.id.mHeader;
                                                                View viewA = zp7.a(view, R.id.mHeader);
                                                                if (viewA != null) {
                                                                    ri5 ri5VarA = ri5.a(viewA);
                                                                    i = R.id.mobileNoEt;
                                                                    AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.mobileNoEt);
                                                                    if (appCompatEditText != null) {
                                                                        i = R.id.mobileNoTv;
                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.mobileNoTv);
                                                                        if (appCompatTextView != null) {
                                                                            i = R.id.radioGroup_id;
                                                                            RadioGroup radioGroup2 = (RadioGroup) zp7.a(view, R.id.radioGroup_id);
                                                                            if (radioGroup2 != null) {
                                                                                i = R.id.reset;
                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.reset);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.rtoRl;
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.rtoRl);
                                                                                    if (relativeLayout != null) {
                                                                                        i = R.id.rtoSpn;
                                                                                        Spinner spinner = (Spinner) zp7.a(view, R.id.rtoSpn);
                                                                                        if (spinner != null) {
                                                                                            i = R.id.rtoTv;
                                                                                            TextView textView5 = (TextView) zp7.a(view, R.id.rtoTv);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.stateEt;
                                                                                                EditText editText2 = (EditText) zp7.a(view, R.id.stateEt);
                                                                                                if (editText2 != null) {
                                                                                                    i = R.id.stateTv;
                                                                                                    TextView textView6 = (TextView) zp7.a(view, R.id.stateTv);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.vidRadio;
                                                                                                        RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.vidRadio);
                                                                                                        if (radioButton2 != null) {
                                                                                                            i = R.id.withAadharRb;
                                                                                                            RadioButton radioButton3 = (RadioButton) zp7.a(view, R.id.withAadharRb);
                                                                                                            if (radioButton3 != null) {
                                                                                                                i = R.id.withoutAadharRb;
                                                                                                                RadioButton radioButton4 = (RadioButton) zp7.a(view, R.id.withoutAadharRb);
                                                                                                                if (radioButton4 != null) {
                                                                                                                    return new ic((LinearLayout) view, linearLayout, radioGroup, radioButton, myTextView, linearLayout2, textView, linearLayout3, linearLayout4, recyclerView, checkBox, textView2, editText, textView3, linearLayout5, ri5VarA, appCompatEditText, appCompatTextView, radioGroup2, textView4, relativeLayout, spinner, textView5, editText2, textView6, radioButton2, radioButton3, radioButton4);
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

    public static ic c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ic d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_learner_licence_aadhar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
