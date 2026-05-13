package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CircleImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class ah {
    public final MyTextView A;
    public final MyTextView B;
    public final MyTextView C;
    public final MyTextView D;
    public final MyTextView E;
    public final MyTextView F;
    public final vy3 G;
    public final CircleImageView H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final MyTextView K;
    public final LinearLayout a;
    public final TextView b;
    public final EditText c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final MyTextView g;
    public final TextView h;
    public final RadioButton i;
    public final EditText j;
    public final RadioButton k;
    public final EditText l;
    public final LinearLayout m;
    public final RadioButton n;
    public final Spinner o;
    public final EditText p;
    public final EditText q;
    public final MyTextView r;
    public final TextView s;
    public final TextView t;
    public final Spinner u;
    public final ImageView v;
    public final ImageView w;
    public final MyTextView x;
    public final MyTextView y;
    public final MyTextView z;

    public ah(LinearLayout linearLayout, TextView textView, EditText editText, TextView textView2, TextView textView3, ImageView imageView, MyTextView myTextView, TextView textView4, RadioButton radioButton, EditText editText2, RadioButton radioButton2, EditText editText3, LinearLayout linearLayout2, RadioButton radioButton3, Spinner spinner, EditText editText4, EditText editText5, MyTextView myTextView2, TextView textView5, TextView textView6, Spinner spinner2, ImageView imageView2, ImageView imageView3, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, vy3 vy3Var, CircleImageView circleImageView, LinearLayout linearLayout3, LinearLayout linearLayout4, MyTextView myTextView12) {
        this.a = linearLayout;
        this.b = textView;
        this.c = editText;
        this.d = textView2;
        this.e = textView3;
        this.f = imageView;
        this.g = myTextView;
        this.h = textView4;
        this.i = radioButton;
        this.j = editText2;
        this.k = radioButton2;
        this.l = editText3;
        this.m = linearLayout2;
        this.n = radioButton3;
        this.o = spinner;
        this.p = editText4;
        this.q = editText5;
        this.r = myTextView2;
        this.s = textView5;
        this.t = textView6;
        this.u = spinner2;
        this.v = imageView2;
        this.w = imageView3;
        this.x = myTextView3;
        this.y = myTextView4;
        this.z = myTextView5;
        this.A = myTextView6;
        this.B = myTextView7;
        this.C = myTextView8;
        this.D = myTextView9;
        this.E = myTextView10;
        this.F = myTextView11;
        this.G = vy3Var;
        this.H = circleImageView;
        this.I = linearLayout3;
        this.J = linearLayout4;
        this.K = myTextView12;
    }

    public static ah a(View view) {
        int i = R.id.applicant_date;
        TextView textView = (TextView) zp7.a(view, R.id.applicant_date);
        if (textView != null) {
            i = R.id.applicant_dob;
            EditText editText = (EditText) zp7.a(view, R.id.applicant_dob);
            if (editText != null) {
                i = R.id.applicant_month;
                TextView textView2 = (TextView) zp7.a(view, R.id.applicant_month);
                if (textView2 != null) {
                    i = R.id.applicant_year;
                    TextView textView3 = (TextView) zp7.a(view, R.id.applicant_year);
                    if (textView3 != null) {
                        i = R.id.dob_cal;
                        ImageView imageView = (ImageView) zp7.a(view, R.id.dob_cal);
                        if (imageView != null) {
                            i = R.id.edit_profile;
                            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.edit_profile);
                            if (myTextView != null) {
                                i = R.id.em_dob;
                                TextView textView4 = (TextView) zp7.a(view, R.id.em_dob);
                                if (textView4 != null) {
                                    i = R.id.em_female;
                                    RadioButton radioButton = (RadioButton) zp7.a(view, R.id.em_female);
                                    if (radioButton != null) {
                                        i = R.id.em_height;
                                        EditText editText2 = (EditText) zp7.a(view, R.id.em_height);
                                        if (editText2 != null) {
                                            i = R.id.em_male;
                                            RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.em_male);
                                            if (radioButton2 != null) {
                                                i = R.id.em_name;
                                                EditText editText3 = (EditText) zp7.a(view, R.id.em_name);
                                                if (editText3 != null) {
                                                    i = R.id.em_next;
                                                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.em_next);
                                                    if (linearLayout != null) {
                                                        i = R.id.em_other;
                                                        RadioButton radioButton3 = (RadioButton) zp7.a(view, R.id.em_other);
                                                        if (radioButton3 != null) {
                                                            i = R.id.em_spn;
                                                            Spinner spinner = (Spinner) zp7.a(view, R.id.em_spn);
                                                            if (spinner != null) {
                                                                i = R.id.em_weight;
                                                                EditText editText4 = (EditText) zp7.a(view, R.id.em_weight);
                                                                if (editText4 != null) {
                                                                    i = R.id.emailIdEt;
                                                                    EditText editText5 = (EditText) zp7.a(view, R.id.emailIdEt);
                                                                    if (editText5 != null) {
                                                                        i = R.id.mobile_no;
                                                                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.mobile_no);
                                                                        if (myTextView2 != null) {
                                                                            i = R.id.mobile_no_tv;
                                                                            TextView textView5 = (TextView) zp7.a(view, R.id.mobile_no_tv);
                                                                            if (textView5 != null) {
                                                                                i = R.id.profile_txt;
                                                                                TextView textView6 = (TextView) zp7.a(view, R.id.profile_txt);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.select_spinner;
                                                                                    Spinner spinner2 = (Spinner) zp7.a(view, R.id.select_spinner);
                                                                                    if (spinner2 != null) {
                                                                                        i = R.id.showmpin;
                                                                                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.showmpin);
                                                                                        if (imageView2 != null) {
                                                                                            i = R.id.showmpin_state;
                                                                                            ImageView imageView3 = (ImageView) zp7.a(view, R.id.showmpin_state);
                                                                                            if (imageView3 != null) {
                                                                                                i = R.id.stateTxt;
                                                                                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.stateTxt);
                                                                                                if (myTextView3 != null) {
                                                                                                    i = R.id.title_bloodgp;
                                                                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.title_bloodgp);
                                                                                                    if (myTextView4 != null) {
                                                                                                        i = R.id.title_dob;
                                                                                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.title_dob);
                                                                                                        if (myTextView5 != null) {
                                                                                                            i = R.id.titleEmail;
                                                                                                            MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.titleEmail);
                                                                                                            if (myTextView6 != null) {
                                                                                                                i = R.id.title_fill_details;
                                                                                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.title_fill_details);
                                                                                                                if (myTextView7 != null) {
                                                                                                                    i = R.id.title_gender;
                                                                                                                    MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.title_gender);
                                                                                                                    if (myTextView8 != null) {
                                                                                                                        i = R.id.title_height;
                                                                                                                        MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.title_height);
                                                                                                                        if (myTextView9 != null) {
                                                                                                                            i = R.id.title_name;
                                                                                                                            MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.title_name);
                                                                                                                            if (myTextView10 != null) {
                                                                                                                                i = R.id.title_weight;
                                                                                                                                MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.title_weight);
                                                                                                                                if (myTextView11 != null) {
                                                                                                                                    i = R.id.topheader;
                                                                                                                                    View viewA = zp7.a(view, R.id.topheader);
                                                                                                                                    if (viewA != null) {
                                                                                                                                        vy3 vy3VarA = vy3.a(viewA);
                                                                                                                                        i = R.id.uploadIv;
                                                                                                                                        CircleImageView circleImageView = (CircleImageView) zp7.a(view, R.id.uploadIv);
                                                                                                                                        if (circleImageView != null) {
                                                                                                                                            i = R.id.user_info_linear;
                                                                                                                                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.user_info_linear);
                                                                                                                                            if (linearLayout2 != null) {
                                                                                                                                                i = R.id.vehicle_linear;
                                                                                                                                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.vehicle_linear);
                                                                                                                                                if (linearLayout3 != null) {
                                                                                                                                                    i = R.id.view_profile;
                                                                                                                                                    MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.view_profile);
                                                                                                                                                    if (myTextView12 != null) {
                                                                                                                                                        return new ah((LinearLayout) view, textView, editText, textView2, textView3, imageView, myTextView, textView4, radioButton, editText2, radioButton2, editText3, linearLayout, radioButton3, spinner, editText4, editText5, myTextView2, textView5, textView6, spinner2, imageView2, imageView3, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, myTextView8, myTextView9, myTextView10, myTextView11, vy3VarA, circleImageView, linearLayout2, linearLayout3, myTextView12);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ah c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ah d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_user_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
