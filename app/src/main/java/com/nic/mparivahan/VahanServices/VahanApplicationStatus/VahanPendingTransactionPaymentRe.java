package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPaymentRe;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreenRe;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.bc;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.rw4;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\"\u00105\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u00109\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanPendingTransactionPaymentRe;", "Lcom/zepto/pq;", "", "s1", "", "visible", "z1", "D1", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "Lcom/zepto/bc;", "C", "Lcom/zepto/bc;", "n1", "()Lcom/zepto/bc;", "w1", "(Lcom/zepto/bc;)V", "binding", "Lcom/zepto/rw4;", "D", "Lcom/zepto/rw4;", "progress", "E", "Z", "isLoaded", "F", "doubleBackToExitPressedOnce", "", "G", "Ljava/lang/String;", "p1", "()Ljava/lang/String;", "y1", "(Ljava/lang/String;)V", "paymentUrl", "H", "getAppl_no", "setAppl_no", "appl_no", "I", "q1", "B1", "rc_no", "J", "getPurpose_code", "A1", VContant.PURPOSE_CODE, "K", "r1", "C1", "rc_number", "Landroid/app/ProgressDialog;", "L", "Landroid/app/ProgressDialog;", "o1", "()Landroid/app/ProgressDialog;", "x1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "M", "Lcom/zepto/ld7;", "viewModelBeforePayment", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "N", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "retrofitServiceBeforePayment", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanPendingTransactionPaymentRe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanPendingTransactionPaymentRe.kt\ncom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanPendingTransactionPaymentRe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
public final class VahanPendingTransactionPaymentRe extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public bc binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String paymentUrl;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String appl_no = " ";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_no;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ld7 viewModelBeforePayment;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VahanProService retrofitServiceBeforePayment;

    public static final class a {
        public final VahanPendingTransactionPaymentRe a;

        public a(VahanPendingTransactionPaymentRe ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            this.a = ctx;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject(String.valueOf(str));
                if (jSONObject.has("response") && (string = jSONObject.getString("response")) != null && string.length() != 0) {
                    try {
                        Intent intent = new Intent(this.a, (Class<?>) VahanPaymentStatusScreenRe.class);
                        intent.putExtra("EncString", string);
                        intent.putExtra("RC", this.a.r1());
                        this.a.startActivity(intent);
                        VahanPendingTransactionPaymentRe vahanPendingTransactionPaymentRe = this.a;
                        Intrinsics.checkNotNull(vahanPendingTransactionPaymentRe, "null cannot be cast to non-null type android.app.Activity");
                        vahanPendingTransactionPaymentRe.finish();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            VahanPendingTransactionPaymentRe.this.isLoaded = true;
            VahanPendingTransactionPaymentRe.this.z1(false);
            VahanPendingTransactionPaymentRe.this.n1().e.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            VahanPendingTransactionPaymentRe.this.n1().e.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            VahanPendingTransactionPaymentRe.this.z1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            VahanPendingTransactionPaymentRe.this.isLoaded = false;
            Toast.makeText(VahanPendingTransactionPaymentRe.this, "Got Error! " + error, 0).show();
            VahanPendingTransactionPaymentRe.this.z1(false);
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
            if (webView != null) {
                webView.loadUrl(strValueOf);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(RequireDataForBePaymet requireDataForBePaymet) {
            VahanPendingTransactionPaymentRe.this.o1().dismiss();
            if (requireDataForBePaymet != null) {
                try {
                    Log.v("Before Payment", requireDataForBePaymet.getResponse_code());
                } catch (Exception e) {
                    e.printStackTrace();
                    if (VahanPendingTransactionPaymentRe.this.o1().isShowing()) {
                        VahanPendingTransactionPaymentRe.this.o1().dismiss();
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RequireDataForBePaymet) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (VahanPendingTransactionPaymentRe.this.o1().isShowing()) {
                VahanPendingTransactionPaymentRe.this.o1().dismiss();
            }
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final void D1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.fd7
            @Override // java.lang.Runnable
            public final void run() {
                VahanPendingTransactionPaymentRe.E1(this.c);
            }
        }, 2000L);
    }

    public static final void E1(VahanPendingTransactionPaymentRe this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void s1() {
        VahanProService vahanProService = this.retrofitServiceBeforePayment;
        if (vahanProService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceBeforePayment");
            vahanProService = null;
        }
        this.viewModelBeforePayment = (ld7) new z(this, new kd7(new jd7(vahanProService))).a(ld7.class);
        n1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPendingTransactionPaymentRe.t1(this.a, view);
            }
        });
        n1().b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPendingTransactionPaymentRe.u1(this.a, view);
            }
        });
        n1().e.getSettings().setJavaScriptEnabled(true);
        n1().e.getSettings().setDomStorageEnabled(true);
        n1().e.getSettings().setUseWideViewPort(true);
        n1().e.getSettings().setLoadWithOverviewMode(true);
        n1().e.getSettings().setBuiltInZoomControls(true);
        n1().e.clearCache(true);
        n1().e.reload();
        n1().e.requestFocus(130);
        String strP1 = p1();
        CookieManager.getInstance().setAcceptCookie(true);
        n1().e.loadUrl(strP1);
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            n1().e.addJavascriptInterface(new a(this), "HtmlViewer");
        } else {
            n1().e.addJavascriptInterface(new a(this), "HtmlViewer");
        }
        n1().e.setWebViewClient(new b());
    }

    public static final void t1(VahanPendingTransactionPaymentRe this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n1().e.canGoBack()) {
            this$0.n1().e.goBack();
        } else {
            this$0.D1();
        }
    }

    public static final void u1(VahanPendingTransactionPaymentRe this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1();
    }

    private final void v1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(boolean visible) {
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

    public final void A1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void B1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_no = str;
    }

    public final void C1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final bc n1() {
        bc bcVar = this.binding;
        if (bcVar != null) {
            return bcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
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
        setContentView(R.layout.activity_informational_web_view);
        bc bcVarC = bc.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bcVarC, "inflate(...)");
        w1(bcVarC);
        setContentView(n1().b());
        try {
            y1(String.valueOf(getIntent().getStringExtra("URL")));
            String stringExtra = getIntent().getStringExtra("RC");
            Intrinsics.checkNotNull(stringExtra);
            B1(stringExtra);
            String stringExtra2 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
            Intrinsics.checkNotNull(stringExtra2);
            A1(stringExtra2);
            String stringExtra3 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra3);
            this.appl_no = stringExtra3;
            C1(q1());
            Log.e("rc_number", r1());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.retrofitServiceBeforePayment = VahanProService.INSTANCE.a(this);
        x1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        s1();
        ld7 ld7Var = this.viewModelBeforePayment;
        ld7 ld7Var2 = null;
        if (ld7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelBeforePayment");
            ld7Var = null;
        }
        ld7Var.Y().g(this, new e(new c()));
        ld7 ld7Var3 = this.viewModelBeforePayment;
        if (ld7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelBeforePayment");
        } else {
            ld7Var2 = ld7Var3;
        }
        ld7Var2.b0().g(this, new e(new d()));
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        if (n1().e.canGoBack()) {
            onBackPressed();
            return true;
        }
        D1();
        return true;
    }

    public final String p1() {
        String str = this.paymentUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentUrl");
        return null;
    }

    public final String q1() {
        String str = this.rc_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_no");
        return null;
    }

    public final String r1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final void w1(bc bcVar) {
        Intrinsics.checkNotNullParameter(bcVar, "<set-?>");
        this.binding = bcVar;
    }

    public final void x1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentUrl = str;
    }
}
