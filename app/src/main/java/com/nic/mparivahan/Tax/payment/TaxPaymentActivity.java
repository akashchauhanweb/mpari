package com.nic.mparivahan.Tax.payment;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.payment.TaxPaymentActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.pq;
import com.zepto.qd6;
import com.zepto.vh7;
import com.zepto.yk1;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014R\"\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/nic/mparivahan/Tax/payment/TaxPaymentActivity;", "Lcom/zepto/pq;", "", "s1", "x1", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "message", "p1", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onDestroy", "onPause", "onResume", "C", "Ljava/lang/String;", "getBeforepaymenturl", "()Ljava/lang/String;", "setBeforepaymenturl", "(Ljava/lang/String;)V", "beforepaymenturl", "Lcom/zepto/qd6;", "D", "Lcom/zepto/qd6;", "mBinding", "Lcom/zepto/yk1;", "E", "Lcom/zepto/yk1;", "viewModel", "F", "Z", "isLoaded", "G", "doubleBackToExitPressedOnce", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "o1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "u1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TaxPaymentActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String beforepaymenturl = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public qd6 mBinding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    public static final class a {
        public final TaxPaymentActivity a;

        public a(TaxPaymentActivity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.a = context;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("response")) {
                    String string = jSONObject.getString("response");
                    Log.e("dl-print", string);
                    Intent intent = new Intent(this.a, (Class<?>) PayTaxPaymentStatusScreen.class);
                    intent.putExtra("EncString", string);
                    intent.putExtra("RcDetails", this.a.o1());
                    this.a.startActivity(intent);
                    TaxPaymentActivity taxPaymentActivity = this.a;
                    Intrinsics.checkNotNull(taxPaymentActivity, "null cannot be cast to non-null type android.app.Activity");
                    taxPaymentActivity.finish();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            TaxPaymentActivity.this.isLoaded = true;
            qd6 qd6Var = TaxPaymentActivity.this.mBinding;
            qd6 qd6Var2 = null;
            if (qd6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                qd6Var = null;
            }
            qd6Var.C.p();
            qd6 qd6Var3 = TaxPaymentActivity.this.mBinding;
            if (qd6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                qd6Var3 = null;
            }
            qd6Var3.C.setVisibility(8);
            qd6 qd6Var4 = TaxPaymentActivity.this.mBinding;
            if (qd6Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                qd6Var4 = null;
            }
            qd6Var4.B.setVisibility(0);
            qd6 qd6Var5 = TaxPaymentActivity.this.mBinding;
            if (qd6Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                qd6Var5 = null;
            }
            qd6Var5.B.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            qd6 qd6Var6 = TaxPaymentActivity.this.mBinding;
            if (qd6Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                qd6Var2 = qd6Var6;
            }
            qd6Var2.B.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            qd6 qd6Var = TaxPaymentActivity.this.mBinding;
            if (qd6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                qd6Var = null;
            }
            qd6Var.C.o();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            TaxPaymentActivity.this.isLoaded = false;
            Log.e("dl-js", ("Got Error! " + error).toString());
            TaxPaymentActivity.this.finish();
            qd6 qd6Var = TaxPaymentActivity.this.mBinding;
            qd6 qd6Var2 = null;
            if (qd6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                qd6Var = null;
            }
            qd6Var.C.p();
            qd6 qd6Var3 = TaxPaymentActivity.this.mBinding;
            if (qd6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                qd6Var2 = qd6Var3;
            }
            qd6Var2.C.setVisibility(8);
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
            Log.e("dl-url_finish", strValueOf);
            return true;
        }
    }

    public static final void q1(TaxPaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void r1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void s1() {
        qd6 qd6Var = this.mBinding;
        if (qd6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var = null;
        }
        qd6Var.x.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaxPaymentActivity.t1(this.a, view);
            }
        });
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            this.beforepaymenturl = String.valueOf(extras != null ? extras.get("url") : null);
            Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
            u1((NrvDetails) serializableExtra);
        }
    }

    public static final void t1(TaxPaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p1("Are you sure want to go back?");
    }

    private final void v1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.ld6
            @Override // java.lang.Runnable
            public final void run() {
                TaxPaymentActivity.w1(this.c);
            }
        }, 2000L);
    }

    public static final void w1(TaxPaymentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void x1() {
        qd6 qd6Var = this.mBinding;
        qd6 qd6Var2 = null;
        if (qd6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var = null;
        }
        qd6Var.B.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        qd6 qd6Var3 = this.mBinding;
        if (qd6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var3 = null;
        }
        qd6Var3.B.getSettings().setAllowFileAccess(true);
        qd6 qd6Var4 = this.mBinding;
        if (qd6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var4 = null;
        }
        qd6Var4.B.getSettings().setAllowContentAccess(true);
        qd6 qd6Var5 = this.mBinding;
        if (qd6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var5 = null;
        }
        qd6Var5.B.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        qd6 qd6Var6 = this.mBinding;
        if (qd6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var6 = null;
        }
        qd6Var6.B.getSettings().setSupportMultipleWindows(true);
        qd6 qd6Var7 = this.mBinding;
        if (qd6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var7 = null;
        }
        qd6Var7.B.getSettings().setJavaScriptEnabled(true);
        qd6 qd6Var8 = this.mBinding;
        if (qd6Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var8 = null;
        }
        qd6Var8.B.getSettings().setDomStorageEnabled(true);
        qd6 qd6Var9 = this.mBinding;
        if (qd6Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var9 = null;
        }
        qd6Var9.B.getSettings().setUseWideViewPort(true);
        qd6 qd6Var10 = this.mBinding;
        if (qd6Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var10 = null;
        }
        qd6Var10.B.getSettings().setLoadWithOverviewMode(true);
        qd6 qd6Var11 = this.mBinding;
        if (qd6Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var11 = null;
        }
        qd6Var11.B.getSettings().setBuiltInZoomControls(true);
        qd6 qd6Var12 = this.mBinding;
        if (qd6Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var12 = null;
        }
        qd6Var12.B.clearCache(true);
        qd6 qd6Var13 = this.mBinding;
        if (qd6Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var13 = null;
        }
        qd6Var13.B.reload();
        qd6 qd6Var14 = this.mBinding;
        if (qd6Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var14 = null;
        }
        qd6Var14.B.requestFocus(130);
        CookieManager.getInstance().setAcceptCookie(true);
        qd6 qd6Var15 = this.mBinding;
        if (qd6Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var15 = null;
        }
        qd6Var15.B.loadUrl(this.beforepaymenturl);
        qd6 qd6Var16 = this.mBinding;
        if (qd6Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var16 = null;
        }
        qd6Var16.B.addJavascriptInterface(new a(this), "HtmlViewer");
        qd6 qd6Var17 = this.mBinding;
        if (qd6Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qd6Var2 = qd6Var17;
        }
        qd6Var2.B.setWebViewClient(new b());
    }

    public final NrvDetails o1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.taxpaymentscreen);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (qd6) lq7VarF;
        this.viewModel = (yk1) new z(this).a(yk1.class);
        vh7 vh7Var = new vh7(this);
        qd6 qd6Var = this.mBinding;
        if (qd6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var = null;
        }
        qd6Var.x.g.setText(VContant.INSTANCE.n(this, vh7Var));
        s1();
        x1();
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        qd6 qd6Var = this.mBinding;
        if (qd6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var = null;
        }
        if (qd6Var.B.canGoBack()) {
            onBackPressed();
            return true;
        }
        v1();
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPause() {
        super.onPause();
        qd6 qd6Var = this.mBinding;
        qd6 qd6Var2 = null;
        if (qd6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var = null;
        }
        qd6Var.A.onPause();
        qd6 qd6Var3 = this.mBinding;
        if (qd6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qd6Var2 = qd6Var3;
        }
        qd6Var2.A.pauseTimers();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        qd6 qd6Var = this.mBinding;
        qd6 qd6Var2 = null;
        if (qd6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qd6Var = null;
        }
        qd6Var.A.onResume();
        qd6 qd6Var3 = this.mBinding;
        if (qd6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qd6Var2 = qd6Var3;
        }
        qd6Var2.A.resumeTimers();
    }

    public final void p1(String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.md6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaxPaymentActivity.q1(this.a, view);
            }
        });
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaxPaymentActivity.r1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void u1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }
}
