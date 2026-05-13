package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ee extends de {
    public static final SparseIntArray i0;
    public final LinearLayout g0;
    public long h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i0 = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.appCategory, 2);
        sparseIntArray.put(R.id.applicantCatFl, 3);
        sparseIntArray.put(R.id.spn_app_cat, 4);
        sparseIntArray.put(R.id.txt_app_category, 5);
        sparseIntArray.put(R.id.infoIv, 6);
        sparseIntArray.put(R.id.selectLearnerClassLl, 7);
        sparseIntArray.put(R.id.selectedVehicleClassTv, 8);
        sparseIntArray.put(R.id.selectedVehicleClassLl, 9);
        sparseIntArray.put(R.id.applicantTrainedFromDSchoolRl, 10);
        sparseIntArray.put(R.id.applicantTrainedFromCb, 11);
        sparseIntArray.put(R.id.addDrivingSchoolTv, 12);
        sparseIntArray.put(R.id.form1Tv, 13);
        sparseIntArray.put(R.id.disqualifiedLicenceCb, 14);
        sparseIntArray.put(R.id.disqualificationLl, 15);
        sparseIntArray.put(R.id.dlNoTv, 16);
        sparseIntArray.put(R.id.dlNoEt, 17);
        sparseIntArray.put(R.id.issueDate, 18);
        sparseIntArray.put(R.id.issueDateEt, 19);
        sparseIntArray.put(R.id.txtStatus, 20);
        sparseIntArray.put(R.id.statusSpn, 21);
        sparseIntArray.put(R.id.fromDate, 22);
        sparseIntArray.put(R.id.fromDateValue, 23);
        sparseIntArray.put(R.id.toDate, 24);
        sparseIntArray.put(R.id.toDateValue, 25);
        sparseIntArray.put(R.id.issueAuthority, 26);
        sparseIntArray.put(R.id.issueAuthorityEt, 27);
        sparseIntArray.put(R.id.tv_note_organ_donate, 28);
        sparseIntArray.put(R.id.willToDonateRg, 29);
        sparseIntArray.put(R.id.willing_to_donate, 30);
        sparseIntArray.put(R.id.not_willing_to_donate, 31);
        sparseIntArray.put(R.id.org_mob_number, 32);
        sparseIntArray.put(R.id.selfDeclartionCb, 33);
        sparseIntArray.put(R.id.selfFormTv, 34);
        sparseIntArray.put(R.id.cancelTv, 35);
        sparseIntArray.put(R.id.nextTv, 36);
    }

    public ee(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 37, null, i0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.h0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.h0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.h0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ee(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[12];
        MyTextView myTextView = (MyTextView) objArr[2];
        FrameLayout frameLayout = (FrameLayout) objArr[3];
        CheckBox checkBox = (CheckBox) objArr[11];
        RelativeLayout relativeLayout = (RelativeLayout) objArr[10];
        TextView textView2 = (TextView) objArr[35];
        LinearLayout linearLayout = (LinearLayout) objArr[15];
        CheckBox checkBox2 = (CheckBox) objArr[14];
        EditText editText = (EditText) objArr[17];
        TextView textView3 = (TextView) objArr[16];
        TextView textView4 = (TextView) objArr[13];
        TextView textView5 = (TextView) objArr[22];
        TextView textView6 = (TextView) objArr[23];
        ImageView imageView = (ImageView) objArr[6];
        TextView textView7 = (TextView) objArr[26];
        EditText editText2 = (EditText) objArr[27];
        TextView textView8 = (TextView) objArr[18];
        TextView textView9 = (TextView) objArr[19];
        Object obj = objArr[1];
        super(jd1Var, view, 0, textView, myTextView, frameLayout, checkBox, relativeLayout, textView2, linearLayout, checkBox2, editText, textView3, textView4, textView5, textView6, imageView, textView7, editText2, textView8, textView9, obj != null ? ri5.a((View) obj) : null, (TextView) objArr[36], (RadioButton) objArr[31], (AppCompatEditText) objArr[32], (LinearLayout) objArr[7], (LinearLayout) objArr[9], (TextView) objArr[8], (CheckBox) objArr[33], (TextView) objArr[34], (Spinner) objArr[4], (Spinner) objArr[21], (TextView) objArr[24], (TextView) objArr[25], (MyTextView) objArr[28], (TextView) objArr[5], (TextView) objArr[20], (RadioGroup) objArr[29], (RadioButton) objArr[30]);
        this.h0 = -1L;
        LinearLayout linearLayout2 = (LinearLayout) objArr[0];
        this.g0 = linearLayout2;
        linearLayout2.setTag(null);
        w(view);
        z();
    }
}
