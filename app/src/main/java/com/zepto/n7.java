package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class n7 extends m7 {
    public static final SparseIntArray u0;
    public final RelativeLayout s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.details_scroll_view, 2);
        sparseIntArray.put(R.id.round_card_view, 3);
        sparseIntArray.put(R.id.cl_photo, 4);
        sparseIntArray.put(R.id.tv_cl_Details, 5);
        sparseIntArray.put(R.id.tv_appln_detail, 6);
        sparseIntArray.put(R.id.app_arrow_up, 7);
        sparseIntArray.put(R.id.app_arrow_down, 8);
        sparseIntArray.put(R.id.ll_personal_details, 9);
        sparseIntArray.put(R.id.txt_name, 10);
        sparseIntArray.put(R.id.txt_name_value, 11);
        sparseIntArray.put(R.id.txt_father_name, 12);
        sparseIntArray.put(R.id.txt_father_name_value, 13);
        sparseIntArray.put(R.id.txt_mob_num, 14);
        sparseIntArray.put(R.id.txt_mob_num_value, 15);
        sparseIntArray.put(R.id.txt_blood, 16);
        sparseIntArray.put(R.id.spn_app_cat, 17);
        sparseIntArray.put(R.id.txt_add, 18);
        sparseIntArray.put(R.id.txt_add_value, 19);
        sparseIntArray.put(R.id.tv_lic_detail, 20);
        sparseIntArray.put(R.id.app_arrow_up_lic, 21);
        sparseIntArray.put(R.id.app_arrow_down_lic, 22);
        sparseIntArray.put(R.id.ll_details, 23);
        sparseIntArray.put(R.id.txt_lic_num, 24);
        sparseIntArray.put(R.id.txt_lic_num_val, 25);
        sparseIntArray.put(R.id.txt_lic_validity, 26);
        sparseIntArray.put(R.id.txt_lic_validity_val, 27);
        sparseIntArray.put(R.id.txt_doi, 28);
        sparseIntArray.put(R.id.txt_doi_value, 29);
        sparseIntArray.put(R.id.txt_duration, 30);
        sparseIntArray.put(R.id.txt_year, 31);
        sparseIntArray.put(R.id.txt_month, 32);
        sparseIntArray.put(R.id.tv_state, 33);
        sparseIntArray.put(R.id.ed_mother_name, 34);
        sparseIntArray.put(R.id.tv_marr_Status, 35);
        sparseIntArray.put(R.id.spn_mar_Status, 36);
        sparseIntArray.put(R.id.tv_relig, 37);
        sparseIntArray.put(R.id.spn_mar_religion, 38);
        sparseIntArray.put(R.id.tv_bp, 39);
        sparseIntArray.put(R.id.edit_place_of_birth, 40);
        sparseIntArray.put(R.id.tv_category, 41);
        sparseIntArray.put(R.id.spn_cat, 42);
        sparseIntArray.put(R.id.tv_ps, 43);
        sparseIntArray.put(R.id.et_ps, 44);
        sparseIntArray.put(R.id.tv_criminal, 45);
        sparseIntArray.put(R.id.spn_crim, 46);
        sparseIntArray.put(R.id.btn_reset, 47);
        sparseIntArray.put(R.id.btn_submit, 48);
    }

    public n7(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 49, null, u0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.t0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.t0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.t0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n7(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[8];
        ImageView imageView2 = (ImageView) objArr[22];
        ImageView imageView3 = (ImageView) objArr[7];
        ImageView imageView4 = (ImageView) objArr[21];
        AppCompatButton appCompatButton = (AppCompatButton) objArr[47];
        AppCompatButton appCompatButton2 = (AppCompatButton) objArr[48];
        ImageView imageView5 = (ImageView) objArr[4];
        ScrollView scrollView = (ScrollView) objArr[2];
        EditText editText = (EditText) objArr[34];
        EditText editText2 = (EditText) objArr[40];
        EditText editText3 = (EditText) objArr[44];
        LinearLayout linearLayout = (LinearLayout) objArr[23];
        LinearLayout linearLayout2 = (LinearLayout) objArr[9];
        Object obj = objArr[1];
        super(jd1Var, view, 0, imageView, imageView2, imageView3, imageView4, appCompatButton, appCompatButton2, imageView5, scrollView, editText, editText2, editText3, linearLayout, linearLayout2, obj != null ? vy3.a((View) obj) : null, (CardView) objArr[3], (Spinner) objArr[17], (Spinner) objArr[42], (Spinner) objArr[46], (Spinner) objArr[38], (Spinner) objArr[36], (TextView) objArr[6], (TextView) objArr[39], (TextView) objArr[41], (TextView) objArr[5], (TextView) objArr[45], (TextView) objArr[20], (TextView) objArr[35], (TextView) objArr[43], (TextView) objArr[37], (TextView) objArr[33], (TextView) objArr[18], (TextView) objArr[19], (TextView) objArr[16], (TextView) objArr[28], (TextView) objArr[29], (TextView) objArr[30], (TextView) objArr[12], (TextView) objArr[13], (TextView) objArr[24], (TextView) objArr[25], (TextView) objArr[26], (TextView) objArr[27], (TextView) objArr[14], (TextView) objArr[15], (EditText) objArr[32], (TextView) objArr[10], (TextView) objArr[11], (EditText) objArr[31]);
        this.t0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.s0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        x();
    }
}
