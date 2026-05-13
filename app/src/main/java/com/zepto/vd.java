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
public class vd extends ud {
    public static final SparseIntArray I;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.mvvm_back, 1);
        sparseIntArray.put(R.id.main_icon, 2);
        sparseIntArray.put(R.id.service_label, 3);
        sparseIntArray.put(R.id.round_card_view, 4);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 5);
        sparseIntArray.put(R.id.container_cl, 6);
        sparseIntArray.put(R.id.application_No_Tv, 7);
        sparseIntArray.put(R.id.imageView6, 8);
        sparseIntArray.put(R.id.save_screen, 9);
        sparseIntArray.put(R.id.save_continue_to_next, 10);
    }

    public vd(jd1 jd1Var, View view) {
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
            this.H = 2L;
        }
        u();
    }

    public vd(jd1 jd1Var, View view, Object[] objArr) {
        super(jd1Var, view, 0, (MyTextView) objArr[7], (ConstraintLayout) objArr[6], (ImageView) objArr[8], (ImageView) objArr[5], (ImageView) objArr[2], (ImageView) objArr[1], (CardView) objArr[4], (CustomWegetLayout) objArr[10], (CustomWegetLayout) objArr[9], (TextView) objArr[3], (LinearLayout) objArr[0]);
        this.H = -1L;
        this.G.setTag(null);
        w(view);
        z();
    }
}
