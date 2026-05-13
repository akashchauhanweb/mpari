package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class xd extends wd {
    public static final SparseIntArray f0;
    public final RelativeLayout d0;
    public long e0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txtFirstAidDetails, 2);
        sparseIntArray.put(R.id.new_app_arrow_up_current, 3);
        sparseIntArray.put(R.id.new_app_arrow_down_current, 4);
        sparseIntArray.put(R.id.txtFaIssuingInstName, 5);
        sparseIntArray.put(R.id.etFaIssuingInstName, 6);
        sparseIntArray.put(R.id.txtCertificationNo, 7);
        sparseIntArray.put(R.id.etCertificationNo, 8);
        sparseIntArray.put(R.id.txtIssuedPlace, 9);
        sparseIntArray.put(R.id.etIssuedPlace, 10);
        sparseIntArray.put(R.id.txtIssueDate, 11);
        sparseIntArray.put(R.id.issueDate, 12);
        sparseIntArray.put(R.id.txtPermanent, 13);
        sparseIntArray.put(R.id.permanentRg, 14);
        sparseIntArray.put(R.id.maleRb, 15);
        sparseIntArray.put(R.id.femaleRb, 16);
        sparseIntArray.put(R.id.txtMedicalFitnessDetails, 17);
        sparseIntArray.put(R.id.m_new_app_arrow_up_current, 18);
        sparseIntArray.put(R.id.m_new_app_arrow_down_current, 19);
        sparseIntArray.put(R.id.txtFitnessCertNo, 20);
        sparseIntArray.put(R.id.etFitnessCertNo, 21);
        sparseIntArray.put(R.id.txtDoctorName, 22);
        sparseIntArray.put(R.id.etDoctorName, 23);
        sparseIntArray.put(R.id.txtDoctorRegNo, 24);
        sparseIntArray.put(R.id.etDoctorRegNo, 25);
        sparseIntArray.put(R.id.txtClinicName, 26);
        sparseIntArray.put(R.id.etClinicName, 27);
        sparseIntArray.put(R.id.txtMedicalIssueDate, 28);
        sparseIntArray.put(R.id.medicalIssueDate, 29);
        sparseIntArray.put(R.id.txtDeclaration, 30);
        sparseIntArray.put(R.id.willingToDonate, 31);
        sparseIntArray.put(R.id.declare, 32);
        sparseIntArray.put(R.id.btnSubmit, 33);
    }

    public xd(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 34, null, f0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.e0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.e0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.e0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xd(jd1 jd1Var, View view, Object[] objArr) {
        AppCompatButton appCompatButton = (AppCompatButton) objArr[33];
        CheckBox checkBox = (CheckBox) objArr[32];
        EditText editText = (EditText) objArr[8];
        EditText editText2 = (EditText) objArr[27];
        EditText editText3 = (EditText) objArr[23];
        EditText editText4 = (EditText) objArr[25];
        EditText editText5 = (EditText) objArr[6];
        EditText editText6 = (EditText) objArr[21];
        EditText editText7 = (EditText) objArr[10];
        RadioButton radioButton = (RadioButton) objArr[16];
        TextView textView = (TextView) objArr[12];
        Object obj = objArr[1];
        super(jd1Var, view, 0, appCompatButton, checkBox, editText, editText2, editText3, editText4, editText5, editText6, editText7, radioButton, textView, obj != null ? vy3.a((View) obj) : null, (ImageView) objArr[19], (ImageView) objArr[18], (RadioButton) objArr[15], (TextView) objArr[29], (ImageView) objArr[4], (ImageView) objArr[3], (RadioGroup) objArr[14], (TextView) objArr[7], (TextView) objArr[26], (TextView) objArr[30], (TextView) objArr[22], (TextView) objArr[24], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[20], (TextView) objArr[11], (TextView) objArr[9], (TextView) objArr[17], (TextView) objArr[28], (TextView) objArr[13], (CheckBox) objArr[31]);
        this.e0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.d0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
