package com.nic.mparivahan.VahanServices.VahanView;

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
import android.util.Log;
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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.ApiMessage;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.Data;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.VahanAlterationOfVehicle;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundingFeeActivity;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment;
import com.nic.mparivahan.VahanServices.Nominee.NomineeActivity;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApFacelessCheckModel;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.RCReleaseActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TemporaryPermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TransferOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateFitnessActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicatePermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcCancellationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcSurrenderActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;
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
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ:\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\tR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010=R\u0016\u0010N\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010=R\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010=\u001a\u0004\b`\u0010?\"\u0004\ba\u0010AR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010=\u001a\u0004\bd\u0010?\"\u0004\be\u0010AR\u0016\u0010g\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010=R$\u0010o\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010=\u001a\u0005\b\u0081\u0001\u0010?\"\u0005\b\u0082\u0001\u0010AR,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u0010\u008f\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010=\u001a\u0005\b\u008d\u0001\u0010?\"\u0005\b\u008e\u0001\u0010A¨\u0006\u0092\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanProcessWithAdhar;", "Lcom/zepto/pq;", "", "i2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "j2", "rc_number", "Ljava/util/HashMap;", "serviceSelection_HashMap", "", "isFaceless", "name", "address", "l2", "mobile_no", "y2", "Lcom/zepto/jh;", "C", "Lcom/zepto/jh;", "G1", "()Lcom/zepto/jh;", "n2", "(Lcom/zepto/jh;)V", "binding", "Lcom/zepto/f47;", "D", "Lcom/zepto/f47;", "K1", "()Lcom/zepto/f47;", "p2", "(Lcom/zepto/f47;)V", "mView", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "N1", "()Landroid/app/ProgressDialog;", "s2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "F", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "Q1", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "v2", "(Lcom/nic/mparivahan/VahanEkyc/EkYCService;)V", "retrofitService_one", "G", "Ljava/util/HashMap;", "R1", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "H", "Ljava/lang/String;", "L1", "()Ljava/lang/String;", "q2", "(Ljava/lang/String;)V", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "t2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "J", "adahar_no", "K", "txnNo", "Lcom/zepto/ld7;", "L", "Lcom/zepto/ld7;", "T1", "()Lcom/zepto/ld7;", "x2", "(Lcom/zepto/ld7;)V", "viewModelv1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "P1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "u2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "N", "M1", "r2", "owner_name_addhaar", "O", "F1", "m2", "P", "RC", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "Q", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "I1", "()Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "setDOAuthOTP", "(Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;)V", "dOAuthOTP", "Lcom/zepto/wa3;", "R", "Lcom/zepto/wa3;", "J1", "()Lcom/zepto/wa3;", "o2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/vh7;", "S", "Lcom/zepto/vh7;", "S1", "()Lcom/zepto/vh7;", "w2", "(Lcom/zepto/vh7;)V", "session", "T", "getPurCode", "setPurCode", "purCode", "Landroid/app/Dialog;", "U", "Landroid/app/Dialog;", "H1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "V", "getType", "setType", "type", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanProcessWithAdhar extends pq {

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

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public AadarkycVerify.dOEkyc dOAuthOTP;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public vh7 session;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String adahar_no = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String txnNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String address = "NA";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String RC = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String purCode = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String type = "A";

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
            VahanProcessWithAdhar.this.N1().dismiss();
            if (ekycVerifyResponse == null) {
                VahanProcessWithAdhar.this.N1().dismiss();
                VahanProcessWithAdhar vahanProcessWithAdhar = VahanProcessWithAdhar.this;
                vahanProcessWithAdhar.j2(vahanProcessWithAdhar, "Unable to verify the request, Please try after some time");
                return;
            }
            ApiMessage apiMessage = ekycVerifyResponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                Log.e("Calling Otp", "calling otp");
                VahanProcessWithAdhar vahanProcessWithAdhar2 = VahanProcessWithAdhar.this;
                ApiMessage apiMessage2 = ekycVerifyResponse.getApiMessage();
                vahanProcessWithAdhar2.j2(vahanProcessWithAdhar2, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            Data data = ekycVerifyResponse.getData();
            DOAadhaarResponse dOAadhaarResponse2 = data != null ? data.getDOAadhaarResponse() : null;
            if (String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null).length() == 0) {
                return;
            }
            if (StringsKt__StringsJVMKt.equals(String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null), "Y", true)) {
                try {
                    new vh7(VahanProcessWithAdhar.this).f(VahanProcessWithAdhar.this.txnNo);
                    if (String.valueOf((dOAadhaarResponse2 == null || (dOEkyc8 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc8.getName()).length() != 0) {
                        VahanProcessWithAdhar.this.r2(String.valueOf((dOAadhaarResponse2 == null || (dOEkyc = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc.getName()));
                    }
                    VahanProcessWithAdhar vahanProcessWithAdhar3 = VahanProcessWithAdhar.this;
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
                    vahanProcessWithAdhar3.m2(sb.toString());
                    Data data2 = ekycVerifyResponse.getData();
                    DOEkyc dOEkyc9 = (data2 == null || (dOAadhaarResponse = data2.getDOAadhaarResponse()) == null) ? null : dOAadhaarResponse.getDOEkyc();
                    Intrinsics.checkNotNull(dOEkyc9);
                    DOEkyc dOEkycCopy = dOEkyc9.copy((33538046 & 1) != 0 ? dOEkyc9.aadhaarNo : Long.parseLong(VahanProcessWithAdhar.this.G1().i.getText().toString()), (33538046 & 2) != 0 ? dOEkyc9.address : null, (33538046 & 4) != 0 ? dOEkyc9.careOf : null, (33538046 & 8) != 0 ? dOEkyc9.code : null, (33538046 & 16) != 0 ? dOEkyc9.dist : null, (33538046 & 32) != 0 ? dOEkyc9.dob : null, (33538046 & 64) != 0 ? dOEkyc9.email : null, (33538046 & 128) != 0 ? dOEkyc9.errorCode : null, (33538046 & 256) != 0 ? dOEkyc9.gender : null, (33538046 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? dOEkyc9.house : null, (33538046 & 1024) != 0 ? dOEkyc9.landMark : null, (33538046 & 2048) != 0 ? dOEkyc9.localityIfAny : null, (33538046 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? dOEkyc9.name : null, (33538046 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? dOEkyc9.phone : 0, (33538046 & 16384) != 0 ? dOEkyc9.pht : " ", (33538046 & 32768) != 0 ? dOEkyc9.pincode : 0, (33538046 & 65536) != 0 ? dOEkyc9.postOffice : null, (33538046 & 131072) != 0 ? dOEkyc9.reason : null, (33538046 & 262144) != 0 ? dOEkyc9.state : null, (33538046 & 524288) != 0 ? dOEkyc9.status : null, (33538046 & 1048576) != 0 ? dOEkyc9.street : null, (33538046 & 2097152) != 0 ? dOEkyc9.subDist : null, (33538046 & 4194304) != 0 ? dOEkyc9.villageTownCity : null, (33538046 & 8388608) != 0 ? dOEkyc9.vtcCode : null, (33538046 & 16777216) != 0 ? dOEkyc9.xmlUID : null);
                    Gson gson = new Gson();
                    AadarkycVerify.dOEkyc dOAuthOTP = VahanProcessWithAdhar.this.getDOAuthOTP();
                    String finalxml = dOAadhaarResponse2 != null ? dOAadhaarResponse2.getFinalxml() : null;
                    Data data3 = ekycVerifyResponse.getData();
                    DoAadhaarResponse doAadhaarResponse = new DoAadhaarResponse(dOAuthOTP, dOEkycCopy, finalxml, String.valueOf(data3 != null ? data3.getRegNo() : null), dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null, VahanProcessWithAdhar.this.txnNo);
                    VahanProcessWithAdhar vahanProcessWithAdhar4 = VahanProcessWithAdhar.this;
                    Data data4 = ekycVerifyResponse.getData();
                    vahanProcessWithAdhar4.RC = String.valueOf(data4 != null ? data4.getRegNo() : null);
                    Log.e("aadhaar Request - ", gson.toJson(doAadhaarResponse));
                    ld7 ld7VarT1 = VahanProcessWithAdhar.this.T1();
                    VahanProcessWithAdhar vahanProcessWithAdhar5 = VahanProcessWithAdhar.this;
                    String json = gson.toJson(doAadhaarResponse);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    ld7VarT1.m1(vahanProcessWithAdhar5, json);
                } catch (Exception e) {
                    VahanProcessWithAdhar.this.N1().dismiss();
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
            VahanProcessWithAdhar.this.N1().dismiss();
            VahanProcessWithAdhar vahanProcessWithAdhar = VahanProcessWithAdhar.this;
            vahanProcessWithAdhar.j2(vahanProcessWithAdhar, "Unable to verify the request, Please try after some time");
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
        public final void a(Boolean bool) {
            if (VahanProcessWithAdhar.this.N1().isShowing()) {
                VahanProcessWithAdhar.this.N1().dismiss();
            }
            Intrinsics.checkNotNull(bool);
            if (!bool.booleanValue()) {
                VahanProcessWithAdhar vahanProcessWithAdhar = VahanProcessWithAdhar.this;
                vahanProcessWithAdhar.j2(vahanProcessWithAdhar, "Unable to verify the Aadhaar, Please try after some time");
                return;
            }
            ld7 ld7VarT1 = VahanProcessWithAdhar.this.T1();
            VahanProcessWithAdhar vahanProcessWithAdhar2 = VahanProcessWithAdhar.this;
            ld7VarT1.n(vahanProcessWithAdhar2, String.valueOf(vahanProcessWithAdhar2.O1().getState_cd()));
            ld7 ld7VarT12 = VahanProcessWithAdhar.this.T1();
            VahanProcessWithAdhar vahanProcessWithAdhar3 = VahanProcessWithAdhar.this;
            ld7VarT12.p1(vahanProcessWithAdhar3, String.valueOf(vahanProcessWithAdhar3.O1().getState_cd()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
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
            if (VahanProcessWithAdhar.this.N1().isShowing()) {
                VahanProcessWithAdhar.this.N1().dismiss();
            }
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                VahanProcessWithAdhar vahanProcessWithAdhar = VahanProcessWithAdhar.this;
                vahanProcessWithAdhar.j2(vahanProcessWithAdhar, "Unable to verify the Aadhaar, Please try after some time");
                return;
            }
            if (VahanProcessWithAdhar.this.getD() != null && (d = VahanProcessWithAdhar.this.getD()) != null) {
                d.dismiss();
            }
            VahanProcessWithAdhar vahanProcessWithAdhar2 = VahanProcessWithAdhar.this;
            vahanProcessWithAdhar2.j2(vahanProcessWithAdhar2, str.toString());
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(ApFacelessCheckModel apFacelessCheckModel) {
            VahanProcessWithAdhar.this.N1().dismiss();
            try {
                String facelesswithaadharonly = apFacelessCheckModel.getFacelesswithaadharonly();
                if (facelesswithaadharonly != null && facelesswithaadharonly.length() != 0) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) apFacelessCheckModel.getFacelesswithaadharonly(), new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
                    }
                    if (arrayList.contains(VContant.INSTANCE.g(VahanProcessWithAdhar.this.getServiceSelection_HashMap()))) {
                        VahanProcessWithAdhar vahanProcessWithAdhar = VahanProcessWithAdhar.this;
                        vahanProcessWithAdhar.l2(vahanProcessWithAdhar.RC, VahanProcessWithAdhar.this.getServiceSelection_HashMap(), true, VahanProcessWithAdhar.this.getOwner_name_addhaar(), VahanProcessWithAdhar.this.getAddress());
                        return;
                    } else {
                        VahanProcessWithAdhar vahanProcessWithAdhar2 = VahanProcessWithAdhar.this;
                        vahanProcessWithAdhar2.l2(vahanProcessWithAdhar2.RC, VahanProcessWithAdhar.this.getServiceSelection_HashMap(), true, VahanProcessWithAdhar.this.getOwner_name_addhaar(), VahanProcessWithAdhar.this.getAddress());
                        return;
                    }
                }
                VahanProcessWithAdhar vahanProcessWithAdhar3 = VahanProcessWithAdhar.this;
                vahanProcessWithAdhar3.l2(vahanProcessWithAdhar3.RC, VahanProcessWithAdhar.this.getServiceSelection_HashMap(), true, VahanProcessWithAdhar.this.getOwner_name_addhaar(), VahanProcessWithAdhar.this.getAddress());
            } catch (Exception e) {
                VahanProcessWithAdhar vahanProcessWithAdhar4 = VahanProcessWithAdhar.this;
                vahanProcessWithAdhar4.l2(vahanProcessWithAdhar4.RC, VahanProcessWithAdhar.this.getServiceSelection_HashMap(), true, VahanProcessWithAdhar.this.getOwner_name_addhaar(), VahanProcessWithAdhar.this.getAddress());
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ApFacelessCheckModel) obj);
            return Unit.INSTANCE;
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

    public static final class h extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(TextView textView, TextView textView2) {
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

    public static final void A2(VahanProcessWithAdhar this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.N1().show();
        new h(time_text, resendOtp).start();
        new SecureRandom().nextInt(1410065407);
        this$0.N1().show();
        this$0.K1().k(this$0, this$0.G1().i.getText().toString(), String.valueOf(this$0.O1().getRc_regn_no()), this$0.O1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap));
    }

    public static final void B2(EditText enterOtp, VahanProcessWithAdhar this$0, View view) {
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
        this$0.N1().show();
        if (this$0.G1().C.isChecked()) {
            this$0.type = "V";
        }
        vh7 vh7Var = new vh7(this$0);
        vh7Var.a();
        this$0.K1().m(this$0, this$0.G1().i.getText().toString(), String.valueOf(this$0.O1().getRc_regn_no()), this$0.O1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap), string, vh7Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void D2(VahanProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void U1(VahanProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void V1(VahanProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i2();
    }

    public static final void W1(VahanProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1().f.setText("");
    }

    public static final void X1(VahanProcessWithAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1().dismiss();
        this$0.l2(this$0.RC, this$0.serviceSelection_HashMap, true, this$0.owner_name_addhaar, this$0.address);
    }

    public static final void Y1(VahanProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.G1().C.isChecked()) {
            this$0.type = "V";
        }
        this$0.N1().show();
        this$0.K1().k(this$0, this$0.G1().i.getText().toString(), String.valueOf(this$0.O1().getRc_regn_no()), this$0.O1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap));
    }

    public static final void Z1(VahanProcessWithAdhar this$0, eKycResponse ekycresponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1().dismiss();
        try {
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage = ekycresponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                this$0.j2(this$0, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data = ekycresponse.getData();
            this$0.txnNo = String.valueOf(data != null ? data.getTxNo() : null);
            vh7 vh7Var = new vh7(this$0);
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data2 = ekycresponse.getData();
            vh7Var.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data3 = ekycresponse.getData();
            this$0.y2(this$0, String.valueOf(data3 != null ? data3.getLastFourMobileNumber() : null));
        } catch (Exception unused) {
            this$0.j2(this$0, "Unable to process the request, Please try after some time");
        }
    }

    public static final void a2(VahanProcessWithAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1().dismiss();
        this$0.j2(this$0, "Unable to process the request, Please try after some time");
    }

    public static final void b2(VahanProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.G1().i.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 && this$0.G1().c.isChecked()) {
            this$0.j2(this$0, "Please enter the Aadhaar Number");
            return;
        }
        if (this$0.G1().i.getText().length() < 12 && this$0.G1().c.isChecked()) {
            this$0.j2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        if (this$0.G1().i.getText().length() > 12 && this$0.G1().c.isChecked()) {
            this$0.j2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        Editable text2 = this$0.G1().i.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0 && this$0.G1().C.isChecked()) {
            this$0.j2(this$0, "Please enter the Virtual Id");
            return;
        }
        if (this$0.G1().i.getText().length() < 16 && this$0.G1().C.isChecked()) {
            this$0.j2(this$0, "Please enter the valid Virtual Id");
            return;
        }
        if (!this$0.G1().d.isChecked() && this$0.G1().C.isChecked()) {
            this$0.j2(this$0, "Please agree with VID based e-KYC consent");
            return;
        }
        if (!this$0.G1().d.isChecked() && this$0.G1().c.isChecked()) {
            this$0.j2(this$0, "Please agree with Aadhaar based e-KYC consent");
            return;
        }
        String str = this$0.G1().C.isChecked() ? "V" : "A";
        this$0.N1().show();
        this$0.K1().k(this$0, this$0.G1().i.getText().toString(), String.valueOf(this$0.O1().getRc_regn_no()), this$0.O1(), str, VContant.INSTANCE.g(this$0.serviceSelection_HashMap));
    }

    public static final void c2(VahanProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1().i.getText().clear();
    }

    public static final void d2(VahanProcessWithAdhar this$0, View view) {
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
        if (this$0.G1().C.isChecked()) {
            textView.setText("VID based e-KYC consent");
        } else {
            textView.setText("Aadhaar based e-KYC consent");
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VahanProcessWithAdhar.e2(dialog, view2);
            }
        });
        webView.loadUrl(s14.a.g() + this$0.J1().d() + "/mparivahan-info-terms-of-use-aadhaar.html");
        webView.clearCache(true);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void f2(VahanProcessWithAdhar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.G1().C.setChecked(false);
            this$0.G1().c.setChecked(true);
            this$0.G1().i.setHint("Enter Aadhaar Number");
            this$0.G1().i.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
        }
    }

    public static final void g2(VahanProcessWithAdhar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.G1().c.setChecked(false);
            this$0.G1().C.setChecked(true);
            this$0.G1().i.setHint("Enter VID Number");
            this$0.G1().i.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
        }
    }

    public static final void h2(VahanProcessWithAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.G1().f.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.G1().r.setImageResource(R.drawable.pass_visible);
            this$0.G1().f.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.G1().r.setImageResource(R.drawable.mvvm_visibility);
            this$0.G1().f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    private final void i2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z2(EditText enterOtp, ImageView shownPin, View view) {
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

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final jh G1() {
        jh jhVar = this.binding;
        if (jhVar != null) {
            return jhVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final AadarkycVerify.dOEkyc getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    public final wa3 J1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final f47 K1() {
        f47 f47Var = this.mView;
        if (f47Var != null) {
            return f47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mView");
        return null;
    }

    public final String L1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final String getOwner_name_addhaar() {
        return this.owner_name_addhaar;
    }

    public final ProgressDialog N1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final NrvDetails O1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService P1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final EkYCService Q1() {
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService != null) {
            return ekYCService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
        return null;
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final HashMap getServiceSelection_HashMap() {
        return this.serviceSelection_HashMap;
    }

    public final vh7 S1() {
        vh7 vh7Var = this.session;
        if (vh7Var != null) {
            return vh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ld7 T1() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final void j2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.k2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void l2(String rc_number, HashMap serviceSelection_HashMap, boolean isFaceless, String name, String address) {
        Class cls;
        Object obj;
        String strSubstring;
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC)) {
            Intent intent = new Intent(this, (Class<?>) VahanDuplicateRcActivity.class);
            intent.putExtra("RC", rc_number);
            intent.putExtra("RcDetails", O1());
            intent.putExtra("map", serviceSelection_HashMap);
            intent.putExtra("off_code", L1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, name);
            intent.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            Intent intent2 = new Intent(this, (Class<?>) TransferOwnerShipActivity.class);
            intent2.putExtra("RC", rc_number);
            intent2.putExtra("RcDetails", O1());
            intent2.putExtra("map", serviceSelection_HashMap);
            intent2.putExtra("off_code", L1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent2.putExtra(VContant.NEXGEN_addahar_name, name);
            intent2.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent2);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            Intent intent3 = new Intent(this, (Class<?>) VahanChangeOfAddress.class);
            intent3.putExtra("RC", rc_number);
            intent3.putExtra("RcDetails", O1());
            intent3.putExtra("map", serviceSelection_HashMap);
            intent3.putExtra("off_code", L1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent3.putExtra(VContant.NEXGEN_addahar_name, name);
            intent3.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent3);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            Intent intent4 = new Intent(this, (Class<?>) HypothecationTerminationActivity.class);
            intent4.putExtra("RC", rc_number);
            intent4.putExtra("RcDetails", O1());
            intent4.putExtra("map", serviceSelection_HashMap);
            intent4.putExtra("off_code", L1());
            intent4.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent4.putExtra(VContant.NEXGEN_addahar_name, name);
            intent4.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent4);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent5 = new Intent(this, (Class<?>) HypothecationContinuationActivity.class);
            intent5.putExtra("RC", rc_number);
            cls = HypothecationContinuationActivity.class;
            intent5.putExtra("RcDetails", O1());
            intent5.putExtra("map", serviceSelection_HashMap);
            intent5.putExtra("off_code", L1());
            intent5.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent5.putExtra(VContant.NEXGEN_addahar_name, name);
            intent5.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent5);
            finish();
        } else {
            cls = HypothecationContinuationActivity.class;
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            Intent intent6 = new Intent(this, (Class<?>) HypothecationAdditionActivity.class);
            intent6.putExtra("RC", rc_number);
            intent6.putExtra("RcDetails", O1());
            intent6.putExtra("map", serviceSelection_HashMap);
            intent6.putExtra("off_code", L1());
            intent6.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent6.putExtra(VContant.NEXGEN_addahar_name, name);
            intent6.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent6);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR)) {
            Intent intent7 = new Intent(this, (Class<?>) VahanDetailsForRcParticulara.class);
            obj = VContant.HYPOTHECATION_CONTINUATION;
            intent7.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RCPARTICULAR_CODE);
            intent7.putExtra(VContant.PURPOSE_CODE, VContant.RCPARTICULAR_PURPOSE_CODE);
            intent7.putExtra("state_code", O1().getState_cd());
            intent7.putExtra("RC", rc_number);
            intent7.putExtra("RcDetails", O1());
            intent7.putExtra(VContant.SERVICE_NAME, "RC Particular");
            intent7.putExtra("off_code", L1());
            intent7.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent7.putExtra(VContant.NEXGEN_addahar_name, name);
            intent7.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent7);
            finish();
        } else {
            obj = VContant.HYPOTHECATION_CONTINUATION;
        }
        if (serviceSelection_HashMap.containsKey(VContant.NOC)) {
            Intent intent8 = new Intent(this, (Class<?>) VahanNocActivity.class);
            intent8.putExtra("RC", rc_number);
            intent8.putExtra("RcDetails", O1());
            intent8.putExtra("map", serviceSelection_HashMap);
            intent8.putExtra("off_code", L1());
            intent8.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent8.putExtra(VContant.NEXGEN_addahar_name, name);
            intent8.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent8);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(obj)) {
            Intent intent9 = new Intent(this, (Class<?>) cls);
            intent9.putExtra("RC", rc_number);
            intent9.putExtra("RcDetails", O1());
            intent9.putExtra("map", serviceSelection_HashMap);
            intent9.putExtra("off_code", L1());
            intent9.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent9.putExtra(VContant.NEXGEN_addahar_name, name);
            intent9.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent9);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.PAY_TAX)) {
            Intent intent10 = new Intent(this, (Class<?>) PayTaxActivity.class);
            intent10.putExtra("RC", rc_number);
            String rc_c_state = O1().getRc_c_state();
            intent10.putExtra("State", rc_c_state != null ? StringsKt__StringsKt.trim((CharSequence) rc_c_state).toString() : null);
            intent10.putExtra("map", serviceSelection_HashMap);
            intent10.putExtra("off_code", L1());
            String rc_chasi_no = O1().getRc_chasi_no();
            if (rc_chasi_no != null) {
                strSubstring = rc_chasi_no.substring(String.valueOf(O1().getRc_chasi_no()).length() - 5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            } else {
                strSubstring = null;
            }
            intent10.putExtra("chassis_no", strSubstring);
            intent10.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent10.putExtra(VContant.NEXGEN_addahar_name, name);
            intent10.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent10);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_FITNESS)) {
            Intent intent11 = new Intent(this, (Class<?>) VahanDuplicateFitnessActivity.class);
            intent11.putExtra("RC", rc_number);
            intent11.putExtra("RcDetails", O1());
            intent11.putExtra("map", serviceSelection_HashMap);
            intent11.putExtra("off_code", L1());
            intent11.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent11.putExtra(VContant.NEXGEN_addahar_name, name);
            intent11.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent11);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RC_CANCALATION)) {
            Intent intent12 = new Intent(this, (Class<?>) VahanRcCancellationActivity.class);
            intent12.putExtra("RC", rc_number);
            intent12.putExtra("RcDetails", O1());
            intent12.putExtra("map", serviceSelection_HashMap);
            intent12.putExtra("off_code", L1());
            intent12.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent12.putExtra(VContant.NEXGEN_addahar_name, name);
            intent12.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent12);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RC_SURRENDER)) {
            Intent intent13 = new Intent(this, (Class<?>) VahanRcSurrenderActivity.class);
            intent13.putExtra("RC", rc_number);
            intent13.putExtra("RcDetails", O1());
            intent13.putExtra("map", serviceSelection_HashMap);
            intent13.putExtra("off_code", L1());
            intent13.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent13.putExtra(VContant.NEXGEN_addahar_name, name);
            intent13.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent13);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_PERMIT)) {
            Intent intent14 = new Intent(this, (Class<?>) VahanDuplicatePermitActivity.class);
            intent14.putExtra("RC", rc_number);
            intent14.putExtra("RcDetails", O1());
            intent14.putExtra("map", serviceSelection_HashMap);
            intent14.putExtra("off_code", L1());
            intent14.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent14.putExtra(VContant.NEXGEN_addahar_name, name);
            intent14.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent14);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RC_RELEASE)) {
            Intent intent15 = new Intent(this, (Class<?>) RCReleaseActivity.class);
            intent15.putExtra("RC", rc_number);
            intent15.putExtra("RcDetails", O1());
            intent15.putExtra("map", serviceSelection_HashMap);
            intent15.putExtra("off_code", L1());
            intent15.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent15.putExtra(VContant.NEXGEN_addahar_name, name);
            intent15.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent15);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.Temp_Permit)) {
            Intent intent16 = new Intent(this, (Class<?>) TemporaryPermitActivity.class);
            intent16.putExtra("RC", rc_number);
            intent16.putExtra("RcDetails", O1());
            intent16.putExtra("map", serviceSelection_HashMap);
            intent16.putExtra("off_code", L1());
            intent16.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent16.putExtra(VContant.NEXGEN_addahar_name, name);
            intent16.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent16);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.PERMIT_RENEWAL)) {
            Intent intent17 = new Intent(this, (Class<?>) RenewalOfPermitMainScreen.class);
            intent17.putExtra("RC", rc_number);
            intent17.putExtra("RcDetails", O1());
            intent17.putExtra("map", serviceSelection_HashMap);
            intent17.putExtra("off_code", L1());
            intent17.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent17.putExtra(VContant.NEXGEN_addahar_name, name);
            intent17.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent17);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.COMPOUND_FEE)) {
            Intent intent18 = new Intent(this, (Class<?>) CompoundingFeeActivity.class);
            intent18.putExtra("RC", rc_number);
            intent18.putExtra("RcDetails", O1());
            intent18.putExtra("map", serviceSelection_HashMap);
            intent18.putExtra("off_code", L1());
            intent18.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent18.putExtra(VContant.NEXGEN_addahar_name, name);
            intent18.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent18);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.Nominee_Addition)) {
            Intent intent19 = new Intent(this, (Class<?>) NomineeActivity.class);
            intent19.putExtra("RC", rc_number);
            intent19.putExtra("RcDetails", O1());
            intent19.putExtra("map", serviceSelection_HashMap);
            intent19.putExtra("off_code", L1());
            intent19.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent19.putExtra(VContant.NEXGEN_addahar_name, name);
            intent19.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent19);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.MISELL_PAYMENT)) {
            Intent intent20 = new Intent(this, (Class<?>) MiscellaneousFeePayment.class);
            intent20.putExtra("RC", rc_number);
            intent20.putExtra("RcDetails", O1());
            intent20.putExtra("map", serviceSelection_HashMap);
            intent20.putExtra("off_code", L1());
            intent20.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent20.putExtra(VContant.NEXGEN_addahar_name, name);
            intent20.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent20);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.ALTERATION)) {
            Intent intent21 = new Intent(this, (Class<?>) VahanAlterationOfVehicle.class);
            intent21.putExtra("RC", rc_number);
            intent21.putExtra("RcDetails", O1());
            intent21.putExtra("map", serviceSelection_HashMap);
            intent21.putExtra("off_code", L1());
            intent21.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent21.putExtra(VContant.NEXGEN_addahar_name, name);
            intent21.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent21);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.MULTI_SELECT_SERVICE)) {
            Intent intent22 = new Intent(this, (Class<?>) VahanMultiSelectionScreen.class);
            intent22.putExtra("RC", rc_number);
            intent22.putExtra("RcDetails", O1());
            intent22.putExtra("map", serviceSelection_HashMap);
            intent22.putExtra("off_code", L1());
            intent22.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent22.putExtra(VContant.NEXGEN_addahar_name, name);
            intent22.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent22);
            finish();
        }
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void n2(jh jhVar) {
        Intrinsics.checkNotNullParameter(jhVar, "<set-?>");
        this.binding = jhVar;
    }

    public final void o2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_process_with_adhar);
        jh jhVarC = jh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jhVarC, "inflate(...)");
        n2(jhVarC);
        setContentView(G1().b());
        ta3.a.N2(this, G1());
        o2(new wa3(this));
        v2(EkYCService.INSTANCE.a(this));
        u2(VahanProService.INSTANCE.a(this));
        s2(new ProgressDialog(this));
        N1().setMessage("Please wait...");
        N1().setCancelable(false);
        N1().setCanceledOnTouchOutside(false);
        new SecureRandom().nextInt(1410065407);
        String stringExtra = getIntent().getStringExtra("RC");
        q2(String.valueOf(getIntent().getStringExtra("off_code")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        t2((NrvDetails) serializableExtra);
        w2(new vh7(this));
        if (stringExtra != null && stringExtra.length() != 0) {
            G1().z.setText(stringExtra.toString());
            HashMap map = (HashMap) getIntent().getSerializableExtra("map");
            Intrinsics.checkNotNull(map);
            this.serviceSelection_HashMap = map;
        }
        if (this.serviceSelection_HashMap.size() > 0) {
            G1().v.i.setText(VContant.INSTANCE.n(this, S1()));
        }
        G1().v.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.md7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.U1(this.a, view);
            }
        });
        G1().v.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ae7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.V1(this.a, view);
            }
        });
        p2((f47) new z(this, new em7(new e47(Q1()))).a(f47.class));
        x2((ld7) new z(this, new kd7(new jd7(P1()))).a(ld7.class));
        G1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.be7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.b2(this.a, view);
            }
        });
        G1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ce7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.c2(this.a, view);
            }
        });
        G1().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.de7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.d2(this.a, view);
            }
        });
        G1().c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ee7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanProcessWithAdhar.f2(this.a, compoundButton, z);
            }
        });
        G1().C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.fe7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanProcessWithAdhar.g2(this.a, compoundButton, z);
            }
        });
        G1().r.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.h2(this.a, view);
            }
        });
        G1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.od7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.W1(this.a, view);
            }
        });
        K1().g().g(this, new f(new a()));
        K1().h().g(this, new f(new b()));
        T1().k1().g(this, new f(new c()));
        T1().l1().g(this, new f(new d()));
        T1().u().g(this, new f(new e()));
        T1().v().g(this, new mf4() { // from class: com.zepto.pd7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanProcessWithAdhar.X1(this.a, (String) obj);
            }
        });
        G1().p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.Y1(this.a, view);
            }
        });
        K1().i().g(this, new mf4() { // from class: com.zepto.yd7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanProcessWithAdhar.Z1(this.a, (eKycResponse) obj);
            }
        });
        K1().j().g(this, new mf4() { // from class: com.zepto.zd7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanProcessWithAdhar.a2(this.a, (String) obj);
            }
        });
    }

    public final void p2(f47 f47Var) {
        Intrinsics.checkNotNullParameter(f47Var, "<set-?>");
        this.mView = f47Var;
    }

    public final void q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void r2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name_addhaar = str;
    }

    public final void s2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void t2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void u2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void v2(EkYCService ekYCService) {
        Intrinsics.checkNotNullParameter(ekYCService, "<set-?>");
        this.retrofitService_one = ekYCService;
    }

    public final void w2(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final void x2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void y2(Context context, String mobile_no) {
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
        new g(textView3, textView).start();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.z2(editText, imageView, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.td7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.A2(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ud7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.B2(editText, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.C2(editText, view);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanProcessWithAdhar.D2(this.a, view);
            }
        });
        Dialog dialog13 = this.d;
        if (dialog13 != null) {
            dialog13.show();
        }
    }
}
