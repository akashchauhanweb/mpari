package com.nic.mparivahan.VahanServices;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ViewFormsActivity;
import com.zepto.pq;
import com.zepto.sq7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J/\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0003R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010-\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\"R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/nic/mparivahan/VahanServices/ViewFormsActivity;", "Lcom/zepto/pq;", "", "p1", "s1", "m1", "w1", "t1", "n1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/webkit/WebView;", "webView", "v1", "Lcom/zepto/sq7;", "C", "Lcom/zepto/sq7;", "binding", "D", "Ljava/lang/String;", "appendedUrl", "E", "I", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "F", "Z", "doubleBackToExitPressedOnce", "G", "formType", "H", "applNo", "Landroid/app/ProgressDialog;", "Landroid/app/ProgressDialog;", "o1", "()Landroid/app/ProgressDialog;", "u1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ViewFormsActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public sq7 binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String appendedUrl = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final int PERMISSION_CODE_READ_EXTERNAL_STORAGE = 10211;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String formType = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String applNo = "";

    public static final class a extends WebViewClient {
        public boolean a;

        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.a) {
                ViewFormsActivity.this.o1().dismiss();
                try {
                    ViewFormsActivity.this.n1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.a = true;
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            if (ViewFormsActivity.this.o1().isShowing()) {
                ViewFormsActivity.this.o1().dismiss();
            }
            super.onReceivedError(view, request, error);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView != null) {
                webView.loadUrl(strValueOf);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    private final void m1() {
        if (checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.PERMISSION_CODE_READ_EXTERNAL_STORAGE);
        } else {
            s1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1() {
        try {
            Object systemService = getSystemService("download");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.appendedUrl));
            request.setNotificationVisibility(1);
            request.setDestinationInExternalFilesDir(getApplicationContext(), Environment.DIRECTORY_DOWNLOADS, "");
            request.setTitle(this.applNo + this.formType);
            ((DownloadManager) systemService).enqueue(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void p1() {
        sq7 sq7Var = this.binding;
        sq7 sq7Var2 = null;
        if (sq7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq7Var = null;
        }
        sq7Var.b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewFormsActivity.q1(this.a, view);
            }
        });
        sq7 sq7Var3 = this.binding;
        if (sq7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq7Var3 = null;
        }
        sq7Var3.b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewFormsActivity.r1(this.a, view);
            }
        });
        sq7 sq7Var4 = this.binding;
        if (sq7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            sq7Var2 = sq7Var4;
        }
        sq7Var2.c.getSettings().setJavaScriptEnabled(true);
    }

    public static final void q1(ViewFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        sq7 sq7Var = this$0.binding;
        sq7 sq7Var2 = null;
        if (sq7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq7Var = null;
        }
        if (!sq7Var.c.canGoBack()) {
            this$0.w1();
            return;
        }
        sq7 sq7Var3 = this$0.binding;
        if (sq7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            sq7Var2 = sq7Var3;
        }
        sq7Var2.c.goBack();
    }

    public static final void r1(ViewFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1();
    }

    private final void s1() {
        try {
            o1().show();
            String str = "https://drive.google.com/viewerng/viewer?embedded=true&url=" + this.appendedUrl;
            sq7 sq7Var = this.binding;
            sq7 sq7Var2 = null;
            if (sq7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq7Var = null;
            }
            WebView paymentWv = sq7Var.c;
            Intrinsics.checkNotNullExpressionValue(paymentWv, "paymentWv");
            v1(paymentWv);
            sq7 sq7Var3 = this.binding;
            if (sq7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq7Var3 = null;
            }
            sq7Var3.c.loadUrl(str);
            Log.e("Form URL ->", str);
            sq7 sq7Var4 = this.binding;
            if (sq7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq7Var2 = sq7Var4;
            }
            sq7Var2.c.setWebViewClient(new a());
        } catch (Exception e) {
            e.printStackTrace();
            if (o1().isShowing()) {
                o1().dismiss();
            }
        }
    }

    private final void t1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void w1() {
        if (this.doubleBackToExitPressedOnce) {
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.pq7
            @Override // java.lang.Runnable
            public final void run() {
                ViewFormsActivity.x1(this.c);
            }
        }, 2000L);
    }

    public static final void x1(ViewFormsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_forms);
        sq7 sq7VarB = sq7.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sq7VarB, "inflate(...)");
        this.binding = sq7VarB;
        if (sq7VarB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq7VarB = null;
        }
        setContentView(sq7VarB.d);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("url");
            Intrinsics.checkNotNull(stringExtra);
            this.appendedUrl = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("formType");
            Intrinsics.checkNotNull(stringExtra2);
            this.formType = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("applNo");
            Intrinsics.checkNotNull(stringExtra3);
            this.applNo = stringExtra3;
        }
        u1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        m1();
        p1();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        sq7 sq7Var = this.binding;
        sq7 sq7Var2 = null;
        if (sq7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq7Var = null;
        }
        if (!sq7Var.c.canGoBack()) {
            w1();
            return true;
        }
        sq7 sq7Var3 = this.binding;
        if (sq7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            sq7Var2 = sq7Var3;
        }
        sq7Var2.c.goBack();
        return true;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.PERMISSION_CODE_READ_EXTERNAL_STORAGE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                s1();
            } else {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
            }
        }
    }

    public final void u1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void v1(WebView webView) {
        try {
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setSupportZoom(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setMixedContentMode(0);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setAllowContentAccess(true);
            CookieManager cookieManager = CookieManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
            cookieManager.setAcceptThirdPartyCookies(webView, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
