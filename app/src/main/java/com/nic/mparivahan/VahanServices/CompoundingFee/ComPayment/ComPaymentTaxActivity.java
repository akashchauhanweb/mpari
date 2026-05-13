package com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment.ComPaymentTaxActivity;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.pq;
import com.zepto.uu3;
import com.zepto.wa3;
import com.zepto.yk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014R\"\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001a¨\u00068"}, d2 = {"Lcom/nic/mparivahan/VahanServices/CompoundingFee/ComPayment/ComPaymentTaxActivity;", "Lcom/zepto/pq;", "", "s1", "x1", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "message", "p1", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onDestroy", "onPause", "onResume", "C", "Ljava/lang/String;", "getBeforepaymenturl", "()Ljava/lang/String;", "setBeforepaymenturl", "(Ljava/lang/String;)V", "beforepaymenturl", "Lcom/zepto/uu3;", "D", "Lcom/zepto/uu3;", "mBinding", "Lcom/zepto/yk1;", "E", "Lcom/zepto/yk1;", "viewModel", "F", "Z", "isLoaded", "G", "doubleBackToExitPressedOnce", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "o1", "()Lcom/zepto/wa3;", "u1", "(Lcom/zepto/wa3;)V", "languageKeySession", "I", "getServicename", "setServicename", "Servicename", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ComPaymentTaxActivity extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public uu3 mBinding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String beforepaymenturl = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String Servicename = " ";

    public static final class a {
        public final Context a;

        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.a = context;
        }

        @JavascriptInterface
        public final void showHTML(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("response")) {
                    String string = jSONObject.getString("response");
                    Intent intent = new Intent(this.a, (Class<?>) CompPaymentStatusScreen.class);
                    intent.putExtra("EncString", string);
                    intent.putExtra("ServiceName", "Payment Status");
                    this.a.startActivity(intent);
                    Context context = this.a;
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) context).finish();
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
            ComPaymentTaxActivity.this.isLoaded = true;
            uu3 uu3Var = ComPaymentTaxActivity.this.mBinding;
            uu3 uu3Var2 = null;
            if (uu3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                uu3Var = null;
            }
            uu3Var.C.p();
            uu3 uu3Var3 = ComPaymentTaxActivity.this.mBinding;
            if (uu3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                uu3Var3 = null;
            }
            uu3Var3.C.setVisibility(8);
            uu3 uu3Var4 = ComPaymentTaxActivity.this.mBinding;
            if (uu3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                uu3Var4 = null;
            }
            uu3Var4.B.setVisibility(0);
            uu3 uu3Var5 = ComPaymentTaxActivity.this.mBinding;
            if (uu3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                uu3Var5 = null;
            }
            uu3Var5.B.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            uu3 uu3Var6 = ComPaymentTaxActivity.this.mBinding;
            if (uu3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                uu3Var2 = uu3Var6;
            }
            uu3Var2.B.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            uu3 uu3Var = ComPaymentTaxActivity.this.mBinding;
            if (uu3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                uu3Var = null;
            }
            uu3Var.C.o();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            ComPaymentTaxActivity.this.isLoaded = false;
            Log.e("dl-js", ("Got Error! " + error).toString());
            ComPaymentTaxActivity.this.finish();
            uu3 uu3Var = ComPaymentTaxActivity.this.mBinding;
            uu3 uu3Var2 = null;
            if (uu3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                uu3Var = null;
            }
            uu3Var.C.p();
            uu3 uu3Var3 = ComPaymentTaxActivity.this.mBinding;
            if (uu3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                uu3Var2 = uu3Var3;
            }
            uu3Var2.C.setVisibility(8);
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

    public static final void q1(ComPaymentTaxActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void s1() {
        uu3 uu3Var = this.mBinding;
        uu3 uu3Var2 = null;
        if (uu3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var = null;
        }
        uu3Var.x.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComPaymentTaxActivity.t1(this.a, view);
            }
        });
        if (getIntent() != null) {
            try {
                Bundle extras = getIntent().getExtras();
                this.beforepaymenturl = String.valueOf(extras != null ? extras.get("url") : null);
                Bundle extras2 = getIntent().getExtras();
                this.Servicename = String.valueOf(extras2 != null ? extras2.get("ServiceName") : null);
                uu3 uu3Var3 = this.mBinding;
                if (uu3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    uu3Var2 = uu3Var3;
                }
                uu3Var2.x.g.setText(this.Servicename.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static final void t1(ComPaymentTaxActivity this$0, View view) {
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
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.vr0
            @Override // java.lang.Runnable
            public final void run() {
                ComPaymentTaxActivity.w1(this.c);
            }
        }, 2000L);
    }

    public static final void w1(ComPaymentTaxActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void x1() {
        uu3 uu3Var = this.mBinding;
        uu3 uu3Var2 = null;
        if (uu3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var = null;
        }
        uu3Var.B.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        uu3 uu3Var3 = this.mBinding;
        if (uu3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var3 = null;
        }
        uu3Var3.B.getSettings().setAllowFileAccess(true);
        uu3 uu3Var4 = this.mBinding;
        if (uu3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var4 = null;
        }
        uu3Var4.B.getSettings().setAllowContentAccess(true);
        uu3 uu3Var5 = this.mBinding;
        if (uu3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var5 = null;
        }
        uu3Var5.B.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        uu3 uu3Var6 = this.mBinding;
        if (uu3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var6 = null;
        }
        uu3Var6.B.getSettings().setSupportMultipleWindows(true);
        uu3 uu3Var7 = this.mBinding;
        if (uu3Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var7 = null;
        }
        uu3Var7.B.getSettings().setJavaScriptEnabled(true);
        uu3 uu3Var8 = this.mBinding;
        if (uu3Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var8 = null;
        }
        uu3Var8.B.getSettings().setDomStorageEnabled(true);
        uu3 uu3Var9 = this.mBinding;
        if (uu3Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var9 = null;
        }
        uu3Var9.B.getSettings().setUseWideViewPort(true);
        uu3 uu3Var10 = this.mBinding;
        if (uu3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var10 = null;
        }
        uu3Var10.B.getSettings().setLoadWithOverviewMode(true);
        uu3 uu3Var11 = this.mBinding;
        if (uu3Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var11 = null;
        }
        uu3Var11.B.getSettings().setBuiltInZoomControls(true);
        uu3 uu3Var12 = this.mBinding;
        if (uu3Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var12 = null;
        }
        uu3Var12.B.clearCache(true);
        uu3 uu3Var13 = this.mBinding;
        if (uu3Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var13 = null;
        }
        uu3Var13.B.reload();
        uu3 uu3Var14 = this.mBinding;
        if (uu3Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var14 = null;
        }
        uu3Var14.B.requestFocus(130);
        Log.d("url_new", this.beforepaymenturl.toString());
        CookieManager.getInstance().setAcceptCookie(true);
        uu3 uu3Var15 = this.mBinding;
        if (uu3Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var15 = null;
        }
        uu3Var15.B.loadUrl(this.beforepaymenturl);
        uu3 uu3Var16 = this.mBinding;
        if (uu3Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var16 = null;
        }
        uu3Var16.B.addJavascriptInterface(new a(this), "HtmlViewer");
        uu3 uu3Var17 = this.mBinding;
        if (uu3Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uu3Var2 = uu3Var17;
        }
        uu3Var2.B.setWebViewClient(new b());
    }

    public final wa3 o1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.mislinessfeepayment);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (uu3) lq7VarF;
        this.viewModel = (yk1) new z(this).a(yk1.class);
        u1(new wa3(this));
        uu3 uu3Var = this.mBinding;
        if (uu3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var = null;
        }
        uu3Var.x.g.setText(o1().b("comp_FeePayment", getString(R.string.compoundFee)));
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
        uu3 uu3Var = this.mBinding;
        if (uu3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var = null;
        }
        if (uu3Var.B.canGoBack()) {
            onBackPressed();
            return true;
        }
        v1();
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPause() {
        super.onPause();
        uu3 uu3Var = this.mBinding;
        uu3 uu3Var2 = null;
        if (uu3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var = null;
        }
        uu3Var.A.onPause();
        uu3 uu3Var3 = this.mBinding;
        if (uu3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uu3Var2 = uu3Var3;
        }
        uu3Var2.A.pauseTimers();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        uu3 uu3Var = this.mBinding;
        uu3 uu3Var2 = null;
        if (uu3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uu3Var = null;
        }
        uu3Var.A.onResume();
        uu3 uu3Var3 = this.mBinding;
        if (uu3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uu3Var2 = uu3Var3;
        }
        uu3Var2.A.resumeTimers();
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComPaymentTaxActivity.q1(this.a, view);
            }
        });
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComPaymentTaxActivity.r1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void u1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }
}
