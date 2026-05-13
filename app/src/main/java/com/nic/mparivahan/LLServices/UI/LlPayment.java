package com.nic.mparivahan.LLServices.UI;

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
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdateFee;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.LlPayment;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.zepto.fd;
import com.zepto.im3;
import com.zepto.l8;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yk1;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001qB\u0007¢\u0006\u0004\bo\u0010pJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0014J\u0017\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0014J\b\u0010#\u001a\u00020\u0002H\u0014J&\u0010(\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fR\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R$\u0010@\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010.\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010.\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R$\u0010H\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010.\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\"\u0010L\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\"\u0010P\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010.\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010.R\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006r"}, d2 = {"Lcom/nic/mparivahan/LLServices/UI/LlPayment;", "Lcom/zepto/pq;", "", "K1", "J1", "I1", "a2", "U1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "T1", "", "message", "P1", "Y1", "W1", "X1", "Z1", "url", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onDestroy", "acCd", "M1", "(Ljava/lang/Integer;)V", "onPause", "onResume", "oldUrl", "userAgent", "contentDisposition", "mimetype", "A1", "Lcom/zepto/fd;", "C", "Lcom/zepto/fd;", "cBinding", "D", "Ljava/lang/String;", "mApplNo", "E", "mApplDob", "F", "Z", "isLoaded", "G", "doubleBackToExitPressedOnce", "Lcom/zepto/yk1;", "H", "Lcom/zepto/yk1;", "viewModel", "I", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "J", "getDob", "setDob", "dob", "K", "getMobile_no", "setMobile_no", "Mobile_no", "L", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "M", "getLastEndorseRTOCode", "setLastEndorseRTOCode", "lastEndorseRTOCode", "Lcom/zepto/ws6;", "N", "Lcom/zepto/ws6;", "G1", "()Lcom/zepto/ws6;", "setMSessionmanger", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wl5;", "O", "Lcom/zepto/wl5;", "H1", "()Lcom/zepto/wl5;", "S1", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "P", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "F1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "R1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Q", "applNum", "Landroid/content/BroadcastReceiver;", "R", "Landroid/content/BroadcastReceiver;", "mMessageReceiver", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlPayment extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public fd cBinding;

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

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

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

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String applNum = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
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
                    yk1 yk1Var = LlPayment.this.viewModel;
                    if (yk1Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        yk1Var = null;
                    }
                    String str3 = LlPayment.this.applNum;
                    String str4 = LlPayment.this.mApplDob;
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
            LlPayment.this.T1(applStatusDetailsItem.getApplFlowStatusList());
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
            fd fdVar = null;
            LlPayment.this.applNum = String.valueOf(intent != null ? intent.getStringExtra("applNum") : null);
            String stringExtra = intent != null ? intent.getStringExtra("respCode") : null;
            if (LlPayment.this.applNum.length() > 0 && stringExtra != null && stringExtra.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(s14.a.y());
                sb.append("PrintConformMob.jsp?applno=");
                String str = LlPayment.this.mApplNo;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str = null;
                }
                sb.append(str);
                sb.append("&dob=");
                String str2 = LlPayment.this.mApplDob;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str2 = null;
                }
                sb.append(str2);
                String string = sb.toString();
                Log.d("newReceiptUrl", string.toString());
                fd fdVar2 = LlPayment.this.cBinding;
                if (fdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    fdVar = fdVar2;
                }
                fdVar.C.setVisibility(8);
                LlPayment.this.D1(string);
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
            LlPayment.this.isLoaded = true;
            fd fdVar = LlPayment.this.cBinding;
            fd fdVar2 = null;
            if (fdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                fdVar = null;
            }
            fdVar.D.p();
            fd fdVar3 = LlPayment.this.cBinding;
            if (fdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                fdVar3 = null;
            }
            fdVar3.D.setVisibility(8);
            fd fdVar4 = LlPayment.this.cBinding;
            if (fdVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                fdVar4 = null;
            }
            fdVar4.C.setVisibility(0);
            fd fdVar5 = LlPayment.this.cBinding;
            if (fdVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                fdVar5 = null;
            }
            fdVar5.C.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            fd fdVar6 = LlPayment.this.cBinding;
            if (fdVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                fdVar2 = fdVar6;
            }
            fdVar2.C.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            fd fdVar = LlPayment.this.cBinding;
            if (fdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                fdVar = null;
            }
            fdVar.D.o();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            LlPayment.this.isLoaded = false;
            Log.e("dl-js", ("Got Error! " + error).toString());
            fd fdVar = LlPayment.this.cBinding;
            fd fdVar2 = null;
            if (fdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                fdVar = null;
            }
            fdVar.D.p();
            fd fdVar3 = LlPayment.this.cBinding;
            if (fdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                fdVar2 = fdVar3;
            }
            fdVar2.D.setVisibility(8);
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
    public static final void B1(Dialog screen16, View view) {
        Intrinsics.checkNotNullParameter(screen16, "$screen16");
        screen16.dismiss();
    }

    public static final void C1(String url, String userAgent, LlPayment this$0, Dialog screen16, View view) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(String url) {
        fd fdVar = this.cBinding;
        fd fdVar2 = null;
        if (fdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar = null;
        }
        fdVar.B.setVisibility(0);
        fd fdVar3 = this.cBinding;
        if (fdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar3 = null;
        }
        fdVar3.B.loadUrl(url);
        fd fdVar4 = this.cBinding;
        if (fdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar4 = null;
        }
        fdVar4.B.getSettings().setJavaScriptEnabled(true);
        fd fdVar5 = this.cBinding;
        if (fdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar5 = null;
        }
        fdVar5.B.setDownloadListener(new DownloadListener() { // from class: com.zepto.ak3
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                LlPayment.E1(this.a, str, str2, str3, str4, j);
            }
        });
        fd fdVar6 = this.cBinding;
        if (fdVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar6 = null;
        }
        fdVar6.B.setWebChromeClient(new b());
        fd fdVar7 = this.cBinding;
        if (fdVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            fdVar2 = fdVar7;
        }
        fdVar2.B.setWebViewClient(new c());
    }

    public static final void E1(LlPayment this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            l8.s(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return;
        }
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        this$0.A1(str, str2, str3, str4);
    }

    private final void I1() {
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new f(new d()));
    }

    private final void J1() {
        wl5 wl5Var = new wl5(this);
        im3.b(this).c(this.mMessageReceiver, new IntentFilter("success-payment-event"));
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            fd fdVar = null;
            this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
            Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRto = stringExtra;
            fd fdVar2 = this.cBinding;
            if (fdVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                fdVar = fdVar2;
            }
            fdVar.x.g.setText(wl5Var.k());
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            R1((FetchLlDetails) serializableExtra);
        }
    }

    private final void K1() {
        fd fdVar = this.cBinding;
        fd fdVar2 = null;
        if (fdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar = null;
        }
        fdVar.z.g.setText(H1().k());
        fd fdVar3 = this.cBinding;
        if (fdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar3 = null;
        }
        TextView textView = fdVar3.z.h;
        fd fdVar4 = this.cBinding;
        if (fdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar4 = null;
        }
        textView.setPaintFlags(fdVar4.z.h.getPaintFlags() | 8);
        fd fdVar5 = this.cBinding;
        if (fdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar5 = null;
        }
        TextView textView2 = fdVar5.z.h;
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        textView2.setText(StringsKt__StringsKt.trim((CharSequence) str).toString());
        fd fdVar6 = this.cBinding;
        if (fdVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            fdVar2 = fdVar6;
        }
        fdVar2.z.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPayment.L1(this.a, view);
            }
        });
    }

    public static final void L1(LlPayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.F1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void N1(LlPayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void O1(LlPayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void P1(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPayment.Q1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void Q1(Dialog d2, LlPayment this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(List applFlowStatusList) throws Throwable {
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
            int i2 = Integer.parseInt(G1().k());
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
        M1(acCd);
    }

    private final void U1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.bk3
            @Override // java.lang.Runnable
            public final void run() {
                LlPayment.V1(this.c);
            }
        }, 2000L);
    }

    public static final void V1(LlPayment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void W1() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlDocumentUpload.class);
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
            intent.putExtra("LLDetails", F1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void X1() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPayment.class);
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
            intent.putExtra("LLDetails", F1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void Y1() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPhotoSignature.class);
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
            intent.putExtra("LLDetails", F1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void Z1() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlSlots.class);
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
            intent.putExtra("LLDetails", F1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void a2() {
        fd fdVar = this.cBinding;
        fd fdVar2 = null;
        if (fdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar = null;
        }
        fdVar.C.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        fd fdVar3 = this.cBinding;
        if (fdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar3 = null;
        }
        fdVar3.C.getSettings().setAllowFileAccess(true);
        fd fdVar4 = this.cBinding;
        if (fdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar4 = null;
        }
        fdVar4.C.getSettings().setAllowContentAccess(true);
        fd fdVar5 = this.cBinding;
        if (fdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar5 = null;
        }
        fdVar5.C.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        fd fdVar6 = this.cBinding;
        if (fdVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar6 = null;
        }
        fdVar6.C.getSettings().setSupportMultipleWindows(true);
        fd fdVar7 = this.cBinding;
        if (fdVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar7 = null;
        }
        fdVar7.C.getSettings().setJavaScriptEnabled(true);
        fd fdVar8 = this.cBinding;
        if (fdVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar8 = null;
        }
        fdVar8.C.getSettings().setDomStorageEnabled(true);
        fd fdVar9 = this.cBinding;
        if (fdVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar9 = null;
        }
        fdVar9.C.getSettings().setUseWideViewPort(true);
        fd fdVar10 = this.cBinding;
        if (fdVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar10 = null;
        }
        fdVar10.C.getSettings().setLoadWithOverviewMode(true);
        fd fdVar11 = this.cBinding;
        if (fdVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar11 = null;
        }
        fdVar11.C.getSettings().setBuiltInZoomControls(true);
        fd fdVar12 = this.cBinding;
        if (fdVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar12 = null;
        }
        fdVar12.C.clearCache(true);
        fd fdVar13 = this.cBinding;
        if (fdVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar13 = null;
        }
        fdVar13.C.reload();
        fd fdVar14 = this.cBinding;
        if (fdVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar14 = null;
        }
        fdVar14.C.requestFocus(130);
        fd fdVar15 = this.cBinding;
        if (fdVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar15 = null;
        }
        fdVar15.C.setDownloadListener(new DownloadListener() { // from class: com.zepto.ek3
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                LlPayment.b2(this.a, str, str2, str3, str4, j);
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
        fd fdVar16 = this.cBinding;
        if (fdVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar16 = null;
        }
        fdVar16.C.loadUrl(string);
        fd fdVar17 = this.cBinding;
        if (fdVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar17 = null;
        }
        fdVar17.C.addJavascriptInterface(new a(this), "HtmlViewer");
        fd fdVar18 = this.cBinding;
        if (fdVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar18 = null;
        }
        fdVar18.C.setWebChromeClient(new g());
        fd fdVar19 = this.cBinding;
        if (fdVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            fdVar2 = fdVar19;
        }
        fdVar2.C.setWebViewClient(new h());
    }

    public static final void b2(LlPayment this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            l8.s(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    public final void A1(String oldUrl, final String userAgent, String contentDisposition, String mimetype) {
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
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPayment.C1(string, userAgent, this, dialog, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ik3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPayment.B1(dialog, view);
            }
        });
        dialog.show();
    }

    public final FetchLlDetails F1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final ws6 G1() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final wl5 H1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void M1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            Y1();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            X1();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            W1();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            Z1();
        } else if (acCd != null && acCd.intValue() == 455) {
            P1("Next process is E-Sign Document");
        }
    }

    public final void R1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void S1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fd fdVarX = fd.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fdVarX, "inflate(...)");
        this.cBinding = fdVarX;
        fd fdVar = null;
        if (fdVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVarX = null;
        }
        setContentView(fdVarX.m());
        this.viewModel = (yk1) new z(this).a(yk1.class);
        S1(new wl5(this));
        J1();
        I1();
        a2();
        K1();
        fd fdVar2 = this.cBinding;
        if (fdVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar2 = null;
        }
        fdVar2.z.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ck3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPayment.N1(this.a, view);
            }
        });
        fd fdVar3 = this.cBinding;
        if (fdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            fdVar = fdVar3;
        }
        fdVar.x.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPayment.O1(this.a, view);
            }
        });
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
        fd fdVar = this.cBinding;
        if (fdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar = null;
        }
        if (fdVar.C.canGoBack()) {
            onBackPressed();
            return true;
        }
        U1();
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPause() {
        super.onPause();
        fd fdVar = this.cBinding;
        fd fdVar2 = null;
        if (fdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar = null;
        }
        fdVar.B.onPause();
        fd fdVar3 = this.cBinding;
        if (fdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            fdVar2 = fdVar3;
        }
        fdVar2.B.pauseTimers();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        fd fdVar = this.cBinding;
        fd fdVar2 = null;
        if (fdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            fdVar = null;
        }
        fdVar.B.onResume();
        fd fdVar3 = this.cBinding;
        if (fdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            fdVar2 = fdVar3;
        }
        fdVar2.B.resumeTimers();
    }
}
