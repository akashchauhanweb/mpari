package com.nic.mparivahan.VahanServices.VahanPayment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPayment;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.bc;
import com.zepto.pq;
import com.zepto.rw4;
import com.zepto.wa3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001eB\u0007¢\u0006\u0004\bc\u0010dJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00100\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\"\u00104\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u00108\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010#\u001a\u0004\bH\u0010%\"\u0004\bI\u0010'R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010#\u001a\u0004\bT\u0010%\"\u0004\bU\u0010'R\"\u0010Z\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010#\u001a\u0004\bX\u0010%\"\u0004\bY\u0010'R\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006f"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPayment/VahanPayment;", "Lcom/zepto/pq;", "", "w1", "", "visible", "H1", "N1", "A1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "Lcom/zepto/bc;", "C", "Lcom/zepto/bc;", "p1", "()Lcom/zepto/bc;", "D1", "(Lcom/zepto/bc;)V", "binding", "Lcom/zepto/rw4;", "D", "Lcom/zepto/rw4;", "progress", "E", "Z", "isLoaded", "", "F", "Ljava/lang/String;", "s1", "()Ljava/lang/String;", "G1", "(Ljava/lang/String;)V", "paymentUrl", "G", "getState_code", "M1", "state_code", "H", "getAppl_no", "setAppl_no", "appl_no", "I", "getRc_no", "J1", "rc_no", "J", "t1", "I1", VContant.PURPOSE_CODE, "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "K", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "r1", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "F1", "(Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;)V", "paymentRequest", "L", "z1", "()Z", "setFaceless", "(Z)V", "isFaceless", "M", "u1", "K1", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "N", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "L1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "O", "o1", "C1", "aadhar_name", "P", "n1", "B1", "aadhar_address", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "E1", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanPayment extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public bc binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String paymentUrl;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String appl_no = " ";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_no;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public BeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 languageKeySession;

    public static final class a {
        public final VahanPayment a;

        public a(VahanPayment ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            this.a = ctx;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            JSONObject jSONObject;
            String string;
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null || !jSONObject.has("response") || (string = jSONObject.getString("response")) == null || string.length() == 0) {
                return;
            }
            try {
                Intent intent = new Intent(this.a, (Class<?>) VahanPaymentStatusScreen.class);
                intent.putExtra("EncString", string);
                intent.putExtra(VContant.FINAL_SUBMIT, this.a.r1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.a.getIsFaceless());
                intent.putExtra("RC", this.a.u1());
                intent.putExtra("RcDetails", this.a.v1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.a.o1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.a.n1());
                intent.putExtra("isPaymentPending", true);
                this.a.startActivity(intent);
                VahanPayment vahanPayment = this.a;
                Intrinsics.checkNotNull(vahanPayment, "null cannot be cast to non-null type android.app.Activity");
                vahanPayment.finish();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Log.e("dl-js1", String.valueOf(jsResult));
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public static final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            VahanPayment.this.isLoaded = true;
            VahanPayment.this.H1(false);
            VahanPayment.this.p1().e.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            rw4 rw4Var = VahanPayment.this.progress;
            if (rw4Var != null) {
                rw4Var.b();
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            VahanPayment.this.isLoaded = false;
            VahanPayment.this.H1(false);
            super.onReceivedError(view, request, error);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError sslError) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView == null) {
                return true;
            }
            webView.loadUrl(strValueOf);
            return true;
        }
    }

    private final void A1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(boolean visible) {
        if (visible) {
            return;
        }
        try {
            rw4 rw4Var = this.progress;
            if (rw4Var != null) {
                rw4Var.a();
            }
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
            Log.e("Error", Unit.INSTANCE.toString());
        }
    }

    private final void N1() {
        VUtility.INSTANCE.B(this, q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    private final void w1() {
        p1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPayment.x1(this.a, view);
            }
        });
        p1().b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPayment.y1(this.a, view);
            }
        });
        p1().e.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        p1().e.getSettings().setAllowFileAccess(true);
        p1().e.getSettings().setAllowContentAccess(true);
        p1().e.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        p1().e.getSettings().setJavaScriptEnabled(true);
        p1().e.getSettings().setDomStorageEnabled(true);
        p1().e.getSettings().setUseWideViewPort(true);
        p1().e.getSettings().setLoadWithOverviewMode(true);
        p1().e.getSettings().setBuiltInZoomControls(true);
        p1().e.getSettings().setSupportMultipleWindows(true);
        p1().e.clearCache(true);
        p1().e.reload();
        p1().e.requestFocus(130);
        String strS1 = s1();
        CookieManager.getInstance().setAcceptCookie(true);
        p1().e.loadUrl(strS1, MapsKt__MapsJVMKt.mapOf(TuplesKt.to("X-Referer", "NextGen_mParivahan")));
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            p1().e.addJavascriptInterface(new a(this), "HtmlViewer");
        } else {
            p1().e.addJavascriptInterface(new a(this), "HtmlViewer");
        }
        p1().e.setWebChromeClient(new b());
        p1().e.setWebViewClient(new c());
    }

    public static final void x1(VahanPayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.p1().e.canGoBack()) {
            this$0.p1().e.goBack();
        } else {
            this$0.N1();
        }
    }

    public static final void y1(VahanPayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1();
    }

    public final void B1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void C1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void D1(bc bcVar) {
        Intrinsics.checkNotNullParameter(bcVar, "<set-?>");
        this.binding = bcVar;
    }

    public final void E1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void F1(BeforePaymentRequest beforePaymentRequest) {
        Intrinsics.checkNotNullParameter(beforePaymentRequest, "<set-?>");
        this.paymentRequest = beforePaymentRequest;
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentUrl = str;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_no = str;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void L1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final String n1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        N1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informational_web_view);
        bc bcVarC = bc.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bcVarC, "inflate(...)");
        D1(bcVarC);
        setContentView(p1().b());
        E1(new wa3(this));
        this.progress = new rw4(this, R.string.please_wait, true);
        getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE);
        G1(String.valueOf(getIntent().getStringExtra("URL")));
        String stringExtra = getIntent().getStringExtra("state_code");
        Intrinsics.checkNotNull(stringExtra);
        M1(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("rc_number");
        Intrinsics.checkNotNull(stringExtra2);
        J1(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
        Intrinsics.checkNotNull(stringExtra3);
        I1(stringExtra3);
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest");
        F1((BeforePaymentRequest) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        C1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        B1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        K1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        L1((NrvDetails) serializableExtra2);
        p1().b.i.setText(VContant.INSTANCE.L(this, t1()));
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            this.appl_no = " ";
        } else {
            String stringExtra4 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra4);
            this.appl_no = stringExtra4;
        }
        w1();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        if (p1().e.canGoBack()) {
            onBackPressed();
            return true;
        }
        N1();
        return true;
    }

    public final bc p1() {
        bc bcVar = this.binding;
        if (bcVar != null) {
            return bcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final BeforePaymentRequest r1() {
        BeforePaymentRequest beforePaymentRequest = this.paymentRequest;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final String s1() {
        String str = this.paymentUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentUrl");
        return null;
    }

    public final String t1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }

    public final String u1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }
}
