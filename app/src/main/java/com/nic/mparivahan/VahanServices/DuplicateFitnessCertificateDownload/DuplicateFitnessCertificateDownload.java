package com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload;

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
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCService.DFCServices;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DuplicateFitnessCertificateDownload;
import com.zepto.l51;
import com.zepto.m51;
import com.zepto.mb;
import com.zepto.mf4;
import com.zepto.n51;
import com.zepto.pq;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DuplicateFitnessCertificateDownload;", "Lcom/zepto/pq;", "", "x1", "C1", "", "it", "J1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPause", "onResume", "pfileName", "q1", "Lcom/zepto/mb;", "C", "Lcom/zepto/mb;", "s1", "()Lcom/zepto/mb;", "E1", "(Lcom/zepto/mb;)V", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "I1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "E", "Landroid/widget/ImageView;", "r1", "()Landroid/widget/ImageView;", "D1", "(Landroid/widget/ImageView;)V", "back_image", "Lcom/zepto/n51;", "F", "Lcom/zepto/n51;", "u1", "()Lcom/zepto/n51;", "G1", "(Lcom/zepto/n51;)V", "dfcViewModel", "Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCService/DFCServices;", "G", "Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCService/DFCServices;", "t1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCService/DFCServices;", "F1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCService/DFCServices;)V", "dfcServices", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "H1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DuplicateFitnessCertificateDownload extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public mb binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ImageView back_image;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public n51 dfcViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public DFCServices dfcServices;

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
                DuplicateFitnessCertificateDownload.this.w1().dismiss();
                DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload = DuplicateFitnessCertificateDownload.this;
                Intrinsics.checkNotNull(str);
                duplicateFitnessCertificateDownload.q1(StringsKt__StringsKt.trim((CharSequence) str).toString());
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
            DuplicateFitnessCertificateDownload.this.w1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                DuplicateFitnessCertificateDownload.this.J1("Error");
            } else {
                DuplicateFitnessCertificateDownload.this.J1(str);
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

    public static final void A1(DuplicateFitnessCertificateDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.s1().b.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() < 2) {
            Toast.makeText(this$0, "Please enter application No.", 1).show();
        } else {
            this$0.u1().j(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this$0.s1().b.getText())).toString(), this$0);
            this$0.w1().show();
        }
    }

    public static final void B1(DuplicateFitnessCertificateDownload this$0, View view) {
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
        textView.setText(v1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateFitnessCertificateDownload.K1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateFitnessCertificateDownload.L1(dialog, view);
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

    private final void x1() {
        s1().d.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ey1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateFitnessCertificateDownload.y1(this.a, view);
            }
        });
        s1().d.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateFitnessCertificateDownload.z1(this.a, view);
            }
        });
        s1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateFitnessCertificateDownload.A1(this.a, view);
            }
        });
        u1().h().g(this, new c(new a()));
        u1().i().g(this, new c(new b()));
    }

    public static final void y1(DuplicateFitnessCertificateDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void z1(DuplicateFitnessCertificateDownload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1();
    }

    public final void D1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.back_image = imageView;
    }

    public final void E1(mb mbVar) {
        Intrinsics.checkNotNullParameter(mbVar, "<set-?>");
        this.binding = mbVar;
    }

    public final void F1(DFCServices dFCServices) {
        Intrinsics.checkNotNullParameter(dFCServices, "<set-?>");
        this.dfcServices = dFCServices;
    }

    public final void G1(n51 n51Var) {
        Intrinsics.checkNotNullParameter(n51Var, "<set-?>");
        this.dfcViewModel = n51Var;
    }

    public final void H1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void I1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mb mbVarC = mb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(mbVarC, "inflate(...)");
        E1(mbVarC);
        setContentView(s1().b());
        View viewFindViewById = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        D1((ImageView) viewFindViewById);
        H1(new wa3(this));
        s1().d.i.setText("Download Duplicate Fitness Certificate");
        I1(new ProgressDialog(this));
        w1().setMessage(v1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        F1(DFCServices.INSTANCE.a(this));
        G1((n51) new z(this, new l51(new m51(t1()))).a(n51.class));
        x1();
        r1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateFitnessCertificateDownload.B1(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
    }

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
        intent.putExtra("HeaderName", "Download Duplicate Fitness Certificate");
        StringBuilder sb = new StringBuilder();
        sb.append((Object) s1().b.getText());
        sb.append(System.currentTimeMillis());
        intent.putExtra("pdfname", sb.toString());
        startActivity(intent);
    }

    public final ImageView r1() {
        ImageView imageView = this.back_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("back_image");
        return null;
    }

    public final mb s1() {
        mb mbVar = this.binding;
        if (mbVar != null) {
            return mbVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DFCServices t1() {
        DFCServices dFCServices = this.dfcServices;
        if (dFCServices != null) {
            return dFCServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dfcServices");
        return null;
    }

    public final n51 u1() {
        n51 n51Var = this.dfcViewModel;
        if (n51Var != null) {
            return n51Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dfcViewModel");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
