package com.nic.mparivahan.Echallan.Echallan;

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
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.EtransChallanPayment;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.ResponsePaymentActivity;
import com.nic.mparivahan.R;
import com.zepto.kt6;
import com.zepto.oc0;
import com.zepto.pq;
import com.zepto.rw4;
import com.zepto.wa3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.http.util.EncodingUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00109\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010(\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010;\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010(R\u0016\u0010=\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010(¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/EtransChallanPayment;", "Lcom/zepto/pq;", "", "q1", "", "visible", "v1", "w1", "t1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "Lcom/zepto/oc0;", "C", "Lcom/zepto/oc0;", "binding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "p1", "()Lcom/zepto/wa3;", "u1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/rw4;", "E", "Lcom/zepto/rw4;", "progress", "F", "Z", "isLoaded", "G", "doubleBackToExitPressedOnce", "", "H", "Ljava/lang/String;", "requestedUrl", "I", "requestedData", "Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "J", "Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "getSelectedChallan", "()Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "setSelectedChallan", "(Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;)V", "selectedChallan", "K", "getSearchType", "()Ljava/lang/String;", "setSearchType", "(Ljava/lang/String;)V", "searchType", "L", "paymentType", "M", "fromActivity", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class EtransChallanPayment extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public oc0 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public SearchChallanResultModel selectedChallan;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String requestedUrl = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String requestedData = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String searchType = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String paymentType = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String fromActivity = "";

    public static final class a {
        public final Context a;
        public final SearchChallanResultModel b;
        public final String c;
        public final String d;
        public final String e;

        public a(Context ctx, SearchChallanResultModel selectedChallan, String searchType, String paymentType, String fromActivity) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(selectedChallan, "selectedChallan");
            Intrinsics.checkNotNullParameter(searchType, "searchType");
            Intrinsics.checkNotNullParameter(paymentType, "paymentType");
            Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
            this.a = ctx;
            this.b = selectedChallan;
            this.c = searchType;
            this.d = paymentType;
            this.e = fromActivity;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            JSONObject jSONObject;
            String string;
            String string2;
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
            if (jSONObject == null || !jSONObject.has("transId")) {
                return;
            }
            Intent intent = new Intent(this.a, (Class<?>) ResponsePaymentActivity.class);
            String string3 = "";
            String str2 = jSONObject.getInt("respCode") == 0 ? "Pending" : jSONObject.getInt("respCode") == 1 ? "Success" : jSONObject.getInt("respCode") == 2 ? "Failed" : jSONObject.getInt("respCode") == 3 ? "Cancelled" : "";
            if (jSONObject.has("ecodedata")) {
                string = jSONObject.getString("ecodedata");
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
            intent.putExtra("dptCd", this.b.getDptCd());
            intent.putExtra("rtoCd", this.b.getRtoCd());
            intent.putExtra("challanDate", this.b.getDateTime());
            intent.putExtra("stateCd", this.b.getStateCd());
            intent.putExtra("searchType", this.c);
            intent.putExtra("paymentType", this.d);
            intent.putExtra("fromActivity", this.e);
            this.a.startActivity(intent);
        }
    }

    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            EtransChallanPayment.this.isLoaded = true;
            EtransChallanPayment.this.v1(false);
            oc0 oc0Var = EtransChallanPayment.this.binding;
            if (oc0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oc0Var = null;
            }
            oc0Var.c.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            rw4 rw4Var = EtransChallanPayment.this.progress;
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
            EtransChallanPayment.this.isLoaded = false;
            EtransChallanPayment.this.v1(false);
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

    private final void q1() {
        oc0 oc0Var = this.binding;
        oc0 oc0Var2 = null;
        if (oc0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var = null;
        }
        oc0Var.b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EtransChallanPayment.r1(this.a, view);
            }
        });
        oc0 oc0Var3 = this.binding;
        if (oc0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var3 = null;
        }
        oc0Var3.b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EtransChallanPayment.s1(this.a, view);
            }
        });
        if (kt6.d(this.fromActivity)) {
            if (StringsKt__StringsJVMKt.equals(this.fromActivity, "challanDetails", true)) {
                oc0 oc0Var4 = this.binding;
                if (oc0Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    oc0Var4 = null;
                }
                oc0Var4.b.i.setText(p1().b("label_challan_payment_search", getString(R.string.online_challan_payment)));
            } else {
                oc0 oc0Var5 = this.binding;
                if (oc0Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    oc0Var5 = null;
                }
                oc0Var5.b.i.setText(p1().b("label_challan_verify_payment_status", getString(R.string.verify_challan_payment)));
            }
        }
        oc0 oc0Var6 = this.binding;
        if (oc0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var6 = null;
        }
        oc0Var6.c.getSettings().setJavaScriptEnabled(true);
        oc0 oc0Var7 = this.binding;
        if (oc0Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var7 = null;
        }
        oc0Var7.c.getSettings().setDomStorageEnabled(true);
        oc0 oc0Var8 = this.binding;
        if (oc0Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var8 = null;
        }
        oc0Var8.c.getSettings().setUseWideViewPort(true);
        oc0 oc0Var9 = this.binding;
        if (oc0Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var9 = null;
        }
        oc0Var9.c.getSettings().setLoadWithOverviewMode(true);
        oc0 oc0Var10 = this.binding;
        if (oc0Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var10 = null;
        }
        oc0Var10.c.getSettings().setBuiltInZoomControls(true);
        oc0 oc0Var11 = this.binding;
        if (oc0Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var11 = null;
        }
        oc0Var11.c.clearCache(true);
        oc0 oc0Var12 = this.binding;
        if (oc0Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var12 = null;
        }
        oc0Var12.c.reload();
        oc0 oc0Var13 = this.binding;
        if (oc0Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var13 = null;
        }
        oc0Var13.c.requestFocus(130);
        CookieManager.getInstance().setAcceptCookie(true);
        String str = "encryptedData=" + this.requestedData + "&encdata=" + this.requestedData;
        Log.d("Etrans Pgi", str);
        oc0 oc0Var14 = this.binding;
        if (oc0Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var14 = null;
        }
        oc0Var14.c.postUrl(this.requestedUrl, EncodingUtils.getBytes(str, "base64"));
        oc0 oc0Var15 = this.binding;
        if (oc0Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var15 = null;
        }
        WebView webView = oc0Var15.c;
        SearchChallanResultModel searchChallanResultModel = this.selectedChallan;
        Intrinsics.checkNotNull(searchChallanResultModel);
        webView.addJavascriptInterface(new a(this, searchChallanResultModel, this.searchType, this.paymentType, this.fromActivity), "HtmlViewer");
        oc0 oc0Var16 = this.binding;
        if (oc0Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            oc0Var2 = oc0Var16;
        }
        oc0Var2.c.setWebViewClient(new b());
    }

    public static final void r1(EtransChallanPayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oc0 oc0Var = this$0.binding;
        oc0 oc0Var2 = null;
        if (oc0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oc0Var = null;
        }
        if (!oc0Var.c.canGoBack()) {
            this$0.w1();
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

    public static final void s1(EtransChallanPayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1();
    }

    private final void t1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(boolean visible) {
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
        }
    }

    private final void w1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, p1().b("label_challan_double_click_exit", getString(R.string.double_click_to_exit)), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.k42
            @Override // java.lang.Runnable
            public final void run() {
                EtransChallanPayment.x1(this.c);
            }
        }, 2000L);
    }

    public static final void x1(EtransChallanPayment this$0) {
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
        u1(new wa3(this));
        this.progress = new rw4(this, R.string.blank, true);
        String stringExtra = getIntent().getStringExtra("requestUrl");
        Intrinsics.checkNotNull(stringExtra);
        this.requestedUrl = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("requestData");
        Intrinsics.checkNotNull(stringExtra2);
        this.requestedData = stringExtra2;
        this.selectedChallan = (SearchChallanResultModel) getIntent().getParcelableExtra("selectedData");
        if (getIntent().hasExtra("type")) {
            String stringExtra3 = getIntent().getStringExtra("type");
            Intrinsics.checkNotNull(stringExtra3);
            this.searchType = stringExtra3;
        }
        String stringExtra4 = getIntent().getStringExtra("paymentType");
        Intrinsics.checkNotNull(stringExtra4);
        this.paymentType = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("fromActivity");
        Intrinsics.checkNotNull(stringExtra5);
        this.fromActivity = stringExtra5;
        q1();
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
        w1();
        return true;
    }

    public final wa3 p1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void u1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }
}
