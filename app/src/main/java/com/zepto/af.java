package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class af {
    public final ScrollView a;
    public final TextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final TextView e;
    public final MyTextView f;
    public final AppCompatButton g;
    public final MyTextView h;
    public final TextView i;
    public final MyTextView j;
    public final TextView k;
    public final MyTextView l;
    public final TextView m;
    public final MyTextView n;
    public final TextView o;
    public final MyTextView p;
    public final TextView q;
    public final MyTextView r;
    public final TextView s;
    public final MyTextView t;
    public final LinearLayout u;
    public final d47 v;
    public final TextView w;
    public final TextView x;

    public af(ScrollView scrollView, TextView textView, MyTextView myTextView, MyTextView myTextView2, TextView textView2, MyTextView myTextView3, AppCompatButton appCompatButton, MyTextView myTextView4, TextView textView3, MyTextView myTextView5, TextView textView4, MyTextView myTextView6, TextView textView5, MyTextView myTextView7, TextView textView6, MyTextView myTextView8, TextView textView7, MyTextView myTextView9, TextView textView8, MyTextView myTextView10, LinearLayout linearLayout, d47 d47Var, TextView textView9, TextView textView10) {
        this.a = scrollView;
        this.b = textView;
        this.c = myTextView;
        this.d = myTextView2;
        this.e = textView2;
        this.f = myTextView3;
        this.g = appCompatButton;
        this.h = myTextView4;
        this.i = textView3;
        this.j = myTextView5;
        this.k = textView4;
        this.l = myTextView6;
        this.m = textView5;
        this.n = myTextView7;
        this.o = textView6;
        this.p = myTextView8;
        this.q = textView7;
        this.r = myTextView9;
        this.s = textView8;
        this.t = myTextView10;
        this.u = linearLayout;
        this.v = d47Var;
        this.w = textView9;
        this.x = textView10;
    }

    public static af a(View view) {
        int i = R.id.allot_office;
        TextView textView = (TextView) zp7.a(view, R.id.allot_office);
        if (textView != null) {
            i = R.id.allot_office_txt;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.allot_office_txt);
            if (myTextView != null) {
                i = R.id.auth_details;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.auth_details);
                if (myTextView2 != null) {
                    i = R.id.auth_upto;
                    TextView textView2 = (TextView) zp7.a(view, R.id.auth_upto);
                    if (textView2 != null) {
                        i = R.id.auth_upto_txt;
                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.auth_upto_txt);
                        if (myTextView3 != null) {
                            i = R.id.btnSubmit;
                            AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
                            if (appCompatButton != null) {
                                i = R.id.period_details;
                                MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.period_details);
                                if (myTextView4 != null) {
                                    i = R.id.previous_authorization_form;
                                    TextView textView3 = (TextView) zp7.a(view, R.id.previous_authorization_form);
                                    if (textView3 != null) {
                                        i = R.id.previous_authorization_form_txt;
                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.previous_authorization_form_txt);
                                        if (myTextView5 != null) {
                                            i = R.id.previous_authorization_no;
                                            TextView textView4 = (TextView) zp7.a(view, R.id.previous_authorization_no);
                                            if (textView4 != null) {
                                                i = R.id.previous_authorization_no_txt;
                                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.previous_authorization_no_txt);
                                                if (myTextView6 != null) {
                                                    i = R.id.previous_authorization__upto;
                                                    TextView textView5 = (TextView) zp7.a(view, R.id.previous_authorization__upto);
                                                    if (textView5 != null) {
                                                        i = R.id.previous_authorization__upto_txt;
                                                        MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.previous_authorization__upto_txt);
                                                        if (myTextView7 != null) {
                                                            i = R.id.previous_issuing_date;
                                                            TextView textView6 = (TextView) zp7.a(view, R.id.previous_issuing_date);
                                                            if (textView6 != null) {
                                                                i = R.id.previous_issuing_date_txt;
                                                                MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.previous_issuing_date_txt);
                                                                if (myTextView8 != null) {
                                                                    i = R.id.previous_permit_no;
                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.previous_permit_no);
                                                                    if (textView7 != null) {
                                                                        i = R.id.previous_permit_no_txt;
                                                                        MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.previous_permit_no_txt);
                                                                        if (myTextView9 != null) {
                                                                            i = R.id.previous_registration_no;
                                                                            TextView textView8 = (TextView) zp7.a(view, R.id.previous_registration_no);
                                                                            if (textView8 != null) {
                                                                                i = R.id.previous_registration_no_txt;
                                                                                MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.previous_registration_no_txt);
                                                                                if (myTextView10 != null) {
                                                                                    i = R.id.rc_relesae_layout;
                                                                                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.rc_relesae_layout);
                                                                                    if (linearLayout != null) {
                                                                                        i = R.id.topHolder;
                                                                                        View viewA = zp7.a(view, R.id.topHolder);
                                                                                        if (viewA != null) {
                                                                                            d47 d47VarA = d47.a(viewA);
                                                                                            i = R.id.vehicleNumberTv;
                                                                                            TextView textView9 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                            if (textView9 != null) {
                                                                                                i = R.id.vehicle_view;
                                                                                                TextView textView10 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                if (textView10 != null) {
                                                                                                    return new af((ScrollView) view, textView, myTextView, myTextView2, textView2, myTextView3, appCompatButton, myTextView4, textView3, myTextView5, textView4, myTextView6, textView5, myTextView7, textView6, myTextView8, textView7, myTextView9, textView8, myTextView10, linearLayout, d47VarA, textView9, textView10);
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

    public static af c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static af d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_renewal_of_npauthorization_permit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
