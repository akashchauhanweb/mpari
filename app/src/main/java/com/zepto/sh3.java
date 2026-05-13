package com.zepto;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sh3 {
    public final LinearLayout a;
    public final MyTextView b;
    public final MyTextView c;
    public final MyTextView d;
    public final HorizontalScrollView e;
    public final MyTextView f;
    public final MyTextView g;

    public sh3(LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, HorizontalScrollView horizontalScrollView, MyTextView myTextView4, MyTextView myTextView5) {
        this.a = linearLayout;
        this.b = myTextView;
        this.c = myTextView2;
        this.d = myTextView3;
        this.e = horizontalScrollView;
        this.f = myTextView4;
        this.g = myTextView5;
    }

    public static sh3 a(View view) {
        int i = R.id.dl_det;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.dl_det);
        if (myTextView != null) {
            i = R.id.dms_upload_doc;
            MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.dms_upload_doc);
            if (myTextView2 != null) {
                i = R.id.feeDetails;
                MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.feeDetails);
                if (myTextView3 != null) {
                    i = R.id.horizontalScrollView;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) zp7.a(view, R.id.horizontalScrollView);
                    if (horizontalScrollView != null) {
                        i = R.id.textApp;
                        MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.textApp);
                        if (myTextView4 != null) {
                            i = R.id.upload_photo_signature;
                            MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.upload_photo_signature);
                            if (myTextView5 != null) {
                                return new sh3((LinearLayout) view, myTextView, myTextView2, myTextView3, horizontalScrollView, myTextView4, myTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
