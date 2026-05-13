package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class f9 extends e9 {
    public static final SparseIntArray I;
    public final LinearLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txt_dl_service, 2);
        sparseIntArray.put(R.id.btn_my_vehicle_two, 3);
        sparseIntArray.put(R.id.other_New_VehicleLayout, 4);
        sparseIntArray.put(R.id.tv_dl_no, 5);
        sparseIntArray.put(R.id.cl_number, 6);
        sparseIntArray.put(R.id.chassi_number, 7);
        sparseIntArray.put(R.id.dl_dob, 8);
        sparseIntArray.put(R.id.btn_reset, 9);
        sparseIntArray.put(R.id.btn_submit, 10);
    }

    public f9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 11, null, I));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.H = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f9(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[3];
        AppCompatButton appCompatButton = (AppCompatButton) objArr[9];
        AppCompatButton appCompatButton2 = (AppCompatButton) objArr[10];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[7];
        EditText editText = (EditText) objArr[6];
        TextView textView2 = (TextView) objArr[8];
        Object obj = objArr[1];
        super(jd1Var, view, 0, textView, appCompatButton, appCompatButton2, appCompatTextView, editText, textView2, obj != null ? ri5.a((View) obj) : null, (LinearLayout) objArr[4], (MyTextView) objArr[5], (MyTextView) objArr[2]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        w(view);
        z();
    }
}
