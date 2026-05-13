package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class oc extends nc {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.mvvm_back, 2);
        sparseIntArray.put(R.id.main_icon, 3);
        sparseIntArray.put(R.id.service_label, 4);
        sparseIntArray.put(R.id.round_card_view, 5);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 6);
        sparseIntArray.put(R.id.container_cl, 7);
        sparseIntArray.put(R.id.application_No_Tv, 8);
        sparseIntArray.put(R.id.imageView6, 9);
        sparseIntArray.put(R.id.save_screen, 10);
        sparseIntArray.put(R.id.save_continue_to_next, 11);
    }

    public oc(jd1 jd1Var, View view) {
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
            this.I = 2L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oc(jd1 jd1Var, View view, Object[] objArr) {
        MyTextView myTextView = (MyTextView) objArr[8];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[7];
        ImageView imageView = (ImageView) objArr[9];
        ImageView imageView2 = (ImageView) objArr[6];
        ImageView imageView3 = (ImageView) objArr[3];
        Object obj = objArr[1];
        super(jd1Var, view, 0, myTextView, constraintLayout, imageView, imageView2, imageView3, obj != null ? iy3.a((View) obj) : null, (ImageView) objArr[2], (CardView) objArr[5], (CustomWegetLayout) objArr[11], (CustomWegetLayout) objArr[10], (TextView) objArr[4], (LinearLayout) objArr[0]);
        this.I = -1L;
        this.H.setTag(null);
        w(view);
        z();
    }
}
