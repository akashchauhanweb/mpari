package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j7 {
    public final RelativeLayout a;
    public final NestedScrollView b;
    public final AppCompatTextView c;
    public final RecyclerView d;
    public final AppCompatEditText e;
    public final ProgressBar f;
    public final MyTextView g;
    public final LinearLayout h;
    public final AppCompatTextView i;
    public final d47 j;
    public final AppCompatTextView k;

    public j7(RelativeLayout relativeLayout, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, LinearLayout linearLayout, AppCompatTextView appCompatTextView2, d47 d47Var, AppCompatTextView appCompatTextView3) {
        this.a = relativeLayout;
        this.b = nestedScrollView;
        this.c = appCompatTextView;
        this.d = recyclerView;
        this.e = appCompatEditText;
        this.f = progressBar;
        this.g = myTextView;
        this.h = linearLayout;
        this.i = appCompatTextView2;
        this.j = d47Var;
        this.k = appCompatTextView3;
    }

    public static j7 a(View view) {
        int i = R.id.nestedScrollView;
        NestedScrollView nestedScrollView = (NestedScrollView) zp7.a(view, R.id.nestedScrollView);
        if (nestedScrollView != null) {
            i = R.id.noNoticeFoundTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.noNoticeFoundTv);
            if (appCompatTextView != null) {
                i = R.id.noticeListRv;
                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.noticeListRv);
                if (recyclerView != null) {
                    i = R.id.numberEt;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) zp7.a(view, R.id.numberEt);
                    if (appCompatEditText != null) {
                        i = R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progressBar);
                        if (progressBar != null) {
                            i = R.id.searchTv;
                            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.searchTv);
                            if (myTextView != null) {
                                i = R.id.tabBarLl;
                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.tabBarLl);
                                if (linearLayout != null) {
                                    i = R.id.titleTv;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.titleTv);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.topHolder;
                                        View viewA = zp7.a(view, R.id.topHolder);
                                        if (viewA != null) {
                                            d47 d47VarA = d47.a(viewA);
                                            i = R.id.totalNoticeCountTv;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) zp7.a(view, R.id.totalNoticeCountTv);
                                            if (appCompatTextView3 != null) {
                                                return new j7((RelativeLayout) view, nestedScrollView, appCompatTextView, recyclerView, appCompatEditText, progressBar, myTextView, linearLayout, appCompatTextView2, d47VarA, appCompatTextView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static j7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static j7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_check_post_search_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.a;
    }
}
