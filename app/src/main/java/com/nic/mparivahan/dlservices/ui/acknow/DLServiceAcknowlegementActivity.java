package com.nic.mparivahan.dlservices.ui.acknow;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import com.zepto.gf2;
import com.zepto.kd1;
import com.zepto.la;
import com.zepto.lf2;
import com.zepto.lq7;
import com.zepto.mf2;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.pi2;
import com.zepto.q44;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yk1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 \u009f\u00012\u00020\u0001:\u0002 \u0001B\t¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J|\u0010-\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u00132\b\u0010%\u001a\u0004\u0018\u00010\u00132\b\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010\u00132\b\u0010(\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00132\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00130*j\b\u0012\u0004\u0012\u00020\u0013`+J\u0012\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.H\u0014J/\u00107\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\b\u00109\u001a\u00020\u0002H\u0016J\u0017\u0010;\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u000101¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0013H\u0007J\u001a\u0010?\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010[\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010%\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010Z\u001a\u0004\be\u0010`\"\u0004\bf\u0010bR$\u0010&\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010Z\u001a\u0004\bh\u0010`\"\u0004\bi\u0010bR\"\u0010'\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010Z\u001a\u0004\bk\u0010`\"\u0004\bl\u0010bR\"\u0010(\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010Z\u001a\u0004\bn\u0010`\"\u0004\bo\u0010bR\"\u0010s\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010Z\u001a\u0004\bq\u0010`\"\u0004\br\u0010bR\"\u0010)\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010Z\u001a\u0004\bu\u0010`\"\u0004\bv\u0010bR\"\u0010z\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010Z\u001a\u0004\bx\u0010`\"\u0004\by\u0010bR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R.\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130*8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R9\u0010\u009c\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00130*j\b\u0012\u0004\u0012\u00020\u0013`+8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u0094\u0001\u001a\u0006\b\u009a\u0001\u0010\u0096\u0001\"\u0006\b\u009b\u0001\u0010\u0098\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/acknow/DLServiceAcknowlegementActivity;", "Lcom/zepto/o40;", "", "c2", "b2", "d2", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "n2", "Ljava/io/File;", "file", "J2", "Lcom/nic/mparivahan/dlservices/data/model/ResultItemSubmit;", "result", "T1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "I2", "", "message", "t2", "pdfUrl", "x2", "z2", "N2", "L2", "M2", "O2", "p2", "Landroid/content/Context;", "context", "dlSuccessDetails", "lRto", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "dlDetails", "dl_number", "dob", "Mobile_no", "lastEndorseRto", "lastEndorseState", "lastEndorseStateCode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "multiListName", "K2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onBackPressed", "acCd", "o2", "(Ljava/lang/Integer;)V", "date", "S1", "v2", "Lcom/zepto/la;", "F", "Lcom/zepto/la;", "mBinding", "G", "Lcom/nic/mparivahan/dlservices/data/model/ResultItemSubmit;", "dlSuccessData", "Lcom/zepto/yk1;", "H", "Lcom/zepto/yk1;", "viewModel", "I", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "U1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "B2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "Lcom/zepto/wl5;", "J", "Lcom/zepto/wl5;", "a2", "()Lcom/zepto/wl5;", "H2", "(Lcom/zepto/wl5;)V", "sarthiSession", "K", "Ljava/lang/String;", "mApplNo", "L", "mApplDob", "M", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "N", "getDob", "setDob", "O", "getMobile_no", "setMobile_no", "P", "getLastEndorseRto", "setLastEndorseRto", "Q", "getLastEndorseState", "setLastEndorseState", "R", "getLastEndorseRTOCode", "setLastEndorseRTOCode", "lastEndorseRTOCode", "S", "getLastEndorseStateCode", "setLastEndorseStateCode", "T", "getState_value", "setState_value", "state_value", "Lcom/zepto/mf2;", "U", "Lcom/zepto/mf2;", "Y1", "()Lcom/zepto/mf2;", "F2", "(Lcom/zepto/mf2;)V", "mFormsVM", "Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "V", "Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "X1", "()Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "E2", "(Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;)V", "mFormsInterface", "Lcom/zepto/wa3;", "W", "Lcom/zepto/wa3;", "V1", "()Lcom/zepto/wa3;", "C2", "(Lcom/zepto/wa3;)V", "langSession", "X", "Ljava/util/ArrayList;", "Z1", "()Ljava/util/ArrayList;", "G2", "(Ljava/util/ArrayList;)V", "Y", "W1", "D2", "listHeaderSteps", "<init>", "()V", "Z", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DLServiceAcknowlegementActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public la mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ResultItemSubmit dlSuccessData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public mf2 mFormsVM;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public FormsInterface mFormsInterface;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

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
        public final void a(DlApplStatusDto dlApplStatusDto) {
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            la laVar = DLServiceAcknowlegementActivity.this.mBinding;
            if (laVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar = null;
            }
            laVar.G.c(false);
            try {
                if (StringsKt__StringsJVMKt.equals$default(dlApplStatusDto.getStatusCode(), "00", false, 2, null)) {
                    if (dlApplStatusDto.getApplStatusDetails() != null && (!r0.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                        DLServiceAcknowlegementActivity.this.I2(applStatusDetailsItem.getApplFlowStatusList());
                    }
                } else {
                    Toast.makeText(DLServiceAcknowlegementActivity.this, dlApplStatusDto.getStatusDesc(), 1).show();
                }
            } catch (Exception unused) {
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = DLServiceAcknowlegementActivity.this;
                dLServiceAcknowlegementActivity.v2(dLServiceAcknowlegementActivity, "Record not found");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
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
        public final void a(FormsPojo formsPojo) {
            la laVar = DLServiceAcknowlegementActivity.this.mBinding;
            if (laVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar = null;
            }
            laVar.K.c(false);
            try {
                if (StringsKt__StringsJVMKt.equals(formsPojo.getStatus_code(), "11", true)) {
                    DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = DLServiceAcknowlegementActivity.this;
                    dLServiceAcknowlegementActivity.x2(dLServiceAcknowlegementActivity.V1().b("label_form1_download", DLServiceAcknowlegementActivity.this.getString(R.string.form1a_download)), formsPojo.getForm_report());
                } else {
                    Toast.makeText(DLServiceAcknowlegementActivity.this, formsPojo.getStatus_desc(), 1).show();
                }
            } catch (Exception unused) {
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity2 = DLServiceAcknowlegementActivity.this;
                dLServiceAcknowlegementActivity2.v2(dLServiceAcknowlegementActivity2, "Record not found");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormsPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
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
        public final void a(FormsPojo formsPojo) {
            la laVar = DLServiceAcknowlegementActivity.this.mBinding;
            if (laVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar = null;
            }
            laVar.K.c(false);
            try {
                if (!StringsKt__StringsJVMKt.equals(formsPojo.getStatus_code(), "11", true)) {
                    Toast.makeText(DLServiceAcknowlegementActivity.this, formsPojo.getStatus_desc(), 1).show();
                } else if (StringsKt__StringsJVMKt.equals(DLServiceAcknowlegementActivity.this.a2().b(), "4", true)) {
                    DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = DLServiceAcknowlegementActivity.this;
                    dLServiceAcknowlegementActivity.z2(dLServiceAcknowlegementActivity.V1().b("label_form4_download", DLServiceAcknowlegementActivity.this.getString(R.string.form4_download)), formsPojo.getForm_report());
                } else {
                    DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity2 = DLServiceAcknowlegementActivity.this;
                    dLServiceAcknowlegementActivity2.z2(dLServiceAcknowlegementActivity2.V1().b("label_form2_download", DLServiceAcknowlegementActivity.this.getString(R.string.form2_download)), formsPojo.getForm_report());
                }
            } catch (Exception unused) {
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity3 = DLServiceAcknowlegementActivity.this;
                dLServiceAcknowlegementActivity3.v2(dLServiceAcknowlegementActivity3, "Record not found");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormsPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            la laVar = DLServiceAcknowlegementActivity.this.mBinding;
            if (laVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar = null;
            }
            laVar.K.c(false);
            DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = DLServiceAcknowlegementActivity.this;
            Toast.makeText(dLServiceAcknowlegementActivity, dLServiceAcknowlegementActivity.V1().b("service_is_not_present", DLServiceAcknowlegementActivity.this.getString(R.string.unable_to_get_details)), 1).show();
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    public static final void A2(Dialog d2, DLServiceAcknowlegementActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            String str2 = this$0.mApplNo;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str2 = null;
            }
            sb.append(str2);
            sb.append("_form.pdf");
            File file2 = new File(str + sb.toString());
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb2.append("/mParivahan_doc/");
            String str4 = this$0.mApplNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            } else {
                str3 = str4;
            }
            sb2.append(str3);
            sb2.append("_form.pdf");
            Uri uriF = FileProvider.f(this$0, "com.nic.mparivahan.provider", new File(sb2.toString()));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(List applFlowStatusList) {
        Integer acCd;
        int size = applFlowStatusList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                acCd = null;
                break;
            }
            Object obj = applFlowStatusList.get(i);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i);
                Intrinsics.checkNotNull(obj2);
                acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                break;
            }
            i++;
        }
        if (acCd == null) {
            new DLServiceFinalSubmitedActivity().G1(this);
        } else {
            o2(acCd);
        }
    }

    private final void J2(File file) {
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, V1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void L2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlDocActivity.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", U1());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", U1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            if (Intrinsics.areEqual(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", Z1());
                intent.putExtra("listHeaderSteps", W1());
            }
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void M2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DLRenewalFeePaymentActivity.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", U1());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", U1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            if (Intrinsics.areEqual(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", Z1());
                intent.putExtra("listHeaderSteps", W1());
            }
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void N2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlPhotoAndSignatureActivity.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", U1());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", U1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            if (Intrinsics.areEqual(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", Z1());
                intent.putExtra("listHeaderSteps", W1());
            }
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void O2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlRenewalSlotsActivity.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", U1());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", U1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            if (Intrinsics.areEqual(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", Z1());
                intent.putExtra("listHeaderSteps", W1());
            }
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void b2() {
        la laVar = null;
        ResultItemSubmit resultItemSubmit = null;
        la laVar2 = null;
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            Object obj = extras != null ? extras.get("dl_success_response") : null;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.data.model.ResultItemSubmit");
            ResultItemSubmit resultItemSubmit2 = (ResultItemSubmit) obj;
            this.dlSuccessData = resultItemSubmit2;
            if (resultItemSubmit2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlSuccessData");
                resultItemSubmit2 = null;
            }
            this.mApplNo = String.valueOf(resultItemSubmit2.getApplicationNo());
            Bundle extras2 = getIntent().getExtras();
            String string = extras2 != null ? extras2.getString("rto_code") : null;
            Intrinsics.checkNotNull(string, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRTOCode = string;
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            B2((DldetobjX) serializableExtra);
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            Serializable serializableExtra2 = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            B2((DldetobjX) serializableExtra2);
            String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
            Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRto = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("lastEndorsedState");
            Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseState = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("lastEndorseStateCode");
            Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseStateCode = stringExtra3;
            this.mApplDob = String.valueOf(st6.j(U1().getBioObj().getBioDob()));
            if (StringsKt__StringsJVMKt.equals(a2().b(), VContant.MAINSCREEN, true)) {
                la laVar3 = this.mBinding;
                if (laVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    laVar3 = null;
                }
                laVar3.K.setText(V1().b("label_view_forms", getString(R.string.view_forms)));
            } else if (StringsKt__StringsJVMKt.equals(a2().b(), "4", true)) {
                la laVar4 = this.mBinding;
                if (laVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    laVar4 = null;
                }
                laVar4.K.setText(V1().b("label_form_4", "View Form 4-A"));
            } else {
                la laVar5 = this.mBinding;
                if (laVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    laVar5 = null;
                }
                laVar5.K.setText(V1().b("label_view_form_2", "View Form 2"));
            }
        }
        try {
            la laVar6 = this.mBinding;
            if (laVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar6 = null;
            }
            laVar6.B.h.setText(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString());
            Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
            Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            G2((ArrayList) serializableExtra3);
            Serializable serializableExtra4 = getIntent().getSerializableExtra("multiList");
            Intrinsics.checkNotNull(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            D2((ArrayList) serializableExtra4);
        } catch (Exception unused) {
        }
        ResultItemSubmit resultItemSubmit3 = this.dlSuccessData;
        if (resultItemSubmit3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dlSuccessData");
            resultItemSubmit3 = null;
        }
        String applicationNo = resultItemSubmit3.getApplicationNo();
        Intrinsics.checkNotNull(applicationNo);
        if (applicationNo.length() <= 0) {
            la laVar7 = this.mBinding;
            if (laVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                laVar = laVar7;
            }
            laVar.w.setText(V1().b("label_app_for_four", getString(R.string.lbl4)));
            return;
        }
        if (Intrinsics.areEqual(a2().k(), "0")) {
            String str = V1().b("label_app_for_four", getString(R.string.lbl4)) + '\n' + V1().b("label_app_for_three", getString(R.string.lbl3));
            la laVar8 = this.mBinding;
            if (laVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar8 = null;
            }
            MyTextView myTextView = laVar8.w;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(' ');
            ResultItemSubmit resultItemSubmit4 = this.dlSuccessData;
            if (resultItemSubmit4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlSuccessData");
            } else {
                resultItemSubmit = resultItemSubmit4;
            }
            sb.append(resultItemSubmit.getApplicationNo());
            myTextView.setText(sb.toString());
            return;
        }
        try {
            String str2 = "";
            int size = W1().size();
            for (int i = 0; i < size; i++) {
                str2 = str2 + ((String) W1().get(i)) + ", ";
            }
            String strSubstring = str2.substring(0, str2.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String str3 = V1().b("label_app_for", getString(R.string.lbl1)) + ' ' + strSubstring + ' ' + V1().b("label_app_for_two", getString(R.string.lbl2)) + '\n' + V1().b("label_app_for_three", getString(R.string.lbl3));
            la laVar9 = this.mBinding;
            if (laVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar9 = null;
            }
            MyTextView myTextView2 = laVar9.w;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(' ');
            ResultItemSubmit resultItemSubmit5 = this.dlSuccessData;
            if (resultItemSubmit5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlSuccessData");
                resultItemSubmit5 = null;
            }
            sb2.append(resultItemSubmit5.getApplicationNo());
            myTextView2.setText(sb2.toString());
        } catch (Exception unused2) {
            la laVar10 = this.mBinding;
            if (laVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                laVar2 = laVar10;
            }
            laVar2.w.setText(V1().b("label_app_for_four", getString(R.string.lbl4)));
        }
    }

    private final void c2() {
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new f(new b()));
    }

    private final void d2() {
        la laVar = this.mBinding;
        la laVar2 = null;
        if (laVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar = null;
        }
        laVar.B.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ha1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.f2(this.a, view);
            }
        });
        la laVar3 = this.mBinding;
        if (laVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar3 = null;
        }
        laVar3.B.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oa1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.i2(this.a, view);
            }
        });
        la laVar4 = this.mBinding;
        if (laVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar4 = null;
        }
        laVar4.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pa1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.j2(this.a, view);
            }
        });
        la laVar5 = this.mBinding;
        if (laVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar5 = null;
        }
        laVar5.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qa1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.k2(this.a, view);
            }
        });
        la laVar6 = this.mBinding;
        if (laVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar6 = null;
        }
        laVar6.D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ra1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.l2(this.a, view);
            }
        });
        la laVar7 = this.mBinding;
        if (laVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar7 = null;
        }
        laVar7.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sa1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.m2(this.a, view);
            }
        });
        la laVar8 = this.mBinding;
        if (laVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            laVar2 = laVar8;
        }
        laVar2.K.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ta1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.e2(this.a, view);
            }
        });
        Y1().m().g(this, new f(new d()));
        Y1().j().g(this, new f(new e()));
        Y1().l().g(this, new f(new c()));
    }

    public static final void e2(DLServiceAcknowlegementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.dob;
        Intrinsics.checkNotNull(str);
        String strS1 = this$0.S1(str);
        if (StringsKt__StringsJVMKt.equals(this$0.a2().b(), VContant.MAINSCREEN, true)) {
            this$0.p2();
            return;
        }
        if (st6.e(this$0)) {
            try {
                String str2 = this$0.mApplNo;
                la laVar = null;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = str2.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 0);
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                byte[] bytes2 = strS1.getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
                if (!q44.a.a(this$0)) {
                    Toast.makeText(this$0, this$0.getString(R.string.no_internet), 1).show();
                    return;
                }
                la laVar2 = this$0.mBinding;
                if (laVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    laVar = laVar2;
                }
                laVar.K.c(true);
                mf2 mf2VarY1 = this$0.Y1();
                Intrinsics.checkNotNull(strEncodeToString);
                Intrinsics.checkNotNull(strEncodeToString2);
                mf2VarY1.i(strEncodeToString, strEncodeToString2);
            } catch (Exception unused) {
            }
        }
    }

    public static final void f2(DLServiceAcknowlegementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            final Dialog dialog = new Dialog(this$0);
            dialog.setContentView(R.layout.layout_multi);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById3;
            View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewFindViewById4;
            ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wa1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DLServiceAcknowlegementActivity.g2(dialog, view2);
                }
            });
            ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ia1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DLServiceAcknowlegementActivity.h2(dialog, view2);
                }
            });
            int size = this$0.W1().size();
            String str = "";
            int i = 0;
            String string = "";
            while (i < size) {
                str = str + ((String) this$0.W1().get(i)) + '\n';
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                i++;
                sb.append(i);
                sb.append(".\n");
                string = sb.toString();
            }
            textView.setText(str);
            textView2.setText(string);
            Window window2 = dialog.getWindow();
            Intrinsics.checkNotNull(window2);
            window2.setGravity(48);
            window2.setLayout(-2, -2);
            dialog.show();
        }
    }

    public static final void g2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void h2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void i2(DLServiceAcknowlegementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void j2(DLServiceAcknowlegementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (st6.e(this$0)) {
            ResultItemSubmit resultItemSubmit = this$0.dlSuccessData;
            if (resultItemSubmit == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlSuccessData");
                resultItemSubmit = null;
            }
            this$0.T1(resultItemSubmit);
        }
    }

    public static final void k2(DLServiceAcknowlegementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResultItemSubmit resultItemSubmit = this$0.dlSuccessData;
        yk1 yk1Var = null;
        if (resultItemSubmit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dlSuccessData");
            resultItemSubmit = null;
        }
        String applicationNo = resultItemSubmit.getApplicationNo();
        if (applicationNo != null) {
            ResultItemSubmit resultItemSubmit2 = this$0.dlSuccessData;
            if (resultItemSubmit2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlSuccessData");
                resultItemSubmit2 = null;
            }
            String strK = st6.k(resultItemSubmit2.getDateofBirth(), "yyyy-MM-dd", "dd-MM-yyyy");
            if (strK != null) {
                la laVar = this$0.mBinding;
                if (laVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    laVar = null;
                }
                laVar.G.c(true);
                yk1 yk1Var2 = this$0.viewModel;
                if (yk1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    yk1Var = yk1Var2;
                }
                yk1Var.h(applicationNo, strK);
            }
        }
    }

    public static final void l2(DLServiceAcknowlegementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void m2(DLServiceAcknowlegementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (st6.e(this$0)) {
            la laVar = this$0.mBinding;
            if (laVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar = null;
            }
            ConstraintLayout containerCl = laVar.x;
            Intrinsics.checkNotNullExpressionValue(containerCl, "containerCl");
            this$0.n2(containerCl);
        }
    }

    private final void n2(ConstraintLayout containerView) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(containerView.getWidth(), containerView.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            containerView.draw(new Canvas(bitmapCreateBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("screenshot");
            String str2 = this.mApplNo;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str2 = null;
            }
            sb.append(str2);
            sb.append(".png");
            File file2 = new File(sb.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            J2(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void q2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void r2(DLServiceAcknowlegementActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (st6.e(this$0)) {
            try {
                d2.dismiss();
                String str = this$0.dob;
                Intrinsics.checkNotNull(str);
                String strS1 = this$0.S1(str);
                String str2 = this$0.mApplNo;
                la laVar = null;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = str2.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 0);
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                byte[] bytes2 = strS1.getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
                if (!q44.a.a(this$0)) {
                    Toast.makeText(this$0, this$0.V1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                    return;
                }
                la laVar2 = this$0.mBinding;
                if (laVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    laVar = laVar2;
                }
                laVar.K.c(true);
                mf2 mf2VarY1 = this$0.Y1();
                Intrinsics.checkNotNull(strEncodeToString);
                Intrinsics.checkNotNull(strEncodeToString2);
                mf2VarY1.g(strEncodeToString, strEncodeToString2);
            } catch (Exception unused) {
            }
        }
    }

    public static final void s2(DLServiceAcknowlegementActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (st6.e(this$0)) {
            try {
                d2.dismiss();
                String str = this$0.dob;
                Intrinsics.checkNotNull(str);
                String strS1 = this$0.S1(str);
                String str2 = this$0.mApplNo;
                la laVar = null;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = str2.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 0);
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                byte[] bytes2 = strS1.getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
                if (!q44.a.a(this$0)) {
                    Toast.makeText(this$0, this$0.getString(R.string.no_internet), 1).show();
                    return;
                }
                la laVar2 = this$0.mBinding;
                if (laVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    laVar = laVar2;
                }
                laVar.K.c(true);
                mf2 mf2VarY1 = this$0.Y1();
                Intrinsics.checkNotNull(strEncodeToString);
                Intrinsics.checkNotNull(strEncodeToString2);
                mf2VarY1.i(strEncodeToString, strEncodeToString2);
            } catch (Exception unused) {
            }
        }
    }

    private final void t2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ua1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.u2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void u2(Dialog d2, DLServiceAcknowlegementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ma1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.y2(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    public static final void y2(Dialog d2, DLServiceAcknowlegementActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            String str2 = this$0.mApplNo;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str2 = null;
            }
            sb.append(str2);
            sb.append(".pdf");
            File file2 = new File(str + sb.toString());
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb2.append("/mParivahan_doc/");
            String str4 = this$0.mApplNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            } else {
                str3 = str4;
            }
            sb2.append(str3);
            sb2.append(".pdf");
            Uri uriF = FileProvider.f(this$0, "com.nic.mparivahan.provider", new File(sb2.toString()));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.na1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.A2(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    public final void B2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void C2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void D2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void E2(FormsInterface formsInterface) {
        Intrinsics.checkNotNullParameter(formsInterface, "<set-?>");
        this.mFormsInterface = formsInterface;
    }

    public final void F2(mf2 mf2Var) {
        Intrinsics.checkNotNullParameter(mf2Var, "<set-?>");
        this.mFormsVM = mf2Var;
    }

    public final void G2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void H2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void K2(Context context, ResultItemSubmit dlSuccessDetails, String lRto, DldetobjX dlDetails, String dl_number, String dob, String Mobile_no, String lastEndorseRto, String lastEndorseState, String lastEndorseStateCode, ArrayList multiListName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dlSuccessDetails, "dlSuccessDetails");
        Intrinsics.checkNotNullParameter(dlDetails, "dlDetails");
        Intrinsics.checkNotNullParameter(multiListName, "multiListName");
        try {
            Intent intent = new Intent(context, (Class<?>) DLServiceAcknowlegementActivity.class);
            intent.setFlags(268468224);
            intent.putExtra("dl_success_response", dlSuccessDetails);
            intent.putExtra("rto_code", lRto);
            intent.putExtra("DLDetails", dlDetails);
            intent.putExtra("DL", dl_number);
            intent.putExtra("dob", dob);
            intent.putExtra("Mobile_no", Mobile_no);
            intent.putExtra("lastEndorsedRTO", lastEndorseRto);
            intent.putExtra("lastEndorsedState", lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", lastEndorseStateCode);
            intent.putExtra("multiList", multiListName);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public final String S1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return date;
        }
    }

    public final void T1(ResultItemSubmit result) {
        new pi2(this).execute(result);
    }

    public final DldetobjX U1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final wa3 V1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ArrayList W1() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final FormsInterface X1() {
        FormsInterface formsInterface = this.mFormsInterface;
        if (formsInterface != null) {
            return formsInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final mf2 Y1() {
        mf2 mf2Var = this.mFormsVM;
        if (mf2Var != null) {
            return mf2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsVM");
        return null;
    }

    public final ArrayList Z1() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final wl5 a2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void o2(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            N2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            M2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            L2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            O2();
        } else if (acCd != null && acCd.intValue() == 455) {
            t2(V1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_service_acknow);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (la) lq7VarF;
        H2(new wl5(this));
        C2(new wa3(this));
        ta3.a aVar = ta3.a;
        la laVar = this.mBinding;
        la laVar2 = null;
        if (laVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar = null;
        }
        aVar.p0(this, laVar);
        this.viewModel = (yk1) new z(this).a(yk1.class);
        E2(FormsInterface.INSTANCE.a(this));
        F2((mf2) new z(this, new lf2(new gf2(X1()))).a(mf2.class));
        b2();
        c2();
        d2();
        la laVar3 = this.mBinding;
        if (laVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar3 = null;
        }
        laVar3.I.setText(a2().k());
        if (!Intrinsics.areEqual(a2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            la laVar4 = this.mBinding;
            if (laVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                laVar4 = null;
            }
            laVar4.B.e.setVisibility(8);
            la laVar5 = this.mBinding;
            if (laVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                laVar2 = laVar5;
            }
            laVar2.C.setVisibility(0);
            return;
        }
        la laVar6 = this.mBinding;
        if (laVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar6 = null;
        }
        laVar6.C.setVisibility(8);
        la laVar7 = this.mBinding;
        if (laVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar7 = null;
        }
        laVar7.B.e.setVisibility(0);
        la laVar8 = this.mBinding;
        if (laVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar8 = null;
        }
        laVar8.B.h.setText(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString());
        la laVar9 = this.mBinding;
        if (laVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            laVar9 = null;
        }
        TextView textView = laVar9.B.h;
        la laVar10 = this.mBinding;
        if (laVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            laVar2 = laVar10;
        }
        textView.setPaintFlags(laVar2.B.h.getPaintFlags() | 8);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1002) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            Toast.makeText(this, "Permission denied", 0).show();
        }
    }

    public final void p2() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.download_forms);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById2 = dialog.findViewById(R.id.form_one);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.form_two);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ja1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.q2(dialog, view);
            }
        });
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ka1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.r2(this.a, dialog, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.la1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.s2(this.a, dialog, view);
            }
        });
        dialog.show();
    }

    public final void v2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(V1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(V1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.va1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceAcknowlegementActivity.w2(dialog, view);
            }
        });
        dialog.show();
    }
}
