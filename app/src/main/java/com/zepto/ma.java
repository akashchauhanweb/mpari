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
public class ma extends la {
    public static final SparseIntArray N;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.multi_head_layout, 2);
        sparseIntArray.put(R.id.mvvm_back, 3);
        sparseIntArray.put(R.id.service_label_ack, 4);
        sparseIntArray.put(R.id.mvvm_home, 5);
        sparseIntArray.put(R.id.round_card_view, 6);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 7);
        sparseIntArray.put(R.id.container_cl, 8);
        sparseIntArray.put(R.id.application_No_Tv, 9);
        sparseIntArray.put(R.id.imageView6, 10);
        sparseIntArray.put(R.id.download_acknow, 11);
        sparseIntArray.put(R.id.save_continue_to_next, 12);
        sparseIntArray.put(R.id.screenshot_fb, 13);
        sparseIntArray.put(R.id.tv_save_image, 14);
        sparseIntArray.put(R.id.tv_save_forms, 15);
    }

    public ma(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 16, null, N));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.M = 2L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ma(jd1 jd1Var, View view, Object[] objArr) {
        MyTextView myTextView = (MyTextView) objArr[9];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[8];
        TextView textView = (TextView) objArr[11];
        ImageView imageView = (ImageView) objArr[10];
        ImageView imageView2 = (ImageView) objArr[7];
        Object obj = objArr[1];
        super(jd1Var, view, 0, myTextView, constraintLayout, textView, imageView, imageView2, obj != null ? iy3.a((View) obj) : null, (LinearLayout) objArr[2], (ImageView) objArr[3], (ImageView) objArr[5], (CardView) objArr[6], (CustomWegetLayout) objArr[12], (LinearLayout) objArr[13], (TextView) objArr[4], (LinearLayout) objArr[0], (CustomWegetLayout) objArr[15], (TextView) objArr[14]);
        this.M = -1L;
        this.J.setTag(null);
        w(view);
        x();
    }
}
