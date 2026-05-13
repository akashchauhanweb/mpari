package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.Dialog;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ReprintReceipt;
import com.zepto.ef;
import com.zepto.l8;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.wa3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J&\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/view/ReprintReceipt;", "Lcom/zepto/pq;", "", "url", "", "o1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "oldUrl", "userAgent", "contentDisposition", "mimetype", "l1", "C", "Ljava/lang/String;", "mApplNo", "D", "mApplDob", "Landroid/webkit/WebView;", "E", "Landroid/webkit/WebView;", "reprint_rec", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "s1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/ef;", "G", "Lcom/zepto/ef;", "r1", "()Lcom/zepto/ef;", "t1", "(Lcom/zepto/ef;)V", "mBinding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ReprintReceipt extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public WebView reprint_rec;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ef mBinding;

    public static final class a extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            super.onReceivedIcon(webView, bitmap);
        }
    }

    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "sarathiPGResponse", false, 2, (Object) null)) {
                return;
            }
            ReprintReceipt.this.finish();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.e("url", String.valueOf(str));
            super.onPageStarted(webView, str, bitmap);
        }
    }

    public static final void m1(String url, String userAgent, ReprintReceipt this$0, Dialog screen16, View view) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(userAgent, "$userAgent");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(screen16, "$screen16");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url));
        request.addRequestHeader("User-Agent", userAgent);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        Object systemService = this$0.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager downloadManager = (DownloadManager) systemService;
        String str = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb = new StringBuilder();
        sb.append("PayReceipt");
        String str2 = this$0.mApplNo;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str2 = null;
        }
        sb.append(str2);
        sb.append(".pdf");
        request.setDestinationInExternalPublicDir(str, sb.toString());
        downloadManager.enqueue(request);
        screen16.dismiss();
    }

    public static final void n1(Dialog screen16, View view) {
        Intrinsics.checkNotNullParameter(screen16, "$screen16");
        screen16.dismiss();
    }

    private final void o1(String url) {
        WebView webView = this.reprint_rec;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reprint_rec");
            webView = null;
        }
        webView.loadUrl(url);
        WebView webView3 = this.reprint_rec;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reprint_rec");
            webView3 = null;
        }
        webView3.getSettings().setJavaScriptEnabled(true);
        WebView webView4 = this.reprint_rec;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reprint_rec");
            webView4 = null;
        }
        webView4.setDownloadListener(new DownloadListener() { // from class: com.zepto.qb5
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                ReprintReceipt.p1(this.a, str, str2, str3, str4, j);
            }
        });
        WebView webView5 = this.reprint_rec;
        if (webView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reprint_rec");
            webView5 = null;
        }
        webView5.setWebChromeClient(new a());
        WebView webView6 = this.reprint_rec;
        if (webView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reprint_rec");
        } else {
            webView2 = webView6;
        }
        webView2.setWebViewClient(new b());
    }

    public static final void p1(ReprintReceipt this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            l8.s(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return;
        }
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        this$0.l1(str, str2, str3, str4);
    }

    public final void l1(String oldUrl, final String userAgent, String contentDisposition, String mimetype) {
        Intrinsics.checkNotNullParameter(oldUrl, "oldUrl");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(contentDisposition, "contentDisposition");
        Intrinsics.checkNotNullParameter(mimetype, "mimetype");
        Log.e("url", oldUrl);
        StringBuilder sb = new StringBuilder();
        sb.append(oldUrl);
        sb.append("?applno=");
        String str = this.mApplNo;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        sb.append(str);
        sb.append("&vsno=1");
        final String string = sb.toString();
        Log.e("urlnew", string);
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.screen_16);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.title_popup);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText("NextGen mParivahan");
        ((TextView) viewFindViewById2).setText("Do you want to save Payment Receipt ?");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceipt.m1(string, userAgent, this, dialog, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceipt.n1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reprint);
        ef efVarX = ef.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(efVarX, "inflate(...)");
        t1(efVarX);
        setContentView(r1().m());
        s1(new wa3(this));
        r1().x.g.setText(q1().b("btn_challan_print_receipt", "Print Receipt"));
        View viewFindViewById = findViewById(R.id.reprint_rec);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.reprint_rec = (WebView) viewFindViewById;
        if (getIntent() != null) {
            this.mApplNo = String.valueOf(getIntent().getStringExtra("app_no"));
            this.mApplDob = String.valueOf(getIntent().getStringExtra("app_dob"));
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(s14.a.y());
            sb.append("PrintConformMob.jsp?applno=");
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            sb.append(str);
            sb.append("&dob=");
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            sb.append(str2);
            o1(sb.toString());
        } catch (Exception unused) {
        }
    }

    public final wa3 q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ef r1() {
        ef efVar = this.mBinding;
        if (efVar != null) {
            return efVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final void s1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void t1(ef efVar) {
        Intrinsics.checkNotNullParameter(efVar, "<set-?>");
        this.mBinding = efVar;
    }
}
