package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class dc extends cc {
    public static final SparseIntArray S0;
    public final RelativeLayout P0;
    public final LinearLayout Q0;
    public long R0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 26);
        sparseIntArray.put(R.id.mHeader, 27);
        sparseIntArray.put(R.id.psl, 28);
        sparseIntArray.put(R.id.dl_no_txt, 29);
        sparseIntArray.put(R.id.txt_view_details, 30);
        sparseIntArray.put(R.id.select_service, 31);
        sparseIntArray.put(R.id.icon_image, 32);
        sparseIntArray.put(R.id.round_card_view, 33);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 34);
        sparseIntArray.put(R.id.multi_steps, 35);
        sparseIntArray.put(R.id.txtAppCategory, 36);
        sparseIntArray.put(R.id.spn_app_cat, 37);
        sparseIntArray.put(R.id.idpRto, 38);
        sparseIntArray.put(R.id.id_rto, 39);
        sparseIntArray.put(R.id.tv_birth_place, 40);
        sparseIntArray.put(R.id.tv_birth_country, 41);
        sparseIntArray.put(R.id.tv_passport_no, 42);
        sparseIntArray.put(R.id.tv_valid_upto, 43);
        sparseIntArray.put(R.id.tv_note_disqualified_dl, 44);
        sparseIntArray.put(R.id.iidp_yesNoType, 45);
        sparseIntArray.put(R.id.id_disqualify_et, 46);
        sparseIntArray.put(R.id.tv_note_barred_curr_country, 47);
        sparseIntArray.put(R.id.iidp_yesNoTypeSecond, 48);
        sparseIntArray.put(R.id.id_iidp_barred, 49);
        sparseIntArray.put(R.id.tv_count_visa, 50);
        sparseIntArray.put(R.id.id_iidp_restricteCountry, 51);
        sparseIntArray.put(R.id.tv_visa_no, 52);
        sparseIntArray.put(R.id.tv_visa_valid_upto, 53);
        sparseIntArray.put(R.id.tv_cov_grades_idp, 54);
        sparseIntArray.put(R.id.formIndianEmbassyLayout, 55);
        sparseIntArray.put(R.id.formIndianEmbassy, 56);
        sparseIntArray.put(R.id.tv_embassy_name, 57);
        sparseIntArray.put(R.id.tv_embassy_place, 58);
        sparseIntArray.put(R.id.tv_foren_nation_mob, 59);
        sparseIntArray.put(R.id.tv_email_id, 60);
        sparseIntArray.put(R.id.tv_date_verif_embassy, 61);
        sparseIntArray.put(R.id.tv_embassy_endor_no, 62);
        sparseIntArray.put(R.id.tv_idp_applied_from, 63);
        sparseIntArray.put(R.id.tv_note_enter_addr_foren, 64);
        sparseIntArray.put(R.id.tv_addr_one, 65);
        sparseIntArray.put(R.id.tv_addr_two, 66);
        sparseIntArray.put(R.id.tv_addr_three, 67);
        sparseIntArray.put(R.id.tv_pincode, 68);
        sparseIntArray.put(R.id.tv_click_desc_cov, 69);
        sparseIntArray.put(R.id.reset, 70);
        sparseIntArray.put(R.id.id_submit, 71);
    }

    public dc(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 72, null, S0));
    }

    @Override // com.zepto.lq7
    public void i() {
        long j;
        String str;
        boolean z;
        synchronized (this) {
            j = this.R0;
            this.R0 = 0L;
        }
        Boolean bool = this.O0;
        long j2 = j & 3;
        if (j2 != 0) {
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (j2 != 0) {
                j |= zBooleanValue ? 168L : 84L;
            }
            str = "";
            z = true;
        } else {
            str = null;
            z = false;
        }
        if ((j & 3) != 0) {
            df6.c(this.C, str);
            df6.c(this.E, str);
            df6.c(this.F, str);
            df6.c(this.H, str);
            df6.c(this.I, str);
            df6.c(this.J, str);
            df6.c(this.K, str);
            df6.c(this.L, str);
            df6.c(this.M, str);
            df6.c(this.N, str);
            df6.c(this.O, str);
            df6.c(this.P, str);
            df6.c(this.Q, str);
            df6.c(this.R, str);
            df6.c(this.U, str);
            yu0.a(this.W, z);
            yu0.a(this.X, z);
            yu0.a(this.Y, false);
            yu0.a(this.b0, false);
            df6.c(this.g0, str);
            df6.c(this.h0, str);
            df6.c(this.M0, str);
            df6.c(this.N0, str);
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.R0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.cc
    public void x(Boolean bool) {
        this.O0 = bool;
        synchronized (this) {
            this.R0 |= 1;
        }
        b(1);
        super.u();
    }

    public void y() {
        synchronized (this) {
            this.R0 = 2L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dc(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[29];
        CheckBox checkBox = (CheckBox) objArr[56];
        LinearLayout linearLayout = (LinearLayout) objArr[55];
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        CardView cardView = (CardView) objArr[32];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[46];
        EditText editText = (EditText) objArr[21];
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) objArr[49];
        EditText editText2 = (EditText) objArr[4];
        EditText editText3 = (EditText) objArr[14];
        TextView textView2 = (TextView) objArr[51];
        EditText editText4 = (EditText) objArr[11];
        EditText editText5 = (EditText) objArr[22];
        EditText editText6 = (EditText) objArr[23];
        EditText editText7 = (EditText) objArr[24];
        EditText editText8 = (EditText) objArr[19];
        EditText editText9 = (EditText) objArr[18];
        EditText editText10 = (EditText) objArr[20];
        EditText editText11 = (EditText) objArr[17];
        EditText editText12 = (EditText) objArr[25];
        EditText editText13 = (EditText) objArr[15];
        EditText editText14 = (EditText) objArr[16];
        TextView textView3 = (TextView) objArr[39];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[71];
        EditText editText15 = (EditText) objArr[3];
        MyTextView myTextView = (MyTextView) objArr[38];
        RadioButton radioButton = (RadioButton) objArr[8];
        RadioButton radioButton2 = (RadioButton) objArr[10];
        RadioButton radioButton3 = (RadioButton) objArr[7];
        RadioGroup radioGroup = (RadioGroup) objArr[45];
        RadioGroup radioGroup2 = (RadioGroup) objArr[48];
        RadioButton radioButton4 = (RadioButton) objArr[9];
        ImageView imageView = (ImageView) objArr[34];
        Object obj = objArr[27];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[26];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        RecyclerView recyclerView = (RecyclerView) objArr[35];
        EditText editText16 = (EditText) objArr[5];
        EditText editText17 = (EditText) objArr[6];
        Object obj3 = objArr[28];
        super(jd1Var, view, 0, textView, checkBox, linearLayout, linearLayout2, cardView, appCompatEditText, editText, appCompatEditText2, editText2, editText3, textView2, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, editText12, editText13, editText14, textView3, customWegetLayout, editText15, myTextView, radioButton, radioButton2, radioButton3, radioGroup, radioGroup2, radioButton4, imageView, vy3VarA, iy3VarA, recyclerView, editText16, editText17, obj3 != null ? ex2.a((View) obj3) : null, (CustomWegetLayout) objArr[70], (CardView) objArr[33], (MyTextView) objArr[31], (Spinner) objArr[37], (MyTextView) objArr[65], (MyTextView) objArr[67], (MyTextView) objArr[66], (MyTextView) objArr[41], (MyTextView) objArr[40], (AppCompatTextView) objArr[69], (MyTextView) objArr[50], (MyTextView) objArr[54], (MyTextView) objArr[61], (MyTextView) objArr[60], (MyTextView) objArr[62], (MyTextView) objArr[57], (MyTextView) objArr[58], (MyTextView) objArr[59], (MyTextView) objArr[63], (MyTextView) objArr[47], (MyTextView) objArr[44], (MyTextView) objArr[64], (MyTextView) objArr[42], (MyTextView) objArr[68], (MyTextView) objArr[43], (MyTextView) objArr[52], (MyTextView) objArr[53], (MyTextView) objArr[36], (TextView) objArr[30], (EditText) objArr[12], (EditText) objArr[13]);
        this.R0 = -1L;
        this.z.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.U.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.b0.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.P0 = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[2];
        this.Q0 = linearLayout3;
        linearLayout3.setTag(null);
        this.g0.setTag(null);
        this.h0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        w(view);
        y();
    }
}
