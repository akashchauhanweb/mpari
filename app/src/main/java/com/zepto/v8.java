package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class v8 extends u8 {
    public static final SparseIntArray s0;
    public final RelativeLayout q0;
    public long r0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        s0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.selected_covs, 2);
        sparseIntArray.put(R.id.txt_app_category, 3);
        sparseIntArray.put(R.id.selectLearnerClassLl, 4);
        sparseIntArray.put(R.id.selectedVehicleClassTv, 5);
        sparseIntArray.put(R.id.selectedVehicleClassLl, 6);
        sparseIntArray.put(R.id.applicantTrainedFromLl, 7);
        sparseIntArray.put(R.id.classOfVehicleForTrainingTv, 8);
        sparseIntArray.put(R.id.trainingVehicleSpinnerRl, 9);
        sparseIntArray.put(R.id.trainingVehicleSpinner, 10);
        sparseIntArray.put(R.id.secondHolderLl, 11);
        sparseIntArray.put(R.id.stateWiseDrivingSchoolRl, 12);
        sparseIntArray.put(R.id.stateWiseDrivingSchoolCb, 13);
        sparseIntArray.put(R.id.drivingSchoolRl, 14);
        sparseIntArray.put(R.id.drivingSchoolSpinner, 15);
        sparseIntArray.put(R.id.enrollmentDetailsLl, 16);
        sparseIntArray.put(R.id.enrollmentNoEt, 17);
        sparseIntArray.put(R.id.enrollmentDateEt, 18);
        sparseIntArray.put(R.id.certificateNoEt, 19);
        sparseIntArray.put(R.id.certificateDateEt, 20);
        sparseIntArray.put(R.id.trainedFromEt, 21);
        sparseIntArray.put(R.id.trainedToEt, 22);
        sparseIntArray.put(R.id.addMoreBtn, 23);
        sparseIntArray.put(R.id.addedLearningDataRv, 24);
        sparseIntArray.put(R.id.form1Tv, 25);
        sparseIntArray.put(R.id.disqualificationLl, 26);
        sparseIntArray.put(R.id.dlNoTv, 27);
        sparseIntArray.put(R.id.dlNoEt, 28);
        sparseIntArray.put(R.id.issueDate, 29);
        sparseIntArray.put(R.id.issueDateEt, 30);
        sparseIntArray.put(R.id.txtStatus, 31);
        sparseIntArray.put(R.id.statusSpn, 32);
        sparseIntArray.put(R.id.fromDate, 33);
        sparseIntArray.put(R.id.fromDateValue, 34);
        sparseIntArray.put(R.id.toDate, 35);
        sparseIntArray.put(R.id.toDateValue, 36);
        sparseIntArray.put(R.id.issueAuthority, 37);
        sparseIntArray.put(R.id.issueAuthorityEt, 38);
        sparseIntArray.put(R.id.tv_note_organ_donate, 39);
        sparseIntArray.put(R.id.willToDonateRg, 40);
        sparseIntArray.put(R.id.willing_to_donate, 41);
        sparseIntArray.put(R.id.not_willing_to_donate, 42);
        sparseIntArray.put(R.id.org_mob_number, 43);
        sparseIntArray.put(R.id.selfDeclartionCb, 44);
        sparseIntArray.put(R.id.cancelTv, 45);
        sparseIntArray.put(R.id.nextTv, 46);
    }

    public v8(jd1 jd1Var, View view) {
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
    public v8(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[23];
        RecyclerView recyclerView = (RecyclerView) objArr[24];
        LinearLayout linearLayout = (LinearLayout) objArr[7];
        TextView textView2 = (TextView) objArr[45];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[20];
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) objArr[19];
        TextView textView3 = (TextView) objArr[8];
        LinearLayout linearLayout2 = (LinearLayout) objArr[26];
        EditText editText = (EditText) objArr[28];
        TextView textView4 = (TextView) objArr[27];
        RelativeLayout relativeLayout = (RelativeLayout) objArr[14];
        Spinner spinner = (Spinner) objArr[15];
        AppCompatEditText appCompatEditText3 = (AppCompatEditText) objArr[18];
        LinearLayout linearLayout3 = (LinearLayout) objArr[16];
        AppCompatEditText appCompatEditText4 = (AppCompatEditText) objArr[17];
        TextView textView5 = (TextView) objArr[25];
        TextView textView6 = (TextView) objArr[33];
        TextView textView7 = (TextView) objArr[34];
        TextView textView8 = (TextView) objArr[37];
        EditText editText2 = (EditText) objArr[38];
        TextView textView9 = (TextView) objArr[29];
        TextView textView10 = (TextView) objArr[30];
        Object obj = objArr[1];
        super(jd1Var, view, 0, textView, recyclerView, linearLayout, textView2, appCompatEditText, appCompatEditText2, textView3, linearLayout2, editText, textView4, relativeLayout, spinner, appCompatEditText3, linearLayout3, appCompatEditText4, textView5, textView6, textView7, textView8, editText2, textView9, textView10, obj != null ? vy3.a((View) obj) : null, (TextView) objArr[46], (RadioButton) objArr[42], (AppCompatEditText) objArr[43], (LinearLayout) objArr[11], (LinearLayout) objArr[4], (TextView) objArr[2], (LinearLayout) objArr[6], (TextView) objArr[5], (CheckBox) objArr[44], (CheckBox) objArr[13], (RelativeLayout) objArr[12], (Spinner) objArr[32], (TextView) objArr[35], (TextView) objArr[36], (AppCompatEditText) objArr[21], (AppCompatEditText) objArr[22], (Spinner) objArr[10], (RelativeLayout) objArr[9], (MyTextView) objArr[39], (TextView) objArr[3], (TextView) objArr[31], (RadioGroup) objArr[40], (RadioButton) objArr[41]);
        this.r0 = -1L;
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[0];
        this.q0 = relativeLayout2;
        relativeLayout2.setTag(null);
        w(view);
        z();
    }
}
