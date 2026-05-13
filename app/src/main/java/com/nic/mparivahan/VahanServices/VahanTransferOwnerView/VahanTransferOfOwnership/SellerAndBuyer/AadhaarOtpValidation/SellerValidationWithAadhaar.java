package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.ApiMessage;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.Data;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerValidationWithAadhaar;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.TOMultiSelectionScreen;
import com.zepto.e47;
import com.zepto.em7;
import com.zepto.f47;
import com.zepto.jd7;
import com.zepto.jh;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.vh7;
import com.zepto.wa3;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u00104\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010?\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00106\u001a\u0004\bQ\u00108\"\u0004\bR\u0010:R\"\u0010W\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00106\u001a\u0004\bU\u00108\"\u0004\bV\u0010:R\u0016\u0010Y\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00106R$\u0010a\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u00106\u001a\u0004\bs\u00108\"\u0004\bt\u0010:R$\u0010}\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010\u0081\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u00106\u001a\u0004\b\u007f\u00108\"\u0005\b\u0080\u0001\u0010:R&\u0010\u0085\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u00106\u001a\u0005\b\u0083\u0001\u00108\"\u0005\b\u0084\u0001\u0010:R*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R&\u0010\u0091\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008e\u0001\u00106\u001a\u0005\b\u008f\u0001\u00108\"\u0005\b\u0090\u0001\u0010:R&\u0010\u0095\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0092\u0001\u00106\u001a\u0005\b\u0093\u0001\u00108\"\u0005\b\u0094\u0001\u0010:R*\u0010\u009c\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010 \u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u0097\u0001\u001a\u0006\b\u009e\u0001\u0010\u0099\u0001\"\u0006\b\u009f\u0001\u0010\u009b\u0001R&\u0010¤\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u00106\u001a\u0005\b¢\u0001\u00108\"\u0005\b£\u0001\u0010:R,\u0010¬\u0001\u001a\u0005\u0018\u00010¥\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/AadhaarOtpValidation/SellerValidationWithAadhaar;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "g2", "mobile_no", "x2", "Lcom/zepto/jh;", "C", "Lcom/zepto/jh;", "F1", "()Lcom/zepto/jh;", "l2", "(Lcom/zepto/jh;)V", "binding", "Lcom/zepto/f47;", "D", "Lcom/zepto/f47;", "J1", "()Lcom/zepto/f47;", "n2", "(Lcom/zepto/f47;)V", "mView", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "L1", "()Landroid/app/ProgressDialog;", "q2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "F", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "O1", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "t2", "(Lcom/nic/mparivahan/VahanEkyc/EkYCService;)V", "retrofitService_one", "Ljava/util/HashMap;", "G", "Ljava/util/HashMap;", "P1", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "serviceSelection_HashMap", "H", "Ljava/lang/String;", "K1", "()Ljava/lang/String;", "o2", "(Ljava/lang/String;)V", "off_code", "I", "adahar_no", "J", "txnNo", "Lcom/zepto/ld7;", "K", "Lcom/zepto/ld7;", "R1", "()Lcom/zepto/ld7;", "w2", "(Lcom/zepto/ld7;)V", "viewModelv1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "N1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "s2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "M", "getOwner_name_addhaar", "p2", "owner_name_addhaar", "N", "getAddress", "k2", "address", "O", "RC", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "P", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "H1", "()Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "setDOAuthOTP", "(Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;)V", "dOAuthOTP", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "I1", "()Lcom/zepto/wa3;", "m2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/vh7;", "R", "Lcom/zepto/vh7;", "getSession", "()Lcom/zepto/vh7;", "u2", "(Lcom/zepto/vh7;)V", "session", "S", "getPurCode", "setPurCode", "purCode", "Landroid/app/Dialog;", "T", "Landroid/app/Dialog;", "G1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "U", "getType", "setType", "type", "V", "getStateCd", "v2", "stateCd", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "W", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "M1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "r2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "X", "D1", "j2", "aadhar_name", "Y", "C1", "i2", "aadhar_address", "", "Z", "T1", "()Z", "setFaceless", "(Z)V", "isFaceless", "a0", "S1", "setBuyer", "isBuyer", "b0", "E1", "setApplication_no", "application_no", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "c0", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "Q1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "setToBuyerObject", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;)V", "ToBuyerObject", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SellerValidationWithAadhaar extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public f47 mView;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public EkYCService retrofitService_one;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public AadarkycVerify.dOEkyc dOAuthOTP;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public vh7 session;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String stateCd;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public boolean isBuyer;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public TOFetchApplicationDetails ToBuyerObject;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String adahar_no = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String txnNo = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String address = "NA";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String RC = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String purCode = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String type = "A";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String application_no = " ";

    public static final class a extends Lambda implements Function1 {
        public a() {
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
            SellerValidationWithAadhaar.this.L1().dismiss();
            SellerValidationWithAadhaar sellerValidationWithAadhaar = SellerValidationWithAadhaar.this;
            sellerValidationWithAadhaar.g2(sellerValidationWithAadhaar, "Unable to verify the request, Please try after some time");
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
        public final void a(Boolean bool) {
            if (SellerValidationWithAadhaar.this.L1().isShowing()) {
                SellerValidationWithAadhaar.this.L1().dismiss();
            }
            Intrinsics.checkNotNull(bool);
            if (!bool.booleanValue()) {
                SellerValidationWithAadhaar sellerValidationWithAadhaar = SellerValidationWithAadhaar.this;
                sellerValidationWithAadhaar.g2(sellerValidationWithAadhaar, "Unable to verify the Aadhaar, Please try after some time");
            } else {
                ld7 ld7VarR1 = SellerValidationWithAadhaar.this.R1();
                SellerValidationWithAadhaar sellerValidationWithAadhaar2 = SellerValidationWithAadhaar.this;
                ld7VarR1.p1(sellerValidationWithAadhaar2, String.valueOf(sellerValidationWithAadhaar2.M1().getState_cd()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
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
            Dialog d;
            if (SellerValidationWithAadhaar.this.L1().isShowing()) {
                SellerValidationWithAadhaar.this.L1().dismiss();
            }
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                SellerValidationWithAadhaar sellerValidationWithAadhaar = SellerValidationWithAadhaar.this;
                sellerValidationWithAadhaar.g2(sellerValidationWithAadhaar, "Unable to verify the Aadhaar, Please try after some time");
                return;
            }
            if (SellerValidationWithAadhaar.this.getD() != null && (d = SellerValidationWithAadhaar.this.getD()) != null) {
                d.dismiss();
            }
            SellerValidationWithAadhaar sellerValidationWithAadhaar2 = SellerValidationWithAadhaar.this;
            sellerValidationWithAadhaar2.g2(sellerValidationWithAadhaar2, str.toString());
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
        public final void a(EkycVerifyResponse ekycVerifyResponse) {
            DOEkyc dOEkyc;
            DOAadhaarResponse dOAadhaarResponse;
            DOEkyc dOEkyc2;
            DOEkyc dOEkyc3;
            DOEkyc dOEkyc4;
            DOEkyc dOEkyc5;
            DOEkyc dOEkyc6;
            DOEkyc dOEkyc7;
            DOEkyc dOEkyc8;
            SellerValidationWithAadhaar.this.L1().dismiss();
            if (ekycVerifyResponse == null) {
                SellerValidationWithAadhaar.this.L1().dismiss();
                SellerValidationWithAadhaar sellerValidationWithAadhaar = SellerValidationWithAadhaar.this;
                sellerValidationWithAadhaar.g2(sellerValidationWithAadhaar, "Unable to verify the request, Please try after some time");
                return;
            }
            ApiMessage apiMessage = ekycVerifyResponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                SellerValidationWithAadhaar sellerValidationWithAadhaar2 = SellerValidationWithAadhaar.this;
                ApiMessage apiMessage2 = ekycVerifyResponse.getApiMessage();
                sellerValidationWithAadhaar2.g2(sellerValidationWithAadhaar2, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            Data data = ekycVerifyResponse.getData();
            DOAadhaarResponse dOAadhaarResponse2 = data != null ? data.getDOAadhaarResponse() : null;
            if (String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null).length() == 0) {
                return;
            }
            if (StringsKt__StringsJVMKt.equals(String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null), "Y", true)) {
                try {
                    new vh7(SellerValidationWithAadhaar.this).f(SellerValidationWithAadhaar.this.txnNo);
                    if (String.valueOf((dOAadhaarResponse2 == null || (dOEkyc8 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc8.getName()).length() != 0) {
                        SellerValidationWithAadhaar.this.p2(String.valueOf((dOAadhaarResponse2 == null || (dOEkyc = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc.getName()));
                    }
                    SellerValidationWithAadhaar sellerValidationWithAadhaar3 = SellerValidationWithAadhaar.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc7 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc7.getHouse());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc6 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc6.getStreet());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc5 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc5.getLocalityIfAny());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc4 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc4.getDist());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc3 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc3.getState());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc2 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc2.getPincode()));
                    sellerValidationWithAadhaar3.k2(sb.toString());
                    Data data2 = ekycVerifyResponse.getData();
                    DOEkyc dOEkyc9 = (data2 == null || (dOAadhaarResponse = data2.getDOAadhaarResponse()) == null) ? null : dOAadhaarResponse.getDOEkyc();
                    Intrinsics.checkNotNull(dOEkyc9);
                    DOEkyc dOEkycCopy = dOEkyc9.copy((33538046 & 1) != 0 ? dOEkyc9.aadhaarNo : Long.parseLong(ekycVerifyResponse.getData().getAadharNo()), (33538046 & 2) != 0 ? dOEkyc9.address : null, (33538046 & 4) != 0 ? dOEkyc9.careOf : null, (33538046 & 8) != 0 ? dOEkyc9.code : null, (33538046 & 16) != 0 ? dOEkyc9.dist : null, (33538046 & 32) != 0 ? dOEkyc9.dob : null, (33538046 & 64) != 0 ? dOEkyc9.email : null, (33538046 & 128) != 0 ? dOEkyc9.errorCode : null, (33538046 & 256) != 0 ? dOEkyc9.gender : null, (33538046 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? dOEkyc9.house : null, (33538046 & 1024) != 0 ? dOEkyc9.landMark : null, (33538046 & 2048) != 0 ? dOEkyc9.localityIfAny : null, (33538046 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? dOEkyc9.name : null, (33538046 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? dOEkyc9.phone : 0, (33538046 & 16384) != 0 ? dOEkyc9.pht : " ", (33538046 & 32768) != 0 ? dOEkyc9.pincode : 0, (33538046 & 65536) != 0 ? dOEkyc9.postOffice : null, (33538046 & 131072) != 0 ? dOEkyc9.reason : null, (33538046 & 262144) != 0 ? dOEkyc9.state : null, (33538046 & 524288) != 0 ? dOEkyc9.status : null, (33538046 & 1048576) != 0 ? dOEkyc9.street : null, (33538046 & 2097152) != 0 ? dOEkyc9.subDist : null, (33538046 & 4194304) != 0 ? dOEkyc9.villageTownCity : null, (33538046 & 8388608) != 0 ? dOEkyc9.vtcCode : null, (33538046 & 16777216) != 0 ? dOEkyc9.xmlUID : null);
                    new Gson();
                    AadarkycVerify.dOEkyc dOAuthOTP = SellerValidationWithAadhaar.this.getDOAuthOTP();
                    String finalxml = dOAadhaarResponse2 != null ? dOAadhaarResponse2.getFinalxml() : null;
                    Data data3 = ekycVerifyResponse.getData();
                    DoAadhaarResponse doAadhaarResponse = new DoAadhaarResponse(dOAuthOTP, dOEkycCopy, finalxml, data3 != null ? data3.getRegNo() : null, dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null, SellerValidationWithAadhaar.this.txnNo);
                    SellerValidationWithAadhaar sellerValidationWithAadhaar4 = SellerValidationWithAadhaar.this;
                    Data data4 = ekycVerifyResponse.getData();
                    sellerValidationWithAadhaar4.RC = String.valueOf(data4 != null ? data4.getRegNo() : null);
                    if (SellerValidationWithAadhaar.this.getIsBuyer()) {
                        Intent intent = new Intent(SellerValidationWithAadhaar.this, (Class<?>) TOBuyerSelectionScreen.class);
                        intent.putExtra("applNo", SellerValidationWithAadhaar.this.getApplication_no());
                        intent.putExtra("Buyerdetails", SellerValidationWithAadhaar.this.getToBuyerObject());
                        intent.putExtra("RcDetails", SellerValidationWithAadhaar.this.M1());
                        intent.putExtra("AadhaarDetails", doAadhaarResponse);
                        intent.putExtra(VContant.NEXGEN_isFACELESS, true);
                        intent.putExtra(VContant.NEXGEN_addahar_name, SellerValidationWithAadhaar.this.D1());
                        intent.putExtra(VContant.NEXGEN_addahar_address, SellerValidationWithAadhaar.this.C1());
                        SellerValidationWithAadhaar.this.startActivity(intent);
                        SellerValidationWithAadhaar.this.finish();
                        return;
                    }
                    Intent intent2 = new Intent(SellerValidationWithAadhaar.this, (Class<?>) TOMultiSelectionScreen.class);
                    intent2.putExtra("RC", SellerValidationWithAadhaar.this.M1().getRc_regn_no());
                    intent2.putExtra("RcDetails", SellerValidationWithAadhaar.this.M1());
                    intent2.putExtra("map", SellerValidationWithAadhaar.this.getServiceSelection_HashMap());
                    intent2.putExtra("off_code", SellerValidationWithAadhaar.this.K1());
                    intent2.putExtra(VContant.NEXGEN_isFACELESS, SellerValidationWithAadhaar.this.getIsFaceless());
                    intent2.putExtra(VContant.NEXGEN_addahar_name, SellerValidationWithAadhaar.this.D1());
                    intent2.putExtra(VContant.NEXGEN_addahar_address, SellerValidationWithAadhaar.this.C1());
                    SellerValidationWithAadhaar.this.startActivity(intent2);
                    SellerValidationWithAadhaar.this.finish();
                } catch (Exception e) {
                    SellerValidationWithAadhaar.this.L1().dismiss();
                    e.printStackTrace();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EkycVerifyResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    public static final class f extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class g extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final void A2(EditText enterOtp, SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(this$0, "Please enter the OTP", 0).show();
            return;
        }
        if (string.length() < 6) {
            Toast.makeText(this$0, "Please enter the valid OTP", 0).show();
            return;
        }
        this$0.L1().show();
        if (this$0.F1().C.isChecked()) {
            this$0.type = "V";
        }
        vh7 vh7Var = new vh7(this$0);
        vh7Var.a();
        this$0.J1().m(this$0, this$0.F1().i.getText().toString(), String.valueOf(this$0.M1().getRc_regn_no()), this$0.M1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap), string, vh7Var.a());
    }

    public static final void B2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void C2(SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void U1(SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void V1(SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.F1().i.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 && this$0.F1().c.isChecked()) {
            this$0.g2(this$0, "Please enter the Aadhaar Number");
            return;
        }
        if (this$0.F1().i.getText().length() < 12 && this$0.F1().c.isChecked()) {
            this$0.g2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        if (this$0.F1().i.getText().length() > 12 && this$0.F1().c.isChecked()) {
            this$0.g2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        Editable text2 = this$0.F1().i.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0 && this$0.F1().C.isChecked()) {
            this$0.g2(this$0, "Please enter the Virtual Id");
            return;
        }
        if (this$0.F1().i.getText().length() < 16 && this$0.F1().C.isChecked()) {
            this$0.g2(this$0, "Please enter the valid Virtual Id");
            return;
        }
        if (!this$0.F1().d.isChecked() && this$0.F1().C.isChecked()) {
            this$0.g2(this$0, "Please agree with VID based e-KYC consent");
            return;
        }
        if (!this$0.F1().d.isChecked() && this$0.F1().c.isChecked()) {
            this$0.g2(this$0, "Please agree with Aadhaar based e-KYC consent");
            return;
        }
        String str = this$0.F1().C.isChecked() ? "V" : "A";
        this$0.L1().show();
        this$0.J1().k(this$0, this$0.F1().i.getText().toString(), String.valueOf(this$0.M1().getRc_regn_no()), this$0.M1(), str, VContant.INSTANCE.g(this$0.serviceSelection_HashMap));
    }

    public static final void W1(SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.F1().C.isChecked()) {
            this$0.type = "V";
        }
        this$0.L1().show();
        this$0.J1().k(this$0, this$0.F1().i.getText().toString(), String.valueOf(this$0.M1().getRc_regn_no()), this$0.M1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap));
    }

    public static final void X1(SellerValidationWithAadhaar this$0, eKycResponse ekycresponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
        try {
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage = ekycresponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                this$0.g2(this$0, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data = ekycresponse.getData();
            this$0.txnNo = String.valueOf(data != null ? data.getTxNo() : null);
            vh7 vh7Var = new vh7(this$0);
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data2 = ekycresponse.getData();
            vh7Var.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data3 = ekycresponse.getData();
            this$0.x2(this$0, String.valueOf(data3 != null ? data3.getLastFourMobileNumber() : null));
        } catch (Exception unused) {
            this$0.g2(this$0, "Unable to process the request, Please try after some time");
        }
    }

    public static final void Y1(SellerValidationWithAadhaar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
        this$0.g2(this$0, "Unable to process the request, Please try after some time");
    }

    public static final void Z1(SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().i.getText().clear();
    }

    public static final void a2(SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_aadhar_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        WebView webView = (WebView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        if (this$0.F1().C.isChecked()) {
            textView.setText("VID based e-KYC consent");
        } else {
            textView.setText("Aadhaar based e-KYC consent");
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SellerValidationWithAadhaar.b2(dialog, view2);
            }
        });
        webView.loadUrl(s14.a.g() + this$0.I1().d() + "/mparivahan-info-terms-of-use-aadhaar.html");
        webView.clearCache(true);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void c2(SellerValidationWithAadhaar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.F1().C.setChecked(false);
            this$0.F1().c.setChecked(true);
            this$0.F1().i.setHint("Enter Aadhaar Number");
            this$0.F1().i.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
        }
    }

    public static final void d2(SellerValidationWithAadhaar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.F1().c.setChecked(false);
            this$0.F1().C.setChecked(true);
            this$0.F1().i.setHint("Enter VID Number");
            this$0.F1().i.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
        }
    }

    public static final void e2(SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.F1().f.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.F1().r.setImageResource(R.drawable.pass_visible);
            this$0.F1().f.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.F1().r.setImageResource(R.drawable.mvvm_visibility);
            this$0.F1().f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void f2(SellerValidationWithAadhaar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().f.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void y2(EditText enterOtp, ImageView shownPin, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
        if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            shownPin.setImageResource(R.drawable.pass_visible);
            enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            shownPin.setImageResource(R.drawable.mvvm_visibility);
            enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void z2(SellerValidationWithAadhaar this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.L1().show();
        new g(time_text, resendOtp).start();
        new SecureRandom().nextInt(1410065407);
        this$0.L1().show();
        this$0.J1().k(this$0, this$0.F1().i.getText().toString(), String.valueOf(this$0.M1().getRc_regn_no()), this$0.M1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap));
    }

    public final String C1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String D1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final String getApplication_no() {
        return this.application_no;
    }

    public final jh F1() {
        jh jhVar = this.binding;
        if (jhVar != null) {
            return jhVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final AadarkycVerify.dOEkyc getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    public final wa3 I1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final f47 J1() {
        f47 f47Var = this.mView;
        if (f47Var != null) {
            return f47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mView");
        return null;
    }

    public final String K1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog L1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final NrvDetails M1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService N1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final EkYCService O1() {
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService != null) {
            return ekYCService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
        return null;
    }

    /* JADX INFO: renamed from: P1, reason: from getter */
    public final HashMap getServiceSelection_HashMap() {
        return this.serviceSelection_HashMap;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final TOFetchApplicationDetails getToBuyerObject() {
        return this.ToBuyerObject;
    }

    public final ld7 R1() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final boolean getIsBuyer() {
        return this.isBuyer;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void g2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.h2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void k2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void l2(jh jhVar) {
        Intrinsics.checkNotNullParameter(jhVar, "<set-?>");
        this.binding = jhVar;
    }

    public final void m2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void n2(f47 f47Var) {
        Intrinsics.checkNotNullParameter(f47Var, "<set-?>");
        this.mView = f47Var;
    }

    public final void o2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_process_with_adhar);
        jh jhVarC = jh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jhVarC, "inflate(...)");
        l2(jhVarC);
        setContentView(F1().b());
        m2(new wa3(this));
        t2(EkYCService.INSTANCE.a(this));
        s2(VahanProService.INSTANCE.a(this));
        q2(new ProgressDialog(this));
        L1().setMessage("Please wait...");
        L1().setCancelable(false);
        L1().setCanceledOnTouchOutside(false);
        new SecureRandom().nextInt(1410065407);
        this.application_no = String.valueOf(getIntent().getStringExtra("applNo"));
        v2(String.valueOf(getIntent().getStringExtra("stateCd")));
        o2(String.valueOf(getIntent().getStringExtra("off_code")));
        j2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        i2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        r2((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        HashMap map = (HashMap) getIntent().getSerializableExtra("map");
        Intrinsics.checkNotNull(map);
        this.serviceSelection_HashMap = map;
        this.isBuyer = getIntent().getBooleanExtra("isBuyer", false);
        this.isFaceless = true;
        u2(new vh7(this));
        String rc_regn_no = M1().getRc_regn_no();
        if (rc_regn_no != null && rc_regn_no.length() != 0) {
            F1().z.setText(String.valueOf(M1().getRc_regn_no()));
        }
        if (this.isBuyer) {
            this.ToBuyerObject = (TOFetchApplicationDetails) getIntent().getSerializableExtra("Buyerdetails");
            F1().b.setText("Aadhar based eKYC of New Owner (Buyer)");
            F1().v.i.setText(String.valueOf(I1().b("toSellerHeader", "Transfer of Ownership \n(Buyer)")));
        } else {
            F1().b.setText("Aadhar based eKYC of Owner (Seller)");
            F1().v.i.setText(String.valueOf(I1().b("toBuyerHeader", "Transfer of Ownership \n(Seller)")));
        }
        F1().v.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ux5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.U1(this.a, view);
            }
        });
        n2((f47) new z(this, new em7(new e47(O1()))).a(f47.class));
        w2((ld7) new z(this, new kd7(new jd7(N1()))).a(ld7.class));
        F1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ey5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.V1(this.a, view);
            }
        });
        F1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.Z1(this.a, view);
            }
        });
        F1().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.a2(this.a, view);
            }
        });
        F1().c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.hy5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SellerValidationWithAadhaar.c2(this.a, compoundButton, z);
            }
        });
        F1().C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.iy5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SellerValidationWithAadhaar.d2(this.a, compoundButton, z);
            }
        });
        F1().r.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.e2(this.a, view);
            }
        });
        F1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ky5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.f2(this.a, view);
            }
        });
        J1().g().g(this, new e(new d()));
        J1().h().g(this, new e(new a()));
        R1().k1().g(this, new e(new b()));
        R1().l1().g(this, new e(new c()));
        F1().p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ly5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.W1(this.a, view);
            }
        });
        J1().i().g(this, new mf4() { // from class: com.zepto.vx5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SellerValidationWithAadhaar.X1(this.a, (eKycResponse) obj);
            }
        });
        J1().j().g(this, new mf4() { // from class: com.zepto.dy5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SellerValidationWithAadhaar.Y1(this.a, (String) obj);
            }
        });
    }

    public final void p2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name_addhaar = str;
    }

    public final void q2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void r2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void s2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void t2(EkYCService ekYCService) {
        Intrinsics.checkNotNullParameter(ekYCService, "<set-?>");
        this.retrofitService_one = ekYCService;
    }

    public final void u2(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final void v2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCd = str;
    }

    public final void w2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void x2(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Dialog dialog = new Dialog(context);
        this.d = dialog;
        dialog.setContentView(R.layout.aadhaar_diloge);
        Dialog dialog2 = this.d;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = this.d;
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        Dialog dialog4 = this.d;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.d;
        LinearLayout linearLayout = dialog5 != null ? (LinearLayout) dialog5.findViewById(R.id.pop_up_close) : null;
        Intrinsics.checkNotNull(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
        Dialog dialog6 = this.d;
        final TextView textView = dialog6 != null ? (TextView) dialog6.findViewById(R.id.resendOtp) : null;
        Intrinsics.checkNotNull(textView, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog7 = this.d;
        final ImageView imageView = dialog7 != null ? (ImageView) dialog7.findViewById(R.id.showmpin) : null;
        Intrinsics.checkNotNull(imageView, "null cannot be cast to non-null type android.widget.ImageView");
        Dialog dialog8 = this.d;
        TextView textView2 = dialog8 != null ? (TextView) dialog8.findViewById(R.id.submitOtp) : null;
        Intrinsics.checkNotNull(textView2, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog9 = this.d;
        final EditText editText = dialog9 != null ? (EditText) dialog9.findViewById(R.id.enterOtp) : null;
        Intrinsics.checkNotNull(editText, "null cannot be cast to non-null type android.widget.EditText");
        Dialog dialog10 = this.d;
        final TextView textView3 = dialog10 != null ? (TextView) dialog10.findViewById(R.id.time_text) : null;
        Intrinsics.checkNotNull(textView3, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog11 = this.d;
        TextView textView4 = dialog11 != null ? (TextView) dialog11.findViewById(R.id.txt_reset) : null;
        Intrinsics.checkNotNull(textView4, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog12 = this.d;
        TextView textView5 = dialog12 != null ? (TextView) dialog12.findViewById(R.id.disPlay_mobile) : null;
        Intrinsics.checkNotNull(textView5, "null cannot be cast to non-null type android.widget.TextView");
        textView5.setText("OTP has been sent on your aadhar linked mobile number  \n+91 XXXXXX" + mobile_no);
        new f(textView3, textView).start();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.y2(editText, imageView, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.z2(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.A2(editText, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ay5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.B2(editText, view);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.by5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerValidationWithAadhaar.C2(this.a, view);
            }
        });
        Dialog dialog13 = this.d;
        if (dialog13 != null) {
            dialog13.show();
        }
    }
}
