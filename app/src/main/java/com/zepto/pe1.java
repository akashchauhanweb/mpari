package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class pe1 extends oe1 {
    public static final SparseIntArray Q;
    public final LinearLayout M;
    public final FrameLayout N;
    public final vy3 O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.closeIv, 3);
        sparseIntArray.put(R.id.rg_point_a, 4);
        sparseIntArray.put(R.id.a_y, 5);
        sparseIntArray.put(R.id.a_n, 6);
        sparseIntArray.put(R.id.b_y, 7);
        sparseIntArray.put(R.id.b_n, 8);
        sparseIntArray.put(R.id.c_y, 9);
        sparseIntArray.put(R.id.c_n, 10);
        sparseIntArray.put(R.id.d_y, 11);
        sparseIntArray.put(R.id.d_n, 12);
        sparseIntArray.put(R.id.e_y, 13);
        sparseIntArray.put(R.id.e_n, 14);
        sparseIntArray.put(R.id.f_y, 15);
        sparseIntArray.put(R.id.f_n, 16);
        sparseIntArray.put(R.id.form_dec_check, 17);
        sparseIntArray.put(R.id.next_request, 18);
    }

    public pe1(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 19, null, Q));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.P = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.P = 1L;
        }
        u();
    }

    public pe1(jd1 jd1Var, View view, Object[] objArr) {
        super(jd1Var, view, 0, (RadioButton) objArr[6], (RadioButton) objArr[5], (RadioButton) objArr[8], (RadioButton) objArr[7], (RadioButton) objArr[10], (RadioButton) objArr[9], (ImageView) objArr[3], (RadioButton) objArr[12], (RadioButton) objArr[11], (RadioButton) objArr[14], (RadioButton) objArr[13], (RadioButton) objArr[16], (RadioButton) objArr[15], (CheckBox) objArr[17], (CustomWegetLayout) objArr[18], (RadioGroup) objArr[4]);
        this.P = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        this.N = frameLayout;
        frameLayout.setTag(null);
        Object obj = objArr[2];
        this.O = obj != null ? vy3.a((View) obj) : null;
        w(view);
        x();
    }
}
