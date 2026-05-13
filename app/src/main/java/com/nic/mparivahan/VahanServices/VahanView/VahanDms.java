package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DmsUrlModle;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanXmlService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanDms;
import com.zepto.cl7;
import com.zepto.cm7;
import com.zepto.dm7;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.pq;
import com.zepto.rw4;
import com.zepto.yy0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ³\u00012\u00020\u0001:\u0004´\u0001µ\u0001B\t¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0003J\b\u0010\u0007\u001a\u00020\u0004H\u0003J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0003J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0006\u0010\u0014\u001a\u00020\u0004J/\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010R\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010\"\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010\"\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010Z\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010\"\u001a\u0004\bX\u0010O\"\u0004\bY\u0010QR\"\u0010^\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\"\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010QR\"\u0010b\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010\"\u001a\u0004\b`\u0010O\"\u0004\ba\u0010QR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u009f\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009c\u00010\u00170\u009b\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010§\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R:\u0010°\u0001\u001a\u0014\u0012\u000f\u0012\r ª\u0001*\u0005\u0018\u00010©\u00010©\u00010¨\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b-\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001¨\u0006¶\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanDms;", "Lcom/zepto/pq;", "", "it", "", "Y1", "Q1", "S1", "", "visible", "j2", "R1", "X1", "z1", "y1", "x1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "d2", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/Context;", "context", "message", "b2", "C", "Ljava/lang/String;", "printUrl", "Landroid/webkit/WebView;", "D", "Landroid/webkit/WebView;", "webView", "Lcom/zepto/rw4;", "E", "Lcom/zepto/rw4;", "progress", "F", "Z", "isLoaded", "Landroidx/appcompat/widget/AppCompatImageView;", "G", "Landroidx/appcompat/widget/AppCompatImageView;", "mvvm_back", "Landroid/widget/RelativeLayout;", "H", "Landroid/widget/RelativeLayout;", "nexGenHolder", "Lcom/zepto/dm7;", "I", "Lcom/zepto/dm7;", "P1", "()Lcom/zepto/dm7;", "p2", "(Lcom/zepto/dm7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanXmlService;", "J", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanXmlService;", "getRetrofitService", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanXmlService;", "retrofitService", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "I1", "()Landroid/app/ProgressDialog;", "h2", "(Landroid/app/ProgressDialog;)V", "pDialog", "L", "O1", "()Ljava/lang/String;", "o2", "(Ljava/lang/String;)V", "state_code", "M", "A1", "e2", "appl_no", "N", "L1", "l2", "rc_no", "O", "K1", "k2", VContant.PURPOSE_CODE, "P", "H1", "g2", "offCd", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "setConfirm_details", "(Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;)V", "confirm_details", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "R", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "G1", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "setHptObject", "(Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;)V", "hptObject", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "S", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "F1", "()Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "setHpaObject", "(Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;)V", "hpaObject", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "T", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "C1", "()Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "setDuplicate_RC", "(Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;)V", "duplicate_RC", "Lcom/zepto/ld7;", "U", "Lcom/zepto/ld7;", "N1", "()Lcom/zepto/ld7;", "n2", "(Lcom/zepto/ld7;)V", "slotViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "V", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "M1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "m2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "slotService", "Landroid/widget/LinearLayout;", "W", "Landroid/widget/LinearLayout;", "getNext_button", "()Landroid/widget/LinearLayout;", "f2", "(Landroid/widget/LinearLayout;)V", "next_button", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "X", "Landroid/webkit/ValueCallback;", "fileCallbackUri", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "Y", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "J1", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "i2", "(Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;)V", "paymentRequest", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Lcom/zepto/of;", "E1", "()Lcom/zepto/of;", "setGetFileLauncher", "(Lcom/zepto/of;)V", "getFileLauncher", "<init>", "()V", "a0", "a", "b", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanDms.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanDms.kt\ncom/nic/mparivahan/VahanServices/VahanView/VahanDms\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,640:1\n1#2:641\n*E\n"})
public final class VahanDms extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String printUrl;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public WebView webView;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public AppCompatImageView mvvm_back;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public RelativeLayout nexGenHolder;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public dm7 viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final VahanXmlService retrofitService = VahanXmlService.INSTANCE.a();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String appl_no;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String rc_no;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String offCd;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ChaangeOfAddressStatus confirm_details;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public HptTerResponse hptObject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public HPAResModle hpaObject;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public dulicateRcResponseModle duplicate_RC;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ld7 slotViewModel;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public VahanProService slotService;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public LinearLayout next_button;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ValueCallback fileCallbackUri;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public BeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public of getFileLauncher;

    public static final class b {
        public final VahanDms a;

        public b(VahanDms ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            this.a = ctx;
        }

        public static final void b(b this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.a.x1();
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject(String.valueOf(str));
                if (jSONObject.has("applNo") && (string = jSONObject.getString("applNo")) != null && string.length() != 0) {
                    try {
                        this.a.runOnUiThread(new Runnable() { // from class: com.zepto.w07
                            @Override // java.lang.Runnable
                            public final void run() {
                                VahanDms.b.b(this.c);
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            VahanDms.this.isLoaded = true;
            VahanDms.this.j2(false);
            WebView webView2 = VahanDms.this.webView;
            WebView webView3 = null;
            if (webView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                webView2 = null;
            }
            webView2.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            WebView webView4 = VahanDms.this.webView;
            if (webView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                webView3 = webView4;
            }
            webView3.loadUrl("javascript:HtmlViewer");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            VahanDms.this.j2(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            VahanDms.this.isLoaded = false;
            Objects.toString(error);
            VahanDms.this.j2(false);
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

    public static final class d extends WebChromeClient {
        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
            Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
            VahanDms.this.fileCallbackUri = filePathCallback;
            VahanDms.this.getGetFileLauncher().a(fileChooserParams.createIntent());
            return true;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(SlotUserDataModel slotUserDataModel) {
            try {
                if (VahanDms.this.I1().isShowing()) {
                    VahanDms.this.I1().dismiss();
                }
                Intent intent = new Intent(VahanDms.this, (Class<?>) SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", VahanDms.this.K1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                VahanDms.this.startActivity(intent);
                VahanDms.this.finish();
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

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                if (VahanDms.this.I1().isShowing()) {
                    VahanDms.this.I1().dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(str, "Internet Issue", true)) {
                    VahanDms.this.Y1(str);
                } else {
                    VahanDms vahanDms = VahanDms.this;
                    Toast.makeText(vahanDms, vahanDms.getString(R.string.no_internet), 0).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
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
                    if (VahanDms.this.I1().isShowing()) {
                        VahanDms.this.I1().dismiss();
                    }
                    VahanDms vahanDms = VahanDms.this;
                    vahanDms.b2(vahanDms, "Please Upload all the Required Documents then You will be able to do Final Submission of Application.");
                    return;
                }
                if (finalRequestSubmitResponse.getApplication_status()) {
                    VahanDms.this.y1();
                    return;
                }
                if (VahanDms.this.I1().isShowing()) {
                    VahanDms.this.I1().dismiss();
                }
                VahanDms vahanDms2 = VahanDms.this;
                vahanDms2.b2(vahanDms2, "Please Upload all the Required Documents then You will be able to do Final Submission of Application.");
            } catch (Exception unused) {
                if (VahanDms.this.I1().isShowing()) {
                    VahanDms.this.I1().dismiss();
                    VahanDms vahanDms3 = VahanDms.this;
                    vahanDms3.b2(vahanDms3, "Please Upload all the Required Documents then You will be able to do Final Submission of Application.");
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FinalRequestSubmitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
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
            if (VahanDms.this.I1().isShowing()) {
                VahanDms.this.I1().dismiss();
                VahanDms vahanDms = VahanDms.this;
                vahanDms.b2(vahanDms, "Please Upload all the Required Documents then You will be able to do Final Submission of Application.");
            }
        }
    }

    public static final class i implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public i(Function1 function) {
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

    public VahanDms() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.o07
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanDms.D1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.getFileLauncher = ofVarB0;
    }

    public static final void D1(VahanDms this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ValueCallback valueCallback = null;
        if (gfVar.d() != -1) {
            if (gfVar.d() == 0) {
                ValueCallback valueCallback2 = this$0.fileCallbackUri;
                if (valueCallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fileCallbackUri");
                    valueCallback2 = null;
                }
                valueCallback2.onReceiveValue(null);
                return;
            }
            ValueCallback valueCallback3 = this$0.fileCallbackUri;
            if (valueCallback3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCallbackUri");
                valueCallback3 = null;
            }
            valueCallback3.onReceiveValue(null);
            return;
        }
        Intent intentC = gfVar.c();
        Uri data = intentC != null ? intentC.getData() : null;
        if (data != null) {
            ValueCallback valueCallback4 = this$0.fileCallbackUri;
            if (valueCallback4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCallbackUri");
            } else {
                valueCallback = valueCallback4;
            }
            valueCallback.onReceiveValue(new Uri[]{data});
            return;
        }
        ValueCallback valueCallback5 = this$0.fileCallbackUri;
        if (valueCallback5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fileCallbackUri");
            valueCallback5 = null;
        }
        valueCallback5.onReceiveValue(null);
    }

    private final void Q1() {
        WebView webView = this.webView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.webView;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView3 = null;
        }
        webView3.getSettings().setLoadWithOverviewMode(true);
        WebView webView4 = this.webView;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView4 = null;
        }
        webView4.getSettings().setUseWideViewPort(true);
        WebView webView5 = this.webView;
        if (webView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView5 = null;
        }
        webView5.getSettings().setDomStorageEnabled(true);
        WebView webView6 = this.webView;
        if (webView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView6 = null;
        }
        webView6.getSettings().setAllowFileAccess(true);
        WebView webView7 = this.webView;
        if (webView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView7 = null;
        }
        webView7.getSettings().setAllowContentAccess(true);
        WebView webView8 = this.webView;
        if (webView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView8 = null;
        }
        webView8.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebView webView9 = this.webView;
        if (webView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView9 = null;
        }
        webView9.requestFocus(130);
        WebView webView10 = this.webView;
        if (webView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView10 = null;
        }
        webView10.reload();
        WebView webView11 = this.webView;
        if (webView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            webView2 = webView11;
        }
        webView2.setInitialScale(1);
        if (R1() && R1() && !this.isLoaded) {
            S1();
        }
    }

    private final boolean R1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(0)) {
                Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR");
                return true;
            }
            if (networkCapabilities.hasTransport(1)) {
                Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI");
                return true;
            }
            if (networkCapabilities.hasTransport(3)) {
                Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET");
                return true;
            }
        }
        return false;
    }

    private final void S1() {
        WebView webView = this.webView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        String str = this.printUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("printUrl");
            str = null;
        }
        webView.loadUrl(str);
        WebView webView3 = this.webView;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView3 = null;
        }
        webView3.addJavascriptInterface(new b(this), "HtmlViewer");
        WebView webView4 = this.webView;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView4 = null;
        }
        webView4.setWebViewClient(new c());
        WebView webView5 = this.webView;
        if (webView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            webView2 = webView5;
        }
        webView2.setWebChromeClient(new d());
    }

    public static final void T1(VahanDms this$0, DmsUrlModle dmsUrlModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1().dismiss();
        this$0.printUrl = StringsKt__StringsKt.trim((CharSequence) dmsUrlModle.getUrlDocUpload().toString()).toString();
        this$0.Q1();
    }

    public static final void U1(VahanDms this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1().dismiss();
        this$0.d2();
    }

    public static final void V1(VahanDms this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, "Are you sure you want to leave?");
    }

    public static final void W1(VahanDms this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X1();
    }

    private final void X1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(String it) {
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
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDms.Z1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDms.a2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void a2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void c2(Dialog d2, VahanDms this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) VahanDms.class);
        intent.putExtra("state_code", this$0.O1());
        intent.putExtra(VContant.APP_NO, this$0.A1());
        intent.putExtra("rc_number", this$0.L1());
        intent.putExtra(VContant.PURPOSE_CODE, this$0.K1());
        intent.putExtra("off_code", this$0.H1());
        intent.putExtra(VContant.FINAL_SUBMIT, this$0.J1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2(boolean visible) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1() {
        try {
            N1().m(this, A1());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void z1() {
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5001);
        }
    }

    public final String A1() {
        String str = this.appl_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appl_no");
        return null;
    }

    public final ChaangeOfAddressStatus B1() {
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.confirm_details;
        if (chaangeOfAddressStatus != null) {
            return chaangeOfAddressStatus;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirm_details");
        return null;
    }

    public final dulicateRcResponseModle C1() {
        dulicateRcResponseModle dulicatercresponsemodle = this.duplicate_RC;
        if (dulicatercresponsemodle != null) {
            return dulicatercresponsemodle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duplicate_RC");
        return null;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final of getGetFileLauncher() {
        return this.getFileLauncher;
    }

    public final HPAResModle F1() {
        HPAResModle hPAResModle = this.hpaObject;
        if (hPAResModle != null) {
            return hPAResModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hpaObject");
        return null;
    }

    public final HptTerResponse G1() {
        HptTerResponse hptTerResponse = this.hptObject;
        if (hptTerResponse != null) {
            return hptTerResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hptObject");
        return null;
    }

    public final String H1() {
        String str = this.offCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("offCd");
        return null;
    }

    public final ProgressDialog I1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final BeforePaymentRequest J1() {
        BeforePaymentRequest beforePaymentRequest = this.paymentRequest;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final String K1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }

    public final String L1() {
        String str = this.rc_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_no");
        return null;
    }

    public final VahanProService M1() {
        VahanProService vahanProService = this.slotService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotService");
        return null;
    }

    public final ld7 N1() {
        ld7 ld7Var = this.slotViewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotViewModel");
        return null;
    }

    public final String O1() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final dm7 P1() {
        dm7 dm7Var = this.viewModel;
        if (dm7Var != null) {
            return dm7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void b2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDms.c2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void d2() {
        Intent intent = new Intent(this, (Class<?>) FeesDetailsScreen.class);
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHICATION_TERMINATION_CODE);
            intent.putExtra(VContant.HYPOTHICATION_TERMINATION_CODE, G1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHECATION_ADDITION_CODE);
            intent.putExtra(VContant.HYPOTHECATION_ADDITION_CODE, F1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_RC_CODE, true)) {
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_RC_CODE);
            intent.putExtra(VContant.DUPLICATE_RC_CODE, C1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.CHANGE_OF_ADDRESS_CODE);
            intent.putExtra("COV", B1());
        }
        intent.putExtra(VContant.APP_NO, A1());
        intent.putExtra("state_code", O1());
        intent.putExtra("rc_number", L1());
        intent.putExtra(VContant.PURPOSE_CODE, K1());
        startActivity(intent);
        finish();
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appl_no = str;
    }

    public final void f2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.next_button = linearLayout;
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

    public final void m2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.slotService = vahanProService;
    }

    public final void n2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.slotViewModel = ld7Var;
    }

    public final void o2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, "Are you sure you want to leave?");
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informational_web_view);
        View viewFindViewById = findViewById(R.id.paymentWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.webView = (WebView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.next_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        f2((LinearLayout) viewFindViewById2);
        h2(new ProgressDialog(this));
        I1().setMessage("Please wait...");
        I1().setCancelable(false);
        I1().setCanceledOnTouchOutside(false);
        m2(VahanProService.INSTANCE.a(this));
        n2((ld7) new z(this, new kd7(new jd7(M1()))).a(ld7.class));
        p2((dm7) new z(this, new cl7(new cm7(this.retrofitService))).a(dm7.class));
        z1();
        try {
            String stringExtra = getIntent().getStringExtra("state_code");
            Intrinsics.checkNotNull(stringExtra);
            o2(stringExtra);
            String stringExtra2 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra2);
            e2(stringExtra2);
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
            I1().show();
            P1().g(O1(), A1(), L1(), K1());
            P1().i().g(this, new mf4() { // from class: com.zepto.p07
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    VahanDms.T1(this.a, (DmsUrlModle) obj);
                }
            });
            P1().h().g(this, new mf4() { // from class: com.zepto.q07
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    VahanDms.U1(this.a, (String) obj);
                }
            });
            N1().Y0().g(this, new i(new e()));
            N1().X0().g(this, new i(new f()));
            N1().V().g(this, new i(new g()));
            N1().W().g(this, new i(new h()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        View viewFindViewById3 = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById3;
        this.mvvm_back = appCompatImageView;
        RelativeLayout relativeLayout = null;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDms.V1(this.a, view);
            }
        });
        View viewFindViewById4 = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        RelativeLayout relativeLayout2 = (RelativeLayout) viewFindViewById4;
        this.nexGenHolder = relativeLayout2;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDms.W1(this.a, view);
            }
        });
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
            z1();
        }
    }

    public final void p2(dm7 dm7Var) {
        Intrinsics.checkNotNullParameter(dm7Var, "<set-?>");
        this.viewModel = dm7Var;
    }

    public final void x1() {
        try {
            if (I1().isShowing()) {
                I1().dismiss();
            }
            I1().show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
