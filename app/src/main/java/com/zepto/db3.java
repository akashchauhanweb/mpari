package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class db3 {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final View D;
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final LinearLayout H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final LinearLayout M;
    public final ImageView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;
    public final RelativeLayout R;
    public final RelativeLayout S;
    public final RelativeLayout T;
    public final RelativeLayout U;
    public final LinearLayout V;
    public final TextView W;
    public final TextView X;
    public final LinearLayout Y;
    public final TextView Z;
    public final CoordinatorLayout a;
    public final TextView a0;
    public final TextView b;
    public final TextView b0;
    public final TextView c;
    public final LinearLayout c0;
    public final TextView d;
    public final ImageView d0;
    public final TextView e;
    public final TextView e0;
    public final TextView f;
    public final LinearLayout g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final d47 k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final LinearLayout p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final ImageView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final ImageView x;
    public final ImageView y;
    public final ImageView z;

    public db3(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, TextView textView6, TextView textView7, TextView textView8, d47 d47Var, TextView textView9, TextView textView10, TextView textView11, TextView textView12, LinearLayout linearLayout2, TextView textView13, TextView textView14, TextView textView15, ImageView imageView, TextView textView16, TextView textView17, TextView textView18, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, View view, LinearLayout linearLayout3, TextView textView19, TextView textView20, LinearLayout linearLayout4, TextView textView21, TextView textView22, TextView textView23, TextView textView24, LinearLayout linearLayout5, ImageView imageView8, TextView textView25, TextView textView26, TextView textView27, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout6, TextView textView28, TextView textView29, LinearLayout linearLayout7, TextView textView30, TextView textView31, TextView textView32, LinearLayout linearLayout8, ImageView imageView9, TextView textView33) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.g = linearLayout;
        this.h = textView6;
        this.i = textView7;
        this.j = textView8;
        this.k = d47Var;
        this.l = textView9;
        this.m = textView10;
        this.n = textView11;
        this.o = textView12;
        this.p = linearLayout2;
        this.q = textView13;
        this.r = textView14;
        this.s = textView15;
        this.t = imageView;
        this.u = textView16;
        this.v = textView17;
        this.w = textView18;
        this.x = imageView2;
        this.y = imageView3;
        this.z = imageView4;
        this.A = imageView5;
        this.B = imageView6;
        this.C = imageView7;
        this.D = view;
        this.E = linearLayout3;
        this.F = textView19;
        this.G = textView20;
        this.H = linearLayout4;
        this.I = textView21;
        this.J = textView22;
        this.K = textView23;
        this.L = textView24;
        this.M = linearLayout5;
        this.N = imageView8;
        this.O = textView25;
        this.P = textView26;
        this.Q = textView27;
        this.R = relativeLayout;
        this.S = relativeLayout2;
        this.T = relativeLayout3;
        this.U = relativeLayout4;
        this.V = linearLayout6;
        this.W = textView28;
        this.X = textView29;
        this.Y = linearLayout7;
        this.Z = textView30;
        this.a0 = textView31;
        this.b0 = textView32;
        this.c0 = linearLayout8;
        this.d0 = imageView9;
        this.e0 = textView33;
    }

    public static db3 a(View view) {
        int i = R.id.RTO;
        TextView textView = (TextView) zp7.a(view, R.id.RTO);
        if (textView != null) {
            i = R.id.appStatus;
            TextView textView2 = (TextView) zp7.a(view, R.id.appStatus);
            if (textView2 != null) {
                i = R.id.applDateTv;
                TextView textView3 = (TextView) zp7.a(view, R.id.applDateTv);
                if (textView3 != null) {
                    i = R.id.applNoTv;
                    TextView textView4 = (TextView) zp7.a(view, R.id.applNoTv);
                    if (textView4 != null) {
                        i = R.id.applica_date;
                        TextView textView5 = (TextView) zp7.a(view, R.id.applica_date);
                        if (textView5 != null) {
                            i = R.id.applicantLl;
                            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.applicantLl);
                            if (linearLayout != null) {
                                i = R.id.applicantNameTv;
                                TextView textView6 = (TextView) zp7.a(view, R.id.applicantNameTv);
                                if (textView6 != null) {
                                    i = R.id.applicatName;
                                    TextView textView7 = (TextView) zp7.a(view, R.id.applicatName);
                                    if (textView7 != null) {
                                        i = R.id.applicationNo;
                                        TextView textView8 = (TextView) zp7.a(view, R.id.applicationNo);
                                        if (textView8 != null) {
                                            i = R.id.applicationStatusHeader;
                                            View viewA = zp7.a(view, R.id.applicationStatusHeader);
                                            if (viewA != null) {
                                                d47 d47VarA = d47.a(viewA);
                                                i = R.id.applied_Service;
                                                TextView textView9 = (TextView) zp7.a(view, R.id.applied_Service);
                                                if (textView9 != null) {
                                                    i = R.id.circle_image_one;
                                                    TextView textView10 = (TextView) zp7.a(view, R.id.circle_image_one);
                                                    if (textView10 != null) {
                                                        i = R.id.circle_image_three;
                                                        TextView textView11 = (TextView) zp7.a(view, R.id.circle_image_three);
                                                        if (textView11 != null) {
                                                            i = R.id.circle_image_two;
                                                            TextView textView12 = (TextView) zp7.a(view, R.id.circle_image_two);
                                                            if (textView12 != null) {
                                                                i = R.id.fee_layout;
                                                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.fee_layout);
                                                                if (linearLayout2 != null) {
                                                                    i = R.id.fee_payment;
                                                                    TextView textView13 = (TextView) zp7.a(view, R.id.fee_payment);
                                                                    if (textView13 != null) {
                                                                        i = R.id.feePaymentStatus;
                                                                        TextView textView14 = (TextView) zp7.a(view, R.id.feePaymentStatus);
                                                                        if (textView14 != null) {
                                                                            i = R.id.fee_payment_title;
                                                                            TextView textView15 = (TextView) zp7.a(view, R.id.fee_payment_title);
                                                                            if (textView15 != null) {
                                                                                i = R.id.fee_success;
                                                                                ImageView imageView = (ImageView) zp7.a(view, R.id.fee_success);
                                                                                if (imageView != null) {
                                                                                    i = R.id.fee_text;
                                                                                    TextView textView16 = (TextView) zp7.a(view, R.id.fee_text);
                                                                                    if (textView16 != null) {
                                                                                        i = R.id.finalSubmitStatus;
                                                                                        TextView textView17 = (TextView) zp7.a(view, R.id.finalSubmitStatus);
                                                                                        if (textView17 != null) {
                                                                                            i = R.id.idLayoutTitle;
                                                                                            TextView textView18 = (TextView) zp7.a(view, R.id.idLayoutTitle);
                                                                                            if (textView18 != null) {
                                                                                                i = R.id.id_statusDocumentDownload;
                                                                                                ImageView imageView2 = (ImageView) zp7.a(view, R.id.id_statusDocumentDownload);
                                                                                                if (imageView2 != null) {
                                                                                                    i = R.id.ivCircle;
                                                                                                    ImageView imageView3 = (ImageView) zp7.a(view, R.id.ivCircle);
                                                                                                    if (imageView3 != null) {
                                                                                                        i = R.id.ivCircle1;
                                                                                                        ImageView imageView4 = (ImageView) zp7.a(view, R.id.ivCircle1);
                                                                                                        if (imageView4 != null) {
                                                                                                            i = R.id.ivCircle2;
                                                                                                            ImageView imageView5 = (ImageView) zp7.a(view, R.id.ivCircle2);
                                                                                                            if (imageView5 != null) {
                                                                                                                i = R.id.ivCircle3;
                                                                                                                ImageView imageView6 = (ImageView) zp7.a(view, R.id.ivCircle3);
                                                                                                                if (imageView6 != null) {
                                                                                                                    i = R.id.ivCircle5;
                                                                                                                    ImageView imageView7 = (ImageView) zp7.a(view, R.id.ivCircle5);
                                                                                                                    if (imageView7 != null) {
                                                                                                                        i = R.id.lineView_One;
                                                                                                                        View viewA2 = zp7.a(view, R.id.lineView_One);
                                                                                                                        if (viewA2 != null) {
                                                                                                                            i = R.id.parent_layout;
                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.parent_layout);
                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                i = R.id.registration_no;
                                                                                                                                TextView textView19 = (TextView) zp7.a(view, R.id.registration_no);
                                                                                                                                if (textView19 != null) {
                                                                                                                                    i = R.id.registrationNoValue;
                                                                                                                                    TextView textView20 = (TextView) zp7.a(view, R.id.registrationNoValue);
                                                                                                                                    if (textView20 != null) {
                                                                                                                                        i = R.id.rto_linear;
                                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.rto_linear);
                                                                                                                                        if (linearLayout4 != null) {
                                                                                                                                            i = R.id.rto_offic;
                                                                                                                                            TextView textView21 = (TextView) zp7.a(view, R.id.rto_offic);
                                                                                                                                            if (textView21 != null) {
                                                                                                                                                i = R.id.slotBookingStatus;
                                                                                                                                                TextView textView22 = (TextView) zp7.a(view, R.id.slotBookingStatus);
                                                                                                                                                if (textView22 != null) {
                                                                                                                                                    i = R.id.slot_booking_titlr;
                                                                                                                                                    TextView textView23 = (TextView) zp7.a(view, R.id.slot_booking_titlr);
                                                                                                                                                    if (textView23 != null) {
                                                                                                                                                        i = R.id.slot_button;
                                                                                                                                                        TextView textView24 = (TextView) zp7.a(view, R.id.slot_button);
                                                                                                                                                        if (textView24 != null) {
                                                                                                                                                            i = R.id.slot_layout;
                                                                                                                                                            LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.slot_layout);
                                                                                                                                                            if (linearLayout5 != null) {
                                                                                                                                                                i = R.id.slot_succuss;
                                                                                                                                                                ImageView imageView8 = (ImageView) zp7.a(view, R.id.slot_succuss);
                                                                                                                                                                if (imageView8 != null) {
                                                                                                                                                                    i = R.id.slot_text;
                                                                                                                                                                    TextView textView25 = (TextView) zp7.a(view, R.id.slot_text);
                                                                                                                                                                    if (textView25 != null) {
                                                                                                                                                                        i = R.id.state_name;
                                                                                                                                                                        TextView textView26 = (TextView) zp7.a(view, R.id.state_name);
                                                                                                                                                                        if (textView26 != null) {
                                                                                                                                                                            i = R.id.stateNameTv;
                                                                                                                                                                            TextView textView27 = (TextView) zp7.a(view, R.id.stateNameTv);
                                                                                                                                                                            if (textView27 != null) {
                                                                                                                                                                                i = R.id.status_four;
                                                                                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.status_four);
                                                                                                                                                                                if (relativeLayout != null) {
                                                                                                                                                                                    i = R.id.status_one;
                                                                                                                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) zp7.a(view, R.id.status_one);
                                                                                                                                                                                    if (relativeLayout2 != null) {
                                                                                                                                                                                        i = R.id.status_three;
                                                                                                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) zp7.a(view, R.id.status_three);
                                                                                                                                                                                        if (relativeLayout3 != null) {
                                                                                                                                                                                            i = R.id.status_two;
                                                                                                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) zp7.a(view, R.id.status_two);
                                                                                                                                                                                            if (relativeLayout4 != null) {
                                                                                                                                                                                                i = R.id.transAppliedLl;
                                                                                                                                                                                                LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.transAppliedLl);
                                                                                                                                                                                                if (linearLayout6 != null) {
                                                                                                                                                                                                    i = R.id.trans_apply;
                                                                                                                                                                                                    TextView textView28 = (TextView) zp7.a(view, R.id.trans_apply);
                                                                                                                                                                                                    if (textView28 != null) {
                                                                                                                                                                                                        i = R.id.trans_status;
                                                                                                                                                                                                        TextView textView29 = (TextView) zp7.a(view, R.id.trans_status);
                                                                                                                                                                                                        if (textView29 != null) {
                                                                                                                                                                                                            i = R.id.transStatusLl;
                                                                                                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) zp7.a(view, R.id.transStatusLl);
                                                                                                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                                                                                                i = R.id.upload_button;
                                                                                                                                                                                                                TextView textView30 = (TextView) zp7.a(view, R.id.upload_button);
                                                                                                                                                                                                                if (textView30 != null) {
                                                                                                                                                                                                                    i = R.id.upload_doc_title;
                                                                                                                                                                                                                    TextView textView31 = (TextView) zp7.a(view, R.id.upload_doc_title);
                                                                                                                                                                                                                    if (textView31 != null) {
                                                                                                                                                                                                                        i = R.id.uploadDocumentStatus;
                                                                                                                                                                                                                        TextView textView32 = (TextView) zp7.a(view, R.id.uploadDocumentStatus);
                                                                                                                                                                                                                        if (textView32 != null) {
                                                                                                                                                                                                                            i = R.id.upload_layout;
                                                                                                                                                                                                                            LinearLayout linearLayout8 = (LinearLayout) zp7.a(view, R.id.upload_layout);
                                                                                                                                                                                                                            if (linearLayout8 != null) {
                                                                                                                                                                                                                                i = R.id.upload_succuss;
                                                                                                                                                                                                                                ImageView imageView9 = (ImageView) zp7.a(view, R.id.upload_succuss);
                                                                                                                                                                                                                                if (imageView9 != null) {
                                                                                                                                                                                                                                    i = R.id.upload_txt;
                                                                                                                                                                                                                                    TextView textView33 = (TextView) zp7.a(view, R.id.upload_txt);
                                                                                                                                                                                                                                    if (textView33 != null) {
                                                                                                                                                                                                                                        return new db3((CoordinatorLayout) view, textView, textView2, textView3, textView4, textView5, linearLayout, textView6, textView7, textView8, d47VarA, textView9, textView10, textView11, textView12, linearLayout2, textView13, textView14, textView15, imageView, textView16, textView17, textView18, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, viewA2, linearLayout3, textView19, textView20, linearLayout4, textView21, textView22, textView23, textView24, linearLayout5, imageView8, textView25, textView26, textView27, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout6, textView28, textView29, linearLayout7, textView30, textView31, textView32, linearLayout8, imageView9, textView33);
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

    public static db3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static db3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_aplication_transaction_status, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
