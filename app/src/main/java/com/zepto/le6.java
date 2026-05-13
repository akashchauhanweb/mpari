package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class le6 {
    public final ImageView A;
    public final Spinner B;
    public final MyTextView C;
    public final d47 D;
    public final EditText E;
    public final MyTextView F;
    public final EditText G;
    public final MyTextView H;
    public final MyTextView I;
    public final MyTextView J;
    public final MyTextView K;
    public final MyTextView L;
    public final MyTextView M;
    public final MyTextView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final ScrollView a;
    public final Spinner b;
    public final TextView c;
    public final AppCompatButton d;
    public final TextView e;
    public final MyTextView f;
    public final ImageView g;
    public final MyTextView h;
    public final EditText i;
    public final ImageView j;
    public final Spinner k;
    public final LinearLayout l;
    public final Spinner m;
    public final MyTextView n;
    public final ImageView o;
    public final TextView p;
    public final Spinner q;
    public final Spinner r;
    public final ImageView s;
    public final LinearLayout t;
    public final MyTextView u;
    public final ImageView v;
    public final MyTextView w;
    public final EditText x;
    public final MyTextView y;
    public final EditText z;

    public le6(ScrollView scrollView, Spinner spinner, TextView textView, AppCompatButton appCompatButton, TextView textView2, MyTextView myTextView, ImageView imageView, MyTextView myTextView2, EditText editText, ImageView imageView2, Spinner spinner2, LinearLayout linearLayout, Spinner spinner3, MyTextView myTextView3, ImageView imageView3, TextView textView3, Spinner spinner4, Spinner spinner5, ImageView imageView4, LinearLayout linearLayout2, MyTextView myTextView4, ImageView imageView5, MyTextView myTextView5, EditText editText2, MyTextView myTextView6, EditText editText3, ImageView imageView6, Spinner spinner6, MyTextView myTextView7, d47 d47Var, EditText editText4, MyTextView myTextView8, EditText editText5, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14, MyTextView myTextView15, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.a = scrollView;
        this.b = spinner;
        this.c = textView;
        this.d = appCompatButton;
        this.e = textView2;
        this.f = myTextView;
        this.g = imageView;
        this.h = myTextView2;
        this.i = editText;
        this.j = imageView2;
        this.k = spinner2;
        this.l = linearLayout;
        this.m = spinner3;
        this.n = myTextView3;
        this.o = imageView3;
        this.p = textView3;
        this.q = spinner4;
        this.r = spinner5;
        this.s = imageView4;
        this.t = linearLayout2;
        this.u = myTextView4;
        this.v = imageView5;
        this.w = myTextView5;
        this.x = editText2;
        this.y = myTextView6;
        this.z = editText3;
        this.A = imageView6;
        this.B = spinner6;
        this.C = myTextView7;
        this.D = d47Var;
        this.E = editText4;
        this.F = myTextView8;
        this.G = editText5;
        this.H = myTextView9;
        this.I = myTextView10;
        this.J = myTextView11;
        this.K = myTextView12;
        this.L = myTextView13;
        this.M = myTextView14;
        this.N = myTextView15;
        this.O = textView4;
        this.P = textView5;
        this.Q = textView6;
        this.R = textView7;
    }

    public static le6 a(View view) {
        int i = R.id.Good_Spinner;
        Spinner spinner = (Spinner) zp7.a(view, R.id.Good_Spinner);
        if (spinner != null) {
            i = R.id.addPasander;
            TextView textView = (TextView) zp7.a(view, R.id.addPasander);
            if (textView != null) {
                i = R.id.btnSubmit;
                AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnSubmit);
                if (appCompatButton != null) {
                    i = R.id.firDateTv;
                    TextView textView2 = (TextView) zp7.a(view, R.id.firDateTv);
                    if (textView2 != null) {
                        i = R.id.goodDetailTxt;
                        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.goodDetailTxt);
                        if (myTextView != null) {
                            i = R.id.goodPin;
                            ImageView imageView = (ImageView) zp7.a(view, R.id.goodPin);
                            if (imageView != null) {
                                i = R.id.goodTxt;
                                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.goodTxt);
                                if (myTextView2 != null) {
                                    i = R.id.goodsdetails;
                                    EditText editText = (EditText) zp7.a(view, R.id.goodsdetails);
                                    if (editText != null) {
                                        i = R.id.journyPin;
                                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.journyPin);
                                        if (imageView2 != null) {
                                            i = R.id.journy_spinner;
                                            Spinner spinner2 = (Spinner) zp7.a(view, R.id.journy_spinner);
                                            if (spinner2 != null) {
                                                i = R.id.linear_validupto;
                                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.linear_validupto);
                                                if (linearLayout != null) {
                                                    i = R.id.naturGood_Spinner;
                                                    Spinner spinner3 = (Spinner) zp7.a(view, R.id.naturGood_Spinner);
                                                    if (spinner3 != null) {
                                                        i = R.id.natureOfGoodsTxt;
                                                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.natureOfGoodsTxt);
                                                        if (myTextView3 != null) {
                                                            i = R.id.naturePin;
                                                            ImageView imageView3 = (ImageView) zp7.a(view, R.id.naturePin);
                                                            if (imageView3 != null) {
                                                                i = R.id.office;
                                                                TextView textView3 = (TextView) zp7.a(view, R.id.office);
                                                                if (textView3 != null) {
                                                                    i = R.id.period;
                                                                    Spinner spinner4 = (Spinner) zp7.a(view, R.id.period);
                                                                    if (spinner4 != null) {
                                                                        i = R.id.periodmodespin;
                                                                        Spinner spinner5 = (Spinner) zp7.a(view, R.id.periodmodespin);
                                                                        if (spinner5 != null) {
                                                                            i = R.id.periodpin;
                                                                            ImageView imageView4 = (ImageView) zp7.a(view, R.id.periodpin);
                                                                            if (imageView4 != null) {
                                                                                i = R.id.police_fir_layout;
                                                                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.police_fir_layout);
                                                                                if (linearLayout2 != null) {
                                                                                    i = R.id.purposeOfJourneyTxt;
                                                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.purposeOfJourneyTxt);
                                                                                    if (myTextView4 != null) {
                                                                                        i = R.id.rightReasonPin;
                                                                                        ImageView imageView5 = (ImageView) zp7.a(view, R.id.rightReasonPin);
                                                                                        if (imageView5 != null) {
                                                                                            i = R.id.routeDescTxt;
                                                                                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.routeDescTxt);
                                                                                            if (myTextView5 != null) {
                                                                                                i = R.id.route_length;
                                                                                                EditText editText2 = (EditText) zp7.a(view, R.id.route_length);
                                                                                                if (editText2 != null) {
                                                                                                    i = R.id.routeLengthTxt;
                                                                                                    MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.routeLengthTxt);
                                                                                                    if (myTextView6 != null) {
                                                                                                        i = R.id.routedescription;
                                                                                                        EditText editText3 = (EditText) zp7.a(view, R.id.routedescription);
                                                                                                        if (editText3 != null) {
                                                                                                            i = R.id.servicePin;
                                                                                                            ImageView imageView6 = (ImageView) zp7.a(view, R.id.servicePin);
                                                                                                            if (imageView6 != null) {
                                                                                                                i = R.id.service_type;
                                                                                                                Spinner spinner6 = (Spinner) zp7.a(view, R.id.service_type);
                                                                                                                if (spinner6 != null) {
                                                                                                                    i = R.id.servicesTypeTxt;
                                                                                                                    MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.servicesTypeTxt);
                                                                                                                    if (myTextView7 != null) {
                                                                                                                        i = R.id.tempHeader;
                                                                                                                        View viewA = zp7.a(view, R.id.tempHeader);
                                                                                                                        if (viewA != null) {
                                                                                                                            d47 d47VarA = d47.a(viewA);
                                                                                                                            i = R.id.travelFrom;
                                                                                                                            EditText editText4 = (EditText) zp7.a(view, R.id.travelFrom);
                                                                                                                            if (editText4 != null) {
                                                                                                                                i = R.id.travelFromTxt;
                                                                                                                                MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.travelFromTxt);
                                                                                                                                if (myTextView8 != null) {
                                                                                                                                    i = R.id.travelUpto;
                                                                                                                                    EditText editText5 = (EditText) zp7.a(view, R.id.travelUpto);
                                                                                                                                    if (editText5 != null) {
                                                                                                                                        i = R.id.travelUptoTxt;
                                                                                                                                        MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.travelUptoTxt);
                                                                                                                                        if (myTextView9 != null) {
                                                                                                                                            i = R.id.vahan_details_duplicate_rc;
                                                                                                                                            MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.vahan_details_duplicate_rc);
                                                                                                                                            if (myTextView10 != null) {
                                                                                                                                                i = R.id.vahan_fir_date;
                                                                                                                                                MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.vahan_fir_date);
                                                                                                                                                if (myTextView11 != null) {
                                                                                                                                                    i = R.id.vahan_police_station;
                                                                                                                                                    MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.vahan_police_station);
                                                                                                                                                    if (myTextView12 != null) {
                                                                                                                                                        i = R.id.vahan_reason;
                                                                                                                                                        MyTextView myTextView13 = (MyTextView) zp7.a(view, R.id.vahan_reason);
                                                                                                                                                        if (myTextView13 != null) {
                                                                                                                                                            i = R.id.vahan_report_no;
                                                                                                                                                            MyTextView myTextView14 = (MyTextView) zp7.a(view, R.id.vahan_report_no);
                                                                                                                                                            if (myTextView14 != null) {
                                                                                                                                                                i = R.id.vahan_required_document;
                                                                                                                                                                MyTextView myTextView15 = (MyTextView) zp7.a(view, R.id.vahan_required_document);
                                                                                                                                                                if (myTextView15 != null) {
                                                                                                                                                                    i = R.id.validUpto;
                                                                                                                                                                    TextView textView4 = (TextView) zp7.a(view, R.id.validUpto);
                                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                                        i = R.id.vehicleNumberTv;
                                                                                                                                                                        TextView textView5 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                            i = R.id.vehicle_view;
                                                                                                                                                                            TextView textView6 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                i = R.id.viewPassanger;
                                                                                                                                                                                TextView textView7 = (TextView) zp7.a(view, R.id.viewPassanger);
                                                                                                                                                                                if (textView7 != null) {
                                                                                                                                                                                    return new le6((ScrollView) view, spinner, textView, appCompatButton, textView2, myTextView, imageView, myTextView2, editText, imageView2, spinner2, linearLayout, spinner3, myTextView3, imageView3, textView3, spinner4, spinner5, imageView4, linearLayout2, myTextView4, imageView5, myTextView5, editText2, myTextView6, editText3, imageView6, spinner6, myTextView7, d47VarA, editText4, myTextView8, editText5, myTextView9, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14, myTextView15, textView4, textView5, textView6, textView7);
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

    public static le6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static le6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.temporary_permit_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
