package com.nic.mparivahan.Echallan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.VerifyPendingChallanWebView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.oc0;
import com.zepto.pq;
import com.zepto.rw4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/nic/mparivahan/Echallan/VerifyPendingChallanWebView;", "Lcom/zepto/pq;", "", "o1", "", "visible", "s1", "t1", "r1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "", "C", "Ljava/lang/String;", "pgiUrl", "Lcom/zepto/rw4;", "D", "Lcom/zepto/rw4;", "progress", "E", "Z", "isLoaded", "F", "doubleBackToExitPressedOnce", "G", "fromActivity", "Lcom/zepto/oc0;", "H", "Lcom/zepto/oc0;", "binding", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVerifyPendingChallanWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyPendingChallanWebView.kt\ncom/nic/mparivahan/Echallan/VerifyPendingChallanWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
public final class VerifyPendingChallanWebView extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public oc0 binding;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String pgiUrl = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String fromActivity = "";

    public static final class a {
        public final Context a;
        public final String b;

        public a(Context ctx, String fromActivity) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
            this.a = ctx;
            this.b = fromActivity;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            Intrinsics.checkNotNull(str);
            Log.e("Result-->", str);
            try {
                if (new JSONObject(str).has("challan_no")) {
                    if (StringsKt__StringsJVMKt.equals(this.b, VContant.VERIFY_PAYMENT, true)) {
                        this.a.startActivity(new Intent(this.a, (Class<?>) VerifyPaymentChallan.class));
                    } else {
                        this.a.startActivity(new Intent(this.a, (Class<?>) PaymentSearchChallan.class));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            VerifyPendingChallanWebView.this.isLoaded = true;
            VerifyPendingChallanWebView.this.s1(false);
            oc0 oc0Var = VerifyPendingChallanWebView.this.binding;
            oc0 oc0Var2 = null;
            if (oc0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oc0Var = null;
            }
            oc0Var.c.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            oc0 oc0Var3 = VerifyPendingChallanWebView.this.binding;
            if (oc0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                oc0Var2 = oc0Var3;
            }
            oc0Var2.c.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            VerifyPendingChallanWebView.this.s1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            VerifyPendingChallanWebView.this.isLoaded = false;
            VerifyPendingChallanWebView.this.s1(false);
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
        oc0 oc0Var = this.binding;
        oc0 oc0Var2 = null;
        if (oc0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var = null;
        }
        oc0Var.b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ep7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPendingChallanWebView.p1(this.a, view);
            }
        });
        oc0 oc0Var3 = this.binding;
        if (oc0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var3 = null;
        }
        oc0Var3.b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPendingChallanWebView.q1(this.a, view);
            }
        });
        oc0 oc0Var4 = this.binding;
        if (oc0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var4 = null;
        }
        oc0Var4.c.getSettings().setBuiltInZoomControls(true);
        oc0 oc0Var5 = this.binding;
        if (oc0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var5 = null;
        }
        oc0Var5.c.getSettings().setSupportZoom(true);
        oc0 oc0Var6 = this.binding;
        if (oc0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var6 = null;
        }
        oc0Var6.c.setVerticalScrollBarEnabled(true);
        oc0 oc0Var7 = this.binding;
        if (oc0Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var7 = null;
        }
        oc0Var7.c.getSettings().setJavaScriptEnabled(true);
        oc0 oc0Var8 = this.binding;
        if (oc0Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var8 = null;
        }
        oc0Var8.c.loadUrl(this.pgiUrl);
        oc0 oc0Var9 = this.binding;
        if (oc0Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var9 = null;
        }
        oc0Var9.c.addJavascriptInterface(new a(this, this.fromActivity), "HtmlViewer");
        oc0 oc0Var10 = this.binding;
        if (oc0Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            oc0Var2 = oc0Var10;
        }
        oc0Var2.c.setWebViewClient(new b());
    }

    public static final void p1(VerifyPendingChallanWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oc0 oc0Var = this$0.binding;
        oc0 oc0Var2 = null;
        if (oc0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var = null;
        }
        if (!oc0Var.c.canGoBack()) {
            this$0.t1();
            return;
        }
        oc0 oc0Var3 = this$0.binding;
        if (oc0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            oc0Var2 = oc0Var3;
        }
        oc0Var2.c.goBack();
    }

    public static final void q1(VerifyPendingChallanWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1();
    }

    private final void r1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(boolean visible) {
        if (visible) {
            try {
                this.progress = new rw4(this, R.string.please_wait, true);
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

    private final void t1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.dp7
            @Override // java.lang.Runnable
            public final void run() {
                VerifyPendingChallanWebView.u1(this.c);
            }
        }, 2000L);
    }

    public static final void u1(VerifyPendingChallanWebView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challan_payment_webview);
        oc0 oc0VarC = oc0.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(oc0VarC, "inflate(...)");
        this.binding = oc0VarC;
        if (oc0VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0VarC = null;
        }
        setContentView(oc0VarC.b());
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("pgiUrl");
            Intrinsics.checkNotNull(stringExtra);
            this.pgiUrl = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("fromActivity");
            Intrinsics.checkNotNull(stringExtra2);
            this.fromActivity = stringExtra2;
        }
        o1();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        oc0 oc0Var = this.binding;
        if (oc0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var = null;
        }
        if (oc0Var.c.canGoBack()) {
            onBackPressed();
            return true;
        }
        t1();
        return true;
    }
}
