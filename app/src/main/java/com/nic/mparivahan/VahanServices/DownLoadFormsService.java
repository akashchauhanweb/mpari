package com.nic.mparivahan.VahanServices;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.nic.mparivahan.R;
import com.pdfview.PDFView;
import com.zepto.ik4;
import com.zepto.pg4;
import com.zepto.pq;
import com.zepto.rr6;
import com.zepto.ws6;
import com.zepto.x22;
import com.zepto.xr2;
import com.zepto.yy0;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 82\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\"\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\bH\u0002J \u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0012\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006:"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DownLoadFormsService;", "Lcom/zepto/pq;", "", "J0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "oldUrl", "l1", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/content/Context;", "context", "n1", "url", "k1", "dirPath", "fileName", "m1", "Landroid/net/Uri;", "uri", "q1", "Ljava/io/File;", "file", "p1", "Lcom/pdfview/PDFView;", "C", "Lcom/pdfview/PDFView;", "pdfView", "Landroid/widget/ProgressBar;", "D", "Landroid/widget/ProgressBar;", "progressBar", "Lcom/zepto/ws6;", "E", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "o1", "(Lcom/zepto/ws6;)V", "sessionManager", "F", "Ljava/lang/String;", "getNewReceiptUrl", "()Ljava/lang/String;", "setNewReceiptUrl", "(Ljava/lang/String;)V", "newReceiptUrl", "<init>", "()V", "G", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DownLoadFormsService extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public PDFView pdfView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressBar progressBar;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String newReceiptUrl = "";

    public static final class b implements pg4 {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ DownLoadFormsService c;

        public b(String str, String str2, DownLoadFormsService downLoadFormsService) {
            this.a = str;
            this.b = str2;
            this.c = downLoadFormsService;
        }

        @Override // com.zepto.pg4
        public void a() {
            File file = new File(this.a, this.b);
            ProgressBar progressBar = this.c.progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                progressBar = null;
            }
            progressBar.setVisibility(8);
            this.c.p1(file);
        }

        @Override // com.zepto.pg4
        public void b(x22 x22Var) {
            ProgressBar progressBar = this.c.progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                progressBar = null;
            }
            progressBar.setVisibility(8);
            Toast.makeText(this.c, "Error in Downloading File : " + x22Var, 1).show();
        }
    }

    private final void J0() {
        View viewFindViewById = findViewById(R.id.pdfView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.pdfView = (PDFView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.progressBar = (ProgressBar) viewFindViewById2;
        o1(new ws6(this));
        ik4.c(getApplicationContext());
        k1(this.newReceiptUrl);
        l1(this.newReceiptUrl);
    }

    public final void k1(String url) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        m1(url, n1(this), getIntent().getStringExtra("formType") + '_' + getIntent().getStringExtra("applNo") + '_' + System.currentTimeMillis() + ".pdf");
    }

    public final void l1(String oldUrl) {
        Intrinsics.checkNotNullParameter(oldUrl, "oldUrl");
        try {
            ws6 ws6Var = new ws6(this);
            Toast.makeText(this, getIntent().getStringExtra("formType") + " successfully saved in storage.", 1).show();
            Object systemService = getSystemService("download");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(oldUrl));
            request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(oldUrl));
            request.addRequestHeader(xr2.HEADER_CONTENT_TYPE, "application/pdf");
            request.addRequestHeader("Authorization", "Bearer " + ws6Var.r());
            request.allowScanningByMediaScanner();
            request.setTitle(getIntent().getStringExtra("formType"));
            request.setDescription("NextGen mParivahan  " + getIntent().getStringExtra("formType"));
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, getIntent().getStringExtra("formType") + '_' + getIntent().getStringExtra("applNo") + '_' + System.currentTimeMillis() + ".pdf");
            ((DownloadManager) systemService).enqueue(request);
            Toast.makeText(this, "Receipt Saved Successfully in the Storage", 0).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void m1(String url, String dirPath, String fileName) {
        ik4.b(url, dirPath, fileName).b("Authorization", "Bearer AAIgNjYxYmFkN2U3M2Y2ZTM0YmI4NjI1OTc0OTY2YjliNGbDPw9h50HTiW1PisP03GtXP-vNd8HNTbbqd9KnmFLVpJAjBxY9qASruQONFn7QrmYPr72omo-yvgmcuMaZysESOGgxDIcJzqPIdIKNYkaWd8KSfmdidqntIpbwgZPY1gQ").a().G(new b(dirPath, fileName, this));
    }

    public final String n1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.areEqual("mounted", Environment.getExternalStorageState())) {
            String absolutePath = context.getApplicationContext().getFilesDir().getAbsolutePath();
            Intrinsics.checkNotNull(absolutePath);
            return absolutePath;
        }
        File file = yy0.g(context.getApplicationContext(), null)[0];
        Intrinsics.checkNotNullExpressionValue(file, "get(...)");
        String absolutePath2 = file.getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath2);
        return absolutePath2;
    }

    public final void o1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 99 && resultCode == -1 && data != null) {
            q1(data.getData());
        }
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        J0();
        try {
            this.newReceiptUrl = String.valueOf(getIntent().getStringExtra("url"));
        } catch (Exception unused) {
        }
    }

    public final void p1(File file) {
        PDFView pDFView = this.pdfView;
        if (pDFView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdfView");
            pDFView = null;
        }
        pDFView.U0(file).V0();
    }

    public final void q1(Uri uri) {
        if (uri != null) {
            PDFView pDFView = this.pdfView;
            if (pDFView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pdfView");
                pDFView = null;
            }
            pDFView.U0(rr6.a(uri)).V0();
        }
    }
}
