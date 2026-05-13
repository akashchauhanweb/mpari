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
public class zd extends yd {
    public static final SparseIntArray F0;
    public final RelativeLayout D0;
    public long E0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.round_card_view, 2);
        sparseIntArray.put(R.id.iv_image, 3);
        sparseIntArray.put(R.id.ll_existing_curr_perr_address, 4);
        sparseIntArray.put(R.id.tv_exist_curr_address, 5);
        sparseIntArray.put(R.id.present_address_txt, 6);
        sparseIntArray.put(R.id.tv_exist_perm_address, 7);
        sparseIntArray.put(R.id.permanent_address_txt, 8);
        sparseIntArray.put(R.id.tv_new_curr_addr_detail, 9);
        sparseIntArray.put(R.id.new_app_arrow_up_current, 10);
        sparseIntArray.put(R.id.new_app_arrow_down_current, 11);
        sparseIntArray.put(R.id.ll_new_curr_existing, 12);
        sparseIntArray.put(R.id.tv_state, 13);
        sparseIntArray.put(R.id.dl_current_address_state_et, 14);
        sparseIntArray.put(R.id.tv_district, 15);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 16);
        sparseIntArray.put(R.id.tv_taluka_block, 17);
        sparseIntArray.put(R.id.dl_current_address_city_et, 18);
        sparseIntArray.put(R.id.village_town_rg, 19);
        sparseIntArray.put(R.id.village_rb, 20);
        sparseIntArray.put(R.id.town_rb, 21);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 22);
        sparseIntArray.put(R.id.tv_house_door_flat, 23);
        sparseIntArray.put(R.id.dl_select_house_number_et, 24);
        sparseIntArray.put(R.id.tv_street_locality, 25);
        sparseIntArray.put(R.id.dl_select_villa_town_street_et, 26);
        sparseIntArray.put(R.id.tv_landmark, 27);
        sparseIntArray.put(R.id.dl_select_villa_town_landmark_et, 28);
        sparseIntArray.put(R.id.tv_pincode, 29);
        sparseIntArray.put(R.id.dl_select_villa_town_pincode_et, 30);
        sparseIntArray.put(R.id.header_title_current_address_details, 31);
        sparseIntArray.put(R.id.dropdown_arrow_ca_details, 32);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 33);
        sparseIntArray.put(R.id.same_as_current_address_cb, 34);
        sparseIntArray.put(R.id.tv_new_perm_addr_detail, 35);
        sparseIntArray.put(R.id.new_app_arrow_up_perm, 36);
        sparseIntArray.put(R.id.new_app_arrow_down_perm, 37);
        sparseIntArray.put(R.id.edit_text_layout_pa_details, 38);
        sparseIntArray.put(R.id.tv_state_new, 39);
        sparseIntArray.put(R.id.dl_permanent_address_state_et, 40);
        sparseIntArray.put(R.id.tv_district_new, 41);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 42);
        sparseIntArray.put(R.id.tv_taluka_block_new, 43);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 44);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 45);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 46);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 47);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 48);
        sparseIntArray.put(R.id.tv_house_door_new, 49);
        sparseIntArray.put(R.id.dl_parmanent_house_number_et, 50);
        sparseIntArray.put(R.id.tv_street_locality_new, 51);
        sparseIntArray.put(R.id.dl_parmanent_villa_town_street_et, 52);
        sparseIntArray.put(R.id.tv_landmark_new, 53);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_landmark_et, 54);
        sparseIntArray.put(R.id.tv_pincode_new, 55);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_pincode_et, 56);
        sparseIntArray.put(R.id.submit_request, 57);
        sparseIntArray.put(R.id.pb_coa, 58);
    }

    public zd(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 59, null, F0));
    }

    public void A() {
        synchronized (this) {
            this.E0 = 4L;
        }
        u();
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.E0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.E0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.yd
    public void z(DlAddress dlAddress) {
        this.C0 = dlAddress;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zd(jd1 jd1Var, View view, Object[] objArr) {
        EditText editText = (EditText) objArr[18];
        EditText editText2 = (EditText) objArr[16];
        EditText editText3 = (EditText) objArr[14];
        EditText editText4 = (EditText) objArr[50];
        EditText editText5 = (EditText) objArr[54];
        EditText editText6 = (EditText) objArr[56];
        EditText editText7 = (EditText) objArr[52];
        EditText editText8 = (EditText) objArr[44];
        EditText editText9 = (EditText) objArr[42];
        EditText editText10 = (EditText) objArr[40];
        EditText editText11 = (EditText) objArr[48];
        RadioButton radioButton = (RadioButton) objArr[47];
        RadioButton radioButton2 = (RadioButton) objArr[46];
        RadioGroup radioGroup = (RadioGroup) objArr[45];
        EditText editText12 = (EditText) objArr[24];
        EditText editText13 = (EditText) objArr[22];
        EditText editText14 = (EditText) objArr[28];
        EditText editText15 = (EditText) objArr[30];
        EditText editText16 = (EditText) objArr[26];
        ImageView imageView = (ImageView) objArr[32];
        LinearLayout linearLayout = (LinearLayout) objArr[33];
        LinearLayout linearLayout2 = (LinearLayout) objArr[38];
        TextView textView = (TextView) objArr[31];
        ImageView imageView2 = (ImageView) objArr[3];
        LinearLayout linearLayout3 = (LinearLayout) objArr[4];
        LinearLayout linearLayout4 = (LinearLayout) objArr[12];
        Object obj = objArr[1];
        super(jd1Var, view, 0, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, radioButton, radioButton2, radioGroup, editText12, editText13, editText14, editText15, editText16, imageView, linearLayout, linearLayout2, textView, imageView2, linearLayout3, linearLayout4, obj != null ? vy3.a((View) obj) : null, (ImageView) objArr[11], (ImageView) objArr[37], (ImageView) objArr[10], (ImageView) objArr[36], (ProgressBar) objArr[58], (MyTextView) objArr[8], (MyTextView) objArr[6], (CardView) objArr[2], (CheckBox) objArr[34], (CustomWegetLayout) objArr[57], (RadioButton) objArr[21], (TextView) objArr[15], (TextView) objArr[41], (MyTextView) objArr[5], (MyTextView) objArr[7], (TextView) objArr[23], (TextView) objArr[49], (TextView) objArr[27], (TextView) objArr[53], (TextView) objArr[9], (TextView) objArr[35], (TextView) objArr[29], (TextView) objArr[55], (TextView) objArr[13], (TextView) objArr[39], (TextView) objArr[25], (TextView) objArr[51], (TextView) objArr[17], (TextView) objArr[43], (RadioButton) objArr[20], (RadioGroup) objArr[19]);
        this.E0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.D0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        A();
    }
}
