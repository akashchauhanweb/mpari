package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kt7 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final LinearLayout F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout K;
    public final LinearLayout L;
    public final ImageView M;
    public final TextView N;
    public final TextView O;
    public final LinearLayout P;
    public final LinearLayout Q;
    public final LinearLayout R;
    public final TextView S;
    public final TextView T;
    public final ImageView U;
    public final LinearLayout V;
    public final ProgressBar W;
    public final ImageView X;
    public final LinearLayout Y;
    public final LinearLayout Z;
    public final CoordinatorLayout a;
    public final ImageView a0;
    public final TextView b;
    public final TextView b0;
    public final TextView c;
    public final RecyclerView c0;
    public final TextView d;
    public final TextView d0;
    public final LinearLayout e;
    public final LinearLayout e0;
    public final TextView f;
    public final TextView f0;
    public final TextView g;
    public final ImageView g0;
    public final TextView h;
    public final TextView h0;
    public final TextView i;
    public final ImageView i0;
    public final LinearLayout j;
    public final ImageView j0;
    public final MaterialCardView k;
    public final LinearLayout k0;
    public final TextView l;
    public final TextView l0;
    public final LinearLayout m;
    public final TextView m0;
    public final TextView n;
    public final LinearLayout n0;
    public final TextView o;
    public final LinearLayout o0;
    public final TextView p;
    public final TextView p0;
    public final TextView q;
    public final TextView q0;
    public final ImageView r;
    public final MyTextView r0;
    public final TextView s;
    public final TextView s0;
    public final TextView t;
    public final LinearLayout t0;
    public final LinearLayout u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final ImageView z;

    public kt7(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LinearLayout linearLayout2, MaterialCardView materialCardView, TextView textView8, LinearLayout linearLayout3, TextView textView9, TextView textView10, TextView textView11, TextView textView12, ImageView imageView, TextView textView13, TextView textView14, LinearLayout linearLayout4, TextView textView15, TextView textView16, TextView textView17, TextView textView18, ImageView imageView2, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, LinearLayout linearLayout5, TextView textView24, TextView textView25, TextView textView26, TextView textView27, LinearLayout linearLayout6, LinearLayout linearLayout7, ImageView imageView3, TextView textView28, TextView textView29, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, TextView textView30, TextView textView31, ImageView imageView4, LinearLayout linearLayout11, ProgressBar progressBar, ImageView imageView5, LinearLayout linearLayout12, LinearLayout linearLayout13, ImageView imageView6, TextView textView32, RecyclerView recyclerView, TextView textView33, LinearLayout linearLayout14, TextView textView34, ImageView imageView7, TextView textView35, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout15, TextView textView36, TextView textView37, LinearLayout linearLayout16, LinearLayout linearLayout17, TextView textView38, TextView textView39, MyTextView myTextView, TextView textView40, LinearLayout linearLayout18) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = linearLayout;
        this.f = textView4;
        this.g = textView5;
        this.h = textView6;
        this.i = textView7;
        this.j = linearLayout2;
        this.k = materialCardView;
        this.l = textView8;
        this.m = linearLayout3;
        this.n = textView9;
        this.o = textView10;
        this.p = textView11;
        this.q = textView12;
        this.r = imageView;
        this.s = textView13;
        this.t = textView14;
        this.u = linearLayout4;
        this.v = textView15;
        this.w = textView16;
        this.x = textView17;
        this.y = textView18;
        this.z = imageView2;
        this.A = textView19;
        this.B = textView20;
        this.C = textView21;
        this.D = textView22;
        this.E = textView23;
        this.F = linearLayout5;
        this.G = textView24;
        this.H = textView25;
        this.I = textView26;
        this.J = textView27;
        this.K = linearLayout6;
        this.L = linearLayout7;
        this.M = imageView3;
        this.N = textView28;
        this.O = textView29;
        this.P = linearLayout8;
        this.Q = linearLayout9;
        this.R = linearLayout10;
        this.S = textView30;
        this.T = textView31;
        this.U = imageView4;
        this.V = linearLayout11;
        this.W = progressBar;
        this.X = imageView5;
        this.Y = linearLayout12;
        this.Z = linearLayout13;
        this.a0 = imageView6;
        this.b0 = textView32;
        this.c0 = recyclerView;
        this.d0 = textView33;
        this.e0 = linearLayout14;
        this.f0 = textView34;
        this.g0 = imageView7;
        this.h0 = textView35;
        this.i0 = imageView8;
        this.j0 = imageView9;
        this.k0 = linearLayout15;
        this.l0 = textView36;
        this.m0 = textView37;
        this.n0 = linearLayout16;
        this.o0 = linearLayout17;
        this.p0 = textView38;
        this.q0 = textView39;
        this.r0 = myTextView;
        this.s0 = textView40;
        this.t0 = linearLayout18;
    }

    public static kt7 a(View view) {
        int i = R.id.aadhaar_no;
        TextView textView = (TextView) zp7.a(view, R.id.aadhaar_no);
        if (textView != null) {
            i = R.id.address;
            TextView textView2 = (TextView) zp7.a(view, R.id.address);
            if (textView2 != null) {
                i = R.id.authority_sign;
                TextView textView3 = (TextView) zp7.a(view, R.id.authority_sign);
                if (textView3 != null) {
                    i = R.id.back_view;
                    LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.back_view);
                    if (linearLayout != null) {
                        i = R.id.bg;
                        TextView textView4 = (TextView) zp7.a(view, R.id.bg);
                        if (textView4 != null) {
                            i = R.id.blood_group;
                            TextView textView5 = (TextView) zp7.a(view, R.id.blood_group);
                            if (textView5 != null) {
                                i = R.id.btn_my_vehicle;
                                TextView textView6 = (TextView) zp7.a(view, R.id.btn_my_vehicle);
                                if (textView6 != null) {
                                    i = R.id.btn_othe_vehicle;
                                    TextView textView7 = (TextView) zp7.a(view, R.id.btn_othe_vehicle);
                                    if (textView7 != null) {
                                        i = R.id.circle;
                                        LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.circle);
                                        if (linearLayout2 != null) {
                                            i = R.id.container_card;
                                            MaterialCardView materialCardView = (MaterialCardView) zp7.a(view, R.id.container_card);
                                            if (materialCardView != null) {
                                                i = R.id.date_of_issue;
                                                TextView textView8 = (TextView) zp7.a(view, R.id.date_of_issue);
                                                if (textView8 != null) {
                                                    i = R.id.dl_holder;
                                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.dl_holder);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.dl_holder_add;
                                                        TextView textView9 = (TextView) zp7.a(view, R.id.dl_holder_add);
                                                        if (textView9 != null) {
                                                            i = R.id.dl_holder_address_n;
                                                            TextView textView10 = (TextView) zp7.a(view, R.id.dl_holder_address_n);
                                                            if (textView10 != null) {
                                                                i = R.id.dl_holder_issue_date_n;
                                                                TextView textView11 = (TextView) zp7.a(view, R.id.dl_holder_issue_date_n);
                                                                if (textView11 != null) {
                                                                    i = R.id.dl_holder_name_n;
                                                                    TextView textView12 = (TextView) zp7.a(view, R.id.dl_holder_name_n);
                                                                    if (textView12 != null) {
                                                                        i = R.id.dl_holder_pic;
                                                                        ImageView imageView = (ImageView) zp7.a(view, R.id.dl_holder_pic);
                                                                        if (imageView != null) {
                                                                            i = R.id.dl_holder_valid_upto_n;
                                                                            TextView textView13 = (TextView) zp7.a(view, R.id.dl_holder_valid_upto_n);
                                                                            if (textView13 != null) {
                                                                                i = R.id.dl_holdername;
                                                                                TextView textView14 = (TextView) zp7.a(view, R.id.dl_holdername);
                                                                                if (textView14 != null) {
                                                                                    i = R.id.dl_layout;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.dl_layout);
                                                                                    if (linearLayout4 != null) {
                                                                                        i = R.id.dl_n;
                                                                                        TextView textView15 = (TextView) zp7.a(view, R.id.dl_n);
                                                                                        if (textView15 != null) {
                                                                                            i = R.id.dl_number;
                                                                                            TextView textView16 = (TextView) zp7.a(view, R.id.dl_number);
                                                                                            if (textView16 != null) {
                                                                                                i = R.id.dob;
                                                                                                TextView textView17 = (TextView) zp7.a(view, R.id.dob);
                                                                                                if (textView17 != null) {
                                                                                                    i = R.id.dob_text;
                                                                                                    TextView textView18 = (TextView) zp7.a(view, R.id.dob_text);
                                                                                                    if (textView18 != null) {
                                                                                                        i = R.id.download_dl;
                                                                                                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.download_dl);
                                                                                                        if (imageView2 != null) {
                                                                                                            i = R.id.head1;
                                                                                                            TextView textView19 = (TextView) zp7.a(view, R.id.head1);
                                                                                                            if (textView19 != null) {
                                                                                                                i = R.id.head3;
                                                                                                                TextView textView20 = (TextView) zp7.a(view, R.id.head3);
                                                                                                                if (textView20 != null) {
                                                                                                                    i = R.id.head4;
                                                                                                                    TextView textView21 = (TextView) zp7.a(view, R.id.head4);
                                                                                                                    if (textView21 != null) {
                                                                                                                        i = R.id.head5;
                                                                                                                        TextView textView22 = (TextView) zp7.a(view, R.id.head5);
                                                                                                                        if (textView22 != null) {
                                                                                                                            i = R.id.holder_father_name;
                                                                                                                            TextView textView23 = (TextView) zp7.a(view, R.id.holder_father_name);
                                                                                                                            if (textView23 != null) {
                                                                                                                                i = R.id.inner_dl_layout;
                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.inner_dl_layout);
                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                    i = R.id.issue_date;
                                                                                                                                    TextView textView24 = (TextView) zp7.a(view, R.id.issue_date);
                                                                                                                                    if (textView24 != null) {
                                                                                                                                        i = R.id.issuedatetext;
                                                                                                                                        TextView textView25 = (TextView) zp7.a(view, R.id.issuedatetext);
                                                                                                                                        if (textView25 != null) {
                                                                                                                                            i = R.id.lableService;
                                                                                                                                            TextView textView26 = (TextView) zp7.a(view, R.id.lableService);
                                                                                                                                            if (textView26 != null) {
                                                                                                                                                i = R.id.lic_auth;
                                                                                                                                                TextView textView27 = (TextView) zp7.a(view, R.id.lic_auth);
                                                                                                                                                if (textView27 != null) {
                                                                                                                                                    i = R.id.linear_menu_bar;
                                                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.linear_menu_bar);
                                                                                                                                                    if (linearLayout6 != null) {
                                                                                                                                                        i = R.id.my_rc_icon;
                                                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.my_rc_icon);
                                                                                                                                                        if (linearLayout7 != null) {
                                                                                                                                                            i = R.id.my_rc_icon_img;
                                                                                                                                                            ImageView imageView3 = (ImageView) zp7.a(view, R.id.my_rc_icon_img);
                                                                                                                                                            if (imageView3 != null) {
                                                                                                                                                                i = R.id.my_rc_txt;
                                                                                                                                                                TextView textView28 = (TextView) zp7.a(view, R.id.my_rc_txt);
                                                                                                                                                                if (textView28 != null) {
                                                                                                                                                                    i = R.id.name;
                                                                                                                                                                    TextView textView29 = (TextView) zp7.a(view, R.id.name);
                                                                                                                                                                    if (textView29 != null) {
                                                                                                                                                                        i = R.id.nexgenarrow;
                                                                                                                                                                        LinearLayout linearLayout8 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                                                                                                                                                        if (linearLayout8 != null) {
                                                                                                                                                                            i = R.id.nexgenlogo;
                                                                                                                                                                            LinearLayout linearLayout9 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                                                                                                                                                            if (linearLayout9 != null) {
                                                                                                                                                                                i = R.id.non_trans_linear;
                                                                                                                                                                                LinearLayout linearLayout10 = (LinearLayout) zp7.a(view, R.id.non_trans_linear);
                                                                                                                                                                                if (linearLayout10 != null) {
                                                                                                                                                                                    i = R.id.nt_lable;
                                                                                                                                                                                    TextView textView30 = (TextView) zp7.a(view, R.id.nt_lable);
                                                                                                                                                                                    if (textView30 != null) {
                                                                                                                                                                                        i = R.id.nt_validaity;
                                                                                                                                                                                        TextView textView31 = (TextView) zp7.a(view, R.id.nt_validaity);
                                                                                                                                                                                        if (textView31 != null) {
                                                                                                                                                                                            i = R.id.option_menu_dl;
                                                                                                                                                                                            ImageView imageView4 = (ImageView) zp7.a(view, R.id.option_menu_dl);
                                                                                                                                                                                            if (imageView4 != null) {
                                                                                                                                                                                                i = R.id.option_menu_dl_linear;
                                                                                                                                                                                                LinearLayout linearLayout11 = (LinearLayout) zp7.a(view, R.id.option_menu_dl_linear);
                                                                                                                                                                                                if (linearLayout11 != null) {
                                                                                                                                                                                                    i = R.id.progress_bar;
                                                                                                                                                                                                    ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.progress_bar);
                                                                                                                                                                                                    if (progressBar != null) {
                                                                                                                                                                                                        i = R.id.qr_image;
                                                                                                                                                                                                        ImageView imageView5 = (ImageView) zp7.a(view, R.id.qr_image);
                                                                                                                                                                                                        if (imageView5 != null) {
                                                                                                                                                                                                            i = R.id.rc_layout;
                                                                                                                                                                                                            LinearLayout linearLayout12 = (LinearLayout) zp7.a(view, R.id.rc_layout);
                                                                                                                                                                                                            if (linearLayout12 != null) {
                                                                                                                                                                                                                i = R.id.recived_icon;
                                                                                                                                                                                                                LinearLayout linearLayout13 = (LinearLayout) zp7.a(view, R.id.recived_icon);
                                                                                                                                                                                                                if (linearLayout13 != null) {
                                                                                                                                                                                                                    i = R.id.recived_rc_img;
                                                                                                                                                                                                                    ImageView imageView6 = (ImageView) zp7.a(view, R.id.recived_rc_img);
                                                                                                                                                                                                                    if (imageView6 != null) {
                                                                                                                                                                                                                        i = R.id.recived_rc_text;
                                                                                                                                                                                                                        TextView textView32 = (TextView) zp7.a(view, R.id.recived_rc_text);
                                                                                                                                                                                                                        if (textView32 != null) {
                                                                                                                                                                                                                            i = R.id.recyclerview;
                                                                                                                                                                                                                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.recyclerview);
                                                                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                                                                i = R.id.sdf;
                                                                                                                                                                                                                                TextView textView33 = (TextView) zp7.a(view, R.id.sdf);
                                                                                                                                                                                                                                if (textView33 != null) {
                                                                                                                                                                                                                                    i = R.id.share_icon;
                                                                                                                                                                                                                                    LinearLayout linearLayout14 = (LinearLayout) zp7.a(view, R.id.share_icon);
                                                                                                                                                                                                                                    if (linearLayout14 != null) {
                                                                                                                                                                                                                                        i = R.id.shared_rc;
                                                                                                                                                                                                                                        TextView textView34 = (TextView) zp7.a(view, R.id.shared_rc);
                                                                                                                                                                                                                                        if (textView34 != null) {
                                                                                                                                                                                                                                            i = R.id.shared_rc_img;
                                                                                                                                                                                                                                            ImageView imageView7 = (ImageView) zp7.a(view, R.id.shared_rc_img);
                                                                                                                                                                                                                                            if (imageView7 != null) {
                                                                                                                                                                                                                                                i = R.id.shared_rc_text;
                                                                                                                                                                                                                                                TextView textView35 = (TextView) zp7.a(view, R.id.shared_rc_text);
                                                                                                                                                                                                                                                if (textView35 != null) {
                                                                                                                                                                                                                                                    i = R.id.signature;
                                                                                                                                                                                                                                                    ImageView imageView8 = (ImageView) zp7.a(view, R.id.signature);
                                                                                                                                                                                                                                                    if (imageView8 != null) {
                                                                                                                                                                                                                                                        i = R.id.status_image;
                                                                                                                                                                                                                                                        ImageView imageView9 = (ImageView) zp7.a(view, R.id.status_image);
                                                                                                                                                                                                                                                        if (imageView9 != null) {
                                                                                                                                                                                                                                                            i = R.id.status_linear;
                                                                                                                                                                                                                                                            LinearLayout linearLayout15 = (LinearLayout) zp7.a(view, R.id.status_linear);
                                                                                                                                                                                                                                                            if (linearLayout15 != null) {
                                                                                                                                                                                                                                                                i = R.id.status_txt;
                                                                                                                                                                                                                                                                TextView textView36 = (TextView) zp7.a(view, R.id.status_txt);
                                                                                                                                                                                                                                                                if (textView36 != null) {
                                                                                                                                                                                                                                                                    i = R.id.status_txt2;
                                                                                                                                                                                                                                                                    TextView textView37 = (TextView) zp7.a(view, R.id.status_txt2);
                                                                                                                                                                                                                                                                    if (textView37 != null) {
                                                                                                                                                                                                                                                                        i = R.id.top_view;
                                                                                                                                                                                                                                                                        LinearLayout linearLayout16 = (LinearLayout) zp7.a(view, R.id.top_view);
                                                                                                                                                                                                                                                                        if (linearLayout16 != null) {
                                                                                                                                                                                                                                                                            i = R.id.tran_linear;
                                                                                                                                                                                                                                                                            LinearLayout linearLayout17 = (LinearLayout) zp7.a(view, R.id.tran_linear);
                                                                                                                                                                                                                                                                            if (linearLayout17 != null) {
                                                                                                                                                                                                                                                                                i = R.id.tranport_validity;
                                                                                                                                                                                                                                                                                TextView textView38 = (TextView) zp7.a(view, R.id.tranport_validity);
                                                                                                                                                                                                                                                                                if (textView38 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.tvalid_lable;
                                                                                                                                                                                                                                                                                    TextView textView39 = (TextView) zp7.a(view, R.id.tvalid_lable);
                                                                                                                                                                                                                                                                                    if (textView39 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.v_r_d;
                                                                                                                                                                                                                                                                                        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.v_r_d);
                                                                                                                                                                                                                                                                                        if (myTextView != null) {
                                                                                                                                                                                                                                                                                            i = R.id.vehicle_class;
                                                                                                                                                                                                                                                                                            TextView textView40 = (TextView) zp7.a(view, R.id.vehicle_class);
                                                                                                                                                                                                                                                                                            if (textView40 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.vehicle_linear;
                                                                                                                                                                                                                                                                                                LinearLayout linearLayout18 = (LinearLayout) zp7.a(view, R.id.vehicle_linear);
                                                                                                                                                                                                                                                                                                if (linearLayout18 != null) {
                                                                                                                                                                                                                                                                                                    return new kt7((CoordinatorLayout) view, textView, textView2, textView3, linearLayout, textView4, textView5, textView6, textView7, linearLayout2, materialCardView, textView8, linearLayout3, textView9, textView10, textView11, textView12, imageView, textView13, textView14, linearLayout4, textView15, textView16, textView17, textView18, imageView2, textView19, textView20, textView21, textView22, textView23, linearLayout5, textView24, textView25, textView26, textView27, linearLayout6, linearLayout7, imageView3, textView28, textView29, linearLayout8, linearLayout9, linearLayout10, textView30, textView31, imageView4, linearLayout11, progressBar, imageView5, linearLayout12, linearLayout13, imageView6, textView32, recyclerView, textView33, linearLayout14, textView34, imageView7, textView35, imageView8, imageView9, linearLayout15, textView36, textView37, linearLayout16, linearLayout17, textView38, textView39, myTextView, textView40, linearLayout18);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static kt7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static kt7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.virtual_document_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
