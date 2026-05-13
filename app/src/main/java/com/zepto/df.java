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
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class df {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout K;
    public final CoordinatorLayout a;
    public final AppCompatSpinner b;
    public final x23 c;
    public final w23 d;
    public final TextView e;
    public final AppCompatButton f;
    public final ProgressBar g;
    public final EditText h;
    public final TextView i;
    public final TextView j;
    public final EditText k;
    public final AppCompatEditText l;
    public final vy3 m;
    public final ImageButton n;
    public final ImageButton o;
    public final LinearLayout p;
    public final LinearLayout q;
    public final LinearLayout r;
    public final LinearLayout s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final CoordinatorLayout w;
    public final AppCompatSpinner x;
    public final TextView y;
    public final ProgressBar z;

    public df(CoordinatorLayout coordinatorLayout, AppCompatSpinner appCompatSpinner, x23 x23Var, w23 w23Var, TextView textView, AppCompatButton appCompatButton, ProgressBar progressBar, EditText editText, TextView textView2, TextView textView3, EditText editText2, AppCompatEditText appCompatEditText, vy3 vy3Var, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView4, TextView textView5, TextView textView6, CoordinatorLayout coordinatorLayout2, AppCompatSpinner appCompatSpinner2, TextView textView7, ProgressBar progressBar2, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, LinearLayout linearLayout5) {
        this.a = coordinatorLayout;
        this.b = appCompatSpinner;
        this.c = x23Var;
        this.d = w23Var;
        this.e = textView;
        this.f = appCompatButton;
        this.g = progressBar;
        this.h = editText;
        this.i = textView2;
        this.j = textView3;
        this.k = editText2;
        this.l = appCompatEditText;
        this.m = vy3Var;
        this.n = imageButton;
        this.o = imageButton2;
        this.p = linearLayout;
        this.q = linearLayout2;
        this.r = linearLayout3;
        this.s = linearLayout4;
        this.t = textView4;
        this.u = textView5;
        this.v = textView6;
        this.w = coordinatorLayout2;
        this.x = appCompatSpinner2;
        this.y = textView7;
        this.z = progressBar2;
        this.A = textView8;
        this.B = textView9;
        this.C = textView10;
        this.D = textView11;
        this.E = textView12;
        this.F = textView13;
        this.G = textView14;
        this.H = textView15;
        this.I = textView16;
        this.J = textView17;
        this.K = linearLayout5;
    }

    public static df a(View view) {
        int i = R.id.app_option;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) zp7.a(view, R.id.app_option);
        if (appCompatSpinner != null) {
            i = R.id.bsheet;
            View viewA = zp7.a(view, R.id.bsheet);
            if (viewA != null) {
                x23 x23VarA = x23.a(viewA);
                i = R.id.bsheetvideo;
                View viewA2 = zp7.a(view, R.id.bsheetvideo);
                if (viewA2 != null) {
                    w23 w23VarA = w23.a(viewA2);
                    i = R.id.camera;
                    TextView textView = (TextView) zp7.a(view, R.id.camera);
                    if (textView != null) {
                        i = R.id.complain_reg;
                        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.complain_reg);
                        if (appCompatButton != null) {
                            i = R.id.cprogress;
                            ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.cprogress);
                            if (progressBar != null) {
                                i = R.id.editTextTextPersonName11;
                                EditText editText = (EditText) zp7.a(view, R.id.editTextTextPersonName11);
                                if (editText != null) {
                                    i = R.id.ev_calender_picker;
                                    TextView textView2 = (TextView) zp7.a(view, R.id.ev_calender_picker);
                                    if (textView2 != null) {
                                        i = R.id.ev_location;
                                        TextView textView3 = (TextView) zp7.a(view, R.id.ev_location);
                                        if (textView3 != null) {
                                            i = R.id.ev_time_picker;
                                            EditText editText2 = (EditText) zp7.a(view, R.id.ev_time_picker);
                                            if (editText2 != null) {
                                                i = R.id.ev_vehicle_no;
                                                AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.ev_vehicle_no);
                                                if (appCompatEditText != null) {
                                                    i = R.id.header_acc_report;
                                                    View viewA3 = zp7.a(view, R.id.header_acc_report);
                                                    if (viewA3 != null) {
                                                        vy3 vy3VarA = vy3.a(viewA3);
                                                        i = R.id.ibImagePicker;
                                                        ImageButton imageButton = (ImageButton) zp7.a(view, R.id.ibImagePicker);
                                                        if (imageButton != null) {
                                                            i = R.id.ibVideoPicker;
                                                            ImageButton imageButton2 = (ImageButton) zp7.a(view, R.id.ibVideoPicker);
                                                            if (imageButton2 != null) {
                                                                i = R.id.image_Linear;
                                                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.image_Linear);
                                                                if (linearLayout != null) {
                                                                    i = R.id.ll_comp_history;
                                                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.ll_comp_history);
                                                                    if (linearLayout2 != null) {
                                                                        i = R.id.ll_dashboard;
                                                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.ll_dashboard);
                                                                        if (linearLayout3 != null) {
                                                                            i = R.id.ll_reg_complaint;
                                                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.ll_reg_complaint);
                                                                            if (linearLayout4 != null) {
                                                                                i = R.id.logo_compl_hist;
                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.logo_compl_hist);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.logo_dashboard;
                                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.logo_dashboard);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.logo_reg_compln;
                                                                                        TextView textView6 = (TextView) zp7.a(view, R.id.logo_reg_compln);
                                                                                        if (textView6 != null) {
                                                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                                                                            i = R.id.spn_state;
                                                                                            AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) zp7.a(view, R.id.spn_state);
                                                                                            if (appCompatSpinner2 != null) {
                                                                                                i = R.id.stateselect;
                                                                                                TextView textView7 = (TextView) zp7.a(view, R.id.stateselect);
                                                                                                if (textView7 != null) {
                                                                                                    i = R.id.traffic_progress;
                                                                                                    ProgressBar progressBar2 = (ProgressBar) zp7.a(view, R.id.traffic_progress);
                                                                                                    if (progressBar2 != null) {
                                                                                                        i = R.id.tv_comment;
                                                                                                        TextView textView8 = (TextView) zp7.a(view, R.id.tv_comment);
                                                                                                        if (textView8 != null) {
                                                                                                            i = R.id.tv_date;
                                                                                                            TextView textView9 = (TextView) zp7.a(view, R.id.tv_date);
                                                                                                            if (textView9 != null) {
                                                                                                                i = R.id.tv_location;
                                                                                                                TextView textView10 = (TextView) zp7.a(view, R.id.tv_location);
                                                                                                                if (textView10 != null) {
                                                                                                                    i = R.id.tv_note;
                                                                                                                    TextView textView11 = (TextView) zp7.a(view, R.id.tv_note);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i = R.id.tv_state;
                                                                                                                        TextView textView12 = (TextView) zp7.a(view, R.id.tv_state);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i = R.id.tv_time;
                                                                                                                            TextView textView13 = (TextView) zp7.a(view, R.id.tv_time);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i = R.id.tv_vehicle_no;
                                                                                                                                TextView textView14 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                                                                                if (textView14 != null) {
                                                                                                                                    i = R.id.tv_violation_type;
                                                                                                                                    TextView textView15 = (TextView) zp7.a(view, R.id.tv_violation_type);
                                                                                                                                    if (textView15 != null) {
                                                                                                                                        i = R.id.tvstatetitle;
                                                                                                                                        TextView textView16 = (TextView) zp7.a(view, R.id.tvstatetitle);
                                                                                                                                        if (textView16 != null) {
                                                                                                                                            i = R.id.video;
                                                                                                                                            TextView textView17 = (TextView) zp7.a(view, R.id.video);
                                                                                                                                            if (textView17 != null) {
                                                                                                                                                i = R.id.video_Linear;
                                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.video_Linear);
                                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                                    return new df(coordinatorLayout, appCompatSpinner, x23VarA, w23VarA, textView, appCompatButton, progressBar, editText, textView2, textView3, editText2, appCompatEditText, vy3VarA, imageButton, imageButton2, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView4, textView5, textView6, coordinatorLayout, appCompatSpinner2, textView7, progressBar2, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, linearLayout5);
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

    public static df c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static df d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_report_traffic, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
