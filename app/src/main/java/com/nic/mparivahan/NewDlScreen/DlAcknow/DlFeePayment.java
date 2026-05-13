package com.nic.mparivahan.NewDlScreen.DlAcknow;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdateFee;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlFeePayment;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.zepto.im3;
import com.zepto.l8;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.t9;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yk1;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b^\u0010_J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0014J\u0017\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u0002H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J&\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bR\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00103\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R$\u0010?\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010-\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010C\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010-\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R$\u0010G\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010-\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R\"\u0010K\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010-\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\"\u0010O\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010-\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010-R\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006a"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/DlAcknow/DlFeePayment;", "Lcom/zepto/pq;", "", "E1", "D1", "P1", "J1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "I1", "", "message", "G1", "url", "A1", "N1", "L1", "M1", "O1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onDestroy", "acCd", "F1", "(Ljava/lang/Integer;)V", "onPause", "onResume", "oldUrl", "userAgent", "contentDisposition", "mimetype", "x1", "Lcom/zepto/t9;", "C", "Lcom/zepto/t9;", "cBinding", "D", "Ljava/lang/String;", "mApplNo", "E", "mApplDob", "F", "Z", "isLoaded", "G", "doubleBackToExitPressedOnce", "Lcom/zepto/yk1;", "H", "Lcom/zepto/yk1;", "viewModel", "I", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "J", "getDob", "setDob", "dob", "K", "getMobile_no", "setMobile_no", "Mobile_no", "L", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "M", "getLastEndorseRTOCode", "setLastEndorseRTOCode", "lastEndorseRTOCode", "Lcom/zepto/ws6;", "N", "Lcom/zepto/ws6;", "C1", "()Lcom/zepto/ws6;", "setMSessionmanger", "(Lcom/zepto/ws6;)V", "mSessionmanger", "O", "applNum", "Landroid/content/BroadcastReceiver;", "P", "Landroid/content/BroadcastReceiver;", "mMessageReceiver", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlFeePayment extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public t9 cBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String applNum = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final BroadcastReceiver mMessageReceiver = new e();

    public static final class a {
        public final Context a;

        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.a = context;
        }

        public final void a(String str, String str2) {
            Log.d("sender", "Broadcasting message");
            Intent intent = new Intent("success-payment-event");
            intent.putExtra("applNum", str);
            intent.putExtra("respCode", str2);
            im3.b(this.a).d(intent);
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            try {
                Intrinsics.checkNotNull(str);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("applNum") || jSONObject.has("respCode")) {
                    String string = jSONObject.getString("applNum");
                    String string2 = jSONObject.getString("respCode");
                    Intrinsics.checkNotNull(string);
                    Intrinsics.checkNotNull(string2);
                    a(string, string2);
                }
                if (jSONObject.has("receipt_no")) {
                    jSONObject.getString("receipt_no");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            super.onReceivedIcon(webView, bitmap);
        }
    }

    public static final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Log.e("url_app", String.valueOf(str));
            if (str != null) {
                String str2 = null;
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "callback/sarathiPGResponse", false, 2, (Object) null)) {
                    yk1 yk1Var = DlFeePayment.this.viewModel;
                    if (yk1Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        yk1Var = null;
                    }
                    String str3 = DlFeePayment.this.applNum;
                    String str4 = DlFeePayment.this.mApplDob;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    } else {
                        str2 = str4;
                    }
                    yk1Var.h(str3, str2);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.e("url", String.valueOf(str));
            super.onPageStarted(webView, str, bitmap);
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) throws Throwable {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            DlFeePayment.this.I1(applStatusDetailsItem.getApplFlowStatusList());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            t9 t9Var = null;
            DlFeePayment.this.applNum = String.valueOf(intent != null ? intent.getStringExtra("applNum") : null);
            String stringExtra = intent != null ? intent.getStringExtra("respCode") : null;
            if (DlFeePayment.this.applNum.length() > 0 && stringExtra != null && stringExtra.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(s14.a.y());
                sb.append("PrintConformMob.jsp?applno=");
                String str = DlFeePayment.this.mApplNo;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str = null;
                }
                sb.append(str);
                sb.append("&dob=");
                String str2 = DlFeePayment.this.mApplDob;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str2 = null;
                }
                sb.append(str2);
                String string = sb.toString();
                Log.d("newReceiptUrl", string.toString());
                t9 t9Var2 = DlFeePayment.this.cBinding;
                if (t9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    t9Var = t9Var2;
                }
                t9Var.B.setVisibility(8);
                DlFeePayment.this.A1(string);
            }
            Log.d("receiver", "Got message: " + stringExtra);
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    public static final class g extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Log.e("dl-js1", String.valueOf(jsResult));
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public static final class h extends WebViewClient {
        public h() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            DlFeePayment.this.isLoaded = true;
            t9 t9Var = DlFeePayment.this.cBinding;
            t9 t9Var2 = null;
            if (t9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                t9Var = null;
            }
            t9Var.C.p();
            t9 t9Var3 = DlFeePayment.this.cBinding;
            if (t9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                t9Var3 = null;
            }
            t9Var3.C.setVisibility(8);
            t9 t9Var4 = DlFeePayment.this.cBinding;
            if (t9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                t9Var4 = null;
            }
            t9Var4.B.setVisibility(0);
            t9 t9Var5 = DlFeePayment.this.cBinding;
            if (t9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                t9Var5 = null;
            }
            t9Var5.B.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            t9 t9Var6 = DlFeePayment.this.cBinding;
            if (t9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                t9Var2 = t9Var6;
            }
            t9Var2.B.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            t9 t9Var = DlFeePayment.this.cBinding;
            if (t9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                t9Var = null;
            }
            t9Var.C.o();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            DlFeePayment.this.isLoaded = false;
            Log.e("dl-js", ("Got Error! " + error).toString());
            Toast.makeText(DlFeePayment.this, "Service is temporary unavailable. Try After some time", 1).show();
            t9 t9Var = DlFeePayment.this.cBinding;
            t9 t9Var2 = null;
            if (t9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                t9Var = null;
            }
            t9Var.C.p();
            t9 t9Var3 = DlFeePayment.this.cBinding;
            if (t9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                t9Var2 = t9Var3;
            }
            t9Var2.C.setVisibility(8);
            super.onReceivedError(view, request, error);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView != null) {
                webView.loadUrl(strValueOf);
            }
            Log.e("dl-url_finish", strValueOf);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(String url) {
        t9 t9Var = this.cBinding;
        t9 t9Var2 = null;
        if (t9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var = null;
        }
        t9Var.A.setVisibility(0);
        t9 t9Var3 = this.cBinding;
        if (t9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var3 = null;
        }
        t9Var3.A.loadUrl(url);
        t9 t9Var4 = this.cBinding;
        if (t9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var4 = null;
        }
        t9Var4.A.getSettings().setJavaScriptEnabled(true);
        t9 t9Var5 = this.cBinding;
        if (t9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var5 = null;
        }
        t9Var5.A.setDownloadListener(new DownloadListener() { // from class: com.zepto.nm1
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                DlFeePayment.B1(this.a, str, str2, str3, str4, j);
            }
        });
        t9 t9Var6 = this.cBinding;
        if (t9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var6 = null;
        }
        t9Var6.A.setWebChromeClient(new b());
        t9 t9Var7 = this.cBinding;
        if (t9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            t9Var2 = t9Var7;
        }
        t9Var2.A.setWebViewClient(new c());
    }

    public static final void B1(DlFeePayment this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            l8.s(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return;
        }
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        this$0.x1(str, str2, str3, str4);
    }

    private final void D1() {
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new f(new d()));
    }

    private final void E1() {
        wl5 wl5Var = new wl5(this);
        im3.b(this).c(this.mMessageReceiver, new IntentFilter("success-payment-event"));
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            t9 t9Var = null;
            this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
            Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRto = stringExtra;
            t9 t9Var2 = this.cBinding;
            if (t9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                t9Var = t9Var2;
            }
            t9Var.x.g.setText(wl5Var.k());
        }
    }

    private final void G1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlFeePayment.H1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void H1(Dialog d2, DlFeePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(List applFlowStatusList) throws Throwable {
        Integer acCd;
        String str;
        String str2;
        int size = applFlowStatusList.size();
        for (int i = 0; i < size; i++) {
            Object obj = applFlowStatusList.get(i);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i);
                Intrinsics.checkNotNull(obj2);
                Integer acCd2 = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd2 == null || acCd2.intValue() != 455) {
                    Object obj3 = applFlowStatusList.get(i);
                    Intrinsics.checkNotNull(obj3);
                    acCd = ((ApplFlowStatusListItem) obj3).getAcCd();
                    break;
                }
            }
        }
        acCd = null;
        if (acCd == null) {
            new DLServiceFinalSubmitedActivity().G1(this);
            return;
        }
        try {
            DlLogUpdateFee.Companion companion = DlLogUpdateFee.INSTANCE;
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str = null;
            } else {
                str = str3;
            }
            String str4 = this.mApplNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str4 = null;
            }
            long j = Long.parseLong(str4);
            int i2 = Integer.parseInt(C1().k());
            String str5 = this.dob;
            Intrinsics.checkNotNull(str5);
            String str6 = this.dlNo;
            Intrinsics.checkNotNull(str6);
            String str7 = this.mApplDob;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str2 = null;
            } else {
                str2 = str7;
            }
            companion.a(this, str, j, i2, str5, str6, str2, this.lastEndorseRTOCode);
        } catch (Exception unused) {
        }
        F1(acCd);
    }

    private final void J1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.om1
            @Override // java.lang.Runnable
            public final void run() {
                DlFeePayment.K1(this.c);
            }
        }, 2000L);
    }

    public static final void K1(DlFeePayment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void L1() {
        Intent intent = new Intent(this, (Class<?>) DlDocUpload.class);
        String str = this.mApplNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        startActivity(intent);
        finish();
    }

    private final void M1() {
        Intent intent = new Intent(this, (Class<?>) DlFeePayment.class);
        String str = this.mApplNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        startActivity(intent);
        finish();
    }

    private final void N1() {
        Intent intent = new Intent(this, (Class<?>) DlPhotoSign.class);
        String str = this.mApplNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        startActivity(intent);
        finish();
    }

    private final void O1() {
        Intent intent = new Intent(this, (Class<?>) DlSlots.class);
        String str = this.mApplNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        startActivity(intent);
        finish();
    }

    private final void P1() {
        t9 t9Var = this.cBinding;
        t9 t9Var2 = null;
        if (t9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var = null;
        }
        t9Var.B.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        t9 t9Var3 = this.cBinding;
        if (t9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var3 = null;
        }
        t9Var3.B.getSettings().setAllowFileAccess(true);
        t9 t9Var4 = this.cBinding;
        if (t9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var4 = null;
        }
        t9Var4.B.getSettings().setAllowContentAccess(true);
        t9 t9Var5 = this.cBinding;
        if (t9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var5 = null;
        }
        t9Var5.B.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        t9 t9Var6 = this.cBinding;
        if (t9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var6 = null;
        }
        t9Var6.B.getSettings().setSupportMultipleWindows(true);
        t9 t9Var7 = this.cBinding;
        if (t9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var7 = null;
        }
        t9Var7.B.getSettings().setJavaScriptEnabled(true);
        t9 t9Var8 = this.cBinding;
        if (t9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var8 = null;
        }
        t9Var8.B.getSettings().setDomStorageEnabled(true);
        t9 t9Var9 = this.cBinding;
        if (t9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var9 = null;
        }
        t9Var9.B.getSettings().setUseWideViewPort(true);
        t9 t9Var10 = this.cBinding;
        if (t9Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var10 = null;
        }
        t9Var10.B.getSettings().setLoadWithOverviewMode(true);
        t9 t9Var11 = this.cBinding;
        if (t9Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var11 = null;
        }
        t9Var11.B.getSettings().setBuiltInZoomControls(true);
        t9 t9Var12 = this.cBinding;
        if (t9Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var12 = null;
        }
        t9Var12.B.clearCache(true);
        t9 t9Var13 = this.cBinding;
        if (t9Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var13 = null;
        }
        t9Var13.B.reload();
        t9 t9Var14 = this.cBinding;
        if (t9Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var14 = null;
        }
        t9Var14.B.requestFocus(130);
        t9 t9Var15 = this.cBinding;
        if (t9Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var15 = null;
        }
        t9Var15.B.setDownloadListener(new DownloadListener() { // from class: com.zepto.pm1
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                DlFeePayment.Q1(this.a, str, str2, str3, str4, j);
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(s14.a.y());
        sb.append("ePayment.jsp?applno=");
        String str = this.mApplNo;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        sb.append(str);
        sb.append("&dob=");
        String str2 = this.mApplDob;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            str2 = null;
        }
        sb.append(str2);
        sb.append("&umang=P");
        String string = sb.toString();
        Log.d("url_new", string.toString());
        CookieManager.getInstance().setAcceptCookie(true);
        t9 t9Var16 = this.cBinding;
        if (t9Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var16 = null;
        }
        t9Var16.B.loadUrl(string);
        t9 t9Var17 = this.cBinding;
        if (t9Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var17 = null;
        }
        t9Var17.B.addJavascriptInterface(new a(this), "HtmlViewer");
        t9 t9Var18 = this.cBinding;
        if (t9Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var18 = null;
        }
        t9Var18.B.setWebChromeClient(new g());
        t9 t9Var19 = this.cBinding;
        if (t9Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            t9Var2 = t9Var19;
        }
        t9Var2.B.setWebViewClient(new h());
    }

    public static final void Q1(DlFeePayment this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            l8.s(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    public static final void y1(String url, String userAgent, DlFeePayment this$0, Dialog screen16, View view) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(userAgent, "$userAgent");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(screen16, "$screen16");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url));
        request.addRequestHeader("User-Agent", userAgent);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        Object systemService = this$0.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager downloadManager = (DownloadManager) systemService;
        String str = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb = new StringBuilder();
        sb.append("PayReceipt");
        String str2 = this$0.mApplNo;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str2 = null;
        }
        sb.append(str2);
        sb.append(".pdf");
        request.setDestinationInExternalPublicDir(str, sb.toString());
        downloadManager.enqueue(request);
        screen16.dismiss();
    }

    public static final void z1(Dialog screen16, View view) {
        Intrinsics.checkNotNullParameter(screen16, "$screen16");
        screen16.dismiss();
    }

    public final ws6 C1() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final void F1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            N1();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            M1();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            L1();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            O1();
        } else if (acCd != null && acCd.intValue() == 455) {
            G1("Next process is E-Sign Document");
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t9 t9VarX = t9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(t9VarX, "inflate(...)");
        this.cBinding = t9VarX;
        if (t9VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9VarX = null;
        }
        setContentView(t9VarX.m());
        this.viewModel = (yk1) new z(this).a(yk1.class);
        E1();
        D1();
        P1();
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onDestroy() {
        im3.b(this).e(this.mMessageReceiver);
        super.onDestroy();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        t9 t9Var = this.cBinding;
        if (t9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var = null;
        }
        if (t9Var.B.canGoBack()) {
            onBackPressed();
            return true;
        }
        J1();
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPause() {
        super.onPause();
        t9 t9Var = this.cBinding;
        t9 t9Var2 = null;
        if (t9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var = null;
        }
        t9Var.A.onPause();
        t9 t9Var3 = this.cBinding;
        if (t9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            t9Var2 = t9Var3;
        }
        t9Var2.A.pauseTimers();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        t9 t9Var = this.cBinding;
        t9 t9Var2 = null;
        if (t9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            t9Var = null;
        }
        t9Var.A.onResume();
        t9 t9Var3 = this.cBinding;
        if (t9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            t9Var2 = t9Var3;
        }
        t9Var2.A.resumeTimers();
    }

    public final void x1(String oldUrl, final String userAgent, String contentDisposition, String mimetype) {
        Intrinsics.checkNotNullParameter(oldUrl, "oldUrl");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(contentDisposition, "contentDisposition");
        Intrinsics.checkNotNullParameter(mimetype, "mimetype");
        Log.e("url", oldUrl);
        StringBuilder sb = new StringBuilder();
        sb.append(oldUrl);
        sb.append("?applno=");
        String str = this.mApplNo;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        sb.append(str);
        sb.append("&vsno=1");
        final String string = sb.toString();
        Log.e("urlnew", string);
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.screen_16);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.title_popup);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText("Download");
        ((TextView) viewFindViewById2).setText("Do you want to save Payment Receipt ?");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlFeePayment.y1(string, userAgent, this, dialog, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlFeePayment.z1(dialog, view);
            }
        });
        dialog.show();
    }
}
