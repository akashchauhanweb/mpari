package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class l94 {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final ImageView D;
    public final ImageView E;
    public final CardView F;
    public final TextView G;
    public final ImageView H;
    public final d47 I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final TextView M;
    public final ImageView N;
    public final ImageView O;
    public final ScrollView a;
    public final CardView b;
    public final CardView c;
    public final CardView d;
    public final ImageView e;
    public final ImageView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public final ImageView m;
    public final ImageView n;
    public final CardView o;
    public final TextView p;
    public final ImageView q;
    public final ImageView r;
    public final TextView s;
    public final ImageView t;
    public final TextView u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final TextView z;

    public l94(ScrollView scrollView, CardView cardView, CardView cardView2, CardView cardView3, ImageView imageView, ImageView imageView2, TextView textView, ImageView imageView3, TextView textView2, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, CardView cardView4, TextView textView3, ImageView imageView9, ImageView imageView10, TextView textView4, ImageView imageView11, TextView textView5, ImageView imageView12, ImageView imageView13, ImageView imageView14, ImageView imageView15, TextView textView6, TextView textView7, ImageView imageView16, TextView textView8, ImageView imageView17, ImageView imageView18, CardView cardView5, TextView textView9, ImageView imageView19, d47 d47Var, TextView textView10, TextView textView11, ImageView imageView20, TextView textView12, ImageView imageView21, ImageView imageView22) {
        this.a = scrollView;
        this.b = cardView;
        this.c = cardView2;
        this.d = cardView3;
        this.e = imageView;
        this.f = imageView2;
        this.g = textView;
        this.h = imageView3;
        this.i = textView2;
        this.j = imageView4;
        this.k = imageView5;
        this.l = imageView6;
        this.m = imageView7;
        this.n = imageView8;
        this.o = cardView4;
        this.p = textView3;
        this.q = imageView9;
        this.r = imageView10;
        this.s = textView4;
        this.t = imageView11;
        this.u = textView5;
        this.v = imageView12;
        this.w = imageView13;
        this.x = imageView14;
        this.y = imageView15;
        this.z = textView6;
        this.A = textView7;
        this.B = imageView16;
        this.C = textView8;
        this.D = imageView17;
        this.E = imageView18;
        this.F = cardView5;
        this.G = textView9;
        this.H = imageView19;
        this.I = d47Var;
        this.J = textView10;
        this.K = textView11;
        this.L = imageView20;
        this.M = textView12;
        this.N = imageView21;
        this.O = imageView22;
    }

    public static l94 a(View view) {
        int i = R.id.card_challan;
        CardView cardView = (CardView) zp7.a(view, R.id.card_challan);
        if (cardView != null) {
            i = R.id.card_dl;
            CardView cardView2 = (CardView) zp7.a(view, R.id.card_dl);
            if (cardView2 != null) {
                i = R.id.card_vahan;
                CardView cardView3 = (CardView) zp7.a(view, R.id.card_vahan);
                if (cardView3 != null) {
                    i = R.id.challan_click;
                    ImageView imageView = (ImageView) zp7.a(view, R.id.challan_click);
                    if (imageView != null) {
                        i = R.id.challan_img;
                        ImageView imageView2 = (ImageView) zp7.a(view, R.id.challan_img);
                        if (imageView2 != null) {
                            i = R.id.challanReceiptTv;
                            TextView textView = (TextView) zp7.a(view, R.id.challanReceiptTv);
                            if (textView != null) {
                                i = R.id.challanReceiptTv_viewall;
                                ImageView imageView3 = (ImageView) zp7.a(view, R.id.challanReceiptTv_viewall);
                                if (imageView3 != null) {
                                    i = R.id.chlln_transaction;
                                    TextView textView2 = (TextView) zp7.a(view, R.id.chlln_transaction);
                                    if (textView2 != null) {
                                        i = R.id.dl_click;
                                        ImageView imageView4 = (ImageView) zp7.a(view, R.id.dl_click);
                                        if (imageView4 != null) {
                                            i = R.id.dl_history;
                                            ImageView imageView5 = (ImageView) zp7.a(view, R.id.dl_history);
                                            if (imageView5 != null) {
                                                i = R.id.dl_img;
                                                ImageView imageView6 = (ImageView) zp7.a(view, R.id.dl_img);
                                                if (imageView6 != null) {
                                                    i = R.id.dlImg;
                                                    ImageView imageView7 = (ImageView) zp7.a(view, R.id.dlImg);
                                                    if (imageView7 != null) {
                                                        i = R.id.dl_search_click;
                                                        ImageView imageView8 = (ImageView) zp7.a(view, R.id.dl_search_click);
                                                        if (imageView8 != null) {
                                                            i = R.id.dlSearchHistory;
                                                            CardView cardView4 = (CardView) zp7.a(view, R.id.dlSearchHistory);
                                                            if (cardView4 != null) {
                                                                i = R.id.dl_transaction;
                                                                TextView textView3 = (TextView) zp7.a(view, R.id.dl_transaction);
                                                                if (textView3 != null) {
                                                                    i = R.id.feeChallanImg;
                                                                    ImageView imageView9 = (ImageView) zp7.a(view, R.id.feeChallanImg);
                                                                    if (imageView9 != null) {
                                                                        i = R.id.feeDlImg;
                                                                        ImageView imageView10 = (ImageView) zp7.a(view, R.id.feeDlImg);
                                                                        if (imageView10 != null) {
                                                                            i = R.id.feeReceiptDlTv;
                                                                            TextView textView4 = (TextView) zp7.a(view, R.id.feeReceiptDlTv);
                                                                            if (textView4 != null) {
                                                                                i = R.id.feeReceiptDlTv_viewall;
                                                                                ImageView imageView11 = (ImageView) zp7.a(view, R.id.feeReceiptDlTv_viewall);
                                                                                if (imageView11 != null) {
                                                                                    i = R.id.feeReceiptTv;
                                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.feeReceiptTv);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.feeReceiptTv_viewall;
                                                                                        ImageView imageView12 = (ImageView) zp7.a(view, R.id.feeReceiptTv_viewall);
                                                                                        if (imageView12 != null) {
                                                                                            i = R.id.feeTaxImg;
                                                                                            ImageView imageView13 = (ImageView) zp7.a(view, R.id.feeTaxImg);
                                                                                            if (imageView13 != null) {
                                                                                                i = R.id.feeVehicleImg;
                                                                                                ImageView imageView14 = (ImageView) zp7.a(view, R.id.feeVehicleImg);
                                                                                                if (imageView14 != null) {
                                                                                                    i = R.id.img_vt;
                                                                                                    ImageView imageView15 = (ImageView) zp7.a(view, R.id.img_vt);
                                                                                                    if (imageView15 != null) {
                                                                                                        i = R.id.lic_histor_txt;
                                                                                                        TextView textView6 = (TextView) zp7.a(view, R.id.lic_histor_txt);
                                                                                                        if (textView6 != null) {
                                                                                                            i = R.id.myTransactions;
                                                                                                            TextView textView7 = (TextView) zp7.a(view, R.id.myTransactions);
                                                                                                            if (textView7 != null) {
                                                                                                                i = R.id.rc_history;
                                                                                                                ImageView imageView16 = (ImageView) zp7.a(view, R.id.rc_history);
                                                                                                                if (imageView16 != null) {
                                                                                                                    i = R.id.rc_history_txt;
                                                                                                                    TextView textView8 = (TextView) zp7.a(view, R.id.rc_history_txt);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i = R.id.rc_historyclick;
                                                                                                                        ImageView imageView17 = (ImageView) zp7.a(view, R.id.rc_historyclick);
                                                                                                                        if (imageView17 != null) {
                                                                                                                            i = R.id.rcImg;
                                                                                                                            ImageView imageView18 = (ImageView) zp7.a(view, R.id.rcImg);
                                                                                                                            if (imageView18 != null) {
                                                                                                                                i = R.id.rcSearchHistory;
                                                                                                                                CardView cardView5 = (CardView) zp7.a(view, R.id.rcSearchHistory);
                                                                                                                                if (cardView5 != null) {
                                                                                                                                    i = R.id.taxReceiptTv;
                                                                                                                                    TextView textView9 = (TextView) zp7.a(view, R.id.taxReceiptTv);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i = R.id.taxReceiptTv_viewall;
                                                                                                                                        ImageView imageView19 = (ImageView) zp7.a(view, R.id.taxReceiptTv_viewall);
                                                                                                                                        if (imageView19 != null) {
                                                                                                                                            i = R.id.topHolder;
                                                                                                                                            View viewA = zp7.a(view, R.id.topHolder);
                                                                                                                                            if (viewA != null) {
                                                                                                                                                d47 d47VarA = d47.a(viewA);
                                                                                                                                                i = R.id.vehicle_transaction;
                                                                                                                                                TextView textView10 = (TextView) zp7.a(view, R.id.vehicle_transaction);
                                                                                                                                                if (textView10 != null) {
                                                                                                                                                    i = R.id.virtualDLTv;
                                                                                                                                                    TextView textView11 = (TextView) zp7.a(view, R.id.virtualDLTv);
                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                        i = R.id.virtualDLTv_viewall;
                                                                                                                                                        ImageView imageView20 = (ImageView) zp7.a(view, R.id.virtualDLTv_viewall);
                                                                                                                                                        if (imageView20 != null) {
                                                                                                                                                            i = R.id.virtualRcTv;
                                                                                                                                                            TextView textView12 = (TextView) zp7.a(view, R.id.virtualRcTv);
                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                i = R.id.virtualRcTv_viewall;
                                                                                                                                                                ImageView imageView21 = (ImageView) zp7.a(view, R.id.virtualRcTv_viewall);
                                                                                                                                                                if (imageView21 != null) {
                                                                                                                                                                    i = R.id.vt_click;
                                                                                                                                                                    ImageView imageView22 = (ImageView) zp7.a(view, R.id.vt_click);
                                                                                                                                                                    if (imageView22 != null) {
                                                                                                                                                                        return new l94((ScrollView) view, cardView, cardView2, cardView3, imageView, imageView2, textView, imageView3, textView2, imageView4, imageView5, imageView6, imageView7, imageView8, cardView4, textView3, imageView9, imageView10, textView4, imageView11, textView5, imageView12, imageView13, imageView14, imageView15, textView6, textView7, imageView16, textView8, imageView17, imageView18, cardView5, textView9, imageView19, d47VarA, textView10, textView11, imageView20, textView12, imageView21, imageView22);
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

    public static l94 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static l94 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.new_my_doc_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
