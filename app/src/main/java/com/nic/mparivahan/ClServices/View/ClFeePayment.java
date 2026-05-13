package com.nic.mparivahan.ClServices.View;

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
import com.nic.mparivahan.ClServices.View.ClFeePayment;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdateFee;
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
import com.zepto.s7;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yk1;
import java.util.List;
import java.util.Objects;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0085\u0001B\t¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0014J\u0017\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0014J\b\u0010#\u001a\u00020\u0002H\u0014J&\u0010(\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fR\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R$\u0010@\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010.\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010.\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R$\u0010H\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010.\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\"\u0010L\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\"\u0010P\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010.\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\"\u0010T\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010.\u001a\u0004\bR\u0010=\"\u0004\bS\u0010?R\"\u0010X\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010.\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\"\u0010\\\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010.\u001a\u0004\bZ\u0010=\"\u0004\b[\u0010?R\"\u0010`\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010.\u001a\u0004\b^\u0010=\"\u0004\b_\u0010?R\"\u0010d\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010.\u001a\u0004\bb\u0010=\"\u0004\bc\u0010?R\"\u0010h\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010.\u001a\u0004\bf\u0010=\"\u0004\bg\u0010?R\"\u0010l\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010.\u001a\u0004\bj\u0010=\"\u0004\bk\u0010?R\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0016\u0010~\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010.R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/ClFeePayment;", "Lcom/zepto/pq;", "", "J1", "I1", "H1", "Y1", "S1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "R1", "", "message", "O1", "W1", "U1", "V1", "X1", "url", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onDestroy", "acCd", "L1", "(Ljava/lang/Integer;)V", "onPause", "onResume", "oldUrl", "userAgent", "contentDisposition", "mimetype", "A1", "Lcom/zepto/s7;", "C", "Lcom/zepto/s7;", "cBinding", "D", "Ljava/lang/String;", "mApplNo", "E", "mApplDob", "F", "Z", "isLoaded", "G", "doubleBackToExitPressedOnce", "Lcom/zepto/yk1;", "H", "Lcom/zepto/yk1;", "viewModel", "I", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "J", "getDob", "setDob", "dob", "K", "getMobile_no", "setMobile_no", "Mobile_no", "L", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "M", "getLastEndorseRTOCode", "setLastEndorseRTOCode", "lastEndorseRTOCode", "N", "getClName", "setClName", "clName", "O", "getClPhoto", "setClPhoto", "clPhoto", "P", "getFatherName", "setFatherName", "fatherName", "Q", "getAddress", "setAddress", "address", "R", "getCl_Status", "setCl_Status", "cl_Status", "S", "getIssuing_authority", "setIssuing_authority", "issuing_authority", "T", "getValidity", "setValidity", "validity", "Lcom/zepto/ws6;", "U", "Lcom/zepto/ws6;", "F1", "()Lcom/zepto/ws6;", "setMSessionmanger", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wl5;", "V", "Lcom/zepto/wl5;", "G1", "()Lcom/zepto/wl5;", "Q1", "(Lcom/zepto/wl5;)V", "sarthiSession", "W", "applNum", "Landroid/content/BroadcastReceiver;", "X", "Landroid/content/BroadcastReceiver;", "mMessageReceiver", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClFeePayment extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public s7 cBinding;

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

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public wl5 sarthiSession;

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

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String clName = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String clPhoto = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String fatherName = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String cl_Status = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String applNum = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public final BroadcastReceiver mMessageReceiver = new e();

    public static final class a {
        public final Context a;

        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.a = context;
        }

        public final void a(String str, String str2) {
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
            if (str != null) {
                String str2 = null;
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "callback/sarathiPGResponse", false, 2, (Object) null)) {
                    yk1 yk1Var = ClFeePayment.this.viewModel;
                    if (yk1Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        yk1Var = null;
                    }
                    String str3 = ClFeePayment.this.applNum;
                    String str4 = ClFeePayment.this.mApplDob;
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
            ClFeePayment.this.R1(applStatusDetailsItem.getApplFlowStatusList());
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
            s7 s7Var = null;
            ClFeePayment.this.applNum = String.valueOf(intent != null ? intent.getStringExtra("applNum") : null);
            String stringExtra = intent != null ? intent.getStringExtra("respCode") : null;
            if (ClFeePayment.this.applNum.length() <= 0 || stringExtra == null || stringExtra.length() <= 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(s14.a.y());
            sb.append("PrintConformMob.jsp?applno=");
            String str = ClFeePayment.this.mApplNo;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            sb.append(str);
            sb.append("&dob=");
            String str2 = ClFeePayment.this.mApplDob;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str2 = null;
            }
            sb.append(str2);
            String string = sb.toString();
            s7 s7Var2 = ClFeePayment.this.cBinding;
            if (s7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                s7Var = s7Var2;
            }
            s7Var.C.setVisibility(8);
            ClFeePayment.this.D1(string);
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
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public static final class h extends WebViewClient {
        public h() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ClFeePayment.this.isLoaded = true;
            s7 s7Var = ClFeePayment.this.cBinding;
            s7 s7Var2 = null;
            if (s7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                s7Var = null;
            }
            s7Var.D.p();
            s7 s7Var3 = ClFeePayment.this.cBinding;
            if (s7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                s7Var3 = null;
            }
            s7Var3.D.setVisibility(8);
            s7 s7Var4 = ClFeePayment.this.cBinding;
            if (s7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                s7Var4 = null;
            }
            s7Var4.C.setVisibility(0);
            s7 s7Var5 = ClFeePayment.this.cBinding;
            if (s7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                s7Var5 = null;
            }
            s7Var5.C.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            s7 s7Var6 = ClFeePayment.this.cBinding;
            if (s7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                s7Var2 = s7Var6;
            }
            s7Var2.C.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            s7 s7Var = ClFeePayment.this.cBinding;
            if (s7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                s7Var = null;
            }
            s7Var.D.o();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            ClFeePayment.this.isLoaded = false;
            Objects.toString(error);
            s7 s7Var = ClFeePayment.this.cBinding;
            s7 s7Var2 = null;
            if (s7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                s7Var = null;
            }
            s7Var.D.p();
            s7 s7Var3 = ClFeePayment.this.cBinding;
            if (s7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                s7Var2 = s7Var3;
            }
            s7Var2.D.setVisibility(8);
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

    public static final void B1(Dialog screen16, View view) {
        Intrinsics.checkNotNullParameter(screen16, "$screen16");
        screen16.dismiss();
    }

    public static final void C1(String url, String userAgent, ClFeePayment this$0, Dialog screen16, View view) {
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

    public static final void E1(ClFeePayment this$0, String str, String str2, String str3, String str4, long j) {
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

    private final void H1() {
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new f(new d()));
    }

    private final void J1() {
        s7 s7Var = this.cBinding;
        s7 s7Var2 = null;
        if (s7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var = null;
        }
        s7Var.z.g.setText(G1().k());
        s7 s7Var3 = this.cBinding;
        if (s7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var3 = null;
        }
        TextView textView = s7Var3.z.h;
        s7 s7Var4 = this.cBinding;
        if (s7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var4 = null;
        }
        textView.setPaintFlags(s7Var4.z.h.getPaintFlags() | 8);
        s7 s7Var5 = this.cBinding;
        if (s7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var5 = null;
        }
        TextView textView2 = s7Var5.z.h;
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        textView2.setText(StringsKt__StringsKt.trim((CharSequence) str).toString());
        if (Intrinsics.areEqual(G1().b(), "551")) {
            s7 s7Var6 = this.cBinding;
            if (s7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                s7Var6 = null;
            }
            s7Var6.z.h.setVisibility(8);
        } else {
            s7 s7Var7 = this.cBinding;
            if (s7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                s7Var7 = null;
            }
            s7Var7.z.h.setVisibility(0);
        }
        s7 s7Var8 = this.cBinding;
        if (s7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            s7Var2 = s7Var8;
        }
        s7Var2.z.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.om0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClFeePayment.K1(this.a, view);
            }
        });
    }

    public static final void K1(ClFeePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.G1().b(), "551")) {
            return;
        }
        try {
            Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
            intent.putExtra("dlValue", StringsKt__StringsKt.trim((CharSequence) String.valueOf(this$0.dlNo)).toString());
            intent.putExtra("dobValue", this$0.dob);
            intent.putExtra("fatherName", this$0.fatherName);
            intent.putExtra("clName", this$0.clName);
            intent.putExtra("clPhoto", this$0.clPhoto);
            intent.putExtra("address", this$0.address).toString();
            intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
            intent.putExtra("validity", this$0.validity).toString();
            intent.putExtra("cl_Status", this$0.cl_Status).toString();
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void M1(ClFeePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void N1(ClFeePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void O1(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClFeePayment.P1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void P1(Dialog d2, ClFeePayment this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1(List applFlowStatusList) throws Throwable {
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
            int i2 = Integer.parseInt(F1().k());
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
        L1(acCd);
    }

    private final void S1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.nm0
            @Override // java.lang.Runnable
            public final void run() {
                ClFeePayment.T1(this.c);
            }
        }, 2000L);
    }

    public static final void T1(ClFeePayment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void U1() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClDocumentsUpload.class);
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
            intent.putExtra("fatherName", this.fatherName);
            intent.putExtra("clName", this.clName);
            intent.putExtra("clPhoto", this.clPhoto);
            intent.putExtra("address", this.address).toString();
            intent.putExtra("issuing_authority", this.issuing_authority).toString();
            intent.putExtra("validity", this.validity).toString();
            intent.putExtra("cl_Status", this.cl_Status).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void V1() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClFeePayment.class);
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
            intent.putExtra("fatherName", this.fatherName);
            intent.putExtra("clName", this.clName);
            intent.putExtra("clPhoto", this.clPhoto);
            intent.putExtra("address", this.address).toString();
            intent.putExtra("issuing_authority", this.issuing_authority).toString();
            intent.putExtra("validity", this.validity).toString();
            intent.putExtra("cl_Status", this.cl_Status).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void W1() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClPhotoSignature.class);
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
            intent.putExtra("fatherName", this.fatherName);
            intent.putExtra("clName", this.clName);
            intent.putExtra("clPhoto", this.clPhoto);
            intent.putExtra("address", this.address).toString();
            intent.putExtra("issuing_authority", this.issuing_authority).toString();
            intent.putExtra("validity", this.validity).toString();
            intent.putExtra("cl_Status", this.cl_Status).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void X1() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClSots.class);
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
            intent.putExtra("fatherName", this.fatherName);
            intent.putExtra("clName", this.clName);
            intent.putExtra("clPhoto", this.clPhoto);
            intent.putExtra("address", this.address).toString();
            intent.putExtra("issuing_authority", this.issuing_authority).toString();
            intent.putExtra("validity", this.validity).toString();
            intent.putExtra("cl_Status", this.cl_Status).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void Z1(ClFeePayment this$0, String str, String str2, String str3, String str4, long j) {
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
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClFeePayment.C1(string, userAgent, this, dialog, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClFeePayment.B1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void D1(String url) {
        s7 s7Var = this.cBinding;
        s7 s7Var2 = null;
        if (s7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var = null;
        }
        s7Var.B.setVisibility(0);
        s7 s7Var3 = this.cBinding;
        if (s7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var3 = null;
        }
        s7Var3.B.loadUrl(url);
        s7 s7Var4 = this.cBinding;
        if (s7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var4 = null;
        }
        s7Var4.B.getSettings().setJavaScriptEnabled(true);
        s7 s7Var5 = this.cBinding;
        if (s7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var5 = null;
        }
        s7Var5.B.setDownloadListener(new DownloadListener() { // from class: com.zepto.mm0
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                ClFeePayment.E1(this.a, str, str2, str3, str4, j);
            }
        });
        s7 s7Var6 = this.cBinding;
        if (s7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var6 = null;
        }
        s7Var6.B.setWebChromeClient(new b());
        s7 s7Var7 = this.cBinding;
        if (s7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            s7Var2 = s7Var7;
        }
        s7Var2.B.setWebViewClient(new c());
    }

    public final ws6 F1() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final wl5 G1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void I1() {
        im3.b(this).c(this.mMessageReceiver, new IntentFilter("success-payment-event"));
        if (getIntent() != null) {
            s7 s7Var = null;
            try {
                Bundle extras = getIntent().getExtras();
                this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("clName");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.clName = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("fatherName");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.fatherName = stringExtra3;
                this.address = String.valueOf(getIntent().getStringExtra("address"));
                this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
                this.validity = String.valueOf(getIntent().getStringExtra("validity"));
                this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
                String stringExtra4 = getIntent().getStringExtra("clPhoto");
                Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.clPhoto = stringExtra4;
            } catch (Exception unused) {
            }
            s7 s7Var2 = this.cBinding;
            if (s7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                s7Var = s7Var2;
            }
            s7Var.x.g.setText(G1().k());
        }
    }

    public final void L1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            W1();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            V1();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            U1();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            X1();
        } else if (acCd != null && acCd.intValue() == 455) {
            O1("Next process is E-Sign Document");
        }
    }

    public final void Q1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void Y1() {
        s7 s7Var = this.cBinding;
        s7 s7Var2 = null;
        if (s7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var = null;
        }
        s7Var.C.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        s7 s7Var3 = this.cBinding;
        if (s7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var3 = null;
        }
        s7Var3.C.getSettings().setAllowFileAccess(true);
        s7 s7Var4 = this.cBinding;
        if (s7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var4 = null;
        }
        s7Var4.C.getSettings().setAllowContentAccess(true);
        s7 s7Var5 = this.cBinding;
        if (s7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var5 = null;
        }
        s7Var5.C.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        s7 s7Var6 = this.cBinding;
        if (s7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var6 = null;
        }
        s7Var6.C.getSettings().setSupportMultipleWindows(true);
        s7 s7Var7 = this.cBinding;
        if (s7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var7 = null;
        }
        s7Var7.C.getSettings().setJavaScriptEnabled(true);
        s7 s7Var8 = this.cBinding;
        if (s7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var8 = null;
        }
        s7Var8.C.getSettings().setDomStorageEnabled(true);
        s7 s7Var9 = this.cBinding;
        if (s7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var9 = null;
        }
        s7Var9.C.getSettings().setUseWideViewPort(true);
        s7 s7Var10 = this.cBinding;
        if (s7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var10 = null;
        }
        s7Var10.C.getSettings().setLoadWithOverviewMode(true);
        s7 s7Var11 = this.cBinding;
        if (s7Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var11 = null;
        }
        s7Var11.C.getSettings().setBuiltInZoomControls(true);
        s7 s7Var12 = this.cBinding;
        if (s7Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var12 = null;
        }
        s7Var12.C.clearCache(true);
        s7 s7Var13 = this.cBinding;
        if (s7Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var13 = null;
        }
        s7Var13.C.reload();
        s7 s7Var14 = this.cBinding;
        if (s7Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var14 = null;
        }
        s7Var14.C.requestFocus(130);
        s7 s7Var15 = this.cBinding;
        if (s7Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var15 = null;
        }
        s7Var15.C.setDownloadListener(new DownloadListener() { // from class: com.zepto.pm0
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                ClFeePayment.Z1(this.a, str, str2, str3, str4, j);
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
        CookieManager.getInstance().setAcceptCookie(true);
        s7 s7Var16 = this.cBinding;
        if (s7Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var16 = null;
        }
        s7Var16.C.loadUrl(string);
        s7 s7Var17 = this.cBinding;
        if (s7Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var17 = null;
        }
        s7Var17.C.addJavascriptInterface(new a(this), "HtmlViewer");
        s7 s7Var18 = this.cBinding;
        if (s7Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var18 = null;
        }
        s7Var18.C.setWebChromeClient(new g());
        s7 s7Var19 = this.cBinding;
        if (s7Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            s7Var2 = s7Var19;
        }
        s7Var2.C.setWebViewClient(new h());
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        s7 s7VarX = s7.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(s7VarX, "inflate(...)");
        this.cBinding = s7VarX;
        s7 s7Var = null;
        if (s7VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7VarX = null;
        }
        setContentView(s7VarX.m());
        Q1(new wl5(this));
        this.viewModel = (yk1) new z(this).a(yk1.class);
        I1();
        H1();
        Y1();
        J1();
        s7 s7Var2 = this.cBinding;
        if (s7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var2 = null;
        }
        s7Var2.z.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.km0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClFeePayment.M1(this.a, view);
            }
        });
        s7 s7Var3 = this.cBinding;
        if (s7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            s7Var = s7Var3;
        }
        s7Var.x.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClFeePayment.N1(this.a, view);
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
        s7 s7Var = this.cBinding;
        if (s7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var = null;
        }
        if (s7Var.C.canGoBack()) {
            onBackPressed();
            return true;
        }
        S1();
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPause() {
        super.onPause();
        s7 s7Var = this.cBinding;
        s7 s7Var2 = null;
        if (s7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var = null;
        }
        s7Var.B.onPause();
        s7 s7Var3 = this.cBinding;
        if (s7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            s7Var2 = s7Var3;
        }
        s7Var2.B.pauseTimers();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        s7 s7Var = this.cBinding;
        s7 s7Var2 = null;
        if (s7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            s7Var = null;
        }
        s7Var.B.onResume();
        s7 s7Var3 = this.cBinding;
        if (s7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            s7Var2 = s7Var3;
        }
        s7Var2.B.resumeTimers();
    }
}
