package com.nic.mparivahan.VahanServices.VahanPayment;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadFormsActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.VahanlogCapture;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreenRe;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.dl4;
import com.zepto.ih;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.wa3;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bQ\u0010RJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010*R\u0016\u00109\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010*R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010*R\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010*R\"\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010*\u001a\u0004\bN\u0010,\"\u0004\bO\u0010.¨\u0006S"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPayment/VahanPaymentStatusScreenRe;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "it", "", "J1", "I1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "t1", "R1", "Lcom/zepto/ld7;", "C", "Lcom/zepto/ld7;", "B1", "()Lcom/zepto/ld7;", "Q1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "P1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "y1", "()Landroid/app/ProgressDialog;", "M1", "(Landroid/app/ProgressDialog;)V", "pDialog", "F", "Ljava/lang/String;", "w1", "()Ljava/lang/String;", "K1", "(Ljava/lang/String;)V", "enc_string", "Lcom/zepto/ih;", "G", "Lcom/zepto/ih;", "binding", "H", "stateCd", "I", "offCd", "J", "receiptNo", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "L1", "(Lcom/zepto/wa3;)V", "languageSession", "L", "rcNo", "M", "purCd", "N", "Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "N1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;)V", "payment_response", "O", "getRc_number", "O1", "rc_number", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanPaymentStatusScreenRe extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String enc_string;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ih binding;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public AfterPaymentResponse payment_response;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String offCd = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String receiptNo = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String purCd = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(AfterPaymentResponse afterPaymentResponse) throws Throwable {
            try {
                VahanPaymentStatusScreenRe vahanPaymentStatusScreenRe = VahanPaymentStatusScreenRe.this;
                Intrinsics.checkNotNull(afterPaymentResponse);
                vahanPaymentStatusScreenRe.N1(afterPaymentResponse);
                VahanPaymentStatusScreenRe.this.J1(afterPaymentResponse);
                VahanlogCapture.Companion companion = VahanlogCapture.INSTANCE;
                VahanPaymentStatusScreenRe vahanPaymentStatusScreenRe2 = VahanPaymentStatusScreenRe.this;
                companion.a(vahanPaymentStatusScreenRe2, vahanPaymentStatusScreenRe2.z1(), 1);
            } catch (Exception e) {
                VahanPaymentStatusScreenRe.this.y1().dismiss();
                e.printStackTrace();
                ih ihVar = VahanPaymentStatusScreenRe.this.binding;
                if (ihVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ihVar = null;
                }
                ihVar.l.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((AfterPaymentResponse) obj);
            return Unit.INSTANCE;
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

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(String str) {
            VahanPaymentStatusScreenRe.this.y1().dismiss();
            ih ihVar = VahanPaymentStatusScreenRe.this.binding;
            if (ihVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ihVar = null;
            }
            ihVar.l.setVisibility(8);
            if (StringsKt__StringsJVMKt.equals(str.toString(), "Error", true)) {
                VahanPaymentStatusScreenRe vahanPaymentStatusScreenRe = VahanPaymentStatusScreenRe.this;
                vahanPaymentStatusScreenRe.R1(vahanPaymentStatusScreenRe, "unable to process request, please try again");
            } else {
                VahanPaymentStatusScreenRe vahanPaymentStatusScreenRe2 = VahanPaymentStatusScreenRe.this;
                vahanPaymentStatusScreenRe2.R1(vahanPaymentStatusScreenRe2, str);
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

    public static final void C1(VahanPaymentStatusScreenRe this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1(this$0, this$0.x1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void D1(VahanPaymentStatusScreenRe this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1();
    }

    public static final void E1(VahanPaymentStatusScreenRe this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void F1(VahanPaymentStatusScreenRe this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ih ihVar = this$0.binding;
        ih ihVar2 = null;
        if (ihVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar = null;
        }
        String string = ihVar.e.getText().toString();
        if (string.length() > 0) {
            String str = s14.a.i() + "printreciept/" + this$0.stateCd + '/' + this$0.offCd + '/' + string + '/' + this$0.rcNo + '/' + this$0.purCd;
            Intent intent = new Intent(this$0, (Class<?>) PdfViewActivity.class);
            intent.putExtra("url", str);
            intent.putExtra("formType", "Fee Receipt");
            StringBuilder sb = new StringBuilder();
            sb.append(this$0.rcNo);
            sb.append('_');
            ih ihVar3 = this$0.binding;
            if (ihVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ihVar2 = ihVar3;
            }
            sb.append((Object) ihVar2.e.getText());
            intent.putExtra("applNo", sb.toString());
            this$0.startActivity(intent);
        }
    }

    public static final void G1(VahanPaymentStatusScreenRe this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ih ihVar = null;
        if (!StringsKt__StringsJVMKt.equals$default(this$0.z1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, null)) {
            Intent intent = new Intent(this$0, (Class<?>) DownloadFormsActivity.class);
            intent.putExtra("state_code", this$0.z1().getState_cd());
            intent.putExtra("off_code", this$0.z1().getOff_cd());
            intent.putExtra("rc_number", this$0.z1().getRegn_no());
            intent.putExtra("appl_no", this$0.z1().getAppl_no());
            this$0.startActivity(intent);
            return;
        }
        ih ihVar2 = this$0.binding;
        if (ihVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar2 = null;
        }
        String string = ihVar2.e.getText().toString();
        String rcpt_NO = this$0.z1().getRcpt_NO();
        String str = "https://vahan.parivahan.gov.in/vahancapi-common/getVehicleParticularDobj/" + this$0.offCd + '/' + this$0.rcNo + '/' + string + '/' + this$0.purCd + '/' + (rcpt_NO != null ? StringsKt__StringsKt.trim((CharSequence) rcpt_NO).toString() : null) + '/' + this$0.stateCd;
        Intent intent2 = new Intent(this$0, (Class<?>) PdfViewActivity.class);
        intent2.putExtra("url", str);
        intent2.putExtra("formType", "RC Particular Certificate");
        StringBuilder sb = new StringBuilder();
        sb.append(this$0.rcNo);
        sb.append('_');
        ih ihVar3 = this$0.binding;
        if (ihVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ihVar = ihVar3;
        }
        sb.append((Object) ihVar.e.getText());
        intent2.putExtra("applNo", sb.toString());
        this$0.startActivity(intent2);
    }

    public static final void H1(View view) {
    }

    private final void I1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J1(com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse r12) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreenRe.J1(com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse):void");
    }

    public static final void S1(Dialog d, Context context, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(context, "$context");
        d.dismiss();
        ((Activity) context).finish();
    }

    public static final void u1(Dialog d, VahanPaymentStatusScreenRe this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        new dl4(this$0).g(1);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void v1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final VahanProService A1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 B1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enc_string = str;
    }

    public final void L1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void M1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void N1(AfterPaymentResponse afterPaymentResponse) {
        Intrinsics.checkNotNullParameter(afterPaymentResponse, "<set-?>");
        this.payment_response = afterPaymentResponse;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void P1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void Q1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void R1(final Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.S1(dialog, context, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        t1(this, x1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_payment_status_screen);
        ih ihVarC = ih.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ihVarC, "inflate(...)");
        this.binding = ihVarC;
        ih ihVar = null;
        if (ihVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVarC = null;
        }
        setContentView(ihVarC.b());
        getWindow().addFlags(128);
        ta3.a aVar = ta3.a;
        ih ihVar2 = this.binding;
        if (ihVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar2 = null;
        }
        aVar.m2(this, ihVar2);
        L1(new wa3(this));
        P1(VahanProService.INSTANCE.a(this));
        K1(String.valueOf(getIntent().getStringExtra("EncString")));
        O1(String.valueOf(getIntent().getStringExtra("RC")));
        M1(new ProgressDialog(this));
        y1().setMessage("Please wait...");
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        Q1((ld7) new z(this, new kd7(new jd7(A1()))).a(ld7.class));
        y1().show();
        B1().t(this, w1());
        B1().B0().g(this, new c(new a()));
        B1().C0().g(this, new c(new b()));
        ih ihVar3 = this.binding;
        if (ihVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar3 = null;
        }
        ihVar3.s.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.C1(this.a, view);
            }
        });
        ih ihVar4 = this.binding;
        if (ihVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar4 = null;
        }
        ihVar4.s.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.D1(this.a, view);
            }
        });
        ih ihVar5 = this.binding;
        if (ihVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar5 = null;
        }
        ihVar5.u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.E1(this.a, view);
            }
        });
        ih ihVar6 = this.binding;
        if (ihVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar6 = null;
        }
        ihVar6.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.F1(this.a, view);
            }
        });
        ih ihVar7 = this.binding;
        if (ihVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar7 = null;
        }
        ihVar7.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.G1(this.a, view);
            }
        });
        ih ihVar8 = this.binding;
        if (ihVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ihVar = ihVar8;
        }
        ihVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ad7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.H1(view);
            }
        });
    }

    public final void t1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
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
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(this);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.u1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreenRe.v1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String w1() {
        String str = this.enc_string;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enc_string");
        return null;
    }

    public final wa3 x1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final AfterPaymentResponse z1() {
        AfterPaymentResponse afterPaymentResponse = this.payment_response;
        if (afterPaymentResponse != null) {
            return afterPaymentResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payment_response");
        return null;
    }
}
