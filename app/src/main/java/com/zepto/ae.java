package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ae {
    public final TextView A;
    public final LinearLayout B;
    public final CoordinatorLayout a;
    public final ImageView b;
    public final TextView c;
    public final LinearLayout d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public final ImageView h;
    public final EditText i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final LinearLayout l;
    public final LinearLayout m;
    public final LinearLayout n;
    public final ProgressBar o;
    public final RecyclerView p;
    public final TextView q;
    public final ImageView r;
    public final MyTextView s;
    public final MyTextView t;
    public final MyTextView u;
    public final MyTextView v;
    public final MyTextView w;
    public final MyTextView x;
    public final TextView y;
    public final TextView z;

    public ae(CoordinatorLayout coordinatorLayout, ImageView imageView, TextView textView, LinearLayout linearLayout, EditText editText, EditText editText2, EditText editText3, ImageView imageView2, EditText editText4, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, ProgressBar progressBar, RecyclerView recyclerView, TextView textView2, ImageView imageView3, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout7) {
        this.a = coordinatorLayout;
        this.b = imageView;
        this.c = textView;
        this.d = linearLayout;
        this.e = editText;
        this.f = editText2;
        this.g = editText3;
        this.h = imageView2;
        this.i = editText4;
        this.j = linearLayout2;
        this.k = linearLayout3;
        this.l = linearLayout4;
        this.m = linearLayout5;
        this.n = linearLayout6;
        this.o = progressBar;
        this.p = recyclerView;
        this.q = textView2;
        this.r = imageView3;
        this.s = myTextView;
        this.t = myTextView2;
        this.u = myTextView3;
        this.v = myTextView4;
        this.w = myTextView5;
        this.x = myTextView6;
        this.y = textView3;
        this.z = textView4;
        this.A = textView5;
        this.B = linearLayout7;
    }

    public static ae a(View view) {
        int i = R.id.date_img;
        ImageView imageView = (ImageView) zp7.a(view, R.id.date_img);
        if (imageView != null) {
            i = R.id.date_textview;
            TextView textView = (TextView) zp7.a(view, R.id.date_textview);
            if (textView != null) {
                i = R.id.delet_icon;
                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.delet_icon);
                if (linearLayout != null) {
                    i = R.id.dobDateMain;
                    EditText editText = (EditText) zp7.a(view, R.id.dobDateMain);
                    if (editText != null) {
                        i = R.id.dobMonthMain;
                        EditText editText2 = (EditText) zp7.a(view, R.id.dobMonthMain);
                        if (editText2 != null) {
                            i = R.id.dobYearMain;
                            EditText editText3 = (EditText) zp7.a(view, R.id.dobYearMain);
                            if (editText3 != null) {
                                i = R.id.download_dl;
                                ImageView imageView2 = (ImageView) zp7.a(view, R.id.download_dl);
                                if (imageView2 != null) {
                                    i = R.id.et_search_dl;
                                    EditText editText4 = (EditText) zp7.a(view, R.id.et_search_dl);
                                    if (editText4 != null) {
                                        i = R.id.inner_parent;
                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.inner_parent);
                                        if (linearLayout2 != null) {
                                            i = R.id.linear_parent;
                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.linear_parent);
                                            if (linearLayout3 != null) {
                                                i = R.id.ll_search_dl;
                                                LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.ll_search_dl);
                                                if (linearLayout4 != null) {
                                                    i = R.id.nexgenarrow;
                                                    LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.nexgenlogo;
                                                        LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                                        if (linearLayout6 != null) {
                                                            i = R.id.progress_bar;
                                                            ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progress_bar);
                                                            if (progressBar != null) {
                                                                i = R.id.rc_new_design;
                                                                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rc_new_design);
                                                                if (recyclerView != null) {
                                                                    i = R.id.rc_number;
                                                                    TextView textView2 = (TextView) zp7.a(view, R.id.rc_number);
                                                                    if (textView2 != null) {
                                                                        i = R.id.refresh;
                                                                        ImageView imageView3 = (ImageView) zp7.a(view, R.id.refresh);
                                                                        if (imageView3 != null) {
                                                                            i = R.id.tv_add_dl;
                                                                            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.tv_add_dl);
                                                                            if (myTextView != null) {
                                                                                i = R.id.tv_alert_list;
                                                                                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.tv_alert_list);
                                                                                if (myTextView2 != null) {
                                                                                    i = R.id.tv_dl_no;
                                                                                    MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.tv_dl_no);
                                                                                    if (myTextView3 != null) {
                                                                                        i = R.id.tv_dob;
                                                                                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.tv_dob);
                                                                                        if (myTextView4 != null) {
                                                                                            i = R.id.tv_driv_lic;
                                                                                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.tv_driv_lic);
                                                                                            if (myTextView5 != null) {
                                                                                                i = R.id.tv_my_vehicle_list;
                                                                                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.tv_my_vehicle_list);
                                                                                                if (myTextView6 != null) {
                                                                                                    i = R.id.tv_vehicle_no;
                                                                                                    TextView textView3 = (TextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                                                    if (textView3 != null) {
                                                                                                        i = R.id.vahan_service_lable;
                                                                                                        TextView textView4 = (TextView) zp7.a(view, R.id.vahan_service_lable);
                                                                                                        if (textView4 != null) {
                                                                                                            i = R.id.viewdetails;
                                                                                                            TextView textView5 = (TextView) zp7.a(view, R.id.viewdetails);
                                                                                                            if (textView5 != null) {
                                                                                                                i = R.id.virtual_dl_view;
                                                                                                                LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.virtual_dl_view);
                                                                                                                if (linearLayout7 != null) {
                                                                                                                    return new ae((CoordinatorLayout) view, imageView, textView, linearLayout, editText, editText2, editText3, imageView2, editText4, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, progressBar, recyclerView, textView2, imageView3, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView3, textView4, textView5, linearLayout7);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static ae c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ae d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_new_dl_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
