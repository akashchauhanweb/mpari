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
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class j9 extends i9 {
    public static final SparseIntArray T;
    public final LinearLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.stateTv, 2);
        sparseIntArray.put(R.id.stateEt, 3);
        sparseIntArray.put(R.id.rtoTv, 4);
        sparseIntArray.put(R.id.rtoEt, 5);
        sparseIntArray.put(R.id.txt_app_category, 6);
        sparseIntArray.put(R.id.infoIv, 7);
        sparseIntArray.put(R.id.selectLearnerClassLl, 8);
        sparseIntArray.put(R.id.selectedVehicleClassTv, 9);
        sparseIntArray.put(R.id.selectedVehicleClassLl, 10);
        sparseIntArray.put(R.id.applicantTrainedFromDSchoolRl, 11);
        sparseIntArray.put(R.id.applicantTrainedFromCb, 12);
        sparseIntArray.put(R.id.addDrivingSchoolTv, 13);
        sparseIntArray.put(R.id.tv_note_organ_donate, 14);
        sparseIntArray.put(R.id.willToDonateRg, 15);
        sparseIntArray.put(R.id.willing_to_donate, 16);
        sparseIntArray.put(R.id.not_willing_to_donate, 17);
        sparseIntArray.put(R.id.selfDeclartionCb, 18);
        sparseIntArray.put(R.id.selfFormTv, 19);
        sparseIntArray.put(R.id.cancelTv, 20);
        sparseIntArray.put(R.id.nextTv, 21);
    }

    public j9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 22, null, T));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.S = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.S = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j9(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[13];
        CheckBox checkBox = (CheckBox) objArr[12];
        RelativeLayout relativeLayout = (RelativeLayout) objArr[11];
        TextView textView2 = (TextView) objArr[20];
        ImageView imageView = (ImageView) objArr[7];
        Object obj = objArr[1];
        super(jd1Var, view, 0, textView, checkBox, relativeLayout, textView2, imageView, obj != null ? ri5.a((View) obj) : null, (TextView) objArr[21], (RadioButton) objArr[17], (EditText) objArr[5], (TextView) objArr[4], (LinearLayout) objArr[8], (LinearLayout) objArr[10], (TextView) objArr[9], (CheckBox) objArr[18], (TextView) objArr[19], (EditText) objArr[3], (TextView) objArr[2], (MyTextView) objArr[14], (TextView) objArr[6], (RadioGroup) objArr[15], (RadioButton) objArr[16]);
        this.S = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.R = linearLayout;
        linearLayout.setTag(null);
        w(view);
        z();
    }
}
