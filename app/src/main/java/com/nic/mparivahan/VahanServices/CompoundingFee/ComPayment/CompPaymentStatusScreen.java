package com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment.CompPaymentStatusScreen;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransaction;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.dl4;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.me;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.wa3;
import com.zepto.yy0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bN\u0010OJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010+R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010+R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010+R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010+R\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010+R\"\u0010M\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lcom/nic/mparivahan/VahanServices/CompoundingFee/ComPayment/CompPaymentStatusScreen;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "it", "", "L1", "I1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "u1", "S1", "J1", "Lcom/zepto/ld7;", "C", "Lcom/zepto/ld7;", "B1", "()Lcom/zepto/ld7;", "R1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "O1", "(Landroid/app/ProgressDialog;)V", "pDialog", "F", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "M1", "(Ljava/lang/String;)V", "enc_string", "Lcom/zepto/me;", "G", "Lcom/zepto/me;", "binding", "H", "stateCd", "I", "offCd", "J", "receiptNo", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "N1", "(Lcom/zepto/wa3;)V", "languageSession", "L", "rcNo", "M", "purCd", "N", "Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "getPayment_response", "()Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "P1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;)V", "payment_response", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CompPaymentStatusScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String enc_string;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public me binding;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public AfterPaymentResponse payment_response;

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

        public final void a(AfterPaymentResponse afterPaymentResponse) {
            try {
                CompPaymentStatusScreen.this.z1().dismiss();
                CompPaymentStatusScreen compPaymentStatusScreen = CompPaymentStatusScreen.this;
                Intrinsics.checkNotNull(afterPaymentResponse);
                compPaymentStatusScreen.P1(afterPaymentResponse);
                CompPaymentStatusScreen.this.L1(afterPaymentResponse);
            } catch (Exception e) {
                CompPaymentStatusScreen.this.z1().dismiss();
                e.printStackTrace();
                me meVar = CompPaymentStatusScreen.this.binding;
                if (meVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    meVar = null;
                }
                meVar.l.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
            CompPaymentStatusScreen.this.z1().dismiss();
            me meVar = CompPaymentStatusScreen.this.binding;
            if (meVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                meVar = null;
            }
            meVar.l.setVisibility(8);
            CompPaymentStatusScreen compPaymentStatusScreen = CompPaymentStatusScreen.this;
            compPaymentStatusScreen.J1(compPaymentStatusScreen, "Please try after some time");
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

    public static final void C1(CompPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1(this$0, "Are you sure you want to leave?");
    }

    public static final void D1(CompPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1();
    }

    public static final void E1(CompPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1();
    }

    public static final void F1(CompPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        me meVar = this$0.binding;
        me meVar2 = null;
        if (meVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVar = null;
        }
        String string = meVar.e.getText().toString();
        if (string.length() <= 0) {
            Log.e("receiptUrl", "Not Calling...");
            return;
        }
        try {
            String str = s14.a.i() + "printreciept/" + this$0.stateCd + '/' + this$0.offCd + '/' + string + '/' + this$0.rcNo + '/' + this$0.purCd;
            Log.e("receiptUrl", str);
            Intent intent = new Intent(this$0, (Class<?>) PdfViewActivity.class);
            intent.putExtra("url", str);
            intent.putExtra("formType", "Fee Receipt");
            StringBuilder sb = new StringBuilder();
            sb.append(this$0.rcNo);
            sb.append('_');
            me meVar3 = this$0.binding;
            if (meVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                meVar2 = meVar3;
            }
            sb.append((Object) meVar2.e.getText());
            intent.putExtra("applNo", sb.toString());
            this$0.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void G1(CompPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanVerifyPendingTransaction.class));
        this$0.finish();
    }

    public static final void H1(CompPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1(this$0, "Are you sure you want to leave?");
    }

    private final void I1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void v1(Dialog d, CompPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        new dl4(this$0).g(1);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(Dialog d, View view) {
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

    public final void J1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ws0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.K1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void L1(AfterPaymentResponse it) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        me meVar = this.binding;
        me meVar2 = null;
        if (meVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVar = null;
        }
        meVar.l.setVisibility(0);
        if (it != null) {
            try {
                String regn_no = it.getRegn_no();
                if (regn_no != null) {
                    boolValueOf = Boolean.valueOf(regn_no.length() > 0);
                } else {
                    boolValueOf = null;
                }
                Intrinsics.checkNotNull(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    this.rcNo = it.getRegn_no();
                    me meVar3 = this.binding;
                    if (meVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar3 = null;
                    }
                    meVar3.r.setText(it.getRegn_no());
                }
                String appl_no = it.getAppl_no();
                Intrinsics.checkNotNull(appl_no);
                if (appl_no.length() > 0) {
                    me meVar4 = this.binding;
                    if (meVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar4 = null;
                    }
                    meVar4.e.setText(it.getAppl_no());
                }
                if (it.getRcpt_NO() != null && it.getRcpt_NO().length() > 0) {
                    this.receiptNo = it.getRcpt_NO();
                    me meVar5 = this.binding;
                    if (meVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar5 = null;
                    }
                    meVar5.o.setText(it.getRcpt_NO());
                }
                String owner_name = it.getOwner_name();
                Intrinsics.checkNotNull(owner_name);
                if (owner_name.length() > 0) {
                    me meVar6 = this.binding;
                    if (meVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar6 = null;
                    }
                    meVar6.k.setText(it.getOwner_name());
                }
                me meVar7 = this.binding;
                if (meVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    meVar7 = null;
                }
                meVar7.c.setText(String.valueOf(it.getRcpt_amt()));
                String state_cd = it.getState_cd();
                if (state_cd != null) {
                    boolValueOf2 = Boolean.valueOf(state_cd.length() > 0);
                } else {
                    boolValueOf2 = null;
                }
                Intrinsics.checkNotNull(boolValueOf2);
                if (boolValueOf2.booleanValue()) {
                    this.stateCd = it.getState_cd();
                }
                String off_cd = it.getOff_cd();
                if (off_cd != null && off_cd.length() > 0) {
                    this.offCd = it.getOff_cd();
                }
                String pur_cd = it.getPur_cd();
                if (pur_cd != null && pur_cd.length() > 0) {
                    this.purCd = it.getPur_cd();
                }
                String status = it.getStatus();
                Intrinsics.checkNotNull(status);
                if (status.length() <= 0) {
                    me meVar8 = this.binding;
                    if (meVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar8 = null;
                    }
                    meVar8.f.setVisibility(8);
                    me meVar9 = this.binding;
                    if (meVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar9 = null;
                    }
                    meVar9.i.setVisibility(8);
                    me meVar10 = this.binding;
                    if (meVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar10 = null;
                    }
                    meVar10.u.setVisibility(8);
                    me meVar11 = this.binding;
                    if (meVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar11 = null;
                    }
                    meVar11.g.setVisibility(8);
                    me meVar12 = this.binding;
                    if (meVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar12 = null;
                    }
                    meVar12.p.setVisibility(8);
                    me meVar13 = this.binding;
                    if (meVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar13 = null;
                    }
                    meVar13.h.setVisibility(8);
                    S1(this, getString(R.string.service_unavable_please_try));
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(it.getStatus(), "S", true)) {
                    me meVar14 = this.binding;
                    if (meVar14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar14 = null;
                    }
                    meVar14.m.setVisibility(0);
                    me meVar15 = this.binding;
                    if (meVar15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar15 = null;
                    }
                    meVar15.m.setImageResource(R.drawable.verified);
                    me meVar16 = this.binding;
                    if (meVar16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar16 = null;
                    }
                    meVar16.s.i.setText(y1().b("lbl_Payment_Success", getString(R.string.payment_success)));
                    me meVar17 = this.binding;
                    if (meVar17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar17 = null;
                    }
                    meVar17.t.setText(y1().b("lbl_Payment_Success", getString(R.string.payment_success)));
                    me meVar18 = this.binding;
                    if (meVar18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar18 = null;
                    }
                    meVar18.s.i.setTextColor(yy0.c(this, R.color.green_new));
                    me meVar19 = this.binding;
                    if (meVar19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar19 = null;
                    }
                    meVar19.f.setText(y1().b("btn_Download_Fee_Receipt", "Download Fee Receipt"));
                    me meVar20 = this.binding;
                    if (meVar20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar20 = null;
                    }
                    meVar20.u.setVisibility(8);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(it.getStatus(), "P", true)) {
                    me meVar21 = this.binding;
                    if (meVar21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar21 = null;
                    }
                    meVar21.m.setVisibility(0);
                    me meVar22 = this.binding;
                    if (meVar22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar22 = null;
                    }
                    meVar22.m.setImageResource(R.drawable.new_pending);
                    me meVar23 = this.binding;
                    if (meVar23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar23 = null;
                    }
                    meVar23.s.i.setText(y1().b("payment_pending", getString(R.string.payment_pending)));
                    me meVar24 = this.binding;
                    if (meVar24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar24 = null;
                    }
                    meVar24.t.setText(y1().b("payment_pending", getString(R.string.payment_pending)));
                    me meVar25 = this.binding;
                    if (meVar25 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar25 = null;
                    }
                    meVar25.s.i.setTextColor(yy0.c(this, R.color.blue_new));
                    me meVar26 = this.binding;
                    if (meVar26 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar26 = null;
                    }
                    meVar26.f.setVisibility(8);
                    me meVar27 = this.binding;
                    if (meVar27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar27 = null;
                    }
                    meVar27.i.setVisibility(8);
                    me meVar28 = this.binding;
                    if (meVar28 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar28 = null;
                    }
                    meVar28.u.setVisibility(0);
                    me meVar29 = this.binding;
                    if (meVar29 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar29 = null;
                    }
                    meVar29.g.setVisibility(8);
                    me meVar30 = this.binding;
                    if (meVar30 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar30 = null;
                    }
                    meVar30.p.setVisibility(8);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(it.getStatus(), "F", true)) {
                    me meVar31 = this.binding;
                    if (meVar31 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar31 = null;
                    }
                    meVar31.m.setVisibility(0);
                    me meVar32 = this.binding;
                    if (meVar32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar32 = null;
                    }
                    meVar32.m.setImageResource(R.drawable.payment_failed);
                    me meVar33 = this.binding;
                    if (meVar33 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar33 = null;
                    }
                    meVar33.s.i.setText(y1().b("payment_failed", getString(R.string.payment_failed)));
                    me meVar34 = this.binding;
                    if (meVar34 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar34 = null;
                    }
                    meVar34.t.setText(y1().b("payment_failed", getString(R.string.payment_failed)));
                    me meVar35 = this.binding;
                    if (meVar35 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar35 = null;
                    }
                    meVar35.s.i.setTextColor(yy0.c(this, R.color.red_new));
                    me meVar36 = this.binding;
                    if (meVar36 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar36 = null;
                    }
                    meVar36.f.setVisibility(8);
                    me meVar37 = this.binding;
                    if (meVar37 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar37 = null;
                    }
                    meVar37.i.setVisibility(8);
                    me meVar38 = this.binding;
                    if (meVar38 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar38 = null;
                    }
                    meVar38.u.setVisibility(0);
                    me meVar39 = this.binding;
                    if (meVar39 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar39 = null;
                    }
                    meVar39.g.setVisibility(8);
                    me meVar40 = this.binding;
                    if (meVar40 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        meVar40 = null;
                    }
                    meVar40.p.setVisibility(8);
                }
            } catch (Exception unused) {
                me meVar41 = this.binding;
                if (meVar41 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    meVar41 = null;
                }
                meVar41.t.setVisibility(8);
                me meVar42 = this.binding;
                if (meVar42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    meVar42 = null;
                }
                meVar42.f.setVisibility(8);
                me meVar43 = this.binding;
                if (meVar43 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    meVar43 = null;
                }
                meVar43.i.setVisibility(8);
                me meVar44 = this.binding;
                if (meVar44 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    meVar44 = null;
                }
                meVar44.u.setVisibility(8);
                me meVar45 = this.binding;
                if (meVar45 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    meVar45 = null;
                }
                meVar45.g.setVisibility(8);
                me meVar46 = this.binding;
                if (meVar46 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    meVar2 = meVar46;
                }
                meVar2.p.setVisibility(8);
                S1(this, getString(R.string.service_unavable_please_try));
            }
        }
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enc_string = str;
    }

    public final void N1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void O1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void P1(AfterPaymentResponse afterPaymentResponse) {
        Intrinsics.checkNotNullParameter(afterPaymentResponse, "<set-?>");
        this.payment_response = afterPaymentResponse;
    }

    public final void Q1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void R1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void S1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vs0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.T1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        u1(this, "Are you sure you want to leave?");
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_tax_status_screen);
        me meVarC = me.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(meVarC, "inflate(...)");
        this.binding = meVarC;
        me meVar = null;
        if (meVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVarC = null;
        }
        setContentView(meVarC.b());
        Q1(VahanProService.INSTANCE.a(this));
        R1((ld7) new z(this, new kd7(new jd7(A1()))).a(ld7.class));
        N1(new wa3(this));
        O1(new ProgressDialog(this));
        z1().setMessage("Please wait...");
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        z1().show();
        M1(String.valueOf(getIntent().getStringExtra("EncString")));
        Bundle extras = getIntent().getExtras();
        String strValueOf = String.valueOf(extras != null ? extras.get("ServiceName") : null);
        me meVar2 = this.binding;
        if (meVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVar2 = null;
        }
        meVar2.s.i.setText(strValueOf);
        B1().t(this, x1());
        B1().B0().g(this, new c(new a()));
        B1().C0().g(this, new c(new b()));
        me meVar3 = this.binding;
        if (meVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVar3 = null;
        }
        meVar3.s.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ps0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.C1(this.a, view);
            }
        });
        me meVar4 = this.binding;
        if (meVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVar4 = null;
        }
        meVar4.s.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qs0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.D1(this.a, view);
            }
        });
        me meVar5 = this.binding;
        if (meVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVar5 = null;
        }
        meVar5.s.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rs0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.E1(this.a, view);
            }
        });
        me meVar6 = this.binding;
        if (meVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVar6 = null;
        }
        meVar6.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ss0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.F1(this.a, view);
            }
        });
        me meVar7 = this.binding;
        if (meVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            meVar7 = null;
        }
        meVar7.u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ts0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.G1(this.a, view);
            }
        });
        me meVar8 = this.binding;
        if (meVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            meVar = meVar8;
        }
        meVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.us0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.H1(this.a, view);
            }
        });
    }

    public final void u1(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ns0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.v1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.os0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompPaymentStatusScreen.w1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String x1() {
        String str = this.enc_string;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enc_string");
        return null;
    }

    public final wa3 y1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
