package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class q9 extends p9 {
    public static final SparseIntArray b0;
    public final LinearLayout Z;
    public long a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.addedLearningDataRv, 2);
        sparseIntArray.put(R.id.applicantTrainedFromLl, 3);
        sparseIntArray.put(R.id.classOfVehicleForTrainingTv, 4);
        sparseIntArray.put(R.id.trainingVehicleSpinnerRl, 5);
        sparseIntArray.put(R.id.trainingVehicleSpinner, 6);
        sparseIntArray.put(R.id.secondHolderLl, 7);
        sparseIntArray.put(R.id.stateWiseDrivingSchoolRl, 8);
        sparseIntArray.put(R.id.stateWiseDrivingSchoolCb, 9);
        sparseIntArray.put(R.id.stateWiseDSchoolListTv, 10);
        sparseIntArray.put(R.id.drivingSchoolRl, 11);
        sparseIntArray.put(R.id.drivingSchoolSpinner, 12);
        sparseIntArray.put(R.id.enrollmentDetailsLl, 13);
        sparseIntArray.put(R.id.enrollmentNoTv, 14);
        sparseIntArray.put(R.id.enrollmentNoEt, 15);
        sparseIntArray.put(R.id.enrollmentDateTv, 16);
        sparseIntArray.put(R.id.enrollmentDateEt, 17);
        sparseIntArray.put(R.id.certificateNoTv, 18);
        sparseIntArray.put(R.id.certificateNoEt, 19);
        sparseIntArray.put(R.id.certificateDateTv, 20);
        sparseIntArray.put(R.id.certificateDateEt, 21);
        sparseIntArray.put(R.id.trainedFromTv, 22);
        sparseIntArray.put(R.id.trainedFromEt, 23);
        sparseIntArray.put(R.id.trainedToTv, 24);
        sparseIntArray.put(R.id.trainedToEt, 25);
        sparseIntArray.put(R.id.doubleBtnHolder, 26);
        sparseIntArray.put(R.id.saveBtn, 27);
        sparseIntArray.put(R.id.saveSingleBtn, 28);
        sparseIntArray.put(R.id.backBtn, 29);
    }

    public q9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 30, null, b0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.a0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.a0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.a0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q9(jd1 jd1Var, View view, Object[] objArr) {
        RecyclerView recyclerView = (RecyclerView) objArr[2];
        LinearLayout linearLayout = (LinearLayout) objArr[3];
        TextView textView = (TextView) objArr[29];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[21];
        TextView textView2 = (TextView) objArr[20];
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) objArr[19];
        TextView textView3 = (TextView) objArr[18];
        TextView textView4 = (TextView) objArr[4];
        LinearLayout linearLayout2 = (LinearLayout) objArr[26];
        RelativeLayout relativeLayout = (RelativeLayout) objArr[11];
        EditText editText = (EditText) objArr[12];
        AppCompatEditText appCompatEditText3 = (AppCompatEditText) objArr[17];
        TextView textView5 = (TextView) objArr[16];
        LinearLayout linearLayout3 = (LinearLayout) objArr[13];
        AppCompatEditText appCompatEditText4 = (AppCompatEditText) objArr[15];
        TextView textView6 = (TextView) objArr[14];
        Object obj = objArr[1];
        super(jd1Var, view, 0, recyclerView, linearLayout, textView, appCompatEditText, textView2, appCompatEditText2, textView3, textView4, linearLayout2, relativeLayout, editText, appCompatEditText3, textView5, linearLayout3, appCompatEditText4, textView6, obj != null ? ri5.a((View) obj) : null, (TextView) objArr[27], (TextView) objArr[28], (LinearLayout) objArr[7], (TextView) objArr[10], (CheckBox) objArr[9], (RelativeLayout) objArr[8], (AppCompatEditText) objArr[23], (TextView) objArr[22], (AppCompatEditText) objArr[25], (TextView) objArr[24], (EditText) objArr[6], (RelativeLayout) objArr[5]);
        this.a0 = -1L;
        LinearLayout linearLayout4 = (LinearLayout) objArr[0];
        this.Z = linearLayout4;
        linearLayout4.setTag(null);
        w(view);
        z();
    }
}
