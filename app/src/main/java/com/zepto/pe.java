package com.zepto;

import android.view.View;
import android.widget.ProgressBar;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.pdfview.PDFView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pe extends lq7 {
    public final d47 w;
    public final PDFView x;
    public final ProgressBar y;
    public final CustomWegetLayout z;

    public pe(Object obj, View view, int i, d47 d47Var, PDFView pDFView, ProgressBar progressBar, CustomWegetLayout customWegetLayout) {
        super(obj, view, i);
        this.w = d47Var;
        this.x = pDFView;
        this.y = progressBar;
        this.z = customWegetLayout;
    }
}
