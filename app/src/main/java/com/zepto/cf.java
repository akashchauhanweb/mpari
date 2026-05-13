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
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class cf {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final Spinner F;
    public final MyTextView G;
    public final LinearLayout H;
    public final d47 I;
    public final TextView J;
    public final TextView K;
    public final Spinner L;
    public final MyTextView M;
    public final ScrollView a;
    public final MyTextView b;
    public final Spinner c;
    public final EditText d;
    public final Spinner e;
    public final MyTextView f;
    public final CustomWegetLayout g;
    public final Spinner h;
    public final MyTextView i;
    public final MyTextView j;
    public final TextView k;
    public final MyTextView l;
    public final MyTextView m;
    public final Spinner n;
    public final EditText o;
    public final MyTextView p;
    public final MyTextView q;
    public final Spinner r;
    public final EditText s;
    public final MyTextView t;
    public final EditText u;
    public final MyTextView v;
    public final LinearLayout w;
    public final CustomWegetLayout x;
    public final ImageView y;
    public final ImageView z;

    public cf(ScrollView scrollView, MyTextView myTextView, Spinner spinner, EditText editText, Spinner spinner2, MyTextView myTextView2, CustomWegetLayout customWegetLayout, Spinner spinner3, MyTextView myTextView3, MyTextView myTextView4, TextView textView, MyTextView myTextView5, MyTextView myTextView6, Spinner spinner4, EditText editText2, MyTextView myTextView7, MyTextView myTextView8, Spinner spinner5, EditText editText3, MyTextView myTextView9, EditText editText4, MyTextView myTextView10, LinearLayout linearLayout, CustomWegetLayout customWegetLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, Spinner spinner6, MyTextView myTextView11, LinearLayout linearLayout2, d47 d47Var, TextView textView2, TextView textView3, Spinner spinner7, MyTextView myTextView12) {
        this.a = scrollView;
        this.b = myTextView;
        this.c = spinner;
        this.d = editText;
        this.e = spinner2;
        this.f = myTextView2;
        this.g = customWegetLayout;
        this.h = spinner3;
        this.i = myTextView3;
        this.j = myTextView4;
        this.k = textView;
        this.l = myTextView5;
        this.m = myTextView6;
        this.n = spinner4;
        this.o = editText2;
        this.p = myTextView7;
        this.q = myTextView8;
        this.r = spinner5;
        this.s = editText3;
        this.t = myTextView9;
        this.u = editText4;
        this.v = myTextView10;
        this.w = linearLayout;
        this.x = customWegetLayout2;
        this.y = imageView;
        this.z = imageView2;
        this.A = imageView3;
        this.B = imageView4;
        this.C = imageView5;
        this.D = imageView6;
        this.E = imageView7;
        this.F = spinner6;
        this.G = myTextView11;
        this.H = linearLayout2;
        this.I = d47Var;
        this.J = textView2;
        this.K = textView3;
        this.L = spinner7;
        this.M = myTextView12;
    }

    public static cf a(View view) {
        int i = R.id.allotment_office_txt;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.allotment_office_txt);
        if (myTextView != null) {
            i = R.id.allotment_office_txt_spinner;
            Spinner spinner = (Spinner) zp7.a(view, R.id.allotment_office_txt_spinner);
            if (spinner != null) {
                i = R.id.good_detail;
                EditText editText = (EditText) zp7.a(view, R.id.good_detail);
                if (editText != null) {
                    i = R.id.goods_spinner;
                    Spinner spinner2 = (Spinner) zp7.a(view, R.id.goods_spinner);
                    if (spinner2 != null) {
                        i = R.id.goods_txt;
                        MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.goods_txt);
                        if (myTextView2 != null) {
                            i = R.id.id_next_service;
                            CustomWegetLayout customWegetLayout = (CustomWegetLayout) zp7.a(view, R.id.id_next_service);
                            if (customWegetLayout != null) {
                                i = R.id.nature_good_spinner;
                                Spinner spinner3 = (Spinner) zp7.a(view, R.id.nature_good_spinner);
                                if (spinner3 != null) {
                                    i = R.id.nature_good_txt;
                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.nature_good_txt);
                                    if (myTextView3 != null) {
                                        i = R.id.optional_details;
                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.optional_details);
                                        if (myTextView4 != null) {
                                            i = R.id.period_enter;
                                            TextView textView = (TextView) zp7.a(view, R.id.period_enter);
                                            if (textView != null) {
                                                i = R.id.period_txt;
                                                MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.period_txt);
                                                if (myTextView5 != null) {
                                                    i = R.id.permit_category;
                                                    MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.permit_category);
                                                    if (myTextView6 != null) {
                                                        i = R.id.permit_category_spinner;
                                                        Spinner spinner4 = (Spinner) zp7.a(view, R.id.permit_category_spinner);
                                                        if (spinner4 != null) {
                                                            i = R.id.permit_no;
                                                            EditText editText2 = (EditText) zp7.a(view, R.id.permit_no);
                                                            if (editText2 != null) {
                                                                i = R.id.permit_no_txt;
                                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.permit_no_txt);
                                                                if (myTextView7 != null) {
                                                                    i = R.id.permit_type;
                                                                    MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.permit_type);
                                                                    if (myTextView8 != null) {
                                                                        i = R.id.permit_type_spinner;
                                                                        Spinner spinner5 = (Spinner) zp7.a(view, R.id.permit_type_spinner);
                                                                        if (spinner5 != null) {
                                                                            i = R.id.permit_valid_from;
                                                                            EditText editText3 = (EditText) zp7.a(view, R.id.permit_valid_from);
                                                                            if (editText3 != null) {
                                                                                i = R.id.permit_valid_from_txt;
                                                                                MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.permit_valid_from_txt);
                                                                                if (myTextView9 != null) {
                                                                                    i = R.id.permit_valid_upto;
                                                                                    EditText editText4 = (EditText) zp7.a(view, R.id.permit_valid_upto);
                                                                                    if (editText4 != null) {
                                                                                        i = R.id.permit_valid_upto_txt;
                                                                                        MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.permit_valid_upto_txt);
                                                                                        if (myTextView10 != null) {
                                                                                            i = R.id.police_fir_layout;
                                                                                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.police_fir_layout);
                                                                                            if (linearLayout != null) {
                                                                                                i = R.id.reset;
                                                                                                CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) zp7.a(view, R.id.reset);
                                                                                                if (customWegetLayout2 != null) {
                                                                                                    i = R.id.rightGoodsPin;
                                                                                                    ImageView imageView = (ImageView) zp7.a(view, R.id.rightGoodsPin);
                                                                                                    if (imageView != null) {
                                                                                                        i = R.id.rightNatureGoodPin;
                                                                                                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.rightNatureGoodPin);
                                                                                                        if (imageView2 != null) {
                                                                                                            i = R.id.rightServicesTypePin;
                                                                                                            ImageView imageView3 = (ImageView) zp7.a(view, R.id.rightServicesTypePin);
                                                                                                            if (imageView3 != null) {
                                                                                                                i = R.id.rightYearlyModePin;
                                                                                                                ImageView imageView4 = (ImageView) zp7.a(view, R.id.rightYearlyModePin);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i = R.id.rightofficePin;
                                                                                                                    ImageView imageView5 = (ImageView) zp7.a(view, R.id.rightofficePin);
                                                                                                                    if (imageView5 != null) {
                                                                                                                        i = R.id.rightpermitCategoryPin;
                                                                                                                        ImageView imageView6 = (ImageView) zp7.a(view, R.id.rightpermitCategoryPin);
                                                                                                                        if (imageView6 != null) {
                                                                                                                            i = R.id.rightpermitTypePin;
                                                                                                                            ImageView imageView7 = (ImageView) zp7.a(view, R.id.rightpermitTypePin);
                                                                                                                            if (imageView7 != null) {
                                                                                                                                i = R.id.services_type_spinner;
                                                                                                                                Spinner spinner6 = (Spinner) zp7.a(view, R.id.services_type_spinner);
                                                                                                                                if (spinner6 != null) {
                                                                                                                                    i = R.id.services_type_txt;
                                                                                                                                    MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.services_type_txt);
                                                                                                                                    if (myTextView11 != null) {
                                                                                                                                        i = R.id.text_exemption;
                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.text_exemption);
                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                            i = R.id.topHolder;
                                                                                                                                            View viewA = zp7.a(view, R.id.topHolder);
                                                                                                                                            if (viewA != null) {
                                                                                                                                                d47 d47VarA = d47.a(viewA);
                                                                                                                                                i = R.id.vehicleNumberTv;
                                                                                                                                                TextView textView2 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    i = R.id.vehicle_view;
                                                                                                                                                    TextView textView3 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                        i = R.id.yearly_mode_Spinner;
                                                                                                                                                        Spinner spinner7 = (Spinner) zp7.a(view, R.id.yearly_mode_Spinner);
                                                                                                                                                        if (spinner7 != null) {
                                                                                                                                                            i = R.id.yearly_mode_txt;
                                                                                                                                                            MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.yearly_mode_txt);
                                                                                                                                                            if (myTextView12 != null) {
                                                                                                                                                                return new cf((ScrollView) view, myTextView, spinner, editText, spinner2, myTextView2, customWegetLayout, spinner3, myTextView3, myTextView4, textView, myTextView5, myTextView6, spinner4, editText2, myTextView7, myTextView8, spinner5, editText3, myTextView9, editText4, myTextView10, linearLayout, customWegetLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, spinner6, myTextView11, linearLayout2, d47VarA, textView2, textView3, spinner7, myTextView12);
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

    public static cf c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static cf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_renewal_of_permit_main_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
