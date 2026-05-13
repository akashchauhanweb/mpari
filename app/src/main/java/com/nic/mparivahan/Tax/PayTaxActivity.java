package com.nic.mparivahan.Tax;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.BeforeResponse;
import com.nic.mparivahan.Tax.Model.CalculateTaxResponse;
import com.nic.mparivahan.Tax.Model.TaxCalModleItem;
import com.nic.mparivahan.Tax.Model.TaxDataFormat;
import com.nic.mparivahan.Tax.Model.TaxModes;
import com.nic.mparivahan.Tax.Model.TaxPurCdDescr;
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel;
import com.nic.mparivahan.Tax.payment.TaxPaymentActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanModel.Latesttaxdetails;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.PermitDetailDto;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.a14;
import com.zepto.gd1;
import com.zepto.id6;
import com.zepto.jd6;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.ng;
import com.zepto.od6;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.wm4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t¢\u0006\u0006\b²\u0001\u0010³\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J \u0010\u000e\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J(\u0010\u0017\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\u0006\u0010\u001b\u001a\u00020\bJ\u0012\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\"\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u000e\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#J\u001e\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010$\u001a\u00020#J\u0018\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0004H\u0016J\u0018\u0010+\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u0018\u0010,\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u0010\u0010.\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010<\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010R\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010r\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR2\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R&\u0010\u009a\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010<\u001a\u0005\b\u0098\u0001\u0010>\"\u0005\b\u0099\u0001\u0010@R*\u0010\u009c\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0091\u0001\u001a\u0006\b\u009c\u0001\u0010\u0093\u0001\"\u0006\b\u009d\u0001\u0010\u0095\u0001RG\u0010¦\u0001\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u009e\u0001j\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u009f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R&\u0010ª\u0001\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b§\u0001\u0010e\u001a\u0005\b¨\u0001\u0010g\"\u0005\b©\u0001\u0010iR+\u0010±\u0001\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001¨\u0006´\u0001"}, d2 = {"Lcom/nic/mparivahan/Tax/PayTaxActivity;", "Lcom/zepto/pq;", "Landroid/view/View$OnClickListener;", "Lcom/zepto/jd6$a;", "", "state_cd", "regn_no", "chassis_no", "", "g2", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Tax/Model/TaxCalModleItem;", "Lkotlin/collections/ArrayList;", "taxCalModeItem", "f2", "Lcom/nic/mparivahan/Tax/Model/CalculateTaxResponse;", "taxBreakUpDetails", "s1", "url", "e2", "h2", "M1", "it", "t1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "J0", "Landroid/view/View;", "v", "onClick", "Landroid/content/Context;", "context", "message", "Q1", "Lcom/nic/mparivahan/Tax/Model/TaxDataFormat;", "taxpurdesc", "L1", "x1", "", "pos", "taxMode", "t", "u1", "N1", "Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerDetailPuccPermit;", "C1", "Lcom/zepto/ng;", "C", "Lcom/zepto/ng;", "binding", "Lcom/nic/mparivahan/Tax/ViewModel/PaytaxViewModel;", "D", "Lcom/nic/mparivahan/Tax/ViewModel/PaytaxViewModel;", "viewModel", "Lcom/nic/mparivahan/Tax/PaytaxService;", "E", "Lcom/nic/mparivahan/Tax/PaytaxService;", "retrofitService", "F", "Ljava/lang/String;", "F1", "()Ljava/lang/String;", "Y1", "(Ljava/lang/String;)V", "G", "E1", "X1", "H", "getChassis_no", "setChassis_no", "I", "Lcom/nic/mparivahan/Tax/Model/TaxDataFormat;", "I1", "()Lcom/nic/mparivahan/Tax/Model/TaxDataFormat;", "b2", "(Lcom/nic/mparivahan/Tax/Model/TaxDataFormat;)V", "J", "getPur_cd", "()I", "U1", "(I)V", "pur_cd", "Lcom/zepto/ld7;", "K", "Lcom/zepto/ld7;", "getVahanViewModle", "()Lcom/zepto/ld7;", "d2", "(Lcom/zepto/ld7;)V", "vahanViewModle", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "J1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "c2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanService", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "M", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "V1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcDetails", "", "N", "Ljava/lang/Double;", "getTotalAmount", "()Ljava/lang/Double;", "setTotalAmount", "(Ljava/lang/Double;)V", "totalAmount", "O", "Ljava/util/ArrayList;", "G1", "()Ljava/util/ArrayList;", "setTaxCalModeItem", "(Ljava/util/ArrayList;)V", "Lcom/zepto/jd6;", "P", "Lcom/zepto/jd6;", "H1", "()Lcom/zepto/jd6;", "a2", "(Lcom/zepto/jd6;)V", "taxDetailsAdapter", "Q", "Lcom/nic/mparivahan/Tax/Model/CalculateTaxResponse;", "getTaxBreakUpDetails", "()Lcom/nic/mparivahan/Tax/Model/CalculateTaxResponse;", "Z1", "(Lcom/nic/mparivahan/Tax/Model/CalculateTaxResponse;)V", "Lcom/zepto/wa3;", "R", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "S1", "(Lcom/zepto/wa3;)V", "langSession", "", "S", "Z", "getCalculatetaxStatus", "()Z", "setCalculatetaxStatus", "(Z)V", "calculatetaxStatus", "T", "z1", "T1", "off_code", "U", "isFaceless", "setFaceless", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "V", "Ljava/util/HashMap;", "getServiceSelection_HashMap", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "serviceSelection_HashMap", "W", "D1", "W1", "rcdetails", "X", "Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerDetailPuccPermit;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerDetailPuccPermit;", "setOwnerDetails", "(Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerDetailPuccPermit;)V", "ownerDetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPayTaxActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTaxActivity.kt\ncom/nic/mparivahan/Tax/PayTaxActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,749:1\n1#2:750\n*E\n"})
public final class PayTaxActivity extends pq implements View.OnClickListener, jd6.a {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ng binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public PaytaxViewModel viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public PaytaxService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String state_cd;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String regn_no;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TaxDataFormat taxpurdesc;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public int pur_cd;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public NrvDetails rcDetails;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public jd6 taxDetailsAdapter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public CalculateTaxResponse taxBreakUpDetails;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public boolean calculatetaxStatus;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public OwnerDetailPuccPermit ownerDetails;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String chassis_no = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Double totalAmount = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ArrayList taxCalModeItem = new ArrayList();

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

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
        public final void a(BeforeResponse beforeResponse) {
            ng ngVar = null;
            try {
                ng ngVar2 = PayTaxActivity.this.binding;
                if (ngVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar2 = null;
                }
                ngVar2.t.setVisibility(8);
                PayTaxActivity.this.e2(beforeResponse.getReturnUrl());
            } catch (Exception e) {
                e.printStackTrace();
                ng ngVar3 = PayTaxActivity.this.binding;
                if (ngVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ngVar = ngVar3;
                }
                ngVar.t.setVisibility(8);
                PayTaxActivity payTaxActivity = PayTaxActivity.this;
                payTaxActivity.Q1(payTaxActivity, payTaxActivity.y1().b("please_try_after_some_time", PayTaxActivity.this.getString(R.string.please_try_after_some_time)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((BeforeResponse) obj);
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
            ng ngVar = null;
            try {
                ng ngVar2 = PayTaxActivity.this.binding;
                if (ngVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar2 = null;
                }
                ngVar2.t.setVisibility(8);
                if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                    PayTaxActivity payTaxActivity = PayTaxActivity.this;
                    payTaxActivity.Q1(payTaxActivity, payTaxActivity.y1().b("unable_to_calculate_the_tax", PayTaxActivity.this.getString(R.string.unable_to_calculate_the_tax)));
                } else {
                    PayTaxActivity payTaxActivity2 = PayTaxActivity.this;
                    payTaxActivity2.Q1(payTaxActivity2, str.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
                ng ngVar3 = PayTaxActivity.this.binding;
                if (ngVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ngVar = ngVar3;
                }
                ngVar.t.setVisibility(8);
                PayTaxActivity payTaxActivity3 = PayTaxActivity.this;
                payTaxActivity3.Q1(payTaxActivity3, payTaxActivity3.y1().b("please_try_after_some_time", PayTaxActivity.this.getString(R.string.please_try_after_some_time)));
            }
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            ng ngVar = PayTaxActivity.this.binding;
            if (ngVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar = null;
            }
            Object selectedItem = ngVar.u.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) selectedItem).intValue() != ((TaxCalModleItem) PayTaxActivity.this.getTaxCalModeItem().get(0)).getTimePeriod()) {
                int size = PayTaxActivity.this.getTaxCalModeItem().size();
                for (int i2 = 0; i2 < size; i2++) {
                    ng ngVar2 = PayTaxActivity.this.binding;
                    if (ngVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ngVar2 = null;
                    }
                    Object selectedItem2 = ngVar2.u.getSelectedItem();
                    Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) selectedItem2).intValue();
                    Object obj = PayTaxActivity.this.getTaxCalModeItem().get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    TaxCalModleItem taxCalModleItem = (TaxCalModleItem) obj;
                    PayTaxActivity.this.getTaxCalModeItem().set(i2, taxCalModleItem.copy((65535 & 1) != 0 ? taxCalModleItem.amount : 0.0d, (65535 & 2) != 0 ? taxCalModleItem.amount1 : 0.0d, (65535 & 4) != 0 ? taxCalModleItem.amount2 : 0.0d, (65535 & 8) != 0 ? taxCalModleItem.status : false, (65535 & 16) != 0 ? taxCalModleItem.fine : 0.0d, (65535 & 32) != 0 ? taxCalModleItem.gamount : 0.0d, (65535 & 64) != 0 ? taxCalModleItem.interest : 0.0d, (65535 & 128) != 0 ? taxCalModleItem.penalty : 0.0d, (65535 & 256) != 0 ? taxCalModleItem.rebate : 0.0d, (65535 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? taxCalModleItem.surcharge : 0.0d, (65535 & 1024) != 0 ? taxCalModleItem.tax_FROM : null, (65535 & 2048) != 0 ? taxCalModleItem.tax_HEAD : null, (65535 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? taxCalModleItem.tax_MODE : null, (65535 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? taxCalModleItem.tax_UPTO : null, (65535 & 16384) != 0 ? taxCalModleItem.listTaxModes : null, (65535 & 32768) != 0 ? taxCalModleItem.pur_CD : null, (65535 & 65536) != 0 ? taxCalModleItem.timePeriod : iIntValue));
                }
                PayTaxActivity.this.H1().j();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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

    public static final class e extends Lambda implements Function1 {
        public final /* synthetic */ ArrayList e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ArrayList arrayList) {
            super(1);
            this.e = arrayList;
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
        public final void a(CalculateTaxResponse calculateTaxResponse) {
            ng ngVar = null;
            if (calculateTaxResponse != null) {
                try {
                    PayTaxActivity.this.Z1(calculateTaxResponse);
                    PayTaxActivity.this.t1(this.e, calculateTaxResponse);
                } catch (Exception e) {
                    e.printStackTrace();
                    ng ngVar2 = PayTaxActivity.this.binding;
                    if (ngVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        ngVar = ngVar2;
                    }
                    ngVar.t.setVisibility(8);
                    PayTaxActivity payTaxActivity = PayTaxActivity.this;
                    payTaxActivity.Q1(payTaxActivity, payTaxActivity.y1().b("please_try_after_some_time", PayTaxActivity.this.getString(R.string.please_try_after_some_time)));
                    return;
                }
            }
            ng ngVar3 = PayTaxActivity.this.binding;
            if (ngVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar3 = null;
            }
            ngVar3.t.setVisibility(8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CalculateTaxResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
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
            ng ngVar = PayTaxActivity.this.binding;
            if (ngVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar = null;
            }
            ngVar.t.setVisibility(8);
            if (str == null || Intrinsics.areEqual(str, "")) {
                return;
            }
            if (str.equals("Error")) {
                PayTaxActivity payTaxActivity = PayTaxActivity.this;
                payTaxActivity.Q1(payTaxActivity, payTaxActivity.y1().b("unable_to_calculate_the_tax", PayTaxActivity.this.getString(R.string.unable_to_calculate_the_tax)));
            } else {
                PayTaxActivity payTaxActivity2 = PayTaxActivity.this;
                payTaxActivity2.Q1(payTaxActivity2, str);
            }
            PayTaxActivity.this.M1();
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
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
        public final void a(TaxDataFormat taxDataFormat) {
            ng ngVar = null;
            try {
                PayTaxActivity payTaxActivity = PayTaxActivity.this;
                Intrinsics.checkNotNull(taxDataFormat);
                payTaxActivity.b2(taxDataFormat);
                if (PayTaxActivity.this.getOwnerDetails() != null) {
                    PayTaxActivity payTaxActivity2 = PayTaxActivity.this;
                    payTaxActivity2.C1(payTaxActivity2.getOwnerDetails());
                } else {
                    ng ngVar2 = PayTaxActivity.this.binding;
                    if (ngVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ngVar2 = null;
                    }
                    ngVar2.t.setVisibility(8);
                    PayTaxActivity payTaxActivity3 = PayTaxActivity.this;
                    payTaxActivity3.Q1(payTaxActivity3, payTaxActivity3.y1().b("please_try_after_some_time", PayTaxActivity.this.getString(R.string.please_try_after_some_time)));
                }
                PayTaxActivity payTaxActivity4 = PayTaxActivity.this;
                String pur_cd = payTaxActivity4.I1().getPur_cd();
                Intrinsics.checkNotNull(pur_cd);
                payTaxActivity4.U1(Integer.parseInt(pur_cd));
                ng ngVar3 = PayTaxActivity.this.binding;
                if (ngVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar3 = null;
                }
                TextView textView = ngVar3.D;
                ArrayList<TaxModes> listTaxModes = taxDataFormat.getListTaxModes();
                Intrinsics.checkNotNull(listTaxModes);
                textView.setText(listTaxModes.get(0).getDescr());
                ng ngVar4 = PayTaxActivity.this.binding;
                if (ngVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar4 = null;
                }
                ngVar4.F.setText(String.valueOf(taxDataFormat.getVh_class()));
            } catch (Exception e) {
                e.printStackTrace();
                ng ngVar5 = PayTaxActivity.this.binding;
                if (ngVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ngVar = ngVar5;
                }
                ngVar.t.setVisibility(8);
                PayTaxActivity payTaxActivity5 = PayTaxActivity.this;
                payTaxActivity5.Q1(payTaxActivity5, payTaxActivity5.y1().b("please_try_after_some_time", PayTaxActivity.this.getString(R.string.please_try_after_some_time)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TaxDataFormat) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
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
            ng ngVar = PayTaxActivity.this.binding;
            if (ngVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar = null;
            }
            ngVar.t.setVisibility(8);
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                PayTaxActivity payTaxActivity = PayTaxActivity.this;
                payTaxActivity.Q1(payTaxActivity, payTaxActivity.y1().b("please_try_after_some_time", PayTaxActivity.this.getString(R.string.please_try_after_some_time)));
            } else {
                PayTaxActivity payTaxActivity2 = PayTaxActivity.this;
                payTaxActivity2.Q1(payTaxActivity2, str.toString());
            }
        }
    }

    public static final void K1(PayTaxActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) PayTaxActivity.class);
        intent.putExtra("RC", this$0.E1());
        intent.putExtra("State", this$0.F1());
        intent.putExtra("map", this$0.serviceSelection_HashMap);
        intent.putExtra("off_code", this$0.z1());
        intent.putExtra("chassis_no", this$0.chassis_no);
        intent.putExtra("Rcfulldetails", this$0.ownerDetails);
        intent.putExtra("RcDetails", this$0.D1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
        intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1() {
        ng ngVar = this.binding;
        if (ngVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar = null;
        }
        ngVar.c.setText(y1().b("btn_calculate_tax", getString(R.string.calculate_tax)));
        ng ngVar2 = this.binding;
        if (ngVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar2 = null;
        }
        ngVar2.f.setVisibility(8);
        ng ngVar3 = this.binding;
        if (ngVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar3 = null;
        }
        ngVar3.P.setVisibility(8);
        PaytaxViewModel paytaxViewModel = this.viewModel;
        if (paytaxViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            paytaxViewModel = null;
        }
        paytaxViewModel.n().k(null);
        PaytaxViewModel paytaxViewModel2 = this.viewModel;
        if (paytaxViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            paytaxViewModel2 = null;
        }
        paytaxViewModel2.p().k(null);
    }

    public static final void O1(Dialog d2, PayTaxActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        CalculateTaxResponse calculateTaxResponse = this$0.taxBreakUpDetails;
        if (calculateTaxResponse != null) {
            this$0.s1(calculateTaxResponse);
        }
    }

    public static final void P1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void R1(Dialog d2, PayTaxActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void v1(Dialog d2, PayTaxActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.f2(this$0.taxCalModeItem);
    }

    public static final void w1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final OwnerDetailPuccPermit getOwnerDetails() {
        return this.ownerDetails;
    }

    public final NrvDetails B1() {
        NrvDetails nrvDetails = this.rcDetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcDetails");
        return null;
    }

    public final void C1(OwnerDetailPuccPermit it) {
        ng ngVar = null;
        try {
            ng ngVar2 = this.binding;
            if (ngVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar2 = null;
            }
            ngVar2.n.setVisibility(0);
            VContant.Companion companion = VContant.INSTANCE;
            Intrinsics.checkNotNull(it);
            V1(companion.e(it));
            ng ngVar3 = this.binding;
            if (ngVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar3 = null;
            }
            ngVar3.l.setText(it.getOwner_name());
            ng ngVar4 = this.binding;
            if (ngVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar4 = null;
            }
            ngVar4.F.setText(String.valueOf(it.getVh_class_desc()));
            if (it.getLatesttaxdetails() != null) {
                ng ngVar5 = this.binding;
                if (ngVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar5 = null;
                }
                TextView textView = ngVar5.E;
                Latesttaxdetails latesttaxdetails = it.getLatesttaxdetails();
                Intrinsics.checkNotNull(latesttaxdetails);
                textView.setText(String.valueOf(latesttaxdetails.getTax_upto()));
                ng ngVar6 = this.binding;
                if (ngVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar6 = null;
                }
                TextView textView2 = ngVar6.C;
                Latesttaxdetails latesttaxdetails2 = it.getLatesttaxdetails();
                Intrinsics.checkNotNull(latesttaxdetails2);
                textView2.setText(latesttaxdetails2.getRcpt_dt().toString());
            } else {
                ng ngVar7 = this.binding;
                if (ngVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar7 = null;
                }
                ngVar7.E.setText("--");
                ng ngVar8 = this.binding;
                if (ngVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar8 = null;
                }
                ngVar8.C.setText("--");
            }
            ng ngVar9 = this.binding;
            if (ngVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar9 = null;
            }
            ngVar9.t.setVisibility(8);
            gd1.a aVar = gd1.a;
            PermitDetailDto permitDetailDto = it.getPermitDetailDto();
            if (aVar.m(permitDetailDto != null ? permitDetailDto.getPermitType() : null)) {
                ng ngVar10 = this.binding;
                if (ngVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar10 = null;
                }
                ngVar10.r.setVisibility(4);
            } else {
                ng ngVar11 = this.binding;
                if (ngVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar11 = null;
                }
                TextView textView3 = ngVar11.p;
                PermitDetailDto permitDetailDto2 = it.getPermitDetailDto();
                textView3.setText(permitDetailDto2 != null ? permitDetailDto2.getPermitType() : null);
            }
            Latesttaxdetails latesttaxdetails3 = it.getLatesttaxdetails();
            if (aVar.m(String.valueOf(latesttaxdetails3 != null ? latesttaxdetails3.getTax_from() : null))) {
                ng ngVar12 = this.binding;
                if (ngVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar12 = null;
                }
                ngVar12.G.setText("--");
            } else {
                ng ngVar13 = this.binding;
                if (ngVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar13 = null;
                }
                TextView textView4 = ngVar13.G;
                Latesttaxdetails latesttaxdetails4 = it.getLatesttaxdetails();
                textView4.setText(String.valueOf(latesttaxdetails4 != null ? latesttaxdetails4.getTax_from() : null));
            }
            Latesttaxdetails latesttaxdetails5 = it.getLatesttaxdetails();
            if (aVar.m(String.valueOf(latesttaxdetails5 != null ? latesttaxdetails5.getTax_amt() : null))) {
                ng ngVar14 = this.binding;
                if (ngVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar14 = null;
                }
                ngVar14.d.setText("--");
            } else {
                ng ngVar15 = this.binding;
                if (ngVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar15 = null;
                }
                TextView textView5 = ngVar15.d;
                Latesttaxdetails latesttaxdetails6 = it.getLatesttaxdetails();
                textView5.setText(String.valueOf(latesttaxdetails6 != null ? latesttaxdetails6.getTax_amt() : null));
            }
            L1(I1());
        } catch (Exception e2) {
            e2.printStackTrace();
            ng ngVar16 = this.binding;
            if (ngVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ngVar = ngVar16;
            }
            ngVar.t.setVisibility(8);
            Q1(this, y1().b("please_try_after_some_time", getString(R.string.please_try_after_some_time)));
        }
    }

    public final NrvDetails D1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final String E1() {
        String str = this.regn_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regn_no");
        return null;
    }

    public final String F1() {
        String str = this.state_cd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_cd");
        return null;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final ArrayList getTaxCalModeItem() {
        return this.taxCalModeItem;
    }

    public final jd6 H1() {
        jd6 jd6Var = this.taxDetailsAdapter;
        if (jd6Var != null) {
            return jd6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("taxDetailsAdapter");
        return null;
    }

    public final TaxDataFormat I1() {
        TaxDataFormat taxDataFormat = this.taxpurdesc;
        if (taxDataFormat != null) {
            return taxDataFormat;
        }
        Intrinsics.throwUninitializedPropertyAccessException("taxpurdesc");
        return null;
    }

    public final void J0() {
        vh7 vh7Var = new vh7(this);
        ng ngVar = this.binding;
        ng ngVar2 = null;
        if (ngVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar = null;
        }
        ngVar.S.setText(VContant.INSTANCE.n(this, vh7Var));
        g2(F1(), E1(), this.chassis_no);
        ng ngVar3 = this.binding;
        if (ngVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar3 = null;
        }
        AppCompatTextView appCompatTextView = ngVar3.X;
        ng ngVar4 = this.binding;
        if (ngVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar4 = null;
        }
        appCompatTextView.setPaintFlags(ngVar4.X.getPaintFlags() | 8);
        ng ngVar5 = this.binding;
        if (ngVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar5 = null;
        }
        ngVar5.o.setText(y1().b("owner_current_tax_details", getString(R.string.owner_current_tax_details)));
        ng ngVar6 = this.binding;
        if (ngVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar6 = null;
        }
        ngVar6.c.setOnClickListener(this);
        ng ngVar7 = this.binding;
        if (ngVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar7 = null;
        }
        ngVar7.D.setOnClickListener(this);
        ng ngVar8 = this.binding;
        if (ngVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar8 = null;
        }
        ngVar8.j.setOnClickListener(this);
        ng ngVar9 = this.binding;
        if (ngVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar9 = null;
        }
        ngVar9.X.setOnClickListener(this);
        ng ngVar10 = this.binding;
        if (ngVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar10 = null;
        }
        ngVar10.U.setText(E1());
        ng ngVar11 = this.binding;
        if (ngVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar11 = null;
        }
        ngVar11.f.setVisibility(8);
        ng ngVar12 = this.binding;
        if (ngVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar12 = null;
        }
        ngVar12.P.setVisibility(8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        ng ngVar13 = this.binding;
        if (ngVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar13 = null;
        }
        ngVar13.z.setLayoutManager(linearLayoutManager);
        ng ngVar14 = this.binding;
        if (ngVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar14 = null;
        }
        ngVar14.z.setNestedScrollingEnabled(false);
        if (!this.calculatetaxStatus) {
            ng ngVar15 = this.binding;
            if (ngVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar15 = null;
            }
            ngVar15.w.setEnabled(false);
            ng ngVar16 = this.binding;
            if (ngVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ngVar16 = null;
            }
            ngVar16.w.setAlpha(0.5f);
        }
        ng ngVar17 = this.binding;
        if (ngVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar17 = null;
        }
        ngVar17.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.km4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTaxActivity.K1(this.a, view);
            }
        });
        ng ngVar18 = this.binding;
        if (ngVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ngVar2 = ngVar18;
        }
        Spinner spinner = ngVar2.u;
        if (spinner == null) {
            return;
        }
        spinner.setOnItemSelectedListener(new c());
    }

    public final VahanProService J1() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final void L1(TaxDataFormat taxpurdesc) {
        Intrinsics.checkNotNullParameter(taxpurdesc, "taxpurdesc");
        try {
            List<TaxPurCdDescr> taxPurCdDesc = taxpurdesc.getTaxPurCdDesc();
            Intrinsics.checkNotNull(taxPurCdDesc);
            if (taxPurCdDesc.size() > 0) {
                od6 od6Var = new od6(this, id6.a.c());
                ng ngVar = this.binding;
                ng ngVar2 = null;
                if (ngVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar = null;
                }
                ngVar.u.setAdapter((SpinnerAdapter) od6Var);
                ng ngVar3 = this.binding;
                if (ngVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ngVar3 = null;
                }
                ngVar3.H.setLayoutManager(new LinearLayoutManager(this, 1, false));
                ArrayList arrayListX1 = x1(taxpurdesc);
                this.taxCalModeItem = arrayListX1;
                a2(new jd6(arrayListX1, this, this));
                ng ngVar4 = this.binding;
                if (ngVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ngVar2 = ngVar4;
                }
                ngVar2.H.setAdapter(H1());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void N1(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTaxActivity.O1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTaxActivity.P1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void Q1(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTaxActivity.R1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void S1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void U1(int i) {
        this.pur_cd = i;
    }

    public final void V1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcDetails = nrvDetails;
    }

    public final void W1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.regn_no = str;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_cd = str;
    }

    public final void Z1(CalculateTaxResponse calculateTaxResponse) {
        this.taxBreakUpDetails = calculateTaxResponse;
    }

    public final void a2(jd6 jd6Var) {
        Intrinsics.checkNotNullParameter(jd6Var, "<set-?>");
        this.taxDetailsAdapter = jd6Var;
    }

    public final void b2(TaxDataFormat taxDataFormat) {
        Intrinsics.checkNotNullParameter(taxDataFormat, "<set-?>");
        this.taxpurdesc = taxDataFormat;
    }

    public final void c2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final void d2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    public final void e2(String url) {
        try {
            try {
                SaveVahanlog.Companion companion = SaveVahanlog.INSTANCE;
                NrvDetails nrvDetailsB1 = B1();
                boolean z = this.isFaceless;
                String strSubstring = E1().substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                companion.a(this, nrvDetailsB1, z, " ", VContant.Tax_PURPOSE_CODE, strSubstring);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            Intent intent = new Intent(this, (Class<?>) TaxPaymentActivity.class);
            intent.putExtra("url", url);
            intent.putExtra("RcDetails", B1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final void f2(ArrayList taxCalModeItem) {
        PaytaxViewModel paytaxViewModel;
        ng ngVar = this.binding;
        PaytaxViewModel paytaxViewModel2 = null;
        if (ngVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar = null;
        }
        ngVar.t.setVisibility(0);
        PaytaxViewModel paytaxViewModel3 = this.viewModel;
        if (paytaxViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            paytaxViewModel = null;
        } else {
            paytaxViewModel = paytaxViewModel3;
        }
        String strF1 = F1();
        String strE1 = E1();
        id6.a aVar = id6.a;
        String strB = aVar.b(taxCalModeItem);
        String strA = aVar.a(taxCalModeItem);
        ng ngVar2 = this.binding;
        if (ngVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar2 = null;
        }
        paytaxViewModel.t(strF1, strE1, strB, strA, ngVar2.u.getSelectedItem().toString());
        PaytaxViewModel paytaxViewModel4 = this.viewModel;
        if (paytaxViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            paytaxViewModel4 = null;
        }
        paytaxViewModel4.r().g(this, new d(new e(taxCalModeItem)));
        PaytaxViewModel paytaxViewModel5 = this.viewModel;
        if (paytaxViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            paytaxViewModel2 = paytaxViewModel5;
        }
        paytaxViewModel2.n().g(this, new d(new f()));
    }

    public final void g2(String state_cd, String regn_no, String chassis_no) {
        ng ngVar = this.binding;
        PaytaxViewModel paytaxViewModel = null;
        if (ngVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar = null;
        }
        ngVar.t.setVisibility(0);
        PaytaxViewModel paytaxViewModel2 = this.viewModel;
        if (paytaxViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            paytaxViewModel2 = null;
        }
        paytaxViewModel2.u(state_cd, regn_no, chassis_no);
        PaytaxViewModel paytaxViewModel3 = this.viewModel;
        if (paytaxViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            paytaxViewModel3 = null;
        }
        paytaxViewModel3.q().g(this, new d(new g()));
        PaytaxViewModel paytaxViewModel4 = this.viewModel;
        if (paytaxViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            paytaxViewModel = paytaxViewModel4;
        }
        paytaxViewModel.k().g(this, new d(new h()));
    }

    public final void h2() {
        try {
            if (B1() == null) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) VahanVehicleDetailsService.class);
            intent.putExtra("RC", E1());
            intent.putExtra("RcDetails", B1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, false);
            intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent);
        } catch (Exception unused) {
            Q1(this, y1().b("please_try_after_some_time", getString(R.string.please_try_after_some_time)));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        ng ngVar = null;
        Integer numValueOf = v != null ? Integer.valueOf(v.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.nexgenarrow) {
            onBackPressed();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.view_vehicle_detail) {
            h2();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.calculatetax) {
            ng ngVar2 = this.binding;
            if (ngVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ngVar = ngVar2;
            }
            String string = ngVar.D.getText().toString();
            if (string == null || StringsKt__StringsJVMKt.isBlank(string)) {
                return;
            }
            if (this.calculatetaxStatus) {
                N1(this, y1().b("are_you_sure_you_want_to_make_payment", getString(R.string.are_you_sure_you_want_to_make_payment)));
                return;
            }
            id6.a aVar = id6.a;
            if (!aVar.e(this.taxCalModeItem)) {
                Toast.makeText(this, y1().b("please_select_tax_mode", getString(R.string.plz_select_taxmodevalue)), 0).show();
            } else if (aVar.f(this.taxCalModeItem)) {
                u1(this, y1().b("are_you_sure_you_want_to_Calcualte", getString(R.string.are_you_sure_you_want_to_calcualte)));
            } else {
                Toast.makeText(this, aVar.d(this.taxCalModeItem, this), 0).show();
            }
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String strSubstring;
        super.onCreate(savedInstanceState);
        ng ngVarC = ng.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ngVarC, "inflate(...)");
        this.binding = ngVarC;
        PaytaxService paytaxService = null;
        if (ngVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVarC = null;
        }
        setContentView(ngVarC.b());
        getWindow().addFlags(128);
        ta3.a aVar = ta3.a;
        ng ngVar = this.binding;
        if (ngVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar = null;
        }
        aVar.D1(this, ngVar);
        try {
            Y1(String.valueOf(getIntent().getStringExtra("State")));
            X1(String.valueOf(getIntent().getStringExtra("RC")));
            this.chassis_no = String.valueOf(getIntent().getStringExtra("chassis_no"));
            T1(String.valueOf(getIntent().getStringExtra("off_code")));
            this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
            HashMap map = (HashMap) getIntent().getSerializableExtra("map");
            Intrinsics.checkNotNull(map);
            this.serviceSelection_HashMap = map;
            Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
            W1((NrvDetails) serializableExtra);
            Serializable serializableExtra2 = getIntent().getSerializableExtra("Rcfulldetails");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit");
            this.ownerDetails = (OwnerDetailPuccPermit) serializableExtra2;
            Y1(String.valueOf(D1().getState_cd()));
            String rc_chasi_no = D1().getRc_chasi_no();
            if (rc_chasi_no != null) {
                String rc_chasi_no2 = D1().getRc_chasi_no();
                Integer numValueOf = rc_chasi_no2 != null ? Integer.valueOf(rc_chasi_no2.length()) : null;
                Intrinsics.checkNotNull(numValueOf);
                int iIntValue = numValueOf.intValue() - 5;
                String rc_chasi_no3 = D1().getRc_chasi_no();
                Integer numValueOf2 = rc_chasi_no3 != null ? Integer.valueOf(rc_chasi_no3.length()) : null;
                Intrinsics.checkNotNull(numValueOf2);
                strSubstring = rc_chasi_no.substring(iIntValue, numValueOf2.intValue());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = null;
            }
            this.chassis_no = String.valueOf(strSubstring);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.retrofitService = PaytaxService.INSTANCE.a(this);
        c2(VahanProService.INSTANCE.a(this));
        PaytaxService paytaxService2 = this.retrofitService;
        if (paytaxService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        } else {
            paytaxService = paytaxService2;
        }
        this.viewModel = (PaytaxViewModel) new z(this, new a14(new wm4(paytaxService))).a(PaytaxViewModel.class);
        d2((ld7) new z(this, new kd7(new jd7(J1()))).a(ld7.class));
        S1(new wa3(this));
        J0();
    }

    public final void s1(CalculateTaxResponse taxBreakUpDetails) {
        ng ngVar = this.binding;
        PaytaxViewModel paytaxViewModel = null;
        if (ngVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar = null;
        }
        ngVar.t.setVisibility(0);
        PaytaxViewModel paytaxViewModel2 = this.viewModel;
        if (paytaxViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            paytaxViewModel2 = null;
        }
        paytaxViewModel2.v(taxBreakUpDetails);
        PaytaxViewModel paytaxViewModel3 = this.viewModel;
        if (paytaxViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            paytaxViewModel3 = null;
        }
        paytaxViewModel3.j().g(this, new d(new a()));
        PaytaxViewModel paytaxViewModel4 = this.viewModel;
        if (paytaxViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            paytaxViewModel = paytaxViewModel4;
        }
        paytaxViewModel.m().g(this, new d(new b()));
    }

    @Override // com.zepto.jd6.a
    public void t(int pos, String taxMode) {
        Intrinsics.checkNotNullParameter(taxMode, "taxMode");
        Object obj = this.taxCalModeItem.get(pos);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        TaxCalModleItem taxCalModleItem = (TaxCalModleItem) obj;
        this.taxCalModeItem.set(pos, taxCalModleItem.copy((65535 & 1) != 0 ? taxCalModleItem.amount : 0.0d, (65535 & 2) != 0 ? taxCalModleItem.amount1 : 0.0d, (65535 & 4) != 0 ? taxCalModleItem.amount2 : 0.0d, (65535 & 8) != 0 ? taxCalModleItem.status : false, (65535 & 16) != 0 ? taxCalModleItem.fine : 0.0d, (65535 & 32) != 0 ? taxCalModleItem.gamount : 0.0d, (65535 & 64) != 0 ? taxCalModleItem.interest : 0.0d, (65535 & 128) != 0 ? taxCalModleItem.penalty : 0.0d, (65535 & 256) != 0 ? taxCalModleItem.rebate : 0.0d, (65535 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? taxCalModleItem.surcharge : 0.0d, (65535 & 1024) != 0 ? taxCalModleItem.tax_FROM : null, (65535 & 2048) != 0 ? taxCalModleItem.tax_HEAD : null, (65535 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? taxCalModleItem.tax_MODE : taxMode, (65535 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? taxCalModleItem.tax_UPTO : null, (65535 & 16384) != 0 ? taxCalModleItem.listTaxModes : null, (65535 & 32768) != 0 ? taxCalModleItem.pur_CD : null, (65535 & 65536) != 0 ? taxCalModleItem.timePeriod : 0));
        H1().k(pos);
    }

    public final void t1(ArrayList taxCalModeItem, CalculateTaxResponse it) {
        if (taxCalModeItem.size() > 0) {
            int size = taxCalModeItem.size();
            for (int i = 0; i < size; i++) {
                String pur_CD = ((TaxCalModleItem) taxCalModeItem.get(i)).getPur_CD();
                int size2 = it.getTaxGroupDetails().size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    if (StringsKt__StringsJVMKt.equals(pur_CD, String.valueOf(it.getTaxGroupDetails().get(i2).getPur_CD()), true)) {
                        double amount1 = it.getTaxGroupDetails().get(i2).getAmount1();
                        double penalty = it.getTaxGroupDetails().get(i2).getPenalty();
                        double fine = it.getTaxGroupDetails().get(i2).getFine();
                        double amount = it.getTaxGroupDetails().get(i2).getAmount();
                        double surcharge = it.getTaxGroupDetails().get(i2).getSurcharge();
                        double rebate = it.getTaxGroupDetails().get(i2).getRebate();
                        double interest = it.getTaxGroupDetails().get(i2).getInterest();
                        double gamount = it.getTaxGroupDetails().get(i2).getGamount();
                        String tax_UPTO = it.getTaxGroupDetails().get(i2).getTax_UPTO();
                        String tax_FROM = it.getTaxGroupDetails().get(i2).getTax_FROM();
                        Object obj = taxCalModeItem.get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        TaxCalModleItem taxCalModleItem = (TaxCalModleItem) obj;
                        taxCalModeItem.set(i, taxCalModleItem.copy((65535 & 1) != 0 ? taxCalModleItem.amount : amount, (65535 & 2) != 0 ? taxCalModleItem.amount1 : amount1, (65535 & 4) != 0 ? taxCalModleItem.amount2 : 0.0d, (65535 & 8) != 0 ? taxCalModleItem.status : true, (65535 & 16) != 0 ? taxCalModleItem.fine : fine, (65535 & 32) != 0 ? taxCalModleItem.gamount : gamount, (65535 & 64) != 0 ? taxCalModleItem.interest : interest, (65535 & 128) != 0 ? taxCalModleItem.penalty : penalty, (65535 & 256) != 0 ? taxCalModleItem.rebate : rebate, (65535 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? taxCalModleItem.surcharge : surcharge, (65535 & 1024) != 0 ? taxCalModleItem.tax_FROM : tax_FROM, (65535 & 2048) != 0 ? taxCalModleItem.tax_HEAD : null, (65535 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? taxCalModleItem.tax_MODE : null, (65535 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? taxCalModleItem.tax_UPTO : tax_UPTO, (65535 & 16384) != 0 ? taxCalModleItem.listTaxModes : null, (65535 & 32768) != 0 ? taxCalModleItem.pur_CD : null, (65535 & 65536) != 0 ? taxCalModleItem.timePeriod : 0));
                        H1().k(i);
                        break;
                    }
                    i2++;
                }
            }
        }
        ng ngVar = this.binding;
        ng ngVar2 = null;
        if (ngVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar = null;
        }
        ngVar.f.setText(String.valueOf(it.getFinalTaxAmount()));
        ng ngVar3 = this.binding;
        if (ngVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar3 = null;
        }
        ngVar3.f.setVisibility(0);
        ng ngVar4 = this.binding;
        if (ngVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar4 = null;
        }
        ngVar4.P.setVisibility(0);
        ng ngVar5 = this.binding;
        if (ngVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar5 = null;
        }
        ngVar5.z.setVisibility(0);
        ng ngVar6 = this.binding;
        if (ngVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar6 = null;
        }
        ngVar6.Q.setVisibility(0);
        ng ngVar7 = this.binding;
        if (ngVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar7 = null;
        }
        ngVar7.R.setVisibility(0);
        ng ngVar8 = this.binding;
        if (ngVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar8 = null;
        }
        ngVar8.L.setVisibility(0);
        ng ngVar9 = this.binding;
        if (ngVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar9 = null;
        }
        ngVar9.M.setVisibility(0);
        ng ngVar10 = this.binding;
        if (ngVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar10 = null;
        }
        ngVar10.R.setText(String.valueOf(it.getUserChrg()));
        ng ngVar11 = this.binding;
        if (ngVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar11 = null;
        }
        ngVar11.M.setText(String.valueOf(it.getTotalTransactionChrg()));
        ng ngVar12 = this.binding;
        if (ngVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar12 = null;
        }
        ngVar12.u.setEnabled(false);
        this.calculatetaxStatus = true;
        ng ngVar13 = this.binding;
        if (ngVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar13 = null;
        }
        ngVar13.w.setEnabled(true);
        ng ngVar14 = this.binding;
        if (ngVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ngVar14 = null;
        }
        ngVar14.w.setAlpha(1.0f);
        if (StringsKt__StringsJVMKt.equals(new vh7(this).c(), VContant.PAY_TAX_ASS_CODE, true)) {
            ng ngVar15 = this.binding;
            if (ngVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ngVar2 = ngVar15;
            }
            ngVar2.c.setVisibility(8);
            return;
        }
        ng ngVar16 = this.binding;
        if (ngVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ngVar2 = ngVar16;
        }
        ngVar2.c.setText(y1().b("btn_pay_now", getString(R.string.pay_now)));
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.im4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTaxActivity.v1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTaxActivity.w1(dialog, view);
            }
        });
        dialog.show();
    }

    public final ArrayList x1(TaxDataFormat taxpurdesc) {
        Intrinsics.checkNotNullParameter(taxpurdesc, "taxpurdesc");
        ArrayList arrayList = new ArrayList();
        List<TaxPurCdDescr> taxPurCdDesc = taxpurdesc.getTaxPurCdDesc();
        Intrinsics.checkNotNull(taxPurCdDesc);
        int size = taxPurCdDesc.size();
        for (int i = 0; i < size; i++) {
            ng ngVar = null;
            if (taxpurdesc.getTaxPurCdDesc().get(i).getPur_code().equals("81")) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new TaxModes("YEARLY", "Y"));
                ng ngVar2 = this.binding;
                if (ngVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ngVar = ngVar2;
                }
                arrayList.add(new TaxCalModleItem(0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, "", taxpurdesc.getTaxPurCdDesc().get(i).getDescr(), "0", "", arrayList2, taxpurdesc.getTaxPurCdDesc().get(i).getPur_code(), Integer.parseInt(ngVar.u.getSelectedItem().toString())));
            } else {
                ng ngVar3 = this.binding;
                if (ngVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ngVar = ngVar3;
                }
                arrayList.add(new TaxCalModleItem(0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, "", taxpurdesc.getTaxPurCdDesc().get(i).getDescr(), "0", "", taxpurdesc.getTaxPurCdDesc().get(i).getListTaxModes(), taxpurdesc.getTaxPurCdDesc().get(i).getPur_code(), Integer.parseInt(ngVar.u.getSelectedItem().toString())));
            }
        }
        return arrayList;
    }

    public final wa3 y1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final String z1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }
}
