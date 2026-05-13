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
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class b7 extends a7 {
    public static final SparseIntArray Y0;
    public final RelativeLayout V0;
    public final LinearLayout W0;
    public long X0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.mHeader, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.multi_steps, 12);
        sparseIntArray.put(R.id.ll_cat, 13);
        sparseIntArray.put(R.id.txtAppCategory, 14);
        sparseIntArray.put(R.id.spn_app_cat, 15);
        sparseIntArray.put(R.id.tv_exist_address, 16);
        sparseIntArray.put(R.id.exsting_arrow_up, 17);
        sparseIntArray.put(R.id.existing_arrow_down, 18);
        sparseIntArray.put(R.id.ll_existing_curr_perr_address, 19);
        sparseIntArray.put(R.id.tv_exist_curr_address, 20);
        sparseIntArray.put(R.id.present_address_txt, 21);
        sparseIntArray.put(R.id.tv_exist_perm_address, 22);
        sparseIntArray.put(R.id.permanent_address_txt, 23);
        sparseIntArray.put(R.id.tv_new_curr_addr_detail, 24);
        sparseIntArray.put(R.id.new_current_arrow_up, 25);
        sparseIntArray.put(R.id.new_current_arrow_down, 26);
        sparseIntArray.put(R.id.ll_new_curr_existing, 27);
        sparseIntArray.put(R.id.tv_valid_from, 28);
        sparseIntArray.put(R.id.header_old_address_title, 29);
        sparseIntArray.put(R.id.tv_old_addr_detail, 30);
        sparseIntArray.put(R.id.tv_state, 31);
        sparseIntArray.put(R.id.dl_current_address_state_et, 32);
        sparseIntArray.put(R.id.tv_district, 33);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 34);
        sparseIntArray.put(R.id.tv_taluka_block, 35);
        sparseIntArray.put(R.id.dl_current_address_city_et, 36);
        sparseIntArray.put(R.id.village_town_rg, 37);
        sparseIntArray.put(R.id.village_rb, 38);
        sparseIntArray.put(R.id.town_rb, 39);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 40);
        sparseIntArray.put(R.id.tv_house_door_flat, 41);
        sparseIntArray.put(R.id.dl_select_house_number_et, 42);
        sparseIntArray.put(R.id.tv_street_locality, 43);
        sparseIntArray.put(R.id.dl_select_villa_town_street_et, 44);
        sparseIntArray.put(R.id.tv_landmark, 45);
        sparseIntArray.put(R.id.dl_select_villa_town_landmark_et, 46);
        sparseIntArray.put(R.id.tv_pincode, 47);
        sparseIntArray.put(R.id.dl_select_villa_town_pincode_et, 48);
        sparseIntArray.put(R.id.header_title_current_address_details, 49);
        sparseIntArray.put(R.id.dropdown_arrow_ca_details, 50);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 51);
        sparseIntArray.put(R.id.same_as_current_address_cb, 52);
        sparseIntArray.put(R.id.tv_new_perm_addr_detail, 53);
        sparseIntArray.put(R.id.new_app_arrow_up, 54);
        sparseIntArray.put(R.id.new_app_arrow_down, 55);
        sparseIntArray.put(R.id.edit_text_layout_pa_details, 56);
        sparseIntArray.put(R.id.tv_state_new, 57);
        sparseIntArray.put(R.id.dl_permanent_address_state_et, 58);
        sparseIntArray.put(R.id.tv_district_new, 59);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 60);
        sparseIntArray.put(R.id.tv_taluka_block_new, 61);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 62);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 63);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 64);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 65);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 66);
        sparseIntArray.put(R.id.tv_house_door_new, 67);
        sparseIntArray.put(R.id.dl_parmanent_house_number_et, 68);
        sparseIntArray.put(R.id.tv_street_locality_new, 69);
        sparseIntArray.put(R.id.dl_parmanent_villa_town_street_et, 70);
        sparseIntArray.put(R.id.tv_landmark_new, 71);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_landmark_et, 72);
        sparseIntArray.put(R.id.tv_pincode_new, 73);
        sparseIntArray.put(R.id.dl_parmanent__villa_town_pincode_et, 74);
        sparseIntArray.put(R.id.submit_request, 75);
        sparseIntArray.put(R.id.pb_coa, 76);
    }

    public b7(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 77, null, Y0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.X0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.X0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.a7
    public void x(DlAddress dlAddress) {
        this.U0 = dlAddress;
    }

    @Override // com.zepto.a7
    public void y(DlAddress dlAddress) {
        this.T0 = dlAddress;
    }

    public void z() {
        synchronized (this) {
            this.X0 = 4L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b7(jd1 jd1Var, View view, Object[] objArr) {
        EditText editText = (EditText) objArr[36];
        EditText editText2 = (EditText) objArr[34];
        EditText editText3 = (EditText) objArr[32];
        TextView textView = (TextView) objArr[6];
        EditText editText4 = (EditText) objArr[68];
        EditText editText5 = (EditText) objArr[72];
        EditText editText6 = (EditText) objArr[74];
        EditText editText7 = (EditText) objArr[70];
        EditText editText8 = (EditText) objArr[62];
        EditText editText9 = (EditText) objArr[60];
        EditText editText10 = (EditText) objArr[58];
        EditText editText11 = (EditText) objArr[66];
        RadioButton radioButton = (RadioButton) objArr[65];
        RadioButton radioButton2 = (RadioButton) objArr[64];
        RadioGroup radioGroup = (RadioGroup) objArr[63];
        EditText editText12 = (EditText) objArr[42];
        EditText editText13 = (EditText) objArr[40];
        EditText editText14 = (EditText) objArr[46];
        EditText editText15 = (EditText) objArr[48];
        EditText editText16 = (EditText) objArr[44];
        ImageView imageView = (ImageView) objArr[50];
        LinearLayout linearLayout = (LinearLayout) objArr[51];
        LinearLayout linearLayout2 = (LinearLayout) objArr[56];
        ImageView imageView2 = (ImageView) objArr[18];
        ImageView imageView3 = (ImageView) objArr[17];
        RelativeLayout relativeLayout = (RelativeLayout) objArr[29];
        TextView textView2 = (TextView) objArr[49];
        CardView cardView = (CardView) objArr[9];
        ImageView imageView4 = (ImageView) objArr[11];
        LinearLayout linearLayout3 = (LinearLayout) objArr[1];
        LinearLayout linearLayout4 = (LinearLayout) objArr[13];
        LinearLayout linearLayout5 = (LinearLayout) objArr[19];
        LinearLayout linearLayout6 = (LinearLayout) objArr[27];
        Object obj = objArr[4];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[3];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        RecyclerView recyclerView = (RecyclerView) objArr[12];
        ImageView imageView5 = (ImageView) objArr[55];
        ImageView imageView6 = (ImageView) objArr[54];
        ImageView imageView7 = (ImageView) objArr[26];
        ImageView imageView8 = (ImageView) objArr[25];
        ProgressBar progressBar = (ProgressBar) objArr[76];
        MyTextView myTextView = (MyTextView) objArr[23];
        MyTextView myTextView2 = (MyTextView) objArr[21];
        Object obj3 = objArr[5];
        super(jd1Var, view, 0, editText, editText2, editText3, textView, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, radioButton, radioButton2, radioGroup, editText12, editText13, editText14, editText15, editText16, imageView, linearLayout, linearLayout2, imageView2, imageView3, relativeLayout, textView2, cardView, imageView4, linearLayout3, linearLayout4, linearLayout5, linearLayout6, vy3VarA, iy3VarA, recyclerView, imageView5, imageView6, imageView7, imageView8, progressBar, myTextView, myTextView2, obj3 != null ? bs4.a((View) obj3) : null, (CardView) objArr[10], (CheckBox) objArr[52], (MyTextView) objArr[8], (Spinner) objArr[15], (CustomWegetLayout) objArr[75], (RadioButton) objArr[39], (TextView) objArr[33], (TextView) objArr[59], (TextView) objArr[16], (MyTextView) objArr[20], (MyTextView) objArr[22], (TextView) objArr[41], (TextView) objArr[67], (TextView) objArr[45], (TextView) objArr[71], (TextView) objArr[24], (TextView) objArr[53], (MyTextView) objArr[30], (TextView) objArr[47], (TextView) objArr[73], (TextView) objArr[31], (TextView) objArr[57], (TextView) objArr[43], (TextView) objArr[69], (TextView) objArr[35], (TextView) objArr[61], (MyTextView) objArr[28], (MyTextView) objArr[14], (TextView) objArr[7], (RadioButton) objArr[38], (RadioGroup) objArr[37]);
        this.X0 = -1L;
        this.Z.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[0];
        this.V0 = relativeLayout2;
        relativeLayout2.setTag(null);
        LinearLayout linearLayout7 = (LinearLayout) objArr[2];
        this.W0 = linearLayout7;
        linearLayout7.setTag(null);
        w(view);
        z();
    }
}
