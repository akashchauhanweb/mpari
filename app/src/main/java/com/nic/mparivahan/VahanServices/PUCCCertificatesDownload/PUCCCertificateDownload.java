package com.nic.mparivahan.VahanServices.PUCCCertificatesDownload;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.PDFViewInternalAcitvity;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateDownload;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCertificateServices.PUCCertifiateServices;
import com.zepto.gd1;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sk4;
import com.zepto.ta3;
import com.zepto.tk4;
import com.zepto.ue;
import com.zepto.uk4;
import com.zepto.wa3;
import com.zepto.yy0;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/nic/mparivahan/VahanServices/PUCCCertificatesDownload/PUCCCertificateDownload;", "Lcom/zepto/pq;", "", "x1", "C1", "", "pfileName", "q1", "it", "J1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/ue;", "C", "Lcom/zepto/ue;", "s1", "()Lcom/zepto/ue;", "E1", "(Lcom/zepto/ue;)V", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "G1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "E", "Landroid/widget/ImageView;", "r1", "()Landroid/widget/ImageView;", "D1", "(Landroid/widget/ImageView;)V", "back_image", "Lcom/zepto/sk4;", "F", "Lcom/zepto/sk4;", "w1", "()Lcom/zepto/sk4;", "I1", "(Lcom/zepto/sk4;)V", "pucViewModel", "Lcom/nic/mparivahan/VahanServices/PUCCCertificatesDownload/PUCCertificateServices/PUCCertifiateServices;", "G", "Lcom/nic/mparivahan/VahanServices/PUCCCertificatesDownload/PUCCertificateServices/PUCCertifiateServices;", "v1", "()Lcom/nic/mparivahan/VahanServices/PUCCCertificatesDownload/PUCCertificateServices/PUCCertifiateServices;", "H1", "(Lcom/nic/mparivahan/VahanServices/PUCCCertificatesDownload/PUCCertificateServices/PUCCertifiateServices;)V", "pucService", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "F1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class PUCCCertificateDownload extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ue binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ImageView back_image;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public sk4 pucViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public PUCCertifiateServices pucService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 langSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                PUCCCertificateDownload.this.u1().dismiss();
                if (gd1.a.m(str)) {
                    return;
                }
                PUCCCertificateDownload pUCCCertificateDownload = PUCCCertificateDownload.this;
                Intrinsics.checkNotNull(str);
                pUCCCertificateDownload.q1(StringsKt__StringsKt.trim((CharSequence) str).toString());
            } catch (Exception unused) {
            }
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            PUCCCertificateDownload.this.u1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                PUCCCertificateDownload.this.J1("Error");
            } else {
                PUCCCertificateDownload.this.J1(str);
            }
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void A1(PUCCCertificateDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.s1().g.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() < 2) {
            Toast.makeText(this$0, this$0.t1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)), 1).show();
            return;
        }
        Editable text2 = this$0.s1().c.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 2) {
            Toast.makeText(this$0, this$0.t1().b("PLEASE_ENTER_CHASSI", this$0.getString(R.string.please_enter_chassis_no)), 1).show();
        } else {
            this$0.w1().j(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this$0.s1().g.getText())).toString(), StringsKt__StringsKt.trim((CharSequence) String.valueOf(this$0.s1().c.getText())).toString(), this$0);
            this$0.u1().show();
        }
    }

    public static final void B1(PUCCCertificateDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void C1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText(t1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PUCCCertificateDownload.K1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PUCCCertificateDownload.L1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1(String pfileName) {
        Log.e("callentered", "entered tp call");
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            method.invoke(null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(this, (Class<?>) PDFViewInternalAcitvity.class);
        intent.putExtra("HeaderName", "Download Pollution Fitness Certificate");
        StringBuilder sb = new StringBuilder();
        sb.append((Object) s1().g.getText());
        sb.append(System.currentTimeMillis());
        intent.putExtra("pdfname", sb.toString());
        startActivity(intent);
    }

    private final void x1() {
        s1().e.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PUCCCertificateDownload.y1(this.a, view);
            }
        });
        s1().e.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ok4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PUCCCertificateDownload.z1(this.a, view);
            }
        });
        s1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PUCCCertificateDownload.A1(this.a, view);
            }
        });
        w1().h().g(this, new c(new a()));
        w1().i().g(this, new c(new b()));
    }

    public static final void y1(PUCCCertificateDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void z1(PUCCCertificateDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1();
    }

    public final void D1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.back_image = imageView;
    }

    public final void E1(ue ueVar) {
        Intrinsics.checkNotNullParameter(ueVar, "<set-?>");
        this.binding = ueVar;
    }

    public final void F1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void G1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void H1(PUCCertifiateServices pUCCertifiateServices) {
        Intrinsics.checkNotNullParameter(pUCCertifiateServices, "<set-?>");
        this.pucService = pUCCertifiateServices;
    }

    public final void I1(sk4 sk4Var) {
        Intrinsics.checkNotNullParameter(sk4Var, "<set-?>");
        this.pucViewModel = sk4Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ue ueVarC = ue.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ueVarC, "inflate(...)");
        E1(ueVarC);
        setContentView(s1().b());
        ta3.a.F1(this, s1());
        View viewFindViewById = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        D1((ImageView) viewFindViewById);
        F1(new wa3(this));
        s1().e.i.setText(getIntent().getStringExtra("ServiceName"));
        G1(new ProgressDialog(this));
        u1().setMessage(t1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        H1(PUCCertifiateServices.INSTANCE.a(this));
        I1((sk4) new z(this, new tk4(new uk4(v1()))).a(sk4.class));
        x1();
        r1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PUCCCertificateDownload.B1(this.a, view);
            }
        });
    }

    public final ImageView r1() {
        ImageView imageView = this.back_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("back_image");
        return null;
    }

    public final ue s1() {
        ue ueVar = this.binding;
        if (ueVar != null) {
            return ueVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final PUCCertifiateServices v1() {
        PUCCertifiateServices pUCCertifiateServices = this.pucService;
        if (pUCCertifiateServices != null) {
            return pUCCertifiateServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pucService");
        return null;
    }

    public final sk4 w1() {
        sk4 sk4Var = this.pucViewModel;
        if (sk4Var != null) {
            return sk4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pucViewModel");
        return null;
    }
}
