package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class td extends sd {
    public static final SparseIntArray v0;
    public final RelativeLayout t0;
    public long u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.state_rto, 2);
        sparseIntArray.put(R.id.txt_req_submit, 3);
        sparseIntArray.put(R.id.current_state, 4);
        sparseIntArray.put(R.id.txt_req_submit_rto, 5);
        sparseIntArray.put(R.id.current_rto, 6);
        sparseIntArray.put(R.id.txtappdetails, 7);
        sparseIntArray.put(R.id.txtApplicantName, 8);
        sparseIntArray.put(R.id.etApplicantName, 9);
        sparseIntArray.put(R.id.txtApplicantmdlName, 10);
        sparseIntArray.put(R.id.etApplicantmdlName, 11);
        sparseIntArray.put(R.id.txtApplicantlastName, 12);
        sparseIntArray.put(R.id.etApplicantlastName, 13);
        sparseIntArray.put(R.id.txtRelation, 14);
        sparseIntArray.put(R.id.spnRelation, 15);
        sparseIntArray.put(R.id.txtrelfname, 16);
        sparseIntArray.put(R.id.txtrelfnameval, 17);
        sparseIntArray.put(R.id.txtrelmname, 18);
        sparseIntArray.put(R.id.txtrelmnameval, 19);
        sparseIntArray.put(R.id.txtrellname, 20);
        sparseIntArray.put(R.id.txtrellnameval, 21);
        sparseIntArray.put(R.id.txtGender, 22);
        sparseIntArray.put(R.id.genderRg, 23);
        sparseIntArray.put(R.id.maleRb, 24);
        sparseIntArray.put(R.id.femaleRb, 25);
        sparseIntArray.put(R.id.transgenderRb, 26);
        sparseIntArray.put(R.id.txtDob, 27);
        sparseIntArray.put(R.id.dl_dob, 28);
        sparseIntArray.put(R.id.txtBirthPlace, 29);
        sparseIntArray.put(R.id.etBirthPlace, 30);
        sparseIntArray.put(R.id.txtReligion, 31);
        sparseIntArray.put(R.id.spnReligion, 32);
        sparseIntArray.put(R.id.txtEducationQ, 33);
        sparseIntArray.put(R.id.spnEduQual, 34);
        sparseIntArray.put(R.id.txtBloodGroup, 35);
        sparseIntArray.put(R.id.spnBloodGroup, 36);
        sparseIntArray.put(R.id.txtPhoneNo, 37);
        sparseIntArray.put(R.id.etPhoneNo, 38);
        sparseIntArray.put(R.id.txtEmailId, 39);
        sparseIntArray.put(R.id.etEmailId, 40);
        sparseIntArray.put(R.id.txtMobileNo, 41);
        sparseIntArray.put(R.id.etMobileNo, 42);
        sparseIntArray.put(R.id.txtAltMobileNo, 43);
        sparseIntArray.put(R.id.etAltMobileNo, 44);
        sparseIntArray.put(R.id.txtIdentificationMark1, 45);
        sparseIntArray.put(R.id.etIdentificationMark1, 46);
        sparseIntArray.put(R.id.txtIdentificationMark2, 47);
        sparseIntArray.put(R.id.etIdentificationMark2, 48);
        sparseIntArray.put(R.id.btnNext, 49);
    }

    public td(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 50, null, v0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.u0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.u0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.u0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public td(jd1 jd1Var, View view, Object[] objArr) {
        AppCompatButton appCompatButton = (AppCompatButton) objArr[49];
        Spinner spinner = (Spinner) objArr[6];
        Spinner spinner2 = (Spinner) objArr[4];
        TextView textView = (TextView) objArr[28];
        EditText editText = (EditText) objArr[44];
        EditText editText2 = (EditText) objArr[9];
        EditText editText3 = (EditText) objArr[13];
        EditText editText4 = (EditText) objArr[11];
        EditText editText5 = (EditText) objArr[30];
        EditText editText6 = (EditText) objArr[40];
        EditText editText7 = (EditText) objArr[46];
        EditText editText8 = (EditText) objArr[48];
        EditText editText9 = (EditText) objArr[42];
        EditText editText10 = (EditText) objArr[38];
        RadioButton radioButton = (RadioButton) objArr[25];
        RadioGroup radioGroup = (RadioGroup) objArr[23];
        Object obj = objArr[1];
        super(jd1Var, view, 0, appCompatButton, spinner, spinner2, textView, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, radioButton, radioGroup, obj != null ? vy3.a((View) obj) : null, (RadioButton) objArr[24], (Spinner) objArr[36], (Spinner) objArr[34], (Spinner) objArr[15], (Spinner) objArr[32], (TextView) objArr[2], (RadioButton) objArr[26], (TextView) objArr[43], (TextView) objArr[8], (TextView) objArr[12], (TextView) objArr[10], (TextView) objArr[29], (TextView) objArr[35], (TextView) objArr[27], (TextView) objArr[33], (TextView) objArr[39], (TextView) objArr[22], (TextView) objArr[45], (TextView) objArr[47], (TextView) objArr[41], (TextView) objArr[37], (TextView) objArr[14], (TextView) objArr[31], (MyTextView) objArr[3], (MyTextView) objArr[5], (TextView) objArr[7], (TextView) objArr[16], (EditText) objArr[17], (TextView) objArr[20], (EditText) objArr[21], (TextView) objArr[18], (EditText) objArr[19]);
        this.u0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.t0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
