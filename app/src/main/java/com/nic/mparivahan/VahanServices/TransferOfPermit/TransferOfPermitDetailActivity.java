package com.nic.mparivahan.VahanServices.TransferOfPermit;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.ApiMessage;
import com.nic.mparivahan.VahanServices.TransferOfPermit.Service.PermitTransferService;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferOfPermitDetailActivity;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal.PermitDetailModal;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal.SurrenderPurposeDetailModal;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal.SurrenderPurposeModal;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal.VtPermitModal;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.ar4;
import com.zepto.hz0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.wg;
import com.zepto.yq4;
import com.zepto.zq4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bw\u0010xJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00107\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010(\u001a\u0004\b5\u0010*\"\u0004\b6\u0010,R\"\u0010;\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\"\u0010?\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010(\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R\"\u0010C\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR>\u0010O\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0Gj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR&\u0010t\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010rR\u0016\u0010v\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010(¨\u0006y"}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferOfPermitDetailActivity;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/VtPermitModal;", "vtPermit", "", "K1", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferPermitModal/SurrenderPurposeDetailModal;", "surrenderPurposeArray", "S1", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "rcdetails", "C1", "r1", "", "rcNo", "v1", "stateCd", "A1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/content/Context;", "context", "message", "G1", "Lcom/zepto/wg;", "C", "Lcom/zepto/wg;", "binding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "L1", "(Lcom/zepto/wa3;)V", "languageKeySession", "E", "Ljava/lang/String;", "w1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "rc_number", "F", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "P1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "G", "t1", "M1", "off_code", "H", "getAadhar_name", "J1", "aadhar_name", "I", "getAadhar_address", "I1", "aadhar_address", "", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "K", "Ljava/util/HashMap;", "getServiceSelection_HashMap", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "serviceSelection_HashMap", "Lcom/zepto/vh7;", "L", "Lcom/zepto/vh7;", "z1", "()Lcom/zepto/vh7;", "R1", "(Lcom/zepto/vh7;)V", "session", "Lcom/zepto/ar4;", "M", "Lcom/zepto/ar4;", "B1", "()Lcom/zepto/ar4;", "T1", "(Lcom/zepto/ar4;)V", "viewModal", "Lcom/nic/mparivahan/VahanServices/TransferOfPermit/Service/PermitTransferService;", "N", "Lcom/nic/mparivahan/VahanServices/TransferOfPermit/Service/PermitTransferService;", "y1", "()Lcom/nic/mparivahan/VahanServices/TransferOfPermit/Service/PermitTransferService;", "Q1", "(Lcom/nic/mparivahan/VahanServices/TransferOfPermit/Service/PermitTransferService;)V", "service", "Landroid/app/ProgressDialog;", "O", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lkotlin/collections/ArrayList;", "P", "Ljava/util/ArrayList;", "Q", "surrenderDescString", "R", "orderDate", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TransferOfPermitDetailActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public wg binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public vh7 session;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ar4 viewModal;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public PermitTransferService service;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList surrenderPurposeArray = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList surrenderDescString = new ArrayList();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String orderDate = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
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
        public final void a(SurrenderPurposeModal surrenderPurposeModal) {
            try {
                if (TransferOfPermitDetailActivity.this.u1().isShowing()) {
                    TransferOfPermitDetailActivity.this.u1().dismiss();
                }
                ApiMessage apiMessage = surrenderPurposeModal.getApiMessage();
                Intrinsics.checkNotNull(apiMessage);
                Integer statusCode = apiMessage.getStatusCode();
                if (statusCode != null && statusCode.intValue() == 200) {
                    TransferOfPermitDetailActivity.this.surrenderPurposeArray = surrenderPurposeModal.getData();
                    if (TransferOfPermitDetailActivity.this.surrenderPurposeArray.size() > 0) {
                        TransferOfPermitDetailActivity transferOfPermitDetailActivity = TransferOfPermitDetailActivity.this;
                        transferOfPermitDetailActivity.S1(transferOfPermitDetailActivity.surrenderPurposeArray);
                        return;
                    }
                    return;
                }
                Integer statusCode2 = surrenderPurposeModal.getApiMessage().getStatusCode();
                if (statusCode2 == null || statusCode2.intValue() != 400) {
                    Integer statusCode3 = surrenderPurposeModal.getApiMessage().getStatusCode();
                    if (statusCode3 == null || statusCode3.intValue() != 404) {
                        return;
                    }
                }
                String developerMessage = surrenderPurposeModal.getApiMessage().getDeveloperMessage();
                Intrinsics.checkNotNull(developerMessage);
                if (developerMessage.length() > 0) {
                    TransferOfPermitDetailActivity transferOfPermitDetailActivity2 = TransferOfPermitDetailActivity.this;
                    transferOfPermitDetailActivity2.G1(transferOfPermitDetailActivity2, surrenderPurposeModal.getApiMessage().getDeveloperMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (TransferOfPermitDetailActivity.this.u1().isShowing()) {
                    TransferOfPermitDetailActivity.this.u1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SurrenderPurposeModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
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
        public final void a(PermitDetailModal permitDetailModal) {
            try {
                if (TransferOfPermitDetailActivity.this.u1().isShowing()) {
                    TransferOfPermitDetailActivity.this.u1().dismiss();
                }
                ApiMessage apiMessage = permitDetailModal.getApiMessage();
                Intrinsics.checkNotNull(apiMessage);
                Integer statusCode = apiMessage.getStatusCode();
                if (statusCode != null && statusCode.intValue() == 200) {
                    if (permitDetailModal.getData().getVtPermit().getOrder_dt().length() > 0) {
                        TransferOfPermitDetailActivity.this.orderDate = permitDetailModal.getData().getVtPermit().getOrder_dt();
                    }
                    TransferOfPermitDetailActivity.this.K1(permitDetailModal.getData().getVtPermit());
                    return;
                }
                Integer statusCode2 = permitDetailModal.getApiMessage().getStatusCode();
                if (statusCode2 == null || statusCode2.intValue() != 400) {
                    Integer statusCode3 = permitDetailModal.getApiMessage().getStatusCode();
                    if (statusCode3 == null || statusCode3.intValue() != 404) {
                        return;
                    }
                }
                String developerMessage = permitDetailModal.getApiMessage().getDeveloperMessage();
                Intrinsics.checkNotNull(developerMessage);
                if (developerMessage.length() > 0) {
                    TransferOfPermitDetailActivity transferOfPermitDetailActivity = TransferOfPermitDetailActivity.this;
                    transferOfPermitDetailActivity.G1(transferOfPermitDetailActivity, permitDetailModal.getApiMessage().getDeveloperMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (TransferOfPermitDetailActivity.this.u1().isShowing()) {
                    TransferOfPermitDetailActivity.this.u1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PermitDetailModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (TransferOfPermitDetailActivity.this.u1().isShowing()) {
                TransferOfPermitDetailActivity.this.u1().dismiss();
            }
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    private final void C1(NrvDetails rcdetails) {
        String strN = VContant.INSTANCE.n(this, z1());
        wg wgVar = this.binding;
        wg wgVar2 = null;
        if (wgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wgVar = null;
        }
        wgVar.a0.i.setText(strN);
        T1((ar4) new z(this, new yq4(new zq4(y1()))).a(ar4.class));
        wg wgVar3 = this.binding;
        if (wgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wgVar3 = null;
        }
        wgVar3.a0.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfPermitDetailActivity.D1(this.a, view);
            }
        });
        if (rcdetails != null) {
            A1(rcdetails.getState_cd());
            String rc_regn_no = rcdetails.getRc_regn_no();
            Intrinsics.checkNotNull(rc_regn_no);
            v1(rc_regn_no);
        }
        wg wgVar4 = this.binding;
        if (wgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wgVar4 = null;
        }
        wgVar4.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.um6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfPermitDetailActivity.E1(this.a, view);
            }
        });
        wg wgVar5 = this.binding;
        if (wgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wgVar2 = wgVar5;
        }
        wgVar2.T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfPermitDetailActivity.F1(this.a, view);
            }
        });
    }

    public static final void D1(TransferOfPermitDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void E1(TransferOfPermitDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wg wgVar = this$0.binding;
        wg wgVar2 = null;
        if (wgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wgVar = null;
        }
        if (String.valueOf(wgVar.R.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.s1().b("vahan_remark", this$0.getString(R.string.vahan_remark)), 1).show();
            return;
        }
        wg wgVar3 = this$0.binding;
        if (wgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wgVar3 = null;
        }
        if (wgVar3.P.getVisibility() == 0) {
            wg wgVar4 = this$0.binding;
            if (wgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wgVar2 = wgVar4;
            }
            if (String.valueOf(wgVar2.P.getText()).length() == 0) {
                Toast.makeText(this$0, this$0.getString(R.string.enter_relation_name), 0).show();
                return;
            }
        }
        this$0.r1();
    }

    public static final void F1(TransferOfPermitDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void A1(String stateCd) {
        if (stateCd != null) {
            try {
                u1().show();
                B1().j(stateCd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final ar4 B1() {
        ar4 ar4Var = this.viewModal;
        if (ar4Var != null) {
            return ar4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        return null;
    }

    public final void G1(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfPermitDetailActivity.H1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void K1(VtPermitModal vtPermit) {
        wg wgVar = null;
        if (vtPermit.getVmPermitType().getPermitTypeDescr().length() > 0) {
            wg wgVar2 = this.binding;
            if (wgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar2 = null;
            }
            wgVar2.O.setText(vtPermit.getVmPermitType().getPermitTypeDescr());
        } else {
            wg wgVar3 = this.binding;
            if (wgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar3 = null;
            }
            wgVar3.O.setText("");
        }
        if (vtPermit.getVmPermitCategory().getPermitCatgDescr().length() > 0) {
            wg wgVar4 = this.binding;
            if (wgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar4 = null;
            }
            wgVar4.K.setText(vtPermit.getVmPermitCategory().getPermitCatgDescr());
        } else {
            wg wgVar5 = this.binding;
            if (wgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar5 = null;
            }
            wgVar5.K.setText("");
        }
        if (vtPermit.getVmServiceType().getServiceDescription().length() <= 0 || StringsKt__StringsJVMKt.equals(vtPermit.getVmServiceType().getServiceDescription(), "Select Services Type", true)) {
            wg wgVar6 = this.binding;
            if (wgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar6 = null;
            }
            wgVar6.V.setVisibility(8);
        } else {
            wg wgVar7 = this.binding;
            if (wgVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar7 = null;
            }
            wgVar7.V.setVisibility(0);
            wg wgVar8 = this.binding;
            if (wgVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar8 = null;
            }
            wgVar8.X.setText(vtPermit.getVmServiceType().getServiceDescription());
        }
        if (this.serviceSelection_HashMap.containsKey(VContant.TRANSFER_OF_PERMIT_DEATH_CASE)) {
            wg wgVar9 = this.binding;
            if (wgVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar9 = null;
            }
            wgVar9.Q.setVisibility(0);
            wg wgVar10 = this.binding;
            if (wgVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar10 = null;
            }
            wgVar10.P.setVisibility(0);
        }
        if (vtPermit.getVmPermitType().getPermitTypeDescr().length() > 0) {
            wg wgVar11 = this.binding;
            if (wgVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar11 = null;
            }
            wgVar11.O.setText(vtPermit.getVmPermitType().getPermitTypeDescr());
        }
        if (vtPermit.getPmtNo().length() > 0) {
            wg wgVar12 = this.binding;
            if (wgVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wgVar = wgVar12;
            }
            wgVar.M.setText(vtPermit.getPmtNo());
        }
    }

    public final void L1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void N1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void P1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void Q1(PermitTransferService permitTransferService) {
        Intrinsics.checkNotNullParameter(permitTransferService, "<set-?>");
        this.service = permitTransferService;
    }

    public final void R1(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final void S1(ArrayList surrenderPurposeArray) {
        int size = surrenderPurposeArray.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (!this.serviceSelection_HashMap.containsKey(VContant.TRANSFER_OF_PERMIT)) {
                if (this.serviceSelection_HashMap.containsKey(VContant.TRANSFER_OF_PERMIT_DEATH_CASE)) {
                    if (StringsKt__StringsJVMKt.equals(String.valueOf(((SurrenderPurposeDetailModal) surrenderPurposeArray.get(i)).getPurCd()), VContant.PERMIT_TRANSFER_DEATH_PURPOSE_CODE, true)) {
                        String descr = ((SurrenderPurposeDetailModal) surrenderPurposeArray.get(i)).getDescr();
                        ArrayList arrayList = this.surrenderDescString;
                        Intrinsics.checkNotNull(descr);
                        arrayList.add(descr);
                        break;
                    }
                } else if (!StringsKt__StringsJVMKt.equals(String.valueOf(((SurrenderPurposeDetailModal) surrenderPurposeArray.get(i)).getPurCd()), VContant.PERMIT_TRANSFER_PURPOSE_CODE, true) && !StringsKt__StringsJVMKt.equals(String.valueOf(((SurrenderPurposeDetailModal) surrenderPurposeArray.get(i)).getPurCd()), VContant.PERMIT_TRANSFER_DEATH_PURPOSE_CODE, true)) {
                    String descr2 = ((SurrenderPurposeDetailModal) surrenderPurposeArray.get(i)).getDescr();
                    ArrayList arrayList2 = this.surrenderDescString;
                    Intrinsics.checkNotNull(descr2);
                    arrayList2.add(descr2);
                }
                i++;
            } else {
                if (StringsKt__StringsJVMKt.equals(String.valueOf(((SurrenderPurposeDetailModal) surrenderPurposeArray.get(i)).getPurCd()), VContant.PERMIT_TRANSFER_PURPOSE_CODE, true)) {
                    String descr3 = ((SurrenderPurposeDetailModal) surrenderPurposeArray.get(i)).getDescr();
                    ArrayList arrayList3 = this.surrenderDescString;
                    Intrinsics.checkNotNull(descr3);
                    arrayList3.add(descr3);
                    break;
                }
                i++;
            }
        }
        if (this.surrenderDescString.size() > 0) {
            if (this.serviceSelection_HashMap.containsKey(VContant.TRANSFER_OF_PERMIT_SURRENDER)) {
                this.surrenderDescString.add(0, "Select Purpose");
            }
            ArrayList arrayList4 = this.surrenderDescString;
            Intrinsics.checkNotNull(arrayList4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList4);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            wg wgVar = this.binding;
            if (wgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar = null;
            }
            wgVar.Y.setAdapter((SpinnerAdapter) arrayAdapter);
        }
    }

    public final void T1(ar4 ar4Var) {
        Intrinsics.checkNotNullParameter(ar4Var, "<set-?>");
        this.viewModal = ar4Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wg wgVarX = wg.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wgVarX, "inflate(...)");
        this.binding = wgVarX;
        if (wgVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wgVarX = null;
        }
        setContentView(wgVarX.m());
        L1(new wa3(this));
        R1(new vh7(this));
        M1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        O1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        P1((NrvDetails) serializableExtra);
        HashMap map = (HashMap) getIntent().getSerializableExtra("map");
        Intrinsics.checkNotNull(map);
        this.serviceSelection_HashMap = map;
        Q1(PermitTransferService.INSTANCE.a(this));
        N1(new ProgressDialog(this));
        u1().setMessage(s1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        C1(x1());
        B1().k().g(this, new d(new a()));
        B1().i().g(this, new d(new b()));
        B1().g().g(this, new d(new c()));
    }

    public final void r1() {
        try {
            String str = StringsKt__StringsJVMKt.equals(z1().c(), VContant.TRANSFER_PERMIT_CODE, true) ? VContant.PERMIT_TRANSFER_PURPOSE_CODE : StringsKt__StringsJVMKt.equals(z1().c(), VContant.TRANSFER_OF_PERMIT_DEATH_CASE, true) ? VContant.PERMIT_TRANSFER_DEATH_PURPOSE_CODE : "46";
            String strR = kt6.d(this.orderDate) ? this.orderDate : hz0.a.r();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcptNo", "");
            jSONObject.put("orderDt", "");
            jSONObject.put("applNo", "");
            jSONObject.put("opDt", "");
            jSONObject.put("orderBy", strR);
            jSONObject.put("orderNo", "");
            jSONObject.put("excemptedFlag", "");
            jSONObject.put("newRegnNo", "");
            jSONObject.put("userCd", "");
            jSONObject.put("stateCd", x1().getState_cd());
            jSONObject.put("toBeSurrPurCd", "26");
            wg wgVar = this.binding;
            wg wgVar2 = null;
            if (wgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar = null;
            }
            jSONObject.put("relationWithPmtHolder", String.valueOf(wgVar.P.getText()));
            jSONObject.put("regnNo", w1());
            wg wgVar3 = this.binding;
            if (wgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wgVar3 = null;
            }
            jSONObject.put("remarks", String.valueOf(wgVar3.R.getText()));
            wg wgVar4 = this.binding;
            if (wgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wgVar2 = wgVar4;
            }
            jSONObject.put("pmtNo", wgVar2.M.getText().toString());
            jSONObject.put("purCd", "41");
            jSONObject.put("offCd", t1());
            jSONObject.put("transPurCd", str);
            u1().show();
            B1().l(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final wa3 s1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String t1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
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

    public final void v1(String rcNo) {
        try {
            u1().show();
            B1().h(rcNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String w1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final PermitTransferService y1() {
        PermitTransferService permitTransferService = this.service;
        if (permitTransferService != null) {
            return permitTransferService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("service");
        return null;
    }

    public final vh7 z1() {
        vh7 vh7Var = this.session;
        if (vh7Var != null) {
            return vh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }
}
