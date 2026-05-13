package com.nic.mparivahan.PdfViewer;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.Toast;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.ik4;
import com.zepto.jk4;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.o40;
import com.zepto.pe;
import com.zepto.rr6;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xr2;
import java.io.File;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 22\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\"\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/nic/mparivahan/PdfViewer/PdfViewActivity;", "Lcom/zepto/o40;", "", "J0", "Landroid/net/Uri;", "uri", "H1", "Ljava/io/File;", "file", "G1", "B1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/content/Context;", "context", "Lcom/zepto/jk4;", "C1", "Lcom/zepto/pe;", "F", "Lcom/zepto/pe;", "mBinding", "Lcom/zepto/ws6;", "G", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "F1", "(Lcom/zepto/ws6;)V", "sessionManager", "H", "Ljava/io/File;", "downloadedFile", "", "I", "Ljava/lang/String;", "getNewReceiptUrl", "()Ljava/lang/String;", "setNewReceiptUrl", "(Ljava/lang/String;)V", "newReceiptUrl", "<init>", "()V", "J", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class PdfViewActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public pe mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public File downloadedFile;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String newReceiptUrl = "";

    public static final class b extends BroadcastReceiver {
        public final /* synthetic */ Ref.LongRef a;
        public final /* synthetic */ DownloadManager b;
        public final /* synthetic */ PdfViewActivity c;
        public final /* synthetic */ Ref.ObjectRef d;

        public b(Ref.LongRef longRef, DownloadManager downloadManager, PdfViewActivity pdfViewActivity, Ref.ObjectRef objectRef) {
            this.a = longRef;
            this.b = downloadManager;
            this.c = pdfViewActivity;
            this.d = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            Intrinsics.checkNotNullParameter(intent, "intent");
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            if (longExtra == this.a.element) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(longExtra);
                Cursor cursorQuery = this.b.query(query);
                Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
                cursorQuery.moveToFirst();
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
                str = "";
                if (i == 8) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"));
                    if (string != null) {
                        String path = Uri.parse(string).getPath();
                        File file = new File(path != null ? path : "");
                        if (file.exists()) {
                            this.c.G1(file);
                        }
                    }
                    Toast.makeText(this.c, ((String) this.d.element) + " successfully saved in storage.", 0).show();
                    return;
                }
                if (i != 16) {
                    return;
                }
                switch (i2) {
                    case 1000:
                        str = "ERROR_UNKNOWN";
                        break;
                    case 1001:
                        str = "ERROR_FILE_ERROR";
                        break;
                    case 1002:
                        str = "ERROR_UNHANDLED_HTTP_CODE";
                        break;
                    case 1004:
                        str = "ERROR_HTTP_DATA_ERROR";
                        break;
                    case 1005:
                        str = "ERROR_TOO_MANY_REDIRECTS";
                        break;
                    case 1006:
                        str = "ERROR_INSUFFICIENT_SPACE";
                        break;
                    case 1007:
                        str = "ERROR_DEVICE_NOT_FOUND";
                        break;
                    case 1008:
                        str = "ERROR_CANNOT_RESUME";
                        break;
                    case 1009:
                        str = "ERROR_FILE_ALREADY_EXISTS";
                        break;
                }
                Toast.makeText(this.c, "Download failed because " + str, 0).show();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    private final void B1() {
        try {
            String str = this.newReceiptUrl;
            ws6 ws6Var = new ws6(this);
            String cookie = CookieManager.getInstance().getCookie(str);
            Object systemService = getSystemService("download");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            DownloadManager downloadManager = (DownloadManager) systemService;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.addRequestHeader("Cookie", cookie);
            request.addRequestHeader(xr2.HEADER_CONTENT_TYPE, "application/pdf");
            request.addRequestHeader("Authorization", "Bearer " + ws6Var.r());
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, getIntent().getStringExtra("formType") + '_' + getIntent().getStringExtra("applNo") + '_' + System.currentTimeMillis() + ".pdf");
            request.setTitle(getIntent().getStringExtra("formType"));
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = getIntent().getStringExtra("formType");
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = downloadManager.enqueue(request);
            registerReceiver(new b(longRef, downloadManager, this, objectRef), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void D1(PdfViewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0, "Error in Downloading File : ", 1);
        File file = this$0.downloadedFile;
        File file2 = null;
        if (file == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadedFile");
            file = null;
        }
        if (file.exists()) {
            File file3 = this$0.downloadedFile;
            if (file3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadedFile");
            } else {
                file2 = file3;
            }
            Uri uri = Uri.parse(file2.getPath());
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("application/pdf");
            intent.putExtra("android.intent.extra.STREAM", uri);
            this$0.startActivity(Intent.createChooser(intent, "Share Via"));
        }
    }

    public static final void E1(PdfViewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(File file) {
        pe peVar = this.mBinding;
        if (peVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            peVar = null;
        }
        peVar.x.U0(file).V0();
    }

    private final void H1(Uri uri) {
        if (uri != null) {
            pe peVar = this.mBinding;
            if (peVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                peVar = null;
            }
            peVar.x.U0(rr6.a(uri)).V0();
        }
    }

    private final void J0() {
        F1(new ws6(this));
        ik4.d(getApplicationContext(), C1(this));
        pe peVar = this.mBinding;
        if (peVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            peVar = null;
        }
        peVar.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdfViewActivity.D1(this.a, view);
            }
        });
    }

    public final jk4 C1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.napix);
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(inputStreamOpenRawResource);
            inputStreamOpenRawResource.close();
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setCertificateEntry("server", certificateGenerateCertificate);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagers, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            jk4 jk4VarA = jk4.f().a();
            Intrinsics.checkNotNullExpressionValue(jk4VarA, "build(...)");
            return jk4VarA;
        } catch (Exception e) {
            throw new RuntimeException("Failed to configure SSL: " + e.getMessage(), e);
        }
    }

    public final void F1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 99 && resultCode == -1 && data != null) {
            H1(data.getData());
        }
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_pdf);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (pe) lq7VarF;
        this.newReceiptUrl = String.valueOf(getIntent().getStringExtra("url"));
        wa3 wa3Var = new wa3(this);
        pe peVar = null;
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra("formType"), "RC Particular Certificate", true)) {
            pe peVar2 = this.mBinding;
            if (peVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                peVar2 = null;
            }
            peVar2.w.i.setText(wa3Var.b("print_rc_particular", "RC Particular Certificate"));
        } else if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra("formType"), "Fee Receipt", true)) {
            pe peVar3 = this.mBinding;
            if (peVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                peVar3 = null;
            }
            peVar3.w.i.setText(wa3Var.b("label_fee_receipt", "Fee Receipt"));
        } else {
            String stringExtra = getIntent().getStringExtra("formType");
            Intrinsics.checkNotNull(stringExtra);
            if (StringsKt__StringsKt.contains((CharSequence) stringExtra, (CharSequence) "Form", true)) {
                pe peVar4 = this.mBinding;
                if (peVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    peVar4 = null;
                }
                peVar4.w.i.setText(wa3Var.b("download_forms", "Download " + getIntent().getStringExtra("formType")));
            } else {
                String stringExtra2 = getIntent().getStringExtra("formType");
                Intrinsics.checkNotNull(stringExtra2);
                if (StringsKt__StringsKt.contains((CharSequence) stringExtra2, (CharSequence) "Appointment Receipt", true)) {
                    pe peVar5 = this.mBinding;
                    if (peVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        peVar5 = null;
                    }
                    peVar5.w.i.setText(wa3Var.b("download_appointment_receipt", "Download Appointment Receipt"));
                } else {
                    String stringExtra3 = getIntent().getStringExtra("formType");
                    Intrinsics.checkNotNull(stringExtra3);
                    if (StringsKt__StringsKt.contains((CharSequence) stringExtra3, (CharSequence) VContant.NOC, true)) {
                        pe peVar6 = this.mBinding;
                        if (peVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            peVar6 = null;
                        }
                        peVar6.w.i.setText(wa3Var.b("download_appointment_receipt", "Download NOC Certificate"));
                    } else if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra("formType"), "Tax Receipt", true)) {
                        pe peVar7 = this.mBinding;
                        if (peVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            peVar7 = null;
                        }
                        peVar7.w.i.setText("Download Checkpost Tax Receipt");
                    }
                }
            }
        }
        pe peVar8 = this.mBinding;
        if (peVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            peVar = peVar8;
        }
        peVar.w.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdfViewActivity.E1(this.a, view);
            }
        });
        J0();
        B1();
    }
}
