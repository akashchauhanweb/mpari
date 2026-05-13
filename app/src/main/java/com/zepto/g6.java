package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.MovableFloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public final class g6 {
    public final ConstraintLayout a;
    public final TextView b;
    public final FloatingActionButton c;
    public final FloatingActionButton d;
    public final TextView e;
    public final MovableFloatingActionButton f;
    public final LinearLayout g;
    public final RecyclerView h;
    public final LinearLayout i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final TextView l;
    public final ImageView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;

    public g6(ConstraintLayout constraintLayout, TextView textView, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, TextView textView2, MovableFloatingActionButton movableFloatingActionButton, LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = floatingActionButton;
        this.d = floatingActionButton2;
        this.e = textView2;
        this.f = movableFloatingActionButton;
        this.g = linearLayout;
        this.h = recyclerView;
        this.i = linearLayout2;
        this.j = linearLayout3;
        this.k = linearLayout4;
        this.l = textView3;
        this.m = imageView;
        this.n = textView4;
        this.o = textView5;
        this.p = textView6;
        this.q = textView7;
    }

    public static g6 a(View view) {
        int i = R.id.add_alarm_action_text;
        TextView textView = (TextView) zp7.a(view, R.id.add_alarm_action_text);
        if (textView != null) {
            i = R.id.add_alarm_fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) zp7.a(view, R.id.add_alarm_fab);
            if (floatingActionButton != null) {
                i = R.id.add_fab;
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) zp7.a(view, R.id.add_fab);
                if (floatingActionButton2 != null) {
                    i = R.id.add_person_action_text;
                    TextView textView2 = (TextView) zp7.a(view, R.id.add_person_action_text);
                    if (textView2 != null) {
                        i = R.id.add_person_fab;
                        MovableFloatingActionButton movableFloatingActionButton = (MovableFloatingActionButton) zp7.a(view, R.id.add_person_fab);
                        if (movableFloatingActionButton != null) {
                            i = R.id.add_to_contact_linear;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.add_to_contact_linear);
                            if (linearLayout != null) {
                                i = R.id.contactRecyclerView;
                                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.contactRecyclerView);
                                if (recyclerView != null) {
                                    i = R.id.nexgenarrow;
                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                    if (linearLayout2 != null) {
                                        i = R.id.nexgenlogo;
                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                        if (linearLayout3 != null) {
                                            i = R.id.recycle_linear;
                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.recycle_linear);
                                            if (linearLayout4 != null) {
                                                i = R.id.service_label;
                                                TextView textView3 = (TextView) zp7.a(view, R.id.service_label);
                                                if (textView3 != null) {
                                                    i = R.id.shared_rc;
                                                    ImageView imageView = (ImageView) zp7.a(view, R.id.shared_rc);
                                                    if (imageView != null) {
                                                        i = R.id.title;
                                                        TextView textView4 = (TextView) zp7.a(view, R.id.title);
                                                        if (textView4 != null) {
                                                            i = R.id.tv_add_emerg_contact;
                                                            TextView textView5 = (TextView) zp7.a(view, R.id.tv_add_emerg_contact);
                                                            if (textView5 != null) {
                                                                i = R.id.tv_help_note;
                                                                TextView textView6 = (TextView) zp7.a(view, R.id.tv_help_note);
                                                                if (textView6 != null) {
                                                                    i = R.id.tv_manage_emerg_contact;
                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.tv_manage_emerg_contact);
                                                                    if (textView7 != null) {
                                                                        return new g6((ConstraintLayout) view, textView, floatingActionButton, floatingActionButton2, textView2, movableFloatingActionButton, linearLayout, recyclerView, linearLayout2, linearLayout3, linearLayout4, textView3, imageView, textView4, textView5, textView6, textView7);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static g6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static g6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_add_contact_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
