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
import com.nic.mparivahan.DPTNotice.VerifyNoticePaymentResponseScreen;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.DTPNoticeVerifyWebView;
import com.nic.mparivahan.R;
import com.zepto.kt6;
import com.zepto.oc0;
import com.zepto.pq;
import com.zepto.rw4;
import com.zepto.wa3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0013¨\u00063"}, d2 = {"Lcom/nic/mparivahan/Echallan/DTPNoticeVerifyWebView;", "Lcom/zepto/pq;", "", "p1", "", "visible", "u1", "v1", "s1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "", "C", "Ljava/lang/String;", "pgiUrl", "Lcom/zepto/rw4;", "D", "Lcom/zepto/rw4;", "progress", "E", "Z", "isLoaded", "F", "doubleBackToExitPressedOnce", "G", "fromActivity", "H", "serviceName", "Lcom/zepto/oc0;", "I", "Lcom/zepto/oc0;", "binding", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "o1", "()Lcom/zepto/wa3;", "t1", "(Lcom/zepto/wa3;)V", "langSession", "K", "serviceCode", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDTPNoticeVerifyWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DTPNoticeVerifyWebView.kt\ncom/nic/mparivahan/Echallan/DTPNoticeVerifyWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
public final class DTPNoticeVerifyWebView extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public oc0 binding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String pgiUrl = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String fromActivity = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String serviceName = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String serviceCode = "";

    public static final class a {
        public final Context a;
        public final String b;

        public a(Context ctx, String serviceName) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(serviceName, "serviceName");
            this.a = ctx;
            this.b = serviceName;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            String string;
            String string2;
            Intrinsics.checkNotNull(str);
            Log.e("Result-->", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("challan_no")) {
                    Intent intent = new Intent(this.a, (Class<?>) VerifyNoticePaymentResponseScreen.class);
                    String string3 = "";
                    String str2 = jSONObject.getInt("respCode") == 0 ? "Pending" : jSONObject.getInt("respCode") == 1 ? "Success" : jSONObject.getInt("respCode") == 2 ? "Failed" : jSONObject.getInt("respCode") == 3 ? "Cancelled" : "";
                    if (jSONObject.has("receipt_base_url")) {
                        string = jSONObject.getString("receipt_base_url");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        string = "";
                    }
                    if (jSONObject.has("payment_date")) {
                        string2 = jSONObject.getString("payment_date");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    } else {
                        string2 = "";
                    }
                    if (jSONObject.has("receipt_no")) {
                        string3 = jSONObject.getString("receipt_no");
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    }
                    intent.putExtra("status", str2);
                    intent.putExtra("challanNo", jSONObject.getString("challan_no"));
                    intent.putExtra("vehicleNo", jSONObject.getString("rcNo"));
                    intent.putExtra("transactionId", jSONObject.getString("transId"));
                    intent.putExtra("challanPdfUrl", string);
                    intent.putExtra("amount", jSONObject.getString("challan_amt"));
                    intent.putExtra("paymentDate", string2);
                    intent.putExtra("receiptNo", string3);
                    intent.putExtra("serviceName", this.b);
                    this.a.startActivity(intent);
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
            DTPNoticeVerifyWebView.this.isLoaded = true;
            DTPNoticeVerifyWebView.this.u1(false);
            oc0 oc0Var = DTPNoticeVerifyWebView.this.binding;
            oc0 oc0Var2 = null;
            if (oc0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oc0Var = null;
            }
            oc0Var.c.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            oc0 oc0Var3 = DTPNoticeVerifyWebView.this.binding;
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
            DTPNoticeVerifyWebView.this.u1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            DTPNoticeVerifyWebView.this.isLoaded = false;
            DTPNoticeVerifyWebView.this.u1(false);
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

    private final void p1() {
        oc0 oc0Var = this.binding;
        oc0 oc0Var2 = null;
        if (oc0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var = null;
        }
        oc0Var.b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DTPNoticeVerifyWebView.q1(this.a, view);
            }
        });
        oc0 oc0Var3 = this.binding;
        if (oc0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var3 = null;
        }
        oc0Var3.b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DTPNoticeVerifyWebView.r1(this.a, view);
            }
        });
        if (kt6.d(this.serviceCode) && (StringsKt__StringsJVMKt.equals(this.serviceCode, "111", true) || StringsKt__StringsJVMKt.equals(this.serviceCode, "112", true) || StringsKt__StringsJVMKt.equals(this.serviceCode, "112", true))) {
            oc0 oc0Var4 = this.binding;
            if (oc0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oc0Var4 = null;
            }
            oc0Var4.b.i.setText(o1().b("notice_payment_lbl", getString(R.string.notice_payment)));
        }
        oc0 oc0Var5 = this.binding;
        if (oc0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var5 = null;
        }
        oc0Var5.c.getSettings().setBuiltInZoomControls(true);
        oc0 oc0Var6 = this.binding;
        if (oc0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var6 = null;
        }
        oc0Var6.c.getSettings().setSupportZoom(true);
        oc0 oc0Var7 = this.binding;
        if (oc0Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var7 = null;
        }
        oc0Var7.c.setVerticalScrollBarEnabled(true);
        oc0 oc0Var8 = this.binding;
        if (oc0Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var8 = null;
        }
        oc0Var8.c.getSettings().setJavaScriptEnabled(true);
        oc0 oc0Var9 = this.binding;
        if (oc0Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var9 = null;
        }
        oc0Var9.c.loadUrl(this.pgiUrl);
        oc0 oc0Var10 = this.binding;
        if (oc0Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var10 = null;
        }
        oc0Var10.c.addJavascriptInterface(new a(this, this.serviceName), "HtmlViewer");
        oc0 oc0Var11 = this.binding;
        if (oc0Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            oc0Var2 = oc0Var11;
        }
        oc0Var2.c.setWebViewClient(new b());
    }

    public static final void q1(DTPNoticeVerifyWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oc0 oc0Var = this$0.binding;
        oc0 oc0Var2 = null;
        if (oc0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var = null;
        }
        if (!oc0Var.c.canGoBack()) {
            this$0.v1();
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

    public static final void r1(DTPNoticeVerifyWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s1();
    }

    private final void s1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(boolean visible) {
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

    private final void v1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, o1().b("label_challan_double_click_exit", getString(R.string.double_click_to_exit)), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.ic1
            @Override // java.lang.Runnable
            public final void run() {
                DTPNoticeVerifyWebView.w1(this.c);
            }
        }, 2000L);
    }

    public static final void w1(DTPNoticeVerifyWebView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    public final wa3 o1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
            String stringExtra3 = getIntent().getStringExtra("searchType");
            Intrinsics.checkNotNull(stringExtra3);
            this.serviceName = stringExtra3;
        }
        if (getIntent().hasExtra("Service_code")) {
            String stringExtra4 = getIntent().getStringExtra("Service_code");
            Intrinsics.checkNotNull(stringExtra4);
            this.serviceCode = stringExtra4;
        }
        t1(new wa3(this));
        p1();
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
        v1();
        return true;
    }

    public final void t1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }
}
