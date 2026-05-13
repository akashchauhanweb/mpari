package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class c56 extends b56 {
    public static final SparseIntArray P;
    public final RelativeLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.topHolder, 1);
        sparseIntArray.put(R.id.topTitleTv, 2);
        sparseIntArray.put(R.id.paymentStatusRl, 3);
        sparseIntArray.put(R.id.routeLengthCb, 4);
        sparseIntArray.put(R.id.paymentView, 5);
        sparseIntArray.put(R.id.basicDetailsCb, 6);
        sparseIntArray.put(R.id.receiptView, 7);
        sparseIntArray.put(R.id.specialDetailCb, 8);
        sparseIntArray.put(R.id.txt_instruction, 9);
        sparseIntArray.put(R.id.routeLengthTv, 10);
        sparseIntArray.put(R.id.routeLengthValue, 11);
        sparseIntArray.put(R.id.serviceTypeTv, 12);
        sparseIntArray.put(R.id.serviceTypeSpn, 13);
        sparseIntArray.put(R.id.rightReasonPin, 14);
        sparseIntArray.put(R.id.btnHolder, 15);
        sparseIntArray.put(R.id.reset, 16);
        sparseIntArray.put(R.id.id_next_service, 17);
    }

    public c56(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 18, null, P));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.O = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.O = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c56(jd1 jd1Var, View view, Object[] objArr) {
        CheckedTextView checkedTextView = (CheckedTextView) objArr[6];
        LinearLayout linearLayout = (LinearLayout) objArr[15];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[17];
        RelativeLayout relativeLayout = (RelativeLayout) objArr[3];
        View view2 = (View) objArr[5];
        View view3 = (View) objArr[7];
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) objArr[16];
        ImageView imageView = (ImageView) objArr[14];
        CheckedTextView checkedTextView2 = (CheckedTextView) objArr[4];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[10];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[11];
        Spinner spinner = (Spinner) objArr[13];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[12];
        CheckedTextView checkedTextView3 = (CheckedTextView) objArr[8];
        Object obj = objArr[1];
        super(jd1Var, view, 0, checkedTextView, linearLayout, customWegetLayout, relativeLayout, view2, view3, customWegetLayout2, imageView, checkedTextView2, appCompatTextView, appCompatEditText, spinner, appCompatTextView2, checkedTextView3, obj != null ? d47.a((View) obj) : null, (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[9]);
        this.O = -1L;
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[0];
        this.N = relativeLayout2;
        relativeLayout2.setTag(null);
        w(view);
        z();
    }
}
