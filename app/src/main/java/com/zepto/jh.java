package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jh {
    public final MyTextView A;
    public final TextView B;
    public final RadioButton C;
    public final CoordinatorLayout a;
    public final TextView b;
    public final RadioButton c;
    public final CheckBox d;
    public final TextView e;
    public final EditText f;
    public final MyTextView g;
    public final TextView h;
    public final EditText i;
    public final TextView j;
    public final LinearLayout k;
    public final MyTextView l;
    public final LinearLayout m;
    public final LinearLayout n;
    public final RadioGroup o;
    public final MyTextView p;
    public final MyTextView q;
    public final ImageView r;
    public final LinearLayout s;
    public final MyTextView t;
    public final MyTextView u;
    public final d47 v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public jh(CoordinatorLayout coordinatorLayout, TextView textView, RadioButton radioButton, CheckBox checkBox, TextView textView2, EditText editText, MyTextView myTextView, TextView textView3, EditText editText2, TextView textView4, LinearLayout linearLayout, MyTextView myTextView2, LinearLayout linearLayout2, LinearLayout linearLayout3, RadioGroup radioGroup, MyTextView myTextView3, MyTextView myTextView4, ImageView imageView, LinearLayout linearLayout4, MyTextView myTextView5, MyTextView myTextView6, d47 d47Var, TextView textView5, TextView textView6, TextView textView7, TextView textView8, MyTextView myTextView7, TextView textView9, RadioButton radioButton2) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = radioButton;
        this.d = checkBox;
        this.e = textView2;
        this.f = editText;
        this.g = myTextView;
        this.h = textView3;
        this.i = editText2;
        this.j = textView4;
        this.k = linearLayout;
        this.l = myTextView2;
        this.m = linearLayout2;
        this.n = linearLayout3;
        this.o = radioGroup;
        this.p = myTextView3;
        this.q = myTextView4;
        this.r = imageView;
        this.s = linearLayout4;
        this.t = myTextView5;
        this.u = myTextView6;
        this.v = d47Var;
        this.w = textView5;
        this.x = textView6;
        this.y = textView7;
        this.z = textView8;
        this.A = myTextView7;
        this.B = textView9;
        this.C = radioButton2;
    }

    public static jh a(View view) {
        int i = R.id.aadher_title;
        TextView textView = (TextView) zp7.a(view, R.id.aadher_title);
        if (textView != null) {
            i = R.id.adhar_radio;
            RadioButton radioButton = (RadioButton) zp7.a(view, R.id.adhar_radio);
            if (radioButton != null) {
                i = R.id.dec_kyc;
                CheckBox checkBox = (CheckBox) zp7.a(view, R.id.dec_kyc);
                if (checkBox != null) {
                    i = R.id.disPlay;
                    TextView textView2 = (TextView) zp7.a(view, R.id.disPlay);
                    if (textView2 != null) {
                        i = R.id.enterOtp;
                        EditText editText = (EditText) zp7.a(view, R.id.enterOtp);
                        if (editText != null) {
                            i = R.id.enter_otp2;
                            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.enter_otp2);
                            if (myTextView != null) {
                                i = R.id.enterVirtualIdTv;
                                TextView textView3 = (TextView) zp7.a(view, R.id.enterVirtualIdTv);
                                if (textView3 != null) {
                                    i = R.id.et_otp;
                                    EditText editText2 = (EditText) zp7.a(view, R.id.et_otp);
                                    if (editText2 != null) {
                                        i = R.id.faceless_services;
                                        TextView textView4 = (TextView) zp7.a(view, R.id.faceless_services);
                                        if (textView4 != null) {
                                            i = R.id.generateOtpLl;
                                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.generateOtpLl);
                                            if (linearLayout != null) {
                                                i = R.id.notes;
                                                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.notes);
                                                if (myTextView2 != null) {
                                                    i = R.id.otpBtnLl;
                                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.otpBtnLl);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.processLl;
                                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.processLl);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.radioGroup_id;
                                                            RadioGroup radioGroup = (RadioGroup) zp7.a(view, R.id.radioGroup_id);
                                                            if (radioGroup != null) {
                                                                i = R.id.resendOtp;
                                                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.resendOtp);
                                                                if (myTextView3 != null) {
                                                                    i = R.id.selectedServiceTv;
                                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.selectedServiceTv);
                                                                    if (myTextView4 != null) {
                                                                        i = R.id.showmpin;
                                                                        ImageView imageView = (ImageView) zp7.a(view, R.id.showmpin);
                                                                        if (imageView != null) {
                                                                            i = R.id.termCndLl;
                                                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.termCndLl);
                                                                            if (linearLayout4 != null) {
                                                                                i = R.id.terms_conditions;
                                                                                MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.terms_conditions);
                                                                                if (myTextView5 != null) {
                                                                                    i = R.id.time_text;
                                                                                    MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.time_text);
                                                                                    if (myTextView6 != null) {
                                                                                        i = R.id.topHolder;
                                                                                        View viewA = zp7.a(view, R.id.topHolder);
                                                                                        if (viewA != null) {
                                                                                            d47 d47VarA = d47.a(viewA);
                                                                                            i = R.id.txt_reset;
                                                                                            TextView textView5 = (TextView) zp7.a(view, R.id.txt_reset);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.txt_reset_otp;
                                                                                                TextView textView6 = (TextView) zp7.a(view, R.id.txt_reset_otp);
                                                                                                if (textView6 != null) {
                                                                                                    i = R.id.txt_service_submit;
                                                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.txt_service_submit);
                                                                                                    if (textView7 != null) {
                                                                                                        i = R.id.txt_vehicle_number;
                                                                                                        TextView textView8 = (TextView) zp7.a(view, R.id.txt_vehicle_number);
                                                                                                        if (textView8 != null) {
                                                                                                            i = R.id.vehicle_number;
                                                                                                            MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.vehicle_number);
                                                                                                            if (myTextView7 != null) {
                                                                                                                i = R.id.verify_user;
                                                                                                                TextView textView9 = (TextView) zp7.a(view, R.id.verify_user);
                                                                                                                if (textView9 != null) {
                                                                                                                    i = R.id.vid_radio;
                                                                                                                    RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.vid_radio);
                                                                                                                    if (radioButton2 != null) {
                                                                                                                        return new jh((CoordinatorLayout) view, textView, radioButton, checkBox, textView2, editText, myTextView, textView3, editText2, textView4, linearLayout, myTextView2, linearLayout2, linearLayout3, radioGroup, myTextView3, myTextView4, imageView, linearLayout4, myTextView5, myTextView6, d47VarA, textView5, textView6, textView7, textView8, myTextView7, textView9, radioButton2);
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

    public static jh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static jh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_process_with_adhar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
