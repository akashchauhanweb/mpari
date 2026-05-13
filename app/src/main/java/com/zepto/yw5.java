package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yw5 {
    public final RelativeLayout A;
    public final TextView B;
    public final ImageView C;
    public final d47 D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final ImageView H;
    public final ScrollView a;
    public final RelativeLayout b;
    public final CardView c;
    public final CardView d;
    public final CardView e;
    public final TextView f;
    public final ImageView g;
    public final ImageView h;
    public final ImageView i;
    public final ImageView j;
    public final CardView k;
    public final ImageView l;
    public final ImageView m;
    public final TextView n;
    public final ImageView o;
    public final TextView p;
    public final ImageView q;
    public final ImageView r;
    public final ImageView s;
    public final TextView t;
    public final TextView u;
    public final ImageView v;
    public final TextView w;
    public final ImageView x;
    public final ImageView y;
    public final CardView z;

    public yw5(ScrollView scrollView, RelativeLayout relativeLayout, CardView cardView, CardView cardView2, CardView cardView3, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, CardView cardView4, ImageView imageView5, ImageView imageView6, TextView textView2, ImageView imageView7, TextView textView3, ImageView imageView8, ImageView imageView9, ImageView imageView10, TextView textView4, TextView textView5, ImageView imageView11, TextView textView6, ImageView imageView12, ImageView imageView13, CardView cardView5, RelativeLayout relativeLayout2, TextView textView7, ImageView imageView14, d47 d47Var, TextView textView8, ImageView imageView15, TextView textView9, ImageView imageView16) {
        this.a = scrollView;
        this.b = relativeLayout;
        this.c = cardView;
        this.d = cardView2;
        this.e = cardView3;
        this.f = textView;
        this.g = imageView;
        this.h = imageView2;
        this.i = imageView3;
        this.j = imageView4;
        this.k = cardView4;
        this.l = imageView5;
        this.m = imageView6;
        this.n = textView2;
        this.o = imageView7;
        this.p = textView3;
        this.q = imageView8;
        this.r = imageView9;
        this.s = imageView10;
        this.t = textView4;
        this.u = textView5;
        this.v = imageView11;
        this.w = textView6;
        this.x = imageView12;
        this.y = imageView13;
        this.z = cardView5;
        this.A = relativeLayout2;
        this.B = textView7;
        this.C = imageView14;
        this.D = d47Var;
        this.E = textView8;
        this.F = imageView15;
        this.G = textView9;
        this.H = imageView16;
    }

    public static yw5 a(View view) {
        int i = R.id.buyer;
        RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.buyer);
        if (relativeLayout != null) {
            i = R.id.card_challan;
            CardView cardView = (CardView) zp7.a(view, R.id.card_challan);
            if (cardView != null) {
                i = R.id.card_dl;
                CardView cardView2 = (CardView) zp7.a(view, R.id.card_dl);
                if (cardView2 != null) {
                    i = R.id.card_vahan;
                    CardView cardView3 = (CardView) zp7.a(view, R.id.card_vahan);
                    if (cardView3 != null) {
                        i = R.id.challanReceiptTv;
                        TextView textView = (TextView) zp7.a(view, R.id.challanReceiptTv);
                        if (textView != null) {
                            i = R.id.challanReceiptTv_viewall;
                            ImageView imageView = (ImageView) zp7.a(view, R.id.challanReceiptTv_viewall);
                            if (imageView != null) {
                                i = R.id.dl_history;
                                ImageView imageView2 = (ImageView) zp7.a(view, R.id.dl_history);
                                if (imageView2 != null) {
                                    i = R.id.dlImg;
                                    ImageView imageView3 = (ImageView) zp7.a(view, R.id.dlImg);
                                    if (imageView3 != null) {
                                        i = R.id.dl_search_click;
                                        ImageView imageView4 = (ImageView) zp7.a(view, R.id.dl_search_click);
                                        if (imageView4 != null) {
                                            i = R.id.dlSearchHistory;
                                            CardView cardView4 = (CardView) zp7.a(view, R.id.dlSearchHistory);
                                            if (cardView4 != null) {
                                                i = R.id.feeChallanImg;
                                                ImageView imageView5 = (ImageView) zp7.a(view, R.id.feeChallanImg);
                                                if (imageView5 != null) {
                                                    i = R.id.feeDlImg;
                                                    ImageView imageView6 = (ImageView) zp7.a(view, R.id.feeDlImg);
                                                    if (imageView6 != null) {
                                                        i = R.id.feeReceiptDlTv;
                                                        TextView textView2 = (TextView) zp7.a(view, R.id.feeReceiptDlTv);
                                                        if (textView2 != null) {
                                                            i = R.id.feeReceiptDlTv_viewall;
                                                            ImageView imageView7 = (ImageView) zp7.a(view, R.id.feeReceiptDlTv_viewall);
                                                            if (imageView7 != null) {
                                                                i = R.id.feeReceiptTv;
                                                                TextView textView3 = (TextView) zp7.a(view, R.id.feeReceiptTv);
                                                                if (textView3 != null) {
                                                                    i = R.id.feeReceiptTv_viewall;
                                                                    ImageView imageView8 = (ImageView) zp7.a(view, R.id.feeReceiptTv_viewall);
                                                                    if (imageView8 != null) {
                                                                        i = R.id.feeTaxImg;
                                                                        ImageView imageView9 = (ImageView) zp7.a(view, R.id.feeTaxImg);
                                                                        if (imageView9 != null) {
                                                                            i = R.id.feeVehicleImg;
                                                                            ImageView imageView10 = (ImageView) zp7.a(view, R.id.feeVehicleImg);
                                                                            if (imageView10 != null) {
                                                                                i = R.id.lic_histor_txt;
                                                                                TextView textView4 = (TextView) zp7.a(view, R.id.lic_histor_txt);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.myTransactions;
                                                                                    TextView textView5 = (TextView) zp7.a(view, R.id.myTransactions);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.rc_history;
                                                                                        ImageView imageView11 = (ImageView) zp7.a(view, R.id.rc_history);
                                                                                        if (imageView11 != null) {
                                                                                            i = R.id.rc_history_txt;
                                                                                            TextView textView6 = (TextView) zp7.a(view, R.id.rc_history_txt);
                                                                                            if (textView6 != null) {
                                                                                                i = R.id.rc_historyclick;
                                                                                                ImageView imageView12 = (ImageView) zp7.a(view, R.id.rc_historyclick);
                                                                                                if (imageView12 != null) {
                                                                                                    i = R.id.rcImg;
                                                                                                    ImageView imageView13 = (ImageView) zp7.a(view, R.id.rcImg);
                                                                                                    if (imageView13 != null) {
                                                                                                        i = R.id.rcSearchHistory;
                                                                                                        CardView cardView5 = (CardView) zp7.a(view, R.id.rcSearchHistory);
                                                                                                        if (cardView5 != null) {
                                                                                                            i = R.id.seller;
                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) zp7.a(view, R.id.seller);
                                                                                                            if (relativeLayout2 != null) {
                                                                                                                i = R.id.taxReceiptTv;
                                                                                                                TextView textView7 = (TextView) zp7.a(view, R.id.taxReceiptTv);
                                                                                                                if (textView7 != null) {
                                                                                                                    i = R.id.taxReceiptTv_viewall;
                                                                                                                    ImageView imageView14 = (ImageView) zp7.a(view, R.id.taxReceiptTv_viewall);
                                                                                                                    if (imageView14 != null) {
                                                                                                                        i = R.id.topHolder;
                                                                                                                        View viewA = zp7.a(view, R.id.topHolder);
                                                                                                                        if (viewA != null) {
                                                                                                                            d47 d47VarA = d47.a(viewA);
                                                                                                                            i = R.id.virtualDLTv;
                                                                                                                            TextView textView8 = (TextView) zp7.a(view, R.id.virtualDLTv);
                                                                                                                            if (textView8 != null) {
                                                                                                                                i = R.id.virtualDLTv_viewall;
                                                                                                                                ImageView imageView15 = (ImageView) zp7.a(view, R.id.virtualDLTv_viewall);
                                                                                                                                if (imageView15 != null) {
                                                                                                                                    i = R.id.virtualRcTv;
                                                                                                                                    TextView textView9 = (TextView) zp7.a(view, R.id.virtualRcTv);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i = R.id.virtualRcTv_viewall;
                                                                                                                                        ImageView imageView16 = (ImageView) zp7.a(view, R.id.virtualRcTv_viewall);
                                                                                                                                        if (imageView16 != null) {
                                                                                                                                            return new yw5((ScrollView) view, relativeLayout, cardView, cardView2, cardView3, textView, imageView, imageView2, imageView3, imageView4, cardView4, imageView5, imageView6, textView2, imageView7, textView3, imageView8, imageView9, imageView10, textView4, textView5, imageView11, textView6, imageView12, imageView13, cardView5, relativeLayout2, textView7, imageView14, d47VarA, textView8, imageView15, textView9, imageView16);
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

    public static yw5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static yw5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.seller_buyer_selection_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
