package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class sa extends ra {
    public static final SparseIntArray K;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 1);
        sparseIntArray.put(R.id.dl_details_title, 2);
        sparseIntArray.put(R.id.center_ll, 3);
        sparseIntArray.put(R.id.tv_appoint_book_succ, 4);
        sparseIntArray.put(R.id.tv_appoint_date, 5);
        sparseIntArray.put(R.id.appointment_date, 6);
        sparseIntArray.put(R.id.tv_appoint_time, 7);
        sparseIntArray.put(R.id.appointment_time, 8);
        sparseIntArray.put(R.id.tv_appln_submit_succ, 9);
        sparseIntArray.put(R.id.notes, 10);
        sparseIntArray.put(R.id.download_acknow, 11);
        sparseIntArray.put(R.id.save_continue_to_next, 12);
    }

    public sa(jd1 jd1Var, View view) {
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
    public sa(jd1 jd1Var, View view, Object[] objArr) {
        MyTextView myTextView = (MyTextView) objArr[6];
        MyTextView myTextView2 = (MyTextView) objArr[8];
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[3];
        MyTextView myTextView3 = (MyTextView) objArr[2];
        TextView textView = (TextView) objArr[11];
        Object obj = objArr[1];
        super(jd1Var, view, 0, myTextView, myTextView2, nestedScrollView, myTextView3, textView, obj != null ? vy3.a((View) obj) : null, (MyTextView) objArr[10], (CustomWegetLayout) objArr[12], (LinearLayout) objArr[0], (MyTextView) objArr[9], (MyTextView) objArr[4], (MyTextView) objArr[5], (MyTextView) objArr[7]);
        this.J = -1L;
        this.E.setTag(null);
        w(view);
        z();
    }
}
