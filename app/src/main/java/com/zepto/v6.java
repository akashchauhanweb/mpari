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
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class v6 extends u6 {
    public static final SparseIntArray I0;
    public final RelativeLayout G0;
    public long H0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mHeader, 2);
        sparseIntArray.put(R.id.round_card_view, 3);
        sparseIntArray.put(R.id.iv_image, 4);
        sparseIntArray.put(R.id.tv_cl_Details, 5);
        sparseIntArray.put(R.id.tv_view_details, 6);
        sparseIntArray.put(R.id.ll_existing_curr_perr_address, 7);
        sparseIntArray.put(R.id.tv_exist_curr_address, 8);
        sparseIntArray.put(R.id.present_address_txt, 9);
        sparseIntArray.put(R.id.tv_exist_perm_address, 10);
        sparseIntArray.put(R.id.permanent_address_txt, 11);
        sparseIntArray.put(R.id.tv_new_curr_addr_detail, 12);
        sparseIntArray.put(R.id.new_app_arrow_up_current, 13);
        sparseIntArray.put(R.id.new_app_arrow_down_current, 14);
        sparseIntArray.put(R.id.ll_new_curr_existing, 15);
        sparseIntArray.put(R.id.tv_state, 16);
        sparseIntArray.put(R.id.dl_current_address_state_et, 17);
        sparseIntArray.put(R.id.tv_district, 18);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 19);
        sparseIntArray.put(R.id.tv_taluka_block, 20);
        sparseIntArray.put(R.id.dl_current_address_city_et, 21);
        sparseIntArray.put(R.id.village_town_rg, 22);
        sparseIntArray.put(R.id.village_rb, 23);
        sparseIntArray.put(R.id.town_rb, 24);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 25);
        sparseIntArray.put(R.id.tv_house_door_flat, 26);
        sparseIntArray.put(R.id.dl_select_house_number_et, 27);
        sparseIntArray.put(R.id.tv_street_locality, 28);
        sparseIntArray.put(R.id.dl_select_villa_town_street_et, 29);
        sparseIntArray.put(R.id.tv_landmark, 30);
        sparseIntArray.put(R.id.dl_select_villa_town_landmark_et, 31);
        sparseIntArray.put(R.id.tv_pincode, 32);
        sparseIntArray.put(R.id.dl_select_villa_town_pincode_et, 33);
        sparseIntArray.put(R.id.header_title_current_address_details, 34);
        sparseIntArray.put(R.id.dropdown_arrow_ca_details, 35);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 36);
        sparseIntArray.put(R.id.same_as_current_address_cb, 37);
        sparseIntArray.put(R.id.tv_new_perm_addr_detail, 38);
        sparseIntArray.put(R.id.new_app_arrow_up, 39);
        sparseIntArray.put(R.id.new_app_arrow_down, 40);
        sparseIntArray.put(R.id.edit_text_layout_pa_details, 41);
        sparseIntArray.put(R.id.tv_state_new, 42);
        sparseIntArray.put(R.id.dl_permanent_address_state_et, 43);
        sparseIntArray.put(R.id.tv_district_new, 44);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 45);
        sparseIntArray.put(R.id.tv_taluka_block_new, 46);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 47);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 48);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 49);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 50);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 51);
        sparseIntArray.put(R.id.tv_house_door_new, 52);
        sparseIntArray.put(R.id.dl_parmanent_house_number_et, 53);
        sparseIntArray.put(R.id.tv_street_locality_new, 54);
        sparseIntArray.put(R.id.dl_parmanent_villa_town_street_et, 55);
        sparseIntArray.put(R.id.tv_landmark_new, 56);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_landmark_et, 57);
        sparseIntArray.put(R.id.tv_pincode_new, 58);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_pincode_et, 59);
        sparseIntArray.put(R.id.submit_request, 60);
        sparseIntArray.put(R.id.pb_coa, 61);
    }

    public v6(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 62, null, I0));
    }

    public void A() {
        synchronized (this) {
            this.H0 = 4L;
        }
        u();
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.H0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.H0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.u6
    public void z(DlAddress dlAddress) {
        this.F0 = dlAddress;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v6(jd1 jd1Var, View view, Object[] objArr) {
        EditText editText = (EditText) objArr[21];
        EditText editText2 = (EditText) objArr[19];
        EditText editText3 = (EditText) objArr[17];
        EditText editText4 = (EditText) objArr[53];
        EditText editText5 = (EditText) objArr[57];
        EditText editText6 = (EditText) objArr[59];
        EditText editText7 = (EditText) objArr[55];
        EditText editText8 = (EditText) objArr[47];
        EditText editText9 = (EditText) objArr[45];
        EditText editText10 = (EditText) objArr[43];
        EditText editText11 = (EditText) objArr[51];
        RadioButton radioButton = (RadioButton) objArr[50];
        RadioButton radioButton2 = (RadioButton) objArr[49];
        RadioGroup radioGroup = (RadioGroup) objArr[48];
        EditText editText12 = (EditText) objArr[27];
        EditText editText13 = (EditText) objArr[25];
        EditText editText14 = (EditText) objArr[31];
        EditText editText15 = (EditText) objArr[33];
        EditText editText16 = (EditText) objArr[29];
        ImageView imageView = (ImageView) objArr[35];
        LinearLayout linearLayout = (LinearLayout) objArr[36];
        LinearLayout linearLayout2 = (LinearLayout) objArr[41];
        TextView textView = (TextView) objArr[34];
        ImageView imageView2 = (ImageView) objArr[4];
        LinearLayout linearLayout3 = (LinearLayout) objArr[7];
        LinearLayout linearLayout4 = (LinearLayout) objArr[15];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[1];
        super(jd1Var, view, 0, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, radioButton, radioButton2, radioGroup, editText12, editText13, editText14, editText15, editText16, imageView, linearLayout, linearLayout2, textView, imageView2, linearLayout3, linearLayout4, vy3VarA, obj2 != null ? iy3.a((View) obj2) : null, (ImageView) objArr[40], (ImageView) objArr[14], (ImageView) objArr[39], (ImageView) objArr[13], (ProgressBar) objArr[61], (MyTextView) objArr[11], (MyTextView) objArr[9], (CardView) objArr[3], (CheckBox) objArr[37], (CustomWegetLayout) objArr[60], (RadioButton) objArr[24], (TextView) objArr[5], (TextView) objArr[18], (TextView) objArr[44], (MyTextView) objArr[8], (MyTextView) objArr[10], (TextView) objArr[26], (TextView) objArr[52], (TextView) objArr[30], (TextView) objArr[56], (TextView) objArr[12], (TextView) objArr[38], (TextView) objArr[32], (TextView) objArr[58], (TextView) objArr[16], (TextView) objArr[42], (TextView) objArr[28], (TextView) objArr[54], (TextView) objArr[20], (TextView) objArr[46], (TextView) objArr[6], (RadioButton) objArr[23], (RadioGroup) objArr[22]);
        this.H0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.G0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        A();
    }
}
