package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oe {
    public final RelativeLayout a;
    public final LinearLayout b;
    public final vy3 c;

    public oe(RelativeLayout relativeLayout, LinearLayout linearLayout, vy3 vy3Var) {
        this.a = relativeLayout;
        this.b = linearLayout;
        this.c = vy3Var;
    }

    public static oe a(View view) {
        int i = R.id.id_dupdl_summit;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.id_dupdl_summit);
        if (linearLayout != null) {
            i = R.id.mHeader;
            View viewA = zp7.a(view, R.id.mHeader);
            if (viewA != null) {
                return new oe((RelativeLayout) view, linearLayout, vy3.a(viewA));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static oe c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static oe d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_payment_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
