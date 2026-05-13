package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gg {
    public final RelativeLayout a;
    public final AppCompatButton b;
    public final AppCompatImageView c;
    public final vy3 d;
    public final MyTextView e;

    public gg(RelativeLayout relativeLayout, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, vy3 vy3Var, MyTextView myTextView) {
        this.a = relativeLayout;
        this.b = appCompatButton;
        this.c = appCompatImageView;
        this.d = vy3Var;
        this.e = myTextView;
    }

    public static gg a(View view) {
        int i = R.id.btnOkay;
        AppCompatButton appCompatButton = (AppCompatButton) zp7.a(view, R.id.btnOkay);
        if (appCompatButton != null) {
            i = R.id.imgWithdrawAccepted;
            AppCompatImageView appCompatImageView = (AppCompatImageView) zp7.a(view, R.id.imgWithdrawAccepted);
            if (appCompatImageView != null) {
                i = R.id.mHeader;
                View viewA = zp7.a(view, R.id.mHeader);
                if (viewA != null) {
                    vy3 vy3VarA = vy3.a(viewA);
                    i = R.id.txtServiceWithdrawnAccepted;
                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.txtServiceWithdrawnAccepted);
                    if (myTextView != null) {
                        return new gg((RelativeLayout) view, appCompatButton, appCompatImageView, vy3VarA, myTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static gg c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static gg d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_service_withdrawn_accepted, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
