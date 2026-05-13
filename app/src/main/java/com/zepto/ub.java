package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;

/* JADX INFO: loaded from: classes2.dex */
public class ub extends tb {
    public static final SparseIntArray x0;
    public final RelativeLayout v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.topHolder, 2);
        sparseIntArray.put(R.id.tv_new_curr_addr_detail, 3);
        sparseIntArray.put(R.id.infoIv, 4);
        sparseIntArray.put(R.id.ll_new_curr_existing, 5);
        sparseIntArray.put(R.id.tv_state, 6);
        sparseIntArray.put(R.id.dl_current_address_state_et, 7);
        sparseIntArray.put(R.id.tv_district, 8);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 9);
        sparseIntArray.put(R.id.tv_taluka_block, 10);
        sparseIntArray.put(R.id.dl_current_address_city_et, 11);
        sparseIntArray.put(R.id.village_town_rg, 12);
        sparseIntArray.put(R.id.village_rb, 13);
        sparseIntArray.put(R.id.town_rb, 14);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 15);
        sparseIntArray.put(R.id.tv_house_door_flat, 16);
        sparseIntArray.put(R.id.dl_select_house_number_et, 17);
        sparseIntArray.put(R.id.tv_street_locality, 18);
        sparseIntArray.put(R.id.dl_select_villa_town_street_et, 19);
        sparseIntArray.put(R.id.tv_landmark, 20);
        sparseIntArray.put(R.id.dl_select_villa_town_landmark_et, 21);
        sparseIntArray.put(R.id.tv_pincode, 22);
        sparseIntArray.put(R.id.dl_select_villa_town_pincode_et, 23);
        sparseIntArray.put(R.id.durationTv, 24);
        sparseIntArray.put(R.id.yearEt, 25);
        sparseIntArray.put(R.id.monthsEt, 26);
        sparseIntArray.put(R.id.same_as_current_address_cb, 27);
        sparseIntArray.put(R.id.tv_new_perm_addr_detail, 28);
        sparseIntArray.put(R.id.edit_text_layout_pa_details, 29);
        sparseIntArray.put(R.id.tv_state_new, 30);
        sparseIntArray.put(R.id.dl_permanent_address_state_et, 31);
        sparseIntArray.put(R.id.tv_district_new, 32);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 33);
        sparseIntArray.put(R.id.tv_taluka_block_new, 34);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 35);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 36);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 37);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 38);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 39);
        sparseIntArray.put(R.id.tv_house_door_new, 40);
        sparseIntArray.put(R.id.dl_parmanent_house_number_et, 41);
        sparseIntArray.put(R.id.tv_street_locality_new, 42);
        sparseIntArray.put(R.id.dl_parmanent_villa_town_street_et, 43);
        sparseIntArray.put(R.id.tv_landmark_new, 44);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_landmark_et, 45);
        sparseIntArray.put(R.id.tv_pincode_new, 46);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_pincode_et, 47);
        sparseIntArray.put(R.id.pb_coa, 48);
        sparseIntArray.put(R.id.back, 49);
        sparseIntArray.put(R.id.submit_request, 50);
    }

    public ub(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 51, null, x0));
    }

    public void A() {
        synchronized (this) {
            this.w0 = 4L;
        }
        u();
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

    @Override // com.zepto.tb
    public void z(DlAddress dlAddress) {
        this.u0 = dlAddress;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ub(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[49];
        EditText editText = (EditText) objArr[11];
        EditText editText2 = (EditText) objArr[9];
        EditText editText3 = (EditText) objArr[7];
        EditText editText4 = (EditText) objArr[41];
        EditText editText5 = (EditText) objArr[45];
        EditText editText6 = (EditText) objArr[47];
        EditText editText7 = (EditText) objArr[43];
        EditText editText8 = (EditText) objArr[35];
        EditText editText9 = (EditText) objArr[33];
        EditText editText10 = (EditText) objArr[31];
        EditText editText11 = (EditText) objArr[39];
        RadioButton radioButton = (RadioButton) objArr[38];
        RadioButton radioButton2 = (RadioButton) objArr[37];
        RadioGroup radioGroup = (RadioGroup) objArr[36];
        EditText editText12 = (EditText) objArr[17];
        EditText editText13 = (EditText) objArr[15];
        EditText editText14 = (EditText) objArr[21];
        EditText editText15 = (EditText) objArr[23];
        EditText editText16 = (EditText) objArr[19];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[24];
        LinearLayout linearLayout = (LinearLayout) objArr[29];
        ImageView imageView = (ImageView) objArr[4];
        LinearLayout linearLayout2 = (LinearLayout) objArr[5];
        Object obj = objArr[1];
        super(jd1Var, view, 0, textView, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, radioButton, radioButton2, radioGroup, editText12, editText13, editText14, editText15, editText16, appCompatTextView, linearLayout, imageView, linearLayout2, obj != null ? ri5.a((View) obj) : null, (AppCompatEditText) objArr[26], (ProgressBar) objArr[48], (CheckBox) objArr[27], (TextView) objArr[50], (RelativeLayout) objArr[2], (RadioButton) objArr[14], (TextView) objArr[8], (TextView) objArr[32], (TextView) objArr[16], (TextView) objArr[40], (TextView) objArr[20], (TextView) objArr[44], (TextView) objArr[3], (TextView) objArr[28], (TextView) objArr[22], (TextView) objArr[46], (TextView) objArr[6], (TextView) objArr[30], (TextView) objArr[18], (TextView) objArr[42], (TextView) objArr[10], (TextView) objArr[34], (RadioButton) objArr[13], (RadioGroup) objArr[12], (AppCompatEditText) objArr[25]);
        this.w0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.v0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        A();
    }
}
