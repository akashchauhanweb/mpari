package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class k9 {
    public final LinearLayout A;
    public final LinearLayout B;
    public final TextView C;
    public final ImageView D;
    public final ImageView E;
    public final TextView F;
    public final RecyclerView G;
    public final MyTextView H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final MyTextView K;
    public final MyTextView L;
    public final CardView M;
    public final MyTextView N;
    public final MyTextView O;
    public final TextView P;
    public final TextView Q;
    public final LinearLayout R;
    public final MyTextView S;
    public final MyTextView T;
    public final MyTextView U;
    public final MyTextView V;
    public final MyTextView W;
    public final MyTextView X;
    public final MyTextView Y;
    public final MyTextView Z;
    public final CoordinatorLayout a;
    public final MyTextView a0;
    public final MyTextView b;
    public final MyTextView b0;
    public final TextView c;
    public final MyTextView c0;
    public final MyTextView d;
    public final MyTextView d0;
    public final TextView e;
    public final LinearLayout e0;
    public final ImageView f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final TextView j;
    public final MyTextView k;
    public final LinearLayout l;
    public final MyTextView m;
    public final EditText n;
    public final EditText o;
    public final EditText p;
    public final EditText q;
    public final MyTextView r;
    public final TextView s;
    public final MyTextView t;
    public final LinearLayout u;
    public final LinearLayout v;
    public final LinearLayout w;
    public final TextView x;
    public final TextView y;
    public final MyTextView z;

    public k9(CoordinatorLayout coordinatorLayout, MyTextView myTextView, TextView textView, MyTextView myTextView2, TextView textView2, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView3, MyTextView myTextView3, LinearLayout linearLayout4, MyTextView myTextView4, EditText editText, EditText editText2, EditText editText3, EditText editText4, MyTextView myTextView5, TextView textView4, MyTextView myTextView6, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, TextView textView5, TextView textView6, MyTextView myTextView7, LinearLayout linearLayout8, LinearLayout linearLayout9, TextView textView7, ImageView imageView2, ImageView imageView3, TextView textView8, RecyclerView recyclerView, MyTextView myTextView8, LinearLayout linearLayout10, LinearLayout linearLayout11, MyTextView myTextView9, MyTextView myTextView10, CardView cardView, MyTextView myTextView11, MyTextView myTextView12, TextView textView9, TextView textView10, LinearLayout linearLayout12, MyTextView myTextView13, MyTextView myTextView14, MyTextView myTextView15, MyTextView myTextView16, MyTextView myTextView17, MyTextView myTextView18, MyTextView myTextView19, MyTextView myTextView20, MyTextView myTextView21, MyTextView myTextView22, MyTextView myTextView23, MyTextView myTextView24, LinearLayout linearLayout13) {
        this.a = coordinatorLayout;
        this.b = myTextView;
        this.c = textView;
        this.d = myTextView2;
        this.e = textView2;
        this.f = imageView;
        this.g = linearLayout;
        this.h = linearLayout2;
        this.i = linearLayout3;
        this.j = textView3;
        this.k = myTextView3;
        this.l = linearLayout4;
        this.m = myTextView4;
        this.n = editText;
        this.o = editText2;
        this.p = editText3;
        this.q = editText4;
        this.r = myTextView5;
        this.s = textView4;
        this.t = myTextView6;
        this.u = linearLayout5;
        this.v = linearLayout6;
        this.w = linearLayout7;
        this.x = textView5;
        this.y = textView6;
        this.z = myTextView7;
        this.A = linearLayout8;
        this.B = linearLayout9;
        this.C = textView7;
        this.D = imageView2;
        this.E = imageView3;
        this.F = textView8;
        this.G = recyclerView;
        this.H = myTextView8;
        this.I = linearLayout10;
        this.J = linearLayout11;
        this.K = myTextView9;
        this.L = myTextView10;
        this.M = cardView;
        this.N = myTextView11;
        this.O = myTextView12;
        this.P = textView9;
        this.Q = textView10;
        this.R = linearLayout12;
        this.S = myTextView13;
        this.T = myTextView14;
        this.U = myTextView15;
        this.V = myTextView16;
        this.W = myTextView17;
        this.X = myTextView18;
        this.Y = myTextView19;
        this.Z = myTextView20;
        this.a0 = myTextView21;
        this.b0 = myTextView22;
        this.c0 = myTextView23;
        this.d0 = myTextView24;
        this.e0 = linearLayout13;
    }

    public static k9 a(View view) {
        int i = R.id.add_to_dash;
        MyTextView myTextView = (MyTextView) zp7.a(view, R.id.add_to_dash);
        if (myTextView != null) {
            i = R.id.address;
            TextView textView = (TextView) zp7.a(view, R.id.address);
            if (textView != null) {
                i = R.id.btn_view_challan;
                MyTextView myTextView2 = (MyTextView) zp7.a(view, R.id.btn_view_challan);
                if (myTextView2 != null) {
                    i = R.id.dash_board;
                    TextView textView2 = (TextView) zp7.a(view, R.id.dash_board);
                    if (textView2 != null) {
                        i = R.id.date_img;
                        ImageView imageView = (ImageView) zp7.a(view, R.id.date_img);
                        if (imageView != null) {
                            i = R.id.dl_dashboard;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.dl_dashboard);
                            if (linearLayout != null) {
                                i = R.id.dlHolder;
                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.dlHolder);
                                if (linearLayout2 != null) {
                                    i = R.id.dl_layout;
                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.dl_layout);
                                    if (linearLayout3 != null) {
                                        i = R.id.dlNo;
                                        TextView textView3 = (TextView) zp7.a(view, R.id.dlNo);
                                        if (textView3 != null) {
                                            i = R.id.dl_number;
                                            MyTextView myTextView3 = (MyTextView) zp7.a(view, R.id.dl_number);
                                            if (myTextView3 != null) {
                                                i = R.id.dl_rec_search;
                                                LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.dl_rec_search);
                                                if (linearLayout4 != null) {
                                                    i = R.id.dob;
                                                    MyTextView myTextView4 = (MyTextView) zp7.a(view, R.id.dob);
                                                    if (myTextView4 != null) {
                                                        i = R.id.dobDateMain;
                                                        EditText editText = (EditText) zp7.a(view, R.id.dobDateMain);
                                                        if (editText != null) {
                                                            i = R.id.dobMonthMain;
                                                            EditText editText2 = (EditText) zp7.a(view, R.id.dobMonthMain);
                                                            if (editText2 != null) {
                                                                i = R.id.dobYearMain;
                                                                EditText editText3 = (EditText) zp7.a(view, R.id.dobYearMain);
                                                                if (editText3 != null) {
                                                                    i = R.id.et_search_dl;
                                                                    EditText editText4 = (EditText) zp7.a(view, R.id.et_search_dl);
                                                                    if (editText4 != null) {
                                                                        i = R.id.holder_name;
                                                                        MyTextView myTextView5 = (MyTextView) zp7.a(view, R.id.holder_name);
                                                                        if (myTextView5 != null) {
                                                                            i = R.id.issue_date;
                                                                            TextView textView4 = (TextView) zp7.a(view, R.id.issue_date);
                                                                            if (textView4 != null) {
                                                                                i = R.id.issue_date_txt;
                                                                                MyTextView myTextView6 = (MyTextView) zp7.a(view, R.id.issue_date_txt);
                                                                                if (myTextView6 != null) {
                                                                                    i = R.id.linear_menu_bar;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.linear_menu_bar);
                                                                                    if (linearLayout5 != null) {
                                                                                        i = R.id.ll_create_dl;
                                                                                        LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.ll_create_dl);
                                                                                        if (linearLayout6 != null) {
                                                                                            i = R.id.ll_search_dl;
                                                                                            LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.ll_search_dl);
                                                                                            if (linearLayout7 != null) {
                                                                                                i = R.id.logo_dl_dash;
                                                                                                TextView textView5 = (TextView) zp7.a(view, R.id.logo_dl_dash);
                                                                                                if (textView5 != null) {
                                                                                                    i = R.id.logo_rc_dash;
                                                                                                    TextView textView6 = (TextView) zp7.a(view, R.id.logo_rc_dash);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.maker_title;
                                                                                                        MyTextView myTextView7 = (MyTextView) zp7.a(view, R.id.maker_title);
                                                                                                        if (myTextView7 != null) {
                                                                                                            i = R.id.nexgenarrow;
                                                                                                            LinearLayout linearLayout8 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                                                                                            if (linearLayout8 != null) {
                                                                                                                i = R.id.nexgenlogo;
                                                                                                                LinearLayout linearLayout9 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                                                                                                if (linearLayout9 != null) {
                                                                                                                    i = R.id.ntValidUpTodate;
                                                                                                                    TextView textView7 = (TextView) zp7.a(view, R.id.ntValidUpTodate);
                                                                                                                    if (textView7 != null) {
                                                                                                                        i = R.id.option_menu;
                                                                                                                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.option_menu);
                                                                                                                        if (imageView2 != null) {
                                                                                                                            i = R.id.owner_image;
                                                                                                                            ImageView imageView3 = (ImageView) zp7.a(view, R.id.owner_image);
                                                                                                                            if (imageView3 != null) {
                                                                                                                                i = R.id.owner_name;
                                                                                                                                TextView textView8 = (TextView) zp7.a(view, R.id.owner_name);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    i = R.id.rec_dl_recycler;
                                                                                                                                    RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rec_dl_recycler);
                                                                                                                                    if (recyclerView != null) {
                                                                                                                                        i = R.id.recent_search;
                                                                                                                                        MyTextView myTextView8 = (MyTextView) zp7.a(view, R.id.recent_search);
                                                                                                                                        if (myTextView8 != null) {
                                                                                                                                            i = R.id.redirect_DashBoard;
                                                                                                                                            LinearLayout linearLayout10 = (LinearLayout) zp7.a(view, R.id.redirect_DashBoard);
                                                                                                                                            if (linearLayout10 != null) {
                                                                                                                                                i = R.id.redirect_Rcdashboard;
                                                                                                                                                LinearLayout linearLayout11 = (LinearLayout) zp7.a(view, R.id.redirect_Rcdashboard);
                                                                                                                                                if (linearLayout11 != null) {
                                                                                                                                                    i = R.id.registering_auth_title;
                                                                                                                                                    MyTextView myTextView9 = (MyTextView) zp7.a(view, R.id.registering_auth_title);
                                                                                                                                                    if (myTextView9 != null) {
                                                                                                                                                        i = R.id.registration_dt_title;
                                                                                                                                                        MyTextView myTextView10 = (MyTextView) zp7.a(view, R.id.registration_dt_title);
                                                                                                                                                        if (myTextView10 != null) {
                                                                                                                                                            i = R.id.roundCardView;
                                                                                                                                                            CardView cardView = (CardView) zp7.a(view, R.id.roundCardView);
                                                                                                                                                            if (cardView != null) {
                                                                                                                                                                i = R.id.search;
                                                                                                                                                                MyTextView myTextView11 = (MyTextView) zp7.a(view, R.id.search);
                                                                                                                                                                if (myTextView11 != null) {
                                                                                                                                                                    i = R.id.tap_to_check;
                                                                                                                                                                    MyTextView myTextView12 = (MyTextView) zp7.a(view, R.id.tap_to_check);
                                                                                                                                                                    if (myTextView12 != null) {
                                                                                                                                                                        i = R.id.tr_valid_upto;
                                                                                                                                                                        TextView textView9 = (TextView) zp7.a(view, R.id.tr_valid_upto);
                                                                                                                                                                        if (textView9 != null) {
                                                                                                                                                                            i = R.id.trValidUpto;
                                                                                                                                                                            TextView textView10 = (TextView) zp7.a(view, R.id.trValidUpto);
                                                                                                                                                                            if (textView10 != null) {
                                                                                                                                                                                i = R.id.transport_layout;
                                                                                                                                                                                LinearLayout linearLayout12 = (LinearLayout) zp7.a(view, R.id.transport_layout);
                                                                                                                                                                                if (linearLayout12 != null) {
                                                                                                                                                                                    i = R.id.tv_not_virt_dl;
                                                                                                                                                                                    MyTextView myTextView13 = (MyTextView) zp7.a(view, R.id.tv_not_virt_dl);
                                                                                                                                                                                    if (myTextView13 != null) {
                                                                                                                                                                                        i = R.id.tv_virt_dl_cert;
                                                                                                                                                                                        MyTextView myTextView14 = (MyTextView) zp7.a(view, R.id.tv_virt_dl_cert);
                                                                                                                                                                                        if (myTextView14 != null) {
                                                                                                                                                                                            i = R.id.txt_clear_dl;
                                                                                                                                                                                            MyTextView myTextView15 = (MyTextView) zp7.a(view, R.id.txt_clear_dl);
                                                                                                                                                                                            if (myTextView15 != null) {
                                                                                                                                                                                                i = R.id.txt_create_dl;
                                                                                                                                                                                                MyTextView myTextView16 = (MyTextView) zp7.a(view, R.id.txt_create_dl);
                                                                                                                                                                                                if (myTextView16 != null) {
                                                                                                                                                                                                    i = R.id.txt_dl_holder_name;
                                                                                                                                                                                                    MyTextView myTextView17 = (MyTextView) zp7.a(view, R.id.txt_dl_holder_name);
                                                                                                                                                                                                    if (myTextView17 != null) {
                                                                                                                                                                                                        i = R.id.txt_dl_number;
                                                                                                                                                                                                        MyTextView myTextView18 = (MyTextView) zp7.a(view, R.id.txt_dl_number);
                                                                                                                                                                                                        if (myTextView18 != null) {
                                                                                                                                                                                                            i = R.id.txt_issue_date;
                                                                                                                                                                                                            MyTextView myTextView19 = (MyTextView) zp7.a(view, R.id.txt_issue_date);
                                                                                                                                                                                                            if (myTextView19 != null) {
                                                                                                                                                                                                                i = R.id.txt_lic_auth;
                                                                                                                                                                                                                MyTextView myTextView20 = (MyTextView) zp7.a(view, R.id.txt_lic_auth);
                                                                                                                                                                                                                if (myTextView20 != null) {
                                                                                                                                                                                                                    i = R.id.txt_lic_authority;
                                                                                                                                                                                                                    MyTextView myTextView21 = (MyTextView) zp7.a(view, R.id.txt_lic_authority);
                                                                                                                                                                                                                    if (myTextView21 != null) {
                                                                                                                                                                                                                        i = R.id.txt_lic_validity;
                                                                                                                                                                                                                        MyTextView myTextView22 = (MyTextView) zp7.a(view, R.id.txt_lic_validity);
                                                                                                                                                                                                                        if (myTextView22 != null) {
                                                                                                                                                                                                                            i = R.id.txt_vehicle_class;
                                                                                                                                                                                                                            MyTextView myTextView23 = (MyTextView) zp7.a(view, R.id.txt_vehicle_class);
                                                                                                                                                                                                                            if (myTextView23 != null) {
                                                                                                                                                                                                                                i = R.id.vehicle_class_title;
                                                                                                                                                                                                                                MyTextView myTextView24 = (MyTextView) zp7.a(view, R.id.vehicle_class_title);
                                                                                                                                                                                                                                if (myTextView24 != null) {
                                                                                                                                                                                                                                    i = R.id.viewChallanLl;
                                                                                                                                                                                                                                    LinearLayout linearLayout13 = (LinearLayout) zp7.a(view, R.id.viewChallanLl);
                                                                                                                                                                                                                                    if (linearLayout13 != null) {
                                                                                                                                                                                                                                        return new k9((CoordinatorLayout) view, myTextView, textView, myTextView2, textView2, imageView, linearLayout, linearLayout2, linearLayout3, textView3, myTextView3, linearLayout4, myTextView4, editText, editText2, editText3, editText4, myTextView5, textView4, myTextView6, linearLayout5, linearLayout6, linearLayout7, textView5, textView6, myTextView7, linearLayout8, linearLayout9, textView7, imageView2, imageView3, textView8, recyclerView, myTextView8, linearLayout10, linearLayout11, myTextView9, myTextView10, cardView, myTextView11, myTextView12, textView9, textView10, linearLayout12, myTextView13, myTextView14, myTextView15, myTextView16, myTextView17, myTextView18, myTextView19, myTextView20, myTextView21, myTextView22, myTextView23, myTextView24, linearLayout13);
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

    public static k9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static k9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_dl_dashboard_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
