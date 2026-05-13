package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ng {
    public final AppCompatTextView A;
    public final EditText B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final RecyclerView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final TextView M;
    public final AppCompatTextView N;
    public final AppCompatTextView O;
    public final AppCompatTextView P;
    public final AppCompatTextView Q;
    public final TextView R;
    public final TextView S;
    public final AppCompatTextView T;
    public final AppCompatTextView U;
    public final View V;
    public final View W;
    public final AppCompatTextView X;
    public final View Y;
    public final CoordinatorLayout a;
    public final AppCompatTextView b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final AppCompatTextView i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final TextView l;
    public final AppCompatTextView m;
    public final RelativeLayout n;
    public final AppCompatTextView o;
    public final TextView p;
    public final AppCompatTextView q;
    public final RelativeLayout r;
    public final TextView s;
    public final FrameLayout t;
    public final Spinner u;
    public final AppCompatTextView v;
    public final TextView w;
    public final ImageView x;
    public final RelativeLayout y;
    public final RecyclerView z;

    public ng(CoordinatorLayout coordinatorLayout, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, ImageView imageView, TextView textView3, LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatTextView appCompatTextView2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView4, AppCompatTextView appCompatTextView3, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView4, TextView textView5, AppCompatTextView appCompatTextView5, RelativeLayout relativeLayout2, TextView textView6, FrameLayout frameLayout, Spinner spinner, AppCompatTextView appCompatTextView6, TextView textView7, ImageView imageView2, RelativeLayout relativeLayout3, RecyclerView recyclerView, AppCompatTextView appCompatTextView7, EditText editText, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, RecyclerView recyclerView2, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, TextView textView13, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, AppCompatTextView appCompatTextView14, AppCompatTextView appCompatTextView15, TextView textView14, TextView textView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17, View view, View view2, AppCompatTextView appCompatTextView18, View view3) {
        this.a = coordinatorLayout;
        this.b = appCompatTextView;
        this.c = textView;
        this.d = textView2;
        this.e = imageView;
        this.f = textView3;
        this.g = linearLayout;
        this.h = linearLayout2;
        this.i = appCompatTextView2;
        this.j = linearLayout3;
        this.k = linearLayout4;
        this.l = textView4;
        this.m = appCompatTextView3;
        this.n = relativeLayout;
        this.o = appCompatTextView4;
        this.p = textView5;
        this.q = appCompatTextView5;
        this.r = relativeLayout2;
        this.s = textView6;
        this.t = frameLayout;
        this.u = spinner;
        this.v = appCompatTextView6;
        this.w = textView7;
        this.x = imageView2;
        this.y = relativeLayout3;
        this.z = recyclerView;
        this.A = appCompatTextView7;
        this.B = editText;
        this.C = textView8;
        this.D = textView9;
        this.E = textView10;
        this.F = textView11;
        this.G = textView12;
        this.H = recyclerView2;
        this.I = appCompatTextView8;
        this.J = appCompatTextView9;
        this.K = appCompatTextView10;
        this.L = appCompatTextView11;
        this.M = textView13;
        this.N = appCompatTextView12;
        this.O = appCompatTextView13;
        this.P = appCompatTextView14;
        this.Q = appCompatTextView15;
        this.R = textView14;
        this.S = textView15;
        this.T = appCompatTextView16;
        this.U = appCompatTextView17;
        this.V = view;
        this.W = view2;
        this.X = appCompatTextView18;
        this.Y = view3;
    }

    public static ng a(View view) {
        int i = R.id.calc_tax_details;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.calc_tax_details);
        if (appCompatTextView != null) {
            i = R.id.calculatetax;
            TextView textView = (TextView) zp7.a(view, R.id.calculatetax);
            if (textView != null) {
                i = R.id.current_tax_amount;
                TextView textView2 = (TextView) zp7.a(view, R.id.current_tax_amount);
                if (textView2 != null) {
                    i = R.id.down_arrow_current;
                    ImageView imageView = (ImageView) zp7.a(view, R.id.down_arrow_current);
                    if (imageView != null) {
                        i = R.id.finalamount;
                        TextView textView3 = (TextView) zp7.a(view, R.id.finalamount);
                        if (textView3 != null) {
                            i = R.id.llcaldetails;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.llcaldetails);
                            if (linearLayout != null) {
                                i = R.id.llheader;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.llheader);
                                if (linearLayout2 != null) {
                                    i = R.id.myc;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.myc);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.nexgenarrow;
                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                        if (linearLayout3 != null) {
                                            i = R.id.nexgenlogo;
                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                            if (linearLayout4 != null) {
                                                i = R.id.owner_name;
                                                TextView textView4 = (TextView) zp7.a(view, R.id.owner_name);
                                                if (textView4 != null) {
                                                    i = R.id.owner_name_txt;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.owner_name_txt);
                                                    if (appCompatTextView3 != null) {
                                                        i = R.id.parent_linear;
                                                        RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.parent_linear);
                                                        if (relativeLayout != null) {
                                                            i = R.id.payYourTax;
                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.payYourTax);
                                                            if (appCompatTextView4 != null) {
                                                                i = R.id.per_type;
                                                                TextView textView5 = (TextView) zp7.a(view, R.id.per_type);
                                                                if (textView5 != null) {
                                                                    i = R.id.permitType;
                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.permitType);
                                                                    if (appCompatTextView5 != null) {
                                                                        i = R.id.permit_type_linear;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) zp7.a(view, R.id.permit_type_linear);
                                                                        if (relativeLayout2 != null) {
                                                                            i = R.id.please_wait;
                                                                            TextView textView6 = (TextView) zp7.a(view, R.id.please_wait);
                                                                            if (textView6 != null) {
                                                                                i = R.id.progress;
                                                                                FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.progress);
                                                                                if (frameLayout != null) {
                                                                                    i = R.id.purposeSpinner;
                                                                                    Spinner spinner = (Spinner) zp7.a(view, R.id.purposeSpinner);
                                                                                    if (spinner != null) {
                                                                                        i = R.id.receiptdate;
                                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.receiptdate);
                                                                                        if (appCompatTextView6 != null) {
                                                                                            i = R.id.reset_button;
                                                                                            TextView textView7 = (TextView) zp7.a(view, R.id.reset_button);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.rightPurposePin;
                                                                                                ImageView imageView2 = (ImageView) zp7.a(view, R.id.rightPurposePin);
                                                                                                if (imageView2 != null) {
                                                                                                    i = R.id.rlcalculatetax;
                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) zp7.a(view, R.id.rlcalculatetax);
                                                                                                    if (relativeLayout3 != null) {
                                                                                                        i = R.id.rvcalculatetax;
                                                                                                        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rvcalculatetax);
                                                                                                        if (recyclerView != null) {
                                                                                                            i = R.id.select_yearView;
                                                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.select_yearView);
                                                                                                            if (appCompatTextView7 != null) {
                                                                                                                i = R.id.selectmyc;
                                                                                                                EditText editText = (EditText) zp7.a(view, R.id.selectmyc);
                                                                                                                if (editText != null) {
                                                                                                                    i = R.id.selectreceipt_date;
                                                                                                                    TextView textView8 = (TextView) zp7.a(view, R.id.selectreceipt_date);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i = R.id.selecttaxmode;
                                                                                                                        TextView textView9 = (TextView) zp7.a(view, R.id.selecttaxmode);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i = R.id.selecttaxupto;
                                                                                                                            TextView textView10 = (TextView) zp7.a(view, R.id.selecttaxupto);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i = R.id.selectvehicleclass;
                                                                                                                                TextView textView11 = (TextView) zp7.a(view, R.id.selectvehicleclass);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    i = R.id.tFrom;
                                                                                                                                    TextView textView12 = (TextView) zp7.a(view, R.id.tFrom);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        i = R.id.tax_calculate_recycleview;
                                                                                                                                        RecyclerView recyclerView2 = (RecyclerView) zp7.a(view, R.id.tax_calculate_recycleview);
                                                                                                                                        if (recyclerView2 != null) {
                                                                                                                                            i = R.id.tax_from;
                                                                                                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.tax_from);
                                                                                                                                            if (appCompatTextView8 != null) {
                                                                                                                                                i = R.id.taxmode;
                                                                                                                                                AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.taxmode);
                                                                                                                                                if (appCompatTextView9 != null) {
                                                                                                                                                    i = R.id.taxupto;
                                                                                                                                                    AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.taxupto);
                                                                                                                                                    if (appCompatTextView10 != null) {
                                                                                                                                                        i = R.id.totalTransactionChrg;
                                                                                                                                                        AppCompatTextView appCompatTextView11 = (AppCompatTextView) zp7.a(view, R.id.totalTransactionChrg);
                                                                                                                                                        if (appCompatTextView11 != null) {
                                                                                                                                                            i = R.id.totalTransactionChrgtv;
                                                                                                                                                            TextView textView13 = (TextView) zp7.a(view, R.id.totalTransactionChrgtv);
                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                i = R.id.tv_vehicleno;
                                                                                                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) zp7.a(view, R.id.tv_vehicleno);
                                                                                                                                                                if (appCompatTextView12 != null) {
                                                                                                                                                                    i = R.id.tvcurrent_tax_amount;
                                                                                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) zp7.a(view, R.id.tvcurrent_tax_amount);
                                                                                                                                                                    if (appCompatTextView13 != null) {
                                                                                                                                                                        i = R.id.tvfinalamount;
                                                                                                                                                                        AppCompatTextView appCompatTextView14 = (AppCompatTextView) zp7.a(view, R.id.tvfinalamount);
                                                                                                                                                                        if (appCompatTextView14 != null) {
                                                                                                                                                                            i = R.id.usercharge;
                                                                                                                                                                            AppCompatTextView appCompatTextView15 = (AppCompatTextView) zp7.a(view, R.id.usercharge);
                                                                                                                                                                            if (appCompatTextView15 != null) {
                                                                                                                                                                                i = R.id.userchargetv;
                                                                                                                                                                                TextView textView14 = (TextView) zp7.a(view, R.id.userchargetv);
                                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                                    i = R.id.vahan_service_lable;
                                                                                                                                                                                    TextView textView15 = (TextView) zp7.a(view, R.id.vahan_service_lable);
                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                        i = R.id.vehicle;
                                                                                                                                                                                        AppCompatTextView appCompatTextView16 = (AppCompatTextView) zp7.a(view, R.id.vehicle);
                                                                                                                                                                                        if (appCompatTextView16 != null) {
                                                                                                                                                                                            i = R.id.vehicleno;
                                                                                                                                                                                            AppCompatTextView appCompatTextView17 = (AppCompatTextView) zp7.a(view, R.id.vehicleno);
                                                                                                                                                                                            if (appCompatTextView17 != null) {
                                                                                                                                                                                                i = R.id.view;
                                                                                                                                                                                                View viewA = zp7.a(view, R.id.view);
                                                                                                                                                                                                if (viewA != null) {
                                                                                                                                                                                                    i = R.id.view23;
                                                                                                                                                                                                    View viewA2 = zp7.a(view, R.id.view23);
                                                                                                                                                                                                    if (viewA2 != null) {
                                                                                                                                                                                                        i = R.id.view_vehicle_detail;
                                                                                                                                                                                                        AppCompatTextView appCompatTextView18 = (AppCompatTextView) zp7.a(view, R.id.view_vehicle_detail);
                                                                                                                                                                                                        if (appCompatTextView18 != null) {
                                                                                                                                                                                                            i = R.id.viewvi;
                                                                                                                                                                                                            View viewA3 = zp7.a(view, R.id.viewvi);
                                                                                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                                                                                return new ng((CoordinatorLayout) view, appCompatTextView, textView, textView2, imageView, textView3, linearLayout, linearLayout2, appCompatTextView2, linearLayout3, linearLayout4, textView4, appCompatTextView3, relativeLayout, appCompatTextView4, textView5, appCompatTextView5, relativeLayout2, textView6, frameLayout, spinner, appCompatTextView6, textView7, imageView2, relativeLayout3, recyclerView, appCompatTextView7, editText, textView8, textView9, textView10, textView11, textView12, recyclerView2, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, textView13, appCompatTextView12, appCompatTextView13, appCompatTextView14, appCompatTextView15, textView14, textView15, appCompatTextView16, appCompatTextView17, viewA, viewA2, appCompatTextView18, viewA3);
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

    public static ng c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ng d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tax_calculate, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
