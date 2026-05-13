package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tf2 {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final LinearLayout d;
    public final RecyclerView e;

    public tf2(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = linearLayout2;
        this.e = recyclerView;
    }

    public static tf2 a(View view) {
        int i = R.id.ev_end_date;
        TextView textView = (TextView) zp7.a(view, R.id.ev_end_date);
        if (textView != null) {
            i = R.id.ev_start_date;
            TextView textView2 = (TextView) zp7.a(view, R.id.ev_start_date);
            if (textView2 != null) {
                i = R.id.image_search;
                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.image_search);
                if (linearLayout != null) {
                    i = R.id.lv_acc_list;
                    RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.lv_acc_list);
                    if (recyclerView != null) {
                        return new tf2((LinearLayout) view, textView, textView2, linearLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static tf2 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_accident_report_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
