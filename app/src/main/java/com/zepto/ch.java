package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ch {
    public final ImageView A;
    public final ImageView B;
    public final EditText C;
    public final MyTextView D;
    public final EditText E;
    public final MyTextView F;
    public final EditText G;
    public final MyTextView H;
    public final d47 I;
    public final EditText J;
    public final MyTextView K;
    public final TextView L;
    public final TextView M;
    public final Spinner N;
    public final MyTextView O;
    public final EditText P;
    public final MyTextView Q;
    public final EditText R;
    public final MyTextView S;
    public final ScrollView a;
    public final Spinner b;
    public final MyTextView c;
    public final Spinner d;
    public final MyTextView e;
    public final EditText f;
    public final MyTextView g;
    public final AppCompatButton h;
    public final EditText i;
    public final MyTextView j;
    public final EditText k;
    public final MyTextView l;
    public final Spinner m;
    public final MyTextView n;
    public final EditText o;
    public final MyTextView p;
    public final TextView q;
    public final MyTextView r;
    public final EditText s;
    public final MyTextView t;
    public final EditText u;
    public final MyTextView v;
    public final EditText w;
    public final MyTextView x;
    public final ImageView y;
    public final ImageView z;

    public ch(ScrollView scrollView, Spinner spinner, MyTextView myTextView, Spinner spinner2, MyTextView myTextView2, EditText editText, MyTextView myTextView3, AppCompatButton appCompatButton, EditText editText2, MyTextView myTextView4, EditText editText3, MyTextView myTextView5, Spinner spinner3, MyTextView myTextView6, EditText editText4, MyTextView myTextView7, TextView textView, MyTextView myTextView8, EditText editText5, MyTextView myTextView9, EditText editText6, MyTextView myTextView10, EditText editText7, MyTextView myTextView11, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, EditText editText8, MyTextView myTextView12, EditText editText9, MyTextView myTextView13, EditText editText10, MyTextView myTextView14, d47 d47Var, EditText editText11, MyTextView myTextView15, TextView textView2, TextView textView3, Spinner spinner4, MyTextView myTextView16, EditText editText12, MyTextView myTextView17, EditText editText13, MyTextView myTextView18) {
        this.a = scrollView;
        this.b = spinner;
        this.c = myTextView;
        this.d = spinner2;
        this.e = myTextView2;
        this.f = editText;
        this.g = myTextView3;
        this.h = appCompatButton;
        this.i = editText2;
        this.j = myTextView4;
        this.k = editText3;
        this.l = myTextView5;
        this.m = spinner3;
        this.n = myTextView6;
        this.o = editText4;
        this.p = myTextView7;
        this.q = textView;
        this.r = myTextView8;
        this.s = editText5;
        this.t = myTextView9;
        this.u = editText6;
        this.v = myTextView10;
        this.w = editText7;
        this.x = myTextView11;
        this.y = imageView;
        this.z = imageView2;
        this.A = imageView3;
        this.B = imageView4;
        this.C = editText8;
        this.D = myTextView12;
        this.E = editText9;
        this.F = myTextView13;
        this.G = editText10;
        this.H = myTextView14;
        this.I = d47Var;
        this.J = editText11;
        this.K = myTextView15;
        this.L = textView2;
        this.M = textView3;
        this.N = spinner4;
        this.O = myTextView16;
        this.P = editText12;
        this.Q = myTextView17;
        this.R = editText13;
        this.S = myTextView18;
    }

    public static ch a(View view) {
        int i = R.id.ac_fitted_spinner;
        Spinner spinner = (Spinner) zp7.a(view, R.id.ac_fitted_spinner);
        if (spinner != null) {
            i = R.id.ac_fitted_txt;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.ac_fitted_txt);
            if (myTextView != null) {
                i = R.id.audio_fitted_spinner;
                Spinner spinner2 = (Spinner) zp7.a(view, R.id.audio_fitted_spinner);
                if (spinner2 != null) {
                    i = R.id.audio_fitted_txt;
                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.audio_fitted_txt);
                    if (myTextView2 != null) {
                        i = R.id.body_type;
                        EditText editText = (EditText) zp7.a(view, R.id.body_type);
                        if (editText != null) {
                            i = R.id.body_type_text;
                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.body_type_text);
                            if (myTextView3 != null) {
                                i = R.id.btnSubmit;
                                AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
                                if (appCompatButton != null) {
                                    i = R.id.color;
                                    EditText editText2 = (EditText) zp7.a(view, R.id.color);
                                    if (editText2 != null) {
                                        i = R.id.color_txt;
                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.color_txt);
                                        if (myTextView4 != null) {
                                            i = R.id.cubic_capacity;
                                            EditText editText3 = (EditText) zp7.a(view, R.id.cubic_capacity);
                                            if (editText3 != null) {
                                                i = R.id.cubic_capacity_txt;
                                                MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.cubic_capacity_txt);
                                                if (myTextView5 != null) {
                                                    i = R.id.fuel_spinner;
                                                    Spinner spinner3 = (Spinner) zp7.a(view, R.id.fuel_spinner);
                                                    if (spinner3 != null) {
                                                        i = R.id.fuel_txt;
                                                        MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.fuel_txt);
                                                        if (myTextView6 != null) {
                                                            i = R.id.height;
                                                            EditText editText4 = (EditText) zp7.a(view, R.id.height);
                                                            if (editText4 != null) {
                                                                i = R.id.height_txt;
                                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.height_txt);
                                                                if (myTextView7 != null) {
                                                                    i = R.id.horse_power;
                                                                    TextView textView = (TextView) zp7.a(view, R.id.horse_power);
                                                                    if (textView != null) {
                                                                        i = R.id.horse_power_txt;
                                                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.horse_power_txt);
                                                                        if (myTextView8 != null) {
                                                                            i = R.id.laden_weight;
                                                                            EditText editText5 = (EditText) zp7.a(view, R.id.laden_weight);
                                                                            if (editText5 != null) {
                                                                                i = R.id.laden_weight_txt;
                                                                                MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.laden_weight_txt);
                                                                                if (myTextView9 != null) {
                                                                                    i = R.id.length;
                                                                                    EditText editText6 = (EditText) zp7.a(view, R.id.length);
                                                                                    if (editText6 != null) {
                                                                                        i = R.id.length_txt;
                                                                                        MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.length_txt);
                                                                                        if (myTextView10 != null) {
                                                                                            i = R.id.no_of_cylinders;
                                                                                            EditText editText7 = (EditText) zp7.a(view, R.id.no_of_cylinders);
                                                                                            if (editText7 != null) {
                                                                                                i = R.id.no_of_cylinders_txt;
                                                                                                MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.no_of_cylinders_txt);
                                                                                                if (myTextView11 != null) {
                                                                                                    i = R.id.rightAcFittedPin;
                                                                                                    ImageView imageView = (ImageView) zp7.a(view, R.id.rightAcFittedPin);
                                                                                                    if (imageView != null) {
                                                                                                        i = R.id.rightAudioFittedPin;
                                                                                                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.rightAudioFittedPin);
                                                                                                        if (imageView2 != null) {
                                                                                                            i = R.id.rightFuelPin;
                                                                                                            ImageView imageView3 = (ImageView) zp7.a(view, R.id.rightFuelPin);
                                                                                                            if (imageView3 != null) {
                                                                                                                i = R.id.rightVideoFittedPin;
                                                                                                                ImageView imageView4 = (ImageView) zp7.a(view, R.id.rightVideoFittedPin);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i = R.id.seating_capacity;
                                                                                                                    EditText editText8 = (EditText) zp7.a(view, R.id.seating_capacity);
                                                                                                                    if (editText8 != null) {
                                                                                                                        i = R.id.seating_capacity_txt;
                                                                                                                        MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.seating_capacity_txt);
                                                                                                                        if (myTextView12 != null) {
                                                                                                                            i = R.id.sleeper_capacity;
                                                                                                                            EditText editText9 = (EditText) zp7.a(view, R.id.sleeper_capacity);
                                                                                                                            if (editText9 != null) {
                                                                                                                                i = R.id.sleeper_capacity_txt;
                                                                                                                                MyTextView myTextView13 = (MyTextView) zp7.a(view, R.id.sleeper_capacity_txt);
                                                                                                                                if (myTextView13 != null) {
                                                                                                                                    i = R.id.standing_capacity;
                                                                                                                                    EditText editText10 = (EditText) zp7.a(view, R.id.standing_capacity);
                                                                                                                                    if (editText10 != null) {
                                                                                                                                        i = R.id.standing_capacity_txt;
                                                                                                                                        MyTextView myTextView14 = (MyTextView) zp7.a(view, R.id.standing_capacity_txt);
                                                                                                                                        if (myTextView14 != null) {
                                                                                                                                            i = R.id.topHolder;
                                                                                                                                            View viewA = zp7.a(view, R.id.topHolder);
                                                                                                                                            if (viewA != null) {
                                                                                                                                                d47 d47VarA = d47.a(viewA);
                                                                                                                                                i = R.id.unladen_weight;
                                                                                                                                                EditText editText11 = (EditText) zp7.a(view, R.id.unladen_weight);
                                                                                                                                                if (editText11 != null) {
                                                                                                                                                    i = R.id.unladen_weight_txt;
                                                                                                                                                    MyTextView myTextView15 = (MyTextView) zp7.a(view, R.id.unladen_weight_txt);
                                                                                                                                                    if (myTextView15 != null) {
                                                                                                                                                        i = R.id.vehicleNumberTv;
                                                                                                                                                        TextView textView2 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                                        if (textView2 != null) {
                                                                                                                                                            i = R.id.vehicle_view;
                                                                                                                                                            TextView textView3 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                                            if (textView3 != null) {
                                                                                                                                                                i = R.id.video_fitted_spinner;
                                                                                                                                                                Spinner spinner4 = (Spinner) zp7.a(view, R.id.video_fitted_spinner);
                                                                                                                                                                if (spinner4 != null) {
                                                                                                                                                                    i = R.id.video_fitted_txt;
                                                                                                                                                                    MyTextView myTextView16 = (MyTextView) zp7.a(view, R.id.video_fitted_txt);
                                                                                                                                                                    if (myTextView16 != null) {
                                                                                                                                                                        i = R.id.wheelbase;
                                                                                                                                                                        EditText editText12 = (EditText) zp7.a(view, R.id.wheelbase);
                                                                                                                                                                        if (editText12 != null) {
                                                                                                                                                                            i = R.id.wheelbase_txt;
                                                                                                                                                                            MyTextView myTextView17 = (MyTextView) zp7.a(view, R.id.wheelbase_txt);
                                                                                                                                                                            if (myTextView17 != null) {
                                                                                                                                                                                i = R.id.width;
                                                                                                                                                                                EditText editText13 = (EditText) zp7.a(view, R.id.width);
                                                                                                                                                                                if (editText13 != null) {
                                                                                                                                                                                    i = R.id.width_txt;
                                                                                                                                                                                    MyTextView myTextView18 = (MyTextView) zp7.a(view, R.id.width_txt);
                                                                                                                                                                                    if (myTextView18 != null) {
                                                                                                                                                                                        return new ch((ScrollView) view, spinner, myTextView, spinner2, myTextView2, editText, myTextView3, appCompatButton, editText2, myTextView4, editText3, myTextView5, spinner3, myTextView6, editText4, myTextView7, textView, myTextView8, editText5, myTextView9, editText6, myTextView10, editText7, myTextView11, imageView, imageView2, imageView3, imageView4, editText8, myTextView12, editText9, myTextView13, editText10, myTextView14, d47VarA, editText11, myTextView15, textView2, textView3, spinner4, myTextView16, editText12, myTextView17, editText13, myTextView18);
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

    public static ch c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ch d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vahan_alteration_of_vehicle, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
