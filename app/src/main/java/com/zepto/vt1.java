package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class vt1 {
    public final NestedScrollView a;
    public final AppCompatTextView b;
    public final RecyclerView c;
    public final NestedScrollView d;
    public final TextView e;
    public final d47 f;
    public final TextView g;

    public vt1(NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, NestedScrollView nestedScrollView2, TextView textView, d47 d47Var, TextView textView2) {
        this.a = nestedScrollView;
        this.b = appCompatTextView;
        this.c = recyclerView;
        this.d = nestedScrollView2;
        this.e = textView;
        this.f = d47Var;
        this.g = textView2;
    }

    public static vt1 a(View view) {
        int i = R.id.docTitle;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.docTitle);
        if (appCompatTextView != null) {
            i = R.id.recyclerview;
            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.recyclerview);
            if (recyclerView != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i = R.id.status_txt;
                TextView textView = (TextView) zp7.a(view, R.id.status_txt);
                if (textView != null) {
                    i = R.id.topHolder;
                    View viewA = zp7.a(view, R.id.topHolder);
                    if (viewA != null) {
                        d47 d47VarA = d47.a(viewA);
                        i = R.id.virtualRcTv;
                        TextView textView2 = (TextView) zp7.a(view, R.id.virtualRcTv);
                        if (textView2 != null) {
                            return new vt1(nestedScrollView, appCompatTextView, recyclerView, nestedScrollView, textView, d47VarA, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static vt1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static vt1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.doc_virtual_rc, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public NestedScrollView b() {
        return this.a;
    }
}
