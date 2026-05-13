package com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.PDFViewInternalAcitvity;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.pdfview.PDFView;
import com.zepto.pq;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0003R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/PDFViewInternalAcitvity;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "k1", "t1", "", "C", "Ljava/lang/String;", "m1", "()Ljava/lang/String;", "r1", "(Ljava/lang/String;)V", "namePDF", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "D", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "l1", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "q1", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "mainLayout", "Landroid/widget/TextView;", "E", "Landroid/widget/TextView;", "n1", "()Landroid/widget/TextView;", "s1", "(Landroid/widget/TextView;)V", "vahan_service_lable", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPDFViewInternalAcitvity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PDFViewInternalAcitvity.kt\ncom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/PDFViewInternalAcitvity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class PDFViewInternalAcitvity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String namePDF;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public CoordinatorLayout mainLayout;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView vahan_service_lable;

    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PDFViewInternalAcitvity.this.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
        }
    }

    public static final void o1(PDFViewInternalAcitvity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k1();
    }

    public static final void p1(PDFViewInternalAcitvity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void k1() {
        File file = new File(getFilesDir(), "fitness_pdf_file.pdf");
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + File.separator + m1() + ".pdf");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileOutputStream.close();
                    fileInputStream.close();
                    Log.e("fileDown", "success");
                    t1();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final CoordinatorLayout l1() {
        CoordinatorLayout coordinatorLayout = this.mainLayout;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainLayout");
        return null;
    }

    public final String m1() {
        String str = this.namePDF;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("namePDF");
        return null;
    }

    public final TextView n1() {
        TextView textView = this.vahan_service_lable;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahan_service_lable");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview_internal_acitvity);
        PDFView pDFView = (PDFView) findViewById(R.id.pdfView);
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) findViewById(R.id.downloadpdf);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.mvvm_back);
        View viewFindViewById = findViewById(R.id.layout_main);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        q1((CoordinatorLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.vahan_service_lable);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        s1((TextView) viewFindViewById2);
        r1(String.valueOf(getIntent().getStringExtra("pdfname")));
        n1().setText(String.valueOf(getIntent().getStringExtra("HeaderName")));
        pDFView.U0(new File(getFilesDir(), "fitness_pdf_file.pdf")).V0();
        customWegetLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ek4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PDFViewInternalAcitvity.o1(this.a, view);
            }
        });
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PDFViewInternalAcitvity.p1(this.a, view);
            }
        });
    }

    public final void q1(CoordinatorLayout coordinatorLayout) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<set-?>");
        this.mainLayout = coordinatorLayout;
    }

    public final void r1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.namePDF = str;
    }

    public final void s1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vahan_service_lable = textView;
    }

    public final void t1() {
        Snackbar snackbarN0 = Snackbar.l0(l1(), "Download successful", 5000).n0("Open", new a());
        Intrinsics.checkNotNullExpressionValue(snackbarN0, "setAction(...)");
        snackbarN0.W();
    }
}
