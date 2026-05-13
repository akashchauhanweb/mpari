package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f6 {
    public final TextView A;
    public final TextView B;
    public final LinearLayout a;
    public final ProgressBar b;
    public final MaterialCardView c;
    public final CardView d;
    public final EditText e;
    public final TextView f;
    public final EditText g;
    public final TextView h;
    public final EditText i;
    public final vy3 j;
    public final ImageButton k;
    public final ImageButton l;
    public final LinearLayout m;
    public final LinearLayout n;
    public final LinearLayout o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final LinearLayout s;
    public final AppCompatSpinner t;
    public final AppCompatButton u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public f6(LinearLayout linearLayout, ProgressBar progressBar, MaterialCardView materialCardView, CardView cardView, EditText editText, TextView textView, EditText editText2, TextView textView2, EditText editText3, vy3 vy3Var, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout5, AppCompatSpinner appCompatSpinner, AppCompatButton appCompatButton, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.a = linearLayout;
        this.b = progressBar;
        this.c = materialCardView;
        this.d = cardView;
        this.e = editText;
        this.f = textView;
        this.g = editText2;
        this.h = textView2;
        this.i = editText3;
        this.j = vy3Var;
        this.k = imageButton;
        this.l = imageButton2;
        this.m = linearLayout2;
        this.n = linearLayout3;
        this.o = linearLayout4;
        this.p = textView3;
        this.q = textView4;
        this.r = textView5;
        this.s = linearLayout5;
        this.t = appCompatSpinner;
        this.u = appCompatButton;
        this.v = textView6;
        this.w = textView7;
        this.x = textView8;
        this.y = textView9;
        this.z = textView10;
        this.A = textView11;
        this.B = textView12;
    }

    public static f6 a(View view) {
        int i = R.id.acc_progress_bar;
        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.acc_progress_bar);
        if (progressBar != null) {
            i = R.id.cv_complaint_status;
            MaterialCardView materialCardView = (MaterialCardView) zp7.a(view, R.id.cv_complaint_status);
            if (materialCardView != null) {
                i = R.id.cv_report_complaint;
                CardView cardView = (CardView) zp7.a(view, R.id.cv_report_complaint);
                if (cardView != null) {
                    i = R.id.editTextTextPersonName11;
                    EditText editText = (EditText) zp7.a(view, R.id.editTextTextPersonName11);
                    if (editText != null) {
                        i = R.id.ev_calender_picker;
                        TextView textView = (TextView) zp7.a(view, R.id.ev_calender_picker);
                        if (textView != null) {
                            i = R.id.ev_location;
                            EditText editText2 = (EditText) zp7.a(view, R.id.ev_location);
                            if (editText2 != null) {
                                i = R.id.ev_time_picker;
                                TextView textView2 = (TextView) zp7.a(view, R.id.ev_time_picker);
                                if (textView2 != null) {
                                    i = R.id.ev_vehicle_no;
                                    EditText editText3 = (EditText) zp7.a(view, R.id.ev_vehicle_no);
                                    if (editText3 != null) {
                                        i = R.id.header_acc_report;
                                        View viewA = zp7.a(view, R.id.header_acc_report);
                                        if (viewA != null) {
                                            vy3 vy3VarA = vy3.a(viewA);
                                            i = R.id.ibImagePicker;
                                            ImageButton imageButton = (ImageButton) zp7.a(view, R.id.ibImagePicker);
                                            if (imageButton != null) {
                                                i = R.id.ibVideoPicker;
                                                ImageButton imageButton2 = (ImageButton) zp7.a(view, R.id.ibVideoPicker);
                                                if (imageButton2 != null) {
                                                    i = R.id.ll_comp_history;
                                                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.ll_comp_history);
                                                    if (linearLayout != null) {
                                                        i = R.id.ll_dashboard;
                                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.ll_dashboard);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.ll_reg_complaint;
                                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.ll_reg_complaint);
                                                            if (linearLayout3 != null) {
                                                                i = R.id.logo_dashboard;
                                                                TextView textView3 = (TextView) zp7.a(view, R.id.logo_dashboard);
                                                                if (textView3 != null) {
                                                                    i = R.id.logo_reg_acc_repo;
                                                                    TextView textView4 = (TextView) zp7.a(view, R.id.logo_reg_acc_repo);
                                                                    if (textView4 != null) {
                                                                        i = R.id.logo_repo_acc_hist;
                                                                        TextView textView5 = (TextView) zp7.a(view, R.id.logo_repo_acc_hist);
                                                                        if (textView5 != null) {
                                                                            i = R.id.parent_layout;
                                                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.parent_layout);
                                                                            if (linearLayout4 != null) {
                                                                                i = R.id.spn_state;
                                                                                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) zp7.a(view, R.id.spn_state);
                                                                                if (appCompatSpinner != null) {
                                                                                    i = R.id.submit_acc_report;
                                                                                    AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.submit_acc_report);
                                                                                    if (appCompatButton != null) {
                                                                                        i = R.id.tv_comment;
                                                                                        TextView textView6 = (TextView) zp7.a(view, R.id.tv_comment);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.tv_date;
                                                                                            TextView textView7 = (TextView) zp7.a(view, R.id.tv_date);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.tv_location;
                                                                                                TextView textView8 = (TextView) zp7.a(view, R.id.tv_location);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.tv_note;
                                                                                                    TextView textView9 = (TextView) zp7.a(view, R.id.tv_note);
                                                                                                    if (textView9 != null) {
                                                                                                        i = R.id.tv_state;
                                                                                                        TextView textView10 = (TextView) zp7.a(view, R.id.tv_state);
                                                                                                        if (textView10 != null) {
                                                                                                            i = R.id.tv_time;
                                                                                                            TextView textView11 = (TextView) zp7.a(view, R.id.tv_time);
                                                                                                            if (textView11 != null) {
                                                                                                                i = R.id.tv_vehicle_no;
                                                                                                                TextView textView12 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                                                                if (textView12 != null) {
                                                                                                                    return new f6((LinearLayout) view, progressBar, materialCardView, cardView, editText, textView, editText2, textView2, editText3, vy3VarA, imageButton, imageButton2, linearLayout, linearLayout2, linearLayout3, textView3, textView4, textView5, linearLayout4, appCompatSpinner, appCompatButton, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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

    public static f6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static f6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_accident_report, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
