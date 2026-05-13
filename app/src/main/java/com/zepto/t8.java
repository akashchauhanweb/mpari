package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class t8 extends s8 {
    public static final SparseIntArray Q0;
    public final RelativeLayout O0;
    public long P0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txt_req_submit, 2);
        sparseIntArray.put(R.id.state, 3);
        sparseIntArray.put(R.id.txt_req_submit_rto, 4);
        sparseIntArray.put(R.id.rto_txt, 5);
        sparseIntArray.put(R.id.txtappdetails, 6);
        sparseIntArray.put(R.id.app_arrow_up, 7);
        sparseIntArray.put(R.id.app_arrow_down, 8);
        sparseIntArray.put(R.id.ll_personal, 9);
        sparseIntArray.put(R.id.txtApplicantName, 10);
        sparseIntArray.put(R.id.etApplicantName, 11);
        sparseIntArray.put(R.id.txtRelation, 12);
        sparseIntArray.put(R.id.txt_relation_val, 13);
        sparseIntArray.put(R.id.txtrelfname, 14);
        sparseIntArray.put(R.id.txtrelfnameval, 15);
        sparseIntArray.put(R.id.txtGender, 16);
        sparseIntArray.put(R.id.genderRg, 17);
        sparseIntArray.put(R.id.maleRb, 18);
        sparseIntArray.put(R.id.femaleRb, 19);
        sparseIntArray.put(R.id.txtDob, 20);
        sparseIntArray.put(R.id.dl_dob, 21);
        sparseIntArray.put(R.id.txtBirthPlace, 22);
        sparseIntArray.put(R.id.etBirthPlace, 23);
        sparseIntArray.put(R.id.txtEducationQ, 24);
        sparseIntArray.put(R.id.eteducation, 25);
        sparseIntArray.put(R.id.txtBloodGroup, 26);
        sparseIntArray.put(R.id.et_blood_group, 27);
        sparseIntArray.put(R.id.txtEmailId, 28);
        sparseIntArray.put(R.id.etEmailId, 29);
        sparseIntArray.put(R.id.txtMobileNo, 30);
        sparseIntArray.put(R.id.etMobileNo, 31);
        sparseIntArray.put(R.id.txtAltMobileNo, 32);
        sparseIntArray.put(R.id.etAltMobileNo, 33);
        sparseIntArray.put(R.id.txt_current_add, 34);
        sparseIntArray.put(R.id.pa_app_arrow_up, 35);
        sparseIntArray.put(R.id.pa_app_arrow_down, 36);
        sparseIntArray.put(R.id.add_one, 37);
        sparseIntArray.put(R.id.tv_state, 38);
        sparseIntArray.put(R.id.current_state, 39);
        sparseIntArray.put(R.id.tv_district, 40);
        sparseIntArray.put(R.id.current_dis, 41);
        sparseIntArray.put(R.id.tv_taluka_block, 42);
        sparseIntArray.put(R.id.current_taluka, 43);
        sparseIntArray.put(R.id.tv_house_door_flat, 44);
        sparseIntArray.put(R.id.current_house, 45);
        sparseIntArray.put(R.id.tv_street_locality, 46);
        sparseIntArray.put(R.id.current_Street, 47);
        sparseIntArray.put(R.id.tv_landmark, 48);
        sparseIntArray.put(R.id.current_landmark, 49);
        sparseIntArray.put(R.id.tv_pincode, 50);
        sparseIntArray.put(R.id.current_pin, 51);
        sparseIntArray.put(R.id.txt_perm_add, 52);
        sparseIntArray.put(R.id.pm_app_arrow_up, 53);
        sparseIntArray.put(R.id.pm_app_arrow_down, 54);
        sparseIntArray.put(R.id.add_two, 55);
        sparseIntArray.put(R.id.tv_p_state, 56);
        sparseIntArray.put(R.id.p_State, 57);
        sparseIntArray.put(R.id.tv_perm_district, 58);
        sparseIntArray.put(R.id.p_district, 59);
        sparseIntArray.put(R.id.tv_perm_taluka_block, 60);
        sparseIntArray.put(R.id.perm_taluka, 61);
        sparseIntArray.put(R.id.tv_perm_house_door_flat, 62);
        sparseIntArray.put(R.id.perm_house, 63);
        sparseIntArray.put(R.id.tv_perm_street_locality, 64);
        sparseIntArray.put(R.id.perm_Street, 65);
        sparseIntArray.put(R.id.tv_perm_landmark, 66);
        sparseIntArray.put(R.id.perm_land_mark, 67);
        sparseIntArray.put(R.id.tv_perm_pincode, 68);
        sparseIntArray.put(R.id.perm_pin_code, 69);
        sparseIntArray.put(R.id.btnNext, 70);
    }

    public t8(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 71, null, Q0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.P0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.P0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.P0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t8(jd1 jd1Var, View view, Object[] objArr) {
        LinearLayout linearLayout = (LinearLayout) objArr[37];
        LinearLayout linearLayout2 = (LinearLayout) objArr[55];
        ImageView imageView = (ImageView) objArr[8];
        ImageView imageView2 = (ImageView) objArr[7];
        AppCompatButton appCompatButton = (AppCompatButton) objArr[70];
        TextView textView = (TextView) objArr[41];
        TextView textView2 = (TextView) objArr[45];
        TextView textView3 = (TextView) objArr[49];
        TextView textView4 = (TextView) objArr[51];
        TextView textView5 = (TextView) objArr[39];
        TextView textView6 = (TextView) objArr[47];
        TextView textView7 = (TextView) objArr[43];
        TextView textView8 = (TextView) objArr[21];
        TextView textView9 = (TextView) objArr[33];
        TextView textView10 = (TextView) objArr[11];
        TextView textView11 = (TextView) objArr[23];
        TextView textView12 = (TextView) objArr[27];
        TextView textView13 = (TextView) objArr[29];
        TextView textView14 = (TextView) objArr[31];
        TextView textView15 = (TextView) objArr[25];
        RadioButton radioButton = (RadioButton) objArr[19];
        RadioGroup radioGroup = (RadioGroup) objArr[17];
        LinearLayout linearLayout3 = (LinearLayout) objArr[9];
        Object obj = objArr[1];
        super(jd1Var, view, 0, linearLayout, linearLayout2, imageView, imageView2, appCompatButton, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, radioButton, radioGroup, linearLayout3, obj != null ? vy3.a((View) obj) : null, (RadioButton) objArr[18], (TextView) objArr[59], (TextView) objArr[57], (ImageView) objArr[36], (ImageView) objArr[35], (TextView) objArr[63], (TextView) objArr[67], (TextView) objArr[69], (TextView) objArr[65], (TextView) objArr[61], (ImageView) objArr[54], (ImageView) objArr[53], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[40], (TextView) objArr[44], (TextView) objArr[48], (TextView) objArr[56], (TextView) objArr[58], (TextView) objArr[62], (TextView) objArr[66], (TextView) objArr[68], (TextView) objArr[64], (TextView) objArr[60], (TextView) objArr[50], (TextView) objArr[38], (TextView) objArr[46], (TextView) objArr[42], (TextView) objArr[32], (TextView) objArr[10], (TextView) objArr[22], (TextView) objArr[26], (TextView) objArr[34], (TextView) objArr[20], (TextView) objArr[24], (TextView) objArr[28], (TextView) objArr[16], (TextView) objArr[30], (TextView) objArr[52], (TextView) objArr[12], (TextView) objArr[13], (MyTextView) objArr[2], (MyTextView) objArr[4], (TextView) objArr[6], (TextView) objArr[14], (TextView) objArr[15]);
        this.P0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.O0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
