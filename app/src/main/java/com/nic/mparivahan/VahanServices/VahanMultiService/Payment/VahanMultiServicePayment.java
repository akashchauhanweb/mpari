package com.nic.mparivahan.VahanServices.VahanMultiService.Payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.Payment.VahanMultiServicePayment;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.bc;
import com.zepto.gz3;
import com.zepto.pq;
import com.zepto.rw4;
import com.zepto.wa3;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001nB\u0007¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00100\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\"\u00104\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u00108\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010#\u001a\u0004\bH\u0010%\"\u0004\bI\u0010'R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010#\u001a\u0004\bT\u0010%\"\u0004\bU\u0010'R\"\u0010Z\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010#\u001a\u0004\bX\u0010%\"\u0004\bY\u0010'R\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR6\u0010k\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010cj\n\u0012\u0004\u0012\u00020!\u0018\u0001`d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j¨\u0006o"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Payment/VahanMultiServicePayment;", "Lcom/zepto/pq;", "", "y1", "", "visible", "K1", "Q1", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "Lcom/zepto/bc;", "C", "Lcom/zepto/bc;", "q1", "()Lcom/zepto/bc;", "G1", "(Lcom/zepto/bc;)V", "binding", "Lcom/zepto/rw4;", "D", "Lcom/zepto/rw4;", "progress", "E", "Z", "isLoaded", "", "F", "Ljava/lang/String;", "u1", "()Ljava/lang/String;", "J1", "(Ljava/lang/String;)V", "paymentUrl", "G", "getState_code", "P1", "state_code", "H", "getAppl_no", "setAppl_no", "appl_no", "I", "getRc_no", "M1", "rc_no", "J", "v1", "L1", VContant.PURPOSE_CODE, "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "K", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "t1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "I1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;)V", "paymentRequest", "L", "B1", "()Z", "setFaceless", "(Z)V", "isFaceless", "M", "w1", "N1", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "N", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "O", "p1", "F1", "aadhar_name", "P", "o1", "E1", "aadhar_address", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "H1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "R", "Ljava/util/ArrayList;", "s1", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanMultiServicePayment extends pq {

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

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_no;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public MultiServiceBeforePaymentRequest paymentRequest;

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

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String appl_no = " ";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a {
        public final VahanMultiServicePayment a;

        public a(VahanMultiServicePayment ctx) {
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
                Intent intent = new Intent(this.a, (Class<?>) VahanPaymentMultiServiceStatusScreen.class);
                intent.putExtra("EncString", string);
                intent.putExtra(VContant.FINAL_SUBMIT, this.a.t1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.a.getIsFaceless());
                intent.putExtra("RC", this.a.w1());
                intent.putExtra("RcDetails", this.a.x1());
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this.a.getMultiServiceList());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.a.p1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.a.o1());
                intent.putExtra("isPaymentPending", true);
                this.a.startActivity(intent);
                VahanMultiServicePayment vahanMultiServicePayment = this.a;
                Intrinsics.checkNotNull(vahanMultiServicePayment, "null cannot be cast to non-null type android.app.Activity");
                vahanMultiServicePayment.finish();
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
            VahanMultiServicePayment.this.isLoaded = true;
            VahanMultiServicePayment.this.K1(false);
            VahanMultiServicePayment.this.q1().e.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            rw4 rw4Var = VahanMultiServicePayment.this.progress;
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
            VahanMultiServicePayment.this.isLoaded = false;
            VahanMultiServicePayment.this.K1(false);
            super.onReceivedError(view, request, error);
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

    public static final void A1(VahanMultiServicePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1();
    }

    public static final void C1(VahanMultiServicePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    private final void D1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(boolean visible) {
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

    private final void Q1() {
        VUtility.INSTANCE.y(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    private final void y1() {
        q1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServicePayment.z1(this.a, view);
            }
        });
        q1().b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServicePayment.A1(this.a, view);
            }
        });
        q1().e.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        q1().e.getSettings().setAllowFileAccess(true);
        q1().e.getSettings().setAllowContentAccess(true);
        q1().e.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        q1().e.getSettings().setJavaScriptEnabled(true);
        q1().e.getSettings().setDomStorageEnabled(true);
        q1().e.getSettings().setUseWideViewPort(true);
        q1().e.getSettings().setLoadWithOverviewMode(true);
        q1().e.getSettings().setBuiltInZoomControls(true);
        q1().e.getSettings().setSupportMultipleWindows(true);
        q1().e.clearCache(true);
        q1().e.reload();
        q1().e.requestFocus(130);
        String strU1 = u1();
        CookieManager.getInstance().setAcceptCookie(true);
        q1().e.loadUrl(strU1);
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            q1().e.addJavascriptInterface(new a(this), "HtmlViewer");
        } else {
            q1().e.addJavascriptInterface(new a(this), "HtmlViewer");
        }
        q1().e.setWebChromeClient(new b());
        q1().e.setWebViewClient(new c());
    }

    public static final void z1(VahanMultiServicePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.q1().e.canGoBack()) {
            this$0.q1().e.goBack();
        } else {
            this$0.Q1();
        }
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void E1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void F1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void G1(bc bcVar) {
        Intrinsics.checkNotNullParameter(bcVar, "<set-?>");
        this.binding = bcVar;
    }

    public final void H1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void I1(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        Intrinsics.checkNotNullParameter(multiServiceBeforePaymentRequest, "<set-?>");
        this.paymentRequest = multiServiceBeforePaymentRequest;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentUrl = str;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_no = str;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void O1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final String o1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        Q1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informational_web_view);
        bc bcVarC = bc.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bcVarC, "inflate(...)");
        G1(bcVarC);
        setContentView(q1().b());
        H1(new wa3(this));
        this.progress = new rw4(this, R.string.please_wait, true);
        getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE);
        J1(String.valueOf(getIntent().getStringExtra("URL")));
        String stringExtra = getIntent().getStringExtra("state_code");
        Intrinsics.checkNotNull(stringExtra);
        P1(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("rc_number");
        Intrinsics.checkNotNull(stringExtra2);
        M1(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
        Intrinsics.checkNotNull(stringExtra3);
        L1(stringExtra3);
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest");
        I1((MultiServiceBeforePaymentRequest) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        N1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        O1((NrvDetails) serializableExtra2);
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        q1().b.i.setText(VContant.INSTANCE.L(this, v1()));
        this.appl_no = t1().getAppl_no();
        SpannableString spannableString = new SpannableString("RC Services");
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        q1().b.i.setText(spannableString);
        ArrayList arrayList = this.multiServiceList;
        if (arrayList == null || !arrayList.contains(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            q1().b.i.setText("RC Services");
        } else {
            q1().b.i.setText("Transfer of OwnerShip \n(Buyer)");
        }
        q1().b.e.setVisibility(0);
        q1().b.e.setText(w1());
        SpannableString spannableString2 = new SpannableString(w1());
        spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
        q1().b.e.setText(spannableString2);
        y1();
        q1().b.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServicePayment.C1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        if (q1().e.canGoBack()) {
            onBackPressed();
            return true;
        }
        Q1();
        return true;
    }

    public final String p1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final bc q1() {
        bc bcVar = this.binding;
        if (bcVar != null) {
            return bcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 r1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    /* JADX INFO: renamed from: s1, reason: from getter */
    public final ArrayList getMultiServiceList() {
        return this.multiServiceList;
    }

    public final MultiServiceBeforePaymentRequest t1() {
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = this.paymentRequest;
        if (multiServiceBeforePaymentRequest != null) {
            return multiServiceBeforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final String u1() {
        String str = this.paymentUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentUrl");
        return null;
    }

    public final String v1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }

    public final String w1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }
}
