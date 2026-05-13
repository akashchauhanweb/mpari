package com.nic.mparivahan.VahanServices.VahanPayment;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.nic.mparivahan.R;
import com.zepto.gc7;
import com.zepto.pq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPayment/VahanPaymentReceiptActivity;", "Lcom/zepto/pq;", "", "imageString", "", "l1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Lcom/zepto/gc7;", "C", "Lcom/zepto/gc7;", "binding", "D", "Ljava/lang/String;", "receiptNo", "E", "url", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "j1", "()Landroid/app/ProgressDialog;", "k1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanPaymentReceiptActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public gc7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String receiptNo = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String url;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final class a extends WebViewClient {
        public boolean a;
        public final /* synthetic */ String c;

        public a(String str) {
            this.c = str;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            if (this.a) {
                VahanPaymentReceiptActivity.this.j1().dismiss();
            } else {
                VahanPaymentReceiptActivity.this.l1(this.c);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(favicon, "favicon");
            this.a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1(String imageString) {
        j1().show();
        gc7 gc7Var = this.binding;
        gc7 gc7Var2 = null;
        if (gc7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gc7Var = null;
        }
        gc7Var.c.invalidate();
        gc7 gc7Var3 = this.binding;
        if (gc7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gc7Var3 = null;
        }
        gc7Var3.c.getSettings().setJavaScriptEnabled(true);
        gc7 gc7Var4 = this.binding;
        if (gc7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gc7Var4 = null;
        }
        gc7Var4.c.getSettings().setSupportZoom(true);
        gc7 gc7Var5 = this.binding;
        if (gc7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gc7Var5 = null;
        }
        gc7Var5.c.loadUrl("https://docs.google.com/gview?embedded=true&url=" + imageString);
        gc7 gc7Var6 = this.binding;
        if (gc7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            gc7Var2 = gc7Var6;
        }
        gc7Var2.c.setWebViewClient(new a(imageString));
    }

    public final ProgressDialog j1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void k1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_payment_receipt);
        gc7 gc7VarC = gc7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(gc7VarC, "inflate(...)");
        this.binding = gc7VarC;
        String str = null;
        if (gc7VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gc7VarC = null;
        }
        setContentView(gc7VarC.b());
        k1(new ProgressDialog(this));
        j1().setMessage("Please wait...");
        j1().setCancelable(false);
        j1().setCanceledOnTouchOutside(false);
        String stringExtra = getIntent().getStringExtra("vahanReceiptUrl");
        Intrinsics.checkNotNull(stringExtra);
        this.url = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("receiptNo");
        Intrinsics.checkNotNull(stringExtra2);
        this.receiptNo = stringExtra2;
        String str2 = this.url;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        } else {
            str = str2;
        }
        l1(StringsKt__StringsKt.trim((CharSequence) str).toString());
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        finish();
        return true;
    }
}
