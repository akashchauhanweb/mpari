package com.nic.mparivahan.AbtCntctTerms;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.nic.mparivahan.AbtCntctTerms.AboutUs;
import com.nic.mparivahan.R;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.wa3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/nic/mparivahan/AbtCntctTerms/AboutUs;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/widget/ImageView;", "C", "Landroid/widget/ImageView;", "k1", "()Landroid/widget/ImageView;", "o1", "(Landroid/widget/ImageView;)V", "mvvm_back", "Landroid/webkit/WebView;", "D", "Landroid/webkit/WebView;", "j1", "()Landroid/webkit/WebView;", "n1", "(Landroid/webkit/WebView;)V", "aboutUsWv", "Landroid/widget/TextView;", "E", "Landroid/widget/TextView;", "l1", "()Landroid/widget/TextView;", "p1", "(Landroid/widget/TextView;)V", "service_label", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AboutUs extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public WebView aboutUsWv;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView service_label;

    public static final class a extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
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

    public static final void m1(AboutUs this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final WebView j1() {
        WebView webView = this.aboutUsWv;
        if (webView != null) {
            return webView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aboutUsWv");
        return null;
    }

    public final ImageView k1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
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

    public final void n1(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<set-?>");
        this.aboutUsWv = webView;
    }

    public final void o1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        View viewFindViewById = findViewById(R.id.mvvm_Back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        o1((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.aboutUsWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        n1((WebView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.service_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        p1((TextView) viewFindViewById3);
        wa3 wa3Var = new wa3(this);
        l1().setText(wa3Var.b("label_about_us", "About Us"));
        k1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutUs.m1(this.a, view);
            }
        });
        String str = s14.a.g() + wa3Var.d() + "/mparivahan-info-about-us.html";
        j1().setWebViewClient(new a());
        j1().loadUrl(str);
    }

    public final void p1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.service_label = textView;
    }
}
