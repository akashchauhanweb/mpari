package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e67 {
    public final TextView A;
    public final EditText B;
    public final TextView C;
    public final ScrollView a;
    public final AppCompatButton b;
    public final Spinner c;
    public final EditText d;
    public final TextView e;
    public final TextView f;
    public final EditText g;
    public final EditText h;
    public final EditText i;
    public final TextView j;
    public final Spinner k;
    public final EditText l;
    public final TextView m;
    public final TextView n;
    public final v23 o;
    public final Spinner p;
    public final TextView q;
    public final d47 r;
    public final MyTextView s;
    public final MyTextView t;
    public final MyTextView u;
    public final MyTextView v;
    public final MyTextView w;
    public final TextView x;
    public final MyTextView y;
    public final TextView z;

    public e67(ScrollView scrollView, AppCompatButton appCompatButton, Spinner spinner, EditText editText, TextView textView, TextView textView2, EditText editText2, EditText editText3, EditText editText4, TextView textView3, Spinner spinner2, EditText editText5, TextView textView4, TextView textView5, v23 v23Var, Spinner spinner3, TextView textView6, d47 d47Var, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, TextView textView7, MyTextView myTextView6, TextView textView8, TextView textView9, EditText editText6, TextView textView10) {
        this.a = scrollView;
        this.b = appCompatButton;
        this.c = spinner;
        this.d = editText;
        this.e = textView;
        this.f = textView2;
        this.g = editText2;
        this.h = editText3;
        this.i = editText4;
        this.j = textView3;
        this.k = spinner2;
        this.l = editText5;
        this.m = textView4;
        this.n = textView5;
        this.o = v23Var;
        this.p = spinner3;
        this.q = textView6;
        this.r = d47Var;
        this.s = myTextView;
        this.t = myTextView2;
        this.u = myTextView3;
        this.v = myTextView4;
        this.w = myTextView5;
        this.x = textView7;
        this.y = myTextView6;
        this.z = textView8;
        this.A = textView9;
        this.B = editText6;
        this.C = textView10;
    }

    public static e67 a(View view) {
        int i = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
        if (appCompatButton != null) {
            i = R.id.current_distic_spinner;
            Spinner spinner = (Spinner) zp7.a(view, R.id.current_distic_spinner);
            if (spinner != null) {
                i = R.id.current_pincode;
                EditText editText = (EditText) zp7.a(view, R.id.current_pincode);
                if (editText != null) {
                    i = R.id.district;
                    TextView textView = (TextView) zp7.a(view, R.id.district);
                    if (textView != null) {
                        i = R.id.finance_From_Date_Tv;
                        TextView textView2 = (TextView) zp7.a(view, R.id.finance_From_Date_Tv);
                        if (textView2 != null) {
                            i = R.id.financerBranchTv;
                            EditText editText2 = (EditText) zp7.a(view, R.id.financerBranchTv);
                            if (editText2 != null) {
                                i = R.id.financerNameTv;
                                EditText editText3 = (EditText) zp7.a(view, R.id.financerNameTv);
                                if (editText3 != null) {
                                    i = R.id.house_no;
                                    EditText editText4 = (EditText) zp7.a(view, R.id.house_no);
                                    if (editText4 != null) {
                                        i = R.id.house_no_and_street_name;
                                        TextView textView3 = (TextView) zp7.a(view, R.id.house_no_and_street_name);
                                        if (textView3 != null) {
                                            i = R.id.hpt_type_spinner;
                                            Spinner spinner2 = (Spinner) zp7.a(view, R.id.hpt_type_spinner);
                                            if (spinner2 != null) {
                                                i = R.id.land_mark;
                                                EditText editText5 = (EditText) zp7.a(view, R.id.land_mark);
                                                if (editText5 != null) {
                                                    i = R.id.landmark_police_station;
                                                    TextView textView4 = (TextView) zp7.a(view, R.id.landmark_police_station);
                                                    if (textView4 != null) {
                                                        i = R.id.pincode;
                                                        TextView textView5 = (TextView) zp7.a(view, R.id.pincode);
                                                        if (textView5 != null) {
                                                            i = R.id.rc_ind;
                                                            View viewA = zp7.a(view, R.id.rc_ind);
                                                            if (viewA != null) {
                                                                v23 v23VarA = v23.a(viewA);
                                                                i = R.id.select_spinner;
                                                                Spinner spinner3 = (Spinner) zp7.a(view, R.id.select_spinner);
                                                                if (spinner3 != null) {
                                                                    i = R.id.state;
                                                                    TextView textView6 = (TextView) zp7.a(view, R.id.state);
                                                                    if (textView6 != null) {
                                                                        i = R.id.topHolder;
                                                                        View viewA2 = zp7.a(view, R.id.topHolder);
                                                                        if (viewA2 != null) {
                                                                            d47 d47VarA = d47.a(viewA2);
                                                                            i = R.id.vahan_finance_from_date;
                                                                            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.vahan_finance_from_date);
                                                                            if (myTextView != null) {
                                                                                i = R.id.vahan_financer_add;
                                                                                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.vahan_financer_add);
                                                                                if (myTextView2 != null) {
                                                                                    i = R.id.vahan_financer_branch;
                                                                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.vahan_financer_branch);
                                                                                    if (myTextView3 != null) {
                                                                                        i = R.id.vahan_financer_name;
                                                                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vahan_financer_name);
                                                                                        if (myTextView4 != null) {
                                                                                            i = R.id.vahan_hypothecation_add_details;
                                                                                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.vahan_hypothecation_add_details);
                                                                                            if (myTextView5 != null) {
                                                                                                i = R.id.vahan_hypothecation_addition;
                                                                                                TextView textView7 = (TextView) zp7.a(view, R.id.vahan_hypothecation_addition);
                                                                                                if (textView7 != null) {
                                                                                                    i = R.id.vahan_type;
                                                                                                    MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.vahan_type);
                                                                                                    if (myTextView6 != null) {
                                                                                                        i = R.id.vehicleNumberTv;
                                                                                                        TextView textView8 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                        if (textView8 != null) {
                                                                                                            i = R.id.vehicle_view;
                                                                                                            TextView textView9 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                            if (textView9 != null) {
                                                                                                                i = R.id.village_town;
                                                                                                                EditText editText6 = (EditText) zp7.a(view, R.id.village_town);
                                                                                                                if (editText6 != null) {
                                                                                                                    i = R.id.village_town_city;
                                                                                                                    TextView textView10 = (TextView) zp7.a(view, R.id.village_town_city);
                                                                                                                    if (textView10 != null) {
                                                                                                                        return new e67((ScrollView) view, appCompatButton, spinner, editText, textView, textView2, editText2, editText3, editText4, textView3, spinner2, editText5, textView4, textView5, v23VarA, spinner3, textView6, d47VarA, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, textView7, myTextView6, textView8, textView9, editText6, textView10);
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

    public static e67 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static e67 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_hypothecation_addition, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
