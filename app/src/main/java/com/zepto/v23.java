package com.zepto;

import android.view.View;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class v23 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final MyTextView c;
    public final MyTextView d;
    public final LinearLayout e;
    public final MyTextView f;
    public final MyTextView g;

    public v23(LinearLayout linearLayout, LinearLayout linearLayout2, MyTextView myTextView, MyTextView myTextView2, LinearLayout linearLayout3, MyTextView myTextView3, MyTextView myTextView4) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = myTextView;
        this.d = myTextView2;
        this.e = linearLayout3;
        this.f = myTextView3;
        this.g = myTextView4;
    }

    public static v23 a(View view) {
        int i = R.id.app_ment;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.app_ment);
        if (linearLayout != null) {
            i = R.id.dms;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.dms);
            if (myTextView != null) {
                i = R.id.feeDetails;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.feeDetails);
                if (myTextView2 != null) {
                    i = R.id.parent_layout;
                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.parent_layout);
                    if (linearLayout2 != null) {
                        i = R.id.slotbooking;
                        MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.slotbooking);
                        if (myTextView3 != null) {
                            i = R.id.vehicledetails;
                            MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.vehicledetails);
                            if (myTextView4 != null) {
                                return new v23((LinearLayout) view, linearLayout, myTextView, myTextView2, linearLayout2, myTextView3, myTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
