package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class te {
    public final LinearLayout a;
    public final RecyclerView b;
    public final d47 c;
    public final AppCompatTextView d;

    public te(LinearLayout linearLayout, RecyclerView recyclerView, d47 d47Var, AppCompatTextView appCompatTextView) {
        this.a = linearLayout;
        this.b = recyclerView;
        this.c = d47Var;
        this.d = appCompatTextView;
    }

    public static te a(View view) {
        int i = R.id.pendingTransactionRv;
        RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.pendingTransactionRv);
        if (recyclerView != null) {
            i = R.id.topHolder;
            View viewA = zp7.a(view, R.id.topHolder);
            if (viewA != null) {
                d47 d47VarA = d47.a(viewA);
                AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                if (appCompatTextView != null) {
                    return new te((LinearLayout) view, recyclerView, d47VarA, appCompatTextView);
                }
                i = R.id.topTitleTv;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static te c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static te d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pending_transaction_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
