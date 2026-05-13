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
public class oa extends na {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 1);
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.dl_details_title, 3);
        sparseIntArray.put(R.id.center_ll, 4);
        sparseIntArray.put(R.id.tv_appoint_book_succ, 5);
        sparseIntArray.put(R.id.tv_appoint_date, 6);
        sparseIntArray.put(R.id.appointment_date, 7);
        sparseIntArray.put(R.id.tv_appoint_time, 8);
        sparseIntArray.put(R.id.appointment_time, 9);
        sparseIntArray.put(R.id.tv_appln_submit_succ, 10);
        sparseIntArray.put(R.id.notes, 11);
        sparseIntArray.put(R.id.download_acknow, 12);
        sparseIntArray.put(R.id.save_continue_to_next, 13);
    }

    public oa(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 14, null, L));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.K = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oa(jd1 jd1Var, View view, Object[] objArr) {
        MyTextView myTextView = (MyTextView) objArr[7];
        MyTextView myTextView2 = (MyTextView) objArr[9];
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[4];
        MyTextView myTextView3 = (MyTextView) objArr[3];
        TextView textView = (TextView) objArr[12];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[1];
        super(jd1Var, view, 0, myTextView, myTextView2, nestedScrollView, myTextView3, textView, vy3VarA, obj2 != null ? iy3.a((View) obj2) : null, (MyTextView) objArr[11], (CustomWegetLayout) objArr[13], (LinearLayout) objArr[0], (MyTextView) objArr[10], (MyTextView) objArr[5], (MyTextView) objArr[6], (MyTextView) objArr[8]);
        this.K = -1L;
        this.F.setTag(null);
        w(view);
        x();
    }
}
