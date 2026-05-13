package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zd0 {
    public final LinearLayout a;
    public final AppCompatTextView b;
    public final EditText c;
    public final EditText d;
    public final EditText e;
    public final ImageView f;
    public final ImageView g;
    public final ImageView h;
    public final d47 i;
    public final AppCompatTextView j;

    public zd0(LinearLayout linearLayout, AppCompatTextView appCompatTextView, EditText editText, EditText editText2, EditText editText3, ImageView imageView, ImageView imageView2, ImageView imageView3, d47 d47Var, AppCompatTextView appCompatTextView2) {
        this.a = linearLayout;
        this.b = appCompatTextView;
        this.c = editText;
        this.d = editText2;
        this.e = editText3;
        this.f = imageView;
        this.g = imageView2;
        this.h = imageView3;
        this.i = d47Var;
        this.j = appCompatTextView2;
    }

    public static zd0 a(View view) {
        int i = R.id.changeMpinTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zp7.a(view, R.id.changeMpinTv);
        if (appCompatTextView != null) {
            i = R.id.confirmMpinEt;
            EditText editText = (EditText) zp7.a(view, R.id.confirmMpinEt);
            if (editText != null) {
                i = R.id.newMpinEt;
                EditText editText2 = (EditText) zp7.a(view, R.id.newMpinEt);
                if (editText2 != null) {
                    i = R.id.oldMpinEt;
                    EditText editText3 = (EditText) zp7.a(view, R.id.oldMpinEt);
                    if (editText3 != null) {
                        i = R.id.showConfirmMpin;
                        ImageView imageView = (ImageView) zp7.a(view, R.id.showConfirmMpin);
                        if (imageView != null) {
                            i = R.id.showNewMpin;
                            ImageView imageView2 = (ImageView) zp7.a(view, R.id.showNewMpin);
                            if (imageView2 != null) {
                                i = R.id.showOldMpin;
                                ImageView imageView3 = (ImageView) zp7.a(view, R.id.showOldMpin);
                                if (imageView3 != null) {
                                    i = R.id.toolbar;
                                    View viewA = zp7.a(view, R.id.toolbar);
                                    if (viewA != null) {
                                        d47 d47VarA = d47.a(viewA);
                                        i = R.id.topTitleTv;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) zp7.a(view, R.id.topTitleTv);
                                        if (appCompatTextView2 != null) {
                                            return new zd0((LinearLayout) view, appCompatTextView, editText, editText2, editText3, imageView, imageView2, imageView3, d47VarA, appCompatTextView2);
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

    public static zd0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static zd0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.change_mpin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
