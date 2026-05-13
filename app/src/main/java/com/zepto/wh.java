package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class wh {
    public final LinearLayout a;
    public final RecyclerView b;
    public final LinearLayout c;
    public final ri5 d;
    public final MyTextView e;
    public final ProgressBar f;

    public wh(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, ri5 ri5Var, MyTextView myTextView, ProgressBar progressBar) {
        this.a = linearLayout;
        this.b = recyclerView;
        this.c = linearLayout2;
        this.d = ri5Var;
        this.e = myTextView;
        this.f = progressBar;
    }

    public static wh a(View view) {
        int i = R.id.doc_list;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.doc_list);
        if (recyclerView != null) {
            i = R.id.elg_dl_services;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.elg_dl_services);
            if (linearLayout != null) {
                i = R.id.include3;
                View viewA = zp7.a(view, R.id.include3);
                if (viewA != null) {
                    ri5 ri5VarA = ri5.a(viewA);
                    i = R.id.myApplicationNo;
                    MyTextView myTextView = (MyTextView) zp7.a(view, R.id.myApplicationNo);
                    if (myTextView != null) {
                        i = R.id.pb_es;
                        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.pb_es);
                        if (progressBar != null) {
                            return new wh((LinearLayout) view, recyclerView, linearLayout, ri5VarA, myTextView, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static wh c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static wh d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_view_doc_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
