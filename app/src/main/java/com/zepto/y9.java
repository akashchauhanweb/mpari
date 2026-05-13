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

/* JADX INFO: loaded from: classes2.dex */
public class y9 extends x9 {
    public static final SparseIntArray o0;
    public final RelativeLayout m0;
    public long n0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        o0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txtappdetails, 2);
        sparseIntArray.put(R.id.txtApplicantName, 3);
        sparseIntArray.put(R.id.etApplicantName, 4);
        sparseIntArray.put(R.id.etApplicantmdlName, 5);
        sparseIntArray.put(R.id.etApplicantlastName, 6);
        sparseIntArray.put(R.id.txt_app_full_name, 7);
        sparseIntArray.put(R.id.txt_full_name_val, 8);
        sparseIntArray.put(R.id.txtRelation, 9);
        sparseIntArray.put(R.id.spnRelation, 10);
        sparseIntArray.put(R.id.relationDetails, 11);
        sparseIntArray.put(R.id.txtrelfnameval, 12);
        sparseIntArray.put(R.id.txtrelmnameval, 13);
        sparseIntArray.put(R.id.txtrellnameval, 14);
        sparseIntArray.put(R.id.txtGender, 15);
        sparseIntArray.put(R.id.genderRg, 16);
        sparseIntArray.put(R.id.maleRb, 17);
        sparseIntArray.put(R.id.femaleRb, 18);
        sparseIntArray.put(R.id.transgenderRb, 19);
        sparseIntArray.put(R.id.txtDob, 20);
        sparseIntArray.put(R.id.dl_dob, 21);
        sparseIntArray.put(R.id.txtBirthPlace, 22);
        sparseIntArray.put(R.id.etBirthPlace, 23);
        sparseIntArray.put(R.id.txtReligion, 24);
        sparseIntArray.put(R.id.etCountryName, 25);
        sparseIntArray.put(R.id.txtEducationQ, 26);
        sparseIntArray.put(R.id.etEducationQualification, 27);
        sparseIntArray.put(R.id.txtBloodGroup, 28);
        sparseIntArray.put(R.id.etBloodGroup, 29);
        sparseIntArray.put(R.id.txtPhoneNo, 30);
        sparseIntArray.put(R.id.etPhoneNo, 31);
        sparseIntArray.put(R.id.txtEmailId, 32);
        sparseIntArray.put(R.id.etEmailId, 33);
        sparseIntArray.put(R.id.txtMobileNo, 34);
        sparseIntArray.put(R.id.etMobileNo, 35);
        sparseIntArray.put(R.id.txtAltMobileNo, 36);
        sparseIntArray.put(R.id.etAltMobileNo, 37);
        sparseIntArray.put(R.id.txtIdentificationMark1, 38);
        sparseIntArray.put(R.id.etIdentificationMark1, 39);
        sparseIntArray.put(R.id.txtIdentificationMark2, 40);
        sparseIntArray.put(R.id.etIdentificationMark2, 41);
        sparseIntArray.put(R.id.btnNext, 42);
    }

    public y9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 43, null, o0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.n0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.n0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.n0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y9(jd1 jd1Var, View view, Object[] objArr) {
        AppCompatButton appCompatButton = (AppCompatButton) objArr[42];
        TextView textView = (TextView) objArr[21];
        EditText editText = (EditText) objArr[37];
        EditText editText2 = (EditText) objArr[4];
        EditText editText3 = (EditText) objArr[6];
        EditText editText4 = (EditText) objArr[5];
        EditText editText5 = (EditText) objArr[23];
        EditText editText6 = (EditText) objArr[29];
        EditText editText7 = (EditText) objArr[25];
        EditText editText8 = (EditText) objArr[27];
        EditText editText9 = (EditText) objArr[33];
        EditText editText10 = (EditText) objArr[39];
        EditText editText11 = (EditText) objArr[41];
        EditText editText12 = (EditText) objArr[35];
        EditText editText13 = (EditText) objArr[31];
        RadioButton radioButton = (RadioButton) objArr[18];
        RadioGroup radioGroup = (RadioGroup) objArr[16];
        Object obj = objArr[1];
        super(jd1Var, view, 0, appCompatButton, textView, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, editText12, editText13, radioButton, radioGroup, obj != null ? ri5.a((View) obj) : null, (RadioButton) objArr[17], (TextView) objArr[11], (Spinner) objArr[10], (RadioButton) objArr[19], (TextView) objArr[36], (TextView) objArr[7], (TextView) objArr[3], (TextView) objArr[22], (TextView) objArr[28], (TextView) objArr[20], (TextView) objArr[26], (TextView) objArr[32], (EditText) objArr[8], (TextView) objArr[15], (TextView) objArr[38], (TextView) objArr[40], (TextView) objArr[34], (TextView) objArr[30], (TextView) objArr[9], (TextView) objArr[24], (TextView) objArr[2], (EditText) objArr[12], (EditText) objArr[14], (EditText) objArr[13]);
        this.n0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.m0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
