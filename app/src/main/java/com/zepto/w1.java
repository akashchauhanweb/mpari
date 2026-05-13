package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 {
    public final TextView A;
    public final v23 B;
    public final CheckBox C;
    public final TextView D;
    public final d47 E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final ScrollView a;
    public final Spinner b;
    public final EditText c;
    public final EditText d;
    public final Spinner e;
    public final EditText f;
    public final TextView g;
    public final EditText h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final Spinner m;
    public final EditText n;
    public final EditText o;
    public final TextView p;
    public final EditText q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final Spinner v;
    public final EditText w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public w1(ScrollView scrollView, Spinner spinner, EditText editText, EditText editText2, Spinner spinner2, EditText editText3, TextView textView, EditText editText4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, Spinner spinner3, EditText editText5, EditText editText6, TextView textView6, EditText editText7, TextView textView7, TextView textView8, TextView textView9, TextView textView10, Spinner spinner4, EditText editText8, TextView textView11, TextView textView12, TextView textView13, TextView textView14, v23 v23Var, CheckBox checkBox, TextView textView15, d47 d47Var, TextView textView16, TextView textView17, TextView textView18) {
        this.a = scrollView;
        this.b = spinner;
        this.c = editText;
        this.d = editText2;
        this.e = spinner2;
        this.f = editText3;
        this.g = textView;
        this.h = editText4;
        this.i = textView2;
        this.j = textView3;
        this.k = textView4;
        this.l = textView5;
        this.m = spinner3;
        this.n = editText5;
        this.o = editText6;
        this.p = textView6;
        this.q = editText7;
        this.r = textView7;
        this.s = textView8;
        this.t = textView9;
        this.u = textView10;
        this.v = spinner4;
        this.w = editText8;
        this.x = textView11;
        this.y = textView12;
        this.z = textView13;
        this.A = textView14;
        this.B = v23Var;
        this.C = checkBox;
        this.D = textView15;
        this.E = d47Var;
        this.F = textView16;
        this.G = textView17;
        this.H = textView18;
    }

    public static w1 a(View view) {
        int i = R.id.current_district_spinner;
        Spinner spinner = (Spinner) zp7.a(view, R.id.current_district_spinner);
        if (spinner != null) {
            i = R.id.current_landmark;
            EditText editText = (EditText) zp7.a(view, R.id.current_landmark);
            if (editText != null) {
                i = R.id.currentPinCode;
                EditText editText2 = (EditText) zp7.a(view, R.id.currentPinCode);
                if (editText2 != null) {
                    i = R.id.current_state_spinner;
                    Spinner spinner2 = (Spinner) zp7.a(view, R.id.current_state_spinner);
                    if (spinner2 != null) {
                        i = R.id.current_village_town;
                        EditText editText3 = (EditText) zp7.a(view, R.id.current_village_town);
                        if (editText3 != null) {
                            i = R.id.distict_txt;
                            TextView textView = (TextView) zp7.a(view, R.id.distict_txt);
                            if (textView != null) {
                                i = R.id.house_street_enter;
                                EditText editText4 = (EditText) zp7.a(view, R.id.house_street_enter);
                                if (editText4 != null) {
                                    i = R.id.house_street_text;
                                    TextView textView2 = (TextView) zp7.a(view, R.id.house_street_text);
                                    if (textView2 != null) {
                                        i = R.id.landmark_police_station;
                                        TextView textView3 = (TextView) zp7.a(view, R.id.landmark_police_station);
                                        if (textView3 != null) {
                                            i = R.id.new_current_address_details;
                                            TextView textView4 = (TextView) zp7.a(view, R.id.new_current_address_details);
                                            if (textView4 != null) {
                                                i = R.id.nextPage;
                                                TextView textView5 = (TextView) zp7.a(view, R.id.nextPage);
                                                if (textView5 != null) {
                                                    i = R.id.per_district_spinner;
                                                    Spinner spinner3 = (Spinner) zp7.a(view, R.id.per_district_spinner);
                                                    if (spinner3 != null) {
                                                        i = R.id.per_enter_pincode;
                                                        EditText editText5 = (EditText) zp7.a(view, R.id.per_enter_pincode);
                                                        if (editText5 != null) {
                                                            i = R.id.per_house_street_enter;
                                                            EditText editText6 = (EditText) zp7.a(view, R.id.per_house_street_enter);
                                                            if (editText6 != null) {
                                                                i = R.id.per_house_street_text;
                                                                TextView textView6 = (TextView) zp7.a(view, R.id.per_house_street_text);
                                                                if (textView6 != null) {
                                                                    i = R.id.per_landmark;
                                                                    EditText editText7 = (EditText) zp7.a(view, R.id.per_landmark);
                                                                    if (editText7 != null) {
                                                                        i = R.id.per_landmark_police_station;
                                                                        TextView textView7 = (TextView) zp7.a(view, R.id.per_landmark_police_station);
                                                                        if (textView7 != null) {
                                                                            i = R.id.per_pinCode;
                                                                            TextView textView8 = (TextView) zp7.a(view, R.id.per_pinCode);
                                                                            if (textView8 != null) {
                                                                                i = R.id.per_pincode;
                                                                                TextView textView9 = (TextView) zp7.a(view, R.id.per_pincode);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.per_state;
                                                                                    TextView textView10 = (TextView) zp7.a(view, R.id.per_state);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.per_state_spinner;
                                                                                        Spinner spinner4 = (Spinner) zp7.a(view, R.id.per_state_spinner);
                                                                                        if (spinner4 != null) {
                                                                                            i = R.id.per_village_town;
                                                                                            EditText editText8 = (EditText) zp7.a(view, R.id.per_village_town);
                                                                                            if (editText8 != null) {
                                                                                                i = R.id.per_village_town_city;
                                                                                                TextView textView11 = (TextView) zp7.a(view, R.id.per_village_town_city);
                                                                                                if (textView11 != null) {
                                                                                                    i = R.id.permanent_address_details;
                                                                                                    TextView textView12 = (TextView) zp7.a(view, R.id.permanent_address_details);
                                                                                                    if (textView12 != null) {
                                                                                                        i = R.id.pinCode;
                                                                                                        TextView textView13 = (TextView) zp7.a(view, R.id.pinCode);
                                                                                                        if (textView13 != null) {
                                                                                                            i = R.id.previousPage;
                                                                                                            TextView textView14 = (TextView) zp7.a(view, R.id.previousPage);
                                                                                                            if (textView14 != null) {
                                                                                                                i = R.id.rc_ind;
                                                                                                                View viewA = zp7.a(view, R.id.rc_ind);
                                                                                                                if (viewA != null) {
                                                                                                                    v23 v23VarA = v23.a(viewA);
                                                                                                                    i = R.id.same_as_current;
                                                                                                                    CheckBox checkBox = (CheckBox) zp7.a(view, R.id.same_as_current);
                                                                                                                    if (checkBox != null) {
                                                                                                                        i = R.id.state;
                                                                                                                        TextView textView15 = (TextView) zp7.a(view, R.id.state);
                                                                                                                        if (textView15 != null) {
                                                                                                                            i = R.id.topHolder;
                                                                                                                            View viewA2 = zp7.a(view, R.id.topHolder);
                                                                                                                            if (viewA2 != null) {
                                                                                                                                d47 d47VarA = d47.a(viewA2);
                                                                                                                                i = R.id.vehicleNumberTv;
                                                                                                                                TextView textView16 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                if (textView16 != null) {
                                                                                                                                    i = R.id.vehicle_view;
                                                                                                                                    TextView textView17 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                    if (textView17 != null) {
                                                                                                                                        i = R.id.village_town_city;
                                                                                                                                        TextView textView18 = (TextView) zp7.a(view, R.id.village_town_city);
                                                                                                                                        if (textView18 != null) {
                                                                                                                                            return new w1((ScrollView) view, spinner, editText, editText2, spinner2, editText3, textView, editText4, textView2, textView3, textView4, textView5, spinner3, editText5, editText6, textView6, editText7, textView7, textView8, textView9, textView10, spinner4, editText8, textView11, textView12, textView13, textView14, v23VarA, checkBox, textView15, d47VarA, textView16, textView17, textView18);
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

    public static w1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static w1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.aadhaartolayout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
