package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class wc extends vc {
    public static final SparseIntArray E0;
    public final LinearLayout A0;
    public final LinearLayout B0;
    public final bs4 C0;
    public long D0;
    public final CoordinatorLayout z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(R.id.txtservicename, 3);
        sparseIntArray.put(R.id.txt_dl_no, 5);
        sparseIntArray.put(R.id.image_cross, 6);
        sparseIntArray.put(R.id.select_service, 7);
        sparseIntArray.put(R.id.icon_image, 8);
        sparseIntArray.put(R.id.round_card_view, 9);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 10);
        sparseIntArray.put(R.id.tv_renewal_dl_title, 11);
        sparseIntArray.put(R.id.tv_personal_info_title, 12);
        sparseIntArray.put(R.id.per_up_arrow, 13);
        sparseIntArray.put(R.id.per_down_arrow, 14);
        sparseIntArray.put(R.id.ll_personal_details, 15);
        sparseIntArray.put(R.id.tv_dl_holder_name, 16);
        sparseIntArray.put(R.id.txt_dl_holder_name, 17);
        sparseIntArray.put(R.id.tv_father_name, 18);
        sparseIntArray.put(R.id.txt_dl_father_name, 19);
        sparseIntArray.put(R.id.tv_dob, 20);
        sparseIntArray.put(R.id.txt_dl_holder_dob, 21);
        sparseIntArray.put(R.id.tv_blood_group, 22);
        sparseIntArray.put(R.id.txt_dl_blood_group, 23);
        sparseIntArray.put(R.id.tv_perm_addr, 24);
        sparseIntArray.put(R.id.txt_dl_address, 25);
        sparseIntArray.put(R.id.tv_dl_info_title, 26);
        sparseIntArray.put(R.id.dl_up_arrow, 27);
        sparseIntArray.put(R.id.dl_down_arrow, 28);
        sparseIntArray.put(R.id.ll_licence_details, 29);
        sparseIntArray.put(R.id.tv_dl_issue_date, 30);
        sparseIntArray.put(R.id.txt_dl_issue_date, 31);
        sparseIntArray.put(R.id.tv_nt_valid_upto, 32);
        sparseIntArray.put(R.id.txt_dl_nt_valid, 33);
        sparseIntArray.put(R.id.tv_last_endor_state, 34);
        sparseIntArray.put(R.id.txt_dl_last_state, 35);
        sparseIntArray.put(R.id.tv_last_endor_rto, 36);
        sparseIntArray.put(R.id.txt_dl_last_rto, 37);
        sparseIntArray.put(R.id.tv_class_vehicle_title, 38);
        sparseIntArray.put(R.id.vc_up_arrow, 39);
        sparseIntArray.put(R.id.vc_down_arrow, 40);
        sparseIntArray.put(R.id.lmvHolder, 41);
        sparseIntArray.put(R.id.txt_cov, 42);
        sparseIntArray.put(R.id.vehicle_Details_Cv, 43);
        sparseIntArray.put(R.id.new_driving_license_header, 44);
        sparseIntArray.put(R.id.down_arrow, 45);
        sparseIntArray.put(R.id.btn_drop_down, 46);
        sparseIntArray.put(R.id.dl_personal_info_linear, 47);
        sparseIntArray.put(R.id.tv_dl_hol_name, 48);
        sparseIntArray.put(R.id.dl_holder_name, 49);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 50);
        sparseIntArray.put(R.id.holder_father_name, 51);
        sparseIntArray.put(R.id.tv_dl_dob, 52);
        sparseIntArray.put(R.id.dl_dob, 53);
        sparseIntArray.put(R.id.tv_dl_blood_group, 54);
        sparseIntArray.put(R.id.blood_group, 55);
        sparseIntArray.put(R.id.tv_present_addr, 56);
        sparseIntArray.put(R.id.present_address_txt, 57);
        sparseIntArray.put(R.id.next_request, 58);
    }

    public wc(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 59, null, E0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.D0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.D0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.D0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wc(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[55];
        AppCompatButton appCompatButton = (AppCompatButton) objArr[46];
        TextView textView2 = (TextView) objArr[53];
        ImageView imageView = (ImageView) objArr[28];
        TextView textView3 = (TextView) objArr[49];
        LinearLayout linearLayout = (LinearLayout) objArr[47];
        ImageView imageView2 = (ImageView) objArr[27];
        ImageView imageView3 = (ImageView) objArr[45];
        TextView textView4 = (TextView) objArr[51];
        CardView cardView = (CardView) objArr[8];
        ImageView imageView4 = (ImageView) objArr[6];
        ImageView imageView5 = (ImageView) objArr[10];
        LinearLayout linearLayout2 = (LinearLayout) objArr[29];
        LinearLayout linearLayout3 = (LinearLayout) objArr[15];
        LinearLayout linearLayout4 = (LinearLayout) objArr[41];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[44];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[58];
        ImageView imageView6 = (ImageView) objArr[14];
        ImageView imageView7 = (ImageView) objArr[13];
        TextView textView5 = (TextView) objArr[57];
        CardView cardView2 = (CardView) objArr[9];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[7];
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[22];
        TextView textView6 = (TextView) objArr[38];
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[54];
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) objArr[52];
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) objArr[48];
        AppCompatTextView appCompatTextView7 = (AppCompatTextView) objArr[16];
        TextView textView7 = (TextView) objArr[26];
        AppCompatTextView appCompatTextView8 = (AppCompatTextView) objArr[30];
        AppCompatTextView appCompatTextView9 = (AppCompatTextView) objArr[20];
        AppCompatTextView appCompatTextView10 = (AppCompatTextView) objArr[18];
        AppCompatTextView appCompatTextView11 = (AppCompatTextView) objArr[36];
        AppCompatTextView appCompatTextView12 = (AppCompatTextView) objArr[34];
        AppCompatTextView appCompatTextView13 = (AppCompatTextView) objArr[32];
        AppCompatTextView appCompatTextView14 = (AppCompatTextView) objArr[24];
        TextView textView8 = (TextView) objArr[12];
        AppCompatTextView appCompatTextView15 = (AppCompatTextView) objArr[56];
        AppCompatTextView appCompatTextView16 = (AppCompatTextView) objArr[11];
        AppCompatTextView appCompatTextView17 = (AppCompatTextView) objArr[50];
        AppCompatTextView appCompatTextView18 = (AppCompatTextView) objArr[42];
        AppCompatTextView appCompatTextView19 = (AppCompatTextView) objArr[25];
        AppCompatTextView appCompatTextView20 = (AppCompatTextView) objArr[23];
        AppCompatTextView appCompatTextView21 = (AppCompatTextView) objArr[19];
        AppCompatTextView appCompatTextView22 = (AppCompatTextView) objArr[21];
        AppCompatTextView appCompatTextView23 = (AppCompatTextView) objArr[17];
        AppCompatTextView appCompatTextView24 = (AppCompatTextView) objArr[31];
        AppCompatTextView appCompatTextView25 = (AppCompatTextView) objArr[37];
        AppCompatTextView appCompatTextView26 = (AppCompatTextView) objArr[35];
        TextView textView9 = (TextView) objArr[5];
        AppCompatTextView appCompatTextView27 = (AppCompatTextView) objArr[33];
        Object obj = objArr[3];
        super(jd1Var, view, 0, textView, appCompatButton, textView2, imageView, textView3, linearLayout, imageView2, imageView3, textView4, cardView, imageView4, imageView5, linearLayout2, linearLayout3, linearLayout4, appCompatTextView, customWegetLayout, imageView6, imageView7, textView5, cardView2, appCompatTextView2, appCompatTextView3, textView6, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, textView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, textView8, appCompatTextView15, appCompatTextView16, appCompatTextView17, appCompatTextView18, appCompatTextView19, appCompatTextView20, appCompatTextView21, appCompatTextView22, appCompatTextView23, appCompatTextView24, appCompatTextView25, appCompatTextView26, textView9, appCompatTextView27, obj != null ? vy3.a((View) obj) : null, (ImageView) objArr[40], (ImageView) objArr[39], (CardView) objArr[43]);
        this.D0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.z0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout5 = (LinearLayout) objArr[1];
        this.A0 = linearLayout5;
        linearLayout5.setTag(null);
        LinearLayout linearLayout6 = (LinearLayout) objArr[2];
        this.B0 = linearLayout6;
        linearLayout6.setTag(null);
        Object obj2 = objArr[4];
        this.C0 = obj2 != null ? bs4.a((View) obj2) : null;
        w(view);
        z();
    }
}
