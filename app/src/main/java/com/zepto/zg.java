package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class zg extends yg {
    public static final SparseIntArray r0;
    public final CoordinatorLayout m0;
    public final LinearLayout n0;
    public final LinearLayout o0;
    public final bs4 p0;
    public long q0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        r0 = sparseIntArray;
        sparseIntArray.put(R.id.txtservicename, 3);
        sparseIntArray.put(R.id.txt_dl_no, 5);
        sparseIntArray.put(R.id.round_card_view_in, 6);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon_in, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.tv_renewal_dl_title, 9);
        sparseIntArray.put(R.id.tv_personal_info_title, 10);
        sparseIntArray.put(R.id.per_up_arrow, 11);
        sparseIntArray.put(R.id.per_down_arrow, 12);
        sparseIntArray.put(R.id.ll_personal_details, 13);
        sparseIntArray.put(R.id.tv_dl_holder_name, 14);
        sparseIntArray.put(R.id.txt_dl_holder_name, 15);
        sparseIntArray.put(R.id.txt_dob, 16);
        sparseIntArray.put(R.id.txt_dob_value, 17);
        sparseIntArray.put(R.id.tv_rel, 18);
        sparseIntArray.put(R.id.txt_relation, 19);
        sparseIntArray.put(R.id.tv_gen, 20);
        sparseIntArray.put(R.id.txt_gender, 21);
        sparseIntArray.put(R.id.tv_dl_info_title, 22);
        sparseIntArray.put(R.id.dl_up_arrow, 23);
        sparseIntArray.put(R.id.dl_down_arrow, 24);
        sparseIntArray.put(R.id.ll_licence_details, 25);
        sparseIntArray.put(R.id.tv_hs, 26);
        sparseIntArray.put(R.id.tv_hs_val, 27);
        sparseIntArray.put(R.id.tv_street, 28);
        sparseIntArray.put(R.id.tv_street_val, 29);
        sparseIntArray.put(R.id.tv_loc, 30);
        sparseIntArray.put(R.id.tv_loc_val, 31);
        sparseIntArray.put(R.id.tv_land, 32);
        sparseIntArray.put(R.id.tv_land_val, 33);
        sparseIntArray.put(R.id.tv_vtc, 34);
        sparseIntArray.put(R.id.tv_vtc_val, 35);
        sparseIntArray.put(R.id.tv_pin, 36);
        sparseIntArray.put(R.id.tv_pin_val, 37);
        sparseIntArray.put(R.id.user_dis_text, 38);
        sparseIntArray.put(R.id.user_dis_val, 39);
        sparseIntArray.put(R.id.user_state_text, 40);
        sparseIntArray.put(R.id.user_state, 41);
        sparseIntArray.put(R.id.user_count_text, 42);
        sparseIntArray.put(R.id.user_count, 43);
        sparseIntArray.put(R.id.close_request, 44);
        sparseIntArray.put(R.id.next_request, 45);
    }

    public zg(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 46, null, r0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.q0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.q0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.q0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zg(jd1 jd1Var, View view, Object[] objArr) {
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[44];
        ImageView imageView = (ImageView) objArr[24];
        ImageView imageView2 = (ImageView) objArr[23];
        ImageView imageView3 = (ImageView) objArr[7];
        LinearLayout linearLayout = (LinearLayout) objArr[25];
        LinearLayout linearLayout2 = (LinearLayout) objArr[13];
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) objArr[45];
        ImageView imageView4 = (ImageView) objArr[12];
        ImageView imageView5 = (ImageView) objArr[11];
        CardView cardView = (CardView) objArr[6];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[8];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[14];
        TextView textView = (TextView) objArr[22];
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[20];
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[26];
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) objArr[27];
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) objArr[32];
        AppCompatTextView appCompatTextView7 = (AppCompatTextView) objArr[33];
        AppCompatTextView appCompatTextView8 = (AppCompatTextView) objArr[30];
        AppCompatTextView appCompatTextView9 = (AppCompatTextView) objArr[31];
        TextView textView2 = (TextView) objArr[10];
        AppCompatTextView appCompatTextView10 = (AppCompatTextView) objArr[36];
        AppCompatTextView appCompatTextView11 = (AppCompatTextView) objArr[37];
        AppCompatTextView appCompatTextView12 = (AppCompatTextView) objArr[18];
        AppCompatTextView appCompatTextView13 = (AppCompatTextView) objArr[9];
        AppCompatTextView appCompatTextView14 = (AppCompatTextView) objArr[28];
        AppCompatTextView appCompatTextView15 = (AppCompatTextView) objArr[29];
        AppCompatTextView appCompatTextView16 = (AppCompatTextView) objArr[34];
        AppCompatTextView appCompatTextView17 = (AppCompatTextView) objArr[35];
        AppCompatTextView appCompatTextView18 = (AppCompatTextView) objArr[15];
        TextView textView3 = (TextView) objArr[5];
        AppCompatTextView appCompatTextView19 = (AppCompatTextView) objArr[16];
        AppCompatTextView appCompatTextView20 = (AppCompatTextView) objArr[17];
        AppCompatTextView appCompatTextView21 = (AppCompatTextView) objArr[21];
        AppCompatTextView appCompatTextView22 = (AppCompatTextView) objArr[19];
        Object obj = objArr[3];
        super(jd1Var, view, 0, customWegetLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, customWegetLayout2, imageView4, imageView5, cardView, appCompatTextView, appCompatTextView2, textView, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, textView2, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, appCompatTextView15, appCompatTextView16, appCompatTextView17, appCompatTextView18, textView3, appCompatTextView19, appCompatTextView20, appCompatTextView21, appCompatTextView22, obj != null ? vy3.a((View) obj) : null, (AppCompatTextView) objArr[43], (AppCompatTextView) objArr[42], (AppCompatTextView) objArr[38], (AppCompatTextView) objArr[39], (AppCompatTextView) objArr[41], (AppCompatTextView) objArr[40]);
        this.q0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.m0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[1];
        this.n0 = linearLayout3;
        linearLayout3.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[2];
        this.o0 = linearLayout4;
        linearLayout4.setTag(null);
        Object obj2 = objArr[4];
        this.p0 = obj2 != null ? bs4.a((View) obj2) : null;
        w(view);
        z();
    }
}
