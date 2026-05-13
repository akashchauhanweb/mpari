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
public final class v1 {
    public final TextView A;
    public final v23 B;
    public final CheckBox C;
    public final TextView D;
    public final zh7 E;
    public final d47 F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
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
    public final EditText m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final Spinner v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public v1(ScrollView scrollView, Spinner spinner, EditText editText, EditText editText2, Spinner spinner2, EditText editText3, TextView textView, EditText editText4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, EditText editText5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, Spinner spinner3, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, v23 v23Var, CheckBox checkBox, TextView textView19, zh7 zh7Var, d47 d47Var, TextView textView20, TextView textView21, TextView textView22) {
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
        this.m = editText5;
        this.n = textView6;
        this.o = textView7;
        this.p = textView8;
        this.q = textView9;
        this.r = textView10;
        this.s = textView11;
        this.t = textView12;
        this.u = textView13;
        this.v = spinner3;
        this.w = textView14;
        this.x = textView15;
        this.y = textView16;
        this.z = textView17;
        this.A = textView18;
        this.B = v23Var;
        this.C = checkBox;
        this.D = textView19;
        this.E = zh7Var;
        this.F = d47Var;
        this.G = textView20;
        this.H = textView21;
        this.I = textView22;
    }

    public static v1 a(View view) {
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
                                                    EditText editText5 = (EditText) zp7.a(view, R.id.per_district_spinner);
                                                    if (editText5 != null) {
                                                        i = R.id.per_enter_pincode;
                                                        TextView textView6 = (TextView) zp7.a(view, R.id.per_enter_pincode);
                                                        if (textView6 != null) {
                                                            i = R.id.per_house_street_enter;
                                                            TextView textView7 = (TextView) zp7.a(view, R.id.per_house_street_enter);
                                                            if (textView7 != null) {
                                                                i = R.id.per_house_street_text;
                                                                TextView textView8 = (TextView) zp7.a(view, R.id.per_house_street_text);
                                                                if (textView8 != null) {
                                                                    i = R.id.per_landmark;
                                                                    TextView textView9 = (TextView) zp7.a(view, R.id.per_landmark);
                                                                    if (textView9 != null) {
                                                                        i = R.id.per_landmark_police_station;
                                                                        TextView textView10 = (TextView) zp7.a(view, R.id.per_landmark_police_station);
                                                                        if (textView10 != null) {
                                                                            i = R.id.per_pinCode;
                                                                            TextView textView11 = (TextView) zp7.a(view, R.id.per_pinCode);
                                                                            if (textView11 != null) {
                                                                                i = R.id.per_pincode;
                                                                                TextView textView12 = (TextView) zp7.a(view, R.id.per_pincode);
                                                                                if (textView12 != null) {
                                                                                    i = R.id.per_state;
                                                                                    TextView textView13 = (TextView) zp7.a(view, R.id.per_state);
                                                                                    if (textView13 != null) {
                                                                                        i = R.id.per_state_spinner;
                                                                                        Spinner spinner3 = (Spinner) zp7.a(view, R.id.per_state_spinner);
                                                                                        if (spinner3 != null) {
                                                                                            i = R.id.per_village_town;
                                                                                            TextView textView14 = (TextView) zp7.a(view, R.id.per_village_town);
                                                                                            if (textView14 != null) {
                                                                                                i = R.id.per_village_town_city;
                                                                                                TextView textView15 = (TextView) zp7.a(view, R.id.per_village_town_city);
                                                                                                if (textView15 != null) {
                                                                                                    i = R.id.permanent_address_details;
                                                                                                    TextView textView16 = (TextView) zp7.a(view, R.id.permanent_address_details);
                                                                                                    if (textView16 != null) {
                                                                                                        i = R.id.pinCode;
                                                                                                        TextView textView17 = (TextView) zp7.a(view, R.id.pinCode);
                                                                                                        if (textView17 != null) {
                                                                                                            i = R.id.previousPage;
                                                                                                            TextView textView18 = (TextView) zp7.a(view, R.id.previousPage);
                                                                                                            if (textView18 != null) {
                                                                                                                i = R.id.rc_ind;
                                                                                                                View viewA = zp7.a(view, R.id.rc_ind);
                                                                                                                if (viewA != null) {
                                                                                                                    v23 v23VarA = v23.a(viewA);
                                                                                                                    i = R.id.same_as_current;
                                                                                                                    CheckBox checkBox = (CheckBox) zp7.a(view, R.id.same_as_current);
                                                                                                                    if (checkBox != null) {
                                                                                                                        i = R.id.state;
                                                                                                                        TextView textView19 = (TextView) zp7.a(view, R.id.state);
                                                                                                                        if (textView19 != null) {
                                                                                                                            i = R.id.stepper_layout;
                                                                                                                            View viewA2 = zp7.a(view, R.id.stepper_layout);
                                                                                                                            if (viewA2 != null) {
                                                                                                                                zh7 zh7VarA = zh7.a(viewA2);
                                                                                                                                i = R.id.topHolder;
                                                                                                                                View viewA3 = zp7.a(view, R.id.topHolder);
                                                                                                                                if (viewA3 != null) {
                                                                                                                                    d47 d47VarA = d47.a(viewA3);
                                                                                                                                    i = R.id.vehicleNumberTv;
                                                                                                                                    TextView textView20 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                    if (textView20 != null) {
                                                                                                                                        i = R.id.vehicle_view;
                                                                                                                                        TextView textView21 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                        if (textView21 != null) {
                                                                                                                                            i = R.id.village_town_city;
                                                                                                                                            TextView textView22 = (TextView) zp7.a(view, R.id.village_town_city);
                                                                                                                                            if (textView22 != null) {
                                                                                                                                                return new v1((ScrollView) view, spinner, editText, editText2, spinner2, editText3, textView, editText4, textView2, textView3, textView4, textView5, editText5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, spinner3, textView14, textView15, textView16, textView17, textView18, v23VarA, checkBox, textView19, zh7VarA, d47VarA, textView20, textView21, textView22);
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

    public static v1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static v1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.aadhaar_to_address, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
