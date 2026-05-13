package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class sc extends rc {
    public static final SparseIntArray K;
    public final LinearLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.mvvm_back, 1);
        sparseIntArray.put(R.id.main_icon, 2);
        sparseIntArray.put(R.id.service_label, 3);
        sparseIntArray.put(R.id.txt_dl_service, 4);
        sparseIntArray.put(R.id.btn_my_vehicle_two, 5);
        sparseIntArray.put(R.id.other_New_VehicleLayout, 6);
        sparseIntArray.put(R.id.tv_dl_no, 7);
        sparseIntArray.put(R.id.cl_number, 8);
        sparseIntArray.put(R.id.chassi_number, 9);
        sparseIntArray.put(R.id.dl_dob, 10);
        sparseIntArray.put(R.id.btn_reset, 11);
        sparseIntArray.put(R.id.btn_submit, 12);
    }

    public sc(jd1 jd1Var, View view) {
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

    public void x() {
        synchronized (this) {
            this.J = 1L;
        }
        u();
    }

    public sc(jd1 jd1Var, View view, Object[] objArr) {
        super(jd1Var, view, 0, (TextView) objArr[5], (AppCompatButton) objArr[11], (AppCompatButton) objArr[12], (AppCompatTextView) objArr[9], (EditText) objArr[8], (TextView) objArr[10], (ImageView) objArr[2], (ImageView) objArr[1], (LinearLayout) objArr[6], (TextView) objArr[3], (MyTextView) objArr[7], (MyTextView) objArr[4]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        w(view);
        x();
    }
}
