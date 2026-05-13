package com.zepto;

import android.view.View;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.pdfview.PDFView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class re extends lq7 {
    public final ProgressBar A;
    public final CustomWegetLayout w;
    public final d47 x;
    public final CoordinatorLayout y;
    public final PDFView z;

    public re(Object obj, View view, int i, CustomWegetLayout customWegetLayout, d47 d47Var, CoordinatorLayout coordinatorLayout, PDFView pDFView, ProgressBar progressBar) {
        super(obj, view, i);
        this.w = customWegetLayout;
        this.x = d47Var;
        this.y = coordinatorLayout;
        this.z = pDFView;
        this.A = progressBar;
    }
}
