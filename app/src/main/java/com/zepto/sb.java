package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
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
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class sb extends rb {
    public static final SparseIntArray s0;
    public final RelativeLayout q0;
    public long r0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        s0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 2);
        sparseIntArray.put(R.id.topHolder, 3);
        sparseIntArray.put(R.id.txt_app_category, 4);
        sparseIntArray.put(R.id.infoIv, 5);
        sparseIntArray.put(R.id.first_name_ll, 6);
        sparseIntArray.put(R.id.mdl_name_ll, 7);
        sparseIntArray.put(R.id.last_name_ll, 8);
        sparseIntArray.put(R.id.txt_full_name, 9);
        sparseIntArray.put(R.id.txt_full_name_val, 10);
        sparseIntArray.put(R.id.txt_relation, 11);
        sparseIntArray.put(R.id.relationSpinner, 12);
        sparseIntArray.put(R.id.first_name_rel_ll, 13);
        sparseIntArray.put(R.id.mdl_name_rel_ll, 14);
        sparseIntArray.put(R.id.last_name_rel_ll, 15);
        sparseIntArray.put(R.id.txtGender, 16);
        sparseIntArray.put(R.id.radioGroupGender, 17);
        sparseIntArray.put(R.id.radioMale, 18);
        sparseIntArray.put(R.id.radioFemale, 19);
        sparseIntArray.put(R.id.radiotrans, 20);
        sparseIntArray.put(R.id.txt_dob, 21);
        sparseIntArray.put(R.id.txt_dob_val, 22);
        sparseIntArray.put(R.id.orTxt, 23);
        sparseIntArray.put(R.id.txtAge, 24);
        sparseIntArray.put(R.id.ageEt, 25);
        sparseIntArray.put(R.id.txt_pob, 26);
        sparseIntArray.put(R.id.txt_pob_val, 27);
        sparseIntArray.put(R.id.txt_birth_con, 28);
        sparseIntArray.put(R.id.spn_birth_con, 29);
        sparseIntArray.put(R.id.txt_qualication, 30);
        sparseIntArray.put(R.id.spn_qualification, 31);
        sparseIntArray.put(R.id.txt_blood_grp, 32);
        sparseIntArray.put(R.id.spn_blood_grp, 33);
        sparseIntArray.put(R.id.txt_landline_number, 34);
        sparseIntArray.put(R.id.txt_landline_number_val, 35);
        sparseIntArray.put(R.id.txt_email_id, 36);
        sparseIntArray.put(R.id.txt_email_id_val, 37);
        sparseIntArray.put(R.id.txt_alt_mob, 38);
        sparseIntArray.put(R.id.txt_alternative_number, 39);
        sparseIntArray.put(R.id.txt_emer_mob, 40);
        sparseIntArray.put(R.id.txt_emer_mob_number, 41);
        sparseIntArray.put(R.id.txt_marks, 42);
        sparseIntArray.put(R.id.txt_marks_val, 43);
        sparseIntArray.put(R.id.txt_marks_val_two, 44);
        sparseIntArray.put(R.id.reset, 45);
        sparseIntArray.put(R.id.id_next_service, 46);
    }

    public sb(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 47, null, s0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.r0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.r0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.r0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sb(jd1 jd1Var, View view, Object[] objArr) {
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[25];
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        EditText editText = (EditText) objArr[6];
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) objArr[13];
        TextView textView = (TextView) objArr[46];
        ImageView imageView = (ImageView) objArr[5];
        EditText editText2 = (EditText) objArr[8];
        AppCompatEditText appCompatEditText3 = (AppCompatEditText) objArr[15];
        Object obj = objArr[1];
        super(jd1Var, view, 0, appCompatEditText, linearLayout, editText, appCompatEditText2, textView, imageView, editText2, appCompatEditText3, obj != null ? ri5.a((View) obj) : null, (AppCompatEditText) objArr[7], (AppCompatEditText) objArr[14], (TextView) objArr[23], (RadioButton) objArr[19], (RadioGroup) objArr[17], (RadioButton) objArr[18], (RadioButton) objArr[20], (Spinner) objArr[12], (TextView) objArr[45], (Spinner) objArr[29], (Spinner) objArr[33], (Spinner) objArr[31], (RelativeLayout) objArr[3], (TextView) objArr[24], (AppCompatTextView) objArr[38], (AppCompatEditText) objArr[39], (TextView) objArr[4], (AppCompatTextView) objArr[28], (AppCompatTextView) objArr[32], (TextView) objArr[21], (TextView) objArr[22], (AppCompatTextView) objArr[36], (AppCompatEditText) objArr[37], (AppCompatTextView) objArr[40], (AppCompatEditText) objArr[41], (TextView) objArr[9], (EditText) objArr[10], (TextView) objArr[16], (AppCompatTextView) objArr[34], (AppCompatEditText) objArr[35], (AppCompatTextView) objArr[42], (AppCompatEditText) objArr[43], (AppCompatEditText) objArr[44], (AppCompatTextView) objArr[26], (AppCompatEditText) objArr[27], (AppCompatTextView) objArr[30], (TextView) objArr[11]);
        this.r0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.q0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
