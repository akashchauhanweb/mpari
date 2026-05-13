package com.zepto;

import android.view.View;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class my2 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final MyTextView c;
    public final LinearLayout d;
    public final MyTextView e;
    public final LinearLayout f;
    public final MyTextView g;
    public final MyTextView h;

    public my2(LinearLayout linearLayout, LinearLayout linearLayout2, MyTextView myTextView, LinearLayout linearLayout3, MyTextView myTextView2, LinearLayout linearLayout4, MyTextView myTextView3, MyTextView myTextView4) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = myTextView;
        this.d = linearLayout3;
        this.e = myTextView2;
        this.f = linearLayout4;
        this.g = myTextView3;
        this.h = myTextView4;
    }

    public static my2 a(View view) {
        int i = R.id.app_ment;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.app_ment);
        if (linearLayout != null) {
            i = R.id.dms;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.dms);
            if (myTextView != null) {
                i = R.id.dmsLL;
                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.dmsLL);
                if (linearLayout2 != null) {
                    i = R.id.feeDetails;
                    MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.feeDetails);
                    if (myTextView2 != null) {
                        i = R.id.parent_layout;
                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.parent_layout);
                        if (linearLayout3 != null) {
                            i = R.id.slotbooking;
                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.slotbooking);
                            if (myTextView3 != null) {
                                i = R.id.vehicledetails;
                                MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vehicledetails);
                                if (myTextView4 != null) {
                                    return new my2((LinearLayout) view, linearLayout, myTextView, linearLayout2, myTextView2, linearLayout3, myTextView3, myTextView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
