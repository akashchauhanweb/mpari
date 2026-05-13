package com.nic.mparivahan.VahanServices.eSign;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.DocUpdateLogs;
import com.nic.mparivahan.VahanServices.VahanLog.VahanLogUpdateDoc;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanFaceLessConfirmation;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.nic.mparivahan.VahanServices.eSign.eSignDMS;
import com.zepto.cc1;
import com.zepto.dc1;
import com.zepto.hz0;
import com.zepto.j42;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qs1;
import com.zepto.rw4;
import com.zepto.wa3;
import com.zepto.yy0;
import java.io.Serializable;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 Á\u00012\u00020\u0001:\u0004Â\u0001Ã\u0001B\t¢\u0006\u0006\b¿\u0001\u0010À\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003J\b\u0010\t\u001a\u00020\u0002H\u0003J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\"\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0015J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J/\u0010#\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0002R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\"\u0010S\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR\"\u0010W\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010F\u001a\u0004\bU\u0010H\"\u0004\bV\u0010JR\"\u0010[\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010F\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010JR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010\u0081\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b|\u0010L\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0087\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0082\u0001\u0010+\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R&\u0010\u008b\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010F\u001a\u0005\b\u0089\u0001\u0010H\"\u0005\b\u008a\u0001\u0010JR*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R&\u0010\u0097\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010F\u001a\u0005\b\u0095\u0001\u0010H\"\u0005\b\u0096\u0001\u0010JR&\u0010\u009b\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010F\u001a\u0005\b\u0099\u0001\u0010H\"\u0005\b\u009a\u0001\u0010JR&\u0010\u009f\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010F\u001a\u0005\b\u009d\u0001\u0010H\"\u0005\b\u009e\u0001\u0010JR)\u0010¦\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b¡\u0001\u0010*\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R&\u0010ª\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010F\u001a\u0005\b¨\u0001\u0010H\"\u0005\b©\u0001\u0010JR%\u0010\u00ad\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b+\u0010F\u001a\u0005\b«\u0001\u0010H\"\u0005\b¬\u0001\u0010JR*\u0010µ\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R9\u0010¾\u0001\u001a\u0012\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030·\u00010\u001f\u0018\u00010¶\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001¨\u0006Ä\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/eSign/eSignDMS;", "Lcom/zepto/pq;", "", "v1", "Landroid/content/Context;", "context", "", "it", "U1", "O1", "s2", "", "visible", "j2", "w1", "", "requestCode", "resultCode", "Landroid/content/Intent;", "intent", "onActivityResult", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "message", "X1", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "u1", "Lcom/zepto/rw4;", "C", "Lcom/zepto/rw4;", "progress", "D", "Z", "isLoaded", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "E1", "()Landroid/app/ProgressDialog;", "h2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "F", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "K1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "o2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "slotService", "Lcom/zepto/ld7;", "G", "Lcom/zepto/ld7;", "L1", "()Lcom/zepto/ld7;", "p2", "(Lcom/zepto/ld7;)V", "slotViewModel", "H", "Ljava/lang/String;", "M1", "()Ljava/lang/String;", "q2", "(Ljava/lang/String;)V", "state_code", "I", "z1", "b2", "appl_no", "J", "H1", "l2", "rc_no", "K", "G1", "k2", VContant.PURPOSE_CODE, "L", "D1", "g2", "offCd", "Lcom/zepto/qs1;", "M", "Lcom/zepto/qs1;", "getDmsViewModle", "()Lcom/zepto/qs1;", "e2", "(Lcom/zepto/qs1;)V", "dmsViewModle", "Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "N", "Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "B1", "()Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "d2", "(Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;)V", "dmsService", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "O", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "F1", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "i2", "(Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;)V", "paymentRequest", "Lcom/zepto/j42;", "P", "Lcom/zepto/j42;", "A1", "()Lcom/zepto/j42;", "c2", "(Lcom/zepto/j42;)V", "binding", "Q", "getPosition", "()I", "setPosition", "(I)V", "position", "R", "Q1", "()Z", "setFaceless", "(Z)V", "isFaceless", "S", "I1", "m2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "T", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "J1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "n2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "U", "y1", "a2", "aadhar_name", "V", "x1", "Z1", "aadhar_address", "W", "getVahlogReptDate", "setVahlogReptDate", "vahlogReptDate", "", "X", "getVahlogFeeAmt", "()D", "setVahlogFeeAmt", "(D)V", "vahlogFeeAmt", "Y", "getVahlogReptNo", "setVahlogReptNo", "vahlogReptNo", "getPaymentUrl", "setPaymentUrl", "paymentUrl", "Lcom/zepto/wa3;", "a0", "Lcom/zepto/wa3;", "C1", "()Lcom/zepto/wa3;", "f2", "(Lcom/zepto/wa3;)V", "languageKeySession", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "b0", "Landroid/webkit/ValueCallback;", "N1", "()Landroid/webkit/ValueCallback;", "r2", "(Landroid/webkit/ValueCallback;)V", "uploadMessage", "<init>", "()V", "c0", "a", "b", "app_release"}, k = 1, mv = {1, 9, 0})
public final class eSignDMS extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VahanProService slotService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ld7 slotViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String appl_no;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String rc_no;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String offCd;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public qs1 dmsViewModle;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public DMSService dmsService;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public BeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public j42 binding;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public double vahlogFeeAmt;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ValueCallback uploadMessage;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int position = -1;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String vahlogReptDate = " ";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String vahlogReptNo = " ";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String paymentUrl = "";

    public static final class b {
        public final eSignDMS a;

        public b(eSignDMS ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            this.a = ctx;
        }

        @JavascriptInterface
        public final void showHTML(String str) throws Throwable {
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
            if (jSONObject == null || !jSONObject.has("respCode") || (string = jSONObject.getString("respCode")) == null || string.length() == 0 || !StringsKt__StringsJVMKt.equals(string, VContant.MAINSCREEN, true)) {
                return;
            }
            this.a.u1();
        }
    }

    public static final class c extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public static final class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            eSignDMS.this.isLoaded = true;
            eSignDMS.this.j2(false);
            eSignDMS.this.A1().d.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            rw4 rw4Var = eSignDMS.this.progress;
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
            eSignDMS.this.isLoaded = false;
            eSignDMS.this.j2(false);
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

    public static final class e extends WebChromeClient {
        public e() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView mWebView, ValueCallback filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(mWebView, "mWebView");
            Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
            Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
            if (eSignDMS.this.getUploadMessage() != null) {
                ValueCallback uploadMessage = eSignDMS.this.getUploadMessage();
                Intrinsics.checkNotNull(uploadMessage);
                uploadMessage.onReceiveValue(null);
                eSignDMS.this.r2(null);
            }
            eSignDMS.this.r2(filePathCallback);
            Intent intentCreateIntent = fileChooserParams.createIntent();
            try {
                eSignDMS esigndms = eSignDMS.this;
                Intrinsics.checkNotNull(intentCreateIntent);
                esigndms.startActivityForResult(intentCreateIntent, 100);
                return true;
            } catch (ActivityNotFoundException unused) {
                eSignDMS.this.r2(null);
                return false;
            }
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            try {
                if (finalRequestSubmitResponse == null) {
                    if (eSignDMS.this.E1().isShowing()) {
                        eSignDMS.this.E1().dismiss();
                    }
                    eSignDMS esigndms = eSignDMS.this;
                    esigndms.X1(esigndms, esigndms.C1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                    return;
                }
                if (!finalRequestSubmitResponse.getApplication_status()) {
                    if (eSignDMS.this.E1().isShowing()) {
                        eSignDMS.this.E1().dismiss();
                    }
                    eSignDMS esigndms2 = eSignDMS.this;
                    esigndms2.X1(esigndms2, esigndms2.C1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                    return;
                }
                if (!eSignDMS.this.getIsFaceless()) {
                    eSignDMS.this.v1();
                    return;
                }
                Intent intent = new Intent(eSignDMS.this, (Class<?>) VahanFaceLessConfirmation.class);
                intent.putExtra("state_code", eSignDMS.this.M1());
                intent.putExtra("rc_number", eSignDMS.this.H1());
                intent.putExtra(VContant.APP_NO, eSignDMS.this.z1());
                intent.putExtra(VContant.PURPOSE_CODE, eSignDMS.this.G1());
                eSignDMS.this.startActivity(intent);
                eSignDMS.this.finish();
            } catch (Exception unused) {
                if (eSignDMS.this.E1().isShowing()) {
                    eSignDMS.this.E1().dismiss();
                    eSignDMS esigndms3 = eSignDMS.this;
                    esigndms3.X1(esigndms3, esigndms3.C1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FinalRequestSubmitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(String str) {
            if (eSignDMS.this.E1().isShowing()) {
                eSignDMS.this.E1().dismiss();
                eSignDMS esigndms = eSignDMS.this;
                esigndms.X1(esigndms, esigndms.C1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
            }
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(SlotUserDataModel slotUserDataModel) {
            try {
                if (eSignDMS.this.E1().isShowing()) {
                    eSignDMS.this.E1().dismiss();
                }
                Intent intent = new Intent(eSignDMS.this, (Class<?>) SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", eSignDMS.this.G1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", eSignDMS.this.I1());
                intent.putExtra("RcDetails", eSignDMS.this.J1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, eSignDMS.this.getIsFaceless());
                intent.putExtra(VContant.NEXGEN_addahar_name, eSignDMS.this.y1());
                intent.putExtra(VContant.NEXGEN_addahar_address, eSignDMS.this.x1());
                eSignDMS.this.startActivity(intent);
                eSignDMS.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SlotUserDataModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                if (eSignDMS.this.E1().isShowing()) {
                    eSignDMS.this.E1().dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(str, "Internet Issue", true)) {
                    eSignDMS esigndms = eSignDMS.this;
                    Toast.makeText(esigndms, esigndms.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                    eSignDMS esigndms2 = eSignDMS.this;
                    esigndms2.U1(esigndms2, str);
                    return;
                }
                eSignDMS esigndms3 = eSignDMS.this;
                esigndms3.U1(esigndms3, esigndms3.getString(R.string.service_unavable_please_try));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class j implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public j(Function1 function) {
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

    private final void O1() {
        A1().b.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eSignDMS.P1(this.a, view);
            }
        });
        A1().d.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        A1().d.getSettings().setAllowFileAccess(true);
        A1().d.getSettings().setAllowContentAccess(true);
        A1().d.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        A1().d.getSettings().setJavaScriptEnabled(true);
        A1().d.getSettings().setDomStorageEnabled(true);
        A1().d.getSettings().setUseWideViewPort(true);
        A1().d.getSettings().setLoadWithOverviewMode(true);
        A1().d.getSettings().setBuiltInZoomControls(true);
        A1().d.getSettings().setSupportMultipleWindows(true);
        A1().d.clearCache(true);
        A1().d.reload();
        A1().d.requestFocus(130);
        String str = this.paymentUrl;
        CookieManager.getInstance().setAcceptCookie(true);
        Log.e("URL", str);
        A1().d.getSettings().setJavaScriptEnabled(true);
        A1().d.loadUrl(str);
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) || StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
            A1().d.addJavascriptInterface(new b(this), "HtmlViewer");
        } else {
            A1().d.addJavascriptInterface(new b(this), "HtmlViewer");
        }
        A1().d.setWebChromeClient(new c());
        A1().d.setWebViewClient(new d());
        A1().d.setWebChromeClient(new e());
    }

    public static final void P1(eSignDMS this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.A1().d.canGoBack()) {
            this$0.A1().d.goBack();
        } else {
            this$0.s2();
        }
    }

    public static final void R1(eSignDMS this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.I1());
        intent.putExtra("RcDetails", this$0.J1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.y1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.x1());
        this$0.startActivity(intent);
    }

    public static final void S1(eSignDMS this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.C1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void T1(eSignDMS this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.I1());
        intent.putExtra("RcDetails", this$0.J1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.y1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.x1());
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1(Context context, String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eSignDMS.V1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eSignDMS.W1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void W1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void Y1(Dialog d2, eSignDMS this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) eSignDMS.class);
        intent.putExtra("state_code", this$0.M1());
        intent.putExtra(VContant.APP_NO, this$0.z1());
        intent.putExtra("rc_number", this$0.H1());
        intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
        intent.putExtra("off_code", this$0.D1());
        intent.putExtra(VContant.FINAL_SUBMIT, this$0.F1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra("RC", this$0.I1());
        intent.putExtra("RcDetails", this$0.J1());
        intent.putExtra("vahlogReptDate", this$0.vahlogReptDate);
        intent.putExtra("vahlogFeeAmt", this$0.vahlogFeeAmt);
        intent.putExtra("vahlogReptNo", this$0.vahlogReptNo);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.y1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.x1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2(boolean visible) {
        if (visible) {
            return;
        }
        try {
            rw4 rw4Var = this.progress;
            if (rw4Var != null) {
                rw4Var.a();
            }
        } catch (WindowManager.BadTokenException e2) {
            e2.printStackTrace();
            Log.e("Error", Unit.INSTANCE.toString());
        }
    }

    private final void s2() {
        VUtility.INSTANCE.y(this, C1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1() {
        try {
            L1().m(this, z1());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void w1() {
        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
        if (checkSelfPermission(str) == -1) {
            requestPermissions(new String[]{str}, 5001);
        }
    }

    public final j42 A1() {
        j42 j42Var = this.binding;
        if (j42Var != null) {
            return j42Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DMSService B1() {
        DMSService dMSService = this.dmsService;
        if (dMSService != null) {
            return dMSService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dmsService");
        return null;
    }

    public final wa3 C1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String D1() {
        String str = this.offCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("offCd");
        return null;
    }

    public final ProgressDialog E1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final BeforePaymentRequest F1() {
        BeforePaymentRequest beforePaymentRequest = this.paymentRequest;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final String G1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }

    public final String H1() {
        String str = this.rc_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_no");
        return null;
    }

    public final String I1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails J1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService K1() {
        VahanProService vahanProService = this.slotService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotService");
        return null;
    }

    public final ld7 L1() {
        ld7 ld7Var = this.slotViewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotViewModel");
        return null;
    }

    public final String M1() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final ValueCallback getUploadMessage() {
        return this.uploadMessage;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void X1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validate_pop_up_for_document);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eSignDMS.Y1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appl_no = str;
    }

    public final void c2(j42 j42Var) {
        Intrinsics.checkNotNullParameter(j42Var, "<set-?>");
        this.binding = j42Var;
    }

    public final void d2(DMSService dMSService) {
        Intrinsics.checkNotNullParameter(dMSService, "<set-?>");
        this.dmsService = dMSService;
    }

    public final void e2(qs1 qs1Var) {
        Intrinsics.checkNotNullParameter(qs1Var, "<set-?>");
        this.dmsViewModle = qs1Var;
    }

    public final void f2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.offCd = str;
    }

    public final void h2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void i2(BeforePaymentRequest beforePaymentRequest) {
        Intrinsics.checkNotNullParameter(beforePaymentRequest, "<set-?>");
        this.paymentRequest = beforePaymentRequest;
    }

    public final void k2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void l2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_no = str;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void n2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void o2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.slotService = vahanProService;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        ValueCallback valueCallback;
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode != 100 || (valueCallback = this.uploadMessage) == null) {
            return;
        }
        Intrinsics.checkNotNull(valueCallback);
        valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(resultCode, intent));
        this.uploadMessage = null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        VUtility.INSTANCE.y(this, C1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esign_dms);
        j42 j42VarC = j42.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(j42VarC, "inflate(...)");
        c2(j42VarC);
        setContentView(A1().b());
        f2(new wa3(this));
        o2(VahanProService.INSTANCE.a(this));
        d2(DMSService.INSTANCE.a(this));
        this.paymentUrl = String.valueOf(getIntent().getStringExtra("URL"));
        String stringExtra = getIntent().getStringExtra("state_code");
        Intrinsics.checkNotNull(stringExtra);
        q2(stringExtra);
        String stringExtra2 = getIntent().getStringExtra(VContant.APP_NO);
        Intrinsics.checkNotNull(stringExtra2);
        b2(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra("rc_number");
        Intrinsics.checkNotNull(stringExtra3);
        l2(stringExtra3);
        String stringExtra4 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
        Intrinsics.checkNotNull(stringExtra4);
        k2(stringExtra4);
        String stringExtra5 = getIntent().getStringExtra("off_code");
        Intrinsics.checkNotNull(stringExtra5);
        g2(stringExtra5);
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest");
        i2((BeforePaymentRequest) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        a2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        Z1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        m2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        n2((NrvDetails) serializableExtra2);
        this.vahlogReptDate = String.valueOf(getIntent().getStringExtra("vahlogReptDate"));
        this.vahlogFeeAmt = getIntent().getDoubleExtra("vahlogFeeAmt", 0.0d);
        this.vahlogReptNo = String.valueOf(getIntent().getStringExtra("vahlogReptNo"));
        h2(new ProgressDialog(this));
        E1().setMessage("Please wait...");
        E1().setCancelable(false);
        E1().setCanceledOnTouchOutside(false);
        O1();
        A1().e.setText(C1().b("vehicle_no", "Vehicle No.:") + ' ' + I1());
        A1().f.setText(C1().b("view_vehicle_details", "View Vehicle Details"));
        A1().f.setPaintFlags(A1().f.getPaintFlags() | 8);
        A1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eSignDMS.R1(this.a, view);
            }
        });
        A1().b.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eSignDMS.S1(this.a, view);
            }
        });
        p2((ld7) new z(this, new kd7(new jd7(K1()))).a(ld7.class));
        e2((qs1) new z(this, new dc1(new cc1(B1()))).a(qs1.class));
        try {
            A1().b.g.setText(VContant.INSTANCE.L(this, G1()));
            A1().f.setText(C1().b("view_vehicle_details", "View Vehicle Details"));
            A1().f.setPaintFlags(A1().f.getPaintFlags() | 8);
            A1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eSignDMS.T1(this.a, view);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        L1().V().g(this, new j(new f()));
        L1().W().g(this, new j(new g()));
        L1().Y0().g(this, new j(new h()));
        L1().X0().g(this, new j(new i()));
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        if (A1().d.canGoBack()) {
            onBackPressed();
            return true;
        }
        s2();
        return true;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 5001) {
            if (!(!(grantResults.length == 0)) || grantResults[0] == 0) {
                return;
            }
            Toast.makeText(this, "Please grant permission to proceed", 0).show();
            w1();
        }
    }

    public final void p2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.slotViewModel = ld7Var;
    }

    public final void q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final void r2(ValueCallback valueCallback) {
        this.uploadMessage = valueCallback;
    }

    public final void u1() throws Throwable {
        try {
            String.valueOf(System.currentTimeMillis());
            String str = this.vahlogReptDate;
            String str2 = this.vahlogReptNo;
            double d2 = this.vahlogFeeAmt;
            String strZ1 = z1();
            String strI1 = I1();
            hz0.a aVar = hz0.a;
            VahanLogUpdateDoc.INSTANCE.a(this, new DocUpdateLogs(str, str, str2, d2, strZ1, strI1, aVar.r(), aVar.r()));
        } catch (Exception e2) {
            e2.toString();
        }
        E1().show();
        L1().y1(new BeforePaymentRequestfinal(F1().getAadharauth(), z1(), F1().getChanngeOfAdressDto(), F1().getComp_cd(), F1().getDurcdto(), F1().getFir_dt(), F1().getFir_no(), F1().getHpaDto(), F1().getHptDto(), F1().getIdv(), String.valueOf(F1().getIns_from()), F1().getIns_type(), String.valueOf(F1().getIns_upto()), F1().getMsg().toString(), F1().getNocDto(), F1().getOff_cd().toString(), F1().getOp_dt().toString(), F1().getPolice_station().toString(), F1().getPolicy_no().toString(), F1().getPur_cd().toString(), this.vahlogReptDate, this.vahlogReptNo, String.valueOf(this.vahlogFeeAmt), F1().getReason(), F1().getRegn_no().toString(), F1().getState_cd().toString(), F1().getState_header().toString(), F1().getStatus().toString(), F1().getTax_mode().toString(), F1().getVh_class()));
    }

    public final String x1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String y1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final String z1() {
        String str = this.appl_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appl_no");
        return null;
    }
}
