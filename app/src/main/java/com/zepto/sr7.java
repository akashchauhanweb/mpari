package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sr7 {
    public final LinearLayout a;
    public final RecyclerView b;
    public final TextView c;
    public final d47 d;
    public final MyTextView e;

    public sr7(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, d47 d47Var, MyTextView myTextView) {
        this.a = linearLayout;
        this.b = recyclerView;
        this.c = textView;
        this.d = d47Var;
        this.e = myTextView;
    }

    public static sr7 a(View view) {
        int i = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            i = R.id.noChallanFoundTv;
            TextView textView = (TextView) zp7.a(view, R.id.noChallanFoundTv);
            if (textView != null) {
                i = R.id.topHolder;
                View viewA = zp7.a(view, R.id.topHolder);
                if (viewA != null) {
                    d47 d47VarA = d47.a(viewA);
                    i = R.id.tv_view_challan;
                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.tv_view_challan);
                    if (myTextView != null) {
                        return new sr7((LinearLayout) view, recyclerView, textView, d47VarA, myTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static sr7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static sr7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_rc_challan, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
