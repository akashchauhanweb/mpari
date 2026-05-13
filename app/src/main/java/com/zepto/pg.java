package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pg {
    public final TextView A;
    public final ScrollView a;
    public final EditText b;
    public final AppCompatTextView c;
    public final TextView d;
    public final AppCompatTextView e;
    public final TextView f;
    public final AppCompatTextView g;
    public final TextView h;
    public final AppCompatTextView i;
    public final TextView j;
    public final AppCompatTextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final AppCompatTextView o;
    public final EditText p;
    public final AppCompatTextView q;
    public final AppCompatTextView r;
    public final v23 s;
    public final TextView t;
    public final TextView u;
    public final AppCompatTextView v;
    public final TextView w;
    public final AppCompatTextView x;
    public final d47 y;
    public final TextView z;

    public pg(ScrollView scrollView, EditText editText, AppCompatTextView appCompatTextView, TextView textView, AppCompatTextView appCompatTextView2, TextView textView2, AppCompatTextView appCompatTextView3, TextView textView3, AppCompatTextView appCompatTextView4, TextView textView4, AppCompatTextView appCompatTextView5, TextView textView5, TextView textView6, TextView textView7, AppCompatTextView appCompatTextView6, EditText editText2, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, v23 v23Var, TextView textView8, TextView textView9, AppCompatTextView appCompatTextView9, TextView textView10, AppCompatTextView appCompatTextView10, d47 d47Var, TextView textView11, TextView textView12) {
        this.a = scrollView;
        this.b = editText;
        this.c = appCompatTextView;
        this.d = textView;
        this.e = appCompatTextView2;
        this.f = textView2;
        this.g = appCompatTextView3;
        this.h = textView3;
        this.i = appCompatTextView4;
        this.j = textView4;
        this.k = appCompatTextView5;
        this.l = textView5;
        this.m = textView6;
        this.n = textView7;
        this.o = appCompatTextView6;
        this.p = editText2;
        this.q = appCompatTextView7;
        this.r = appCompatTextView8;
        this.s = v23Var;
        this.t = textView8;
        this.u = textView9;
        this.v = appCompatTextView9;
        this.w = textView10;
        this.x = appCompatTextView10;
        this.y = d47Var;
        this.z = textView11;
        this.A = textView12;
    }

    public static pg a(View view) {
        int i = R.id.email_id;
        EditText editText = (EditText) zp7.a(view, R.id.email_id);
        if (editText != null) {
            i = R.id.email_id_txt;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.email_id_txt);
            if (appCompatTextView != null) {
                i = R.id.father_husband_name;
                TextView textView = (TextView) zp7.a(view, R.id.father_husband_name);
                if (textView != null) {
                    i = R.id.father_husband_name_txt;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.father_husband_name_txt);
                    if (appCompatTextView2 != null) {
                        i = R.id.mobile_number;
                        TextView textView2 = (TextView) zp7.a(view, R.id.mobile_number);
                        if (textView2 != null) {
                            i = R.id.mobile_number_txt;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.mobile_number_txt);
                            if (appCompatTextView3 != null) {
                                i = R.id.new_owner_category;
                                TextView textView3 = (TextView) zp7.a(view, R.id.new_owner_category);
                                if (textView3 != null) {
                                    i = R.id.new_owner_category_txt;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.new_owner_category_txt);
                                    if (appCompatTextView4 != null) {
                                        i = R.id.new_owner_name;
                                        TextView textView4 = (TextView) zp7.a(view, R.id.new_owner_name);
                                        if (textView4 != null) {
                                            i = R.id.new_owner_name_txt;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.new_owner_name_txt);
                                            if (appCompatTextView5 != null) {
                                                i = R.id.new_owner_purpose;
                                                TextView textView5 = (TextView) zp7.a(view, R.id.new_owner_purpose);
                                                if (textView5 != null) {
                                                    i = R.id.nextPage;
                                                    TextView textView6 = (TextView) zp7.a(view, R.id.nextPage);
                                                    if (textView6 != null) {
                                                        i = R.id.ownership_type;
                                                        TextView textView7 = (TextView) zp7.a(view, R.id.ownership_type);
                                                        if (textView7 != null) {
                                                            i = R.id.ownership_type_txt;
                                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.ownership_type_txt);
                                                            if (appCompatTextView6 != null) {
                                                                i = R.id.pan_number;
                                                                EditText editText2 = (EditText) zp7.a(view, R.id.pan_number);
                                                                if (editText2 != null) {
                                                                    i = R.id.pan_number_txt;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.pan_number_txt);
                                                                    if (appCompatTextView7 != null) {
                                                                        i = R.id.purpose_txt;
                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.purpose_txt);
                                                                        if (appCompatTextView8 != null) {
                                                                            i = R.id.rc_ind;
                                                                            View viewA = zp7.a(view, R.id.rc_ind);
                                                                            if (viewA != null) {
                                                                                v23 v23VarA = v23.a(viewA);
                                                                                i = R.id.resetPage;
                                                                                TextView textView8 = (TextView) zp7.a(view, R.id.resetPage);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.sale_amount;
                                                                                    TextView textView9 = (TextView) zp7.a(view, R.id.sale_amount);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.sale_amount_txt;
                                                                                        AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.sale_amount_txt);
                                                                                        if (appCompatTextView9 != null) {
                                                                                            i = R.id.sale_date;
                                                                                            TextView textView10 = (TextView) zp7.a(view, R.id.sale_date);
                                                                                            if (textView10 != null) {
                                                                                                i = R.id.sale_date_txt;
                                                                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.sale_date_txt);
                                                                                                if (appCompatTextView10 != null) {
                                                                                                    i = R.id.topHolder;
                                                                                                    View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                    if (viewA2 != null) {
                                                                                                        d47 d47VarA = d47.a(viewA2);
                                                                                                        i = R.id.vehicleNumberTv;
                                                                                                        TextView textView11 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                        if (textView11 != null) {
                                                                                                            i = R.id.vehicle_view;
                                                                                                            TextView textView12 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                            if (textView12 != null) {
                                                                                                                return new pg((ScrollView) view, editText, appCompatTextView, textView, appCompatTextView2, textView2, appCompatTextView3, textView3, appCompatTextView4, textView4, appCompatTextView5, textView5, textView6, textView7, appCompatTextView6, editText2, appCompatTextView7, appCompatTextView8, v23VarA, textView8, textView9, appCompatTextView9, textView10, appCompatTextView10, d47VarA, textView11, textView12);
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

    public static pg c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static pg d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tobuyer_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
