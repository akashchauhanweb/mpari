package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eb {
    public final NestedScrollView a;
    public final MyTextView b;
    public final RecyclerView c;
    public final NestedScrollView d;
    public final d47 e;
    public final TextView f;
    public final TextView g;

    public eb(NestedScrollView nestedScrollView, MyTextView myTextView, RecyclerView recyclerView, NestedScrollView nestedScrollView2, d47 d47Var, TextView textView, TextView textView2) {
        this.a = nestedScrollView;
        this.b = myTextView;
        this.c = recyclerView;
        this.d = nestedScrollView2;
        this.e = d47Var;
        this.f = textView;
        this.g = textView2;
    }

    public static eb a(View view) {
        int i = R.id.body_type_text;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.body_type_text);
        if (myTextView != null) {
            i = R.id.challanListRv;
            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.challanListRv);
            if (recyclerView != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i = R.id.topHolder;
                View viewA = zp7.a(view, R.id.topHolder);
                if (viewA != null) {
                    d47 d47VarA = d47.a(viewA);
                    i = R.id.vehicleNumberTv;
                    TextView textView = (TextView) zp7.a(view, R.id.vehicleNumberTv);
                    if (textView != null) {
                        i = R.id.vehicle_view;
                        TextView textView2 = (TextView) zp7.a(view, R.id.vehicle_view);
                        if (textView2 != null) {
                            return new eb(nestedScrollView, myTextView, recyclerView, nestedScrollView, d47VarA, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static eb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static eb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_download_checkpost_tax_receipt_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public NestedScrollView b() {
        return this.a;
    }
}
