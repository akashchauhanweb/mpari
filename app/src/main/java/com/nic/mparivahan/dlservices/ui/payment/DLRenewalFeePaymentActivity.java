package com.nic.mparivahan.dlservices.ui.payment;

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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlLog.DlLogUpdateFee;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import com.zepto.da;
import com.zepto.im3;
import com.zepto.kd1;
import com.zepto.kt6;
import com.zepto.l8;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yk1;
import java.io.Serializable;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u008d\u0001B\t¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0017\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0014J\u0017\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0014J\b\u0010#\u001a\u00020\u0002H\u0014J&\u0010(\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bR\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010.\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010L\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR$\u0010P\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010.\u001a\u0004\bN\u0010E\"\u0004\bO\u0010GR\"\u0010T\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010.\u001a\u0004\bR\u0010E\"\u0004\bS\u0010GR\"\u0010X\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010.\u001a\u0004\bV\u0010E\"\u0004\bW\u0010GR\"\u0010\\\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010.\u001a\u0004\bZ\u0010E\"\u0004\b[\u0010GR\"\u0010`\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010.\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000b0i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR(\u0010t\u001a\b\u0012\u0004\u0012\u00020\u000b0i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010k\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010.R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008e\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/payment/DLRenewalFeePaymentActivity;", "Lcom/zepto/pq;", "", "U1", "T1", "p2", "j2", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "i2", "", "message", "c2", "n2", "l2", "m2", "o2", "url", "I1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Q1", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onDestroy", "acCd", "W1", "(Ljava/lang/Integer;)V", "onPause", "onResume", "oldUrl", "userAgent", "contentDisposition", "mimetype", "F1", "Lcom/zepto/da;", "C", "Lcom/zepto/da;", "mBinding", "D", "Ljava/lang/String;", "mApplNo", "E", "mApplDob", "F", "Z", "isLoaded", "G", "doubleBackToExitPressedOnce", "Lcom/zepto/yk1;", "H", "Lcom/zepto/yk1;", "viewModel", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "I", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "K1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "e2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "J", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "K", "getDob", "setDob", "dob", "L", "getMobile_no", "setMobile_no", "Mobile_no", "M", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "N", "getLastEndorseState", "setLastEndorseState", "lastEndorseState", "O", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "P", "getLastEndorseRTOCode", "setLastEndorseRTOCode", "lastEndorseRTOCode", "Lcom/zepto/ws6;", "Q", "Lcom/zepto/ws6;", "N1", "()Lcom/zepto/ws6;", "setMSessionmanger", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Ljava/util/ArrayList;", "R", "Ljava/util/ArrayList;", "O1", "()Ljava/util/ArrayList;", "g2", "(Ljava/util/ArrayList;)V", "multiListName", "S", "M1", "f2", "listHeaderSteps", "Lcom/zepto/wl5;", "T", "Lcom/zepto/wl5;", "P1", "()Lcom/zepto/wl5;", "h2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/wa3;", "U", "Lcom/zepto/wa3;", "L1", "()Lcom/zepto/wa3;", "setLangSession", "(Lcom/zepto/wa3;)V", "langSession", "V", "applNum", "Landroid/content/BroadcastReceiver;", "W", "Landroid/content/BroadcastReceiver;", "mMessageReceiver", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DLRenewalFeePaymentActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public da mBinding;

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

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String applNum = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
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
                    yk1 yk1Var = DLRenewalFeePaymentActivity.this.viewModel;
                    if (yk1Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        yk1Var = null;
                    }
                    String str3 = DLRenewalFeePaymentActivity.this.applNum;
                    String str4 = DLRenewalFeePaymentActivity.this.mApplDob;
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
            DLRenewalFeePaymentActivity.this.i2(applStatusDetailsItem.getApplFlowStatusList());
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
            da daVar = null;
            DLRenewalFeePaymentActivity.this.applNum = String.valueOf(intent != null ? intent.getStringExtra("applNum") : null);
            String stringExtra = intent != null ? intent.getStringExtra("respCode") : null;
            if (DLRenewalFeePaymentActivity.this.applNum.length() <= 0 || stringExtra == null || stringExtra.length() <= 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(s14.a.y());
            sb.append("PrintConformMob.jsp?applno=");
            String str = DLRenewalFeePaymentActivity.this.mApplNo;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            sb.append(str);
            sb.append("&dob=");
            String str2 = DLRenewalFeePaymentActivity.this.mApplDob;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str2 = null;
            }
            sb.append(str2);
            String string = sb.toString();
            Log.d("newReceiptUrl", string.toString());
            da daVar2 = DLRenewalFeePaymentActivity.this.mBinding;
            if (daVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                daVar = daVar2;
            }
            daVar.D.setVisibility(8);
            DLRenewalFeePaymentActivity.this.I1(string);
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
            DLRenewalFeePaymentActivity.this.isLoaded = true;
            da daVar = DLRenewalFeePaymentActivity.this.mBinding;
            da daVar2 = null;
            if (daVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar = null;
            }
            daVar.E.p();
            da daVar3 = DLRenewalFeePaymentActivity.this.mBinding;
            if (daVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar3 = null;
            }
            daVar3.E.setVisibility(8);
            da daVar4 = DLRenewalFeePaymentActivity.this.mBinding;
            if (daVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar4 = null;
            }
            daVar4.D.setVisibility(0);
            da daVar5 = DLRenewalFeePaymentActivity.this.mBinding;
            if (daVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar5 = null;
            }
            daVar5.D.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            da daVar6 = DLRenewalFeePaymentActivity.this.mBinding;
            if (daVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                daVar2 = daVar6;
            }
            daVar2.D.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            da daVar = DLRenewalFeePaymentActivity.this.mBinding;
            if (daVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar = null;
            }
            daVar.E.o();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            DLRenewalFeePaymentActivity.this.isLoaded = false;
            Log.e("dl-js", ("Got Error! " + error).toString());
            da daVar = DLRenewalFeePaymentActivity.this.mBinding;
            da daVar2 = null;
            if (daVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar = null;
            }
            daVar.E.p();
            da daVar3 = DLRenewalFeePaymentActivity.this.mBinding;
            if (daVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                daVar2 = daVar3;
            }
            daVar2.E.setVisibility(8);
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

    public static final void G1(String url, String userAgent, DLRenewalFeePaymentActivity this$0, Dialog screen16, View view) {
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

    public static final void H1(Dialog screen16, View view) {
        Intrinsics.checkNotNullParameter(screen16, "$screen16");
        screen16.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(String url) {
        da daVar = this.mBinding;
        da daVar2 = null;
        if (daVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar = null;
        }
        daVar.C.setVisibility(0);
        da daVar3 = this.mBinding;
        if (daVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar3 = null;
        }
        daVar3.C.loadUrl(url);
        da daVar4 = this.mBinding;
        if (daVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar4 = null;
        }
        daVar4.C.getSettings().setJavaScriptEnabled(true);
        da daVar5 = this.mBinding;
        if (daVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar5 = null;
        }
        daVar5.C.setDownloadListener(new DownloadListener() { // from class: com.zepto.l91
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                DLRenewalFeePaymentActivity.J1(this.a, str, str2, str3, str4, j);
            }
        });
        da daVar6 = this.mBinding;
        if (daVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar6 = null;
        }
        daVar6.C.setWebChromeClient(new b());
        da daVar7 = this.mBinding;
        if (daVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            daVar2 = daVar7;
        }
        daVar2.C.setWebViewClient(new c());
    }

    public static final void J1(DLRenewalFeePaymentActivity this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            l8.s(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return;
        }
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        this$0.F1(str, str2, str3, str4);
    }

    public static final void R1(DLRenewalFeePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void S1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void T1() {
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new f(new d()));
    }

    private final void U1() {
        im3.b(this).c(this.mMessageReceiver, new IntentFilter("success-payment-event"));
        da daVar = this.mBinding;
        da daVar2 = null;
        if (daVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar = null;
        }
        daVar.x.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.V1(this.a, view);
            }
        });
        wl5 wl5Var = new wl5(this);
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            e2((DldetobjX) serializableExtra);
            String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
            Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRto = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("lastEndorsedState");
            Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseState = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("lastEndorseStateCode");
            Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseStateCode = stringExtra3;
            Serializable serializableExtra2 = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            e2((DldetobjX) serializableExtra2);
            Bundle extras3 = getIntent().getExtras();
            Serializable serializable = extras3 != null ? extras3.getSerializable("dl_st_dl_details_obj") : null;
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            e2((DldetobjX) serializable);
            da daVar3 = this.mBinding;
            if (daVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar3 = null;
            }
            daVar3.x.g.setText(wl5Var.k());
            BioImgObjX bioImgObj = K1().getBioImgObj();
            String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
            if (biPhoto == null || biPhoto.length() == 0) {
                da daVar4 = this.mBinding;
                if (daVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    daVar2 = daVar4;
                }
                daVar2.x.f.setVisibility(4);
                return;
            }
            da daVar5 = this.mBinding;
            if (daVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar5 = null;
            }
            daVar5.x.f.setVisibility(0);
            da daVar6 = this.mBinding;
            if (daVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar6 = null;
            }
            ImageView imageView = daVar6.x.b;
            BioImgObjX bioImgObj2 = K1().getBioImgObj();
            imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
        }
    }

    public static final void V1(DLRenewalFeePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1("Are you sure want to go back?");
    }

    public static final void X1(DLRenewalFeePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Y1(DLRenewalFeePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.K1());
            intent.putExtra("Mobile_no", this$0.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            if (Intrinsics.areEqual(this$0.P1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.O1());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void Z1(DLRenewalFeePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!Intrinsics.areEqual(this$0.P1().b(), VContant.MULTISERVICE_PURPOSE_CODE) || this$0.M1().size() <= 1) {
                return;
            }
            final Dialog dialog = new Dialog(this$0);
            dialog.setContentView(R.layout.layout_multi);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewFindViewById3;
            View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView3 = (TextView) viewFindViewById4;
            ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p91
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DLRenewalFeePaymentActivity.a2(dialog, view2);
                }
            });
            int size = this$0.M1().size();
            String str = "";
            int i = 0;
            String string = "";
            while (i < size) {
                str = str + ((String) this$0.M1().get(i)) + '\n';
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                i++;
                sb.append(i);
                sb.append(".\n");
                string = sb.toString();
            }
            textView2.setText(str);
            textView3.setText(string);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q91
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DLRenewalFeePaymentActivity.b2(dialog, view2);
                }
            });
            Window window2 = dialog.getWindow();
            Intrinsics.checkNotNull(window2);
            window2.setGravity(48);
            window2.setLayout(-2, -2);
            dialog.show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void c2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.d2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void d2(Dialog d2, DLRenewalFeePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(List applFlowStatusList) throws Throwable {
        Integer acCd;
        String str;
        String str2;
        int size = applFlowStatusList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                acCd = null;
                break;
            }
            Object obj = applFlowStatusList.get(i);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i);
                Intrinsics.checkNotNull(obj2);
                acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                break;
            }
            i++;
        }
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
            int i2 = Integer.parseInt(N1().k());
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
        W1(acCd);
    }

    private final void j2() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.k91
            @Override // java.lang.Runnable
            public final void run() {
                DLRenewalFeePaymentActivity.k2(this.c);
            }
        }, 2000L);
    }

    public static final void k2(DLRenewalFeePaymentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void l2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlDocActivity.class);
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
            intent.putExtra("dl_st_dl_details_obj", K1());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", K1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void m2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DLRenewalFeePaymentActivity.class);
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
            intent.putExtra("dl_st_dl_details_obj", K1());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", K1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void n2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlPhotoAndSignatureActivity.class);
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
            intent.putExtra("dl_st_dl_details_obj", K1());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", K1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void o2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlRenewalSlotsActivity.class);
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
            intent.putExtra("dl_st_dl_details_obj", K1());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", K1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void p2() {
        da daVar = this.mBinding;
        da daVar2 = null;
        if (daVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar = null;
        }
        daVar.D.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        da daVar3 = this.mBinding;
        if (daVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar3 = null;
        }
        daVar3.D.getSettings().setAllowFileAccess(true);
        da daVar4 = this.mBinding;
        if (daVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar4 = null;
        }
        daVar4.D.getSettings().setAllowContentAccess(true);
        da daVar5 = this.mBinding;
        if (daVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar5 = null;
        }
        daVar5.D.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        da daVar6 = this.mBinding;
        if (daVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar6 = null;
        }
        daVar6.D.getSettings().setSupportMultipleWindows(true);
        da daVar7 = this.mBinding;
        if (daVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar7 = null;
        }
        daVar7.D.getSettings().setJavaScriptEnabled(true);
        da daVar8 = this.mBinding;
        if (daVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar8 = null;
        }
        daVar8.D.getSettings().setDomStorageEnabled(true);
        da daVar9 = this.mBinding;
        if (daVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar9 = null;
        }
        daVar9.D.getSettings().setUseWideViewPort(true);
        da daVar10 = this.mBinding;
        if (daVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar10 = null;
        }
        daVar10.D.getSettings().setLoadWithOverviewMode(true);
        da daVar11 = this.mBinding;
        if (daVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar11 = null;
        }
        daVar11.D.getSettings().setBuiltInZoomControls(true);
        da daVar12 = this.mBinding;
        if (daVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar12 = null;
        }
        daVar12.D.clearCache(true);
        da daVar13 = this.mBinding;
        if (daVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar13 = null;
        }
        daVar13.D.reload();
        da daVar14 = this.mBinding;
        if (daVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar14 = null;
        }
        daVar14.D.requestFocus(130);
        da daVar15 = this.mBinding;
        if (daVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar15 = null;
        }
        daVar15.D.setDownloadListener(new DownloadListener() { // from class: com.zepto.f91
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                DLRenewalFeePaymentActivity.q2(this.a, str, str2, str3, str4, j);
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
        da daVar16 = this.mBinding;
        if (daVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar16 = null;
        }
        daVar16.D.loadUrl(string);
        da daVar17 = this.mBinding;
        if (daVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar17 = null;
        }
        daVar17.D.addJavascriptInterface(new a(this), "HtmlViewer");
        da daVar18 = this.mBinding;
        if (daVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar18 = null;
        }
        daVar18.D.setWebChromeClient(new g());
        da daVar19 = this.mBinding;
        if (daVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            daVar2 = daVar19;
        }
        daVar2.D.setWebViewClient(new h());
    }

    public static final void q2(DLRenewalFeePaymentActivity this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            l8.s(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    public final void F1(String oldUrl, final String userAgent, String contentDisposition, String mimetype) {
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
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.G1(string, userAgent, this, dialog, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.H1(dialog, view);
            }
        });
        dialog.show();
    }

    public final DldetobjX K1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final wa3 L1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ArrayList M1() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final ws6 N1() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final ArrayList O1() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final wl5 P1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void Q1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText("OK");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.R1(this.a, view);
            }
        });
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.S1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void W1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            n2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            m2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            l2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            o2();
        } else if (acCd != null && acCd.intValue() == 455) {
            c2("Next process is E-Sign Document");
        }
    }

    public final void e2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void f2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void g2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void h2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_renewal_fee_payment);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (da) lq7VarF;
        this.viewModel = (yk1) new z(this).a(yk1.class);
        h2(new wl5(this));
        U1();
        T1();
        p2();
        da daVar = this.mBinding;
        da daVar2 = null;
        if (daVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar = null;
        }
        daVar.A.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.X1(this.a, view);
            }
        });
        if (Intrinsics.areEqual(P1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                g2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                f2((ArrayList) serializableExtra2);
                if (M1().size() == 1) {
                    da daVar3 = this.mBinding;
                    if (daVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        daVar3 = null;
                    }
                    daVar3.A.g.setText((CharSequence) M1().get(0));
                } else {
                    da daVar4 = this.mBinding;
                    if (daVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        daVar4 = null;
                    }
                    TextView textView = daVar4.A.g;
                    String strB = L1().b("dl_services", getString(R.string.dl_services));
                    Intrinsics.checkNotNull(strB);
                    textView.setText(strB);
                    da daVar5 = this.mBinding;
                    if (daVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        daVar5 = null;
                    }
                    TextView textView2 = daVar5.A.g;
                    da daVar6 = this.mBinding;
                    if (daVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        daVar6 = null;
                    }
                    textView2.setPaintFlags(daVar6.A.g.getPaintFlags() | 8);
                }
            } catch (Exception unused) {
            }
        } else {
            da daVar7 = this.mBinding;
            if (daVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                daVar7 = null;
            }
            daVar7.A.g.setText(P1().k());
        }
        da daVar8 = this.mBinding;
        if (daVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar8 = null;
        }
        daVar8.A.h.setVisibility(8);
        da daVar9 = this.mBinding;
        if (daVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar9 = null;
        }
        daVar9.A.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.Y1(this.a, view);
            }
        });
        da daVar10 = this.mBinding;
        if (daVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            daVar2 = daVar10;
        }
        daVar2.A.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLRenewalFeePaymentActivity.Z1(this.a, view);
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
        da daVar = this.mBinding;
        if (daVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar = null;
        }
        if (daVar.D.canGoBack()) {
            onBackPressed();
            return true;
        }
        j2();
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPause() {
        super.onPause();
        da daVar = this.mBinding;
        da daVar2 = null;
        if (daVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar = null;
        }
        daVar.C.onPause();
        da daVar3 = this.mBinding;
        if (daVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            daVar2 = daVar3;
        }
        daVar2.C.pauseTimers();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        da daVar = this.mBinding;
        da daVar2 = null;
        if (daVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            daVar = null;
        }
        daVar.C.onResume();
        da daVar3 = this.mBinding;
        if (daVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            daVar2 = daVar3;
        }
        daVar2.C.resumeTimers();
    }
}
