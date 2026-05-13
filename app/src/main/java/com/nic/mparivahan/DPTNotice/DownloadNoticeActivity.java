package com.nic.mparivahan.DPTNotice;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
import com.nic.mparivahan.DPTNotice.DownloadNoticeActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.zepto.lv4;
import com.zepto.pq;
import com.zepto.rw4;
import com.zepto.wa3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/DownloadNoticeActivity;", "Lcom/zepto/pq;", "", "t1", "z1", "", "visible", "C1", "F1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "y1", "x1", "D1", "Landroid/webkit/WebView;", "webView", "q1", "Lcom/zepto/rw4;", "C", "Lcom/zepto/rw4;", "progress", "D", "Z", "isLoaded", "E", "doubleBackToExitPressedOnce", "", "F", "Ljava/lang/String;", "printUrl", "G", "challanNo", "H", "fromActivity", "Landroid/widget/RelativeLayout;", "I", "Landroid/widget/RelativeLayout;", "nexGenHolder", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "B1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/lv4;", "K", "Lcom/zepto/lv4;", "r1", "()Lcom/zepto/lv4;", "A1", "(Lcom/zepto/lv4;)V", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDownloadNoticeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadNoticeActivity.kt\ncom/nic/mparivahan/DPTNotice/DownloadNoticeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public final class DownloadNoticeActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String printUrl = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String fromActivity = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public RelativeLayout nexGenHolder;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public lv4 binding;

    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            DownloadNoticeActivity.this.isLoaded = true;
            DownloadNoticeActivity.this.C1(false);
            DownloadNoticeActivity downloadNoticeActivity = DownloadNoticeActivity.this;
            Intrinsics.checkNotNull(webView);
            downloadNoticeActivity.q1(webView);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            DownloadNoticeActivity.this.C1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            DownloadNoticeActivity.this.isLoaded = false;
            DownloadNoticeActivity.this.C1(false);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(boolean visible) {
        if (visible) {
            try {
                this.progress = new rw4(this, R.string.blank, true);
            } catch (WindowManager.BadTokenException e) {
                e.printStackTrace();
                return;
            }
        }
        rw4 rw4Var = this.progress;
        if (rw4Var != null) {
            if (visible) {
                rw4Var.b();
            } else {
                rw4Var.a();
            }
        }
    }

    public static final void E1(DownloadNoticeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }

    private final void F1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, s1().b("label_challan_double_click_exit", getString(R.string.double_click_to_exit)), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.hw1
            @Override // java.lang.Runnable
            public final void run() {
                DownloadNoticeActivity.G1(this.c);
            }
        }, 2000L);
    }

    public static final void G1(DownloadNoticeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void t1() {
        r1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadNoticeActivity.u1(this.a, view);
            }
        });
        View viewFindViewById = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.nexGenHolder = (RelativeLayout) viewFindViewById;
        r1().c.getSettings().setJavaScriptEnabled(true);
        if (!x1()) {
            D1();
            return;
        }
        if (x1() && !this.isLoaded) {
            y1();
        }
        r1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadNoticeActivity.v1(this.a, view);
            }
        });
        RelativeLayout relativeLayout = this.nexGenHolder;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadNoticeActivity.w1(this.a, view);
            }
        });
    }

    public static final void u1(DownloadNoticeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void v1(DownloadNoticeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.r1().c.canGoBack()) {
            this$0.r1().c.goBack();
        } else {
            this$0.F1();
        }
    }

    public static final void w1(DownloadNoticeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1();
    }

    private final void z1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(lv4 lv4Var) {
        Intrinsics.checkNotNullParameter(lv4Var, "<set-?>");
        this.binding = lv4Var;
    }

    public final void B1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void D1() {
        LinearLayout linearLayout = r1().d;
        String strB = s1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try));
        Intrinsics.checkNotNull(strB);
        Snackbar snackbarL0 = Snackbar.l0(linearLayout, strB, -2);
        Intrinsics.checkNotNullExpressionValue(snackbarL0, "make(...)");
        snackbarL0.n0(getString(R.string.settings), new View.OnClickListener() { // from class: com.zepto.lw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadNoticeActivity.E1(this.a, view);
            }
        });
        snackbarL0.W();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv4 lv4VarC = lv4.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(lv4VarC, "inflate(...)");
        A1(lv4VarC);
        setContentView(r1().d);
        B1(new wa3(this));
        String stringExtra = getIntent().getStringExtra("challanPdfUrl");
        Intrinsics.checkNotNull(stringExtra);
        this.printUrl = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("challanNo");
        Intrinsics.checkNotNull(stringExtra2);
        this.challanNo = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("fromActivity");
        Intrinsics.checkNotNull(stringExtra3);
        this.fromActivity = stringExtra3;
        r1().b.i.setText(s1().b("btn_download_notice", getString(R.string.download_notice)));
        t1();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        if (r1().c.canGoBack()) {
            r1().c.goBack();
            return true;
        }
        F1();
        return true;
    }

    public final void q1(WebView webView) {
        Object systemService = getSystemService("print");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.print.PrintManager");
        PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter(this.challanNo);
        Intrinsics.checkNotNullExpressionValue(printDocumentAdapterCreatePrintDocumentAdapter, "createPrintDocumentAdapter(...)");
        ((PrintManager) systemService).print(getString(R.string.app_name) + this.challanNo, printDocumentAdapterCreatePrintDocumentAdapter, new PrintAttributes.Builder().build());
    }

    public final lv4 r1() {
        lv4 lv4Var = this.binding;
        if (lv4Var != null) {
            return lv4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 s1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final boolean x1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3));
    }

    public final void y1() {
        r1().c.loadUrl(this.printUrl);
        r1().c.setWebViewClient(new a());
    }
}
