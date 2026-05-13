package com.nic.mparivahan.VahanServices.VahanPayment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanReceiptDownload;
import com.zepto.o36;
import com.zepto.pq;
import com.zepto.rw4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J/\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0016\u00104\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010'R\u001c\u00109\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPayment/VahanReceiptDownload;", "Lcom/zepto/pq;", "", "q1", "u1", "y1", "", "visible", "x1", "v1", "o1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "C", "I", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "Lcom/zepto/o36;", "D", "Lcom/zepto/o36;", "p1", "()Lcom/zepto/o36;", "w1", "(Lcom/zepto/o36;)V", "binding", "E", "Ljava/lang/String;", "receiptUrl", "F", "oldUrl", "Lcom/zepto/rw4;", "G", "Lcom/zepto/rw4;", "progress", "H", "Z", "isLoaded", "doubleBackToExitPressedOnce", "J", "apptId", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "K", "Ljava/util/concurrent/ExecutorService;", "myExecutor", "Landroid/os/Handler;", "L", "Landroid/os/Handler;", "myHandler", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanReceiptDownload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanReceiptDownload.kt\ncom/nic/mparivahan/VahanServices/VahanPayment/VahanReceiptDownload\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n1#2:230\n*E\n"})
public final class VahanReceiptDownload extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public o36 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final int PERMISSION_CODE_READ_EXTERNAL_STORAGE = 10210;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String receiptUrl = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String oldUrl = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String apptId = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final ExecutorService myExecutor = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final Handler myHandler = new Handler(Looper.getMainLooper());

    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            VahanReceiptDownload.this.isLoaded = true;
            VahanReceiptDownload.this.x1(false);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            VahanReceiptDownload.this.x1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            VahanReceiptDownload.this.isLoaded = false;
            Toast.makeText(VahanReceiptDownload.this, "Got Error! " + error, 0).show();
            VahanReceiptDownload.this.x1(false);
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

    private final void o1() {
        if (checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, this.PERMISSION_CODE_READ_EXTERNAL_STORAGE);
        } else {
            u1();
        }
    }

    private final void q1() {
        p1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanReceiptDownload.r1(this.a, view);
            }
        });
        p1().b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanReceiptDownload.s1(this.a, view);
            }
        });
        p1().e.getSettings().setJavaScriptEnabled(true);
        p1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanReceiptDownload.t1(view);
            }
        });
    }

    public static final void r1(VahanReceiptDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.p1().e.canGoBack()) {
            this$0.p1().e.goBack();
        } else {
            this$0.y1();
        }
    }

    public static final void s1(VahanReceiptDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1();
    }

    public static final void t1(View view) {
    }

    private final void u1() {
        p1().e.loadUrl(this.receiptUrl);
        p1().e.setWebViewClient(new a());
    }

    private final void v1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(boolean visible) {
        if (visible) {
            try {
                this.progress = new rw4(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException unused) {
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

    private final void y1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.of7
            @Override // java.lang.Runnable
            public final void run() {
                VahanReceiptDownload.z1(this.c);
            }
        }, 2000L);
    }

    public static final void z1(VahanReceiptDownload this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slot_receipt_activity);
        o36 o36VarC = o36.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o36VarC, "inflate(...)");
        w1(o36VarC);
        setContentView(p1().b());
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
        this.oldUrl = this.receiptUrl;
        this.receiptUrl = "https://docs.google.com/gview?embedded=true&url=" + StringsKt__StringsKt.trim((CharSequence) this.receiptUrl).toString();
        o1();
        q1();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        if (p1().e.canGoBack()) {
            p1().e.goBack();
            return true;
        }
        y1();
        return true;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.PERMISSION_CODE_READ_EXTERNAL_STORAGE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                u1();
            } else {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
            }
        }
    }

    public final o36 p1() {
        o36 o36Var = this.binding;
        if (o36Var != null) {
            return o36Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void w1(o36 o36Var) {
        Intrinsics.checkNotNullParameter(o36Var, "<set-?>");
        this.binding = o36Var;
    }
}
