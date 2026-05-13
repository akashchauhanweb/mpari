package com.nic.mparivahan.VahanServices;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadReceipt;
import com.zepto.o36;
import com.zepto.pq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DownloadReceipt;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Lcom/zepto/o36;", "C", "Lcom/zepto/o36;", "j1", "()Lcom/zepto/o36;", "l1", "(Lcom/zepto/o36;)V", "binding", "", "D", "Ljava/lang/String;", "receiptUrl", "E", "oldUrl", "F", "apptId", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DownloadReceipt extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public o36 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String receiptUrl = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String oldUrl = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String apptId = "";

    public static final class a extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String Url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(Url, "Url");
            Log.e("URL: -->", Url);
            view.loadUrl(Url);
            return true;
        }
    }

    public static final void k1(DownloadReceipt this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setMimeType(str4);
        request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
        request.addRequestHeader("User-Agent", str2);
        request.setDescription("Downloading file...");
        request.setTitle(URLUtil.guessFileName(str, str3, str4));
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDestinationInExternalFilesDir(this$0, Environment.DIRECTORY_DOWNLOADS, ".pdf");
        Object systemService = this$0.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        ((DownloadManager) systemService).enqueue(request);
        Toast.makeText(this$0.getApplicationContext(), "Downloading File", 1).show();
    }

    public final o36 j1() {
        o36 o36Var = this.binding;
        if (o36Var != null) {
            return o36Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void l1(o36 o36Var) {
        Intrinsics.checkNotNullParameter(o36Var, "<set-?>");
        this.binding = o36Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        if (j1().e.canGoBack()) {
            j1().e.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slot_receipt_activity);
        o36 o36VarC = o36.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o36VarC, "inflate(...)");
        l1(o36VarC);
        setContentView(j1().b());
        if (getIntent() != null) {
            if (getIntent().hasExtra("vahanReceiptUrl")) {
                String stringExtra = getIntent().getStringExtra("vahanReceiptUrl");
                Intrinsics.checkNotNull(stringExtra);
                this.receiptUrl = stringExtra;
            }
            if (getIntent().hasExtra("apptId")) {
                String stringExtra2 = getIntent().getStringExtra("apptId");
                Intrinsics.checkNotNull(stringExtra2);
                this.apptId = stringExtra2;
            }
        }
        String str = this.receiptUrl;
        this.oldUrl = str;
        this.receiptUrl = StringsKt__StringsKt.trim((CharSequence) str).toString();
        j1().e.loadUrl(this.receiptUrl);
        j1().e.setWebViewClient(new a());
        j1().e.setDownloadListener(new DownloadListener() { // from class: com.zepto.mw1
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                DownloadReceipt.k1(this.a, str2, str3, str4, str5, j);
            }
        });
    }
}
