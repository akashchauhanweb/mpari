package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class kg extends jg {
    public static final SparseIntArray R;
    public final RelativeLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.topHolder, 1);
        sparseIntArray.put(R.id.topTitleTv, 2);
        sparseIntArray.put(R.id.paymentStatusRl, 3);
        sparseIntArray.put(R.id.routeLengthCb, 4);
        sparseIntArray.put(R.id.paymentView, 5);
        sparseIntArray.put(R.id.basicDetailsCb, 6);
        sparseIntArray.put(R.id.receiptView, 7);
        sparseIntArray.put(R.id.specialDetailCb, 8);
        sparseIntArray.put(R.id.allotmentOfficeTv, 9);
        sparseIntArray.put(R.id.allotmentOfficeValue, 10);
        sparseIntArray.put(R.id.validFromDateTv, 11);
        sparseIntArray.put(R.id.validDateFromValue, 12);
        sparseIntArray.put(R.id.periodModeTv, 13);
        sparseIntArray.put(R.id.periodModeSpin, 14);
        sparseIntArray.put(R.id.rightReasonPin, 15);
        sparseIntArray.put(R.id.periodTv, 16);
        sparseIntArray.put(R.id.period, 17);
        sparseIntArray.put(R.id.periodpin, 18);
        sparseIntArray.put(R.id.btnNext, 19);
    }

    public kg(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 20, null, R));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.Q = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.Q = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kg(jd1 jd1Var, View view, Object[] objArr) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[9];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[10];
        CheckedTextView checkedTextView = (CheckedTextView) objArr[6];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[19];
        RelativeLayout relativeLayout = (RelativeLayout) objArr[3];
        View view2 = (View) objArr[5];
        Spinner spinner = (Spinner) objArr[17];
        Spinner spinner2 = (Spinner) objArr[14];
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[13];
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[16];
        ImageView imageView = (ImageView) objArr[18];
        View view3 = (View) objArr[7];
        ImageView imageView2 = (ImageView) objArr[15];
        CheckedTextView checkedTextView2 = (CheckedTextView) objArr[4];
        CheckedTextView checkedTextView3 = (CheckedTextView) objArr[8];
        Object obj = objArr[1];
        super(jd1Var, view, 0, appCompatTextView, appCompatTextView2, checkedTextView, customWegetLayout, relativeLayout, view2, spinner, spinner2, appCompatTextView3, appCompatTextView4, imageView, view3, imageView2, checkedTextView2, checkedTextView3, obj != null ? d47.a((View) obj) : null, (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[11]);
        this.Q = -1L;
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[0];
        this.P = relativeLayout2;
        relativeLayout2.setTag(null);
        w(view);
        z();
    }
}
