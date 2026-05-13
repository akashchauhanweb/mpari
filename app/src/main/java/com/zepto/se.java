package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.pdfview.PDFView;

/* JADX INFO: loaded from: classes2.dex */
public class se extends re {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.holder1, 1);
        sparseIntArray.put(R.id.pdfView, 2);
        sparseIntArray.put(R.id.progressBar, 3);
        sparseIntArray.put(R.id.downloadpdf, 4);
    }

    public se(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 5, null, C));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.B = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.B = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public se(jd1 jd1Var, View view, Object[] objArr) {
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[4];
        Object obj = objArr[1];
        super(jd1Var, view, 0, customWegetLayout, obj != null ? d47.a((View) obj) : null, (CoordinatorLayout) objArr[0], (PDFView) objArr[2], (ProgressBar) objArr[3]);
        this.B = -1L;
        this.y.setTag(null);
        w(view);
        x();
    }
}
