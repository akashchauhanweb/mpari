package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class th {
    public final RelativeLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final vy3 d;
    public final RelativeLayout e;
    public final RelativeLayout f;

    public th(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, vy3 vy3Var, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3) {
        this.a = relativeLayout;
        this.b = linearLayout;
        this.c = linearLayout2;
        this.d = vy3Var;
        this.e = relativeLayout2;
        this.f = relativeLayout3;
    }

    public static th a(View view) {
        int i = R.id.id_dupdl_summit;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.id_dupdl_summit);
        if (linearLayout != null) {
            i = R.id.id_search_transaction;
            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.id_search_transaction);
            if (linearLayout2 != null) {
                i = R.id.mHeader;
                View viewA = zp7.a(view, R.id.mHeader);
                if (viewA != null) {
                    vy3 vy3VarA = vy3.a(viewA);
                    i = R.id.replacementDlCancel;
                    RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.replacementDlCancel);
                    if (relativeLayout != null) {
                        i = R.id.replacementDlSubmit;
                        RelativeLayout relativeLayout2 = (RelativeLayout) zp7.a(view, R.id.replacementDlSubmit);
                        if (relativeLayout2 != null) {
                            return new th((RelativeLayout) view, linearLayout, linearLayout2, vy3VarA, relativeLayout, relativeLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static th c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static th d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_verify_pending_transaction_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
