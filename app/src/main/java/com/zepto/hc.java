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
public class hc extends gc {
    public static final SparseIntArray G;
    public final LinearLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.other_New_VehicleLayout, 2);
        sparseIntArray.put(R.id.tv_dl_no, 3);
        sparseIntArray.put(R.id.applNoEt, 4);
        sparseIntArray.put(R.id.dobTv, 5);
        sparseIntArray.put(R.id.dl_dob, 6);
        sparseIntArray.put(R.id.btnCancel, 7);
        sparseIntArray.put(R.id.btn_submit, 8);
    }

    public hc(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 9, null, G));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.F = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hc(jd1 jd1Var, View view, Object[] objArr) {
        EditText editText = (EditText) objArr[4];
        AppCompatButton appCompatButton = (AppCompatButton) objArr[7];
        AppCompatButton appCompatButton2 = (AppCompatButton) objArr[8];
        TextView textView = (TextView) objArr[6];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[5];
        Object obj = objArr[1];
        super(jd1Var, view, 0, editText, appCompatButton, appCompatButton2, textView, appCompatTextView, obj != null ? ri5.a((View) obj) : null, (LinearLayout) objArr[2], (MyTextView) objArr[3]);
        this.F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.E = linearLayout;
        linearLayout.setTag(null);
        w(view);
        z();
    }
}
