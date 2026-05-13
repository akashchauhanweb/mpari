package com.nic.mparivahan.VahanServices;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.SlotReceiptWebView;
import com.zepto.o36;
import com.zepto.pq;
import com.zepto.qb2;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J/\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010&R\u001c\u00102\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/VahanServices/SlotReceiptWebView;", "Lcom/zepto/pq;", "", "u1", "A1", "E1", "B1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "q1", "r1", "C", "I", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "Lcom/zepto/o36;", "D", "Lcom/zepto/o36;", "s1", "()Lcom/zepto/o36;", "C1", "(Lcom/zepto/o36;)V", "binding", "E", "Ljava/lang/String;", "receiptUrl", "F", "oldUrl", "G", "Z", "doubleBackToExitPressedOnce", "H", "apptId", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "myExecutor", "Landroid/os/Handler;", "J", "Landroid/os/Handler;", "myHandler", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "D1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSlotReceiptWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotReceiptWebView.kt\ncom/nic/mparivahan/VahanServices/SlotReceiptWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,293:1\n1#2:294\n*E\n"})
public final class SlotReceiptWebView extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public o36 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean doubleBackToExitPressedOnce;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final int PERMISSION_CODE_READ_EXTERNAL_STORAGE = 10210;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String receiptUrl = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String oldUrl = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String apptId = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final ExecutorService myExecutor = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final Handler myHandler = new Handler(Looper.getMainLooper());

    public static final class a extends WebViewClient {
        public boolean a;

        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (!this.a) {
                SlotReceiptWebView.this.A1();
                return;
            }
            SlotReceiptWebView.this.t1().dismiss();
            try {
                SlotReceiptWebView.this.r1();
            } catch (Exception unused) {
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.a = true;
            Log.e("test", String.valueOf(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1() {
        try {
            t1().show();
            s1().e.invalidate();
            s1().e.getSettings().setJavaScriptEnabled(true);
            s1().e.getSettings().setSupportZoom(true);
            s1().e.loadUrl("http://docs.google.com/gview?embedded=true&url=" + this.receiptUrl);
            s1().e.setWebViewClient(new a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void B1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void E1() {
        if (this.doubleBackToExitPressedOnce) {
            onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, getString(R.string.double_click_to_exit), 0).show();
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.p36
            @Override // java.lang.Runnable
            public final void run() {
                SlotReceiptWebView.F1(this.c);
            }
        }, 2000L);
    }

    public static final void F1(SlotReceiptWebView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doubleBackToExitPressedOnce = false;
    }

    private final void u1() {
        s1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotReceiptWebView.v1(this.a, view);
            }
        });
        s1().b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotReceiptWebView.w1(this.a, view);
            }
        });
        s1().e.getSettings().setJavaScriptEnabled(true);
        Log.v("Url", this.receiptUrl);
        s1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotReceiptWebView.x1(this.a, view);
            }
        });
    }

    public static final void v1(SlotReceiptWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.s1().e.canGoBack()) {
            this$0.s1().e.goBack();
        } else {
            this$0.E1();
        }
    }

    public static final void w1(SlotReceiptWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1();
    }

    public static final void x1(final SlotReceiptWebView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.myExecutor.execute(new Runnable() { // from class: com.zepto.t36
            @Override // java.lang.Runnable
            public final void run() {
                SlotReceiptWebView.y1(this.c);
            }
        });
    }

    public static final void y1(final SlotReceiptWebView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.oldUrl;
        String str2 = this$0.apptId;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan/", "Slot");
        if (!file.exists()) {
            file.mkdir();
        }
        qb2.a.a(str, new File(file.getPath() + '/' + str2 + ".pdf"));
        this$0.myHandler.post(new Runnable() { // from class: com.zepto.u36
            @Override // java.lang.Runnable
            public final void run() {
                SlotReceiptWebView.z1(this.c);
            }
        });
    }

    public static final void z1(SlotReceiptWebView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0, "File Downloaded", 0).show();
    }

    public final void C1(o36 o36Var) {
        Intrinsics.checkNotNullParameter(o36Var, "<set-?>");
        this.binding = o36Var;
    }

    public final void D1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slot_receipt_activity);
        o36 o36VarC = o36.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o36VarC, "inflate(...)");
        C1(o36VarC);
        setContentView(s1().b());
        D1(new ProgressDialog(this));
        t1().setMessage("Please wait...");
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        if (getIntent() != null) {
            if (getIntent().hasExtra("receiptUrl")) {
                String stringExtra = getIntent().getStringExtra("receiptUrl");
                Intrinsics.checkNotNull(stringExtra);
                this.receiptUrl = stringExtra;
            }
            if (getIntent().hasExtra("apptId")) {
                String stringExtra2 = getIntent().getStringExtra("apptId");
                Intrinsics.checkNotNull(stringExtra2);
                this.apptId = stringExtra2;
            }
        }
        this.oldUrl = this.receiptUrl;
        q1();
        u1();
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        if (s1().e.canGoBack()) {
            s1().e.goBack();
            return true;
        }
        E1();
        return true;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.PERMISSION_CODE_READ_EXTERNAL_STORAGE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                A1();
            } else {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
            }
        }
    }

    public final void q1() {
        if (checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, this.PERMISSION_CODE_READ_EXTERNAL_STORAGE);
        } else {
            A1();
        }
    }

    public final void r1() {
        try {
            Object systemService = getSystemService("download");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.oldUrl));
            request.setNotificationVisibility(1);
            request.setDestinationInExternalFilesDir(getApplicationContext(), Environment.DIRECTORY_DOWNLOADS, "");
            request.setTitle(this.apptId);
            ((DownloadManager) systemService).enqueue(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final o36 s1() {
        o36 o36Var = this.binding;
        if (o36Var != null) {
            return o36Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
