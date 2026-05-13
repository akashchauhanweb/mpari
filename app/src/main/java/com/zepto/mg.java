package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class mg extends lg {
    public static final SparseIntArray d0;
    public final RelativeLayout b0;
    public long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d0 = sparseIntArray;
        sparseIntArray.put(R.id.topHolder, 1);
        sparseIntArray.put(R.id.topTitleTv, 2);
        sparseIntArray.put(R.id.paymentStatusRl, 3);
        sparseIntArray.put(R.id.routeLengthCb, 4);
        sparseIntArray.put(R.id.paymentView, 5);
        sparseIntArray.put(R.id.basicDetailsCb, 6);
        sparseIntArray.put(R.id.receiptView, 7);
        sparseIntArray.put(R.id.specialDetailCb, 8);
        sparseIntArray.put(R.id.validUpToTv, 9);
        sparseIntArray.put(R.id.validUptoValue, 10);
        sparseIntArray.put(R.id.travelFromTv, 11);
        sparseIntArray.put(R.id.travelFromEt, 12);
        sparseIntArray.put(R.id.travelUptoTv, 13);
        sparseIntArray.put(R.id.travelUptoEt, 14);
        sparseIntArray.put(R.id.natureOfGoodsTxt, 15);
        sparseIntArray.put(R.id.natureOfGoodSpn, 16);
        sparseIntArray.put(R.id.rightReasonPin, 17);
        sparseIntArray.put(R.id.goodsTv, 18);
        sparseIntArray.put(R.id.goodsSpn, 19);
        sparseIntArray.put(R.id.otherGoodsDetailsTv, 20);
        sparseIntArray.put(R.id.otherGoodsDetailEt, 21);
        sparseIntArray.put(R.id.purposeOfJourneyTv, 22);
        sparseIntArray.put(R.id.journeyPurSpn, 23);
        sparseIntArray.put(R.id.purposeJourTv, 24);
        sparseIntArray.put(R.id.purposeJourEt, 25);
        sparseIntArray.put(R.id.routeDescTxt, 26);
        sparseIntArray.put(R.id.routeDescEt, 27);
        sparseIntArray.put(R.id.btnHolder, 28);
        sparseIntArray.put(R.id.addPasander, 29);
        sparseIntArray.put(R.id.reset, 30);
        sparseIntArray.put(R.id.id_next_service, 31);
    }

    public mg(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 32, null, d0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.c0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.c0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.c0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mg(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[29];
        CheckedTextView checkedTextView = (CheckedTextView) objArr[6];
        LinearLayout linearLayout = (LinearLayout) objArr[28];
        Spinner spinner = (Spinner) objArr[19];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[18];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[31];
        Spinner spinner2 = (Spinner) objArr[23];
        Spinner spinner3 = (Spinner) objArr[16];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[15];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[21];
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[20];
        RelativeLayout relativeLayout = (RelativeLayout) objArr[3];
        View view2 = (View) objArr[5];
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) objArr[25];
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[24];
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) objArr[22];
        View view3 = (View) objArr[7];
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) objArr[30];
        ImageView imageView = (ImageView) objArr[17];
        AppCompatEditText appCompatEditText3 = (AppCompatEditText) objArr[27];
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) objArr[26];
        CheckedTextView checkedTextView2 = (CheckedTextView) objArr[4];
        CheckedTextView checkedTextView3 = (CheckedTextView) objArr[8];
        Object obj = objArr[1];
        super(jd1Var, view, 0, textView, checkedTextView, linearLayout, spinner, appCompatTextView, customWegetLayout, spinner2, spinner3, appCompatTextView2, appCompatEditText, appCompatTextView3, relativeLayout, view2, appCompatEditText2, appCompatTextView4, appCompatTextView5, view3, customWegetLayout2, imageView, appCompatEditText3, appCompatTextView6, checkedTextView2, checkedTextView3, obj != null ? d47.a((View) obj) : null, (AppCompatTextView) objArr[2], (AppCompatEditText) objArr[12], (AppCompatTextView) objArr[11], (AppCompatEditText) objArr[14], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[10]);
        this.c0 = -1L;
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[0];
        this.b0 = relativeLayout2;
        relativeLayout2.setTag(null);
        w(view);
        z();
    }
}
