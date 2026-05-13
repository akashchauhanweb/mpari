package com.nic.mparivahan.Echallan;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.PrintChallanWebView;
import com.nic.mparivahan.R;
import com.zepto.kt6;
import com.zepto.lv4;
import com.zepto.pq;
import com.zepto.rw4;
import com.zepto.wa3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0003J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/nic/mparivahan/Echallan/PrintChallanWebView;", "Lcom/zepto/pq;", "", "r1", "w1", "v1", "", "visible", "y1", "u1", "z1", "B1", "Landroid/webkit/WebView;", "webView", "p1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "Lcom/zepto/rw4;", "C", "Lcom/zepto/rw4;", "progress", "D", "Z", "isLoaded", "E", "doubleBackToExitPressedOnce", "", "F", "Ljava/lang/String;", "printUrl", "G", "receiptUrl", "H", "challanNo", "I", "fromActivity", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "x1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/lv4;", "K", "Lcom/zepto/lv4;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPrintChallanWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrintChallanWebView.kt\ncom/nic/mparivahan/Echallan/PrintChallanWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
public final class PrintChallanWebView extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String printUrl = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String receiptUrl = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String fromActivity = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public lv4 binding;

    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PrintChallanWebView.this.isLoaded = true;
            PrintChallanWebView.this.y1(false);
            PrintChallanWebView printChallanWebView = PrintChallanWebView.this;
            Intrinsics.checkNotNull(webView);
            printChallanWebView.p1(webView);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            PrintChallanWebView.this.y1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            PrintChallanWebView.this.isLoaded = false;
            Log.d("Error", error.toString());
            PrintChallanWebView.this.y1(false);
            super.onReceivedError(view, request, error);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError error) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            handler.cancel();
            int primaryError = error.getPrimaryError();
            Log.e("dl-ssl", primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? "SSL Certificate error." : "The certificate authority is not trusted." : "The certificate Hostname mismatch." : "The certificate has expired." : "The certificate is not yet valid.");
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

    public static final void A1(PrintChallanWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }

    private final void B1() {
        if (!this.doubleBackToExitPressedOnce) {
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, q1().b("label_challan_double_click_exit", getString(R.string.double_click_to_exit)), 0).show();
            Looper looperMyLooper = Looper.myLooper();
            Intrinsics.checkNotNull(looperMyLooper);
            new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.hv4
                @Override // java.lang.Runnable
                public final void run() {
                    PrintChallanWebView.C1(this.c);
                }
            }, 2000L);
            return;
        }
        if (this.fromActivity.length() <= 0 || !StringsKt__StringsJVMKt.equals(this.fromActivity, "byPassPayment", true)) {
            onBackPressed();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) PaymentSearchChallan.class);
        intent.setFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void C1(PrintChallanWebView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p1(WebView webView) {
        Object systemService = getSystemService("print");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.print.PrintManager");
        PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter(this.challanNo);
        Intrinsics.checkNotNullExpressionValue(printDocumentAdapterCreatePrintDocumentAdapter, "createPrintDocumentAdapter(...)");
        ((PrintManager) systemService).print(getString(R.string.app_name) + this.challanNo, printDocumentAdapterCreatePrintDocumentAdapter, new PrintAttributes.Builder().build());
    }

    private final void r1() {
        lv4 lv4Var = this.binding;
        lv4 lv4Var2 = null;
        if (lv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lv4Var = null;
        }
        lv4Var.c.getSettings().setJavaScriptEnabled(true);
        if (!u1()) {
            z1();
            return;
        }
        if (u1() && !this.isLoaded) {
            v1();
        }
        lv4 lv4Var3 = this.binding;
        if (lv4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lv4Var3 = null;
        }
        lv4Var3.b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrintChallanWebView.s1(this.a, view);
            }
        });
        lv4 lv4Var4 = this.binding;
        if (lv4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lv4Var4 = null;
        }
        lv4Var4.b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrintChallanWebView.t1(this.a, view);
            }
        });
        if (kt6.d(this.fromActivity)) {
            if (StringsKt__StringsJVMKt.equals(this.fromActivity, "paymentSearchChallanDetails", true)) {
                lv4 lv4Var5 = this.binding;
                if (lv4Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lv4Var2 = lv4Var5;
                }
                lv4Var2.b.i.setText(q1().b("label_challan_payment_search", getString(R.string.online_challan_payment)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this.fromActivity, "reprintReceiptActivity", true)) {
                lv4 lv4Var6 = this.binding;
                if (lv4Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lv4Var2 = lv4Var6;
                }
                lv4Var2.b.i.setText(q1().b("label_challan_reprint_receipt", getString(R.string.reprint_receipt)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this.fromActivity, "searchChallanDetails", true)) {
                lv4 lv4Var7 = this.binding;
                if (lv4Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lv4Var2 = lv4Var7;
                }
                lv4Var2.b.i.setText(q1().b("label_challan_status", getString(R.string.challan1)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this.fromActivity, "printReceiptActivity", true)) {
                lv4 lv4Var8 = this.binding;
                if (lv4Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lv4Var2 = lv4Var8;
                }
                lv4Var2.b.i.setText(q1().b("label_challan_print_receipt", getString(R.string.print_receipt)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this.fromActivity, "verifyPaymentChallanDetails", true)) {
                lv4 lv4Var9 = this.binding;
                if (lv4Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lv4Var2 = lv4Var9;
                }
                lv4Var2.b.i.setText(q1().b("label_challan_payment_search", getString(R.string.online_challan_payment)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this.fromActivity, "printChallan", true)) {
                lv4 lv4Var10 = this.binding;
                if (lv4Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lv4Var2 = lv4Var10;
                }
                lv4Var2.b.i.setText(q1().b("label_challan_download", getString(R.string.challan_print)));
            }
        }
    }

    public static final void s1(PrintChallanWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lv4 lv4Var = this$0.binding;
        lv4 lv4Var2 = null;
        if (lv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lv4Var = null;
        }
        if (!lv4Var.c.canGoBack()) {
            this$0.B1();
            return;
        }
        if (this$0.fromActivity.length() > 0 && StringsKt__StringsJVMKt.equals(this$0.fromActivity, "byPassPayment", true)) {
            Intent intent = new Intent(this$0, (Class<?>) PaymentSearchChallan.class);
            intent.setFlags(67108864);
            this$0.startActivity(intent);
            this$0.finish();
            return;
        }
        lv4 lv4Var3 = this$0.binding;
        if (lv4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            lv4Var2 = lv4Var3;
        }
        lv4Var2.c.goBack();
    }

    public static final void t1(PrintChallanWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1();
    }

    private final boolean u1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(0)) {
                Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR");
                return true;
            }
            if (networkCapabilities.hasTransport(1)) {
                Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI");
                return true;
            }
            if (networkCapabilities.hasTransport(3)) {
                Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET");
                return true;
            }
        }
        return false;
    }

    private final void v1() {
        String str = this.printUrl;
        if (kt6.d(this.receiptUrl)) {
            str = this.receiptUrl;
        }
        lv4 lv4Var = this.binding;
        lv4 lv4Var2 = null;
        if (lv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lv4Var = null;
        }
        lv4Var.c.loadUrl(str);
        lv4 lv4Var3 = this.binding;
        if (lv4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            lv4Var2 = lv4Var3;
        }
        lv4Var2.c.setWebViewClient(new a());
    }

    private final void w1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(boolean visible) {
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

    private final void z1() {
        lv4 lv4Var = this.binding;
        if (lv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lv4Var = null;
        }
        LinearLayout linearLayout = lv4Var.d;
        String strB = q1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try));
        Intrinsics.checkNotNull(strB);
        Snackbar snackbarL0 = Snackbar.l0(linearLayout, strB, -2);
        Intrinsics.checkNotNullExpressionValue(snackbarL0, "make(...)");
        snackbarL0.n0(getString(R.string.settings), new View.OnClickListener() { // from class: com.zepto.kv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrintChallanWebView.A1(this.a, view);
            }
        });
        snackbarL0.W();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv4 lv4VarC = lv4.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(lv4VarC, "inflate(...)");
        this.binding = lv4VarC;
        if (lv4VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lv4VarC = null;
        }
        setContentView(lv4VarC.b());
        x1(new wa3(this));
        String stringExtra = getIntent().getStringExtra("challanPdfUrl");
        Intrinsics.checkNotNull(stringExtra);
        this.printUrl = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("challan_receipt_url");
        Intrinsics.checkNotNull(stringExtra2);
        this.receiptUrl = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("challanNo");
        Intrinsics.checkNotNull(stringExtra3);
        this.challanNo = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("fromActivity");
        Intrinsics.checkNotNull(stringExtra4);
        this.fromActivity = stringExtra4;
        r1();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        lv4 lv4Var = this.binding;
        lv4 lv4Var2 = null;
        if (lv4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lv4Var = null;
        }
        if (!lv4Var.c.canGoBack()) {
            B1();
        } else if (this.fromActivity.length() <= 0 || !StringsKt__StringsJVMKt.equals(this.fromActivity, "byPassPayment", true)) {
            lv4 lv4Var3 = this.binding;
            if (lv4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                lv4Var2 = lv4Var3;
            }
            lv4Var2.c.goBack();
        } else {
            Intent intent = new Intent(this, (Class<?>) PaymentSearchChallan.class);
            intent.setFlags(67108864);
            startActivity(intent);
            finish();
        }
        return true;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void x1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }
}
