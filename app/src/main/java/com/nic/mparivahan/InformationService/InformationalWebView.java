package com.nic.mparivahan.InformationService;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.InformationService.InformationalWebView;
import com.nic.mparivahan.R;
import com.zepto.pq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/nic/mparivahan/InformationService/InformationalWebView;", "Lcom/zepto/pq;", "", "n1", "p1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "C", "Ljava/lang/String;", "k1", "()Ljava/lang/String;", "r1", "(Ljava/lang/String;)V", "printUrl", "D", "m1", "t1", "titletxt", "Landroid/webkit/WebView;", "E", "Landroid/webkit/WebView;", "webView", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "F", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "rootView", "Landroid/widget/ImageView;", "G", "Landroid/widget/ImageView;", "j1", "()Landroid/widget/ImageView;", "q1", "(Landroid/widget/ImageView;)V", "mvvm_back", "Landroid/widget/TextView;", "H", "Landroid/widget/TextView;", "l1", "()Landroid/widget/TextView;", "s1", "(Landroid/widget/TextView;)V", "service_label", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class InformationalWebView extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String printUrl;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String titletxt;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public WebView webView;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public CoordinatorLayout rootView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView service_label;

    private final void n1() {
        View viewFindViewById = findViewById(R.id.mvvm_Back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        q1((ImageView) viewFindViewById);
        j1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.py2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationalWebView.o1(this.a, view);
            }
        });
        p1();
    }

    public static final void o1(InformationalWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void p1() {
        WebView webView = this.webView;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        WebView webView3 = this.webView;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView3 = null;
        }
        webView3.getSettings().setAllowFileAccess(true);
        WebView webView4 = this.webView;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView4 = null;
        }
        webView4.setLayerType(1, null);
        WebView.setWebContentsDebuggingEnabled(true);
        WebView webView5 = this.webView;
        if (webView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView5 = null;
        }
        webView5.getSettings().setMixedContentMode(0);
        WebView webView6 = this.webView;
        if (webView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView6 = null;
        }
        webView6.getSettings().setAllowContentAccess(true);
        WebView webView7 = this.webView;
        if (webView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView7 = null;
        }
        webView7.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebView webView8 = this.webView;
        if (webView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView8 = null;
        }
        webView8.getSettings().setDomStorageEnabled(true);
        WebView webView9 = this.webView;
        if (webView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView9 = null;
        }
        webView9.getSettings().setUseWideViewPort(true);
        WebView webView10 = this.webView;
        if (webView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView10 = null;
        }
        webView10.getSettings().setLoadWithOverviewMode(true);
        WebView webView11 = this.webView;
        if (webView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView11 = null;
        }
        webView11.getSettings().setBuiltInZoomControls(true);
        WebView webView12 = this.webView;
        if (webView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView12 = null;
        }
        webView12.getSettings().setSupportMultipleWindows(true);
        WebView webView13 = this.webView;
        if (webView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView13 = null;
        }
        webView13.setWebViewClient(new a());
        WebView webView14 = this.webView;
        if (webView14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            webView2 = webView14;
        }
        webView2.loadUrl(k1());
    }

    public final ImageView j1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final String k1() {
        String str = this.printUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("printUrl");
        return null;
    }

    public final TextView l1() {
        TextView textView = this.service_label;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("service_label");
        return null;
    }

    public final String m1() {
        String str = this.titletxt;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("titletxt");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_service);
        View viewFindViewById = findViewById(R.id.paymentWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.webView = (WebView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rootView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.rootView = (CoordinatorLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.service_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        s1((TextView) viewFindViewById3);
        String stringExtra = getIntent().getStringExtra("URL");
        Intrinsics.checkNotNull(stringExtra);
        r1(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("title");
        Intrinsics.checkNotNull(stringExtra2);
        t1(stringExtra2);
        l1().setText(m1());
        n1();
    }

    public final void q1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    public final void r1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.printUrl = str;
    }

    public final void s1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.service_label = textView;
    }

    public final void t1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.titletxt = str;
    }

    public static final class a extends WebViewClient {
        public a() {
        }

        public final boolean a(WebView webView, String str) {
            if (str == null) {
                return false;
            }
            InformationalWebView.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "http", false, 2, (Object) null)) {
                InformationalWebView.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (webView == null) {
                return true;
            }
            webView.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            Log.e("WebView", "Error loading URL: " + request.getUrl() + " - " + ((Object) error.getDescription()));
            super.onReceivedError(view, request, error);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            Log.e("WebView", "SSL Error: " + error.getPrimaryError());
            handler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            Log.d("WebView", "Loading URL (WebResourceRequest): " + strValueOf);
            return a(webView, strValueOf);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            InformationalWebView.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return false;
        }
    }
}
