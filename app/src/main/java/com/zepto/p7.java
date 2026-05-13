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
public class p7 extends o7 {
    public static final SparseIntArray x0;
    public final CoordinatorLayout s0;
    public final LinearLayout t0;
    public final LinearLayout u0;
    public final bs4 v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.txtservicename, 4);
        sparseIntArray.put(R.id.txt_dl_no, 6);
        sparseIntArray.put(R.id.image_cross, 7);
        sparseIntArray.put(R.id.tv_renewal_dl_title, 8);
        sparseIntArray.put(R.id.select_service, 9);
        sparseIntArray.put(R.id.icon_image, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.round_card_view, 12);
        sparseIntArray.put(R.id.tv_personal_info_title, 13);
        sparseIntArray.put(R.id.per_up_arrow, 14);
        sparseIntArray.put(R.id.per_down_arrow, 15);
        sparseIntArray.put(R.id.ll_personal_details, 16);
        sparseIntArray.put(R.id.tv_dl_holder_name, 17);
        sparseIntArray.put(R.id.txt_dl_holder_name, 18);
        sparseIntArray.put(R.id.tv_father_name, 19);
        sparseIntArray.put(R.id.txt_dl_father_name, 20);
        sparseIntArray.put(R.id.tv_dob, 21);
        sparseIntArray.put(R.id.txt_dl_holder_dob, 22);
        sparseIntArray.put(R.id.tv_perm_addr, 23);
        sparseIntArray.put(R.id.txt_dl_address, 24);
        sparseIntArray.put(R.id.tv_dl_info_title, 25);
        sparseIntArray.put(R.id.dl_up_arrow, 26);
        sparseIntArray.put(R.id.dl_down_arrow, 27);
        sparseIntArray.put(R.id.ll_licence_details, 28);
        sparseIntArray.put(R.id.tv_nt_valid_upto, 29);
        sparseIntArray.put(R.id.txt_valid, 30);
        sparseIntArray.put(R.id.tv_issue_authority, 31);
        sparseIntArray.put(R.id.txt_authority, 32);
        sparseIntArray.put(R.id.tv_last_endor_rto, 33);
        sparseIntArray.put(R.id.txt_status, 34);
        sparseIntArray.put(R.id.lmvHolder, 35);
        sparseIntArray.put(R.id.vehicle_Details_Cv, 36);
        sparseIntArray.put(R.id.new_driving_license_header, 37);
        sparseIntArray.put(R.id.down_arrow, 38);
        sparseIntArray.put(R.id.btn_drop_down, 39);
        sparseIntArray.put(R.id.dl_personal_info_linear, 40);
        sparseIntArray.put(R.id.tv_dl_hol_name, 41);
        sparseIntArray.put(R.id.dl_holder_name, 42);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 43);
        sparseIntArray.put(R.id.holder_father_name, 44);
        sparseIntArray.put(R.id.tv_dl_dob, 45);
        sparseIntArray.put(R.id.dl_dob, 46);
        sparseIntArray.put(R.id.tv_dl_blood_group, 47);
        sparseIntArray.put(R.id.blood_group, 48);
        sparseIntArray.put(R.id.tv_present_addr, 49);
        sparseIntArray.put(R.id.present_address_txt, 50);
        sparseIntArray.put(R.id.next_request, 51);
    }

    public p7(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 52, null, x0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.w0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.w0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.w0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p7(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[48];
        AppCompatButton appCompatButton = (AppCompatButton) objArr[39];
        TextView textView2 = (TextView) objArr[46];
        ImageView imageView = (ImageView) objArr[27];
        TextView textView3 = (TextView) objArr[42];
        LinearLayout linearLayout = (LinearLayout) objArr[40];
        ImageView imageView2 = (ImageView) objArr[26];
        ImageView imageView3 = (ImageView) objArr[38];
        TextView textView4 = (TextView) objArr[44];
        CardView cardView = (CardView) objArr[10];
        ImageView imageView4 = (ImageView) objArr[7];
        ImageView imageView5 = (ImageView) objArr[11];
        LinearLayout linearLayout2 = (LinearLayout) objArr[28];
        LinearLayout linearLayout3 = (LinearLayout) objArr[16];
        LinearLayout linearLayout4 = (LinearLayout) objArr[35];
        Object obj = objArr[3];
        iy3 iy3VarA = obj != null ? iy3.a((View) obj) : null;
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[37];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[51];
        ImageView imageView6 = (ImageView) objArr[15];
        ImageView imageView7 = (ImageView) objArr[14];
        TextView textView5 = (TextView) objArr[50];
        CardView cardView2 = (CardView) objArr[12];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[9];
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[47];
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[45];
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) objArr[41];
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) objArr[17];
        TextView textView6 = (TextView) objArr[25];
        AppCompatTextView appCompatTextView7 = (AppCompatTextView) objArr[21];
        AppCompatTextView appCompatTextView8 = (AppCompatTextView) objArr[19];
        AppCompatTextView appCompatTextView9 = (AppCompatTextView) objArr[31];
        AppCompatTextView appCompatTextView10 = (AppCompatTextView) objArr[33];
        AppCompatTextView appCompatTextView11 = (AppCompatTextView) objArr[29];
        AppCompatTextView appCompatTextView12 = (AppCompatTextView) objArr[23];
        TextView textView7 = (TextView) objArr[13];
        AppCompatTextView appCompatTextView13 = (AppCompatTextView) objArr[49];
        AppCompatTextView appCompatTextView14 = (AppCompatTextView) objArr[8];
        AppCompatTextView appCompatTextView15 = (AppCompatTextView) objArr[43];
        AppCompatTextView appCompatTextView16 = (AppCompatTextView) objArr[32];
        AppCompatTextView appCompatTextView17 = (AppCompatTextView) objArr[24];
        AppCompatTextView appCompatTextView18 = (AppCompatTextView) objArr[20];
        AppCompatTextView appCompatTextView19 = (AppCompatTextView) objArr[22];
        AppCompatTextView appCompatTextView20 = (AppCompatTextView) objArr[18];
        TextView textView8 = (TextView) objArr[6];
        AppCompatTextView appCompatTextView21 = (AppCompatTextView) objArr[34];
        AppCompatTextView appCompatTextView22 = (AppCompatTextView) objArr[30];
        Object obj2 = objArr[4];
        super(jd1Var, view, 0, textView, appCompatButton, textView2, imageView, textView3, linearLayout, imageView2, imageView3, textView4, cardView, imageView4, imageView5, linearLayout2, linearLayout3, linearLayout4, iy3VarA, appCompatTextView, customWegetLayout, imageView6, imageView7, textView5, cardView2, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, textView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, textView7, appCompatTextView13, appCompatTextView14, appCompatTextView15, appCompatTextView16, appCompatTextView17, appCompatTextView18, appCompatTextView19, appCompatTextView20, textView8, appCompatTextView21, appCompatTextView22, obj2 != null ? vy3.a((View) obj2) : null, (CardView) objArr[36]);
        this.w0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.s0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout5 = (LinearLayout) objArr[1];
        this.t0 = linearLayout5;
        linearLayout5.setTag(null);
        LinearLayout linearLayout6 = (LinearLayout) objArr[2];
        this.u0 = linearLayout6;
        linearLayout6.setTag(null);
        Object obj3 = objArr[5];
        this.v0 = obj3 != null ? bs4.a((View) obj3) : null;
        w(view);
        z();
    }
}
