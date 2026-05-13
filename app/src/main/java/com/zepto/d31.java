package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d31 {
    public final CoordinatorLayout a;
    public final RecyclerView b;
    public final LinearLayout c;
    public final EditText d;
    public final MyTextView e;
    public final EditText f;
    public final EditText g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final RecyclerView j;
    public final MyTextView k;
    public final MyTextView l;
    public final MyTextView m;
    public final MyTextView n;
    public final MyTextView o;
    public final MyTextView p;
    public final TextView q;
    public final LinearLayout r;

    public d31(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, LinearLayout linearLayout, EditText editText, MyTextView myTextView, EditText editText2, EditText editText3, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView2, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, TextView textView, LinearLayout linearLayout4) {
        this.a = coordinatorLayout;
        this.b = recyclerView;
        this.c = linearLayout;
        this.d = editText;
        this.e = myTextView;
        this.f = editText2;
        this.g = editText3;
        this.h = linearLayout2;
        this.i = linearLayout3;
        this.j = recyclerView2;
        this.k = myTextView2;
        this.l = myTextView3;
        this.m = myTextView4;
        this.n = myTextView5;
        this.o = myTextView6;
        this.p = myTextView7;
        this.q = textView;
        this.r = linearLayout4;
    }

    public static d31 a(View view) {
        int i = R.id.alerst_recycle_view;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.alerst_recycle_view);
        if (recyclerView != null) {
            i = R.id.alerts_layout;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.alerts_layout);
            if (linearLayout != null) {
                i = R.id.chassis_no_et;
                EditText editText = (EditText) zp7.a(view, R.id.chassis_no_et);
                if (editText != null) {
                    i = R.id.createvirtualrc;
                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.createvirtualrc);
                    if (myTextView != null) {
                        i = R.id.engin_no;
                        EditText editText2 = (EditText) zp7.a(view, R.id.engin_no);
                        if (editText2 != null) {
                            i = R.id.et_search_rc;
                            EditText editText3 = (EditText) zp7.a(view, R.id.et_search_rc);
                            if (editText3 != null) {
                                i = R.id.nexgenarrow;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                if (linearLayout2 != null) {
                                    i = R.id.nexgenlogo;
                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                    if (linearLayout3 != null) {
                                        i = R.id.rec_rc_recycler;
                                        RecyclerView recyclerView2 = (RecyclerView) zp7.a(view, R.id.rec_rc_recycler);
                                        if (recyclerView2 != null) {
                                            i = R.id.tv_alert_list;
                                            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.tv_alert_list);
                                            if (myTextView2 != null) {
                                                i = R.id.tv_chassi_no;
                                                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.tv_chassi_no);
                                                if (myTextView3 != null) {
                                                    i = R.id.tv_engin_no;
                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.tv_engin_no);
                                                    if (myTextView4 != null) {
                                                        i = R.id.tv_my_vehicle;
                                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.tv_my_vehicle);
                                                        if (myTextView5 != null) {
                                                            i = R.id.tv_my_vehicle_list;
                                                            MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.tv_my_vehicle_list);
                                                            if (myTextView6 != null) {
                                                                i = R.id.tv_vehicle_no;
                                                                MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.tv_vehicle_no);
                                                                if (myTextView7 != null) {
                                                                    i = R.id.vahan_service_lable;
                                                                    TextView textView = (TextView) zp7.a(view, R.id.vahan_service_lable);
                                                                    if (textView != null) {
                                                                        i = R.id.virtualrc_layout;
                                                                        LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.virtualrc_layout);
                                                                        if (linearLayout4 != null) {
                                                                            return new d31((CoordinatorLayout) view, recyclerView, linearLayout, editText, myTextView, editText2, editText3, linearLayout2, linearLayout3, recyclerView2, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, textView, linearLayout4);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static d31 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static d31 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.creater_rc_alerts, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
