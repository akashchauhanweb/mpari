package com.nic.mparivahan.dlservices.newlearner;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.a;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTestActivity;
import com.zepto.bm3;
import com.zepto.pq;
import com.zepto.wl5;
import com.zepto.yy0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J/\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LearnerLicenseTestActivity;", "Lcom/zepto/pq;", "", "o1", "l1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/zepto/bm3;", "C", "Lcom/zepto/bm3;", "binding", "Lcom/zepto/wl5;", "D", "Lcom/zepto/wl5;", "n1", "()Lcom/zepto/wl5;", "r1", "(Lcom/zepto/wl5;)V", "sarthiSession", "", "E", "Z", "isLoaded", "Landroid/webkit/PermissionRequest;", "F", "Landroid/webkit/PermissionRequest;", "m1", "()Landroid/webkit/PermissionRequest;", "q1", "(Landroid/webkit/PermissionRequest;)V", "permissionRequest", "G", "I", "getREQUEST_ID_MULTIPLE_PERMISSIONS", "()I", "REQUEST_ID_MULTIPLE_PERMISSIONS", "H", "Ljava/lang/String;", "newUrl", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LearnerLicenseTestActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public bm3 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public PermissionRequest permissionRequest;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final int REQUEST_ID_MULTIPLE_PERMISSIONS = 7090;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String newUrl = "";

    public static final class a extends WebChromeClient {
        public a() {
        }

        public static final void c(LearnerLicenseTestActivity this$0, DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            dialogInterface.dismiss();
            this$0.m1().grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        }

        public static final void d(LearnerLicenseTestActivity this$0, DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNull(dialogInterface);
            dialogInterface.dismiss();
            this$0.m1().deny();
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            LearnerLicenseTestActivity.this.q1(request);
            String[] resources = request.getResources();
            Intrinsics.checkNotNull(resources);
            for (String str : resources) {
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    a.C0001a c0001a = new a.C0001a(LearnerLicenseTestActivity.this);
                    c0001a.o("Allow camera permission");
                    final LearnerLicenseTestActivity learnerLicenseTestActivity = LearnerLicenseTestActivity.this;
                    c0001a.l("Allow", new DialogInterface.OnClickListener() { // from class: com.zepto.kd3
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            LearnerLicenseTestActivity.a.c(learnerLicenseTestActivity, dialogInterface, i);
                        }
                    });
                    final LearnerLicenseTestActivity learnerLicenseTestActivity2 = LearnerLicenseTestActivity.this;
                    c0001a.h("Deny", new DialogInterface.OnClickListener() { // from class: com.zepto.ld3
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            LearnerLicenseTestActivity.a.d(learnerLicenseTestActivity2, dialogInterface, i);
                        }
                    });
                    androidx.appcompat.app.a aVarA = c0001a.a();
                    Intrinsics.checkNotNullExpressionValue(aVarA, "create(...)");
                    aVarA.show();
                    aVarA.i(-1).setTextColor(yy0.c(LearnerLicenseTestActivity.this, R.color.blue_color));
                    aVarA.i(-2).setTextColor(yy0.c(LearnerLicenseTestActivity.this, R.color.red_new));
                }
            }
        }
    }

    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            LearnerLicenseTestActivity.this.isLoaded = true;
            bm3 bm3Var = LearnerLicenseTestActivity.this.binding;
            bm3 bm3Var2 = null;
            if (bm3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bm3Var = null;
            }
            bm3Var.B.p();
            bm3 bm3Var3 = LearnerLicenseTestActivity.this.binding;
            if (bm3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bm3Var3 = null;
            }
            bm3Var3.B.setVisibility(8);
            bm3 bm3Var4 = LearnerLicenseTestActivity.this.binding;
            if (bm3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bm3Var4 = null;
            }
            bm3Var4.A.setVisibility(0);
            bm3 bm3Var5 = LearnerLicenseTestActivity.this.binding;
            if (bm3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bm3Var5 = null;
            }
            bm3Var5.A.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            bm3 bm3Var6 = LearnerLicenseTestActivity.this.binding;
            if (bm3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bm3Var2 = bm3Var6;
            }
            bm3Var2.A.loadUrl("javascript:HtmlViewer");
            Log.e("dl-js2", String.valueOf(str));
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            bm3 bm3Var = LearnerLicenseTestActivity.this.binding;
            if (bm3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bm3Var = null;
            }
            bm3Var.B.o();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            LearnerLicenseTestActivity.this.isLoaded = false;
            Log.e("dl-js", ("Got Error! " + error).toString());
            Toast.makeText(LearnerLicenseTestActivity.this, "Something went wrong,Please try after some time!", 1).show();
            bm3 bm3Var = LearnerLicenseTestActivity.this.binding;
            bm3 bm3Var2 = null;
            if (bm3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bm3Var = null;
            }
            bm3Var.B.p();
            bm3 bm3Var3 = LearnerLicenseTestActivity.this.binding;
            if (bm3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bm3Var2 = bm3Var3;
            }
            bm3Var2.B.setVisibility(8);
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

    private final void l1() {
        if (checkSelfPermission("android.permission.CAMERA") == -1) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, this.REQUEST_ID_MULTIPLE_PERMISSIONS);
            return;
        }
        bm3 bm3Var = this.binding;
        if (bm3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var = null;
        }
        bm3Var.A.loadUrl(this.newUrl);
    }

    private final void o1() {
        r1(new wl5(this));
        bm3 bm3Var = this.binding;
        bm3 bm3Var2 = null;
        if (bm3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var = null;
        }
        bm3Var.x.g.setText(n1().k());
        bm3 bm3Var3 = this.binding;
        if (bm3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var3 = null;
        }
        bm3Var3.x.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenseTestActivity.p1(this.a, view);
            }
        });
        bm3 bm3Var4 = this.binding;
        if (bm3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var4 = null;
        }
        bm3Var4.A.getSettings().setAllowFileAccess(true);
        bm3 bm3Var5 = this.binding;
        if (bm3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var5 = null;
        }
        bm3Var5.A.getSettings().setAllowContentAccess(true);
        bm3 bm3Var6 = this.binding;
        if (bm3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var6 = null;
        }
        bm3Var6.A.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        bm3 bm3Var7 = this.binding;
        if (bm3Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var7 = null;
        }
        bm3Var7.A.getSettings().setSupportMultipleWindows(true);
        bm3 bm3Var8 = this.binding;
        if (bm3Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var8 = null;
        }
        bm3Var8.A.getSettings().setJavaScriptEnabled(true);
        bm3 bm3Var9 = this.binding;
        if (bm3Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var9 = null;
        }
        bm3Var9.A.getSettings().setDomStorageEnabled(true);
        bm3 bm3Var10 = this.binding;
        if (bm3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var10 = null;
        }
        bm3Var10.A.getSettings().setUseWideViewPort(true);
        bm3 bm3Var11 = this.binding;
        if (bm3Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var11 = null;
        }
        bm3Var11.A.getSettings().setLoadWithOverviewMode(true);
        bm3 bm3Var12 = this.binding;
        if (bm3Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var12 = null;
        }
        bm3Var12.A.getSettings().setBuiltInZoomControls(true);
        bm3 bm3Var13 = this.binding;
        if (bm3Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var13 = null;
        }
        bm3Var13.A.clearCache(true);
        bm3 bm3Var14 = this.binding;
        if (bm3Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var14 = null;
        }
        bm3Var14.A.reload();
        bm3 bm3Var15 = this.binding;
        if (bm3Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var15 = null;
        }
        bm3Var15.A.requestFocus(130);
        CookieManager.getInstance().setAcceptCookie(true);
        l1();
        bm3 bm3Var16 = this.binding;
        if (bm3Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3Var16 = null;
        }
        bm3Var16.A.setWebChromeClient(new a());
        bm3 bm3Var17 = this.binding;
        if (bm3Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bm3Var2 = bm3Var17;
        }
        bm3Var2.A.setWebViewClient(new b());
    }

    public static final void p1(LearnerLicenseTestActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public final PermissionRequest m1() {
        PermissionRequest permissionRequest = this.permissionRequest;
        if (permissionRequest != null) {
            return permissionRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permissionRequest");
        return null;
    }

    public final wl5 n1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bm3 bm3VarX = bm3.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bm3VarX, "inflate(...)");
        this.binding = bm3VarX;
        if (bm3VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bm3VarX = null;
        }
        setContentView(bm3VarX.m());
        this.newUrl = "https://164.100.69.249:8443/sarathiservicemob/authenticationaction.do?authtype=Anumathi";
        o1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.REQUEST_ID_MULTIPLE_PERMISSIONS) {
            if ((!(grantResults.length == 0)) && grantResults[0] != 0) {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
                l1();
                return;
            }
            bm3 bm3Var = this.binding;
            if (bm3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bm3Var = null;
            }
            bm3Var.A.loadUrl(this.newUrl);
        }
    }

    public final void q1(PermissionRequest permissionRequest) {
        Intrinsics.checkNotNullParameter(permissionRequest, "<set-?>");
        this.permissionRequest = permissionRequest;
    }

    public final void r1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }
}
