package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class qh extends ph {
    public static final SparseIntArray J;
    public final ScrollView G;
    public final LinearLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.holder, 2);
        sparseIntArray.put(R.id.paymentResponseIv, 3);
        sparseIntArray.put(R.id.transactionStatusTv, 4);
        sparseIntArray.put(R.id.challanNoTv, 5);
        sparseIntArray.put(R.id.challanNoValueTv, 6);
        sparseIntArray.put(R.id.amountTv, 7);
        sparseIntArray.put(R.id.amountValueTv, 8);
        sparseIntArray.put(R.id.vehicleNoTv, 9);
        sparseIntArray.put(R.id.vehcileNoValueTv, 10);
        sparseIntArray.put(R.id.buttonTv, 11);
    }

    public qh(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 12, null, J));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.I = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qh(jd1 jd1Var, View view, Object[] objArr) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[7];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[8];
        MyTextView myTextView = (MyTextView) objArr[11];
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[5];
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[6];
        Object obj = objArr[2];
        super(jd1Var, view, 0, appCompatTextView, appCompatTextView2, myTextView, appCompatTextView3, appCompatTextView4, obj != null ? d47.a((View) obj) : null, (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[9]);
        this.I = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.G = scrollView;
        scrollView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.H = linearLayout;
        linearLayout.setTag(null);
        w(view);
        z();
    }
}
