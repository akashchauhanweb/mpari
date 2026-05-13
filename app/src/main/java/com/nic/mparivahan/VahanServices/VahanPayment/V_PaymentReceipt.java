package com.nic.mparivahan.VahanServices.VahanPayment;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanPayment.V_PaymentReceipt;
import com.zepto.bh;
import com.zepto.pq;
import com.zepto.ws6;
import com.zepto.xr2;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPayment/V_PaymentReceipt;", "Lcom/zepto/pq;", "", "l1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "imageString", "q1", "Lcom/zepto/bh;", "C", "Lcom/zepto/bh;", "binding", "D", "Ljava/lang/String;", "receiptNo", "E", "url", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "m1", "()Landroid/app/ProgressDialog;", "p1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class V_PaymentReceipt extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public bh binding;

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
        public void onPageFinished(WebView webView, String str) {
            if (!this.a) {
                V_PaymentReceipt.this.q1(this.c);
            } else {
                V_PaymentReceipt.this.m1().dismiss();
                V_PaymentReceipt.this.l1();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.a = true;
            Log.e("test", String.valueOf(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1() {
        try {
            ws6 ws6Var = new ws6(this);
            CookieManager cookieManager = CookieManager.getInstance();
            String str = this.url;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("url");
                str = null;
            }
            String cookie = cookieManager.getCookie(str);
            Object systemService = getSystemService("download");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager downloadManager = (DownloadManager) systemService;
            String str3 = this.url;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("url");
            } else {
                str2 = str3;
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
            request.addRequestHeader("Cookie", cookie);
            request.addRequestHeader(xr2.HEADER_CONTENT_TYPE, "application/pdf");
            request.addRequestHeader("Authorization", "Bearer " + ws6Var.r());
            request.setNotificationVisibility(1);
            request.setDestinationInExternalFilesDir(getApplicationContext(), Environment.DIRECTORY_DOWNLOADS, "");
            request.setTitle(this.receiptNo);
            downloadManager.enqueue(request);
            Toast.makeText(this, "Receipt successfully saved in storage.", 1).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void n1(V_PaymentReceipt this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void o1(View view) {
    }

    public final ProgressDialog m1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v__payment_receipt);
        bh bhVarC = bh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bhVarC, "inflate(...)");
        this.binding = bhVarC;
        bh bhVar = null;
        if (bhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bhVarC = null;
        }
        setContentView(bhVarC.b());
        p1(new ProgressDialog(this));
        m1().setMessage("Please wait...");
        m1().setCancelable(false);
        m1().setCanceledOnTouchOutside(false);
        String stringExtra = getIntent().getStringExtra("vahanReceiptUrl");
        Intrinsics.checkNotNull(stringExtra);
        this.url = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("receiptNo");
        Intrinsics.checkNotNull(stringExtra2);
        this.receiptNo = stringExtra2;
        String str = this.url;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
            str = null;
        }
        q1(StringsKt__StringsKt.trim((CharSequence) str).toString());
        bh bhVar2 = this.binding;
        if (bhVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bhVar2 = null;
        }
        bhVar2.d.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ou6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V_PaymentReceipt.n1(this.a, view);
            }
        });
        bh bhVar3 = this.binding;
        if (bhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bhVar = bhVar3;
        }
        bhVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V_PaymentReceipt.o1(view);
            }
        });
    }

    public final void p1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void q1(String imageString) {
        Intrinsics.checkNotNullParameter(imageString, "imageString");
        try {
            m1().show();
            ws6 ws6Var = new ws6(this);
            HashMap map = new HashMap();
            map.put("Authorization", "Bearer " + ws6Var.r());
            bh bhVar = this.binding;
            bh bhVar2 = null;
            if (bhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bhVar = null;
            }
            bhVar.e.invalidate();
            bh bhVar3 = this.binding;
            if (bhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bhVar3 = null;
            }
            bhVar3.e.getSettings().setJavaScriptEnabled(true);
            bh bhVar4 = this.binding;
            if (bhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bhVar4 = null;
            }
            bhVar4.e.getSettings().setSupportZoom(true);
            bh bhVar5 = this.binding;
            if (bhVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bhVar5 = null;
            }
            bhVar5.e.loadUrl(imageString, map);
            bh bhVar6 = this.binding;
            if (bhVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bhVar2 = bhVar6;
            }
            bhVar2.e.setWebViewClient(new a(imageString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
