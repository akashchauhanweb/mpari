package com.zepto;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zo1 {
    public final LinearLayout a;
    public final MyTextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final MyTextView e;
    public final HorizontalScrollView f;
    public final MyTextView g;

    public zo1(LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, HorizontalScrollView horizontalScrollView, MyTextView myTextView5) {
        this.a = linearLayout;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = myTextView3;
        this.e = myTextView4;
        this.f = horizontalScrollView;
        this.g = myTextView5;
    }

    public static zo1 a(View view) {
        int i = R.id.app_booking;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.app_booking);
        if (myTextView != null) {
            i = R.id.dl_det;
            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.dl_det);
            if (myTextView2 != null) {
                i = R.id.dms_upload_doc;
                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.dms_upload_doc);
                if (myTextView3 != null) {
                    i = R.id.fee_details;
                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.fee_details);
                    if (myTextView4 != null) {
                        i = R.id.horizontalScrollView;
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) zp7.a(view, R.id.horizontalScrollView);
                        if (horizontalScrollView != null) {
                            i = R.id.upload_photo_signature;
                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.upload_photo_signature);
                            if (myTextView5 != null) {
                                return new zo1((LinearLayout) view, myTextView, myTextView2, myTextView3, myTextView4, horizontalScrollView, myTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
