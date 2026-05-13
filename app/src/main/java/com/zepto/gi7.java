package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gi7 {
    public final AppCompatTextView A;
    public final TextView B;
    public final AppCompatTextView C;
    public final TextView D;
    public final TextView E;
    public final ScrollView a;
    public final EditText b;
    public final AppCompatTextView c;
    public final TextView d;
    public final AppCompatTextView e;
    public final EditText f;
    public final AppCompatTextView g;
    public final EditText h;
    public final AppCompatTextView i;
    public final vy3 j;
    public final Spinner k;
    public final AppCompatTextView l;
    public final EditText m;
    public final AppCompatTextView n;
    public final TextView o;
    public final Spinner p;
    public final AppCompatTextView q;
    public final EditText r;
    public final AppCompatTextView s;
    public final Spinner t;
    public final AppCompatTextView u;
    public final TextView v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final EditText z;

    public gi7(ScrollView scrollView, EditText editText, AppCompatTextView appCompatTextView, TextView textView, AppCompatTextView appCompatTextView2, EditText editText2, AppCompatTextView appCompatTextView3, EditText editText3, AppCompatTextView appCompatTextView4, vy3 vy3Var, Spinner spinner, AppCompatTextView appCompatTextView5, EditText editText4, AppCompatTextView appCompatTextView6, TextView textView2, Spinner spinner2, AppCompatTextView appCompatTextView7, EditText editText5, AppCompatTextView appCompatTextView8, Spinner spinner3, AppCompatTextView appCompatTextView9, TextView textView3, ImageView imageView, ImageView imageView2, ImageView imageView3, EditText editText6, AppCompatTextView appCompatTextView10, TextView textView4, AppCompatTextView appCompatTextView11, TextView textView5, TextView textView6) {
        this.a = scrollView;
        this.b = editText;
        this.c = appCompatTextView;
        this.d = textView;
        this.e = appCompatTextView2;
        this.f = editText2;
        this.g = appCompatTextView3;
        this.h = editText3;
        this.i = appCompatTextView4;
        this.j = vy3Var;
        this.k = spinner;
        this.l = appCompatTextView5;
        this.m = editText4;
        this.n = appCompatTextView6;
        this.o = textView2;
        this.p = spinner2;
        this.q = appCompatTextView7;
        this.r = editText5;
        this.s = appCompatTextView8;
        this.t = spinner3;
        this.u = appCompatTextView9;
        this.v = textView3;
        this.w = imageView;
        this.x = imageView2;
        this.y = imageView3;
        this.z = editText6;
        this.A = appCompatTextView10;
        this.B = textView4;
        this.C = appCompatTextView11;
        this.D = textView5;
        this.E = textView6;
    }

    public static gi7 a(View view) {
        int i = R.id.email_id;
        EditText editText = (EditText) zp7.a(view, R.id.email_id);
        if (editText != null) {
            i = R.id.email_id_txt;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.email_id_txt);
            if (appCompatTextView != null) {
                i = R.id.enter_new_owner;
                TextView textView = (TextView) zp7.a(view, R.id.enter_new_owner);
                if (textView != null) {
                    i = R.id.enter_new_owner_txt;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.enter_new_owner_txt);
                    if (appCompatTextView2 != null) {
                        i = R.id.father_husband_name;
                        EditText editText2 = (EditText) zp7.a(view, R.id.father_husband_name);
                        if (editText2 != null) {
                            i = R.id.father_husband_name_txt;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.father_husband_name_txt);
                            if (appCompatTextView3 != null) {
                                i = R.id.mobile_number;
                                EditText editText3 = (EditText) zp7.a(view, R.id.mobile_number);
                                if (editText3 != null) {
                                    i = R.id.mobile_number_txt;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) zp7.a(view, R.id.mobile_number_txt);
                                    if (appCompatTextView4 != null) {
                                        i = R.id.mvvHeader;
                                        View viewA = zp7.a(view, R.id.mvvHeader);
                                        if (viewA != null) {
                                            vy3 vy3VarA = vy3.a(viewA);
                                            i = R.id.new_owner_category;
                                            Spinner spinner = (Spinner) zp7.a(view, R.id.new_owner_category);
                                            if (spinner != null) {
                                                i = R.id.new_owner_category_txt;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) zp7.a(view, R.id.new_owner_category_txt);
                                                if (appCompatTextView5 != null) {
                                                    i = R.id.new_owner_name;
                                                    EditText editText4 = (EditText) zp7.a(view, R.id.new_owner_name);
                                                    if (editText4 != null) {
                                                        i = R.id.new_owner_name_txt;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) zp7.a(view, R.id.new_owner_name_txt);
                                                        if (appCompatTextView6 != null) {
                                                            i = R.id.nextPage;
                                                            TextView textView2 = (TextView) zp7.a(view, R.id.nextPage);
                                                            if (textView2 != null) {
                                                                i = R.id.ownership_type;
                                                                Spinner spinner2 = (Spinner) zp7.a(view, R.id.ownership_type);
                                                                if (spinner2 != null) {
                                                                    i = R.id.ownership_type_txt;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) zp7.a(view, R.id.ownership_type_txt);
                                                                    if (appCompatTextView7 != null) {
                                                                        i = R.id.pan_number;
                                                                        EditText editText5 = (EditText) zp7.a(view, R.id.pan_number);
                                                                        if (editText5 != null) {
                                                                            i = R.id.pan_number_txt;
                                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) zp7.a(view, R.id.pan_number_txt);
                                                                            if (appCompatTextView8 != null) {
                                                                                i = R.id.purpose;
                                                                                Spinner spinner3 = (Spinner) zp7.a(view, R.id.purpose);
                                                                                if (spinner3 != null) {
                                                                                    i = R.id.purpose_txt;
                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) zp7.a(view, R.id.purpose_txt);
                                                                                    if (appCompatTextView9 != null) {
                                                                                        i = R.id.resetPage;
                                                                                        TextView textView3 = (TextView) zp7.a(view, R.id.resetPage);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.rightLabelPin;
                                                                                            ImageView imageView = (ImageView) zp7.a(view, R.id.rightLabelPin);
                                                                                            if (imageView != null) {
                                                                                                i = R.id.rightcategoryPin;
                                                                                                ImageView imageView2 = (ImageView) zp7.a(view, R.id.rightcategoryPin);
                                                                                                if (imageView2 != null) {
                                                                                                    i = R.id.rightownershipPin;
                                                                                                    ImageView imageView3 = (ImageView) zp7.a(view, R.id.rightownershipPin);
                                                                                                    if (imageView3 != null) {
                                                                                                        i = R.id.sale_amount;
                                                                                                        EditText editText6 = (EditText) zp7.a(view, R.id.sale_amount);
                                                                                                        if (editText6 != null) {
                                                                                                            i = R.id.sale_amount_txt;
                                                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) zp7.a(view, R.id.sale_amount_txt);
                                                                                                            if (appCompatTextView10 != null) {
                                                                                                                i = R.id.sale_date;
                                                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.sale_date);
                                                                                                                if (textView4 != null) {
                                                                                                                    i = R.id.sale_date_txt;
                                                                                                                    AppCompatTextView appCompatTextView11 = (AppCompatTextView) zp7.a(view, R.id.sale_date_txt);
                                                                                                                    if (appCompatTextView11 != null) {
                                                                                                                        i = R.id.vehicleNumberTv;
                                                                                                                        TextView textView5 = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i = R.id.vehicle_view;
                                                                                                                            TextView textView6 = (TextView) zp7.a(view, R.id.vehicle_view);
                                                                                                                            if (textView6 != null) {
                                                                                                                                return new gi7((ScrollView) view, editText, appCompatTextView, textView, appCompatTextView2, editText2, appCompatTextView3, editText3, appCompatTextView4, vy3VarA, spinner, appCompatTextView5, editText4, appCompatTextView6, textView2, spinner2, appCompatTextView7, editText5, appCompatTextView8, spinner3, appCompatTextView9, textView3, imageView, imageView2, imageView3, editText6, appCompatTextView10, textView4, appCompatTextView11, textView5, textView6);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static gi7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static gi7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_transfer_ownership, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
