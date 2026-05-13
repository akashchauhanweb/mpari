package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class vg extends ug {
    public static final SparseIntArray K;
    public final ScrollView H;
    public final LinearLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.topHolder, 2);
        sparseIntArray.put(R.id.vehicleNumberTv, 3);
        sparseIntArray.put(R.id.vehicle_view, 4);
        sparseIntArray.put(R.id.freshPermitTv, 5);
        sparseIntArray.put(R.id.release_date, 6);
        sparseIntArray.put(R.id.permitNoEt, 7);
        sparseIntArray.put(R.id.validFromTv, 8);
        sparseIntArray.put(R.id.validFromValueTv, 9);
        sparseIntArray.put(R.id.validUptoTv, 10);
        sparseIntArray.put(R.id.validUptoValueTv, 11);
        sparseIntArray.put(R.id.btnSubmit, 12);
    }

    public vg(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 13, null, K));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.J = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vg(jd1 jd1Var, View view, Object[] objArr) {
        AppCompatButton appCompatButton = (AppCompatButton) objArr[12];
        MyTextView myTextView = (MyTextView) objArr[5];
        EditText editText = (EditText) objArr[7];
        MyTextView myTextView2 = (MyTextView) objArr[6];
        Object obj = objArr[2];
        super(jd1Var, view, 0, appCompatButton, myTextView, editText, myTextView2, obj != null ? d47.a((View) obj) : null, (MyTextView) objArr[8], (TextView) objArr[9], (MyTextView) objArr[10], (TextView) objArr[11], (TextView) objArr[3], (TextView) objArr[4]);
        this.J = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.H = scrollView;
        scrollView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.I = linearLayout;
        linearLayout.setTag(null);
        w(view);
        z();
    }
}
