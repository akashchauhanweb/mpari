package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class wb extends vb {
    public static final SparseIntArray F;
    public final LinearLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.applNoTv, 2);
        sparseIntArray.put(R.id.applNoEt, 3);
        sparseIntArray.put(R.id.txt_dob, 4);
        sparseIntArray.put(R.id.txt_dob_val, 5);
        sparseIntArray.put(R.id.submitTv, 6);
        sparseIntArray.put(R.id.resetTv, 7);
    }

    public wb(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 8, null, F));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.E = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.E = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wb(jd1 jd1Var, View view, Object[] objArr) {
        EditText editText = (EditText) objArr[3];
        TextView textView = (TextView) objArr[2];
        Object obj = objArr[1];
        super(jd1Var, view, 0, editText, textView, obj != null ? ri5.a((View) obj) : null, (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[4], (TextView) objArr[5]);
        this.E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        w(view);
        z();
    }
}
