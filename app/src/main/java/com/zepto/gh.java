package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gh {
    public final CoordinatorLayout a;
    public final MyTextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final EditText f;
    public final TextView g;
    public final LinearLayout h;
    public final MyTextView i;
    public final MyTextView j;
    public final ImageView k;
    public final TextView l;
    public final LinearLayout m;
    public final CheckBox n;
    public final MyTextView o;
    public final d47 p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final LinearLayout u;
    public final LinearLayout v;

    public gh(CoordinatorLayout coordinatorLayout, MyTextView myTextView, TextView textView, TextView textView2, TextView textView3, EditText editText, TextView textView4, LinearLayout linearLayout, MyTextView myTextView2, MyTextView myTextView3, ImageView imageView, TextView textView5, LinearLayout linearLayout2, CheckBox checkBox, MyTextView myTextView4, d47 d47Var, TextView textView6, TextView textView7, TextView textView8, TextView textView9, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.a = coordinatorLayout;
        this.b = myTextView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = editText;
        this.g = textView4;
        this.h = linearLayout;
        this.i = myTextView2;
        this.j = myTextView3;
        this.k = imageView;
        this.l = textView5;
        this.m = linearLayout2;
        this.n = checkBox;
        this.o = myTextView4;
        this.p = d47Var;
        this.q = textView6;
        this.r = textView7;
        this.s = textView8;
        this.t = textView9;
        this.u = linearLayout3;
        this.v = linearLayout4;
    }

    public static gh a(View view) {
        int i = R.id.agreeTermCond;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.agreeTermCond);
        if (myTextView != null) {
            i = R.id.disPlay;
            TextView textView = (TextView) zp7.a(view, R.id.disPlay);
            if (textView != null) {
                i = R.id.edit_mobile_number;
                TextView textView2 = (TextView) zp7.a(view, R.id.edit_mobile_number);
                if (textView2 != null) {
                    i = R.id.enterMobileTv;
                    TextView textView3 = (TextView) zp7.a(view, R.id.enterMobileTv);
                    if (textView3 != null) {
                        i = R.id.enterOtp;
                        EditText editText = (EditText) zp7.a(view, R.id.enterOtp);
                        if (editText != null) {
                            i = R.id.note_text;
                            TextView textView4 = (TextView) zp7.a(view, R.id.note_text);
                            if (textView4 != null) {
                                i = R.id.parentLayout;
                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.parentLayout);
                                if (linearLayout != null) {
                                    i = R.id.resendOtp;
                                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.resendOtp);
                                    if (myTextView2 != null) {
                                        i = R.id.selectedServiceTv;
                                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.selectedServiceTv);
                                        if (myTextView3 != null) {
                                            i = R.id.showmpin;
                                            ImageView imageView = (ImageView) zp7.a(view, R.id.showmpin);
                                            if (imageView != null) {
                                                i = R.id.submitOtp;
                                                TextView textView5 = (TextView) zp7.a(view, R.id.submitOtp);
                                                if (textView5 != null) {
                                                    i = R.id.termCndLl;
                                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.termCndLl);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.term_condition;
                                                        CheckBox checkBox = (CheckBox) zp7.a(view, R.id.term_condition);
                                                        if (checkBox != null) {
                                                            i = R.id.time_text;
                                                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.time_text);
                                                            if (myTextView4 != null) {
                                                                i = R.id.topHolder;
                                                                View viewA = zp7.a(view, R.id.topHolder);
                                                                if (viewA != null) {
                                                                    d47 d47VarA = d47.a(viewA);
                                                                    i = R.id.txt_reset;
                                                                    TextView textView6 = (TextView) zp7.a(view, R.id.txt_reset);
                                                                    if (textView6 != null) {
                                                                        i = R.id.txt_vehicle_number;
                                                                        TextView textView7 = (TextView) zp7.a(view, R.id.txt_vehicle_number);
                                                                        if (textView7 != null) {
                                                                            i = R.id.update_mob;
                                                                            TextView textView8 = (TextView) zp7.a(view, R.id.update_mob);
                                                                            if (textView8 != null) {
                                                                                i = R.id.vehile_no;
                                                                                TextView textView9 = (TextView) zp7.a(view, R.id.vehile_no);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.verifyOtpBtn;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.verifyOtpBtn);
                                                                                    if (linearLayout3 != null) {
                                                                                        i = R.id.verifyOtpLl;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.verifyOtpLl);
                                                                                        if (linearLayout4 != null) {
                                                                                            return new gh((CoordinatorLayout) view, myTextView, textView, textView2, textView3, editText, textView4, linearLayout, myTextView2, myTextView3, imageView, textView5, linearLayout2, checkBox, myTextView4, d47VarA, textView6, textView7, textView8, textView9, linearLayout3, linearLayout4);
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

    public static gh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static gh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_generate_o_t_p_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
