package com.nic.mparivahan.Citizen.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.nic.mparivahan.Citizen.Activities.EvidenceVideoPlayActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.zepto.o52;
import com.zepto.pq;
import com.zepto.rw4;
import com.zepto.wa3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/EvidenceVideoPlayActivity;", "Lcom/zepto/pq;", "", "o1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "visible", "s1", "u1", "r1", "Lcom/zepto/o52;", "C", "Lcom/zepto/o52;", "binding", "", "D", "Ljava/lang/String;", "videoUrl", "Lcom/zepto/rw4;", "E", "Lcom/zepto/rw4;", "progress", "F", "Z", "isLoaded", "G", "doubleBackToExitPressedOnce", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "n1", "()Lcom/zepto/wa3;", "t1", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEvidenceVideoPlayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvidenceVideoPlayActivity.kt\ncom/nic/mparivahan/Citizen/Activities/EvidenceVideoPlayActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
public final class EvidenceVideoPlayActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public o52 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String videoUrl = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isLoaded;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 session;

    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            EvidenceVideoPlayActivity.this.isLoaded = true;
            EvidenceVideoPlayActivity.this.s1(false);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            EvidenceVideoPlayActivity.this.s1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            EvidenceVideoPlayActivity.this.isLoaded = false;
            EvidenceVideoPlayActivity.this.s1(false);
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

    private final void o1() {
        o52 o52Var = this.binding;
        o52 o52Var2 = null;
        if (o52Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var = null;
        }
        o52Var.b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EvidenceVideoPlayActivity.p1(this.a, view);
            }
        });
        o52 o52Var3 = this.binding;
        if (o52Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var3 = null;
        }
        o52Var3.c.setInitialScale(1);
        o52 o52Var4 = this.binding;
        if (o52Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var4 = null;
        }
        o52Var4.c.getSettings().setJavaScriptEnabled(true);
        o52 o52Var5 = this.binding;
        if (o52Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var5 = null;
        }
        o52Var5.c.getSettings().setDomStorageEnabled(true);
        o52 o52Var6 = this.binding;
        if (o52Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var6 = null;
        }
        o52Var6.c.getSettings().setUseWideViewPort(true);
        o52 o52Var7 = this.binding;
        if (o52Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var7 = null;
        }
        o52Var7.c.getSettings().setLoadWithOverviewMode(true);
        o52 o52Var8 = this.binding;
        if (o52Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var8 = null;
        }
        o52Var8.c.getSettings().setBuiltInZoomControls(true);
        o52 o52Var9 = this.binding;
        if (o52Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var9 = null;
        }
        o52Var9.c.setScrollBarStyle(33554432);
        o52 o52Var10 = this.binding;
        if (o52Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var10 = null;
        }
        o52Var10.c.setScrollbarFadingEnabled(false);
        o52 o52Var11 = this.binding;
        if (o52Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var11 = null;
        }
        o52Var11.c.clearCache(true);
        o52 o52Var12 = this.binding;
        if (o52Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var12 = null;
        }
        o52Var12.c.reload();
        o52 o52Var13 = this.binding;
        if (o52Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var13 = null;
        }
        o52Var13.c.requestFocus(130);
        CookieManager.getInstance().setAcceptCookie(true);
        o52 o52Var14 = this.binding;
        if (o52Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var14 = null;
        }
        o52Var14.c.loadUrl(this.videoUrl);
        o52 o52Var15 = this.binding;
        if (o52Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var15 = null;
        }
        o52Var15.c.setWebViewClient(new a());
        o52 o52Var16 = this.binding;
        if (o52Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            o52Var2 = o52Var16;
        }
        o52Var2.b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EvidenceVideoPlayActivity.q1(this.a, view);
            }
        });
    }

    public static final void p1(EvidenceVideoPlayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o52 o52Var = this$0.binding;
        o52 o52Var2 = null;
        if (o52Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var = null;
        }
        if (!o52Var.c.canGoBack()) {
            this$0.u1();
            return;
        }
        o52 o52Var3 = this$0.binding;
        if (o52Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            o52Var2 = o52Var3;
        }
        o52Var2.c.goBack();
    }

    public static final void q1(EvidenceVideoPlayActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1();
    }

    public static final void v1(EvidenceVideoPlayActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    public final wa3 n1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evidence_video_play);
        o52 o52VarC = o52.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o52VarC, "inflate(...)");
        this.binding = o52VarC;
        o52 o52Var = null;
        if (o52VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52VarC = null;
        }
        setContentView(o52VarC.b());
        String stringExtra = getIntent().getStringExtra("videoUrl");
        Intrinsics.checkNotNull(stringExtra);
        this.videoUrl = stringExtra;
        Log.e("VideoLink--> ", stringExtra);
        o1();
        t1(new wa3(this));
        o52 o52Var2 = this.binding;
        if (o52Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            o52Var = o52Var2;
        }
        o52Var.b.i.setText(n1().b("report_accident", "Report Accident"));
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        o52 o52Var = this.binding;
        if (o52Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o52Var = null;
        }
        if (o52Var.c.canGoBack()) {
            onBackPressed();
            return true;
        }
        u1();
        return true;
    }

    public final void r1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void s1(boolean visible) {
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

    public final void t1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void u1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.n52
            @Override // java.lang.Runnable
            public final void run() {
                EvidenceVideoPlayActivity.v1(this.c);
            }
        }, 2000L);
    }
}
