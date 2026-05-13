package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.Dialog;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.DownloadApplicationActivity;
import com.zepto.cb;
import com.zepto.l8;
import com.zepto.o40;
import com.zepto.rw4;
import com.zepto.s14;
import com.zepto.wa3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J.\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0002H\u0017R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/view/DownloadApplicationActivity;", "Lcom/zepto/o40;", "", "J1", "L1", "", "visible", "Q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "url", "userAgent", "contentDisposition", "mimetype", "", "contentLength", "E1", "onBackPressed", "Lcom/zepto/cb;", "F", "Lcom/zepto/cb;", "mBinding", "G", "Ljava/lang/String;", "app_no", "H", "dob", "Landroidx/appcompat/widget/AppCompatImageView;", "I", "Landroidx/appcompat/widget/AppCompatImageView;", "H1", "()Landroidx/appcompat/widget/AppCompatImageView;", "O1", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "back_icon", "Lcom/zepto/rw4;", "J", "Lcom/zepto/rw4;", "progress", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "I1", "()Lcom/zepto/wa3;", "P1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDownloadApplicationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadApplicationActivity.kt\ncom/nic/mparivahan/Sarathithreeservices/view/DownloadApplicationActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"})
public final class DownloadApplicationActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public cb mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String app_no;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public AppCompatImageView back_icon;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 langSession;

    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            DownloadApplicationActivity.this.Q1(false);
            super.onPageFinished(webView, str);
            if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "sarathiPGResponse", false, 2, (Object) null)) {
                return;
            }
            DownloadApplicationActivity.this.finish();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            DownloadApplicationActivity.this.Q1(true);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            Log.e("dl-js", ("Got Error! " + error).toString());
            super.onReceivedError(view, request, error);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String Url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(Url, "Url");
            view.loadUrl(Url);
            return true;
        }
    }

    public static final void F1(String url, String mimetype, String userAgent, DownloadApplicationActivity this$0, Dialog d, View view) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(mimetype, "$mimetype");
        Intrinsics.checkNotNullParameter(userAgent, "$userAgent");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setMimeType(mimetype);
        request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url));
        request.addRequestHeader("User-Agent", userAgent);
        request.setDescription("Downloading file...");
        StringBuilder sb = new StringBuilder();
        sb.append("Fee_Receipt_");
        String str = this$0.app_no;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app_no");
            str = null;
        }
        sb.append(str);
        request.setTitle(sb.toString());
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PayReceipt");
        String str4 = this$0.app_no;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app_no");
        } else {
            str2 = str4;
        }
        sb2.append(str2);
        sb2.append(".pdf");
        request.setDestinationInExternalPublicDir(str3, sb2.toString());
        Object systemService = this$0.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        ((DownloadManager) systemService).enqueue(request);
        Toast.makeText(this$0.getApplicationContext(), "Downloading File", 1).show();
        d.dismiss();
    }

    public static final void G1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void J1() {
        String stringExtra = getIntent().getStringExtra("app_no");
        Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
        this.app_no = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("dob");
        Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
        this.dob = stringExtra2;
        cb cbVar = this.mBinding;
        cb cbVar2 = null;
        if (cbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cbVar = null;
        }
        WebView webView = cbVar.c;
        StringBuilder sb = new StringBuilder();
        sb.append(s14.a.y());
        sb.append("PrintConformMob.jsp?applno=");
        String str = this.app_no;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app_no");
            str = null;
        }
        sb.append(str);
        sb.append("&dob=");
        String str2 = this.dob;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dob");
            str2 = null;
        }
        sb.append(str2);
        webView.loadUrl(sb.toString());
        cb cbVar3 = this.mBinding;
        if (cbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cbVar3 = null;
        }
        cbVar3.c.getSettings().setJavaScriptEnabled(true);
        cb cbVar4 = this.mBinding;
        if (cbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cbVar4 = null;
        }
        cbVar4.c.setWebViewClient(new a());
        cb cbVar5 = this.mBinding;
        if (cbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            cbVar2 = cbVar5;
        }
        cbVar2.c.setDownloadListener(new DownloadListener() { // from class: com.zepto.lu1
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str3, String str4, String str5, String str6, long j) {
                DownloadApplicationActivity.K1(this.a, str3, str4, str5, str6, j);
            }
        });
    }

    public static final void K1(DownloadApplicationActivity this$0, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            l8.s(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return;
        }
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        this$0.E1(str, str2, str3, str4, j);
    }

    private final void L1() {
        cb cbVar = this.mBinding;
        if (cbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cbVar = null;
        }
        cbVar.b.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadApplicationActivity.M1(this.a, view);
            }
        });
    }

    public static final void M1(DownloadApplicationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cb cbVar = this$0.mBinding;
        if (cbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cbVar = null;
        }
        cbVar.c.destroy();
        this$0.finish();
    }

    public static final void N1(DownloadApplicationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cb cbVar = this$0.mBinding;
        if (cbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cbVar = null;
        }
        cbVar.c.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(boolean visible) {
        if (visible) {
            try {
                this.progress = new rw4(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException e) {
                e.printStackTrace();
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

    public final void E1(final String url, final String userAgent, String contentDisposition, final String mimetype, long contentLength) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(contentDisposition, "contentDisposition");
        Intrinsics.checkNotNullParameter(mimetype, "mimetype");
        Log.d("File Name", URLUtil.guessFileName(url, contentDisposition, mimetype));
        Log.d("Content Length", String.valueOf(contentLength));
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_download_file);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.msg_title);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.msg_body);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_ok);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById4;
        dialog.show();
        ((TextView) viewFindViewById).setText(getString(R.string.download_rcpt));
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.do_you_want));
        sb.append("Fee_Receipt_");
        String str = this.app_no;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app_no");
            str = null;
        }
        sb.append(str);
        textView.setText(sb.toString());
        textView2.setText(getString(R.string.ok_text));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadApplicationActivity.F1(url, mimetype, userAgent, this, dialog, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ou1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadApplicationActivity.G1(dialog, view);
            }
        });
    }

    public final AppCompatImageView H1() {
        AppCompatImageView appCompatImageView = this.back_icon;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("back_icon");
        return null;
    }

    public final wa3 I1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void O1(AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
        this.back_icon = appCompatImageView;
    }

    public final void P1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cb cbVarC = cb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cbVarC, "inflate(...)");
        this.mBinding = cbVarC;
        cb cbVar = null;
        if (cbVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cbVarC = null;
        }
        setContentView(cbVarC.b());
        P1(new wa3(this));
        cb cbVar2 = this.mBinding;
        if (cbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            cbVar = cbVar2;
        }
        cbVar.b.f.setText(I1().b("logo_reprint_receipt", getString(R.string.reprint_receipt)));
        View viewFindViewById = findViewById(R.id.back_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        O1((AppCompatImageView) viewFindViewById);
        H1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ku1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadApplicationActivity.N1(this.a, view);
            }
        });
        J1();
        L1();
    }
}
